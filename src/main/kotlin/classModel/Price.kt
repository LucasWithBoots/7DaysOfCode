package classModel


import com.google.gson.annotations.SerializedName

data class Price(
    @SerializedName("amount")
    val amount: String,
    @SerializedName("currency")
    val currency: String,
    @SerializedName("formatted")
    val formatted: String
)