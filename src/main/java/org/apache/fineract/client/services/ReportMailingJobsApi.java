/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.fineract.client.services;

import org.apache.fineract.client.CollectionFormats.*;

import io.reactivex.Observable;
import io.reactivex.Completable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteReportMailingJobsResponse;
import org.apache.fineract.client.models.GetReportMailingJobsResponse;
import org.apache.fineract.client.models.GetReportMailingJobsTemplate;
import org.apache.fineract.client.models.PostReportMailingJobsRequest;
import org.apache.fineract.client.models.PostReportMailingJobsResponse;
import org.apache.fineract.client.models.PutReportMailingJobsRequest;
import org.apache.fineract.client.models.PutReportMailingJobsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ReportMailingJobsApi {
  /**
   * Create a Report Mailing Job
   * Mandatory Fields: name, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, emailAttachmentFileFormatId, recurrence, isActive  Optional Fields: description, stretchyReportParamMap
   * @param postReportMailingJobsRequest  (required)
   * @return Observable&lt;PostReportMailingJobsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("reportmailingjobs")
  Observable<PostReportMailingJobsResponse> createReportMailingJob(
    @retrofit2.http.Body PostReportMailingJobsRequest postReportMailingJobsRequest
  );

  /**
   * Delete a Report Mailing Job
   * 
   * @param entityId entityId (required)
   * @param body  (required)
   * @return Observable&lt;DeleteReportMailingJobsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("reportmailingjobs/{entityId}")
  Observable<DeleteReportMailingJobsResponse> deleteReportMailingJob(
    @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body Object body
  );

  /**
   * List Report Mailing Jobs
   * Example Requests:  reportmailingjobs
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @return Observable&lt;List&lt;GetReportMailingJobsResponse&gt;&gt;
   */
  @GET("reportmailingjobs")
  Observable<List<GetReportMailingJobsResponse>> retrieveAllReportMailingJobs(
    @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * Retrieve a Report Mailing Job
   * Example Requests:  reportmailingjobs/1   reportmailingjobs/1?template&#x3D;true
   * @param entityId entityId (required)
   * @return Observable&lt;GetReportMailingJobsResponse&gt;
   */
  @GET("reportmailingjobs/{entityId}")
  Observable<GetReportMailingJobsResponse> retrieveReportMailingJob(
    @retrofit2.http.Path("entityId") Long entityId
  );

  /**
   * Retrieve Report Mailing Job Details Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for report mailing job applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  reportmailingjobs/template
   * @return Observable&lt;GetReportMailingJobsTemplate&gt;
   */
  @GET("reportmailingjobs/template")
  Observable<GetReportMailingJobsTemplate> retrieveReportMailingJobTemplate();
    

  /**
   * Update a Report Mailing Job 
   * 
   * @param entityId entityId (required)
   * @param putReportMailingJobsRequest  (required)
   * @return Observable&lt;PutReportMailingJobsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("reportmailingjobs/{entityId}")
  Observable<PutReportMailingJobsResponse> updateReportMailingJob(
    @retrofit2.http.Path("entityId") Long entityId, @retrofit2.http.Body PutReportMailingJobsRequest putReportMailingJobsRequest
  );

}
