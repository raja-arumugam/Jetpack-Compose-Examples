package com.example.jetpackcomposebasics.textfiled

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MaterialTextFiled : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisplayMaterialTextFiled()
        }
    }
}

@Preview
@Composable
fun DisplayMaterialTextFiled() {
    Column {
        SampleTextField()
        SamplePasswordTextField()
        SampleEmailTextField()
    }
}

@Composable
fun SampleTextField() {
    var text by remember {
        mutableStateOf(TextFieldValue(""))
    }

    OutlinedTextField(value = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        label = { Text("Enter your name") },
        keyboardOptions = KeyboardOptions(
            imeAction = ImeAction.Next, keyboardType = KeyboardType.Text
        ),
        leadingIcon = {
            Icon(
                imageVector = Icons.Outlined.Person,
                contentDescription = "personIcon"
            )
        },
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        onValueChange = {
            text = it
        })
}

@Composable
fun SamplePasswordTextField() {
    var text by remember {
        mutableStateOf(TextFieldValue(""))
    }

    OutlinedTextField(value = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Next),
        visualTransformation = PasswordVisualTransformation(),
        label = { Text("Enter your password") },
        leadingIcon = { Icon(imageVector = Icons.Outlined.Lock, contentDescription = "lockIcon") },
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        onValueChange = {
            text = it
        })
}

@Composable
fun SampleEmailTextField() {
    var text by remember {
        mutableStateOf(TextFieldValue(""))
    }

    OutlinedTextField(value = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email, imeAction = ImeAction.Next),
        visualTransformation = PasswordVisualTransformation(),
        label = { Text("Enter your email") },
        leadingIcon = {
            Icon(
                imageVector = Icons.Outlined.Email,
                contentDescription = "emailIcon"
            )
        },
        textStyle = TextStyle(color = Color.Black, fontSize = 16.sp),
        onValueChange = {
            text = it
        })

}