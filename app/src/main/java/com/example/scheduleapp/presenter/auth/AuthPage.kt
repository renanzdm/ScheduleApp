package com.example.scheduleapp.presenter.auth

import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.scheduleapp.R
import com.example.scheduleapp.util.components.AppButton
import com.example.scheduleapp.util.components.AppButtonGradient

@Composable
fun AuthPage() {
    BackHandler(enabled = true, onBack = {})
    Box() {
        Image(
            painter = painterResource(id = R.drawable.auth_background),
            contentDescription = "auth background",
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Bottom) {
            Text("djaskjdlksajdklsjdkaldjkladjaskldjkjkdljsakjdkjsldkljdaskldjsakldsakljsajkl")
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                AppButtonGradient(
                    text = "Entrar",
                    gradient = Brush.verticalGradient(listOf(
                        Color.Red,Color.DarkGray
                    )),
                    onClick = {},
                    modifier = Modifier.weight(1f)
                )
                AppButton(
                    text = "Registrar",
                    color = Color.Red,
                    onClick = {},
                    modifier = Modifier.weight(1f)
                )
            }
            
        }
        
    }
    
}
