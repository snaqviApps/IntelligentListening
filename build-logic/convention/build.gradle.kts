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
    compileOnly(libs.androidx.room.gradle.plugin)
    implementation(libs.buildkonfig.gradlePlugin)
    implementation(libs.buildkonfig.compiler)

    compileOnly(libs.ksp.gradlePlugin)

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

gradlePlugin {
    plugins {
        register("androidApplication") {
            id = "create.develop.convention.android.application"
            implementationClass = "AndroidApplicationConventionPlugin"
        }
        register("cmpApplication") {
            id = "create.develop.convention.cmp.application"
            implementationClass = "CmpApplicationConventionPlugin"
        }
        register("androidComposeApplication") {
            id = "create.develop.convention.android.application.compose"
            implementationClass = "AndroidApplicationComposeConventionPlugin"
        }
        register("kmpLibrary") {
            id = "create.develop.convention.kmp.library"
            implementationClass = "KmpLibraryConventionPlugin"
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
//        register("room") {
//            id = "create.develop.convention.room"
//            implementationClass = "RoomConventionPlugin"
//        }

    }
}