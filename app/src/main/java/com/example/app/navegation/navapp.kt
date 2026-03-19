package com.example.loginviewhome.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.app.screens.MainScreen
import screens.WelcomeScreen
import screens.LoginScreen
import screens.SignupScreen


@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "main"
    ) {
        composable("welcome") {
            WelcomeScreen(navController)
        }
        composable("login") {
            LoginScreen(navController)
        }
       composable("signup") {
           SignupScreen(navController)
        }
        composable("main") {
            MainScreen(navController)
        }
    }
}