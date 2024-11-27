package com.example.chat_bot_class.Screen

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    var navController = rememberNavController();

    NavHost(
        navController = navController,
        startDestination = Screen.SignUpSreen.route
    ) {
        composable(Screen.SignUpSreen.route){
            SignUpScreen(){
                navController.navigate(Screen.SignInSreen.route)
            }
        }

        composable(Screen.SignInSreen.route){
            LoginScreen(){
                navController.navigate(Screen.SignUpSreen.route)
            }
        }
    }
}