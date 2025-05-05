import de.dasbabypixel.gamelauncher.gradle.gles.GenerateGLES

plugins {
    alias(libs.plugins.kotlin.jvm)
    id("gles")
    `maven-publish`
    signing
    id("io.github.gradle-nexus.publish-plugin") version "2.0.0"
}

repositories {
    mavenCentral()
}

if (System.getenv("SONATYPE_USERNAME") != null) {
    nexusPublishing {
        repositories {
            sonatype {
                nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
                snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
                username.set(System.getenv("SONATYPE_USERNAME"))
                password.set(System.getenv("SONATYPE_PASSWORD"))
            }
        }
    }
}

publishing {
    publications {
        register<MavenPublication>("mavenJava") {
            from(components["java"])

            pom {
                name.set("gles")
                description.set("GLES Documentation")
                url.set("https://github.com/KGameLauncher/gles")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://www.opensource.org/licenses/mit-license.php")
                    }
                }
                developers {
                    developer {
                        name.set("DasBabyPixel")
                        email.set("dasbabypixel@gmail.com")
                        organization.set("KGameLauncher")
                        organizationUrl.set("https://github.com/KGameLauncher")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/KGameLauncher/gles.git")
                    developerConnection.set("scm:git:ssh://github.com/KGameLauncher/gles.git")
                    url.set("https://github.com/KGameLauncher/glesscm:git:git://github.com/KGameLauncher/gles.git")
                }
            }
        }
    }
}

signing {
    isRequired = System.getenv("CI") != null

    val privateKey = System.getenv("GPG_PRIVATE_KEY")
    val keyPassphrase = System.getenv("GPG_PASSPHRASE")
    useInMemoryPgpKeys(privateKey, keyPassphrase)

    sign(publishing.publications["mavenJava"])
}

java {
    withSourcesJar()
    withJavadocJar()
}

tasks.register<GenerateGLES>("generate") {
    packageName = "de.dasbabypixel.gamelauncher.gles"
    directory.set(file("src/main/kotlin"))
}