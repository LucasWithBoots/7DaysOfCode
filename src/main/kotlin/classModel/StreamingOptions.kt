package classModel


import com.google.gson.annotations.SerializedName

data class StreamingOptions(
    @SerializedName("us")
    val us: List<U>
)