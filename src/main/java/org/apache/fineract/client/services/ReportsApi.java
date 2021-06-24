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

import rx.Observable;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.DeleteReportsResponse;
import org.apache.fineract.client.models.GetReportsResponse;
import org.apache.fineract.client.models.GetReportsTemplateResponse;
import org.apache.fineract.client.models.PostReportsResponse;
import org.apache.fineract.client.models.PostRepostRequest;
import org.apache.fineract.client.models.PutReportRequest;
import org.apache.fineract.client.models.PutReportResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ReportsApi {
  /**
   * Create a Report
   * 
   * @param postRepostRequest  (required)
   * @return Observable&lt;PostReportsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("reports")
  Observable<PostReportsResponse> createReport(
    @retrofit2.http.Body PostRepostRequest postRepostRequest
  );

  /**
   * Delete a Report
   * Only non-core reports can be deleted.
   * @param id id (required)
   * @return Observable&lt;DeleteReportsResponse&gt;
   */
  @DELETE("reports/{id}")
  Observable<DeleteReportsResponse> deleteReport(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * Retrieve Report Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Request :   reports/template
   * @return Observable&lt;GetReportsTemplateResponse&gt;
   */
  @GET("reports/template")
  Observable<GetReportsTemplateResponse> retrieveOfficeTemplate();
    

  /**
   * Retrieve a Report 
   * Example Requests:  reports/1   reports/1?template&#x3D;true
   * @param id id (required)
   * @return Observable&lt;GetReportsResponse&gt;
   */
  @GET("reports/{id}")
  Observable<GetReportsResponse> retrieveReport(
    @retrofit2.http.Path("id") Long id
  );

  /**
   * List Reports
   * Lists all reports and their parameters.  Example Request:  reports
   * @return Observable&lt;List&lt;GetReportsResponse&gt;&gt;
   */
  @GET("reports")
  Observable<List<GetReportsResponse>> retrieveReportList();
    

  /**
   * Update a Report
   * Only the useReport description can be updated for core reports.
   * @param id id (required)
   * @param putReportRequest  (required)
   * @return Observable&lt;PutReportResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("reports/{id}")
  Observable<PutReportResponse> updateReport(
    @retrofit2.http.Path("id") Long id, @retrofit2.http.Body PutReportRequest putReportRequest
  );

}
