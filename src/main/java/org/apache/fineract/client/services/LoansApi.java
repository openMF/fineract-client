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

import org.apache.fineract.client.models.DeleteLoansLoanIdResponse;
import org.apache.fineract.client.models.FormDataContentDisposition;
import org.apache.fineract.client.models.GetLoansLoanIdResponse;
import org.apache.fineract.client.models.GetLoansResponse;
import org.apache.fineract.client.models.GetLoansTemplateResponse;
import org.apache.fineract.client.models.PostLoansLoanIdRequest;
import org.apache.fineract.client.models.PostLoansLoanIdResponse;
import org.apache.fineract.client.models.PostLoansRequest;
import org.apache.fineract.client.models.PostLoansResponse;
import org.apache.fineract.client.models.PutLoansLoanIdRequest;
import org.apache.fineract.client.models.PutLoansLoanIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LoansApi {
  /**
   * Calculate loan repayment schedule | Submit a new Loan Application
   * It calculates the loan repayment Schedule Submits a new loan application Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, expectedDisbursementDate, submittedOnDate, loanType Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true) Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables
   * @param postLoansRequest  (required)
   * @param command command (optional)
   * @return Call&lt;PostLoansResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loans")
  Call<PostLoansResponse> calculateLoanScheduleOrSubmitLoanApplication(
    @retrofit2.http.Body PostLoansRequest postLoansRequest, @retrofit2.http.Query("command") String command
  );

  /**
   * Delete a Loan Application
   * Note: Only loans in \&quot;Submitted and awaiting approval\&quot; status can be deleted.
   * @param loanId loanId (required)
   * @return Call&lt;DeleteLoansLoanIdResponse&gt;
   */
  @DELETE("loans/{loanId}")
  Call<DeleteLoansLoanIdResponse> deleteLoanApplication(
    @retrofit2.http.Path("loanId") Long loanId
  );

  /**
   * 
   * 
   * @param glimId  (required)
   * @return Call&lt;String&gt;
   */
  @GET("loans/glimAccount/{glimId}")
  Call<String> getGlimRepaymentTemplate(
    @retrofit2.http.Path("glimId") Long glimId
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("loans/repayments/downloadtemplate")
  Call<Void> getLoanRepaymentTemplate(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * 
   * 
   * @param officeId  (optional)
   * @param staffId  (optional)
   * @param dateFormat  (optional)
   * @return Call&lt;Void&gt;
   */
  @GET("loans/downloadtemplate")
  Call<Void> getLoansTemplate(
    @retrofit2.http.Query("officeId") Long officeId, @retrofit2.http.Query("staffId") Long staffId, @retrofit2.http.Query("dateFormat") String dateFormat
  );

  /**
   * Approve GLIM Application | Undo GLIM Application Approval | Reject GLIM Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
   * Approve GLIM Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the GLIM application  Undo GLIM Application Approval: Undoes the GLIM Application Approval  Reject GLIM Application: Mandatory Fields: rejectedOnDate Allows you to reject the GLIM application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal 
   * @param glimId  (required)
   * @param postLoansLoanIdRequest  (required)
   * @param command  (optional)
   * @return Call&lt;PostLoansLoanIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loans/glimAccount/{glimId}")
  Call<PostLoansLoanIdResponse> glimStateTransitions(
    @retrofit2.http.Path("glimId") Long glimId, @retrofit2.http.Body PostLoansLoanIdRequest postLoansLoanIdRequest, @retrofit2.http.Query("command") String command
  );

  /**
   * Modify a loan application
   * Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.
   * @param loanId loanId (required)
   * @param putLoansLoanIdRequest  (required)
   * @return Call&lt;PutLoansLoanIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("loans/{loanId}")
  Call<PutLoansLoanIdResponse> modifyLoanApplication(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PutLoansLoanIdRequest putLoansLoanIdRequest
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
  @POST("loans/repayments/uploadtemplate")
  Call<String> postLoanRepaymentTemplate(
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
  @POST("loans/uploadtemplate")
  Call<String> postLoanTemplate(
    @retrofit2.http.Part("file") FormDataContentDisposition file, @retrofit2.http.Part("locale") String locale, @retrofit2.http.Part("dateFormat") String dateFormat
  );

  /**
   * List Loans
   * The list capability of loans can support pagination and sorting. Example Requests:  loans  loans?fields&#x3D;accountNo  loans?offset&#x3D;10&amp;limit&#x3D;50  loans?orderBy&#x3D;accountNo&amp;sortOrder&#x3D;DESC
   * @param sqlSearch sqlSearch (optional)
   * @param externalId externalId (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @param accountNo accountNo (optional)
   * @return Call&lt;GetLoansResponse&gt;
   */
  @GET("loans")
  Call<GetLoansResponse> retrieveAll27(
    @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("externalId") String externalId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("accountNo") String accountNo
  );

  /**
   * 
   * 
   * @param loanId loanId (required)
   * @param templateType templateType (optional)
   * @return Call&lt;String&gt;
   */
  @GET("loans/{loanId}/template")
  Call<String> retrieveApprovalTemplate(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("templateType") String templateType
  );

  /**
   * Retrieve a Loan
   * Note: template&#x3D;true parameter doesn&#39;t apply to this resource.Example Requests:  loans/1   loans/1?fields&#x3D;id,principal,annualInterestRate   loans/1?associations&#x3D;all  loans/1?associations&#x3D;all&amp;exclude&#x3D;guarantors   loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
   * @param loanId loanId (required)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @return Call&lt;GetLoansLoanIdResponse&gt;
   */
  @GET("loans/{loanId}")
  Call<GetLoansLoanIdResponse> retrieveLoan(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly
  );

  /**
   * Approve Loan Application | Recover Loan Guarantee | Undo Loan Application Approval | Assign a Loan Officer | Unassign a Loan Officer | Reject Loan Application | Applicant Withdraws from Loan Application | Disburse Loan Disburse Loan To Savings Account | Undo Loan Disbursal
   * Approve Loan Application: Mandatory Fields: approvedOnDate Optional Fields: approvedLoanAmount and expectedDisbursementDate Approves the loan application  Recover Loan Guarantee: Recovers the loan guarantee  Undo Loan Application Approval: Undoes the Loan Application Approval  Assign a Loan Officer: Allows you to assign Loan Officer for existing Loan.  Unassign a Loan Officer: Allows you to unassign the Loan Officer.  Reject Loan Application: Mandatory Fields: rejectedOnDate Allows you to reject the loan application  Applicant Withdraws from Loan Application: Mandatory Fields: withdrawnOnDate Allows the applicant to withdraw the loan application  Disburse Loan: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the Loan  Disburse Loan To Savings Account: Mandatory Fields: actualDisbursementDate Optional Fields: transactionAmount and fixedEmiAmount Disburses the loan to Saving Account  Undo Loan Disbursal: Undoes the Loan Disbursal Showing request and response for Assign a Loan Officer
   * @param loanId loanId (required)
   * @param postLoansLoanIdRequest  (required)
   * @param command command (optional)
   * @return Call&lt;PostLoansLoanIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loans/{loanId}")
  Call<PostLoansLoanIdResponse> stateTransitions(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostLoansLoanIdRequest postLoansLoanIdRequest, @retrofit2.http.Query("command") String command
  );

  /**
   * Retrieve Loan Details Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Requests:  loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1
   * @param clientId clientId (optional)
   * @param groupId groupId (optional)
   * @param productId productId (optional)
   * @param templateType templateType (optional)
   * @param staffInSelectedOfficeOnly staffInSelectedOfficeOnly (optional, default to false)
   * @param activeOnly activeOnly (optional, default to false)
   * @return Call&lt;GetLoansTemplateResponse&gt;
   */
  @GET("loans/template")
  Call<GetLoansTemplateResponse> template10(
    @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("groupId") Long groupId, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Query("templateType") String templateType, @retrofit2.http.Query("staffInSelectedOfficeOnly") Boolean staffInSelectedOfficeOnly, @retrofit2.http.Query("activeOnly") Boolean activeOnly
  );

}
