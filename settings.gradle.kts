pluginManagement {
    includeBuild("build-logic")

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
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "StelPlay-Android"
include(":app")
include(":core:data")
include(":core:domain")
include(":core:network")
include(":core:model")
include(":core:designsystem")
include(":core:navigation")
include(":feature:home")
include(":feature:music")
include(":feature:artist")
include(":feature:storage")
include(":common:android")
include(":common:compose")
include(":common:kotlin")
include(":baselineprofile")

gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:testClasses"))
