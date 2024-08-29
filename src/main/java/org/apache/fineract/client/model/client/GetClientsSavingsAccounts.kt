package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsSavingsAccounts(

    @SerializedName("accountNo")
    val accountNo: String? = null,

    @SerializedName("currency")
    val currency: GetClientsSavingsAccountsCurrency? = null,

    @SerializedName("depositType")
    val depositType: GetClientsSavingsAccountsDepositType? = null,

    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("productId")
    val productId: Long? = null,

    @SerializedName("productName")
    val productName: String? = null,

    @SerializedName("shortProductName")
    val shortProductName: String? = null,

    @SerializedName("status")
    val status: GetClientsSavingsAccountsStatus? = null

) 