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
import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.MultipartBody;

import org.apache.fineract.client.models.GetFloatingRatesFloatingRateIdResponse;
import org.apache.fineract.client.models.GetFloatingRatesResponse;
import org.apache.fineract.client.models.PostFloatingRatesRequest;
import org.apache.fineract.client.models.PostFloatingRatesResponse;
import org.apache.fineract.client.models.PutFloatingRatesFloatingRateIdRequest;
import org.apache.fineract.client.models.PutFloatingRatesFloatingRateIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FloatingRatesApi {
  /**
   * Create a new Floating Rate
   * Creates a new Floating Rate Mandatory Fields: name Optional Fields: isBaseLendingRate, isActive, ratePeriods
   * @param postFloatingRatesRequest  (required)
   * @return Call&lt;PostFloatingRatesResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("floatingrates")
  Call<PostFloatingRatesResponse> createFloatingRate(
    @retrofit2.http.Body PostFloatingRatesRequest postFloatingRatesRequest
  );

  /**
   * List Floating Rates
   * Lists Floating Rates
   * @return Call&lt;List&lt;GetFloatingRatesResponse&gt;&gt;
   */
  @GET("floatingrates")
  Call<List<GetFloatingRatesResponse>> retrieveAll22();
    

  /**
   * Retrieve Floating Rate
   * Retrieves Floating Rate
   * @param floatingRateId floatingRateId (required)
   * @return Call&lt;GetFloatingRatesFloatingRateIdResponse&gt;
   */
  @GET("floatingrates/{floatingRateId}")
  Call<GetFloatingRatesFloatingRateIdResponse> retrieveOne12(
    @retrofit2.http.Path("floatingRateId") Long floatingRateId
  );

  /**
   * Update Floating Rate
   * Updates new Floating Rate. Rate Periods in the past cannot be modified. All the future rateperiods would be replaced with the new ratePeriods data sent.
   * @param floatingRateId floatingRateId (required)
   * @param putFloatingRatesFloatingRateIdRequest  (required)
   * @return Call&lt;PutFloatingRatesFloatingRateIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("floatingrates/{floatingRateId}")
  Call<PutFloatingRatesFloatingRateIdResponse> updateFloatingRate(
    @retrofit2.http.Path("floatingRateId") Long floatingRateId, @retrofit2.http.Body PutFloatingRatesFloatingRateIdRequest putFloatingRatesFloatingRateIdRequest
  );

}
