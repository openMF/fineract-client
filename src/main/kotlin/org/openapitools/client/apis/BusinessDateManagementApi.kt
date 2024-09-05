package org.openapitools.client.apis

import org.openapitools.client.models.BusinessDateRequest
import org.openapitools.client.models.BusinessDateResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface BusinessDateManagementApi {
    /**
     * Retrieve a specific Business date
     *
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @return [BusinessDateResponse]
     */
    @GET("v1/businessdate/{type}")
    suspend fun getBusinessDate(@Path("type") type: String): BusinessDateResponse

    /**
     * List all business dates
     *
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<BusinessDateResponse>]
     */
    @GET("v1/businessdate")
    suspend fun getBusinessDates(): List<BusinessDateResponse>

    /**
     * Update Business Date
     *
     * Responses:
     *  - 200: OK
     *
     * @param businessDateRequest
     * @return [BusinessDateResponse]
     */
    @POST("v1/businessdate")
    suspend fun updateBusinessDate(@Body businessDateRequest: BusinessDateRequest): BusinessDateResponse

}
