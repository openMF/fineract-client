package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsLoanAccounts(

    @SerializedName("accountNo")
    val accountNo: String? = null,

    @SerializedName("externalId")
    val externalId: String? = null,

    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("loanCycle")
    val loanCycle: Int? = null,

    @SerializedName("loanType")
    val loanType: GetClientsLoanAccountsType? = null,

    @SerializedName("productId")
    val productId: Long? = null,

    @SerializedName("productName")
    val productName: String? = null,

    @SerializedName("status")
    val status: GetClientsLoanAccountsStatus? = null
)