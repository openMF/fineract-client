package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class PostClientsClientIdResponse(

    @SerializedName("clientId")
    val clientId: Long? = null,

    @SerializedName("officeId")
    val officeId: Long? = null,

    @SerializedName("resourceExternalId")
    val resourceExternalId: String? = null,

    @SerializedName("resourceId")
    val resourceId: Long? = null

)
