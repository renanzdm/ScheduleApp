package com.example.scheduleapp.presenter.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomePage(navController: NavController){
    Scaffold() {paddingValues->
        Column(modifier = Modifier.padding(paddingValues)) {
            
        }
    }
    
}