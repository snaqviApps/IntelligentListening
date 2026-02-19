import com.android.build.api.dsl.ApplicationExtension
import create.develop.intelligentlistener.convention.configureKotlinAndroid
import create.develop.intelligentlistener.convention.libs

//import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin: Plugin<Project> {

    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

//            extensions.configure<ApplicationAndroidComponentsExtension> {
                extensions.configure<ApplicationExtension> {
                    namespace = "create.develop.intelligentlistener"

                    defaultConfig {
                        applicationId = libs.findVersion("projectApplicationId").get().toString()
                        targetSdk = libs.findVersion("projectTargetSdkVersion").get().toString().toInt()
                        versionCode = libs.findVersion("projectVersionCode").get().toString().toInt()
                        versionName = libs.findVersion("projectVersionName").get().toString()
                    }
                    packaging {
                        resources {
                            excludes += "/META-INF/{AL2.0,LGPL2.1}"
                        }
                    }
                    buildTypes {
                        getByName("release") {
                            isMinifyEnabled = false
                        }
                    }
                    configureKotlinAndroid(this)
                }
//            }

        }
    }
}