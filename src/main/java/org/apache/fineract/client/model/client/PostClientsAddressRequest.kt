package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class PostClientsAddressRequest(

    @SerializedName("addressLine1")
    val addressLine1: String? = null,

    @SerializedName("addressLine2")
    val addressLine2: String? = null,

    @SerializedName("addressLine3")
    val addressLine3: String? = null,

    @SerializedName("addressTypeId")
    val addressTypeId: Long? = null,

    @SerializedName("city")
    val city: String? = null,

    @SerializedName("countryId")
    val countryId: Long? = null,

    @SerializedName("isActive")
    val isActive: Boolean? = null,

    @SerializedName("postalCode")
    val postalCode: Long? = null,

    @SerializedName("stateProvinceId")
    val stateProvinceId: Long? = null,

    @SerializedName("street")
    val street: String? = null
)