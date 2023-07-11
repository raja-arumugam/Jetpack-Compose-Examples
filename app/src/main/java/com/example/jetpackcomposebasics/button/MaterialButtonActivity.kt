package com.example.jetpackcomposebasics.button

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext

class MaterialButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Column {
                BorderWithButton()
                IconWithButton()
                BackgroundColorButton()
                ShapeableButton()
                ShapeableWithBorderButton()

            }
        }

    }
}

@Composable
fun BorderWithButton() {

    val context = LocalContext.current

    Button(
        onClick = {
            Toast.makeText(context, "Clicked Border Button", Toast.LENGTH_SHORT).show()
        },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        border = BorderStroke(width = 2.dp, color = Color.Black),
    ) {
        Text(
            text = "This is Border Button",
            style = TextStyle(fontSize = 16.sp, fontFamily = FontFamily.SansSerif)
        )
    }
}

@Composable
fun IconWithButton() {
    val context = LocalContext.current

    Button(
        onClick = {
            Toast.makeText(context, "Clicked Icon Button", Toast.LENGTH_SHORT).show()
        },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "This is Home Icon Button",
        )
        Icon(
            imageVector = Icons.Filled.Home,
            contentDescription = "Icon Button",
            modifier = Modifier.size(ButtonDefaults.IconSize)
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
    }
}

@Composable
fun BackgroundColorButton() {
    val context = LocalContext.current

    Button(
        onClick = {
            Toast.makeText(context, "Clicked Background Color Button", Toast.LENGTH_SHORT).show()
        },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),

        colors = ButtonDefaults.buttonColors(backgroundColor = Color.Red)
    ) {
        Text(text = "This is Background Color", style = TextStyle(color = Color.White))
        Icon(
            imageVector = Icons.Filled.Favorite,
            contentDescription = "Icon Button",
            modifier = Modifier.size(ButtonDefaults.IconSize), tint = Color.White
        )
        Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
    }
}

@Composable
fun ShapeableButton() {
    val context = LocalContext.current

    Button(
        onClick = {
            Toast.makeText(context, "Clicked Shape Button", Toast.LENGTH_SHORT).show()
        },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
    ) {
        Text(text = "This is Shape Color", style = TextStyle(color = Color.White))
    }
}

@Preview
@Composable
fun ShapeableWithBorderButton() {
    val context = LocalContext.current

    Button(
        onClick = {
            Toast.makeText(context, "Clicked Shape Border Button", Toast.LENGTH_SHORT).show()
        },
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(20.dp),
        border = BorderStroke(width = 2.dp, color = Color.White)
    ) {
        Text(text = "This is Shape Border Color", style = TextStyle(color = Color.White))
    }
}