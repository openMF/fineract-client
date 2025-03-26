package org.openapitools.client.apis

import org.openapitools.client.models.ScorecardData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface SelfScoreCardApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param surveyId
     * @param scorecardData  (optional)
     * @return [Unit]
     */
    @POST("v1/self/surveys/scorecards/{surveyId}")
    suspend fun createScorecard(
        @Path("surveyId") surveyId: Long,
        @Body scorecardData: ScorecardData? = null
    ): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param clientId
     * @return [kotlin.collections.List<ScorecardData]
     */
    @GET("v1/self/surveys/scorecards/clients/{clientId}")
    suspend fun findByClient(@Path("clientId") clientId: Long): List<ScorecardData>

}
