
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
 * to make Android-Target ONLY solution, including
 * libraries specific to the same
 *
 */
class AndroidLibraryConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {

                apply("org.jetbrains.kotlin.plugin.compose")     // contains AndroidApplicationConventionPlugin and AndroidApplicationComposeConventionPlugin
                apply("com.android.library")

//                apply("create.develop.convention.kmp.library")            // Kmp, needs to be enabled yet
                apply("org.jetbrains.compose")
                apply("org.jetbrains.kotlin.plugin.serialization")
            }

            /** supposedly in a KMP-project */
//                configureAndroidTarget()

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
                    "implementation"(libs.findLibrary("jetbrains-compose-foundation").get())
                    "implementation"(libs.findLibrary("jetbrains-compose-material3").get())
                    "implementation"(libs.findLibrary("jetbrains-compose-material-icons-core").get())

                    "implementation"(libs.findLibrary("kotlinx-serialization-json").get())          //"-" replaced the "."



                    "debugImplementation"(libs.findLibrary("jetbrains-compose-ui-tooling").get())
            }
        }
    }
}