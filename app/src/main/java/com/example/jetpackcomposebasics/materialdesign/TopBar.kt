package com.example.jetpackcomposebasics.materialdesign

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposebasics.R

class TopBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ShowTopBar()
        }
    }

}

@Preview
@Composable
fun ShowTopBar() {
    // TopAppBar is generally used to have the app name or icon for navigation drawer.
    // Basically it is the AppBar that we use in Android.

    TopAppBar(modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth(),
        title = { Text(text = "Jetpack Compose App") },
        navigationIcon = {
            IconButton(onClick = {
                // To Do Something
            }) {
                Icon(
                    Icons.Filled.Menu,
                    "Menu Icon"
                )
            }
        },
        actions = {
            IconButton(onClick = {
                // To Do Something
            }) {
                Icon(Icons.Outlined.Home, contentDescription = "")
            }
        }
    )
}