/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/6.8.3/userguide/building_java_projects.html
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use JCenter for resolving dependencies.
    jcenter()
    mavenCentral()
}

dependencies {
    // Use JUnit test framework.
//    testImplementation("junit:junit:4.13")
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.0")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:29.0-jre")

    // SQLite dependency is used by the application.
    implementation("org.xerial:sqlite-jdbc:3.36.0.3")

}

application {
    // Define the main class for the application.
    mainClass.set("Simple_Banking_System.App")
}

tasks.withType<Test> {
    useJUnitPlatform()
}