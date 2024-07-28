plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.dokka)
    kotlin("plugin.serialization") version "2.0.0"
    `maven-publish`
    signing
}

group = "com.peteraraujo.articapi"
version = "1.0.1"
description = "Unofficial client api for Artic (artic.edu) HTTP API."

kotlin {

    task("testClasses")
    applyDefaultHierarchyTemplate()

    // JVM
    jvm()

    // JS
    js().browser()
    js().nodejs()

    // Windows
    mingwX64()

    // Linux
    linuxX64()
    linuxArm64()

    sourceSets {

        commonMain.dependencies {

            api(libs.ktor.client.core)
            api(libs.ktor.client.logging)
            api(libs.ktor.serialization.kotlinx.json)

        }

        commonTest.dependencies {

            implementation(libs.kotlin.test)
            implementation(libs.ktor.client.mock)
            implementation(libs.kotlinx.coroutines.core)
            implementation(libs.kotlinx.coroutines.test)

        }

        jvmMain.dependencies {

            implementation(libs.ktor.client.cio)
        }

        linuxMain.dependencies {
            implementation(libs.ktor.client.cio)
        }

        jsMain.dependencies {

            implementation(libs.ktor.client.js)

        }

        mingwMain.dependencies {

            implementation(libs.ktor.client.winhttp)

        }

    }
}

// Create a separate Dokka task for the JVM target
val dokkaJavadocJvm by tasks.registering(org.jetbrains.dokka.gradle.DokkaTask::class) {
    outputDirectory.set(layout.buildDirectory.dir("dokkaJavadocJvm"))
    dokkaSourceSets {
        named("jvmMain")
    }
}

val javadocJar by tasks.registering(Jar::class) {
    dependsOn(dokkaJavadocJvm)
    from(dokkaJavadocJvm.get().outputDirectory)
    archiveClassifier.set("javadoc")
}

publishing {
    // Configure all publications
    publications.withType<MavenPublication> {

        if (name == "jvm") {

            //Required by Maven Central
            artifact(javadocJar)

        }

        // Provide artifacts information required by Maven Central
        pom {
            name = "articapi-client"
            description = "Unofficial client api for Artic (artic.edu) HTTP API."
            url = "https://github.com/peteraraujo/articapi-client"
            inceptionYear = "2024"


            licenses {
                license {
                    name = "The Apache License, Version 2.0"
                    url = "https://www.apache.org/licenses/LICENSE-2.0"
                }
            }
            developers {
                developer {
                    id = "peteraraujo"
                    name = "Peter Araujo"
                    email = "contact@peteraraujo.com"
                    url = "https://peteraraujo.com"
                }
            }
            scm {
                connection = "scm:git:https://github.com/peteraraujo/articapi-client.git"
                url = "https://github.com/peteraraujo/articapi-client"
            }
            issueManagement {
                system = "Github"
                url = "https://github.com/peteraraujo/articapi-client/issues"
            }

        }
    }

    repositories {

        mavenLocal()

    }
}

signing {

    useGpgCmd()
    sign(publishing.publications)

}