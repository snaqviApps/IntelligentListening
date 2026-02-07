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

//gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:testClasses"))
// OR
//gradle.startParameter.excludedTaskNames.addAll(listOf(":build-logic:testClasses"))`


include(":app")
//include(":core:domain")
//include(":feature:auth:domain")
//include(":feature:playtrack:data")
//include(":core:presentation")
//include(":core:designsystem")
