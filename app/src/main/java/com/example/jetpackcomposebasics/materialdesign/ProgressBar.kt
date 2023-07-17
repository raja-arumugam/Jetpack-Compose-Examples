package com.example.jetpackcomposebasics.materialdesign

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ProgressBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // CircularProgressIndicator is generally used at the loading screen and it indicates that
        // some progress is going on so please wait.

        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SimpleCircularProgressBar()
                CircularProgress()
                SimpleLinearProgressIndicator()
            }
        }
    }
}

@Composable
fun SimpleCircularProgressBar() {
    CircularProgressIndicator(modifier = Modifier.padding(16.dp))
}

@Composable
fun CircularProgress() {
    CircularProgressIndicator(
        modifier = Modifier.padding(16.dp),
        color = Color.Black,
        progress = 0.50f
    )
}

@Composable
fun SimpleLinearProgressIndicator() {
    LinearProgressIndicator(modifier = Modifier.padding(16.dp), color = Color.Green)
}

