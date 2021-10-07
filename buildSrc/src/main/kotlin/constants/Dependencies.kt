@file:Suppress("unused", "SpellCheckingInspection", "MemberVisibilityCanBePrivate")

package constants

object Dependencies {

    object Core {
        const val desugarJdkLibs = "com.android.tools:desugar_jdk_libs:1.1.5"
        const val androidGradlePlugin = "com.android.tools.build:gradle:7.0.0"
        const val async = "com.github.anvell:async:0.2.0"
        const val either = "com.github.anvell.either:either:0.2.2"
        const val eitherAsync = "com.github.anvell.either:either-async:0.2.2"
    }

    object Kotlin {
        const val version = "1.5.30"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
        const val serialization = "org.jetbrains.kotlin:kotlin-serialization:$version"
        const val serializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.2.2"
    }

    object Coroutines {
        private const val version = "1.5.1"
        const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$version"
        const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
        const val test = "org.jetbrains.kotlinx:kotlinx-coroutines-test:$version"
    }

    object Testing {
        private const val version = "1.4.0"
        const val junit = "junit:junit:4.13.2"
        const val junitExt = "androidx.test.ext:junit:1.1.3"
        const val core = "androidx.test:core:$version"
        const val runner = "androidx.test:runner:$version"
        const val orchestrator = "androidx.test:orchestrator:$version"
        const val rules = "androidx.test:rules:$version"
        const val mockk = "io.mockk:mockk:1.10.2"
        const val threetenbp = "org.threeten:threetenbp:1.5.1"

        object Kotest {
            const val assertions = "io.kotest:kotest-assertions-core-jvm:4.6.1"
        }
    }

    object GoogleServices {
        const val gradlePlugin = "com.google.gms:google-services:4.3.10"
        const val crashlyticsGradlePlugin = "com.google.firebase:firebase-crashlytics-gradle:2.7.1"
    }

    object Firebase {
        private const val version = "28.3.1"
        const val bom = "com.google.firebase:firebase-bom:$version"
        const val messaging = "com.google.firebase:firebase-messaging-ktx"
        const val analytics = "com.google.firebase:firebase-analytics-ktx"
        const val crashlytics = "com.google.firebase:firebase-crashlytics-ktx"
    }

    object Maps {
        private const val versionKtx = "3.1.0"
        const val maps = "com.google.android.gms:play-services-maps:17.0.1"
        const val location = "com.google.android.gms:play-services-location:18.0.0"
        const val mapsKtx = "com.google.maps.android:maps-ktx:$versionKtx"
        const val mapsUtilsKtx = "com.google.maps.android:maps-utils-ktx:$versionKtx"
    }

    object Android {
        const val appcompat = "androidx.appcompat:appcompat:1.3.1"
        const val coreKtx = "androidx.core:core-ktx:1.6.0"
        const val material = "com.google.android.material:material:1.4.0"
        const val browser = "androidx.browser:browser:1.3.0"
        const val documentfile = "androidx.documentfile:documentfile:1.0.1"
        const val exifinterface = "androidx.exifinterface:exifinterface:1.3.3"
        const val security = "androidx.security:security-crypto:1.0.0"

        object Navigation {
            private const val version = "2.3.5"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
            const val ui = "androidx.navigation:navigation-ui-ktx:$version"
        }

        object Fragment {
            private const val version = "1.3.6"
            const val fragment = "androidx.fragment:fragment:$version"
            const val fragmentKtx = "androidx.fragment:fragment-ktx:$version"
        }

        object Lifecycle {
            private const val version = "2.3.1"
            const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:$version"
            const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:$version"
            const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-ktx:$version"
            const val process = "androidx.lifecycle:lifecycle-process:$version"
        }

        object Work {
            private const val version = "2.5.0"
            const val runtimeKtx = "androidx.work:work-runtime-ktx:$version"
            const val testing = "androidx.work:work-testing:$version"
        }

        object Play {
            private const val version = "2.2"
            const val installreferrer = "com.android.installreferrer:installreferrer:$version"
        }

        object Hilt {
            private const val version = "1.0.0"
            const val compiler = "androidx.hilt:hilt-compiler:$version"
            const val work = "androidx.hilt:hilt-work:$version"
        }
    }

    object Compose {
        const val version = "1.0.3"
        const val runtime = "androidx.compose.runtime:runtime:$version"
        const val foundation = "androidx.compose.foundation:foundation:$version"
        const val layout = "androidx.compose.foundation:foundation-layout:$version"
        const val ui = "androidx.compose.ui:ui:$version"
        const val icons = "androidx.compose.material:material-icons-extended:$version"
        const val animation = "androidx.compose.animation:animation:$version"
        const val material = "androidx.compose.material:material:$version"
        const val livedata = "androidx.compose.runtime:runtime-livedata:$version"
        const val tooling = "androidx.compose.ui:ui-tooling:$version"
        const val test = "androidx.compose.ui:ui-test:$version"
        const val uiTest = "androidx.compose.ui:ui-test-junit4:$version"
        const val uiTestManifest = "androidx.compose.ui:ui-test-manifest:$version"

        object Extra {
            const val activity = "androidx.activity:activity-compose:1.3.1"
            const val constraintLayout = "androidx.constraintlayout:constraintlayout-compose:1.0.0-beta02"
            const val navigation = "androidx.navigation:navigation-compose:2.4.0-alpha07"
            const val hiltNavigation = "androidx.hilt:hilt-navigation-compose:1.0.0-alpha03"
        }
    }

    object Dagger {
        private const val version = "2.38.1"
        const val dagger = "com.google.dagger:dagger:$version"
        const val compiler = "com.google.dagger:dagger-compiler:$version"
    }

    object Hilt {
        private const val version = "2.38.1"
        const val core = "com.google.dagger:hilt-core:$version"
        const val android = "com.google.dagger:hilt-android:$version"
        const val compiler = "com.google.dagger:hilt-android-compiler:$version"
        const val testing = "com.google.dagger:hilt-android-testing:$version"
        const val gradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
    }

    object Retrofit {
        private const val version = "2.9.0"
        const val retrofit = "com.squareup.retrofit2:retrofit:$version"
        const val serializationConverter = "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:0.8.0"
    }

    object OkHttp {
        private const val version = "4.9.0"
        const val okhttp = "com.squareup.okhttp3:okhttp:$version"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$version"
    }

    object Security {
        const val auth = "com.ergo.libs:auth:0.1.0"
        const val tink = "com.google.crypto.tink:tink-android:1.6.1"
    }

    object ExoPlayer {
        private const val version = "2.15.0"
        const val core = "com.google.android.exoplayer:exoplayer-core:$version"
        const val hls = "com.google.android.exoplayer:exoplayer-hls:$version"
        const val ui = "com.google.android.exoplayer:exoplayer-ui:$version"
    }

    object Coil {
        private const val version = "1.3.2"
        const val coil = "io.coil-kt:coil:$version"
        const val compose = "io.coil-kt:coil-compose:$version"
    }

    object Io {
        const val okio = "com.squareup.okio:okio:2.1.0"
    }

    object Time {
        const val threetenabp = "com.jakewharton.threetenabp:threetenabp:1.3.1"
    }

    object Logging {
        const val timber = "com.jakewharton.timber:timber:5.0.1"
        const val chucker = "com.github.chuckerteam.chucker:library:3.5.2"
        const val chuckerNoOp = "com.github.chuckerteam.chucker:library-no-op:3.5.2"
    }
}
