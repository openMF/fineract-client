package org.openapitools.client.apis

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path


interface CreditBureauConfigurationApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param organisationCreditBureauId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/CreditBureauConfiguration/organisationCreditBureau/{organisationCreditBureauId}")
    suspend fun addOrganisationCreditBureau(
        @Path("organisationCreditBureauId") organisationCreditBureauId: Long,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param creditBureauId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/CreditBureauConfiguration/configuration/{creditBureauId}")
    suspend fun createCreditBureauConfiguration(
        @Path("creditBureauId") creditBureauId: Long,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param organisationCreditBureauId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/CreditBureauConfiguration/mappings/{organisationCreditBureauId}")
    suspend fun createCreditBureauLoanProductMapping(
        @Path("organisationCreditBureauId") organisationCreditBureauId: Long,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/CreditBureauConfiguration/loanProduct")
    suspend fun fetchLoanProducts(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanProductId
     * @return [kotlin.String]
     */
    @GET("v1/CreditBureauConfiguration/loanProduct/{loanProductId}")
    suspend fun fetchMappingByLoanProductId(@Path("loanProductId") loanProductId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param organisationCreditBureauId
     * @return [kotlin.String]
     */
    @GET("v1/CreditBureauConfiguration/config/{organisationCreditBureauId}")
    suspend fun getConfiguration(@Path("organisationCreditBureauId") organisationCreditBureauId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/CreditBureauConfiguration")
    suspend fun getCreditBureau(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/CreditBureauConfiguration/mappings")
    suspend fun getCreditBureauLoanProductMapping(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/CreditBureauConfiguration/organisationCreditBureau")
    suspend fun getOrganisationCreditBureau(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/CreditBureauConfiguration/organisationCreditBureau")
    suspend fun updateCreditBureau(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param configurationId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/CreditBureauConfiguration/configuration/{configurationId}")
    suspend fun updateCreditBureauConfiguration(
        @Path("configurationId") configurationId: Long,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/CreditBureauConfiguration/mappings")
    suspend fun updateCreditBureauLoanProductMapping(@Body body: String? = null): String

}
