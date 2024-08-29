package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsClientIdAccountsResponse(

    @SerializedName("loanAccounts")
    val loanAccounts: Set<GetClientsLoanAccounts>? = null,

    @SerializedName("savingsAccounts")
    val savingsAccounts: Set<GetClientsSavingsAccounts>? = null

)