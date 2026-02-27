plugins {
    alias(libs.plugins.convention.android.library)
    /**
     *  alias(libs.plugins.convention.buildkonfig)
     *
     * BuildKonfig Gradle plugin applied in project ':feature:statsboard:data'
     * but no supported Kotlin multiplatform plugin was found
     */
}

/**
android {
    namespace = "create.develop.core.data"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}
*/
dependencies {
//    implementation(libs.kotlin.stdlib)
    implementation(projects.core.domain)
}