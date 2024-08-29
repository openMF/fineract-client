package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsSavingsAccountsCurrency(

    @SerializedName("code")
    val code: String? = null,

    @SerializedName("decimalPlaces")
    val decimalPlaces: Int? = null,

    @SerializedName("displayLabel")
    val displayLabel: String? = null,

    @SerializedName("displaySymbol")
    val displaySymbol: String? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("nameCode")
    val nameCode: String? = null

)