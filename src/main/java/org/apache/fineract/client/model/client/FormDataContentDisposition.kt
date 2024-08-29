package org.apache.fineract.client.model.client

import com.google.gson.annotations.SerializedName

data class FormDataContentDisposition(

    @SerializedName("creationDate")
    val creationDate: java.time.OffsetDateTime? = null,

    @SerializedName("fileName")
    val fileName: String? = null,

    @SerializedName("modificationDate")
    val modificationDate: java.time.OffsetDateTime? = null,

    @SerializedName("name")
    val name: String? = null,

    @SerializedName("parameters")
    val parameters: Map<String, String>? = null,

    @SerializedName("readDate")
    val readDate: java.time.OffsetDateTime? = null,

    @SerializedName("size")
    val propertySize: Long? = null,

    @SerializedName("type")
    val type: String? = null

)