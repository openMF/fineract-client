package org.openapitools.client.apis

import org.openapitools.client.models.DeleteEntityDatatableChecksTemplateResponse
import org.openapitools.client.models.GetEntityDatatableChecksResponse
import org.openapitools.client.models.GetEntityDatatableChecksTemplateResponse
import org.openapitools.client.models.PostEntityDatatableChecksTemplateRequest
import org.openapitools.client.models.PostEntityDatatableChecksTemplateResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface EntityDataTableApi {
    /**
     * Create Entity-Datatable Checks
     * Mandatory Fields :  entity, status, datatableName  Non-Mandatory Fields :  productId
     * Responses:
     *  - 200: OK
     *
     * @param postEntityDatatableChecksTemplateRequest
     * @return [PostEntityDatatableChecksTemplateResponse]
     */
    @POST("v1/entityDatatableChecks")
    suspend fun createEntityDatatableCheck(@Body postEntityDatatableChecksTemplateRequest: PostEntityDatatableChecksTemplateRequest): PostEntityDatatableChecksTemplateResponse

    /**
     * Delete Entity-Datatable Checks
     * Deletes an existing Entity-Datatable Check
     * Responses:
     *  - 200: OK
     *
     * @param entityDatatableCheckId entityDatatableCheckId
     * @param body  (optional)
     * @return [DeleteEntityDatatableChecksTemplateResponse]
     */
    @DELETE("v1/entityDatatableChecks/{entityDatatableCheckId}")
    suspend fun deleteDatatable1(
        @Path("entityDatatableCheckId") entityDatatableCheckId: Long,
        @Body body: String? = null
    ): DeleteEntityDatatableChecksTemplateResponse

    /**
     * Retrieve Entity-Datatable Checks Template
     * This is a convenience resource useful for building maintenance user interface screens for Entity-Datatable Checks applications. The template data returned consists of:  Allowed description Lists Example Request:  entityDatatableChecks/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetEntityDatatableChecksTemplateResponse]
     */
    @GET("v1/entityDatatableChecks/template")
    suspend fun getTemplate(): GetEntityDatatableChecksTemplateResponse

    /**
     * List Entity-Datatable Checks
     * The list capability of Entity-Datatable Checks can support pagination.  OPTIONAL ARGUMENTS offset Integer optional, defaults to 0 Indicates the result from which pagination startslimit Integer optional, defaults to 200 Restricts the size of results returned. To override the default and return all entries you must explicitly pass a non-positive integer value for limit e.g. limit&#x3D;0, or limit&#x3D;-1 Example Request:  entityDatatableChecks?offset&#x3D;0&amp;limit&#x3D;15
     * Responses:
     *  - 200: OK
     *
     * @param status status (optional)
     * @param entity entity (optional)
     * @param productId productId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [kotlin.collections.List<GetEntityDatatableChecksResponse]
     */
    @GET("v1/entityDatatableChecks")
    suspend fun retrieveAll6(
        @Query("status") status: Long? = null,
        @Query("entity") entity: String? = null,
        @Query("productId") productId: Long? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): List<GetEntityDatatableChecksResponse>

}
