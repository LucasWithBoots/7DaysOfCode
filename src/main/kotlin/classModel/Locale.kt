package classModel


import com.google.gson.annotations.SerializedName

data class Locale(
    @SerializedName("language")
    val language: String,
    @SerializedName("region")
    val region: String
)