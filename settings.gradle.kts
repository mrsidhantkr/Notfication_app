pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS) // Allow settings-level repositories to be prioritized
    repositories {
        google() // Includes Google's repository
        mavenCentral() // Maven Central repository
    }
}

rootProject.name = "dooraccessnotification"
include(":app")
