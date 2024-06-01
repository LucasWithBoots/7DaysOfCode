package classModel


import com.google.gson.annotations.SerializedName

data class VerticalPoster(
    @SerializedName("w240")
    val w240: String,
    @SerializedName("w360")
    var w360: String,
    @SerializedName("w480")
    val w480: String,
    @SerializedName("w600")
    val w600: String,
    @SerializedName("w720")
    val w720: String
)