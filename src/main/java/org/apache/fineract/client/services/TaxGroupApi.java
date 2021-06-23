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

import org.apache.fineract.client.models.GetTaxesGroupResponse;
import org.apache.fineract.client.models.PostTaxesGroupRequest;
import org.apache.fineract.client.models.PostTaxesGroupResponse;
import org.apache.fineract.client.models.PutTaxesGroupTaxGroupIdRequest;
import org.apache.fineract.client.models.PutTaxesGroupTaxGroupIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface TaxGroupApi {
  /**
   * Create a new Tax Group
   * Create a new Tax Group Mandatory Fields: name and taxComponents Mandatory Fields in taxComponents: taxComponentId Optional Fields in taxComponents: id, startDate and endDate
   * @param postTaxesGroupRequest  (required)
   * @return Observable&lt;PostTaxesGroupResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("taxes/group")
  Observable<PostTaxesGroupResponse> createTaxGroup(
    @retrofit2.http.Body PostTaxesGroupRequest postTaxesGroupRequest
  );

  /**
   * List Tax Group
   * List Tax Group
   * @return Observable&lt;List&lt;GetTaxesGroupResponse&gt;&gt;
   */
  @GET("taxes/group")
  Observable<List<GetTaxesGroupResponse>> retrieveAllTaxGroups();
    

  /**
   * Retrieve Tax Group
   * Retrieve Tax Group
   * @param taxGroupId taxGroupId (required)
   * @return Observable&lt;GetTaxesGroupResponse&gt;
   */
  @GET("taxes/group/{taxGroupId}")
  Observable<GetTaxesGroupResponse> retrieveTaxGroup(
    @retrofit2.http.Path("taxGroupId") Long taxGroupId
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("taxes/group/template")
  Observable<String> retrieveTemplate21();
    

  /**
   * Update Tax Group
   * Updates Tax Group. Only end date can be up-datable and can insert new tax components.
   * @param taxGroupId taxGroupId (required)
   * @param putTaxesGroupTaxGroupIdRequest  (required)
   * @return Observable&lt;PutTaxesGroupTaxGroupIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("taxes/group/{taxGroupId}")
  Observable<PutTaxesGroupTaxGroupIdResponse> updateTaxGroup(
    @retrofit2.http.Path("taxGroupId") Long taxGroupId, @retrofit2.http.Body PutTaxesGroupTaxGroupIdRequest putTaxesGroupTaxGroupIdRequest
  );

}
