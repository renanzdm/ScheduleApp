package com.example.scheduleapp.util.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun AppButtonGradient(text:String,gradient: Brush,onClick:()->Unit,modifier: Modifier) {
  
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color.Transparent,
        ),
        onClick = onClick,modifier = modifier)
    {
        Box(
            modifier = modifier.background(gradient),
            contentAlignment = Alignment.Center
        ) {
            Text(text = text)
        }
    }
}

@Composable
fun AppButton(text:String,color:Color,onClick:()->Unit,modifier: Modifier = Modifier) {
    Button(
        colors = ButtonDefaults.buttonColors(
            backgroundColor = color
        ),
        onClick = onClick, modifier = modifier)
    {
        Text(text = text)
        
    }
}