package org.openapitools.client.apis

import org.openapitools.client.models.GetSearchResponse
import org.openapitools.client.models.PostAdhocQuerySearchRequest
import org.openapitools.client.models.PostAdhocQuerySearchResponse
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface SearchAPIApi {
    /**
     * Adhoc query search
     * AdHocQuery search has more search options, it is a POST request, it uses request body to send search parameters   Mandatory fields:entities  Optional fields:loanStatus, loanProducts, offices, loanDateOption, loanFromDate, loanToDate,  includeOutStandingAmountPercentage, outStandingAmountPercentageCondition,  minOutStandingAmountPercentage and maxOutStandingAmountPercentage OR outStandingAmountPercentage,  includeOutstandingAmount, outstandingAmountCondition,  minOutstandingAmount and maxOutstandingAmount OR outstandingAmount
     * Responses:
     *  - 200: OK
     *
     * @param postAdhocQuerySearchRequest
     * @return [kotlin.collections.List<PostAdhocQuerySearchResponse]
     */
    @POST("v1/search/advance")
    suspend fun advancedSearch(@Body postAdhocQuerySearchRequest: PostAdhocQuerySearchRequest): List<PostAdhocQuerySearchResponse>

    /**
     * Retrive Adhoc Search query template
     * Mandatory Fields  search?query&#x3D;000000001
     * Responses:
     *  - 200: OK
     *
     * @return [GetSearchResponse]
     */
    @GET("v1/search/template")
    suspend fun retrieveAdHocSearchQueryTemplate(): GetSearchResponse

    /**
     * Search Resources
     * Example Requests:  search?query&#x3D;000000001   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups&amp;exactMatch&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param query query (optional)
     * @param resource resource (optional)
     * @param exactMatch exactMatch (optional, default to false)
     * @return [kotlin.collections.List<GetSearchResponse]
     */
    @GET("v1/search")
    suspend fun searchData(
        @Query("query") query: String? = null,
        @Query("resource") resource: String? = null,
        @Query("exactMatch") exactMatch: Boolean? = false
    ): List<GetSearchResponse>

}
