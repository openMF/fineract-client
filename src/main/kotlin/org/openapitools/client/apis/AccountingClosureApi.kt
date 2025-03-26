package org.openapitools.client.apis

import org.openapitools.client.models.DeleteGlClosuresResponse
import org.openapitools.client.models.GetGlClosureResponse
import org.openapitools.client.models.PostGlClosuresRequest
import org.openapitools.client.models.PostGlClosuresResponse
import org.openapitools.client.models.PutGlClosuresRequest
import org.openapitools.client.models.PutGlClosuresResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface AccountingClosureApi {
    /**
     * Create an Accounting Closure
     * Mandatory Fields officeId,closingDate
     * Responses:
     *  - 200: OK
     *
     * @param postGlClosuresRequest
     * @return [PostGlClosuresResponse]
     */
    @POST("v1/glclosures")
    suspend fun createGLClosure(@Body postGlClosuresRequest: PostGlClosuresRequest): PostGlClosuresResponse

    /**
     * Delete an accounting closure
     * Note: Only the latest accounting closure associated with a branch may be deleted.
     * Responses:
     *  - 200: OK
     *
     * @param glClosureId glclosureId
     * @return [DeleteGlClosuresResponse]
     */
    @DELETE("v1/glclosures/{glClosureId}")
    suspend fun deleteGLClosure(@Path("glClosureId") glClosureId: Long): DeleteGlClosuresResponse

    /**
     * Retrieve an Accounting Closure
     * Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate
     * Responses:
     *  - 200: OK
     *
     * @param glClosureId glClosureId
     * @return [GetGlClosureResponse]
     */
    @GET("v1/glclosures/{glClosureId}")
    suspend fun retreiveClosure(@Path("glClosureId") glClosureId: Long): GetGlClosureResponse

    /**
     * List Accounting closures
     * Example Requests:  glclosures
     * Responses:
     *  - 200: OK
     *
     * @param officeId  (optional)
     * @return [kotlin.collections.List<GetGlClosureResponse>]
     */
    @GET("v1/glclosures")
    suspend fun retrieveAllClosures(@Query("officeId") officeId: Long? = null): List<GetGlClosureResponse>

    /**
     * Update an Accounting closure
     * Once an accounting closure is created, only the comments associated with it may be edited
     * Responses:
     *  - 200: OK
     *
     * @param glClosureId glClosureId
     * @param putGlClosuresRequest  (optional)
     * @return [PutGlClosuresResponse]
     */
    @PUT("v1/glclosures/{glClosureId}")
    suspend fun updateGLClosure(
        @Path("glClosureId") glClosureId: Long,
        @Body putGlClosuresRequest: PutGlClosuresRequest? = null
    ): PutGlClosuresResponse

}
