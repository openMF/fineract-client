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

import org.apache.fineract.client.models.DeleteGLAccountsRequest;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetGLAccountsResponse;
import org.apache.fineract.client.models.GetGLAccountsTemplateResponse;
import org.apache.fineract.client.models.PostGLAccountsRequest;
import org.apache.fineract.client.models.PostGLAccountsResponse;
import org.apache.fineract.client.models.PutGLAccountsRequest;
import org.apache.fineract.client.models.PutGLAccountsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GeneralLedgerAccountApi {
  /**
   * Create a General Ledger Account
   * Note: You may optionally create Hierarchical Chart of Accounts by using the \&quot;parentId\&quot; property of an Account Mandatory Fields:  name, glCode, type, usage and manualEntriesAllowed
   * @param postGLAccountsRequest  (optional)
   * @return Call&lt;PostGLAccountsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("glaccounts")
  Call<PostGLAccountsResponse> createGLAccount1(
    @retrofit2.http.Body PostGLAccountsRequest postGLAccountsRequest
  );

  /**
   * Delete an accounting closure
   * Note: Only the latest accounting closure associated with a branch may be deleted.
   * @param glAccountId glAccountId (required)
   * @return Call&lt;DeleteGLAccountsRequest&gt;
   */
  @DELETE("glaccounts/{glAccountId}")
  Call<DeleteGLAccountsRequest> deleteGLAccount1(
    @retrofit2.http.Path("glAccountId") Long glAccountId
  );

  /**
   * 
   * 
   * @param dateFormat  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("glaccounts/downloadtemplate")
  Call<Void> getGlAccountsTemplate(
    @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("glaccounts/uploadtemplate")
  Call<String> postGlAccountsTemplate(
    @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * Retrieve a General Ledger Account
   * Example Requests:  glaccounts/1   glaccounts/1?template&#x3D;true   glaccounts/1?fields&#x3D;name,glCode   glaccounts/1?fetchRunningBalance&#x3D;true
   * @param glAccountId glAccountId (required)
   * @param fetchRunningBalance fetchRunningBalance (optional)
   * @return Call&lt;GetGLAccountsResponse&gt;
   */
  @GET("glaccounts/{glAccountId}")
  Call<GetGLAccountsResponse> retreiveAccount(
    @retrofit2.http.Path("glAccountId") Long glAccountId, @retrofit2.http.Query("fetchRunningBalance") Boolean fetchRunningBalance
  );

  /**
   * List General Ledger Accounts
   * ARGUMENTS type Integer optional manualEntriesAllowed boolean optional usage Integer optional disabled boolean optional parentId Long optional tagId Long optional Example Requests:  glaccounts   glaccounts?type&#x3D;1&amp;manualEntriesAllowed&#x3D;true&amp;usage&#x3D;1&amp;disabled&#x3D;false  glaccounts?fetchRunningBalance&#x3D;true
   * @param type type (optional)
   * @param searchParam searchParam (optional)
   * @param usage usage (optional)
   * @param manualEntriesAllowed manualEntriesAllowed (optional)
   * @param disabled disabled (optional)
   * @param fetchRunningBalance fetchRunningBalance (optional)
   * @return Call&lt;List&lt;GetGLAccountsResponse&gt;&gt;
   */
  @GET("glaccounts")
  Call<List<GetGLAccountsResponse>> retrieveAllAccounts(
    @retrofit2.http.Query("type") Integer type, @retrofit2.http.Query("searchParam") String searchParam, @retrofit2.http.Query("usage") Integer usage, @retrofit2.http.Query("manualEntriesAllowed") Boolean manualEntriesAllowed, @retrofit2.http.Query("disabled") Boolean disabled, @retrofit2.http.Query("fetchRunningBalance") Boolean fetchRunningBalance
  );

  /**
   * Retrieve GL Accounts Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  glaccounts/template glaccounts/template?type&#x3D;1  type is optional and integer value from 1 to 5.  1.Assets  2.Liabilities  3.Equity  4.Income  5.Expenses
   * @param type type (optional)
   * @return Call&lt;GetGLAccountsTemplateResponse&gt;
   */
  @GET("glaccounts/template")
  Call<GetGLAccountsTemplateResponse> retrieveNewAccountDetails(
    @retrofit2.http.Query("type") Integer type
  );

  /**
   * Update an Accounting closure
   * Once an accounting closure is created, only the comments associated with it may be edited  
   * @param glAccountId glAccountId (required)
   * @param putGLAccountsRequest  (optional)
   * @return Call&lt;PutGLAccountsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("glaccounts/{glAccountId}")
  Call<PutGLAccountsResponse> updateGLAccount1(
    @retrofit2.http.Path("glAccountId") Long glAccountId, @retrofit2.http.Body PutGLAccountsRequest putGLAccountsRequest
  );

}
