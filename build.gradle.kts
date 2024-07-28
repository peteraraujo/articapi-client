plugins {
    alias(libs.plugins.kotlinMultiplatform).apply(false)
    kotlin("jvm") version "2.0.0"
}

repositories {
    mavenCentral()
}
kotlin {
    jvmToolchain(8)
}