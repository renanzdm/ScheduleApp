package com.example.scheduleapp.presenter.auth

import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.scheduleapp.R
import kotlin.system.exitProcess

@Composable
fun AuthPage() {
    BackHandler(enabled = true) {
    
    }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.auth_background),
            contentDescription = "auth background",
            contentScale = ContentScale.FillBounds
        )
    }
    
}

@Composable
@Preview(showBackground = true)
fun AuthPagePreview() {
    AuthPage()
}