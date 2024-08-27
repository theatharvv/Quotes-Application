package com.urbanmoon.quotesapp.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.urbanmoon.quotesapp.Models.Quotes

@Composable
fun QuoteList(data: Array<Quotes>, onClick: (quote:Quotes) -> Unit) {
    // A LazyColumn to efficiently display a list of items that can be scrolled vertically
    LazyColumn(content = {
        // Iterate over the array of quotes using the items function
        items(data) { quote ->
            // Call the QuoteItem Composable for each quote in the list
            QuoteItem(quotes = quote, onClick) // When the QuoteItem is clicked, invoke the onClick function passed as a parameter

        }
    })
}