package com.example.jetpackcomposebasics.margin

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class TextViewMargin: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            DisplayMarginText()
        }
    }
}

@Preview
@Composable
fun DisplayMarginText() {
    Text(text = "Hello Android Dev",
            fontSize = 20.sp,
        modifier = Modifier
            .padding(8.dp)
            .border(2.dp, Color.Red) // Outer Border
            .padding(8.dp) // Space between the borders
            .border(2.dp, Color.Yellow) // Inner Border
            .padding(10.dp),
        color = Color.Green
    )
}