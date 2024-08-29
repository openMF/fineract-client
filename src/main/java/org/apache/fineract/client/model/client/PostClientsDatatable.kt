package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class PostClientsDatatable(

    @SerializedName("data")
    val `data`: Map<String, Any>? = null,

    @SerializedName("registeredTableName")
    val registeredTableName: String? = null

) 