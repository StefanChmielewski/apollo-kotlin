pluginManagement {
  repositories {
    maven {
      url = uri("../../../../build/localMaven")
    }
    mavenCentral()
    mavenLocal()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap/")
  }
}

dependencyResolutionManagement {
  versionCatalogs {
    create("libs") {
      from(files("../../../../gradle/libraries.toml"))
    }
  }
}
