import sun.misc.Version

object Versions {
    //root
    val compileSdkVersion = 28
    val gradleVersion = "3.3.1"
    val minSdkVersion = 20
    val targetSdkVersion = 28
    val versionCode = 1
    val versionName = "1.0"

    //libs
    val support_lib = "27.0.2"
    val retrofit = "2.3.0"
    val rxjava = "2.1.9"
    val constraintLayoutVersion = "1.1.3"
    val navigationVersion = "1.0.0"
    val timberVersion = "4.7.1"
    val materialComponentsVersion = "1.1.0-alpha06"


    //test libs
    val expresso = "3.0.2"
    val expressoRunner = "1.0.2"

    //NetWork
    val kotlinCoroutinesRetrofitAdapterVersion = "0.9.2"
    val httpLoggingInterVersion = "3.4.1"
    val retrofitVersion = "2.5.0"

    //di
    val koinVersion = "1.0.2"


    //corroutine
    val kotlinCoroutinesVersion = "1.1.0"
}

/**
 * Libs
 */
object Libs {
    val support_annotations = "com.android.support:support-annotations:${Versions.support_lib}"
    val support_appcompat_v7 = "com.android.support:appcompat-v7:${Versions.support_lib}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofit_rxjava_adapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val rxjava = "io.reactivex.rxjava2:rxjava:${Versions.rxjava}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    val navigation = "android.arch.navigation:navigation-fragment:${Versions.navigationVersion}"
    val timber = "com.jakewharton.timber:timber:${Versions.timberVersion}"
    val materialComponents = "com.google.android.material:material:${Versions.materialComponentsVersion}"
    val koin = "org.koin:koin-android:${Versions.koinVersion}"
    val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koinVersion}"
    val kotlinCoroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.kotlinCoroutinesVersion}"
    val kotlinCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.kotlinCoroutinesVersion}"
}

/**
 * Test libs
 */
object TestLibs {
    val espresso = "com.android.support.test.espresso:espresso-core:${Versions.expresso}"
    val expressoRunner = "com.android.support.test:runner:${Versions.expressoRunner}"
}

/**
 * Build Pluggins
 *
 */
object BuildPlugins {
    val gradle =  "com.android.tools.build:gradle:${Versions.gradleVersion}"
    val testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
}


object Network{
    val httpLoggingInterceptor  = "com.squareup.okhttp3:logging-interceptor:${Versions.httpLoggingInterVersion}"
    val kotlinCoroutinesRetrofitAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.kotlinCoroutinesRetrofitAdapterVersion}"
    val retrofitGsonConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofitVersion}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"

}