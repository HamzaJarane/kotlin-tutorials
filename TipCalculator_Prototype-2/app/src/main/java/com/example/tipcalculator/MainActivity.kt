package com.example.tipcalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tipcalculator.ui.theme.TipCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TipCalculatorApp()
        }
    }
}

@Composable
fun TipCalculatorApp() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        var amountInput by remember { mutableStateOf("") }
        TextField(
            value = amountInput,
            onValueChange = { amountInput = it },
            label = { Text("Montant de l'addition") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = Modifier.fillMaxWidth()
        )

        var tipPercentage by remember { mutableStateOf(15f) }
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text("Pourcentage : ${tipPercentage.toInt()}%")
            Slider(
                value = tipPercentage,
                onValueChange = { tipPercentage = it },
                valueRange = 0f..30f,
                modifier = Modifier.fillMaxWidth()
            )
        }

        val amount = amountInput.toFloatOrNull() ?: 0f
        val tipAmount = (amount * tipPercentage / 100)
        val totalAmount = amount + tipAmount

        Text("Pourboire : %.2f MAD".format(tipAmount))
        Text("Total : %.2f MAD".format(totalAmount))
    }
}

@Preview(showSystemUi = true)
@Composable
fun TipCalculatorAppPreview() {
    TipCalculatorApp()
}
