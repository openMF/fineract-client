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

import org.apache.fineract.client.models.GetLoanProductsProductIdResponse;
import org.apache.fineract.client.models.GetLoanProductsResponse;
import org.apache.fineract.client.models.GetLoanProductsTemplateResponse;
import org.apache.fineract.client.models.PostLoanProductsRequest;
import org.apache.fineract.client.models.PostLoanProductsResponse;
import org.apache.fineract.client.models.PutLoanProductsProductIdRequest;
import org.apache.fineract.client.models.PutLoanProductsProductIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LoanProductsApi {
  /**
   * Create a Loan Product
   * Depending of the Accounting Rule (accountingRule) selected, additional fields with details of the appropriate Ledger Account identifiers would need to be passed in.  Refer MifosX Accounting Specs Draft for more details regarding the significance of the selected accounting rule  Mandatory Fields: name, shortName, currencyCode, digitsAfterDecimal, inMultiplesOf, principal, numberOfRepayments, repaymentEvery, repaymentFrequencyType, interestRatePerPeriod, interestRateFrequencyType, amortizationType, interestType, interestCalculationPeriodType, transactionProcessingStrategyId, accountingRule, isInterestRecalculationEnabled, daysInYearType, daysInMonthType  Optional Fields: inArrearsTolerance, graceOnPrincipalPayment, graceOnInterestPayment, graceOnInterestCharged, graceOnArrearsAgeing, charges, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, includeInBorrowerCycle, useBorrowerCycle,principalVariationsForBorrowerCycle, numberOfRepaymentVariationsForBorrowerCycle, interestRateVariationsForBorrowerCycle, multiDisburseLoan,maxTrancheCount, outstandingLoanBalance,overdueDaysForNPA,holdGuaranteeFunds, principalThresholdForLastInstalment, accountMovesOutOfNPAOnlyOnArrearsCompletion, canDefineInstallmentAmount, installmentAmountInMultiplesOf, allowAttributeOverrides, allowPartialPeriodInterestCalcualtion  Additional Mandatory Fields for Cash(2) based accounting: fundSourceAccountId, loanPortfolioAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, writeOffAccountId, transfersInSuspenseAccountId, overpaymentLiabilityAccountId  Additional Mandatory Fields for periodic (3) and upfront (4)accrual accounting: fundSourceAccountId, loanPortfolioAccountId, interestOnLoanAccountId, incomeFromFeeAccountId, incomeFromPenaltyAccountId, writeOffAccountId, receivableInterestAccountId, receivableFeeAccountId, receivablePenaltyAccountId, transfersInSuspenseAccountId, overpaymentLiabilityAccountId  Additional Mandatory Fields if interest recalculation is enabled(true): interestRecalculationCompoundingMethod, rescheduleStrategyMethod, recalculationRestFrequencyType  Additional Optional Fields if interest recalculation is enabled(true): isArrearsBasedOnOriginalSchedule, preClosureInterestCalculationStrategy  Additional Optional Fields if interest recalculation is enabled(true) and recalculationRestFrequencyType is not same as repayment period: recalculationRestFrequencyInterval, recalculationRestFrequencyDate  Additional Optional Fields if interest recalculation is enabled(true) and interestRecalculationCompoundingMethod is enabled: recalculationCompoundingFrequencyType  Additional Optional Fields if interest recalculation is enabled(true) and interestRecalculationCompoundingMethod is enabled and recalculationCompoundingFrequencyType is not same as repayment period: recalculationCompoundingFrequencyInterval, recalculationCompoundingFrequencyDate  Additional Mandatory Fields if Hold Guarantee funds is enabled(true): mandatoryGuarantee  Additional Optional Fields if Hold Guarantee funds is enabled(true): minimumGuaranteeFromOwnFunds,minimumGuaranteeFromGuarantor
   * @param postLoanProductsRequest  (required)
   * @return Call&lt;PostLoanProductsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loanproducts")
  Call<PostLoanProductsResponse> createLoanProduct(
    @retrofit2.http.Body PostLoanProductsRequest postLoanProductsRequest
  );

  /**
   * List Loan Products
   * Lists Loan Products  Example Requests:  loanproducts   loanproducts?fields&#x3D;name,description,interestRateFrequencyType,amortizationType
   * @return Call&lt;List&lt;GetLoanProductsResponse&gt;&gt;
   */
  @GET("loanproducts")
  Call<List<GetLoanProductsResponse>> retrieveAllLoanProducts();
    

  /**
   * Retrieve a Loan Product
   * Retrieves a Loan Product  Example Requests:  loanproducts/1   loanproducts/1?template&#x3D;true   loanproducts/1?fields&#x3D;name,description,numberOfRepayments
   * @param productId productId (required)
   * @return Call&lt;GetLoanProductsProductIdResponse&gt;
   */
  @GET("loanproducts/{productId}")
  Call<GetLoanProductsProductIdResponse> retrieveLoanProductDetails(
    @retrofit2.http.Path("productId") Long productId
  );

  /**
   * Retrieve Loan Product Details Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  loanproducts/template
   * @param isProductMixTemplate isProductMixTemplate (optional)
   * @return Call&lt;GetLoanProductsTemplateResponse&gt;
   */
  @GET("loanproducts/template")
  Call<GetLoanProductsTemplateResponse> retrieveTemplate10(
    @retrofit2.http.Query("isProductMixTemplate") Boolean isProductMixTemplate
  );

  /**
   * Update a Loan Product
   * Updates a Loan Product
   * @param productId productId (required)
   * @param putLoanProductsProductIdRequest  (required)
   * @return Call&lt;PutLoanProductsProductIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("loanproducts/{productId}")
  Call<PutLoanProductsProductIdResponse> updateLoanProduct(
    @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutLoanProductsProductIdRequest putLoanProductsProductIdRequest
  );

}
