package de.dasbabypixel.gamelauncher.gradle.gles

import de.dasbabypixel.gamelauncher.gradle.gles.Generator.OurType.*
import org.htmlunit.*
import org.htmlunit.html.HtmlPage
import org.htmlunit.util.MimeType
import org.htmlunit.util.NameValuePair
import org.jsoup.Jsoup
import org.jsoup.nodes.Element
import org.jsoup.nodes.TextNode
import java.net.URI
import java.nio.file.Path
import java.util.*
import java.util.concurrent.Executors
import java.util.concurrent.Future
import java.util.concurrent.TimeUnit
import kotlin.io.path.bufferedWriter
import kotlin.io.path.createDirectories

class Generator(targetPath: Path, private val packageName: String) {
    companion object {
        const val baseUrl = "https://registry.khronos.org/OpenGL-Refpages/es3/"
        const val supported = "\u2714"
        const val unsupported = "-"
    }

    private val kotlin = Serializer.Kotlin(this)
    private val packagePath = packageName.replace(".", "/")
    private val basePath = targetPath.resolve(packagePath)
    private var requireDebugProc = false

    fun finish() {
        if (requireDebugProc) {
            writeDebugProc()
        }
    }

    fun writeDebugProc() {
        val page = DocPage("DebugProc", listOf(), "")
        val function = GLFunction(
            GLESVersion.ES32, Definition(
                "DebugProc", listOf(
                    "type" to "GLenum",
                    "id" to "GLuint",
                    "severity" to "GLenum",
                    "length" to "GLsizei",
                    "message" to "const GLchar *",
                    "userParam" to "const void *"
                ), "void"
            ), page
        )
        generateFunctionInterface(function)
    }

    fun generateFunctionInterface(function: GLFunction) {
        val name = function.name
        val signature = function.signature(kotlin)
        val path = basePath.resolve(function.glVersion.versionName).resolve("$name.kt")
        println("Write to $path")
        path.parent.createDirectories()
        path.bufferedWriter().use {
            it.write(
                """
                package $packageName.${function.glVersion.versionName}
                
                interface $name {
                    /**
                %s
                    */
                    $signature
                }
            """.trimIndent().format(
                    """
                %s
                
                %s
            """.trimIndent().format(function.page.doc, function.page.functions.joinToString(separator = "\n") { f ->
                        "@see $packageName.${f.glVersion.versionName}.${f.definition.name}.${f.definition.name}"
                    }).prependIndent("    * ")
                )
            )
        }
    }

    fun writeMainInterface(version: GLESVersion, functions: List<GLFunction>) {
        val name = "GL" + version.name
        val path = basePath.resolve("$name.kt")
        path.parent.createDirectories()
        val extend = ArrayList<String>()
        if (version.ordinal > 0) {
            extend.add("GL" + GLESVersion.values()[version.ordinal - 1].name)
        }
        extend.addAll(functions.map { it.name })
        path.bufferedWriter().use {
            it.write(
                """
                package $packageName%s
                
                interface $name%s
            """.trimIndent().format(
                    if (functions.isEmpty()) "" else "\n\nimport $packageName.${version.versionName}.*",
                    if (functions.isEmpty()) "" else " :\n" + extend.joinToString(separator = ",\n")
                        .prependIndent("    ")
                )
            )
        }
    }

    fun mapByGLESVersion(read: ReadResult): Map<GLESVersion, List<GLFunction>> {
        val map = HashMap<GLESVersion, ArrayList<GLFunction>>()
        for (function in read.functions) {
            map.computeIfAbsent(function.glVersion) { ArrayList() }.add(function)
        }
        return map
    }

