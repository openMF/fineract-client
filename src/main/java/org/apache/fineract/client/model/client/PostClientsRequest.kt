package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class PostClientsRequest(

    @SerializedName("activationDate")
    val activationDate: String? = null,

    @SerializedName("active")
    val active: Boolean? = null,

    @SerializedName("address")
    val address: List<PostClientsAddressRequest>? = null,

    @SerializedName("datatables")
    val datatables: List<PostClientsDatatable>? = null,

    @SerializedName("dateFormat")
    val dateFormat: String? = null,

    @SerializedName("dateOfBirth")
    val dateOfBirth: java.time.LocalDate? = null,

    @SerializedName("emailAddress")
    val emailAddress: String? = null,

    @SerializedName("externalId")
    val externalId: String? = null,

    @SerializedName("firstname")
    val firstname: String? = null,

    @SerializedName("fullname")
    val fullname: String? = null,

    @SerializedName("groupId")
    val groupId: Long? = null,

    @SerializedName("lastname")
    val lastname: String? = null,

    @SerializedName("legalFormId")
    val legalFormId: Long? = null,

    @SerializedName("locale")
    val locale: String? = null,

    @SerializedName("middlename")
    val middlename: String? = null,

    @SerializedName("mobileNo")
    val mobileNo: String? = null,

    @SerializedName("officeId")
    val officeId: Long? = null

)