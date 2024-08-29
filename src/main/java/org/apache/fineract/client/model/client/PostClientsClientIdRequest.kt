package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class PostClientsClientIdRequest(

    @SerializedName("activationDate")
    val activationDate: String? = null,

    @SerializedName("dateFormat")
    val dateFormat: String? = null,

    @SerializedName("locale")
    val locale: String? = null

)