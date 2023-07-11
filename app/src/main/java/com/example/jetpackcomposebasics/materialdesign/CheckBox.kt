package com.example.jetpackcomposebasics.materialdesign

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class CheckBox : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleCheckBox()
        }
    }
}

@Preview
@Composable
fun SimpleCheckBox() {
    val checkstate = remember {
        mutableStateOf(false)
    }

    Checkbox(checked = checkstate.value,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        onCheckedChange = { checkstate.value = it })

    Text(
        text = "Check this Item", modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    )
}