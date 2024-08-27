package com.urbanmoon.quotesapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.urbanmoon.quotesapp.Models.Quotes

@Composable
fun QuoteListScreen(data: Array<Quotes>, onClick: (quote:Quotes) -> Unit) {
    Column {
        Text(
            text = "Quotes Application",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp, 4.dp)
                .fillMaxWidth(),
            fontFamily = FontFamily.Serif,
            style = MaterialTheme.typography.headlineMedium,
        )
        QuoteList(data = data, onClick)
    }
}
