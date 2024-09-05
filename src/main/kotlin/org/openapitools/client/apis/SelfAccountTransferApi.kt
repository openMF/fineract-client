package org.openapitools.client.apis

import org.openapitools.client.models.GetAccountTransferTemplateResponse
import org.openapitools.client.models.PostNewTransferResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface SelfAccountTransferApi {
    /**
     * Create new Transfer
     * Ability to create new transfer of monetary funds from one account to another.   Example Requests:   self/accounttransfers/
     * Responses:
     *  - 200: OK
     *
     * @param type  (optional, default to "")
     * @param body  (optional)
     * @return [kotlin.collections.List<PostNewTransferResponse]
     */
    @POST("v1/self/accounttransfers")
    suspend fun create14(
        @Query("type") type: String? = "",
        @Body body: String? = null
    ): List<PostNewTransferResponse>

    /**
     * Retrieve Account Transfer Template
     * Returns list of loan/savings accounts that can be used for account transfer   Example Requests:  self/accounttransfers/template
     * Responses:
     *  - 200: OK
     *
     * @param type  (optional, default to "")
     * @return [kotlin.collections.List<GetAccountTransferTemplateResponse]
     */
    @GET("v1/self/accounttransfers/template")
    suspend fun template15(@Query("type") type: String? = ""): List<GetAccountTransferTemplateResponse>

}
