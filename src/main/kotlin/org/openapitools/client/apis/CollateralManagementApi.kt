package org.openapitools.client.apis

import org.openapitools.client.models.DeleteCollateralProductResponse
import org.openapitools.client.models.GetCollateralManagementsResponse
import org.openapitools.client.models.GetCollateralProductTemplate
import org.openapitools.client.models.PostCollateralManagementProductRequest
import org.openapitools.client.models.PostCollateralManagementProductResponse
import org.openapitools.client.models.PutCollateralProductRequest
import org.openapitools.client.models.PutCollateralProductResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface CollateralManagementApi {
    /**
     * Create a new collateral
     * Collateral Creation
     * Responses:
     *  - 200: OK
     *
     * @param postCollateralManagementProductRequest
     * @return [PostCollateralManagementProductResponse]
     */
    @POST("v1/collateral-management")
    suspend fun createCollateral1(@Body postCollateralManagementProductRequest: PostCollateralManagementProductRequest): PostCollateralManagementProductResponse

    /**
     * Delete a Collateral
     * Delete Collateral
     * Responses:
     *  - 200: OK
     *
     * @param collateralId collateralId
     * @return [DeleteCollateralProductResponse]
     */
    @DELETE("v1/collateral-management/{collateralId}")
    suspend fun deleteCollateral2(@Path("collateralId") collateralId: Long): DeleteCollateralProductResponse

    /**
     * Get All Collaterals
     * Fetch all Collateral Products
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetCollateralManagementsResponse>]
     */
    @GET("v1/collateral-management")
    suspend fun getAllCollaterals(): List<GetCollateralManagementsResponse>

    /**
     * Get Collateral
     * Fetch Collateral
     * Responses:
     *  - 200: OK
     *
     * @param collateralId collateralId
     * @return [GetCollateralManagementsResponse]
     */
    @GET("v1/collateral-management/{collateralId}")
    suspend fun getCollateral(@Path("collateralId") collateralId: Long): GetCollateralManagementsResponse

    /**
     * Get Collateral Template
     * Get Collateral Template
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetCollateralProductTemplate>]
     */
    @GET("v1/collateral-management/template")
    suspend fun getCollateralTemplate(): List<GetCollateralProductTemplate>

    /**
     * Update Collateral
     * Update Collateral
     * Responses:
     *  - 200: OK
     *
     * @param collateralId collateralId
     * @param putCollateralProductRequest
     * @return [PutCollateralProductResponse]
     */
    @PUT("v1/collateral-management/{collateralId}")
    suspend fun updateCollateral2(
        @Path("collateralId") collateralId: Long,
        @Body putCollateralProductRequest: PutCollateralProductRequest
    ): PutCollateralProductResponse

}
