package com.urbanmoon.quotesapp

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.google.gson.Gson
import com.urbanmoon.quotesapp.Models.Quotes

object DataManager {

    var data = emptyArray<Quotes>()
    var currentQuote: Quotes? = null

    var currentPage = mutableStateOf(Pages.LISTING)
    var isDataLoaded = mutableStateOf(false)

    fun loadAssetsFromFile(context: Context) { // Function to load JSON data from the assets folder
        val inputStream = context.assets.open("quotes.json") // Open the "quotes.json" file from the assets folder
        val size: Int = inputStream.available() // Get the size of the file in bytes
        val buffer = ByteArray(size) // Create a byte array to hold the file's contents
        inputStream.read(buffer) // Read the file's contents into the byte array
        inputStream.close() // Close the input stream

        val json = String(buffer, Charsets.UTF_8) // Convert the byte array to a UTF-8 encoded string
        val gson = Gson() // Create a new Gson instance
        data = gson.fromJson(json, Array<Quotes>::class.java) // Parse the JSON string into an array of Quotes objects
        isDataLoaded.value = true
    }

    fun switchPages(quote:Quotes?){
        if(currentPage.value == Pages.LISTING){
            currentQuote = quote
            currentPage.value = Pages.DETAIL
        }
        else{
            currentPage.value = Pages.LISTING
        }

    }
}