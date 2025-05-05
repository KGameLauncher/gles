package de.dasbabypixel.gamelauncher.gradle.gles

import de.dasbabypixel.gamelauncher.gradle.gles.Generator.GLESVersion.ES20
import de.dasbabypixel.gamelauncher.gradle.gles.Generator.GLESVersion.ES30
import de.dasbabypixel.gamelauncher.gradle.gles.Generator.GLESVersion.ES31
import de.dasbabypixel.gamelauncher.gradle.gles.Generator.GLESVersion.ES32
import java.io.StringReader

class HeaderReader(input: String) {
    companion object {
        private val SPACE = Regex(" +")
        private val VERSIONS = mapOf(
            "GL_ES_VERSION_2_0" to ES20,
            "GL_ES_VERSION_3_0" to ES30,
            "GL_ES_VERSION_3_1" to ES31,
            "GL_ES_VERSION_3_2" to ES32
        )
    }

    private val reader = StringReader(input)
    private val definitions = HashMap<String, String>()
    val definitionsByVersion = HashMap<Generator.GLESVersion, LinkedHashMap<String, String>>()
    private val conditionals = ArrayList<Boolean>()
    private var currentVersion: Generator.GLESVersion? = null

    fun read() {
        val lines = reader.readLines()
        lines.forEach { readLine(it.trim()) }
    }

    private fun readLine(line: String) {
        if (line.startsWith("#")) {
            readMeta(line.substring(1))
            return
        }
    }

    private fun readMeta(line: String) {
        val split = line.split(SPACE)
        if (conditionals.isNotEmpty()) {
            if (!conditionals.last) {
                if (split.first() == "endif") {
                    conditionals.removeLast()
                    return
                }
                if (readConditional(split)) {
                    return
                }
                return
            }
        }

        when (split[0]) {
            "define" -> {
                val name = split[1]
                val replace = split[2].run {
                    if (this == "0xFFFFFFFFFFFFFFFFull") "-1L"
                    else this
                }

                if (VERSIONS.containsKey(name)) {
                    currentVersion = VERSIONS[name]!!
                }

                definitions[name] = replace
                if (currentVersion != null && !VERSIONS.containsKey(name)) {
                    definitionsByVersion.computeIfAbsent(currentVersion!!) { LinkedHashMap() }[name] = replace
                }
            }
        }
    }

    private fun readConditional(split: List<String>): Boolean {
        val first = split.first()
        return when (first) {
            "ifndef" -> {
                val param = split[1]
                val ndef = !definitions.containsKey(param)
                addConditional(ndef)
            }

            "if" -> {
                val param = split[1]
                val def = definitions.containsKey(param)
                addConditional(def)
            }

            else -> false
        }
    }

    private fun addConditional(c: Boolean): Boolean {
        if (conditionals.isNotEmpty()) {
            conditionals.add(conditionals.last && c)
        } else conditionals.add(c)
        return true
    }
}