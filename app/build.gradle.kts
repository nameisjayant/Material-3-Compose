import org.jetbrains.kotlin.konan.properties.Properties
import java.io.FileInputStream

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}


android {
    signingConfigs {
        val configName = "config"
        if (rootProject.file("signing-debug.properties").exists()) {
            val signinDebug = Properties()

            signinDebug.load(FileInputStream(rootProject.file("signing-debug.properties")))
            getByName("debug") {
//                android.signingConfigs[configName].keyPassword("keyPassword")
//                android.signingConfigs[configName].storePassword("storePassword")
//                android.signingConfigs[configName].storeFile(rootProject.file("storefile"))
//                android.signingConfigs[configName].keyAlias("keyalias")
            }
        }
        create("release") {

        }
        create("beta") {

        }

    }
    namespace = "com.nameisjayant.composematerial3practise"
    compileSdk = libs.versions.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.nameisjayant.composematerial3practise"
        minSdk = libs.versions.minSdk.get().toInt()
        targetSdk = libs.versions.targetSdk.get().toInt()
        versionCode = libs.versions.versionCode.get().toInt()
        versionName = libs.versions.versionName.get()

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables.useSupportLibrary = true
    }

    afterEvaluate {

    }

    buildTypes {
//        getByName("debug"){
//
//        }
//        getByName("release"){}

//        applicationVariants.all { variant ->
//            variant.outputs.all {
//              outputFile = "ddd.apk"
//            }
//        }


        create("beta") {
            signingConfig = signingConfigs.getByName("beta")
            isDebuggable = true
            applicationIdSuffix = ".beta"
            versionNameSuffix = "-beta"
        }
        release {
            signingConfig = signingConfigs.getByName("release")
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
        debug {
            signingConfig = signingConfigs.getByName("debug")
        }

    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = libs.versions.jvmaTarget.get()
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.kotlinComplierVersion.get()
    }
    packaging.resources {
        excludes += "/META-INF/{AL2.0,LGPL2.1}"
    }
}

dependencies {

    val composeBom = platform(libs.compose.bom)

    implementation(libs.androidx.ktx)
    implementation(platform(libs.kotlin.bom))
    implementation(libs.lifecycle.runtime.ktx)
    implementation(libs.compose.activity)
    implementation(composeBom)
    implementation(libs.compose.ui)
    implementation(libs.compose.ui.graphics)
    implementation(libs.compose.ui.tooling.preview)
    implementation(libs.compose.material3)
    testImplementation(libs.junit.test)
    androidTestImplementation(libs.android.test.ext)
    androidTestImplementation(libs.expresso.test)
    androidTestImplementation(composeBom)
    androidTestImplementation(libs.compose.junit.test)
    debugImplementation(libs.compose.ui.tooling)
    debugImplementation(libs.compose.manifest)

    implementation(libs.google.font)
    implementation(libs.placeholder.material)

}