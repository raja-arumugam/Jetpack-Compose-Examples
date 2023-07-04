package com.example.jetpackcomposebasics.textfiled

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.getValue
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SampleTextFiled : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisplayEditText()
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DisplayEditText() {
    Column {

        //Simple TextFiled
        TextViewComponent("Sample TextFiled")
        SampleTextFiledComponent()

        //Simple Numbers Filed
        TextViewComponent("Sample Numbers Text Filed")
        SampleNumberTextFiledComponent()

        //Simple Password Filed
        TextViewComponent("Sample Password Text Filed")
        SamplePasswordTextFiledComponent()

        //Simple Ime Text Filed
        TextViewComponent("Sample Ime Text Filed")
        SampleImeTextFiledComponent()

        //Simple Icon Text filed
        TextViewComponent("Sample Icon Text Filed")
        SampleIconTextFiledComponent()

    }
}

@Composable
fun TextViewComponent(text: String) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 14.sp,
            color = Color.Black
        ),
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    )
}

@Composable
fun SampleTextFiledComponent() {
    var text by remember {
        mutableStateOf(TextFieldValue(""))
    }

    TextField(value = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        onValueChange = {
            text = it
        })
}

@Composable
fun SampleNumberTextFiledComponent() {
    var text by remember {
        mutableStateOf(TextFieldValue(""))
    }

    TextField(value = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        onValueChange = {
            text = it
        }
    )
}

@Composable
fun SamplePasswordTextFiledComponent() {
    var text by remember {
        mutableStateOf(TextFieldValue(""))
    }

    TextField(value = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        onValueChange = {
            text = it
        })
}

@Composable
fun SampleImeTextFiledComponent() {
    var text by remember {
        mutableStateOf(TextFieldValue(""))
    }

    TextField(value = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Next
        ),
        onValueChange = {
            text = it
        })
}

@Composable
fun SampleIconTextFiledComponent() {
    var text by remember {
        mutableStateOf(TextFieldValue(""))
    }

    TextField(value = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Text,
            imeAction = ImeAction.Done
        ),
        leadingIcon = { Icon(imageVector = Icons.Filled.Person, contentDescription = "personIcon") },

        onValueChange = {
            text = it
        })

}
