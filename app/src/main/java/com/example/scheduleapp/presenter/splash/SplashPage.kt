package com.example.scheduleapp.presenter.splash

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.*
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.scheduleapp.presenter.AppRoutes

@Composable
fun SplashPage(
    navController: NavController,
) {
    val viewModel = hiltViewModel<SplashViewModel>()
    val uiState = viewModel.state
    LaunchedEffect(true) {
        if (uiState.isLogged == false) {
            navController.navigate(AppRoutes.auth)
        } else {
            navController.navigate(AppRoutes.homeRoute)
        }
    }
    if (uiState.isLoading) {
        Column(verticalArrangement = Arrangement.Center) {
            CircularProgressIndicator()
        }
    }
    
    
}