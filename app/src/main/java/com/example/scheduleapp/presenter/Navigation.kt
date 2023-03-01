package com.example.scheduleapp.presenter

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

sealed class AppRoutes {
    companion object {
        const val homeRoute: String = "home"
        const val movieDetailsRoute: String = "movieDetails"
        
    }
}

@Composable
fun AppNavigationHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = AppRoutes.homeRoute
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        
        composable(AppRoutes.homeRoute) {
        }
        composable("${AppRoutes.movieDetailsRoute}/{movie_id}") {
        
        }
        
        
    }
}
//fun NavGraphBuilder.homeGraph(navController: NavHostController) {
//    navigation(startDestination = AppRoutes.movieDetailsRoute, route = AppRoutes.movieDetailsRoute) {
//
//
//    }
//}
