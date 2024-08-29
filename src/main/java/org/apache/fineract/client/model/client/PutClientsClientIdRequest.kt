package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class PutClientsClientIdRequest(

    @SerializedName("externalId")
    val externalId: String? = null,

    @SerializedName("resourceExternalId")
    val resourceExternalId: String? = null

)