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

import org.apache.fineract.client.models.GetSearchResponse;
import org.apache.fineract.client.models.PostAdhocQuerySearchRequest;
import org.apache.fineract.client.models.PostAdhocQuerySearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SearchApiApi {
  /**
   * Adhoc query search
   * AdHocQuery search has more search options, it is a POST request, it uses request body to send search parameters   Mandatory fields:entities  Optional fields:loanStatus, loanProducts, offices, loanDateOption, loanFromDate, loanToDate,  includeOutStandingAmountPercentage, outStandingAmountPercentageCondition,  minOutStandingAmountPercentage and maxOutStandingAmountPercentage OR outStandingAmountPercentage,  includeOutstandingAmount, outstandingAmountCondition,  minOutstandingAmount and maxOutstandingAmount OR outstandingAmount
   * @param postAdhocQuerySearchRequest  (required)
   * @return Observable&lt;PostAdhocQuerySearchResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("search/advance")
  Observable<PostAdhocQuerySearchResponse> advancedSearch(
    @retrofit2.http.Body PostAdhocQuerySearchRequest postAdhocQuerySearchRequest
  );

  /**
   * Retrive Adhoc Search query template
   * Mandatory Fields  search?query&#x3D;000000001 
   * @return Observable&lt;GetSearchResponse&gt;
   */
  @GET("search/template")
  Observable<GetSearchResponse> retrieveAdHocSearchQueryTemplate();
    

  /**
   * Search Resources
   * Example Requests:  search?query&#x3D;000000001   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups   search?query&#x3D;Petra&amp;resource&#x3D;clients,groups&amp;exactMatch&#x3D;true
   * @param query query (optional)
   * @param resource resource (optional)
   * @param exactMatch exactMatch (optional, default to false)
   * @return Observable&lt;GetSearchResponse&gt;
   */
  @GET("search")
  Observable<GetSearchResponse> searchData(
    @retrofit2.http.Query("query") String query, @retrofit2.http.Query("resource") String resource, @retrofit2.http.Query("exactMatch") Boolean exactMatch
  );

}
