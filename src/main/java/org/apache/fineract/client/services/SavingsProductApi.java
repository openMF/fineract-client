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

import org.apache.fineract.client.models.DeleteSavingsProductsProductIdResponse;
import org.apache.fineract.client.models.GetSavingsProductsProductIdResponse;
import org.apache.fineract.client.models.GetSavingsProductsResponse;
import org.apache.fineract.client.models.GetSavingsProductsTemplateResponse;
import org.apache.fineract.client.models.PostSavingsProductsRequest;
import org.apache.fineract.client.models.PostSavingsProductsResponse;
import org.apache.fineract.client.models.PutSavingsProductsProductIdRequest;
import org.apache.fineract.client.models.PutSavingsProductsProductIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SavingsProductApi {
  /**
   * Create a Savings Product
   * Creates a Savings Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, allowOverdraft, overdraftLimit, minBalanceForInterestCalculation,withHoldTax,taxGroupId
   * @param postSavingsProductsRequest  (required)
   * @return Observable&lt;PostSavingsProductsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("savingsproducts")
  Observable<PostSavingsProductsResponse> create13(
    @retrofit2.http.Body PostSavingsProductsRequest postSavingsProductsRequest
  );

  /**
   * Delete a Savings Product
   * Deletes a Savings Product
   * @param productId productId (required)
   * @return Observable&lt;DeleteSavingsProductsProductIdResponse&gt;
   */
  @DELETE("savingsproducts/{productId}")
  Observable<DeleteSavingsProductsProductIdResponse> delete19(
    @retrofit2.http.Path("productId") Long productId
  );

  /**
   * List Savings Products
   * Lists Savings Products  Example Requests:  savingsproducts  savingsproducts?fields&#x3D;name
   * @return Observable&lt;List&lt;GetSavingsProductsResponse&gt;&gt;
   */
  @GET("savingsproducts")
  Observable<List<GetSavingsProductsResponse>> retrieveAll34();
    

  /**
   * Retrieve a Savings Product
   * Retrieves a Savings Product  Example Requests:  savingsproducts/1  savingsproducts/1?template&#x3D;true  savingsproducts/1?fields&#x3D;name,description
   * @param productId productId (required)
   * @return Observable&lt;GetSavingsProductsProductIdResponse&gt;
   */
  @GET("savingsproducts/{productId}")
  Observable<GetSavingsProductsProductIdResponse> retrieveOne25(
    @retrofit2.http.Path("productId") Long productId
  );

  /**
   * Retrieve Savings Product Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  savingsproducts/template
   * @return Observable&lt;GetSavingsProductsTemplateResponse&gt;
   */
  @GET("savingsproducts/template")
  Observable<GetSavingsProductsTemplateResponse> retrieveTemplate19();
    

  /**
   * Update a Savings Product
   * Updates a Savings Product
   * @param productId productId (required)
   * @param putSavingsProductsProductIdRequest  (required)
   * @return Observable&lt;PutSavingsProductsProductIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("savingsproducts/{productId}")
  Observable<PutSavingsProductsProductIdResponse> update20(
    @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutSavingsProductsProductIdRequest putSavingsProductsProductIdRequest
  );

}
