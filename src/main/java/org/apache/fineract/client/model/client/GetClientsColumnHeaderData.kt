package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class GetClientsColumnHeaderData(

    @SerializedName("columnDisplayType")
    val columnDisplayType: String? = null,

    @SerializedName("columnLength")
    val columnLength: Int? = null,

    @SerializedName("columnName")
    val columnName: String? = null,

    @SerializedName("columnType")
    val columnType: String? = null,

    @SerializedName("columnValues")
    val columnValues: List<String>? = null,

    @SerializedName("isColumnNullable")
    val isColumnNullable: Boolean? = null,

    @SerializedName("isColumnPrimaryKey")
    val isColumnPrimaryKey: Boolean? = null

) 