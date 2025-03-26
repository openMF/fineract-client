package org.openapitools.client.apis

import org.openapitools.client.models.SurveyData
import retrofit2.http.GET

interface SelfSpmApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @return [kotlin.collections.List<SurveyData>]
     */
    @GET("v1/self/surveys")
    suspend fun fetchAllSurveys(): List<SurveyData>

}
