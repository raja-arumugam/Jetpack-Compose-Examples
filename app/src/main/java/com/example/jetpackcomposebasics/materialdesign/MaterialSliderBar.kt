package com.example.jetpackcomposebasics.materialdesign

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Colors
import androidx.compose.material.Slider
import androidx.compose.material.SliderColors
import androidx.compose.material.SliderDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import java.time.format.TextStyle

class MaterialSliderBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Slider can be used to increase/decrease brightness or volume or anything
        // else that is having a range of values.
        // onValueChange is used to identify if there is some change in the Slider.

        setContent {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                SimpleSlider()
                ColorSlider()
                StepSlider()
            }
        }
    }
}

@Composable
fun SimpleSlider() {
    var sliderValue by remember {
        mutableStateOf(0.4f)
    }

    Slider(value = sliderValue, onValueChange = { newValue ->
        sliderValue = newValue
    })
    Text(
        text = "Slider value is: $sliderValue", modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Composable
fun ColorSlider() {
    var colorSliderValue by remember {
        mutableStateOf(0.2f)
    }

    Slider(
        value = colorSliderValue,
        onValueChange = { newSliderValue ->
            colorSliderValue = newSliderValue
        },
        modifier = Modifier.padding(16.dp),
        colors = SliderDefaults.colors(
            activeTrackColor = Color.Black,
            disabledActiveTrackColor = Color.Gray,
            thumbColor = Color.Red
        )
    )
    Text(
        text = "Slider value is: $colorSliderValue", modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )
}

@Composable
fun StepSlider() {
    var stepSliderValue by remember {
        mutableStateOf(0.1f)
    }

    Slider(
        value = stepSliderValue, onValueChange = { value ->
            stepSliderValue = value
        },
        modifier = Modifier.padding(16.dp),
        colors = SliderDefaults.colors(
            activeTrackColor = Color.Green,
            disabledActiveTrackColor = Color.Gray,
            thumbColor = Color.Black
        ),
        steps = 5,
        valueRange = 0f..0.5f,
        onValueChangeFinished = {
            // launch some business logics
        }
    )
    Text(
        text = "Slider value is: $stepSliderValue", modifier = Modifier.fillMaxWidth(),
        textAlign = TextAlign.Center
    )

}