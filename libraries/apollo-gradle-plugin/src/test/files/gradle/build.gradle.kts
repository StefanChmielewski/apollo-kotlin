plugins {
  alias(libs.plugins.apollo)
}

buildscript {
  repositories {
    maven {
      url = uri("../../../../build/localMaven")
    }
    mavenCentral()
    gradlePluginPortal()
    mavenLocal()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap/")
  }

  dependencies {
    classpath(libs.kotlin.plugin)
  }
}

apply(plugin = "org.jetbrains.kotlin.jvm")

