package com.merricklabs

import com.merricklabs.logic.QuoteFetcher
import org.testng.Assert.assertNotNull
import org.testng.annotations.Test

class QuoteFetcherTest {

    @Test
    fun fetchQuote(){
        var fetcher = QuoteFetcher()
        val myQuote = fetcher.fetchQuote()
        assertNotNull(myQuote)
    }
}