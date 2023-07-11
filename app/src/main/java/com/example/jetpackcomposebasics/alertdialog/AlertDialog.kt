package com.example.jetpackcomposebasics.alertdialog

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AlertDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        /* These are the main parts of a Alert Dialog
          1. Title
          2. Text / description
          3. Confirm button
          4. Cancel button*/

        setContent {
            val dialogState = remember {
                mutableStateOf(false)
            }

            Column() {
                Button(
                    onClick = {
                        dialogState.value = true
                    },
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.Black)

                ) {
                    Text(
                        text = "Click Here", modifier = Modifier.padding(8.dp),
                        fontSize = 16.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center
                    )
                }
            }

            if (dialogState.value) {
                MaterialTheme {
                    AlertDialog(
                        onDismissRequest = {
                            dialogState.value = false
                        },
                        title = { Text(text = "Alert") },
                        text = { Text(text = "Are you want to exit?") },
                        backgroundColor = Color.White,
                        contentColor = Color.Black,

                        confirmButton = {
                            TextButton(onClick = {
                                dialogState.value = false
                            }) {
                                Text(text = "Confirm", modifier = Modifier.padding(8.dp))
                            }
                        },

                        dismissButton = {
                            TextButton(onClick = {
                                dialogState.value = false
                            }) {
                                Text(text = "Cancel", modifier = Modifier.padding(8.dp))
                            }
                        }
                    )
                }
            }
        }
    }
}