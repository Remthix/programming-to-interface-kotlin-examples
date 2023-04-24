plugins {
    kotlin("jvm") version "1.8.0"
}

group = "org.programming"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    // JUnit5
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2") // Check for latest version
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2") // Check for latest version

    // MockK
    testImplementation("io.mockk:mockk:1.13.5") // Check for latest version
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(11)
}