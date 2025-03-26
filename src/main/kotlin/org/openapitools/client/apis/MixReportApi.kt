package org.openapitools.client.apis

import retrofit2.http.GET
import retrofit2.http.Query


interface MixReportApi {
    /**
     *
     *
     * Responses:
     *  - 0: default response
     *
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param currency  (optional)
     * @return [kotlin.String]
     */
    @GET("v1/mixreport")
    suspend fun retrieveXBRLReport(
        @Query("startDate") startDate: java.time.OffsetDateTime? = null,
        @Query("endDate") endDate: java.time.OffsetDateTime? = null,
        @Query("currency") currency: String? = null
    ): String

}
