package de.dasbabypixel.gamelauncher.gradle.gles

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.OutputDirectory
import org.gradle.api.tasks.TaskAction
import org.gradle.kotlin.dsl.property
import java.util.concurrent.Executors
import kotlin.io.path.ExperimentalPathApi
import kotlin.io.path.deleteRecursively

abstract class GenerateGLES : DefaultTask() {
    @OutputDirectory
    val directory = project.objects.directoryProperty()!!

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

            val byVersion = generator.mapByGLESVersion(read)
            byVersion.forEach { (version, functions) ->
                service.submit {
                    try {
                        generator.writeMainInterface(version, functions)
                    } catch (t: Throwable) {
                        t.printStackTrace()
                    }
                }
            }
        }
        generator.finish()
    }
}