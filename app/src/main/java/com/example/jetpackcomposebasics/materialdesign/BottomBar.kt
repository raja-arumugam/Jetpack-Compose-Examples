package com.example.jetpackcomposebasics.materialdesign

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class BottomBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            OpenBottomBar()
        }
    }
}

@Preview
@Composable
fun OpenBottomBar() {
    // BottomNavigation is a Composable that is used to give easy access to some items
    // and are placed at the bottom of the screen so that the user can easily navigate
    // by clicking the items of the BottomNavigation

    var selectedItem by remember {
        mutableStateOf(0)
    }

    val items = listOf("Home", "Favorite", "Profile")

    BottomNavigation(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        backgroundColor = Color.Green,
    ) {
        // BottomNavigationItem is used to add items to a BottomNavigation and since the
        // BottomNavigation is having a RowScope, so the BottomNavigationItems will be
        // placed horizontally.

        items.forEachIndexed { index, item ->
            BottomNavigationItem(
                label = { Text(text = item) },
                icon = { Icons.Default.Home },
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                selectedContentColor = Color.Red,
                unselectedContentColor = Color.LightGray
            )
        }
    }

}