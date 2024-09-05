package org.openapitools.client.apis

import org.openapitools.client.models.GetRunReportResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface SelfRunReportApi {
    /**
     * Running A Report
     * Example Requests:   self/runreports/Client%20Details?R_officeId&#x3D;1   self/runreports/Client%20Details?R_officeId&#x3D;1&amp;exportCSV&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param reportName reportName
     * @return [GetRunReportResponse]
     */
    @GET("v1/self/runreports/{reportName}")
    suspend fun runReport1(@Path("reportName") reportName: String): GetRunReportResponse

}
