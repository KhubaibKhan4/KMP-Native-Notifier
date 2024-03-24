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
        maven{
            url = uri("https://maven.pkg.github.com/KhubaibKhan4/KMP-Native-Notifier")
            credentials {
                username = System.getenv("GITHUB_USERNAME")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
