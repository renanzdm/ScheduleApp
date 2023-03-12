package com.example.scheduleapp.presenter.auth.register

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.scheduleapp.util.components.AppButton

@Composable
fun RegisterPage() {
    val nameField by remember {
        mutableStateOf("")
    }
    val emailField by remember {
        mutableStateOf("")
    }
    val passwordField by remember {
        mutableStateOf("")
    }
    
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        OutlinedTextField(value = nameField, onValueChange = { value -> })
        OutlinedTextField(value = emailField, onValueChange = { value -> })
        OutlinedTextField(value = passwordField, onValueChange = { value -> })
        
        
       
    }
    
}


@Preview(showBackground = true)
@Composable
fun RegisterPagePreview() {
    RegisterPage()
}