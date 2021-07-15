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

import org.apache.fineract.client.models.DeleteFinancialActivityAccountsResponse;
import org.apache.fineract.client.models.GetFinancialActivityAccountsResponse;
import org.apache.fineract.client.models.PostFinancialActivityAccountsRequest;
import org.apache.fineract.client.models.PostFinancialActivityAccountsResponse;
import org.apache.fineract.client.models.PutFinancialActivityAccountsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface MappingFinancialActivitiesToAccountsApi {
  /**
   * Create a new Financial Activity to Accounts Mapping
   * Mandatory Fields financialActivityId, glAccountId
   * @param postFinancialActivityAccountsRequest  (optional)
   * @return Observable&lt;PostFinancialActivityAccountsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("financialactivityaccounts")
  Observable<PostFinancialActivityAccountsResponse> createGLAccount(
    @retrofit2.http.Body PostFinancialActivityAccountsRequest postFinancialActivityAccountsRequest
  );

  /**
   * Delete a Financial Activity to Account Mapping
   * 
   * @param mappingId mappingId (required)
   * @return Observable&lt;DeleteFinancialActivityAccountsResponse&gt;
   */
  @DELETE("financialactivityaccounts/{mappingId}")
  Observable<DeleteFinancialActivityAccountsResponse> deleteGLAccount(
    @retrofit2.http.Path("mappingId") Long mappingId
  );

  /**
   * Retrieve a Financial Activity to Account Mapping 
   * Example Requests:  financialactivityaccounts/1
   * @param mappingId mappingId (required)
   * @return Observable&lt;GetFinancialActivityAccountsResponse&gt;
   */
  @GET("financialactivityaccounts/{mappingId}")
  Observable<GetFinancialActivityAccountsResponse> retreive(
    @retrofit2.http.Path("mappingId") Long mappingId
  );

  /**
   * List Financial Activities to Accounts Mappings
   * Example Requests:  financialactivityaccounts
   * @return Observable&lt;List&lt;GetFinancialActivityAccountsResponse&gt;&gt;
   */
  @GET("financialactivityaccounts")
  Observable<List<GetFinancialActivityAccountsResponse>> retrieveAll();
    

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("financialactivityaccounts/template")
  Observable<String> retrieveTemplate();
    

  /**
   * Update a Financial Activity to Account Mapping
   * the API updates the Ledger account linked to a Financial Activity  
   * @param mappingId mappingId (required)
   * @param postFinancialActivityAccountsRequest  (optional)
   * @return Observable&lt;PutFinancialActivityAccountsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("financialactivityaccounts/{mappingId}")
  Observable<PutFinancialActivityAccountsResponse> updateGLAccount(
    @retrofit2.http.Path("mappingId") Long mappingId, @retrofit2.http.Body PostFinancialActivityAccountsRequest postFinancialActivityAccountsRequest
  );

}
