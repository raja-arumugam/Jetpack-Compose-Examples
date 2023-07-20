package com.example.jetpackcomposebasics.layout

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposebasics.R
import com.example.jetpackcomposebasics.data.Android
import com.example.jetpackcomposebasics.data.getAndroidList

class LazyColumnActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LazyColumnLayout(androidList = getAndroidList())
        }

    }
}

@Composable
fun LazyColumnLayout(androidList: List<Android>) {
    LazyColumn(modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(8.dp)) {
        items(androidList) { item ->
            Card(
                shape = RoundedCornerShape(15.dp),
                backgroundColor = Color.White,
                elevation = 10.dp,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .height(100.dp)
            ) {
                Row(
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painterResource(id = R.drawable.download),
                        contentDescription = "logo",
                        Modifier
                            .padding(8.dp)
                            .height(60.dp)
                            .clip(CircleShape),
                        contentScale = ContentScale.Fit,
                        alignment = Alignment.Center
                    )

                    Spacer(modifier = Modifier.padding(2.dp))

                    Column(
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = item.versionName,
                            textAlign = TextAlign.Start,
                            style = TextStyle(
                                fontSize = 16.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.Black,
                                fontWeight = FontWeight.Bold,
                                )
                        )

                        Spacer(modifier = Modifier.padding(2.dp))

                        Text(
                            text = item.versionNumber.toString() + " Version",
                            textAlign = TextAlign.Start,
                            style = TextStyle(
                                fontSize = 13.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.DarkGray
                            )
                        )

                        Spacer(modifier = Modifier.padding(2.dp))

                        Text(
                            text = item.released_year.toString() + " Released",
                            textAlign = TextAlign.Start,
                            style = TextStyle(
                                fontSize = 13.sp,
                                fontFamily = FontFamily.SansSerif,
                                color = Color.DarkGray
                            )
                        )

                    }

                }
            }
        }
    }
}