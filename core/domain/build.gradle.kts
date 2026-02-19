plugins {
//    alias(libs.plugins.android.library)       ---> comes as default provided when creating this module, replaced by line # 4
//    alias(libs.plugins.kotlin.android)        ---> comes as default provided when creating this module, replaced by line # 4
    alias(libs.plugins.convention.android.library)
}

android {
    namespace = "create.develop.intelligentlistener.domain"
    compileSdk {
        version = release(36)
    }

    defaultConfig {
        minSdk = 25

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_17
//        targetCompatibility = JavaVersion.VERSION_17
//    }



}

dependencies {
    /**
     * moved all block to the 'build.gradle.kts' into the convention-plugin: AndroidLibraryConventionPlugin
     *
     */
}