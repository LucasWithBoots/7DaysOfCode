package classModel


import com.google.gson.annotations.SerializedName

data class Show(
    @SerializedName("cast")
    val cast: List<String>,
    @SerializedName("creators")
    val creators: List<String>,
    @SerializedName("directors")
    val directors: List<String>,
    @SerializedName("episodeCount")
    val episodeCount: Int,
    @SerializedName("firstAirYear")
    val firstAirYear: Int,
    @SerializedName("genres")
    val genres: List<Genre>,
    @SerializedName("id")
    val id: String,
    @SerializedName("imageSet")
    val imageSet: ImageSet,
    @SerializedName("imdbId")
    val imdbId: String,
    @SerializedName("itemType")
    val itemType: String,
    @SerializedName("lastAirYear")
    val lastAirYear: Int,
    @SerializedName("originalTitle")
    val originalTitle: String,
    @SerializedName("overview")
    val overview: String,
    @SerializedName("rating")
    val rating: Int,
    @SerializedName("releaseYear")
    val releaseYear: Int,
    @SerializedName("seasonCount")
    val seasonCount: Int,
    @SerializedName("showType")
    val showType: String,
    @SerializedName("streamingOptions")
    val streamingOptions: StreamingOptions,
    @SerializedName("title")
    val title: String,
    @SerializedName("tmdbId")
    val tmdbId: String
)