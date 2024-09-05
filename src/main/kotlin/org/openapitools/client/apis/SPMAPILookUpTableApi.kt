package org.openapitools.client.apis

import org.openapitools.client.models.LookupTableData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface SPMAPILookUpTableApi {
    /**
     * Create a Lookup Table entry
     * Add a new entry to a survey.  Mandatory Fields key, score, validFrom, validTo
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @param lookupTableData  (optional)
     * @return [Unit]
     */
    @POST("v1/surveys/{surveyId}/lookuptables")
    suspend fun createLookupTable(
        @Path("surveyId") surveyId: Long,
        @Body lookupTableData: LookupTableData? = null
    )

    /**
     * List all Lookup Table entries
     * List all Lookup Table entries for a survey.
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @return [kotlin.collections.List<LookupTableData]
     */
    @GET("v1/surveys/{surveyId}/lookuptables")
    suspend fun fetchLookupTables(@Path("surveyId") surveyId: Long): List<LookupTableData>

    /**
     * Retrieve a Lookup Table entry
     * Retrieve a Lookup Table entry for a survey.
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @param key Enter key
     * @return [LookupTableData]
     */
    @GET("v1/surveys/{surveyId}/lookuptables/{key}")
    suspend fun findLookupTable(
        @Path("surveyId") surveyId: Long,
        @Path("key") key: String
    ): LookupTableData

}
