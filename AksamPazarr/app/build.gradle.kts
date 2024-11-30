

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)

    id ("kotlin-parcelize")
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
    //id("androidx.navigation.safeargs.kotlin")


}

android {
    namespace = "com.example.aksampazarr"
    compileSdk = 34
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    defaultConfig {
        applicationId = "com.example.aksampazarr"
        minSdk = 24
        targetSdk = 34
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
    implementation("com.google.dagger:hilt-android:2.44")
    kapt("com.google.dagger:hilt-android-compiler:2.44")

       //val nav_version3 = "2.7.7"
      //  classpath ("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version3")


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    implementation ("br.com.simplepass:loading-button-android:2.2.0")
    implementation ("com.github.bumptech.glide:glide:4.13.0")

    implementation ("de.hdodenhof:circleimageview:3.1.0")

    //viewpager2 indicatior
    implementation ("io.github.vejei.viewpagerindicator:viewpagerindicator:1.0.0-alpha.1")

    //stepView
    implementation ("com.shuhart.stepview:stepview:1.5.1")

    //Android Ktx
    implementation ("androidx.navigation:navigation-fragment-ktx:2.4.2")

    //Dagger hilt
    implementation ("com.google.dagger:hilt-android:2.38.1")


    //Firebase
    implementation ("com.google.firebase:firebase-auth:21.0.6")

    //Coroutines with firebase
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.5.1")


    val nav_version1 = "2.5.2"
    implementation ("androidx.navigation:navigation-fragment-ktx:$nav_version1")
    implementation ("androidx.navigation:navigation-ui-ktx:$nav_version1")
}
kapt {
    correctErrorTypes = true
}