pluginManagement {
  repositories {
    maven {
      url = uri("../../../../build/localMaven")
    }
    mavenCentral()
    mavenLocal()
  }
}

dependencyResolutionManagement {
  versionCatalogs {
    create("libs") {
      from(files("../../../../gradle/libraries.toml"))
    }
  }
}
