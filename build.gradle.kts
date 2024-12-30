plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.jetbrainsKotlinAndroid) apply false
}

buildscript {
    dependencies {
        classpath("com.google.gms:google-services:4.3.15") // Google Services plugin classpath
    }
}

allprojects {
    // No need to declare repositories here
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}
