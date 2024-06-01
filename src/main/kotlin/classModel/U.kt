package classModel


import com.google.gson.annotations.SerializedName

data class U(
    @SerializedName("addon")
    val addon: Addon,
    @SerializedName("audios")
    val audios: List<Audio>,
    @SerializedName("availableSince")
    val availableSince: Int,
    @SerializedName("expiresOn")
    val expiresOn: Long,
    @SerializedName("expiresSoon")
    val expiresSoon: Boolean,
    @SerializedName("link")
    val link: String,
    @SerializedName("price")
    val price: Price,
    @SerializedName("quality")
    val quality: String,
    @SerializedName("service")
    val service: Service,
    @SerializedName("subtitles")
    val subtitles: List<Subtitle>,
    @SerializedName("type")
    val type: String,
    @SerializedName("videoLink")
    val videoLink: String
)