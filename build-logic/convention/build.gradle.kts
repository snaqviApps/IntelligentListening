import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    `kotlin-dsl`
}

group = "create.develop.convention.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)

    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.compose.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.androidx.room.gradle.plugin)

    compileOnly(libs.com.perrotuerto.buildconfig.gradle.plugin)     // Perrotuerto buildConfig library

    implementation(libs.com.perrotuerto.buildconfig.gradle.plugin)

    implementation(libs.truth)
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

kotlin {
    compilerOptions {
        jvmTarget = JvmTarget.JVM_17
    }
}

tasks {
    validatePlugins {
        enableStricterValidation = true
        failOnWarning = true
//        clean
    }
}

tasks.register("clean-build-logic") {
//    doLast {
//        clean
//    }
    tasks.clean
}

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = libs.plugins.convention.android.application.asProvider().get().pluginId
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("androidComposeApplication") {
            id = "create.develop.convention.android.application.compose"
//            id = libs.plugins.convention.android.application.compose.get().pluginId          // doesn't give method asProvider()
            implementationClass = "AndroidApplicationComposeConventionPlugin"

        }
        register("androidLibrary") {
            id = "create.develop.convention.android.library"
            implementationClass = "AndroidLibraryConventionPlugin"
        }

        register("cmpLibrary") {
            id = "create.develop.convention.cmp.library"
            implementationClass = "CmpLibraryConventionPlugin"
        }
        register("cmpFeature") {
            id = "create.develop.convention.cmp.feature"
            implementationClass = "CmpFeatureConventionPlugin"
        }
        register("BuildKonfig") {
            id = "create.develop.convention.buildkonfig"
            implementationClass = "BuildKonfigConventionPlugin"
        }

    }
}
