package org.openapitools.client.apis

import org.openapitools.client.models.ReportMailingJobRunHistoryData
import retrofit2.http.GET
import retrofit2.http.Query

interface ListReportMailingJobHistoryApi {
    /**
     * List Report Mailing Job History
     * The list capability of report mailing job history can support pagination and sorting.  Example Requests:  reportmailingjobrunhistory/1
     * Responses:
     *  - 200: OK
     *
     * @param reportMailingJobId reportMailingJobId (optional)
     * @param offset offset (optional)
     * @param limit limit (optional)
     * @param orderBy orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return [ReportMailingJobRunHistoryData]
     */
    @GET("v1/reportmailingjobrunhistory")
    suspend fun retrieveAllByReportMailingJobId(
        @Query("reportMailingJobId") reportMailingJobId: Long? = null,
        @Query("offset") offset: Int? = null,
        @Query("limit") limit: Int? = null,
        @Query("orderBy") orderBy: String? = null,
        @Query("sortOrder") sortOrder: String? = null
    ): ReportMailingJobRunHistoryData

}
