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

import org.apache.fineract.client.models.GetTaxesComponentsResponse;
import org.apache.fineract.client.models.PostTaxesComponentsRequest;
import org.apache.fineract.client.models.PostTaxesComponentsResponse;
import org.apache.fineract.client.models.PutTaxesComponentsTaxComponentIdRequest;
import org.apache.fineract.client.models.PutTaxesComponentsTaxComponentIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TaxComponentsApi {
  /**
   * Create a new Tax Component
   * Creates a new Tax Component  Mandatory Fields: name, percentage  Optional Fields: debitAccountType, debitAcountId, creditAccountType, creditAcountId, startDate
   * @param postTaxesComponentsRequest  (required)
   * @return Observable&lt;PostTaxesComponentsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("taxes/component")
  Observable<PostTaxesComponentsResponse> createTaxCompoent(
    @retrofit2.http.Body PostTaxesComponentsRequest postTaxesComponentsRequest
  );

  /**
   * List Tax Components
   * List Tax Components
   * @return Observable&lt;List&lt;GetTaxesComponentsResponse&gt;&gt;
   */
  @GET("taxes/component")
  Observable<List<GetTaxesComponentsResponse>> retrieveAllTaxComponents();
    

  /**
   * Retrieve Tax Component
   * Retrieve Tax Component
   * @param taxComponentId taxComponentId (required)
   * @return Observable&lt;GetTaxesComponentsResponse&gt;
   */
  @GET("taxes/component/{taxComponentId}")
  Observable<GetTaxesComponentsResponse> retrieveTaxComponent(
    @retrofit2.http.Path("taxComponentId") Long taxComponentId
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("taxes/component/template")
  Observable<String> retrieveTemplate20();
    

  /**
   * Update Tax Component
   * Updates Tax component. Debit and credit account details cannot be modified. All the future tax components would be replaced with the new percentage.
   * @param taxComponentId taxComponentId (required)
   * @param putTaxesComponentsTaxComponentIdRequest  (required)
   * @return Observable&lt;PutTaxesComponentsTaxComponentIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("taxes/component/{taxComponentId}")
  Observable<PutTaxesComponentsTaxComponentIdResponse> updateTaxCompoent(
    @retrofit2.http.Path("taxComponentId") Long taxComponentId, @retrofit2.http.Body PutTaxesComponentsTaxComponentIdRequest putTaxesComponentsTaxComponentIdRequest
  );

}
