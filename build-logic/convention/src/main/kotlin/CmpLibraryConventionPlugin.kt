import org.gradle.api.Plugin
import org.gradle.api.Project
import com.android.build.gradle.LibraryExtension
import create.develop.intelligentlistener.convention.configureAndroidCompose
import org.gradle.kotlin.dsl.configure

class CmpLibraryConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("create.develop.convention.android.library")
                apply("org.jetbrains.kotlin.plugin.compose")
                apply("org.jetbrains.kotlin.plugin.serialization")
            }
            extensions.configure<LibraryExtension> {
                configureAndroidCompose(this)
            }
        }



    }
}