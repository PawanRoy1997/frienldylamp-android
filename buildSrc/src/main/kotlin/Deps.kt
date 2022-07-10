object Deps {
    object Androidx {
        private const val core = "androidx.core:core-ktx:1.8.0"
        private const val appCompat = "androidx.appcompat:appcompat:1.4.2"
        private const val material = "com.google.android.material:material:1.6.1"
        private const val constraint = "androidx.constraintlayout:constraintlayout:2.1.4"

        val all = listOf(core, appCompat, material, constraint)
    }

    object UnitTest {
        private const val junit = "junit:junit:4.13.2"
        val all = listOf(junit)
    }

    object InstrumentationTest {
        private const val junitExt = "androidx.test.ext:junit:1.1.3"
        private const val espresso = "androidx.test.espresso:espresso-core:3.4.0"
        val all = listOf(junitExt, espresso)
    }
}