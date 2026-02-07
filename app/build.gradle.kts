
plugins {
    alias(libs.plugins.baselineprofile)
//    `kotlin-dsl`


//    alias(libs.plugins.kotlin.android)          // android-application plugin comes with default project

    /**
     * 1. alias(libs.plugins.kotlin.multiplatform)
     *
     * this plugin is in conflict with
     *  id = "com.android.library" (line# 132 in versions.toml)
     *
     */

    /**
     * 2. alias(libs.plugins.android.application)
     */
    alias(libs.plugins.convention.android.application)
//    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.compose.compiler)
//    alias(libs.plugins.compose.hot.reload)

}

android {
    namespace = "create.develop.intelligentlistener"
    compileSdk = 36

    defaultConfig {
        applicationId = "create.develop.intelligentlistener"
        minSdk = 25
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
            // Ensure Baseline Profile is fresh for release builds.
            baselineProfile.automaticGenerationDuringBuild = true
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }


    /**
     * with the default 'application' plugin, this Kotlin-block' is available
     * and prevents application from crashing.
     */
//    kotlin {
//        compilerOptions {
//            jvmTarget = JvmTarget.JVM_17
//        }
//    }

    buildFeatures {
        compose = true
    }
}

baselineProfile {
    // Don't build on every iteration of a full assemble.
    // Instead enable generation directly for the release build variant.
    automaticGenerationDuringBuild = false

    // Make use of Dex Layout Optimizations via Startup Profiles
    dexLayoutOptimization = true
}

dependencies {

//    implementation(project(":core:designsystem"))
//    implementation(projects.core.designsystem)    // ---> it works


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
//
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)

    implementation(libs.androidx.compose.ui.tooling.preview)

    implementation(libs.androidx.material3)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

}
