plugins {
    alias(libs.plugins.convention.cmp.feature)
}



dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.designsystem)
    implementation(projects.feature.statsboard.domain)
}