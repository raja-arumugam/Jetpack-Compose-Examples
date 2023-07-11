package com.example.jetpackcomposebasics.image

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposebasics.R

class SimpleImage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContent {
            sampleImage()
            ShapeImage()
            CircleImage()
        }
    }
}

@Composable
fun sampleImage() {
    Image(
        painterResource(id = R.drawable.download), contentDescription = "android logo",
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun ShapeImage() {
    Image(
        painterResource(id = R.drawable.download), contentDescription = "androidLogo",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth().clip(shape = RoundedCornerShape(60.dp))
    )
}

@Preview
@Composable
fun CircleImage() {
    Image(
        painterResource(id = R.drawable.download), contentDescription = "androidLogo",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth().clip(CircleShape)
    )
}