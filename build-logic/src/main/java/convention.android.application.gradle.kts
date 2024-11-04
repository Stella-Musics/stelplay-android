import com.stella.build_logic.configureComposeAndroid
import com.stella.build_logic.configureKotlinAndroid

plugins {
    id("com.android.application")
    id("convention.android.hilt")
    id("convention.verify.detekt")
    kotlin("android")
    kotlin("plugin.compose")
}

android {
    configureKotlinAndroid(this)
    configureComposeAndroid(this)

    namespace = "com.stella.stelplay_android"

    defaultConfig {
        applicationId = "com.stella.stelplay_android"
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}