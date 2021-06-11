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

import org.apache.fineract.client.models.DeleteFixedDepositAccountsAccountIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetFixedDepositAccountsAccountIdResponse;
import org.apache.fineract.client.models.GetFixedDepositAccountsResponse;
import org.apache.fineract.client.models.GetFixedDepositAccountsTemplateResponse;
import org.apache.fineract.client.models.PostFixedDepositAccountsAccountIdResponse;
import org.apache.fineract.client.models.PostFixedDepositAccountsRequest;
import org.apache.fineract.client.models.PostFixedDepositAccountsResponse;
import org.apache.fineract.client.models.PutFixedDepositAccountsAccountIdRequest;
import org.apache.fineract.client.models.PutFixedDepositAccountsAccountIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FixedDepositAccountApi {
  /**
   * 
   * 
   * @param accountId accountId (required)
   * @param command command (optional)
   * @return Call&lt;String&gt;
   */
  @GET("fixeddepositaccounts/{accountId}/template")
  Call<String> accountClosureTemplate(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("command") String command
  );

  /**
   * Delete a fixed deposit application
   * At present we support hard delete of fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the fixed deposit account.
   * @param accountId accountId (required)
   * @return Call&lt;DeleteFixedDepositAccountsAccountIdResponse&gt;
   */
  @DELETE("fixeddepositaccounts/{accountId}")
  Call<DeleteFixedDepositAccountsAccountIdResponse> delete14(
    @retrofit2.http.Path("accountId") Long accountId
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param staffId  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("fixeddepositaccounts/downloadtemplate")
  Call<Void> getFixedDepositTemplate(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("fixeddepositaccounts/transaction/downloadtemplate")
  Call<Void> getFixedDepositTransactionTemplate(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * Approve fixed deposit application | Undo approval fixed deposit application | Reject fixed deposit application | Withdraw fixed deposit application | Activate a fixed deposit account | Close a fixed deposit account | Premature Close a fixed deposit account | Calculate Premature amount on Fixed deposit account | Calculate Interest on Fixed Deposit Account | Post Interest on Fixed Deposit Account
   * Approve fixed deposit application:  Approves fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval fixed deposit application:  Will move &#39;approved&#39; fixed deposit application back to &#39;Submitted and pending approval&#39; state.  Reject fixed deposit application:  Rejects fixed deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw fixed deposit application:  Used when an applicant withdraws from the fixed deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Close a fixed deposit account:  Results in a Matured fixed deposit account being converted into a &#39;closed&#39; fixed deposit account.  Premature Close a fixed deposit account:  Results in an Active fixed deposit account being converted into a &#39;Premature Closed&#39; fixed deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  Calculate Premature amount on Fixed deposit account:  Calculate premature amount on fixed deposit account till premature close date. Premature amount is calculated based on interest chart and penal interest applicable.  Calculate Interest on Fixed Deposit Account:  Calculates interest earned on a fixed deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on Fixed Deposit Account:  Calculates and Posts interest earned on a fixed deposit account based on today&#39;s date and whether an interest posting or crediting event is due.  Showing request/response for Calculate Interest on Fixed Deposit Account
   * @param accountId accountId (required)
   * @param body  (required)
   * @param command command (optional)
   * @return Call&lt;PostFixedDepositAccountsAccountIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fixeddepositaccounts/{accountId}")
  Call<PostFixedDepositAccountsAccountIdResponse> handleCommands4(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Body Object body, @retrofit2.http.Query("command") String command
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
  @POST("fixeddepositaccounts/uploadtemplate")
  Call<String> postFixedDepositTemplate(
    @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
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
  @POST("fixeddepositaccounts/transaction/uploadtemplate")
  Call<String> postFixedDepositTransactionTemplate(
    @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * List Fixed deposit applications/accounts
   * Lists Fixed Deposit Accounts  Example Requests:    fixeddepositaccounts    fixeddepositaccounts?fields&#x3D;name
   * @param paged paged (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @return Call&lt;List&lt;GetFixedDepositAccountsResponse&gt;&gt;
   */
  @GET("fixeddepositaccounts")
  Call<List<GetFixedDepositAccountsResponse>> retrieveAll29(
    @retrofit2.http.Query("paged") Boolean paged, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * Retrieve a fixed deposit application/account
   * Retrieves a fixed deposit application/account  Example Requests :    fixeddepositaccounts/1  fixeddepositaccounts/1?associations&#x3D;all
   * @param accountId accountId (required)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @param chargeStatus chargeStatus (optional, default to &quot;all&quot;)
   * @return Call&lt;GetFixedDepositAccountsAccountIdResponse&gt;
   */
  @GET("fixeddepositaccounts/{accountId}")
  Call<GetFixedDepositAccountsAccountIdResponse> retrieveOne18(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly, @retrofit2.http.Query("chargeStatus") String chargeStatus
  );

  /**
   * Submit new fixed deposit application
   * Submits a new fixed deposit applicationMandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )
   * @param postFixedDepositAccountsRequest  (required)
   * @return Call&lt;PostFixedDepositAccountsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fixeddepositaccounts")
  Call<PostFixedDepositAccountsResponse> submitApplication(
    @retrofit2.http.Body PostFixedDepositAccountsRequest postFixedDepositAccountsRequest
  );

  /**
   * Retrieve Fixed Deposit Account Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for fixed deposit applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value ListsExample Requests:    fixeddepositaccounts/template?clientId&#x3D;1
   * @param clientId clientId (optional)
   * @param groupId groupId (optional)
   * @param productId productId (optional)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @return Call&lt;GetFixedDepositAccountsTemplateResponse&gt;
   */
  @GET("fixeddepositaccounts/template")
  Call<GetFixedDepositAccountsTemplateResponse> template12(
    @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("groupId") Long groupId, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly
  );

  /**
   * Modify a fixed deposit application
   * Fixed deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
   * @param accountId accountId (required)
   * @param putFixedDepositAccountsAccountIdRequest  (required)
   * @return Call&lt;PutFixedDepositAccountsAccountIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("fixeddepositaccounts/{accountId}")
  Call<PutFixedDepositAccountsAccountIdResponse> update15(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Body PutFixedDepositAccountsAccountIdRequest putFixedDepositAccountsAccountIdRequest
  );

}
