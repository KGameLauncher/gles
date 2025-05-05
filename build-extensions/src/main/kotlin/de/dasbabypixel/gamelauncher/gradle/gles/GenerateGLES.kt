package de.dasbabypixel.gamelauncher.gradle.gles

import de.dasbabypixel.gamelauncher.gradle.gles.Generator.Companion.headerUrl
import de.dasbabypixel.gamelauncher.gradle.gles.Generator.Companion.readUrl
import org.gradle.api.DefaultTask
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.property
import java.util.concurrent.Executors
import kotlin.io.path.ExperimentalPathApi
import kotlin.io.path.deleteRecursively

abstract class GenerateGLES : DefaultTask() {
    @OutputDirectory
    val directory: DirectoryProperty = project.objects.directoryProperty()

    @Input
    val packageName = project.objects.property<String>()

    @OptIn(ExperimentalPathApi::class)
    @TaskAction
    fun run() {
        val path = directory.get().asFile.toPath()
        path.deleteRecursively()
        val generator = Generator(path, packageName.get())

        val read = generator.convertToMarkdown(generator.readVersion())

        Executors.newVirtualThreadPerTaskExecutor().use { service ->
            read.functions.forEach { function ->
                service.submit {
                    try {
                        generator.generateFunctionInterface(function)
                    } catch (t: Throwable) {
                        t.printStackTrace()
                    }
                }
            }

            val headers = readHeader()

            val byVersion = generator.mapByGLESVersion(read)
            byVersion.forEach { (version, functions) ->
                val map = headers[version]!!
                service.submit {
                    try {
                        generator.writeMainInterface(version, functions, map)
                    } catch (t: Throwable) {
                        t.printStackTrace()
                    }
                }
            }
        }
        generator.finish()
    }

    private fun readHeader(): Map<Generator.GLESVersion, Map<String, String>> {
        val reader = HeaderReader(headerUrl.readUrl())
        reader.read()
        return reader.definitionsByVersion
    }
}