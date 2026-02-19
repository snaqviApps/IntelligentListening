plugins {
    alias(libs.plugins.convention.android.library)
}

android {
    namespace = "create.develop.intelligentlistener.data"
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
}

dependencies {
    implementation(projects.core.domain)
    /**
     * moved all block-below to the 'build.gradle.kts' into the convention-plugin: AndroidLibraryConventionPlugin
     *     implementation(libs.androidx.core.ktx)
     *     implementation(libs.androidx.appcompat)
     *     implementation(libs.material)
     *     testImplementation(libs.junit)
     *     androidTestImplementation(libs.androidx.junit)
     *     androidTestImplementation(libs.androidx.espresso.core)
     */
}