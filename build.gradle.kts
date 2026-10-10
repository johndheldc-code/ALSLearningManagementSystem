// Top-level build.gradle.kts
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false

    // ✅ Firebase plugin (needed for google-services.json)
    id("com.google.gms.google-services") version "4.4.2" apply false
}
