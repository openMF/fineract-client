package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsPageItemsResponse(

    @SerializedName("accountNo")
    val accountNo: String? = null,

    @SerializedName("active")
    val active: Boolean? = null,

    @SerializedName("displayName")
    val displayName: String? = null,

    @SerializedName("emailAddress")
    val emailAddress: String? = null,

    @SerializedName("fullname")
    val fullname: String? = null,

    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("officeId")
    val officeId: Long? = null,

    @SerializedName("officeName")
    val officeName: String? = null,

    @SerializedName("status")
    val status: GetClientStatus? = null

)