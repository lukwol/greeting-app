package com.example.greetingapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.navigation.compose.rememberNavController
import com.example.greetingapp.locals.LocalNavController
import com.example.greetingapp.ui.theme.GreetingAppTheme

@Composable
fun GreetingApp() {
    val navController = rememberNavController()

    GreetingAppTheme {
        CompositionLocalProvider(LocalNavController provides navController) {
            NavGraph()
        }
    }
}
