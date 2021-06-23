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

import org.apache.fineract.client.models.GetShareAccountsClientIdProductIdResponse;
import org.apache.fineract.client.models.PostNewShareApplicationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfShareAccountsApi {
  /**
   * Submit new share application
   * Mandatory fields:  clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate   Optional Fields  accountNo, externalId   Inherited from Product (if not provided)  minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType.
   * @param body  (optional)
   * @return Observable&lt;List&lt;PostNewShareApplicationResponse&gt;&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("self/shareaccounts")
  Observable<List<PostNewShareApplicationResponse>> createAccount1(
    @retrofit2.http.Body String body
  );

  /**
   * Retrieve a share application/account
   *    Example Requests:  self/shareaccounts/12 
   * @param accountId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("self/shareaccounts/{accountId}")
  Observable<String> retrieveShareAccount(
    @retrofit2.http.Path("accountId") Long accountId
  );

  /**
   * Retrieve Share Account Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of: Field Defaults  Allowed Value Lists   Arguments  clientId:Integer mandatory productId:Integer optionalIf entered, productId, productName and selectedProduct fields are returned. Example Requests:  self/shareaccounts/template?clientId&#x3D;14  self/shareaccounts/template?clientId&#x3D;14&amp;productId&#x3D;3 
   * @param clientId  (optional)
   * @param productId  (optional)
   * @return Observable&lt;List&lt;GetShareAccountsClientIdProductIdResponse&gt;&gt;
   */
  @GET("self/shareaccounts/template")
  Observable<List<GetShareAccountsClientIdProductIdResponse>> template19(
    @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("productId") Long productId
  );

}
