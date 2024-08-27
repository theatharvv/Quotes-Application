package com.urbanmoon.quotesapp.screens

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.urbanmoon.quotesapp.DataManager
import com.urbanmoon.quotesapp.Models.Quotes
import com.urbanmoon.quotesapp.R

//@Preview
@Composable
fun QuoteDetails( quotes: Quotes) {

    BackHandler {
        DataManager.switchPages(null)
    }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize(1f)
            .background(
                Brush.sweepGradient(
                    colors = listOf(
                        Color.White,
                        Color.LightGray

                    )
                )
            )
    ) {
        Card(
            elevation = CardDefaults.cardElevation(4.dp),
            modifier = Modifier.padding(32.dp),
            colors = CardDefaults.cardColors(Color.White)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier
                    .padding(16.dp, 24.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.quotes),
                    contentDescription = "",
                    modifier = Modifier
                        .size(80.dp)
                )
                Text(
                    text = quotes.quote,
                    style = MaterialTheme.typography.headlineSmall,
                    modifier = Modifier.padding(top = 10.dp),
                    fontFamily = FontFamily.Serif
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Text(
                    text = quotes.author,
                    style = MaterialTheme.typography.labelLarge,
                    modifier = Modifier.padding(top = 4.dp),
                    fontWeight = FontWeight.Light
                )

            }

        }

    }
}