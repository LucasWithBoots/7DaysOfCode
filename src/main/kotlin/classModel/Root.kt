package classModel


import com.google.gson.annotations.SerializedName

data class Root(
    @SerializedName("hasMore")
    val hasMore: Boolean,
    @SerializedName("nextCursor")
    val nextCursor: String,
    @SerializedName("shows")
    val shows: List<Show>
)