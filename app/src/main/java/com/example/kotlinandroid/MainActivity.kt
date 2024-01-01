package com.example.kotlinandroid

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Display()
        }
    }
}


@Preview(showBackground = true, name = "hello", showSystemUi = true)
@Composable
fun Display() {
    TextInput()
}


@Composable
fun TextInput() {
    val state = remember { mutableStateOf("") }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
            Log.i("text_input", it)
        },
        label = { Text(text = "Enter Message") },
        placeholder = { Text(text = "Name") }
    )
}


@Composable
fun ButtonCom() {
    Button(
        onClick = { }, colors = ButtonDefaults.buttonColors(
            contentColor = Color.Blue,
            containerColor = Color.Black
        ),
        enabled = true // disable/enabled

    ) {
        Text(text = "Hello");
        Image(painter = painterResource(id = R.drawable.image), contentDescription = "dumy")
    }
}


@Composable
fun ImageCom() {
    Image(
        painter = painterResource(id = R.drawable.image),
        contentDescription = "my-image",
        // colorFilter = ColorFilter.tint(Color.Blue)
        contentScale = ContentScale.FillWidth
    )
}


// format shortcut key alt+ctrl+l
@Composable
fun TextCom(name: String = "Rejaul") {
    Text(
        text = "Hello $name",
        textAlign = TextAlign.Center,
        color = Color.Red,
        fontStyle = FontStyle.Italic,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,

        );
}



