//
//import com.android.build.gradle.LibraryExtension
//import org.gradle.api.Plugin
//import org.gradle.api.Project
//import org.gradle.kotlin.dsl.configure
//import retrofit2.Retrofit
//
//class RetrofitConventionPlugin: Plugin<Project> {
//
//    override fun apply(target: Project) {
//        with(target) {
//            with(pluginManager) {
//                apply("com.squareup.retrofit2")     // doesn't work, needs to find (if exists), plugin for this 3rd party library
//            }
//
////            extensions.configure<RetrofitExt> {
//
//            }
//        }
//}
