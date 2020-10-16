plugins {
    java
    id("com.github.erizo.gradle.jcstress") version "0.8.4"
}

apply(plugin = "jcstress")

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
}

jcstress {
    verbose = "true"
    timeMillis = "200"
    forks = "0"
    iterations = "1"
}
