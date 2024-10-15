// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.ktlint)
    alias(libs.plugins.detekt)
}

allprojects {
    afterEvaluate {
        apply(plugin = "io.gitlab.arturbosch.detekt")

        detekt {
            toolVersion = "1.23.6"
            buildUponDefaultConfig = true
            config.setFrom(files("$rootDir/config/detekt/detekt.yml"))
        }
    }
}
