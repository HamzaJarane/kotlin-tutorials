package com.example.tutorial61

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tutorial61.ui.theme.Tutorial61Theme
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import java.time.LocalTime
import java.time.format.DateTimeFormatter

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Tutorial61Theme {
                UserProfile()
            }
        }
    }
}

@Composable
fun UserProfile(userId: String) {
    var userDetails by remember { mutableStateOf("Loading...") }

    LaunchedEffect(userId) {
        userDetails = fetchUserDetails(userId) // Simule une récupération de données
    }

    Text(text = userDetails)
}

suspend fun fetchUserDetails(userId: String): String {
    delay(2000) // Simule un délai de récupération
    return "Details for user: $userId"
}

//@Composable
//fun AsyncDataLoader(modifier: Modifier = Modifier)  {
//    var data by remember { mutableStateOf("Loading...") }
//
//    LaunchedEffect(Unit) {
//        data = fetchData()
//    }
//
//    Text(
//        text = data,
//        style = MaterialTheme.typography.headlineSmall
//    )
//}
//
//@SuppressLint("NewApi")
//suspend fun fetchData(): String {
//    delay(5000)
//    val currentTime = LocalTime.now()
//    val formatter = DateTimeFormatter.ofPattern("HH:mm:ss")
//    return "Date et heure actuelles : ${currentTime.format(formatter)}"
//}
//
//
//@Preview(showBackground = true)
//@Composable
//fun AsyncDataLoaderPreview() {
//    Tutorial61Theme {
//        AsyncDataLoader()
//    }
//}

