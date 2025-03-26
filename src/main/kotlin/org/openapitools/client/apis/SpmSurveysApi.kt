package org.openapitools.client.apis

import org.openapitools.client.models.SurveyData
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface SpmSurveysApi {
    /**
     * Deactivate Survey
     *
     * Responses:
     *  - 200: OK
     *
     * @param id
     * @param command  (optional)
     * @return [Unit]
     */
    @POST("v1/surveys/{id}")
    suspend fun activateOrDeactivateSurvey(
        @Path("id") id: Long,
        @Query("command") command: String? = null
    ): Unit

    /**
     * Create a Survey
     * Adds a new survey to collect client related data.  Mandatory Fields  countryCode, key, name, questions, responses, sequenceNo, text, description
     * Responses:
     *  - 200: OK
     *
     * @param surveyData Create survey (optional)
     * @return [Unit]
     */
    @POST("v1/surveys")
    suspend fun createSurvey(@Body surveyData: SurveyData? = null): Unit

    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param id
     * @param surveyData  (optional)
     * @return [kotlin.String]
     */
    @PUT("v1/surveys/{id}")
    suspend fun editSurvey(
        @Path("id") id: Long,
        @Body surveyData: SurveyData? = null
    ): String

    /**
     * List all Surveys
     *
     * Responses:
     *  - 200: OK
     *
     * @param isActive  (optional)
     * @return [kotlin.collections.List<SurveyData]
     */
    @GET("v1/surveys")
    suspend fun fetchAllSurveys1(@Query("isActive") isActive: Boolean? = null): List<SurveyData>

    /**
     * Retrieve a Survey
     *
     * Responses:
     *  - 200: OK
     *
     * @param id Enter id
     * @return [SurveyData]
     */
    @GET("v1/surveys/{id}")
    suspend fun findSurvey(@Path("id") id: Long): SurveyData

}
