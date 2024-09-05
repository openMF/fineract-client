package org.openapitools.client.apis

import retrofit2.http.GET
import retrofit2.http.Query


interface BulkImportApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param importDocumentId  (optional)
     * @return [Unit]
     */
    @GET("v1/imports/downloadOutputTemplate")
    suspend fun getOutputTemplate(@Query("importDocumentId") importDocumentId: String? = null): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entityType  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/imports")
    suspend fun retrieveImportDocuments(@Query("entityType") entityType: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param importDocumentId  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/imports/getOutputTemplateLocation")
    suspend fun retriveOutputTemplateLocation(@Query("importDocumentId") importDocumentId: String? = null): String

}
