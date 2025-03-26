package org.openapitools.client.apis

import org.openapitools.client.models.DeleteTemplatesTemplateIdResponse
import org.openapitools.client.models.GetTemplatesResponse
import org.openapitools.client.models.GetTemplatesTemplateIdResponse
import org.openapitools.client.models.GetTemplatesTemplateResponse
import org.openapitools.client.models.PostTemplatesRequest
import org.openapitools.client.models.PostTemplatesResponse
import org.openapitools.client.models.PutTemplatesTemplateIdRequest
import org.openapitools.client.models.PutTemplatesTemplateIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface UserGeneratedDocumentsApi {
    /**
     * Add a UGD
     * Adds a new UGD.  Mandatory Fields name    Example Requests:  templates/1
     * Responses:
     *  - 200: OK
     *
     * @param postTemplatesRequest
     * @return [PostTemplatesResponse]
     */
    @POST("v1/templates")
    suspend fun createTemplate(@Body postTemplatesRequest: PostTemplatesRequest): PostTemplatesResponse

    /**
     * Delete a UGD
     *
     * Responses:
     *  - 200: OK
     *
     * @param templateId templateId
     * @return [DeleteTemplatesTemplateIdResponse]
     */
    @DELETE("v1/templates/{templateId}")
    suspend fun deleteTemplate(@Path("templateId") templateId: Long): DeleteTemplatesTemplateIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param templateId
     * @return [kotlin.String]
     */
    @GET("v1/templates/{templateId}/template")
    suspend fun getTemplateByTemplate(@Path("templateId") templateId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param templateId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/templates/{templateId}")
    suspend fun mergeTemplate(
        @Path("templateId") templateId: Long,
        @Body body: String? = null
    ): String

    /**
     * Retrieve all UGDs
     * Example Requests:  templates  It is also possible to get specific UGDs by entity and type:  templates?type&#x3D;0&amp;entity&#x3D;0 [Entity: Id]      client: 0, loan: 1  [Type: Id]    Document: 0, E-Mail (not yet): 1,  SMS: 2
     * Responses:
     *  - 200: OK
     *
     * @param typeId typeId (optional, default to -1)
     * @param entityId entityId (optional, default to -1)
     * @return [GetTemplatesResponse]
     */
    @GET("v1/templates")
    suspend fun retrieveAll40(
        @Query("typeId") typeId: Int? = -1,
        @Query("entityId") entityId: Int? = -1
    ): GetTemplatesResponse

    /**
     * Retrieve a UGD
     * Example Requests:  templates/1
     * Responses:
     *  - 200: OK
     *
     * @param templateId templateId
     * @return [GetTemplatesTemplateIdResponse]
     */
    @GET("v1/templates/{templateId}")
    suspend fun retrieveOne30(@Path("templateId") templateId: Long): GetTemplatesTemplateIdResponse

    /**
     * Update a UGD
     *
     * Responses:
     *  - 200: OK
     *
     * @param templateId templateId
     * @param putTemplatesTemplateIdRequest
     * @return [PutTemplatesTemplateIdResponse]
     */
    @PUT("v1/templates/{templateId}")
    suspend fun saveTemplate(
        @Path("templateId") templateId: Long,
        @Body putTemplatesTemplateIdRequest: PutTemplatesTemplateIdRequest
    ): PutTemplatesTemplateIdResponse

    /**
     * Retrieve UGD Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for UGDs. The UGD data returned consists of any or all of:  ARGUMENTS name String entity String type String text String optional mappers Mapper optional Example Request:  templates/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetTemplatesTemplateResponse]
     */
    @GET("v1/templates/template")
    suspend fun template20(): GetTemplatesTemplateResponse

}
