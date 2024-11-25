package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.ApplicationTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class BirthdayApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplicationTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    HappyBirthday(
                        name = "Android",
                        modifier = Modifier.padding(8.dp),
                        from = "Me"
                    )
                }
            }
        }
    }
}

@Composable
fun HappyBirthday(name: String, modifier: Modifier = Modifier, from: String) {
    Column (
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "Happy birthday $name!",
            modifier = Modifier.padding(20.dp).align(alignment = Alignment.End),
            color = Color.Black,
            fontSize = 90.sp,
            lineHeight = 90.sp,
        )
        Text(
            text = "From $from",
            modifier = Modifier.padding(20.dp),
            color = Color.Blue,
            fontSize = 25.sp,
        )
    }
}

@Preview(showBackground = true, showSystemUi = true, name = "Happy birthday preview")
@Composable
fun HappyBirthdayPreview() {
    ApplicationTheme {
        HappyBirthday(name = "Hamza", from = "Me")
    }
}