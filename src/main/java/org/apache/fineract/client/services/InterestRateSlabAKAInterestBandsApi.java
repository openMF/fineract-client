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

import org.apache.fineract.client.models.DeleteInterestRateChartsChartIdChartSlabsResponse;
import org.apache.fineract.client.models.GetInterestRateChartsChartIdChartSlabsResponse;
import org.apache.fineract.client.models.PostInterestRateChartsChartIdChartSlabsRequest;
import org.apache.fineract.client.models.PostInterestRateChartsChartIdChartSlabsResponse;
import org.apache.fineract.client.models.PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest;
import org.apache.fineract.client.models.PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface InterestRateSlabAKAInterestBandsApi {
  /**
   * Create a Slab
   * Creates a new interest rate slab for an interest rate chart. Mandatory Fields periodType, fromPeriod, annualInterestRate Optional Fields toPeriod and description Example Requests:  interestratecharts/1/chartslabs
   * @param chartId chartId (required)
   * @param postInterestRateChartsChartIdChartSlabsRequest  (required)
   * @return Observable&lt;PostInterestRateChartsChartIdChartSlabsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interestratecharts/{chartId}/chartslabs")
  Observable<PostInterestRateChartsChartIdChartSlabsResponse> create9(
    @retrofit2.http.Path("chartId") Long chartId, @retrofit2.http.Body PostInterestRateChartsChartIdChartSlabsRequest postInterestRateChartsChartIdChartSlabsRequest
  );

  /**
   * Delete a Slab
   * Delete a Slab from a chart
   * @param chartId chartId (required)
   * @param chartSlabId chartSlabId (required)
   * @return Observable&lt;DeleteInterestRateChartsChartIdChartSlabsResponse&gt;
   */
  @DELETE("interestratecharts/{chartId}/chartslabs/{chartSlabId}")
  Observable<DeleteInterestRateChartsChartIdChartSlabsResponse> delete12(
    @retrofit2.http.Path("chartId") Long chartId, @retrofit2.http.Path("chartSlabId") Long chartSlabId
  );

  /**
   * Retrieve all Slabs
   * Retrieve list of slabs associated with a chart  Example Requests:  interestratecharts/1/chartslabs
   * @param chartId chartId (required)
   * @return Observable&lt;List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;&gt;
   */
  @GET("interestratecharts/{chartId}/chartslabs")
  Observable<List<GetInterestRateChartsChartIdChartSlabsResponse>> retrieveAll25(
    @retrofit2.http.Path("chartId") Long chartId
  );

  /**
   * Retrieve a Slab
   * Retrieve a slab associated with an Interest rate chart  Example Requests:  interestratecharts/1/chartslabs/1 
   * @param chartId chartId (required)
   * @param chartSlabId chartSlabId (required)
   * @return Observable&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;
   */
  @GET("interestratecharts/{chartId}/chartslabs/{chartSlabId}")
  Observable<GetInterestRateChartsChartIdChartSlabsResponse> retrieveOne15(
    @retrofit2.http.Path("chartId") Long chartId, @retrofit2.http.Path("chartSlabId") Long chartSlabId
  );

  /**
   * 
   * 
   * @param chartId chartId (required)
   * @return Observable&lt;String&gt;
   */
  @GET("interestratecharts/{chartId}/chartslabs/template")
  Observable<String> template8(
    @retrofit2.http.Path("chartId") Long chartId
  );

  /**
   * Update a Slab
   * It updates the Slab from chart
   * @param chartId chartId (required)
   * @param chartSlabId chartSlabId (required)
   * @param putInterestRateChartsChartIdChartSlabsChartSlabIdRequest  (required)
   * @return Observable&lt;PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("interestratecharts/{chartId}/chartslabs/{chartSlabId}")
  Observable<PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse> update13(
    @retrofit2.http.Path("chartId") Long chartId, @retrofit2.http.Path("chartSlabId") Long chartSlabId, @retrofit2.http.Body PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest putInterestRateChartsChartIdChartSlabsChartSlabIdRequest
  );

}
