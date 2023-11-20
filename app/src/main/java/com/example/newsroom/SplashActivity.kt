package com.example.newsroom

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.newsroom.presentation.theme.NewsroomTheme
import kotlinx.coroutines.delay

@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsroomTheme{
                SplashScreen()
            }
        }
    }

    @Preview
    @Composable
    private fun SplashScreen()
    {
        LaunchedEffect(key1 = true){
            delay(2000)
            startActivity(Intent(this@SplashActivity,MainActivity::class.java))
            finish();
        }

        Box(modifier = Modifier
            .fillMaxSize()
            .background(
                Color(0xFF2D2D46)
            )
            , contentAlignment = Alignment.Center){
            Image(
                painter = painterResource(id = R.drawable.splash_final), contentDescription =null
            )
        }
    }
}