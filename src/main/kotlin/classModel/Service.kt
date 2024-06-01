package classModel


import com.google.gson.annotations.SerializedName

data class Service(
    @SerializedName("homePage")
    val homePage: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("imageSet")
    val imageSet: ImageSetX,
    @SerializedName("name")
    val name: String,
    @SerializedName("themeColorCode")
    val themeColorCode: String
)