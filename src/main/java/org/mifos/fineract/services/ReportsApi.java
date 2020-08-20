package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

public interface ReportsApi {
    /**
     * Create a Report
     *
     * @param body body (required)
     * @return Call&lt;PostReportsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("reports")
    Call<PostReportsResponse> createReport(
            @retrofit2.http.Body PostRepostRequest body
    );

    /**
     * Delete a Report
     * Only non-core reports can be deleted.
     *
     * @param id id (required)
     * @return Call&lt;DeleteReportsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("reports/{id}")
    Call<DeleteReportsResponse> deleteReport(
            @retrofit2.http.Path("id") Long id
    );

    /**
     * Retrieve Report Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request :   reports/template
     *
     * @return Call&lt;GetReportsTemplateResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("reports/template")
    Call<GetReportsTemplateResponse> retrieveOfficeTemplate();


    /**
     * Retrieve a Report
     * Example Requests:  reports/1   reports/1?template&#x3D;true
     *
     * @param id id (required)
     * @return Call&lt;GetReportsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("reports/{id}")
    Call<GetReportsResponse> retrieveReport(
            @retrofit2.http.Path("id") Long id
    );

    /**
     * List Reports
     * Lists all reports and their parameters.  Example Request:  reports
     *
     * @return Call&lt;Void&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("reports")
    Call<Void> retrieveReportList();


    /**
     * Update a Report
     * Only the useReport value can be updated for core reports.
     *
     * @param id   id (required)
     * @param body body (required)
     * @return Call&lt;PutReportResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("reports/{id}")
    Call<PutReportResponse> updateReport(
            @retrofit2.http.Path("id") Long id, @retrofit2.http.Body PutReportRequest body
    );

}
