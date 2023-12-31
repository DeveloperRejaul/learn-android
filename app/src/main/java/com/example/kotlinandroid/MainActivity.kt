package com.example.kotlinandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
        setContent {}
    }
}


@Preview(showBackground = true, name = "hello", showSystemUi = true)
@Composable
fun Display() {
    ImageCom()
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


@Composable
fun ImageCom () {
   Image(
       painter = painterResource(id = R.drawable.image) ,
       contentDescription = "my-image",
       // colorFilter = ColorFilter.tint(Color.Blue)
        contentScale = ContentScale.FillWidth
   )
}



