package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ImagesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplicationTheme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    ImageContainer(
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
fun ImageContainer(name: String, modifier: Modifier = Modifier, from: String) {
    val image = painterResource(R.drawable.androidparty)
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
        )
        HappyBirthdayContainer(name, modifier, from)
    }
}

@Composable
fun HappyBirthdayContainer(name: String, modifier: Modifier = Modifier, from: String) {
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
fun ImagePreview() {
    ApplicationTheme {
        ImageContainer(name = "Hamza", from = "Me")
    }
}