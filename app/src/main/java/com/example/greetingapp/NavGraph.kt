package com.example.greetingapp

import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.greetingapp.greeting.GreetingScreen
import com.example.greetingapp.greeting.GreetingViewModel
import com.example.greetingapp.greeting.NameKey
import com.example.greetingapp.input.InputScreen
import com.example.greetingapp.locals.LocalNavController

@Composable
fun NavGraph() {
    val navController = LocalNavController.current

    NavHost(
        navController = navController,
        startDestination = "input"
    ) {
        composable("input") { InputScreen() }
        composable("greeting/{$NameKey}") { GreetingScreen() }
    }
}
