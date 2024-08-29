package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsLoanAccountsStatus(

    @SerializedName("active")
    val active: Boolean? = null,

    @SerializedName("closed")
    val closed: Boolean? = null,

    @SerializedName("closedObligationsMet")
    val closedObligationsMet: Boolean? = null,

    @SerializedName("closedRescheduled")
    val closedRescheduled: Boolean? = null,

    @SerializedName("closedWrittenOff")
    val closedWrittenOff: Boolean? = null,

    @SerializedName("code")
    val code: String? = null,

    @SerializedName("description")
    val description: String? = null,

    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("overpaid")
    val overpaid: Boolean? = null,

    @SerializedName("pendingApproval")
    val pendingApproval: Boolean? = null,

    @SerializedName("waitingForDisbursal")
    val waitingForDisbursal: Boolean? = null

)