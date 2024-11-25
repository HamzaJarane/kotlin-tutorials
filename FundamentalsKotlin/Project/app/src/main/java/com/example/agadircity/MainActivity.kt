package com.example.agadircity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.agadircity.ui.theme.AgadirCityTheme
import com.example.agadircity.ui.theme.mainColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AgadirCityTheme {
                App()
            }
        }
    }
}

data class Place(val name: String, val description: String, val phone: String, val location: String, val image: Painter)

@Composable
fun App() {
    val agadirOufla = Place(
        name = "Agadir Oufella",
        description = "Agadir Oufella is a historic hilltop fortress located in Agadir, Morocco. It was built in the 16th century and offers panoramic views of the city and coastline. The fortress was partially destroyed in the 1960 earthquake, but its ruins remain a popular tourist attraction for its historical significance and scenic vistas.",
        phone = "05282-80808",
        location = "Oufella, Agadir",
        image = painterResource(R.drawable.agadir)
    )

    val agadirCrocoparc = Place(
        name = "Crocoparc",
        description = "Park for crocodiles, snakes & other reptiles featuring exotic landscaped gardens & a restaurant.",
        phone = "05282-97931",
        location = "RN 8 PK 16, Agadir, Drarga 80046",
        image = painterResource(R.drawable.crocoparc_park)
    )

    val agadirTelepherique = Place(
        name = "Téléphérique",
        description = "La télécabine d'Agadir est un projet comprenant 2 lignes de télécabine touristique à Agadir au Maroc. Longue de 1 700 mètres, la première ligne a été mise en service le 16 juillet 2022 entre le pont de Tildi et Agadir Oufla.",
        phone = "0522-97931",
        location = "RN 8 PK 16, Agadir, Drarga 80046",
        image = painterResource(R.drawable.telepheri4
        )
    )

    val listOfPlaces = listOf(agadirOufla, agadirCrocoparc, agadirTelepherique)
    var currentIndex by remember { mutableStateOf(0) }
    val currentPlace = when (currentIndex) {
        0 -> listOfPlaces[0]
        1 -> listOfPlaces[1]
        2 -> listOfPlaces[2]
        else -> listOfPlaces[0]
    }

    val phoneIcon = painterResource(R.drawable.phone_24)
    val locationIcon = painterResource(R.drawable.location_on_24)
    val backgroundCaption  = painterResource(R.drawable.marina_sunset)

    Box {
        Image(
            painter = backgroundCaption,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize(),
            alpha = 0.6F
        )

        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Button(
                onClick = { currentIndex = (0..listOfPlaces.size).random() },
            ) {
                Text(text = "Other", fontSize = 24.sp)
            }

            Image(
                painter = currentPlace.image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(width = 300.dp, height = 300.dp)
                    .border(
                        width = 4.dp,
                        color = Color.Black,
                        shape = RoundedCornerShape(16.dp)
                    )
                ,
            )
            Text(
                text = currentPlace.name,
                modifier = Modifier.padding(20.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline,
                color = Color.Black,
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = currentPlace.description,
                    modifier = Modifier.padding(20.dp),
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                )
            }

            Column {
                Box {
                    Image(
                        painter = phoneIcon,
                        contentDescription = null
                    )

                    Text(
                        text = currentPlace.phone,
                        modifier = Modifier.padding(horizontal = 25.dp),
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                }

                Box {
                    Image(
                        painter = locationIcon,
                        contentDescription = null
                    )

                    Text(
                        text = currentPlace.location,
                        modifier = Modifier.padding(horizontal = 25.dp),
                        color = Color.Black,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    AgadirCityTheme {
        App()
    }
}
