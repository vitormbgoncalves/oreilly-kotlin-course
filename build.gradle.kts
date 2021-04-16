import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
}

group = "com.github.vitormbgoncalves.kotlincourse"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test-junit"))
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.4.0")
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.4.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.4.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-generate:0.1-alpha")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-async:0.1-alpha")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-rx:0.1-alpha")
    implementation("com.squareup.retrofit2:retrofit:2.1.0")
    implementation("com.squareup.retrofit2:adapter-rxjava:2.1.0")
    implementation("com.squareup.retrofit2:converter-gson:2.1.0")
    implementation("io.reactivex:rxjava:1.1.5")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}