package classModel


import com.google.gson.annotations.SerializedName

data class Audio(
    @SerializedName("language")
    val language: String,
    @SerializedName("region")
    val region: String
)