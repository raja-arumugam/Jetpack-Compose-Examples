package com.example.jetpackcomposebasics.textview

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextIndent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class StylingTextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisplayText()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DisplayText() {
    Column {
        // simple textview
        SetTextStyle("Hi this is raja")

        // textview with color with color
        SetTextStyle("This is black color", style = TextStyle(color = Color.Black))

        // textview with color with color and fontStyle
        SetTextStyle(
            "This is Red color with Italic font style",
            style = TextStyle(Color.Red, fontStyle = FontStyle.Italic)
        )

        // textview with color with color and fontStyle and font size
        SetTextStyle(
            "This is black color text with Italic fontSize and fontSize",
            style = TextStyle(Color.Black, fontStyle = FontStyle.Italic, fontSize = 16.sp)
        )

        // textview with font weight
        SetTextStyle(
            "This is Bold textview",
            style = TextStyle(fontWeight = FontWeight.Bold)
        )

        // textview with font family
        SetTextStyle(
            "This is SansSerif fontFamily",
            style = TextStyle(fontFamily = FontFamily.SansSerif)
        )

        // textview with font family and font weight
        SetTextStyle(
            "This is SansSerif fontFamily",
            style = TextStyle(fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.SemiBold)
        )

        // textview with font shadow
        SetTextStyle(
            "This is shadow textView",
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Black,
                    blurRadius = 8f,
                    offset = Offset(2f, 2f)
                )
            )
        )

        // textview with decoration
        SetTextStyle(
            "This is underline text",
            style = TextStyle(
                textDecoration = TextDecoration.Underline
            )
        )

        SetTextStyle(
            "This is underline text",
            style = TextStyle(
                textDecoration = TextDecoration.LineThrough
            )
        )

        // textview with background color
        SetTextStyle("This is background textview", style = TextStyle(background = Color.Gray))

        // textview padding = 30sp
        SetTextStyle(
            "This text having 16dp padding in first line",
            style = TextStyle(
                textIndent = TextIndent(firstLine = 30.sp)
            )
        )

    }
}

@Composable
fun SetTextStyle(text: String, style: TextStyle? = null) {
    Text(
        text = text,
        modifier = Modifier.padding(5.dp),
        style = style ?: TextStyle.Default,
    )
}