package com.example.scheduleapp.presenter

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import androidx.navigation.compose.rememberNavController
import com.example.scheduleapp.presenter.auth.AuthPage
import com.example.scheduleapp.presenter.auth.register.RegisterPage
import com.example.scheduleapp.presenter.home.HomePage
import com.example.scheduleapp.presenter.splash.SplashPage

sealed class AppRoutes {
    companion object {
        const val homeRoute: String = "home"
        const val splashRoute: String = "splash"
        const val auth: String = "auth"
        const val register: String = "register"
        
        
    }
}

@Composable
fun AppNavigationHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = AppRoutes.splashRoute
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(AppRoutes.splashRoute){
            SplashPage(navController)
        }
        composable(AppRoutes.homeRoute){
            HomePage(navController)
        }
       authGraph()
    }
}
fun NavGraphBuilder.authGraph() {
    navigation(startDestination = AppRoutes.auth, route = "auth-graph") {
        composable(AppRoutes.auth){
            AuthPage()
        }
        composable(AppRoutes.register){
            RegisterPage()
        }

    }
}
