package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsSavingsAccountsStatus(

    @SerializedName("active")
    val active: Boolean? = null,

    @SerializedName("approved")
    val approved: Boolean? = null,

    @SerializedName("closed")
    val closed: Boolean? = null,

    @SerializedName("code")
    val code: String? = null,

    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("matured")
    val matured: Boolean? = null,

    @SerializedName("prematureClosed")
    val prematureClosed: Boolean? = null,

    @SerializedName("rejected")
    val rejected: Boolean? = null,

    @SerializedName("submittedAndPendingApproval")
    val submittedAndPendingApproval: Boolean? = null,

    @SerializedName("transferInProgress")
    val transferInProgress: Boolean? = null,

    @SerializedName("transferOnHold")
    val transferOnHold: Boolean? = null,

    @SerializedName("value")
    val value: String? = null,

    @SerializedName("withdrawnByApplicant")
    val withdrawnByApplicant: Boolean? = null

)