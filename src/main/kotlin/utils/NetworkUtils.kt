package utils

import okhttp3.OkHttpClient
import okhttp3.Request

class NetworkUtils {

    companion object {
        fun getOkHttpInstance(): String? {
            val client = OkHttpClient()

            val request = Request.Builder()
                .url("https://streaming-availability.p.rapidapi.com/shows/search/filters?country=us&series_granularity=show&order_direction=asc&order_by=original_title&genres_relation=and&output_language=en&show_type=movie")
                .get()
                .addHeader("x-rapidapi-key", "8e5cc7528dmsh50863be59227f73p12b10djsn377fd34f6e8b")
                .addHeader("x-rapidapi-host", "streaming-availability.p.rapidapi.com")
                .build()

            val response = client.newCall(request).execute()

            return response.body?.string()
        }
    }

}