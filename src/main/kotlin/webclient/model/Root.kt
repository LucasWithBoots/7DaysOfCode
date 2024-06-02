package webclient.model


import com.google.gson.annotations.SerializedName

data class Root(
    @SerializedName("date")
    val date: String,
    @SerializedName("movies")
    val movies: List<Movy>
)