package configs

import java.util.Collections.emptySet

object AndroidConfig {

    const val applicationId = "io.dotanuki.demos.norris"

    const val compileSdk = 28
    const val minSdk = 23
    const val targetSdk = compileSdk

    const val buildToolsVersion = "29.0.0"

    const val instrumentationTestRunner = "androidx.test.runner.AndroidJUnitRunner"

    val noGeneratedDensities = emptySet<String>().toTypedArray()
}
