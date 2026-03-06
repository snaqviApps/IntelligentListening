plugins {
    alias(libs.plugins.convention.cmp.library)
}


dependencies {
    implementation(project(":core:domain"))
//    implementation(projects.core.domain)
    implementation(compose.components.resources)
}