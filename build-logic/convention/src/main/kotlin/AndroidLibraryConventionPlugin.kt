
import com.android.build.api.variant.LibraryAndroidComponentsExtension

import com.android.build.gradle.LibraryExtension
import create.develop.intelligentlistener.convention.configureKotlinAndroid
import create.develop.intelligentlistener.convention.libs
import create.develop.intelligentlistener.convention.pathToPackageName
import create.develop.intelligentlistener.convention.pathToResourcePrefix
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.dependencies

/**
 * CmpLibraryConventionPlugin and KmpLibraryConventionPlugin combining
 * to make Android-Target ONLY solution, by converging, if needed,
 * the libraries included in both
 *
 */
class AndroidLibraryConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.library")
                apply("org.jetbrains.kotlin.android")
                apply("org.jetbrains.kotlin.plugin.serialization")

            }


            extensions.configure<LibraryExtension> {
                configureKotlinAndroid(this)

                resourcePrefix = this@with.pathToResourcePrefix()
                namespace = this@with.pathToPackageName()
            }
            /**
             * found on 'nowinandroid'-project
             * */
            extensions.configure<LibraryAndroidComponentsExtension> {
//                configurePrintApksTask(this)
//                disableUnnecessaryAndroidTests(target)
            }

                /**
                 * replacing 'commonMainImplementation' with 'implementation'
                 * */
                dependencies {
                    "implementation"(libs.findLibrary("jetbrains-compose-ui").get())
//                    "implementation"(libs.findLibrary("jetbrains-compose-foundation").get())
//                    "implementation"(libs.findLibrary("jetbrains-compose-material3").get())
//                    "implementation"(libs.findLibrary("jetbrains-compose-material-icons-core").get())
                    "implementation"(libs.findLibrary("kotlinx-serialization-json").get())          //"-" replaced the "."

                    "implementation"(libs.findLibrary("androidx.core.ktx").get())
                    "implementation"(libs.findLibrary("androidx.appcompat").get())
                    "implementation"(libs.findLibrary("material").get())

                    "testImplementation"(libs.findLibrary("junit").get())
                    "androidTestImplementation"(libs.findLibrary("androidx.junit").get())
                    "androidTestImplementation"(libs.findLibrary("androidx.espresso.core").get())

                    "debugImplementation"(libs.findLibrary("androidx-compose-ui-tooling").get())
            }
        }
    }
}