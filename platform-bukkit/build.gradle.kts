plugins {
    id("java")
    id("xyz.jpenilla.run-paper") version "2.3.1"
}

group = "me.anhecio.hecioplugin.lib"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://hub.spigotmc.org/nexus/content/repositories/public")
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    compileOnly("org.spigotmc:spigot-api:1.16.5-R0.1-SNAPSHOT")
    compileOnly(project(":api"))
}

tasks.test {
    useJUnitPlatform()
}