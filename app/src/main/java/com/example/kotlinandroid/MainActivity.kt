package com.example.kotlinandroid
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row () {
                Text(text = "Rezaul Karim", fontSize = 40.sp)
                Text(text = "Rezaul Karim", fontSize = 40.sp)
            }

        }
    }
}