// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.sonar.qube)
}

//sonar {
//    properties {
//        property("sonar.projectKey", "guido5_FirebaseAuthAndroid")
//        property("sonar.organization", "guido5")
//        property("sonar.host.url", "https://sonarcloud.io")
//    }
//}