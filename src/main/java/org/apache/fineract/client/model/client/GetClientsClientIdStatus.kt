package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsClientIdStatus(

    @SerializedName("code")
    val code: String? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("id")
    val id: Long? = null
)