package classModel


import com.google.gson.annotations.SerializedName

data class Subtitle(
    @SerializedName("closedCaptions")
    val closedCaptions: Boolean,
    @SerializedName("locale")
    val locale: Locale
)