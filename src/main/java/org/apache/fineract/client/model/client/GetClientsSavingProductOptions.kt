package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsSavingProductOptions(

    @SerializedName("allowOverdraft")
    val allowOverdraft: Boolean? = null,

    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("withdrawalFeeForTransfers")
    val withdrawalFeeForTransfers: Boolean? = null

)