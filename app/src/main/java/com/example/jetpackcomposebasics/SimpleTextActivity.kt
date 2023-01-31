package com.example.jetpackcomposebasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material.Text

class SimpleTextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // The setContent block defines the layout of the activity and it is used in place of
        // setContent(R.id.some_xml_file) that we use normally(without compose). This is an
        // extension function of Activity. Form here we can call all our @Composable functions.
        setContent {
            Column() {
                customText("Raja")
                customText2(value2 = "Android Dev")
            }
        }
    }
}

@Composable
fun customText(value: String) {
   Text(text = "Hello $value!")
}

@Preview(showBackground = true)
@Composable
fun Display() {
  Column() {
      customText("Raja")
      customText2(value2 = "Android Dev")
  }
}

@Composable
fun customText2(value2: String) {
    Text(text = value2)

}