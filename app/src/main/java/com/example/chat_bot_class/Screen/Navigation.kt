package com.example.chat_bot_class.Screen

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.chat_bot_class.ViewModel.AuthViewModel

@Composable
fun Navigation() {
    var navController = rememberNavController();
    var authViewModel :AuthViewModel = viewModel()
    NavHost(
        navController = navController,
        startDestination = Screen.SignUpSreen.route
    ) {
        composable(Screen.SignUpSreen.route){
            SignUpScreen(authViewModel){
                navController.navigate(Screen.SignInSreen.route)
            }
        }

        composable(Screen.SignInSreen.route){
            LoginScreen(authViewModel){
                navController.navigate(Screen.SignUpSreen.route)
            }
        }
    }
}