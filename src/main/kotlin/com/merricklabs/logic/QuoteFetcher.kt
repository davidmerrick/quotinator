package com.merricklabs.logic

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import com.merricklabs.models.Quote
import java.util.List
import java.util.Random

class QuoteFetcher {

    val JSON_FILE = "quotes.json"

    fun fetchQuote() : Quote {
        val quotes = parseJson()

        val randomIndex = Random().nextInt(quotes.size)
        return quotes[randomIndex]
    }

    private fun parseJson() : List<Quote> {
        val jsonText = QuoteFetcher::class.java.getResource(JSON_FILE).readText()
        val mapper = jacksonObjectMapper()
        return mapper.readValue<List<Quote>>(jsonText)
    }
}