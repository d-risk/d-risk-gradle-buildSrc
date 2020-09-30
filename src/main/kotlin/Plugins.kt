@file:Suppress("ObjectPropertyName", "FunctionName", "unused", "SpellCheckingInspection")

import org.gradle.plugin.use.PluginDependenciesSpec
import org.gradle.plugin.use.PluginDependencySpec

fun PluginDependenciesSpec.bintray(version: String = Versions.BINTRAY): PluginDependencySpec = id("com.jfrog.bintray").version(version)
fun PluginDependenciesSpec.detekt(version: String = Versions.DETEKT): PluginDependencySpec = id("io.gitlab.arturbosch.detekt").version(version)
fun PluginDependenciesSpec.dokka(version: String = Versions.DOKKA): PluginDependencySpec = id("org.jetbrains.dokka").version(version)
fun PluginDependenciesSpec.`gradle-versions-plugin`(version: String = Versions.BEN_MANES): PluginDependencySpec = id("com.github.ben-manes.versions").version(version)
val PluginDependenciesSpec.`kotlin-jvm`: PluginDependencySpec get() = id("org.jetbrains.kotlin.jvm")
fun PluginDependenciesSpec.`kotlin-jvm`(version: String = Versions.KOTLIN): PluginDependencySpec = `kotlin-jvm`.version(version)
val PluginDependenciesSpec.`kotlin-kapt`: PluginDependencySpec get() = id("org.jetbrains.kotlin.kapt")
fun PluginDependenciesSpec.`kotlin-kapt`(version: String = Versions.KOTLIN): PluginDependencySpec = `kotlin-kapt`.version(version)
fun PluginDependenciesSpec.`nebula-kotlin`(version: String = Versions.KOTLIN): PluginDependencySpec = id("nebula.kotlin").version(version)
fun PluginDependenciesSpec.`nebula-javadoc-jar`(version: String = Versions.NEBULA_PUBLISH): PluginDependencySpec = id("nebula.javadoc-jar").version(version)
fun PluginDependenciesSpec.`nebula-maven-publish`(version: String = Versions.NEBULA_PUBLISH): PluginDependencySpec = id("nebula.maven-publish").version(version)
fun PluginDependenciesSpec.`nebula-publish-verification`(version: String = Versions.NEBULA_PUBLISH): PluginDependencySpec = id("nebula.publish-verification").version(version)
fun PluginDependenciesSpec.`nebula-release`(version: String = Versions.NEBULA_RELEASE): PluginDependencySpec = id("nebula.release").version(version)
fun PluginDependenciesSpec.`nebula-source-jar`(version: String = Versions.NEBULA_PUBLISH): PluginDependencySpec = id("nebula.source-jar").version(version)
fun PluginDependenciesSpec.`shadow-jar`(version: String = Versions.SHADOW_JAR): PluginDependencySpec = id("com.github.johnrengelman.shadow").version(version)
fun PluginDependenciesSpec.`shipkit-java`(version: String = Versions.SHIPKIT): PluginDependencySpec = id("org.shipkit.java").version(version)
fun PluginDependenciesSpec.`spring-boot`(version: String = Versions.SPRING_BOOT): PluginDependencySpec = id("org.springframework.boot").version(version)
fun PluginDependenciesSpec.`spring-dependency-management`(version: String = Versions.SPRING_DEPENDENCY_MANAGEMENT): PluginDependencySpec = id("io.spring.dependency-management").version(version)
