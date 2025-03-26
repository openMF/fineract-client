package org.openapitools.client.apis

import org.openapitools.client.models.GetAccountTransfersPageItems
import org.openapitools.client.models.GetAccountTransfersResponse
import org.openapitools.client.models.GetAccountTransfersTemplateRefundByTransferResponse
import org.openapitools.client.models.GetAccountTransfersTemplateResponse
import org.openapitools.client.models.PostAccountTransfersRefundByTransferRequest
import org.openapitools.client.models.PostAccountTransfersRefundByTransferResponse
import org.openapitools.client.models.PostAccountTransfersRequest
import org.openapitools.client.models.PostAccountTransfersResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query

interface AccountTransfersApi {
    /**
     * Create new Transfer
     * Ability to create new transfer of monetary funds from one account to another.
     * Responses:
     *  - 200: OK
     *
     * @param postAccountTransfersRequest
     * @return [PostAccountTransfersResponse]
     */
    @POST("v1/accounttransfers")
    suspend fun create4(@Body postAccountTransfersRequest: PostAccountTransfersRequest): PostAccountTransfersResponse

    /**
     * List account transfers
     * Lists account&#39;s transfers  Example Requests:    accounttransfers
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId (optional)
     * @param offset offset (optional)
     * @param limit  (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param accountDetailId accountDetailId (optional)
     * @return [GetAccountTransfersResponse]
     */
    @GET("v1/accounttransfers")
    suspend fun retrieveAll18(
        @Query("externalId") externalId: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("accountDetailId") accountDetailId: Long? = null
    ): GetAccountTransfersResponse

    /**
     * Retrieve account transfer
     * Retrieves account transfer  Example Requests :    accounttransfers/1
     * Responses:
     *  - 200: OK
     *
     * @param transferId transferId
     * @return [GetAccountTransfersPageItems]
     */
    @GET("v1/accounttransfers/{transferId}")
    suspend fun retrieveOne9(@Path("transferId") transferId: Long): GetAccountTransfersPageItems

    /**
     * Retrieve Account Transfer Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1    accounttransfers/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param fromOfficeId fromOfficeId (optional)
     * @param fromClientId fromClientId (optional)
     * @param fromAccountId fromAccountId (optional)
     * @param fromAccountType fromAccountType (optional)
     * @param toOfficeId toOfficeId (optional)
     * @param toClientId toClientId (optional)
     * @param toAccountId toAccountId (optional)
     * @param toAccountType toAccountType (optional)
     * @return [GetAccountTransfersTemplateResponse]
     */
    @GET("v1/accounttransfers/template")
    suspend fun template5(
        @Query("fromOfficeId") fromOfficeId: Long? = null,
        @Query("fromClientId") fromClientId: Long? = null,
        @Query("fromAccountId") fromAccountId: Long? = null,
        @Query("fromAccountType") fromAccountType: Int? = null,
        @Query("toOfficeId") toOfficeId: Long? = null,
        @Query("toClientId") toClientId: Long? = null,
        @Query("toAccountId") toAccountId: Long? = null,
        @Query("toAccountType") toAccountType: Int? = null
    ): GetAccountTransfersTemplateResponse

    /**
     * Retrieve Refund of an Active Loan by Transfer Template
     * Retrieves Refund of an Active Loan by Transfer TemplateExample Requests :    accounttransfers/templateRefundByTransfer?fromAccountId&#x3D;2&amp;fromAccountType&#x3D;1&amp; toAccountId&#x3D;1&amp;toAccountType&#x3D;2&amp;toClientId&#x3D;1&amp;toOfficeId&#x3D;1
     * Responses:
     *  - 200: OK
     *
     * @param fromOfficeId fromOfficeId (optional)
     * @param fromClientId fromClientId (optional)
     * @param fromAccountId fromAccountId (optional)
     * @param fromAccountType fromAccountType (optional)
     * @param toOfficeId toOfficeId (optional)
     * @param toClientId toClientId (optional)
     * @param toAccountId toAccountId (optional)
     * @param toAccountType toAccountType (optional)
     * @return [GetAccountTransfersTemplateRefundByTransferResponse]
     */
    @GET("v1/accounttransfers/templateRefundByTransfer")
    suspend fun templateRefundByTransfer(
        @Query("fromOfficeId") fromOfficeId: Long? = null,
        @Query("fromClientId") fromClientId: Long? = null,
        @Query("fromAccountId") fromAccountId: Long? = null,
        @Query("fromAccountType") fromAccountType: Int? = null,
        @Query("toOfficeId") toOfficeId: Long? = null,
        @Query("toClientId") toClientId: Long? = null,
        @Query("toAccountId") toAccountId: Long? = null,
        @Query("toAccountType") toAccountType: Int? = null
    ): GetAccountTransfersTemplateRefundByTransferResponse

    /**
     * Refund of an Active Loan by Transfer
     * Ability to refund an active loan by transferring to a savings account.
     * Responses:
     *  - 200: OK
     *
     * @param postAccountTransfersRefundByTransferRequest
     * @return [PostAccountTransfersRefundByTransferResponse]
     */
    @POST("v1/accounttransfers/refundByTransfer")
    suspend fun templateRefundByTransferPost(@Body postAccountTransfersRefundByTransferRequest: PostAccountTransfersRefundByTransferRequest): PostAccountTransfersRefundByTransferResponse

}
