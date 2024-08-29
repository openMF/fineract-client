package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsGroups(

    @SerializedName("accountNo")
    val accountNo: String? = null,

    @SerializedName("externalId")
    val externalId: Long? = null,

    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("name")
    val name: String? = null

) 