package classModel


import com.google.gson.annotations.SerializedName

data class ImageSetX(
    @SerializedName("darkThemeImage")
    val darkThemeImage: String,
    @SerializedName("lightThemeImage")
    val lightThemeImage: String,
    @SerializedName("whiteImage")
    val whiteImage: String
)