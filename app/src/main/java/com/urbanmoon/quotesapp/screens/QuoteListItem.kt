package com.urbanmoon.quotesapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.urbanmoon.quotesapp.Models.Quotes
import com.urbanmoon.quotesapp.R

//@Preview(showSystemUi = true)
@Composable
fun QuoteItem(quotes: Quotes, onClick: (quote:Quotes) -> Unit ) {
    Card(
        elevation = CardDefaults.elevatedCardElevation(4.dp),
        modifier = Modifier.padding(8.dp)
            .clickable { onClick(quotes) },
        colors = CardDefaults.cardColors(Color.White)
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.quotes),
                "Quotes Symbol",
                alignment = Alignment.TopStart,
                modifier = Modifier.size(40.dp),
            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = quotes.quote,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(0.dp, 0.dp, 0.dp, 8.dp),
                    fontFamily = FontFamily.Serif
                )
                Box(
                    modifier = Modifier
                        .background(Color(0xFFEEEEEE))
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                )
                Text(
                    text = quotes.author,
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 4.dp),
                    fontWeight = FontWeight.Light
                )
            }
        }


    }
}





