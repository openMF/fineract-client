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

import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetAccountsTypeAccountIdResponse;
import org.apache.fineract.client.models.GetAccountsTypeResponse;
import org.apache.fineract.client.models.GetAccountsTypeTemplateResponse;
import org.apache.fineract.client.models.PostAccountsTypeAccountIdRequest;
import org.apache.fineract.client.models.PostAccountsTypeAccountIdResponse;
import org.apache.fineract.client.models.PostAccountsTypeRequest;
import org.apache.fineract.client.models.PostAccountsTypeResponse;
import org.apache.fineract.client.models.PutAccountsTypeAccountIdRequest;
import org.apache.fineract.client.models.PutAccountsTypeAccountIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ShareAccountApi {
  /**
   * Submit new share application
   * Submits new share application  Mandatory Fields: clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate  Optional Fields: accountNo, externalId  Inherited from Product (if not provided): minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType
   * @param type type (required)
   * @param postAccountsTypeRequest  (required)
   * @return Observable&lt;PostAccountsTypeResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("accounts/{type}")
  Observable<PostAccountsTypeResponse> createAccount(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Body PostAccountsTypeRequest postAccountsTypeRequest
  );

  /**
   * 
   * 
   * @param type type (required)
   * @param officeId  (optional)
   * @param dateFormat  (optional)
   * @return Completable
   */
  @GET("accounts/{type}/downloadtemplate")
  Completable getSharedAccountsTemplate(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account
   * Approve share application:  Approves share application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval share application:  Will move &#39;approved&#39; share application back to &#39;Submitted and pending approval&#39; state.  Reject share application:  Rejects share application so long as its in &#39;Submitted and pending approval&#39; state.  Activate a share account:  Results in an approved share application being converted into an &#39;active&#39; share account.  Close a share account:  Results in an Activated share application being converted into an &#39;closed&#39; share account.  closedDate is closure date of share account  Mandatory Fields: dateFormat,locale,closedDate  Apply additional shares on a share account:  requestedDate is requsted date of share purchase  requestedShares is number of shares to be purchase  Mandatory Fields: dateFormat,locale,requestedDate, requestedShares  Approve additional shares request on a share account  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Reject additional shares request on a share account:  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Redeem shares on a share account:  Results redeem some/all shares from share account.  requestedDate is requsted date of shares redeem  requestedShares is number of shares to be redeemed  Mandatory Fields: dateFormat,locale,requestedDate,requestedShares  Showing request/response for &#39;Reject additional shares request on a share account&#39;  For more info visit this link - https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#shareaccounts
   * @param type type (required)
   * @param accountId accountId (required)
   * @param postAccountsTypeAccountIdRequest  (required)
   * @param command command (optional)
   * @return Observable&lt;PostAccountsTypeAccountIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("accounts/{type}/{accountId}")
  Observable<PostAccountsTypeAccountIdResponse> handleCommands2(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Body PostAccountsTypeAccountIdRequest postAccountsTypeAccountIdRequest, @retrofit2.http.Query("command") String command
  );

  /**
   * 
   * 
   * @param type type (required)
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Observable&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("accounts/{type}/uploadtemplate")
  Observable<String> postSharedAccountsTemplate(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * Retrieve a share application/account
   * Retrieves a share application/account  Example Requests :  shareaccount/1
   * @param accountId accountId (required)
   * @param type type (required)
   * @return Observable&lt;GetAccountsTypeAccountIdResponse&gt;
   */
  @GET("accounts/{type}/{accountId}")
  Observable<GetAccountsTypeAccountIdResponse> retrieveAccount(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Path("type") String type
  );

  /**
   * List share applications/accounts
   * Lists share applications/accounts  Example Requests:  shareaccount
   * @param type type (required)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @return Observable&lt;GetAccountsTypeResponse&gt;
   */
  @GET("accounts/{type}")
  Observable<GetAccountsTypeResponse> retrieveAllAccounts1(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * Retrieve Share Account Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  accounts/share/template?clientId&#x3D;1   accounts/share/template?clientId&#x3D;1&amp;productId&#x3D;1
   * @param type type (required)
   * @param clientId clientId (optional)
   * @param productId productId (optional)
   * @return Observable&lt;GetAccountsTypeTemplateResponse&gt;
   */
  @GET("accounts/{type}/template")
  Observable<GetAccountsTypeTemplateResponse> template7(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("productId") Long productId
  );

  /**
   * Modify a share application
   * Share application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
   * @param type type (required)
   * @param accountId accountId (required)
   * @param putAccountsTypeAccountIdRequest  (required)
   * @return Observable&lt;PutAccountsTypeAccountIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("accounts/{type}/{accountId}")
  Observable<PutAccountsTypeAccountIdResponse> updateAccount(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Body PutAccountsTypeAccountIdRequest putAccountsTypeAccountIdRequest
  );

}
