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
  }

  dependencies {
    classpath(libs.kotlin.plugin)
  }
}

apply(plugin = "org.jetbrains.kotlin.jvm")

