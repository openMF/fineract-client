package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsOfficeOptions(

    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("nameDecorated")
    val nameDecorated: String? = null

)