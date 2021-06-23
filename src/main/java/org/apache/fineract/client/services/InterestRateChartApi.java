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

import org.apache.fineract.client.models.DeleteInterestRateChartsChartIdResponse;
import org.apache.fineract.client.models.GetInterestRateChartsResponse;
import org.apache.fineract.client.models.GetInterestRateChartsTemplateResponse;
import org.apache.fineract.client.models.PostInterestRateChartsRequest;
import org.apache.fineract.client.models.PostInterestRateChartsResponse;
import org.apache.fineract.client.models.PutInterestRateChartsChartIdRequest;
import org.apache.fineract.client.models.PutInterestRateChartsChartIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface InterestRateChartApi {
  /**
   * Create a Chart
   * Creates a new chart which can be attached to a term deposit products (FD or RD).
   * @param postInterestRateChartsRequest  (required)
   * @return Observable&lt;PostInterestRateChartsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interestratecharts")
  Observable<PostInterestRateChartsResponse> create10(
    @retrofit2.http.Body PostInterestRateChartsRequest postInterestRateChartsRequest
  );

  /**
   * Delete a Chart
   * It deletes the chart
   * @param chartId chartId (required)
   * @return Observable&lt;DeleteInterestRateChartsChartIdResponse&gt;
   */
  @DELETE("interestratecharts/{chartId}")
  Observable<DeleteInterestRateChartsChartIdResponse> delete13(
    @retrofit2.http.Path("chartId") Long chartId
  );

  /**
   * Retrieve all Charts
   * Retrieve list of charts associated with a term deposit product(FD or RD). Example Requests:  interestratecharts?productId&#x3D;1
   * @param productId productId (optional)
   * @return Observable&lt;List&lt;GetInterestRateChartsResponse&gt;&gt;
   */
  @GET("interestratecharts")
  Observable<List<GetInterestRateChartsResponse>> retrieveAll26(
    @retrofit2.http.Query("productId") Long productId
  );

  /**
   * Retrieve a Chart
   * It retrieves the Interest Rate Chart Example Requests:  interestratecharts/1
   * @param chartId chartId (required)
   * @return Observable&lt;GetInterestRateChartsResponse&gt;
   */
  @GET("interestratecharts/{chartId}")
  Observable<GetInterestRateChartsResponse> retrieveOne16(
    @retrofit2.http.Path("chartId") Long chartId
  );

  /**
   * Retrieve Chart Details Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for creating a chart. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  interestratecharts/template
   * @return Observable&lt;GetInterestRateChartsTemplateResponse&gt;
   */
  @GET("interestratecharts/template")
  Observable<GetInterestRateChartsTemplateResponse> template9();
    

  /**
   * Update a Chart
   * It updates the chart
   * @param chartId chartId (required)
   * @param putInterestRateChartsChartIdRequest  (required)
   * @return Observable&lt;PutInterestRateChartsChartIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("interestratecharts/{chartId}")
  Observable<PutInterestRateChartsChartIdResponse> update14(
    @retrofit2.http.Path("chartId") Long chartId, @retrofit2.http.Body PutInterestRateChartsChartIdRequest putInterestRateChartsChartIdRequest
  );

}
