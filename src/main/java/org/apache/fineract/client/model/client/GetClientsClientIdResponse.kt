package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsClientIdResponse(

    @SerializedName("accountNo")
    val accountNo: String? = null,

    @SerializedName("activationDate")
    val activationDate: java.time.LocalDate? = null,

    @SerializedName("active")
    val active: Boolean? = null,

    @SerializedName("displayName")
    val displayName: String? = null,

    @SerializedName("emailAddress")
    val emailAddress: String? = null,

    @SerializedName("externalId")
    val externalId: String? = null,

    @SerializedName("firstname")
    val firstname: String? = null,

    @SerializedName("groups")
    val groups: List<GetClientsGroups>? = null,

    @SerializedName("id")
    val id: Long? = null,

    @SerializedName("lastname")
    val lastname: String? = null,

    @SerializedName("officeId")
    val officeId: Long? = null,

    @SerializedName("officeName")
    val officeName: String? = null,

    @SerializedName("savingsProductId")
    val savingsProductId: Long? = null,

    @SerializedName("savingsProductName")
    val savingsProductName: String? = null,

    @SerializedName("status")
    val status: GetClientsClientIdStatus? = null,

    @SerializedName("timeline")
    val timeline: GetClientsTimeline? = null

)