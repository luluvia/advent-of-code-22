val kotlinVersion: String by project

plugins {
    kotlin("jvm") version "1.7.22"
}

repositories {
    mavenCentral()
}

tasks {
    wrapper {
        gradleVersion = "7.6"
    }
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion")
}