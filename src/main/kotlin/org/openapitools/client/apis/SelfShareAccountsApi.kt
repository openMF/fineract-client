package org.openapitools.client.apis

import org.openapitools.client.models.GetShareAccountsClientIdProductIdResponse
import org.openapitools.client.models.PostNewShareApplicationResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface SelfShareAccountsApi {
    /**
     * Submit new share application
     * Mandatory fields:  clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate   Optional Fields  accountNo, externalId   Inherited from Product (if not provided)  minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType.
     * Responses:
     *  - 200: OK
     *
     * @param body  (optional)
     * @return [kotlin.collections.List<PostNewShareApplicationResponse]
     */
    @POST("v1/self/shareaccounts")
    suspend fun createAccount1(@Body body: String? = null): List<PostNewShareApplicationResponse>

    /**
     * Retrieve a share application/account
     *    Example Requests:  self/shareaccounts/12
     * Responses:
     *  - 0: default response
     *
     * @param accountId
     * @return [kotlin.String]
     */
    @GET("v1/self/shareaccounts/{accountId}")
    suspend fun retrieveShareAccount(@Path("accountId") accountId: Long): String

    /**
     * Retrieve Share Account Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of: Field Defaults  Allowed Value Lists   Arguments  clientId:Integer mandatory productId:Integer optionalIf entered, productId, productName and selectedProduct fields are returned. Example Requests:  self/shareaccounts/template?clientId&#x3D;14  self/shareaccounts/template?clientId&#x3D;14&amp;productId&#x3D;3
     * Responses:
     *  - 200: OK
     *
     * @param clientId  (optional)
     * @param productId  (optional)
     * @return [kotlin.collections.List<GetShareAccountsClientIdProductIdResponse]
     */
    @GET("v1/self/shareaccounts/template")
    suspend fun template19(
        @Query("clientId") clientId: Long? = null,
        @Query("productId") productId: Long? = null
    ): List<GetShareAccountsClientIdProductIdResponse>

}
