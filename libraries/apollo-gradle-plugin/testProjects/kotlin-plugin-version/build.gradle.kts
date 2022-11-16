import com.apollographql.apollo3.gradle.api.ApolloExtension

buildscript {
  repositories {
    maven {
      url = uri("../../../../build/localMaven")
    }
    mavenCentral()
    mavenLocal()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap/")
  }
  dependencies {
    classpath(libs.apollo.plugin)
    classpath(libs.kotlin.plugin.min)
  }
}

apply(plugin = "org.jetbrains.kotlin.jvm")
apply(plugin = "com.apollographql.apollo3")

repositories {
  maven {
    url = uri("../../../../build/localMaven")
  }
  mavenCentral()
  mavenLocal()
  maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/bootstrap/")
}

dependencies {
  add("implementation", libs.apollo.api)
}

configure<ApolloExtension> {
  packageName.set("com.example")
}

