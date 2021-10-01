plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    val composeVersion = "1.0.1"

    implementation(project(":shared"))

    implementation("androidx.fragment:fragment-ktx:1.3.6")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.0-rc01")
    implementation("androidx.compose.ui:ui:$composeVersion")
    implementation("androidx.activity:activity-ktx:1.3.1")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.activity:activity-compose:1.3.1")
    implementation("androidx.compose.ui:ui-tooling:$composeVersion")
    implementation("androidx.compose.material:material:$composeVersion")
    implementation("androidx.compose.material:material-icons-extended:$composeVersion")
}

android {
    compileSdk = 31
    defaultConfig {
        applicationId = "com.haydencampbell.spacex.android"
        minSdk = 21
        targetSdk = 31
        versionCode = 1
        versionName = "1.0"
    }
    buildFeatures {
        compose = true
        buildConfig = false
        aidl = false
        renderScript = false
        resValues = false
        shaders = false
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.0.1"
    }
}