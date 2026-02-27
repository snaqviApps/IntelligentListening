import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class CmpFeatureConventionPlugin: Plugin<Project> {
    override fun apply(target: Project) {
        with(target){
            with(pluginManager){
                apply("create.develop.convention.cmp.library")
            }

            dependencies {
                "implementation"(project(":core:presentation"))
                "implementation"(project(":core:designsystem"))
            }
        }
    }
}