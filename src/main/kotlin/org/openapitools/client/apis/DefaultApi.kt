package org.openapitools.client.apis

import okhttp3.MultipartBody
import org.openapitools.client.models.AdvancedPaymentData
import org.openapitools.client.models.CommandProcessingResult
import org.openapitools.client.models.CommandWrapper
import org.openapitools.client.models.SmsCampaignData
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path
import retrofit2.http.Query

interface DefaultApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @param command  (optional)
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/email/campaign/{resourceId}")
    suspend fun activate(
        @Path("resourceId") resourceId: Long,
        @Query("command") command: String? = null,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param creditBureauId creditBureauId (optional)
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/creditBureauIntegration/addCreditReport")
    suspend fun addCreditReport(
        @Query("creditBureauId") creditBureauId: Long? = null,
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entity
     * @param entityId
     * @param contentLength  (optional)
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @POST("v1/{entity}/{entityId}/images")
    suspend fun addNewClientImage1(
        @Path("entity") entity: String,
        @Path("entityId") entityId: Long,
        @Header("Content-Length") contentLength: Long? = null,
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
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
    @POST("v1/email")
    suspend fun create1(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/email/campaign")
    suspend fun createCampaign(@Body body: String? = null): String

    /**
     * Create a SMS Campaign
     * Mandatory Fields campaignName, campaignType, triggerType, providerId, runReportId, message  Mandatory Fields for Cash based on selected report id paramValue in json format
     * Responses:
     *  - 200: OK
     *
     * @param commandWrapper
     * @return [CommandProcessingResult]
     */
    @POST("v1/smscampaigns")
    suspend fun createCampaign1(@Body commandWrapper: CommandWrapper): CommandProcessingResult

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @return [kotlin.String]
     */
    @DELETE("v1/email/{resourceId}")
    suspend fun delete1(@Path("resourceId") resourceId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @return [kotlin.String]
     */
    @DELETE("v1/email/campaign/{resourceId}")
    suspend fun delete2(@Path("resourceId") resourceId: Long): String

    /**
     * Delete a SMS Campaign
     * Note: Only closed SMS Campaigns can be deleted
     * Responses:
     *  - 200: OK
     *
     * @param campaignId
     * @return [CommandProcessingResult]
     */
    @DELETE("v1/smscampaigns/{campaignId}")
    suspend fun delete3(@Path("campaignId") campaignId: Long): CommandProcessingResult

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param transactionId
     * @return [kotlin.String]
     */
    @DELETE("v1/officetransactions/{transactionId}")
    suspend fun delete8(@Path("transactionId") transactionId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entity
     * @param entityId
     * @return [kotlin.String]
     */
    @DELETE("v1/{entity}/{entityId}/images")
    suspend fun deleteClientImage(
        @Path("entity") entity: String,
        @Path("entityId") entityId: Long
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param creditBureauId creditBureauId
     * @return [kotlin.String]
     */
    @DELETE("v1/creditBureauIntegration/deleteCreditReport/{creditBureauId}")
    suspend fun deleteCreditReport(@Path("creditBureauId") creditBureauId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body Fetch credit report (optional)
     * @return [kotlin.String]
     */
    @POST("v1/creditBureauIntegration/creditReport")
    suspend fun fetchCreditReport(@Body body: Any? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/echo")
    suspend fun get(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @return [kotlin.collections.List<AdvancedPaymentData]
     */
    @GET("v1/internal/loan/{loanId}/advanced-payment-allocation-rules")
    suspend fun getAdvancedPaymentAllocationRulesOfLoan(@Path("loanId") loanId: Long): List<AdvancedPaymentData>

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @return [kotlin.String]
     */
    @GET("v1/internal/client/{clientId}/audit")
    suspend fun getClientAuditFields(@Path("clientId") clientId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param partitionSize
     * @return [kotlin.String]
     */
    @GET("v1/internal/cob/partitions/{partitionSize}")
    suspend fun getCobPartitions(@Path("partitionSize") partitionSize: Int): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param path
     * @return [Unit]
     */
    @GET("application.wadl/{path}")
    suspend fun getExternalGrammar(@Path("path") path: String): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @return [kotlin.String]
     */
    @GET("v1/internal/loan/{loanId}/audit")
    suspend fun getLoanAuditFields(@Path("loanId") loanId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @param transactionId
     * @return [kotlin.String]
     */
    @GET("v1/internal/loan/{loanId}/transaction/{transactionId}/audit")
    suspend fun getLoanTransactionAuditFields(
        @Path("loanId") loanId: Long,
        @Path("transactionId") transactionId: Long
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param statusId
     * @return [kotlin.String]
     */
    @GET("v1/internal/loan/status/{statusId}")
    suspend fun getLoansByStatus(@Path("statusId") statusId: Int): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param creditBureauId creditBureauId
     * @return [kotlin.String]
     */
    @GET("v1/creditBureauIntegration/creditReport/{creditBureauId}")
    suspend fun getSavedCreditReport(@Path("creditBureauId") creditBureauId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [Unit]
     */
    @GET("application.wadl")
    suspend fun getWadl(): Unit

    /**
     * SMS Campaign
     * Activates | Deactivates | Reactivates
     * Responses:
     *  - 200: OK
     *
     * @param campaignId
     * @param command  (optional)
     * @return [CommandProcessingResult]
     */
    @POST("v1/smscampaigns/{campaignId}")
    suspend fun handleCommands(
        @Path("campaignId") campaignId: Long,
        @Query("command") command: String? = null
    ): CommandProcessingResult

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/officetransactions/template")
    suspend fun newOfficeTransactionDetails(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param loanId
     * @param lockOwner
     * @param body  (optional)
     * @return [Unit]
     */
    @POST("v1/internal/loans/{loanId}/place-lock/{lockOwner}")
    suspend fun placeLockOnLoanAccount(
        @Path("loanId") loanId: Long,
        @Path("lockOwner") lockOwner: String,
        @Body body: String? = null
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/email/campaign/preview")
    suspend fun preview(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/smscampaigns/preview")
    suspend fun preview1(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/email/configuration")
    suspend fun retrieveAll5(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/twofactor/configure")
    suspend fun retrieveAll9(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/email/campaign")
    suspend fun retrieveAllCampaign(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param sqlSearch  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param status  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @param fromDate  (optional)
     * @param toDate  (optional)
     * @param locale  (optional)
     * @param dateFormat  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/email/messageByStatus")
    suspend fun retrieveAllEmailByStatus(
        @Query("sqlSearch") sqlSearch: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("status") status: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("fromDate") fromDate: Any? = null,
        @Query("toDate") toDate: Any? = null,
        @Query("locale") locale: String? = null,
        @Query("dateFormat") dateFormat: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/email")
    suspend fun retrieveAllEmails(): String

    /**
     * List SMS Campaigns
     * Example Requests:  smscampaigns
     * Responses:
     *  - 200: OK
     *
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @return [SmsCampaignData]
     */
    @GET("v1/smscampaigns")
    suspend fun retrieveAllEmails1(
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): SmsCampaignData

    /**
     * Retrieve a SMS Campaign
     * Example Requests:  smscampaigns/1
     * Responses:
     *  - 200: OK
     *
     * @param resourceId
     * @return [SmsCampaignData]
     */
    @GET("v1/smscampaigns/{resourceId}")
    suspend fun retrieveCampaign(@Path("resourceId") resourceId: Long): SmsCampaignData

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param sqlSearch  (optional)
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/email/failedEmail")
    suspend fun retrieveFailedEmail(
        @Query("sqlSearch") sqlSearch: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entity
     * @param entityId
     * @param maxWidth  (optional)
     * @param maxHeight  (optional)
     * @param output  (optional)
     * @param accept  (optional)
     * @return [Unit]
     */
    @GET("v1/{entity}/{entityId}/images")
    suspend fun retrieveImage(
        @Path("entity") entity: String,
        @Path("entityId") entityId: Long,
        @Query("maxWidth") maxWidth: Int? = null,
        @Query("maxHeight") maxHeight: Int? = null,
        @Query("output") output: String? = null,
        @Header("Accept") accept: String? = null
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/officetransactions")
    suspend fun retrieveOfficeTransactions(): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @return [kotlin.String]
     */
    @GET("v1/email/{resourceId}")
    suspend fun retrieveOne1(@Path("resourceId") resourceId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @return [kotlin.String]
     */
    @GET("v1/email/campaign/{resourceId}")
    suspend fun retrieveOneCampaign(@Path("resourceId") resourceId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @return [kotlin.String]
     */
    @GET("v1/email/campaign/template/{resourceId}")
    suspend fun retrieveOneTemplate(@Path("resourceId") resourceId: Long): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/email/pendingEmail")
    suspend fun retrievePendingEmail(
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param offset  (optional)
     * @param limit  (optional)
     * @param orderBy  (optional)
     * @param sortOrder  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/email/sentEmail")
    suspend fun retrieveSentEmail(
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param creditBureauId creditBureauId (optional)
     * @param nationalId nationalId (optional)
     * @return [kotlin.String]
     */
    @POST("v1/creditBureauIntegration/saveCreditReport")
    suspend fun saveCreditReport(
        @Query("creditBureauId") creditBureauId: Long? = null,
        @Query("nationalId") nationalId: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.String]
     */
    @GET("v1/email/campaign/template")
    suspend fun template1(): String

    /**
     * Retrieve a SMS Campaign
     * Example Requests:  smscampaigns/1   smscampaigns/1?template&#x3D;true   smscampaigns/template
     * Responses:
     *  - 200: OK
     *
     * @return [SmsCampaignData]
     */
    @GET("v1/smscampaigns/template")
    suspend fun template2(): SmsCampaignData

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @POST("v1/officetransactions")
    suspend fun transferMoneyFrom(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/email/{resourceId}")
    suspend fun update2(
        @Path("resourceId") resourceId: Long,
        @Body body: String? = null
    ): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param resourceId
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/email/campaign/{resourceId}")
    suspend fun updateCampaign(
        @Path("resourceId") resourceId: Long,
        @Body body: String? = null
    ): String

    /**
     * Update a Campaign
     *
     * Responses:
     *  - 200: OK
     *
     * @param campaignId
     * @param commandWrapper
     * @return [CommandProcessingResult]
     */
    @PUT("v1/smscampaigns/{campaignId}")
    suspend fun updateCampaign1(
        @Path("campaignId") campaignId: Long,
        @Body commandWrapper: CommandWrapper
    ): CommandProcessingResult

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param entity
     * @param entityId
     * @param contentLength  (optional)
     * @param dateFormat  (optional)
     * @param locale  (optional)
     * @param uploadedInputStream  (optional)
     * @return [kotlin.String]
     */
    @Multipart
    @PUT("v1/{entity}/{entityId}/images")
    suspend fun updateClientImage1(
        @Path("entity") entity: String,
        @Path("entityId") entityId: Long,
        @Header("Content-Length") contentLength: Long? = null,
        @Part("dateFormat") dateFormat: String? = null,
        @Part("locale") locale: String? = null,
        @Part uploadedInputStream: MultipartBody.Part? = null
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
    @PUT("v1/email/configuration")
    suspend fun updateConfiguration(@Body body: String? = null): String

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param body  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/twofactor/configure")
    suspend fun updateConfiguration3(@Body body: String? = null): String

}
