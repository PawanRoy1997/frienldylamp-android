import com.android.build.gradle.internal.utils.isKotlinKaptPluginApplied

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
}

android {
    namespace = "com.example.friendlylamp"
    compileSdk = 32

    defaultConfig {
        applicationId = "com.example.friendlylamp"
        minSdk = 27
        targetSdk = 32
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    // Androidx
    Deps.Androidx.all.forEach(::implementation)

    // Hilt
    implementation(Deps.Hilt.hilt)
    kapt(Deps.Hilt.hiltAnnotation)

    // Retrofit
    Deps.Retrofit.all.forEach(::implementation)

    //Arrow
    implementation(Deps.Arrow.arrow)

    // Unit Tests
    Deps.UnitTest.all.forEach(::testImplementation)
    Deps.UnitTest.compilers.forEach(::kaptTest)

    // Instrumentation Tests
    Deps.InstrumentationTest.all.forEach(::androidTestImplementation)
    Deps.InstrumentationTest.compilers.forEach(::kaptAndroidTest)
}

kapt {
    correctErrorTypes = true
}