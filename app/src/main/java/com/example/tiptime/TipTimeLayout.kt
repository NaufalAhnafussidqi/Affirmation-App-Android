package com.example.tiptime

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TipTimeLayout() {

    val daftarQuotes = listOf(
        "Keep going",
        "Never give up",
        "Believe in yourself",
        "Stay positive",
        "Success takes time",
        "Learn every day",
        "Be confident",
        "Dream big"
    )

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        items(daftarQuotes) { quote ->

            Card(
                modifier = Modifier.fillMaxWidth()
            ) {

                Text(
                    text = quote,
                    modifier = Modifier.padding(20.dp)
                )
            }
        }
    }
}
