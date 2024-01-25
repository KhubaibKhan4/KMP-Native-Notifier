rootProject.name = "KMP-Native-Notifier-"
include(":sample:composeApp")
include(":notifier")

pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}