    /**
     * @see finish de.dasbabypixel.gamelauncher.gradle.gles.Generator.finish
     */
    fun convertToMarkdown(read: ReadResult): ReadResult {
        val pageMap = HashMap<DocPage, DocPage>()
        val split: Array<ArrayList<DocPage>> = Array(Runtime.getRuntime().availableProcessors()) { ArrayList() }
        var idx = 0
        val pageMapByName = HashMap<String, DocPage>()
        read.pages.forEach { page ->
            split[idx++ % split.size].add(page)
            pageMapByName[page.name] = page
            page.functions.forEach {
                pageMapByName[it.definition.name] = page
            }
        }
        pageMapByName.keys.forEach {
            println(it)
        }
        val futures = ArrayList<Future<Map<DocPage, DocPage>>>()

        Executors.newWorkStealingPool().use { service ->
            split.forEach { pages ->
                val future = service.submit<Map<DocPage, DocPage>> {
                    try {
                        return@submit WebClient().use { client ->
                            client.options.isThrowExceptionOnScriptError = true
                            val window = client.currentWindow!!.topWindow!!
                            val response = WebResponse(
                                WebResponseData(
                                    byteArrayOf(),
                                    0,
                                    "No HTTP Response",
                                    arrayListOf(NameValuePair(HttpHeader.CONTENT_TYPE, MimeType.TEXT_HTML))
                                ), URI.create("http://127.0.0.1/").toURL(), HttpMethod.GET, 10L
                            )
                            val page = client.loadWebResponseInto(response, window)!! as HtmlPage

                            val turndown = "https://unpkg.com/turndown/dist/turndown.js".readUrl()
                            val turndownGfm =
                                "https://unpkg.com/@guyplusplus/turndown-plugin-gfm/dist/turndown-plugin-gfm.js".readUrl()

                            page.executeJavaScript(turndown)
                            page.executeJavaScript(turndownGfm)
                            page.executeJavaScript(
                                """
                                var turndownService = new TurndownService();
                                TurndownPluginGfmService.gfm(turndownService);
                                var generatorPages = new Map();
                                %s
                                turndownService.addRule('customLink', {
                                    filter: function (node) {
                                        if (node.nodeName === 'A') {
                                            var attribute = node.getAttribute('href')
                                            if (!attribute) return false
                                            var short = attribute.replace('.xhtml', '')
                                            if (generatorPages.has(short)) return true
                                        }
                                        return false
                                    },
                                    
                                    replacement: function(content, node) {
                                        var href = node.getAttribute('href')
                                        href = href.replace('.xhtml', '')
                                        var replace = generatorPages.get(href)
                                        return '[' + content + '][' + replace + ']'
                                    }
                                });
                            """.trimIndent().format(pageMapByName.entries.joinToString(separator = "\n") {
                                    val func = it.value.functions.first()
                                    val name = func.definition.name
                                    val version = func.glVersion.versionName
                                    "generatorPages.set('${it.key}', '${"$packageName.$version.$name.$name"}');"
                                })
                            )
                            val turndownService = page.executeJavaScript("turndownService").javaScriptResult
                            val turndownFunction = page.executeJavaScript("turndownService.turndown").javaScriptResult

                            val localPageMap = HashMap<DocPage, DocPage>()
                            for (docPage in pages) {
                                println("Convert ${docPage.name}")
                                val html = docPage.doc
                                val markdown = page.executeJavaScriptFunction(
                                    turndownFunction, turndownService, arrayOf(html), null
                                ).javaScriptResult.toString().replace("*/", "*\\/")
                                localPageMap[docPage] = docPage.copy(doc = markdown)
                            }
                            localPageMap
                        }
                    } catch (t: Throwable) {
                        t.printStackTrace()
                        throw t
                    }
                }
                futures.add(future)
            }
        }
        futures.forEach {
            pageMap.putAll(it.resultNow())
        }

        return ReadResult(read.functions.map { it.copy(page = pageMap[it.page]!!) }, pageMap.values.toList())
    }

    private fun String.readUrl(): String {
        return URI(this).toURL().readText()
    }

    enum class GLESVersion(val versionName: String) {
        ES20("es20"), ES30("es30"), ES31("es31"), ES32("es32");
    }

