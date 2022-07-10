object Deps {
    const val hiltVer = "2.42"

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