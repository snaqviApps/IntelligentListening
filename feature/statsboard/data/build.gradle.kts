plugins {
    alias(libs.plugins.convention.android.library)
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.feature.statsboard.domain)
    implementation(projects.feature.statsboard.database)

}