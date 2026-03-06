/**
 * /This plugin is not working as only 'KMP' type projects are able to use the
 * library [BuildConfigPluginExtension]
 * that enables  
 */
//import com.android.build.gradle.internal.cxx.configure.gradleLocalProperties
//import com.perrotuerto.gradle.BuildConfigPluginExtension
//
//import create.develop.intelligentlistener.convention.pathToPackageName
//
//import org.gradle.api.Plugin
//import org.gradle.api.Project
//import org.gradle.declarative.dsl.schema.FqName.Empty.packageName
//
//import org.gradle.kotlin.dsl.configure
//
//class BuildKonfigConventionPlugin: Plugin<Project> {
//    override fun apply(target: Project) {
//        with(target) {
//            with(pluginManager) {
//                apply("com.perrotuerto.buildconfig")
//            }
//            extensions.configure<BuildConfigPluginExtension> {
//                packageName = target.pathToPackageName()
//                defaultConfigs {
//                    val apiKey = gradleLocalProperties(rootDir, rootProject.providers)
//                        .getProperty("API_KEY")
//                        ?: throw IllegalStateException(
//                            "Missing API_KEY property in local.properties"
//                        )
//                    buildConfigField(FieldSpec.Type.STRING, "API_KEY", apiKey)
//                }
//            }
//
//
//        }
//    }
//}
//
