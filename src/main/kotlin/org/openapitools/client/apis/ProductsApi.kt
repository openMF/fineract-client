package org.openapitools.client.apis

import org.openapitools.client.models.GetProductsTypeProductIdResponse
import org.openapitools.client.models.GetProductsTypeResponse
import org.openapitools.client.models.PostProductsTypeRequest
import org.openapitools.client.models.PostProductsTypeResponse
import org.openapitools.client.models.PutProductsTypeProductIdRequest
import org.openapitools.client.models.PutProductsTypeProductIdResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface ProductsApi {
    /**
     * Create a Share Product
     * Creates a Share Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, locale, totalShares, unitPrice, nominalShares,allowDividendCalculationForInactiveClients,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): shareReferenceId, shareSuspenseId, shareEquityId, incomeFromFeeAccountId  Optional Fields: sharesIssued, minimumShares, maximumShares, minimumActivePeriodForDividends, minimumactiveperiodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType, marketPricePeriods, chargesSelected
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param postProductsTypeRequest
     * @return [PostProductsTypeResponse]
     */
    @POST("v1/products/{type}")
    suspend fun createProduct(
        @Path("type") type: String,
        @Body postProductsTypeRequest: PostProductsTypeRequest
    ): PostProductsTypeResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param type type
     * @param productId productId
     * @param command command (optional)
     * @return [kotlin.String]
     */
    @POST("v1/products/{type}/{productId}")
    suspend fun handleCommands3(
        @Path("type") type: String,
        @Path("productId") productId: Long,
        @Query("command") command: String? = null
    ): String

    /**
     * List Share Products
     * Lists Share Products  Mandatory Fields: limit, offset  Example Requests:  shareproducts
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @return [GetProductsTypeResponse]
     */
    @GET("v1/products/{type}")
    suspend fun retrieveAllProducts(
        @Path("type") type: String,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null
    ): GetProductsTypeResponse

    /**
     * Retrieve a Share Product
     * Retrieves a Share Product  Example Requests:  products/share/1   products/share/1?template&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @param type type
     * @return [GetProductsTypeProductIdResponse]
     */
    @GET("v1/products/{type}/{productId}")
    suspend fun retrieveProduct(
        @Path("productId") productId: Long,
        @Path("type") type: String
    ): GetProductsTypeProductIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param type type
     * @return [kotlin.String]
     */
    @GET("v1/products/{type}/template")
    suspend fun retrieveTemplate13(@Path("type") type: String): String

    /**
     * Update a Share Product
     * Updates a Share Product
     * Responses:
     *  - 200: OK
     *
     * @param type type
     * @param productId productId
     * @param putProductsTypeProductIdRequest
     * @return [PutProductsTypeProductIdResponse]
     */
    @PUT("v1/products/{type}/{productId}")
    suspend fun updateProduct(
        @Path("type") type: String,
        @Path("productId") productId: Long,
        @Body putProductsTypeProductIdRequest: PutProductsTypeProductIdRequest
    ): PutProductsTypeProductIdResponse

}
