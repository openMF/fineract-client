package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsSavingsAccountsDepositType(

    @SerializedName("code")
    val code: String? = null,

    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("value")
    val value: String? = null
)