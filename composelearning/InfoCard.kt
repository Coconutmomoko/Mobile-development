package com.example.composelearning

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun InfoCard(title: String, description: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0F4F8))
    ) {
        Column(modifier = Modifier.padding(8.dp)) {
            Text(text = title, color = Color.Black)
            Text(text = description, color = Color.Gray)
        }
    }
}
