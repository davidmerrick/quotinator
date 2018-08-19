package com.merricklabs

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.RequestHandler
import com.google.common.net.HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN
import com.google.common.net.HttpHeaders.CONTENT_TYPE
import com.merricklabs.ApiGatewayResponse.Companion.build
import com.merricklabs.logic.QuoteFetcher
import org.apache.logging.log4j.LogManager

class RandomQuoteHandler : RequestHandler<Map<String, Any>, ApiGatewayResponse> {
    override fun handleRequest(input: Map<String, Any>, context: Context): ApiGatewayResponse {
        LOG.info("received: " + input.keys.toString())

        val quoteFetcher = QuoteFetcher()
        return build {
            statusCode = 200
            objectBody = quoteFetcher.fetchQuote()
            headers = mapOf(
                    CONTENT_TYPE to "application/json",
                    ACCESS_CONTROL_ALLOW_ORIGIN to "*")
        }
    }

    companion object {
        private val LOG = LogManager.getLogger(RandomQuoteHandler::class.java)
    }
}
