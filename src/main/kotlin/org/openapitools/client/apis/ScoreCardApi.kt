package org.openapitools.client.apis

import org.openapitools.client.models.Scorecard
import org.openapitools.client.models.ScorecardData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ScoreCardApi {
    /**
     * Create a Scorecard entry
     * Add a new entry to a survey.  Mandatory Fields clientId, createdOn, questionId, responseId, staffId
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @param scorecardData scorecardData (optional)
     * @return [Unit]
     */
    @POST("v1/surveys/scorecards/{surveyId}")
    suspend fun createScorecard1(
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
    @GET("v1/surveys/scorecards/clients/{clientId}")
    suspend fun findByClient1(@Path("clientId") clientId: Long): List<ScorecardData>

    /**
     * List all Scorecard entries
     * List all Scorecard entries for a survey.
     * Responses:
     *  - 200: OK
     *
     * @param surveyId Enter surveyId
     * @return [kotlin.collections.List<Scorecard]
     */
    @GET("v1/surveys/scorecards/{surveyId}")
    suspend fun findBySurvey(@Path("surveyId") surveyId: Long): List<Scorecard>

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param surveyId Enter surveyId
     * @param clientId Enter clientId
     * @return [kotlin.collections.List<ScorecardData]
     */
    @GET("v1/surveys/scorecards/{surveyId}/clients/{clientId}")
    suspend fun findBySurveyAndClient(
        @Path("surveyId") surveyId: Long,
        @Path("clientId") clientId: Long
    ): List<ScorecardData>

}
