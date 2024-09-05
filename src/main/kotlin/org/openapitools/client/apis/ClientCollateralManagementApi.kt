package org.openapitools.client.apis

import org.openapitools.client.models.DeleteClientCollateralResponse
import org.openapitools.client.models.GetLoanCollateralManagementTemplate
import org.openapitools.client.models.PostClientCollateralRequest
import org.openapitools.client.models.PostClientCollateralResponse
import org.openapitools.client.models.PutClientCollateralRequest
import org.openapitools.client.models.PutClientCollateralResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface ClientCollateralManagementApi {
    /**
     * Add New Collateral For a Client
     * Add New Collateral For a Client
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param postClientCollateralRequest
     * @return [PostClientCollateralResponse]
     */
    @POST("v1/clients/{clientId}/collaterals")
    suspend fun addCollateral(
        @Path("clientId") clientId: Long,
        @Body postClientCollateralRequest: PostClientCollateralRequest
    ): PostClientCollateralResponse

    /**
     * Delete Client Collateral
     * Delete Client Collateral
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param collateralId collateralId
     * @return [DeleteClientCollateralResponse]
     */
    @DELETE("v1/clients/{clientId}/collaterals/{collateralId}")
    suspend fun deleteCollateral1(
        @Path("clientId") clientId: Long,
        @Path("collateralId") collateralId: Long
    ): DeleteClientCollateralResponse

    /**
     * Get Clients Collateral Products
     * Get Collateral Product of a Client
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param prodId prodId (optional)
     * @return [kotlin.collections.List<kotlin.Any>]
     */
    @GET("v1/clients/{clientId}/collaterals")
    suspend fun getClientCollateral(
        @Path("clientId") clientId: Long,
        @Query("prodId") prodId: Long? = null
    ): List<Any>

    /**
     * Get Client Collateral Data
     * Get Client Collateral Data
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param clientCollateralId clientCollateralId
     * @return [kotlin.Any]
     */
    @GET("v1/clients/{clientId}/collaterals/{clientCollateralId}")
    suspend fun getClientCollateralData(
        @Path("clientId") clientId: Long,
        @Path("clientCollateralId") clientCollateralId: Long
    ): Any

    /**
     * Get Client Collateral Template
     * Get Client Collateral Template
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @return [kotlin.collections.List<GetLoanCollateralManagementTemplate>]
     */
    @GET("v1/clients/{clientId}/collaterals/template")
    suspend fun getClientCollateralTemplate(@Path("clientId") clientId: Long): List<GetLoanCollateralManagementTemplate>

    /**
     * Update New Collateral of a Client
     * Update New Collateral of a Client
     * Responses:
     *  - 200: OK
     *
     * @param clientId clientId
     * @param collateralId collateralId
     * @param putClientCollateralRequest
     * @return [PutClientCollateralResponse]
     */
    @PUT("v1/clients/{clientId}/collaterals/{collateralId}")
    suspend fun updateCollateral1(
        @Path("clientId") clientId: Long,
        @Path("collateralId") collateralId: Long,
        @Body putClientCollateralRequest: PutClientCollateralRequest
    ): PutClientCollateralResponse

}
