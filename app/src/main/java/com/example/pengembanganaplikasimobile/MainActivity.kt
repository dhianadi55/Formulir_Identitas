package com.example.pengembanganaplikasimobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.pengembanganaplikasimobile.ui.theme.PengembanganAplikasiMobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PengembanganAplikasiMobileTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Form()
                }
            }
        }
    }
}

@Composable
fun Form() {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = "Formulir Identitas",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Nama") },
            modifier = Modifier.padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Usia") },
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Radio buttons for gender selection can be added here

        // NumberPicker for height and weight can be added here

        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Tempat Lahir") },
            modifier = Modifier.padding(bottom = 16.dp)
        )

        OutlinedTextField(
            value = "",
            onValueChange = { /*TODO*/ },
            label = { Text("Tanggal Lahir") },
            modifier = Modifier.padding(bottom = 16.dp)
        )

        // Spinners for blood type, religion, marital status, and nationality can be added here

        Button(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Submit")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FormPreview() {
    PengembanganAplikasiMobileTheme {
        Form()
    }
}