rootProject.name = "IntelligentListener"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")
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

//    repositories {
//        google()
//        mavenCentral()
//    }
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }

}

include(":app")
include(":core:presentation")
include(":core:domain")
include(":core:designsystem")
include(":core:data")
include(":feature:auth:presentation")
include(":feature:statsboard:presentation")
include(":feature:auth:domain")
include(":feature:statsboard:domain")
include(":feature:statsboard:database")
include(":feature:statsboard:data")
