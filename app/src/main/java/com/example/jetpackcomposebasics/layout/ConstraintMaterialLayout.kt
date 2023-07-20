package com.example.jetpackcomposebasics.layout

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

class ConstraintMaterialLayout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        ConstraintLayout is a layout that allows you to place composables relative to other composables on the screen.
//        It is an alternative to using multiple nested Row, Column, Box and other custom layout elements.
//        ConstraintLayout is useful when implementing larger layouts with more complicated alignment requirements.

        setContent {
            ConstraintLayout(modifier = Modifier.padding(16.dp)) {

                // Create references for each composable in the ConstraintLayout using the createRefs() or createRefFor()
                val (button, text) = createRefs()

                Button(
                    onClick = {

                    },
                    // Assign reference "button" to the Button composable and constrain it to the
                    // top of the ConstraintLayout
                    modifier = Modifier.constrainAs(button) {
                        top.linkTo(parent.top, margin = 20.dp)
                    },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(Color.Black)
                ) {
                    Text(text = "Click here", style = TextStyle(color = Color.White))
                }

                // Assign reference "text" to the Text composable and constrain it to the
                // bottom of the Button composable
                Text(
                    "Text",
                    Modifier.constrainAs(text) {
                        top.linkTo(button.bottom, margin = 16.dp)
                    }
                )
            }
        }
    }
}