import de.dasbabypixel.gamelauncher.gradle.gles.GenerateGLES
import org.jreleaser.model.Active
import org.jreleaser.model.Signing.Mode
import org.jreleaser.model.api.deploy.maven.MavenCentralMavenDeployer
import org.jreleaser.model.api.signing.Signing

plugins {
    alias(libs.plugins.kotlin.jvm)
    id("gles")
    `maven-publish`
    id("org.jreleaser") version "1.18.0"
}

repositories {
    mavenCentral()
}

jreleaser {
    signing {
        active = Active.ALWAYS
        mode = Mode.MEMORY
        verify = false
        passphrase = System.getenv("GPG_PASSPHRASE")
        secretKey = System.getenv("GPG_PRIVATE_KEY")
        armored = true
    }
    deploy {
        maven {
            mavenCentral {
                register("sonatype") {
                    maxRetries = 1
                    active = Active.ALWAYS
                    url = "https://central.sonatype.com/api/v1/publisher"
                    stagingRepository("build/staging-deploy")

                    if (System.getenv("SONATYPE_USERNAME") != null) {
                        username = System.getenv("SONATYPE_USERNAME")
                        password = System.getenv("SONATYPE_PASSWORD")
                    }
                }
            }
        }
    }
}

publishing {
    repositories {
        maven {
            url = layout.buildDirectory.dir("staging-deploy").get().asFile.toURI()
        }
    }
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
                    url.set("https://github.com/KGameLauncher/gless")
                }
            }
        }
    }
}

java {
    withSourcesJar()
    withJavadocJar()
}

tasks.register<GenerateGLES>("generate") {
    packageName = "de.dasbabypixel.gamelauncher.gles"
    directory.set(file("src/main/kotlin"))
}

tasks.jreleaserConfig.configure {
    dependsOn(tasks.publish)
}

tasks.publish.configure {
    dependsOn(tasks.clean)
}