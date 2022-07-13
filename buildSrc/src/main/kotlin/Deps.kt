object Deps {
    const val hiltVer = "2.42"
    const val retrofitVer = "2.7.1"
    const val okhttpVer = "4.10.0"


    object Androidx {
        private const val core = "androidx.core:core-ktx:1.8.0"
        private const val appCompat = "androidx.appcompat:appcompat:1.4.2"
        private const val material = "com.google.android.material:material:1.6.1"
        private const val constraint = "androidx.constraintlayout:constraintlayout:2.1.4"

        val all = listOf(core, appCompat, material, constraint)
    }

    object Hilt {
        const val hilt = "com.google.dagger:hilt-android:$hiltVer"
        const val hiltAnnotation = "com.google.dagger:hilt-android:$hiltVer"
    }

    object Retrofit {
        private const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVer"
        private const val moshi = "com.squareup.retrofit2:converter-moshi:$retrofitVer"
        private const val okhttp3 = "com.squareup.okhttp3:okhttp:$okhttpVer"
        private const val interceptor = "com.squareup.okhttp3:logging-interceptor:$okhttpVer"

        val all = listOf(retrofit, moshi, okhttp3, interceptor)
    }

    object Arrow {
        const val arrow = "io.arrow-kt:arrow-core:1.0.1"
    }

    object UnitTest {
        private const val junit = "junit:junit:4.13.2"
        private const val hiltUnit = "com.google.dagger:hilt-android-testing:$hiltVer"
        private const val hiltTestCompiler = "com.google.dagger:hilt-compiler:$hiltVer"
        val all = listOf(junit, hiltUnit)
        val compilers = listOf(hiltTestCompiler)
    }

    object InstrumentationTest {
        private const val junitExt = "androidx.test.ext:junit:1.1.3"
        private const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
        private const val hiltTest = "com.google.dagger:hilt-android-testing:$hiltVer"
        private const val hiltTestCompiler = "com.google.dagger:hilt-compiler:$hiltVer"
        val all = listOf(junitExt, espresso, hiltTest)
        val compilers = listOf(hiltTestCompiler)
    }
}