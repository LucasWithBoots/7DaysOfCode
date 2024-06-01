package classModel


import com.google.gson.annotations.SerializedName

data class ImageSet(
    @SerializedName("horizontalBackdrop")
    val horizontalBackdrop: HorizontalBackdrop,
    @SerializedName("horizontalPoster")
    val horizontalPoster: HorizontalPoster,
    @SerializedName("verticalBackdrop")
    val verticalBackdrop: VerticalBackdrop,
    @SerializedName("verticalPoster")
    val verticalPoster: VerticalPoster
)