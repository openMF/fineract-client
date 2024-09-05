package org.openapitools.client.apis

import org.openapitools.client.models.DeleteReportsResponse
import org.openapitools.client.models.GetReportsResponse
import org.openapitools.client.models.GetReportsTemplateResponse
import org.openapitools.client.models.PostReportsResponse
import org.openapitools.client.models.PostRepostRequest
import org.openapitools.client.models.PutReportRequest
import org.openapitools.client.models.PutReportResponse
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ReportsApi {
    /**
     * Create a Report
     *
     * Responses:
     *  - 200: OK
     *
     * @param postRepostRequest
     * @return [PostReportsResponse]
     */
    @POST("v1/reports")
    suspend fun createReport(@Body postRepostRequest: PostRepostRequest): PostReportsResponse

    /**
     * Delete a Report
     * Only non-core reports can be deleted.
     * Responses:
     *  - 200: OK
     *
     * @param id id
     * @return [DeleteReportsResponse]
     */
    @DELETE("v1/reports/{id}")
    suspend fun deleteReport(@Path("id") id: Long): DeleteReportsResponse

    /**
     * Retrieve Report Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Request :   reports/template
     * Responses:
     *  - 200: OK
     *
     * @return [GetReportsTemplateResponse]
     */
    @GET("v1/reports/template")
    suspend fun retrieveOfficeTemplate(): GetReportsTemplateResponse

    /**
     * Retrieve a Report
     * Example Requests:  reports/1   reports/1?template&#x3D;true
     * Responses:
     *  - 200: OK
     *
     * @param id id
     * @return [GetReportsResponse]
     */
    @GET("v1/reports/{id}")
    suspend fun retrieveReport(@Path("id") id: Long): GetReportsResponse

    /**
     * List Reports
     * Lists all reports and their parameters.  Example Request:  reports
     * Responses:
     *  - 200: OK
     *
     * @return [kotlin.collections.List<GetReportsResponse]
     */
    @GET("v1/reports")
    suspend fun retrieveReportList(): List<GetReportsResponse>

    /**
     * Update a Report
     * Only the useReport description can be updated for core reports.
     * Responses:
     *  - 200: OK
     *
     * @param id id
     * @param putReportRequest
     * @return [PutReportResponse]
     */
    @PUT("v1/reports/{id}")
    suspend fun updateReport(
        @Path("id") id: Long,
        @Body putReportRequest: PutReportRequest
    ): PutReportResponse

}
