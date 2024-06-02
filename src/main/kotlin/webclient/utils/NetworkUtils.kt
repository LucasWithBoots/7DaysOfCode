package webclient.utils

import okhttp3.OkHttpClient
import okhttp3.Request

class NetworkUtils {

    companion object {
        fun getOkHttpInstance(linkUrl: String): String? {
            val client = OkHttpClient()

            val request = Request.Builder()
                .url(linkUrl)
                .build()

            val response = client.newCall(request).execute()

            return response.body?.string()
        }

        fun getOkHttpStatus(linkUrl: String): Int {
            val client = OkHttpClient()

            val request = Request.Builder()
                .url(linkUrl)
                .build()

            val response = client.newCall(request).execute()

            return response.code
        }
    }

}