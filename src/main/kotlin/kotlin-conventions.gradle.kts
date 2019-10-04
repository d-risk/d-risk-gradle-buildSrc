import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("java-conventions")
    kotlin("jvm")
}
dependencies {
    implementation(`kotlin-stdlib-jdk8`)
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = JVM_TARGET
}
