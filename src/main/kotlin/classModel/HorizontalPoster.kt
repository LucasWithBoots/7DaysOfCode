package classModel


import com.google.gson.annotations.SerializedName

data class HorizontalPoster(
    @SerializedName("w1080")
    val w1080: String,
    @SerializedName("w1440")
    val w1440: String,
    @SerializedName("w360")
    val w360: String,
    @SerializedName("w480")
    val w480: String,
    @SerializedName("w720")
    val w720: String
)