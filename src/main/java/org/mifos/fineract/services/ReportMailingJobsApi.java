package org.mifos.fineract.services;

import org.mifos.fineract.models.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

public interface ReportMailingJobsApi {
    /**
     * Create a Report Mailing Job
     * Mandatory Fields: name, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, emailAttachmentFileFormatId, recurrence, isActive  Optional Fields: description, stretchyReportParamMap
     *
     * @param body body (required)
     * @return Call&lt;PostReportMailingJobsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @POST("reportmailingjobs")
    Call<PostReportMailingJobsResponse> createReportMailingJob(
            @retrofit2.http.Body PostReportMailingJobsRequest body
    );

    /**
     * Delete a Report Mailing Job
     *
     * @param entityId entityId (required)
     * @param body     body (required)
     * @return Call&lt;DeleteReportMailingJobsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @DELETE("reportmailingjobs/{entityId}")
    Call<DeleteReportMailingJobsResponse> deleteReportMailingJob(
            @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body DeleteReportMailingJobsRequest body
    );

    /**
     * List Report Mailing Jobs
     * Example Requests:  reportmailingjobs
     *
     * @param offset    offset (optional)
     * @param limit     limit (optional)
     * @param orderBy   orderBy (optional)
     * @param sortOrder sortOrder (optional)
     * @return Call&lt;List&lt;GetReportMailingJobsResponse&gt;&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("reportmailingjobs")
    Call<List<GetReportMailingJobsResponse>> retrieveAllReportMailingJobs(
            @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
    );

    /**
     * Retrieve a Report Mailing Job
     * Example Requests:  reportmailingjobs/1   reportmailingjobs/1?template&#x3D;true
     *
     * @param entityId entityId (required)
     * @return Call&lt;GetReportMailingJobsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("reportmailingjobs/{entityId}")
    Call<GetReportMailingJobsResponse> retrieveReportMailingJob(
            @retrofit2.http.Path("entityId") Long entityId
    );

    /**
     * Retrieve Report Mailing Job Details Template
     * This is a convenience resource. It can be useful when building maintenance user interface screens for report mailing job applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  reportmailingjobs/template
     *
     * @return Call&lt;GetReportMailingJobsTemplate&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @GET("reportmailingjobs/template")
    Call<GetReportMailingJobsTemplate> retrieveReportMailingJobTemplate();


    /**
     * Update a Report Mailing Job
     *
     * @param entityId entityId (required)
     * @param body     body (required)
     * @return Call&lt;PutReportMailingJobsResponse&gt;
     */
    @Headers({
            "Content-Type:application/json"
    })
    @PUT("reportmailingjobs/{entityId}")
    Call<PutReportMailingJobsResponse> updateReportMailingJob(
            @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body PutReportMailingJobsRequest body
    );

}
