plugins {
    id("com.android.application")
    kotlin("android")
}

dependencies {
    //val composeVersion = "1.0.1"

    implementation(project(":shared"))

    implementation("androidx.fragment:fragment-ktx:1.3.6")
    implementation("androidx.constraintlayout:constraintlayout-compose:1.0.0-rc01")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.constraintlayout:constraintlayout:2.1.1")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1")
    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.recyclerview:recyclerview:1.2.1")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
    implementation("androidx.cardview:cardview:1.0.0")
   /*
    implementation("androidx.compose.ui:ui:$composeVersion")
    implementation("androidx.compose.ui:platform:$composeVersion")
    implementation("androidx.activity:activity-ktx:1.3.1")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("androidx.activity:activity-compose:1.3.1")
    implementation("androidx.compose.ui:ui-tooling:$composeVersion")
    implementation("androidx.compose.material:material:$composeVersion")
    implementation("androidx.compose.material:material-icons-extended:$composeVersion")*/

    //implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.1")
  //  implementation("androidx.core:core-ktx:1.6.0")

    // implementation("androidx.compose.swiperefreshlayout:swiperefreshlayout:$composeVersion")

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
       // compose = true
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