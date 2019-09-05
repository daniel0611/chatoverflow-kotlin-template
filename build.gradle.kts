import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.41"
    id("com.github.daniel0611.chatoverflow") version "0.1"
}

group = "com.github.daniel0611"
version = "0.1"

repositories {
    mavenCentral()
    mavenLocal()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Requires to run "sbt apiProject/publishLocal" inside a working dev chatoverflow installation
    // till the API gets released to Maven Central with the prealpha 3 release.
    implementation("chatoverflow-api:chatoverflow-api:3.0")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}