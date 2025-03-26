package org.openapitools.client.apis

import org.openapitools.client.models.DeleteRecurringDepositProductsProductIdResponse
import org.openapitools.client.models.GetRecurringDepositProductsProductIdResponse
import org.openapitools.client.models.GetRecurringDepositProductsResponse
import org.openapitools.client.models.PostRecurringDepositProductsRequest
import org.openapitools.client.models.PostRecurringDepositProductsResponse
import org.openapitools.client.models.PutRecurringDepositProductsRequest
import org.openapitools.client.models.PutRecurringDepositProductsResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface RecurringDepositProductApi {
    /**
     * Create a Recurring Deposit Product
     * Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId
     * Responses:
     *  - 200: OK
     *
     * @param postRecurringDepositProductsRequest
     * @return [PostRecurringDepositProductsResponse]
     */
    @POST("v1/recurringdepositproducts")
    suspend fun create12(@Body postRecurringDepositProductsRequest: PostRecurringDepositProductsRequest): PostRecurringDepositProductsResponse

    /**
     * Delete a Recurring Deposit Product
     * Deletes a Recurring Deposit Product
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @return [DeleteRecurringDepositProductsProductIdResponse]
     */
    @DELETE("v1/recurringdepositproducts/{productId}")
    suspend fun delete18(@Path("productId") productId: Long): DeleteRecurringDepositProductsProductIdResponse

    /**
     * List Recuring Deposit Products
     * Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetRecurringDepositProductsResponse]
     */
    @GET("v1/recurringdepositproducts")
    suspend fun retrieveAll32(): List<GetRecurringDepositProductsResponse>

    /**
     * Retrieve a Recurring Deposit Product
     * Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @return [GetRecurringDepositProductsProductIdResponse]
     */
    @GET("v1/recurringdepositproducts/{productId}")
    suspend fun retrieveOne23(@Path("productId") productId: Long): GetRecurringDepositProductsProductIdResponse

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/recurringdepositproducts/template")
    suspend fun retrieveTemplate17(): String

    /**
     * Update a Recurring Deposit Product
     * Updates a Recurring Deposit Product
     * Responses:
     *  - 200: OK
     *
     * @param productId productId
     * @param putRecurringDepositProductsRequest
     * @return [PutRecurringDepositProductsResponse]
     */
    @PUT("v1/recurringdepositproducts/{productId}")
    suspend fun update19(
        @Path("productId") productId: Long,
        @Body putRecurringDepositProductsRequest: PutRecurringDepositProductsRequest
    ): PutRecurringDepositProductsResponse

}
