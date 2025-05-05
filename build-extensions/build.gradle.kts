plugins {
    `kotlin-dsl`
    id("java-gradle-plugin")
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation(libs.jsoup)
    implementation(libs.htmlunit)
}

gradlePlugin {
    plugins {
        register("gles") {
            id = "gles"
            implementationClass = "de.dasbabypixel.gamelauncher.gradle.gles.GLES"
        }
    }
}