    fun readVersion(): ReadResult {
        val index = readIndex()
        val workerService = Executors.newVirtualThreadPerTaskExecutor()

        val pages = Collections.synchronizedList(ArrayList<DocPage>())
        for (url in index.urls) {
            workerService.submit {
                try {
                    val page = readPage(url)
                    pages.add(page)
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }

        workerService.shutdown()
        workerService.awaitTermination(1, TimeUnit.MINUTES)

        val functions = ArrayList<GLFunction>()
        pages.forEach { page ->
            page.functions.forEach {
                functions.add(GLFunction(it.glVersion, it.definition, page))
            }
        }

        functions.forEach {
            println(it.signature(kotlin))
        }

        return ReadResult(functions, pages)
    }

    data class ReadResult(
        val functions: List<GLFunction>, val pages: List<DocPage>
    )

    private fun readIndex(): Index {
        val index = Jsoup.connect(baseUrl + "html/index.php").get()
        val element = index.body().selectFirst("#containerul > .Level1 > .Level2")!!
        if (element.parent()!!.ownText() != "API Entry Points") error("Selected wrong element - want API Entry Points")
        val urls = HashSet<String>()
        for (linkElement in element.select("ul.Level3 > li > a")) {
            val siteName = linkElement.attribute("href")!!.value
            val url = baseUrl + "html/$siteName"
            urls.add(url)
        }
        return Index(urls)
    }

    private fun readPage(url: String): DocPage {
        println("Read $url")
        val document = Jsoup.connect(url).get()

        val pageName = document.body().selectFirst(".refentry")!!.id()
        val signatureTableEntries = document.body().select(".refsynopsisdiv .funcsynopsis .funcprototype-table")
        val definitions = signatureTableEntries.select(".funcdef .fsfunc")
        val definitionMap = HashMap<String, Definition>()
        for (definition in definitions) {
            val functionName = definition.ownText()
            val returnTypeC = definition.parent()!!.childNodes().filterIsInstance<TextNode>().first().text().trim()
            val params = ArrayList<Pair<String, String>>()
            val paramElements = definition.parent()!!.parent()!!.parent()!!.parent()!!.select(".pdparam")
            for (paramElement in paramElements) {
                val paramName = paramElement.ownText()
                val paramTypeC = paramElement.parent()!!.childNodes().takeWhile {
                    it != paramElement
                }.filterIsInstance<TextNode>().firstOrNull()?.text()?.trim() ?: ""
                params.add(paramName to paramTypeC)
            }
            if (params.size == 1 && params.first.first == "void" && params.first.second == "") params.clear()

            definitionMap[functionName] = Definition(functionName, params, returnTypeC)
        }

        val entry = document.body().selectFirst(".refEntry")!!

        val table = entry.selectFirst("#versions")!!.selectFirst("table")!!
        val body = table.selectFirst("tbody")!!
        val functions = ArrayList<BaseFunction>()
        body.children().forEach { tableEntry ->
            try {
                val functionName = tableEntry.child(0).text().run {
                    return@run if (!startsWith("gl")) "gl$this" else this
                }
                val definition = definitionMap[functionName]!!
                val es20Supported = parseSupported(tableEntry, 1)
                val es30Supported = parseSupported(tableEntry, 2)
                val es31Supported = parseSupported(tableEntry, 3)
                val es32Supported = parseSupported(tableEntry, 4)
                val baseFunction =
                    parseBaseFunction(definition, es20Supported, es30Supported, es31Supported, es32Supported)
                functions.add(baseFunction)
            } catch (t: Throwable) {
                println("Failed in $url: $tableEntry")
                throw t
            }
        }
        val doc = entry.toString()
        return DocPage(pageName, functions, doc)
    }

    private fun parseSupported(entry: Element, idx: Int): Boolean {
        val txt = entry.child(idx).ownText()
        if (txt == supported) return true
        if (txt == unsupported) return false
        error("Unknown supported: $txt")
    }

    private fun parseBaseFunction(
        definition: Definition, es20: Boolean, es30: Boolean, es31: Boolean, es32: Boolean
    ): BaseFunction {
        val name = definition.name
        if (es20 && (!es30 || !es31 || !es32)) error("Invalid version support for $name")
        if (es30 && (!es31 || !es32)) error("Invalid version support for $name")
        if (es31 && !es32) error("Invalid version support for $name")
        if (!es32) error("No version supported for $name")

        if (es20) return BaseFunction(definition, GLESVersion.ES20)
        if (es30) return BaseFunction(definition, GLESVersion.ES30)
        if (es31) return BaseFunction(definition, GLESVersion.ES31)
        return BaseFunction(definition, GLESVersion.ES32)
    }

    data class BaseFunction(
        val definition: Definition, val glVersion: GLESVersion
    )

    fun mapCTypeToOurType(c: String, name: String): OurType {
        val short = if (c.startsWith("const ")) c.substring("const ".length) else c
        if (short.endsWith("*")) return mapCPtrToOurType(short.substring(0, short.length - 1).trim(), name)
        val fixed = if (short == "void" || short == "DEBUGPROC" || short.startsWith("GL")) short else "GL$short"
        return when (fixed) {
            "void" -> void
            "GLfloat" -> float
            "GLuint", "GLsizei" -> uint
            "GLsync", "GLintptr", "GLint64" -> long
            "GLuint64", "GLsizeiptr" -> ulong
            "GLubyte" -> ubyte
            "GLbitfield", "GLenum", "GLint" -> int
            "GLboolean" -> boolean
            "DEBUGPROC" -> DebugProc
            else -> error("Unknown type: $c for $name")
        }
    }

    private fun mapCPtrToOurType(baseTypeC: String, name: String): OurType {
        val fixed =
            if (baseTypeC == "void" || baseTypeC == "void *" || baseTypeC.startsWith("GL")) baseTypeC else "GL$baseTypeC"
        return when (fixed) {
            "GLchar", "GLubyte" -> OurType.String
            "void" -> long
            "void *" -> ByteBuffer
            else -> run {
                val kotlin = mapCTypeToOurType(baseTypeC, "$name[]")
                return@run when (kotlin) {
                    int, uint, boolean -> IntBuffer
                    float -> FloatBuffer
                    long -> LongBuffer
                    OurType.String -> StringArray
                    else -> error("Unsupported C to ptr: $baseTypeC for $name[]")
                }
            }
        }
    }

    inner class Definition(
        val name: String, private val paramsC: List<Pair<String, String>>, private val returnTypeC: String
    ) {
        fun signature(serializer: Serializer): String {
            val returnType = mapCTypeToOurType(returnTypeC, "$name@ret")
            val params = paramsC.map { it.first to mapCTypeToOurType(it.second, "$name#${it.first}") }

            return serializer.serialize(OurDefinition(name, params, returnType))
        }
    }

    data class OurDefinition(val name: String, val params: List<Pair<String, OurType>>, val returnType: OurType)

    enum class OurType {
        void, float, int, uint, long, ulong, ubyte, boolean, DebugProc, String, ByteBuffer, IntBuffer, LongBuffer, StringArray, FloatBuffer
    }

    interface Serializer {
        fun serialize(definition: OurDefinition): String

        class Kotlin(private val generator: Generator) : Serializer {
            override fun serialize(definition: OurDefinition): String {
                val base =
                    "fun ${definition.name}(${definition.params.joinToString { "${mapName(it.first)}: ${mapToKotlin(it.second)}" }})"
                if (definition.returnType == void) {
                    return base
                }
                return "$base: ${mapToKotlin(definition.returnType)}"
            }

            private fun mapToKotlin(ourType: OurType): String {
                return when (ourType) {
                    void -> "Unit"
                    float -> "Float"
                    int -> "Int"
                    uint -> "UInt"
                    long -> "Long"
                    ulong -> "ULong"
                    ubyte -> "UByte"
                    boolean -> "Boolean"
                    DebugProc -> {
                        generator.requireDebugProc = true
                        "DebugProc"
                    }

                    OurType.String -> "String"
                    ByteBuffer -> "java.nio.ByteBuffer"
                    IntBuffer -> "java.nio.IntBuffer"
                    LongBuffer -> "java.nio.LongBuffer"
                    StringArray -> "Array<String>"
                    FloatBuffer -> "java.nio.FloatBuffer"
                }
            }

            private fun mapName(name: String): String {
                if (name == "val") return "`val`"
                return name
            }
        }
    }

    data class DocPage(
        val name: String, val functions: List<BaseFunction>, val doc: String
    )

    data class Index(
        val urls: Set<String>
    )

    data class GLFunction(
        val glVersion: GLESVersion, val definition: Definition, val page: DocPage
    ) {
        val name: String
            get() = definition.name

        fun signature(serializer: Serializer): String = definition.signature(serializer)
    }
}