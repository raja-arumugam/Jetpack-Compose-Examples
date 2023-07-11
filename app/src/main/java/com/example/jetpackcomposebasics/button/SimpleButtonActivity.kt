package com.example.jetpackcomposebasics.button

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SimpleButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SimpleButtonComponent()
        }

    }
}

@Preview
@Composable
fun SimpleButtonComponent() {
    val context = LocalContext.current

    Button(
        onClick = {
            Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show()
        },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Click Here", modifier = Modifier.padding(8.dp),
            style = TextStyle(Color.White, fontSize = 16.sp, fontFamily = FontFamily.SansSerif)
        )
    }

}