package org.openapitools.client.apis

import okhttp3.MultipartBody
import org.openapitools.client.models.DeleteEntityTypeEntityIdDocumentsResponse
import org.openapitools.client.models.GetEntityTypeEntityIdDocumentsResponse
import org.openapitools.client.models.PostEntityTypeEntityIdDocumentsResponse
import org.openapitools.client.models.PutEntityTypeEntityIdDocumentsResponse
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path

interface DocumentsApi {
    /**
     * Create a Document
     * Note: A document is created using a Multi-part form upload   Body Parts  name :  Name or summary of the document  description :  Description of the document  file :  The file to be uploaded  Mandatory Fields :  file and description
     * Responses:
     *  - 200: Not Shown (multi-part form data)
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param contentLength Content-Length (optional)
     * @param dateFormat  (optional)
     * @param description  (optional)
     * @param locale  (optional)
     * @param name  (optional)
     * @param uploadedInputStream  (optional)
     * @return [PostEntityTypeEntityIdDocumentsResponse]
     */
    @Multipart
    @POST("v1/{entityType}/{entityId}/documents")
    suspend fun createDocument(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Header("Content-Length") contentLength: Long? = null,
        @Part("dateFormat") dateFormat: String? = null,
        @Part("description") description: String? = null,
        @Part("locale") locale: String? = null,
        @Part("name") name: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): PostEntityTypeEntityIdDocumentsResponse

    /**
     * Remove a Document
     *
     * Responses:
     *  - 200: OK
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param documentId documentId
     * @return [DeleteEntityTypeEntityIdDocumentsResponse]
     */
    @DELETE("v1/{entityType}/{entityId}/documents/{documentId}")
    suspend fun deleteDocument(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("documentId") documentId: Long
    ): DeleteEntityTypeEntityIdDocumentsResponse

    /**
     * Retrieve Binary File associated with Document
     * Request used to download the file associated with the document  Example Requests:  clients/1/documents/1/attachment   loans/1/documents/1/attachment
     * Responses:
     *  - 200: Not Shown: The corresponding Binary file
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param documentId documentId
     * @return [Unit]
     */
    @GET("v1/{entityType}/{entityId}/documents/{documentId}/attachment")
    suspend fun downloadFile(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("documentId") documentId: Long
    ): Unit

    /**
     * Retrieve a Document
     * Example Requests:  clients/1/documents/1   loans/1/documents/1   client_identifiers/1/documents/1?fields&#x3D;name,description
     * Responses:
     *  - 200: OK
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param documentId documentId
     * @return [GetEntityTypeEntityIdDocumentsResponse]
     */
    @GET("v1/{entityType}/{entityId}/documents/{documentId}")
    suspend fun getDocument(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("documentId") documentId: Long
    ): GetEntityTypeEntityIdDocumentsResponse

    /**
     * List documents
     * Example Requests:  clients/1/documents  client_identifiers/1/documents  loans/1/documents?fields&#x3D;name,description
     * Responses:
     *  - 200: OK
     *
     * @param entityType entityType
     * @param entityId entityId
     * @return [kotlin.collections.List<GetEntityTypeEntityIdDocumentsResponse]
     */
    @GET("v1/{entityType}/{entityId}/documents")
    suspend fun retrieveAllDocuments(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long
    ): List<GetEntityTypeEntityIdDocumentsResponse>

    /**
     * Update a Document
     * Note: A document is updated using a Multi-part form upload  Body Parts name Name or summary of the document description Description of the document file The file to be uploaded
     * Responses:
     *  - 200: Not Shown (multi-part form data)
     *
     * @param entityType entityType
     * @param entityId entityId
     * @param documentId documentId
     * @param contentLength Content-Length (optional)
     * @param dateFormat  (optional)
     * @param description  (optional)
     * @param locale  (optional)
     * @param name  (optional)
     * @param uploadedInputStream  (optional)
     * @return [PutEntityTypeEntityIdDocumentsResponse]
     */
    @Multipart
    @PUT("v1/{entityType}/{entityId}/documents/{documentId}")
    suspend fun updateDocument(
        @Path("entityType") entityType: String,
        @Path("entityId") entityId: Long,
        @Path("documentId") documentId: Long,
        @Header("Content-Length") contentLength: Long? = null,
        @Part("dateFormat") dateFormat: String? = null,
        @Part("description") description: String? = null,
        @Part("locale") locale: String? = null,
        @Part("name") name: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): PutEntityTypeEntityIdDocumentsResponse

}
