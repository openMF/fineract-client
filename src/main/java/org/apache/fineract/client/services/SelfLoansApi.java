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

import org.apache.fineract.client.models.GetSelfLoansLoanIdChargesResponse;
import org.apache.fineract.client.models.GetSelfLoansLoanIdResponse;
import org.apache.fineract.client.models.GetSelfLoansLoanIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.GetSelfLoansTemplateResponse;
import org.apache.fineract.client.models.PostSelfLoansLoanIdRequest;
import org.apache.fineract.client.models.PostSelfLoansLoanIdResponse;
import org.apache.fineract.client.models.PostSelfLoansRequest;
import org.apache.fineract.client.models.PostSelfLoansResponse;
import org.apache.fineract.client.models.PutSelfLoansLoanIdRequest;
import org.apache.fineract.client.models.PutSelfLoansLoanIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfLoansApi {
  /**
   * Calculate Loan Repayment Schedule | Submit a new Loan Application
   * Calculate Loan Repayment Schedule:  Calculates Loan Repayment Schedule  Mandatory Fields: productId, principal, loanTermFrequency, loanTermFrequencyType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, expectedDisbursementDate, transactionProcessingStrategyId  Submit a new Loan Application:  Mandatory Fields: clientId, productId, principal, loanTermFrequency, loanTermFrequencyType, loanType, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, expectedDisbursementDate, submittedOnDate, loanType  Additional Mandatory Fields if interest recalculation is enabled for product and Rest frequency not same as repayment period: recalculationRestFrequencyDate  Additional Mandatory Fields if interest recalculation with interest/fee compounding is enabled for product and compounding frequency not same as repayment period: recalculationCompoundingFrequencyDate  Additional Mandatory Field if Entity-Datatable Check is enabled for the entity of type loan: datatables  Optional Fields: graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, linkAccountId, allowPartialPeriodInterestCalcualtion, fixedEmiAmount, maxOutstandingLoanBalance, disbursementData, graceOnArrearsAgeing, createStandingInstructionAtDisbursement (requires linkedAccountId if set to true)  Showing request/response for &#39;Submit a new Loan Application&#39;
   * @param postSelfLoansRequest  (required)
   * @param command command (optional)
   * @return Observable&lt;PostSelfLoansResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("self/loans")
  Observable<PostSelfLoansResponse> calculateLoanScheduleOrSubmitLoanApplication1(
    @retrofit2.http.Body PostSelfLoansRequest postSelfLoansRequest, @retrofit2.http.Query("command") String command
  );

  /**
   * Update a Loan Application
   * Loan application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method.
   * @param loanId loanId (required)
   * @param putSelfLoansLoanIdRequest  (required)
   * @return Observable&lt;PutSelfLoansLoanIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("self/loans/{loanId}")
  Observable<PutSelfLoansLoanIdResponse> modifyLoanApplication1(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PutSelfLoansLoanIdRequest putSelfLoansLoanIdRequest
  );

  /**
   * List Loan Charges
   * Lists loan Charges  Example Requests:  self/loans/1/charges   self/loans/1/charges?fields&#x3D;name,amountOrPercentage
   * @param loanId loanId (required)
   * @return Observable&lt;List&lt;GetSelfLoansLoanIdChargesResponse&gt;&gt;
   */
  @GET("self/loans/{loanId}/charges")
  Observable<List<GetSelfLoansLoanIdChargesResponse>> retrieveAllLoanCharges1(
    @retrofit2.http.Path("loanId") Long loanId
  );

  /**
   * 
   * 
   * @param loanId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("self/loans/{loanId}/guarantors")
  Observable<String> retrieveGuarantorDetails2(
    @retrofit2.http.Path("loanId") Long loanId
  );

  /**
   * Retrieve a Loan
   * Retrieves a Loan  Example Requests:  self/loans/1   self/loans/1?fields&#x3D;id,principal,annualInterestRate   self/loans/1?fields&#x3D;id,principal,annualInterestRate&amp;associations&#x3D;repaymentSchedule,transactions
   * @param loanId loanId (required)
   * @return Observable&lt;GetSelfLoansLoanIdResponse&gt;
   */
  @GET("self/loans/{loanId}")
  Observable<GetSelfLoansLoanIdResponse> retrieveLoan1(
    @retrofit2.http.Path("loanId") Long loanId
  );

  /**
   * Retrieve a Loan Charge
   * Retrieves a Loan Charge  Example Requests:  self/loans/1/charges/1   self/loans/1/charges/1?fields&#x3D;name,amountOrPercentage
   * @param loanId loanId (required)
   * @param chargeId chargeId (required)
   * @return Observable&lt;GetSelfLoansLoanIdChargesResponse&gt;
   */
  @GET("self/loans/{loanId}/charges/{chargeId}")
  Observable<GetSelfLoansLoanIdChargesResponse> retrieveLoanCharge1(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("chargeId") Long chargeId
  );

  /**
   * Retrieve a Loan Transaction Details
   * Retrieves a Loan Transaction DetailsExample Request:  self/loans/5/transactions/3
   * @param loanId loanId (required)
   * @param transactionId transactionId (required)
   * @return Observable&lt;GetSelfLoansLoanIdTransactionsTransactionIdResponse&gt;
   */
  @GET("self/loans/{loanId}/transactions/{transactionId}")
  Observable<GetSelfLoansLoanIdTransactionsTransactionIdResponse> retrieveTransaction1(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId
  );

  /**
   * Applicant Withdraws from Loan Application
   * Applicant Withdraws from Loan Application  Mandatory Fields: withdrawnOnDate
   * @param loanId loanId (required)
   * @param postSelfLoansLoanIdRequest  (required)
   * @param command command (optional)
   * @return Observable&lt;PostSelfLoansLoanIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("self/loans/{loanId}")
  Observable<PostSelfLoansLoanIdResponse> stateTransitions1(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostSelfLoansLoanIdRequest postSelfLoansLoanIdRequest, @retrofit2.http.Query("command") String command
  );

  /**
   * Retrieve Loan Details Template
   * Retrieves Loan Details Template  This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists  Example Requests:  self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1   self/loans/template?templateType&#x3D;individual&amp;clientId&#x3D;1&amp;productId&#x3D;1
   * @param clientId clientId (optional)
   * @param productId productId (optional)
   * @param templateType templateType (optional)
   * @return Observable&lt;GetSelfLoansTemplateResponse&gt;
   */
  @GET("self/loans/template")
  Observable<GetSelfLoansTemplateResponse> template17(
    @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("productId") Long productId, @retrofit2.http.Query("templateType") String templateType
  );

}
