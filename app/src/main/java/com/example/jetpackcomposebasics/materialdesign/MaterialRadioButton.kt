package com.example.jetpackcomposebasics.materialdesign

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.selection.selectable
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MaterialRadioButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            val radioList = listOf("Android", "iOS", "Microsoft")
            val (selectedOption, onOptionSelected) = remember {
                mutableStateOf(radioList[2])
            }

            Column() {
                radioList.forEach { text ->
                    Row(modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .selectable(
                            selected = (text == selectedOption),
                            onClick = { onOptionSelected(text) }
                        )) {

                        RadioButton(
                            selected = (text == selectedOption),
                            onClick = { onOptionSelected(text) }
                        )

                        Text(
                            text = text,
                            modifier = Modifier.padding(16.dp),
                            style = TextStyle(fontSize = 16.sp),
                            color = Color.Black,
                            fontFamily = FontFamily.SansSerif
                        )


                    }
                }

            }
        }
    }
}