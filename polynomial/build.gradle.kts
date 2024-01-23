plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

//    testImplementation(fileTree("src/main/libs") { include("*.jar") })
//    implementation(fileTree("src/main/libs") { include("*.jar") })
//    implementation(files("src/main/libs/Fraction.jar"))
//    testImplementation(files("src/main/libs/Fraction.jar"))
}

tasks.test {
    useJUnitPlatform()
}
