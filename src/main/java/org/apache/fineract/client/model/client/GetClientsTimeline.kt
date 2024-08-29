package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsTimeline(

    @SerializedName("activatedByFirstname")
    val activatedByFirstname: String? = null,

    @SerializedName("activatedByLastname")
    val activatedByLastname: String? = null,

    @SerializedName("activatedByUsername")
    val activatedByUsername: String? = null,

    @SerializedName("activatedOnDate")
    val activatedOnDate: java.time.LocalDate? = null,

    @SerializedName("submittedByFirstname")
    val submittedByFirstname: String? = null,

    @SerializedName("submittedByLastname")
    val submittedByLastname: String? = null,

    @SerializedName("submittedByUsername")
    val submittedByUsername: String? = null,

    @SerializedName("submittedOnDate")
    val submittedOnDate: java.time.LocalDate? = null

)