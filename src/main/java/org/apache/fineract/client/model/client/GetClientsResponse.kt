package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsResponse(

    @SerializedName("pageItems")
    val pageItems: Set<GetClientsPageItemsResponse>? = null,

    @SerializedName("totalFilteredRecords")
    val totalFilteredRecords: Int? = null
) 