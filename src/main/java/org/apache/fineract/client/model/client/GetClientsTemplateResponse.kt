package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsTemplateResponse(

    @SerializedName("activationDate")
    val activationDate: java.time.LocalDate? = null,

    @SerializedName("datatables")
    val datatables: Set<GetClientsDataTables>? = null,

    @SerializedName("officeId")
    val officeId: Long? = null,

    @SerializedName("officeOptions")
    val officeOptions: Set<GetClientsOfficeOptions>? = null,

    @SerializedName("savingProductOptions")
    val savingProductOptions: Set<GetClientsSavingProductOptions>? = null,

    @SerializedName("staffOptions")
    val staffOptions: Set<GetClientsStaffOptions>? = null

)