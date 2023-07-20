package com.example.jetpackcomposebasics.layout

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.FlingBehavior
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposebasics.R
import com.example.jetpackcomposebasics.data.Android
import com.example.jetpackcomposebasics.data.getAndroidList

class LazyGridActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
//            LazyVerticalGridComponent(androidList = getAndroidList())
            LazyHorizontalGridComponent(androidList2 = getAndroidList())
        }
    }
}

@Composable
fun LazyVerticalGridComponent(androidList: List<Android>) {

//    using GridCells.Adaptive to set each column to be at least 130.dp wide:
    LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 120.dp)) {
        items(androidList) { item ->
            Image(
                painterResource(id = item.image),
                contentDescription = "android",
                modifier = Modifier.padding(8.dp),
                contentScale = ContentScale.Fit,
            )
        }
    }
}

@Composable
fun LazyHorizontalGridComponent(androidList2: List<Android>) {
    LazyHorizontalGrid(
        rows = GridCells.Fixed(4),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(androidList2) { item ->
            Image(
                painterResource(id = item.image),
                contentDescription = "android",
                modifier = Modifier.padding(8.dp),
                contentScale = ContentScale.Fit,
            )
        }
    }
}