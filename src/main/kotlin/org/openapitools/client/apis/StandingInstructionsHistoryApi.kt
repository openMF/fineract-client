package org.openapitools.client.apis

import org.openapitools.client.models.GetStandingInstructionRunHistoryResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface StandingInstructionsHistoryApi {
    /**
     * Standing Instructions Logged History
     * The list capability of history can support pagination and sorting   Example Requests :  standinginstructionrunhistory  standinginstructionrunhistory?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC  standinginstructionrunhistory?offset&#x3D;10&amp;limit&#x3D;50
     * Responses:
     *  - 200: OK
     *
     * @param externalId externalId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @param transferType transferType (optional)
     * @param clientName clientName (optional)
     * @param clientId clientId (optional)
     * @param fromAccountId fromAccountId (optional)
     * @param fromAccountType fromAccountType (optional)
     * @param locale locale (optional)
     * @param dateFormat dateFormat (optional)
     * @param fromDate fromDate (optional)
     * @param toDate toDate (optional)
     * @return [GetStandingInstructionRunHistoryResponse]
     */
    @GET("v1/standinginstructionrunhistory")
    suspend fun retrieveAll20(
        @Query("externalId") externalId: String? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null,
        @Query("transferType") transferType: Int? = null,
        @Query("clientName") clientName: String? = null,
        @Query("clientId") clientId: Long? = null,
        @Query("fromAccountId") fromAccountId: Long? = null,
        @Query("fromAccountType") fromAccountType: Int? = null,
        @Query("locale") locale: String? = null,
        @Query("dateFormat") dateFormat: String? = null,
        @Query("fromDate") fromDate: Any? = null,
        @Query("toDate") toDate: Any? = null
    ): GetStandingInstructionRunHistoryResponse

}
