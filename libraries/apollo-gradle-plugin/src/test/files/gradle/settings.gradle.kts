rootProject.name="testProject"

dependencyResolutionManagement {
  versionCatalogs {
    create("libs") {
      from(files("../../../../gradle/libraries.toml"))
    }
  }
}
pluginManagement {
  repositories {
    maven {
      url = uri("../../../../build/localMaven")
    }
    gradlePluginPortal()
    mavenLocal()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap/")
  }
}
