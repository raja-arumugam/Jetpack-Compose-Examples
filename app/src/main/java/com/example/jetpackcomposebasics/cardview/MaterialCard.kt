package com.example.jetpackcomposebasics.cardview

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MaterialCard : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            Column {
                ShapeCard()
                ClickableCard()
            }
        }
    }
}

@Composable
fun ShapeCard() {
    Card(
        backgroundColor = Color.LightGray,
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Shape Card",
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Monospace,
            fontSize = 16.sp,
            modifier = Modifier
                .height(100.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
        )
    }
}

@Composable
fun ClickableCard() {
    val context = LocalContext.current

    Card(
        backgroundColor = Color.Red,
        elevation = 10.dp,
        shape = RoundedCornerShape(20.dp),
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
            .clickable(onClick = {
                Toast
                    .makeText(context, "Thanks for clicking", Toast.LENGTH_SHORT)
                    .show()
            })
    ) {
        Text(
            text = "Clickable Card",
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Monospace,
            fontSize = 16.sp,
            modifier = Modifier
                .height(100.dp)
                .wrapContentHeight(align = Alignment.CenterVertically)
        )
    }


}