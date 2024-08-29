package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsDataTables(

    @SerializedName("applicationTableName")
    val applicationTableName: String? = null,

    @SerializedName("columnHeaderData")
    val columnHeaderData: Set<GetClientsColumnHeaderData>? = null,

    @SerializedName("registeredTableName")
    val registeredTableName: String? = null

)