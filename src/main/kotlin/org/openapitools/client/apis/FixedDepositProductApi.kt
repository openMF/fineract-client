package org.openapitools.client.apis

import org.openapitools.client.models.DeleteFixedDepositProductsProductIdResponse
import org.openapitools.client.models.GetFixedDepositProductsProductIdResponse
import org.openapitools.client.models.GetFixedDepositProductsResponse
import org.openapitools.client.models.PostFixedDepositProductsRequest
import org.openapitools.client.models.PostFixedDepositProductsResponse
import org.openapitools.client.models.PutFixedDepositProductsProductIdRequest
import org.openapitools.client.models.PutFixedDepositProductsProductIdResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface FixedDepositProductApi {
    /**
     * Create a Fixed Deposit Product
     * Creates a Fixed Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, accountingRule  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, , withHoldTax, taxGroupId   Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId
     * Responses:
     *  - 200: OK
     *
     * @param postFixedDepositProductsRequest
     * @return [PostFixedDepositProductsResponse]
     */
    @POST("v1/fixeddepositproducts")
    suspend fun create11(@Body postFixedDepositProductsRequest: PostFixedDepositProductsRequest): PostFixedDepositProductsResponse

    /**
     * Delete a Fixed Deposit Product
     * Deletes a Fixed Deposit Product
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @return [DeleteFixedDepositProductsProductIdResponse]
     */
    @DELETE("v1/fixeddepositproducts/{productId}")
    suspend fun delete16(@Path("productId") productId: Long): DeleteFixedDepositProductsProductIdResponse

    /**
     * List Fixed Deposit Products
     * Lists Fixed Deposit Products  Example Requests:  fixeddepositproducts   fixeddepositproducts?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetFixedDepositProductsResponse]
     */
    @GET("v1/fixeddepositproducts")
    suspend fun retrieveAll30(): List<GetFixedDepositProductsResponse>

    /**
     * Retrieve a Fixed Deposit Product
     * Retrieves a Fixed Deposit Product  Example Requests:  fixeddepositproducts/1   fixeddepositproducts/1?template&#x3D;true   fixeddepositproducts/1?fields&#x3D;name,description
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @return [GetFixedDepositProductsProductIdResponse]
     */
    @GET("v1/fixeddepositproducts/{productId}")
    suspend fun retrieveOne20(@Path("productId") productId: Long): GetFixedDepositProductsProductIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/fixeddepositproducts/template")
    suspend fun retrieveTemplate15(): String

    /**
     * Update a Fixed Deposit Product
     * Updates a Fixed Deposit Product
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @param putFixedDepositProductsProductIdRequest
     * @return [PutFixedDepositProductsProductIdResponse]
     */
    @PUT("v1/fixeddepositproducts/{productId}")
    suspend fun update17(
        @Path("productId") productId: Long,
        @Body putFixedDepositProductsProductIdRequest: PutFixedDepositProductsProductIdRequest
    ): PutFixedDepositProductsProductIdResponse

}
