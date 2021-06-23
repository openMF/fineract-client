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

import org.apache.fineract.client.models.DeleteRecurringDepositAccountsResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetRecurringDepositAccountsAccountIdResponse;
import org.apache.fineract.client.models.GetRecurringDepositAccountsResponse;
import org.apache.fineract.client.models.GetRecurringDepositAccountsTemplateResponse;
import org.apache.fineract.client.models.PostRecurringDepositAccountsAccountIdResponse;
import org.apache.fineract.client.models.PostRecurringDepositAccountsRequest;
import org.apache.fineract.client.models.PostRecurringDepositAccountsResponse;
import org.apache.fineract.client.models.PutRecurringDepositAccountsAccountIdRequest;
import org.apache.fineract.client.models.PutRecurringDepositAccountsAccountIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RecurringDepositAccountApi {
  /**
   * 
   * 
   * @param accountId accountId (required)
   * @param command command (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("recurringdepositaccounts/{accountId}/template")
  Observable<String> accountClosureTemplate1(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("command") String command
  );

  /**
   * Delete a recurring deposit application
   * At present we support hard delete of recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the recurring deposit account.
   * @param accountId accountId (required)
   * @return Observable&lt;DeleteRecurringDepositAccountsResponse&gt;
   */
  @DELETE("recurringdepositaccounts/{accountId}")
  Observable<DeleteRecurringDepositAccountsResponse> delete16(
    @retrofit2.http.Path("accountId") Long accountId
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param staffId  (optional)
   * @param dateFormat  (optional)
   * @return Completable
   */
  @GET("recurringdepositaccounts/downloadtemplate")
  Completable getRecurringDepositTemplate(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param dateFormat  (optional)
   * @return Completable
   */
  @GET("recurringdepositaccounts/transactions/downloadtemplate")
  Completable getRecurringDepositTransactionTemplate(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * Approve recurring deposit application | Undo approval recurring deposit application | Reject recurring deposit application | Withdraw recurring deposit application | Activate a recurring deposit account | Update the recommended deposit amount for a recurring deposit account | Close a recurring deposit account | Premature Close a recurring deposit account | Calculate Premature amount on Recurring deposit account | Calculate Interest on recurring Deposit Account | Post Interest on recurring Deposit Account
   * Approve recurring deposit application:  Approves recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval recurring deposit application:  Will move &#39;approved&#39; recurring deposit application back to &#39;Submitted and pending approval&#39; state.  Reject recurring deposit application  Rejects recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw recurring deposit application:  Used when an applicant withdraws from the recurring deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Activate a recurring deposit account:  Results in an approved recurring deposit application being converted into an &#39;active&#39; recurring deposit account.  Update the recommended deposit amount for a recurring deposit account:  Updates the recommended deposit amount for a RD account as on the effective date.  Close a recurring deposit account  Results in a Matured recurring deposit account being converted into a &#39;closed&#39; recurring deposit account.  On account close allowed actions are.Premature Close a recurring deposit account:  Results in an Active recurring deposit account being converted into a &#39;Premature Closed&#39; recurring deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  On account premature closure allowed actions are.  Calculate Premature amount on Recurring deposit account:  Calculate premature amount on recurring deposit till premature close date. Premature amount is calculated based on interest chart and penal interest applicable if any.  Calculate Interest on recurring Deposit Account:  Calculates interest earned on a recurring deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on recurring Deposit Account:  Calculates and Posts interest earned on a recurring deposit account based on todays date and whether an interest posting or crediting event is due.  Showing request/response for &#39;Post Interest on recurring Deposit Account&#39;
   * @param accountId accountId (required)
   * @param body  (required)
   * @param command command (optional)
   * @return Observable&lt;PostRecurringDepositAccountsAccountIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("recurringdepositaccounts/{accountId}")
  Observable<PostRecurringDepositAccountsAccountIdResponse> handleCommands5(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Body Object body, @retrofit2.http.Query("command") String command
  );

  /**
   * 
   * 
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Observable&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("recurringdepositaccounts/uploadtemplate")
  Observable<String> postRecurringDepositTemplate(
    @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @param file  (optional)
   * @param locale  (optional)
   * @param dateFormat  (optional)
   * @return Observable&lt;String&gt;
   */
  @retrofit2.http.Multipart
  @POST("recurringdepositaccounts/transactions/uploadtemplate")
  Observable<String> postRecurringDepositTransactionsTemplate(
    @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * List Recurring deposit applications/accounts
   * Lists Recurring deposit applications/accounts  Example Requests:  recurringdepositaccounts   recurringdepositaccounts?fields&#x3D;name
   * @param paged paged (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @return Observable&lt;List&lt;GetRecurringDepositAccountsResponse&gt;&gt;
   */
  @GET("recurringdepositaccounts")
  Observable<List<GetRecurringDepositAccountsResponse>> retrieveAll31(
    @retrofit2.http.Query("paged") Boolean paged, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * Retrieve a recurring deposit application/account
   * Retrieves a recurring deposit application/account  Example Requests :  recurringdepositaccounts/1   recurringdepositaccounts/1?associations&#x3D;all
   * @param accountId accountId (required)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @param chargeStatus chargeStatus (optional, default to &quot;all&quot;)
   * @return Observable&lt;GetRecurringDepositAccountsAccountIdResponse&gt;
   */
  @GET("recurringdepositaccounts/{accountId}")
  Observable<GetRecurringDepositAccountsAccountIdResponse> retrieveOne21(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly, @retrofit2.http.Query("chargeStatus") String chargeStatus
  );

  /**
   * Submit new recurring deposit application
   * Submits new recurring deposit application  Mandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )  Inherited from Product (if not provided): interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, lockinPeriodFrequency, lockinPeriodFrequencyType, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, charts, withHoldTax
   * @param postRecurringDepositAccountsRequest  (required)
   * @return Observable&lt;PostRecurringDepositAccountsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("recurringdepositaccounts")
  Observable<PostRecurringDepositAccountsResponse> submitApplication1(
    @retrofit2.http.Body PostRecurringDepositAccountsRequest postRecurringDepositAccountsRequest
  );

  /**
   * Retrieve recurring Deposit Account Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for recurring deposit applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  recurringdepositaccounts/template?clientId&#x3D;1   recurringdepositaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1
   * @param clientId clientId (optional)
   * @param groupId groupId (optional)
   * @param productId productId (optional)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @return Observable&lt;GetRecurringDepositAccountsTemplateResponse&gt;
   */
  @GET("recurringdepositaccounts/template")
  Observable<GetRecurringDepositAccountsTemplateResponse> template13(
    @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("groupId") Long groupId, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly
  );

  /**
   * Modify a recurring deposit application
   * Recurring deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc
   * @param accountId accountId (required)
   * @param putRecurringDepositAccountsAccountIdRequest  (required)
   * @return Observable&lt;PutRecurringDepositAccountsAccountIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("recurringdepositaccounts/{accountId}")
  Observable<PutRecurringDepositAccountsAccountIdResponse> update17(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Body PutRecurringDepositAccountsAccountIdRequest putRecurringDepositAccountsAccountIdRequest
  );

}
