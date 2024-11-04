plugins {
    id("convention.android.application")
    alias(libs.plugins.baselineprofile)
}

dependencies {
    implementation(libs.androidx.core.ktx)

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext)
    androidTestImplementation(libs.androidx.test.espresso)

    "baselineProfile"(project(":baselineprofile"))
    implementation(libs.androidx.profileinstaller)
}
