package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsStaffOptions(

    @SerializedName("displayName")
    val displayName: String? = null,

    @SerializedName("firstname")
    val firstname: String? = null,

    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("isActive")
    val isActive: Boolean? = null,

    @SerializedName("isLoanOfficer")
    val isLoanOfficer: Boolean? = null,

    @SerializedName("lastname")
    val lastname: String? = null,

    @SerializedName("officeId")
    val officeId: Long? = null,

    @SerializedName("officeName")
    val officeName: String? = null

)