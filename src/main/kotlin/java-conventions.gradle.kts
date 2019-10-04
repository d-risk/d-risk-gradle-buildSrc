plugins {
    java
    jacoco
}
repositories {
    jcenter()
}
java {
    sourceCompatibility = Versions.JAVA
    targetCompatibility = Versions.JAVA
}
dependencies {
    testImplementation(`junit-jupiter-params`())
    testImplementation(`assertj-core`())
    testRuntimeOnly(`junit-jupiter-engine`())
}
tasks.withType<Test> {
    useJUnitPlatform()
    reports {
        html.isEnabled = isNotCI
        junitXml.isEnabled = isCI
    }
}
tasks.withType<JacocoReport> {
    reports {
        csv.isEnabled = false
        html.isEnabled = isNotCI
        xml.isEnabled = isCI
    }
}
