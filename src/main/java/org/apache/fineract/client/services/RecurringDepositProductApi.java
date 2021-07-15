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

import org.apache.fineract.client.models.DeleteRecurringDepositProductsProductIdResponse;
import org.apache.fineract.client.models.GetRecurringDepositProductsProductIdResponse;
import org.apache.fineract.client.models.GetRecurringDepositProductsResponse;
import org.apache.fineract.client.models.PostRecurringDepositProductsRequest;
import org.apache.fineract.client.models.PostRecurringDepositProductsResponse;
import org.apache.fineract.client.models.PutRecurringDepositProductsRequest;
import org.apache.fineract.client.models.PutRecurringDepositProductsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RecurringDepositProductApi {
  /**
   * Create a Recurring Deposit Product
   * Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId
   * @param postRecurringDepositProductsRequest  (required)
   * @return Observable&lt;PostRecurringDepositProductsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("recurringdepositproducts")
  Observable<PostRecurringDepositProductsResponse> create12(
    @retrofit2.http.Body PostRecurringDepositProductsRequest postRecurringDepositProductsRequest
  );

  /**
   * Delete a Recurring Deposit Product
   * Deletes a Recurring Deposit Product
   * @param productId productId (required)
   * @return Observable&lt;DeleteRecurringDepositProductsProductIdResponse&gt;
   */
  @DELETE("recurringdepositproducts/{productId}")
  Observable<DeleteRecurringDepositProductsProductIdResponse> delete17(
    @retrofit2.http.Path("productId") Long productId
  );

  /**
   * List Recuring Deposit Products
   * Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name
   * @return Observable&lt;List&lt;GetRecurringDepositProductsResponse&gt;&gt;
   */
  @GET("recurringdepositproducts")
  Observable<List<GetRecurringDepositProductsResponse>> retrieveAll32();
    

  /**
   * Retrieve a Recurring Deposit Product
   * Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description
   * @param productId productId (required)
   * @return Observable&lt;GetRecurringDepositProductsProductIdResponse&gt;
   */
  @GET("recurringdepositproducts/{productId}")
  Observable<GetRecurringDepositProductsProductIdResponse> retrieveOne22(
    @retrofit2.http.Path("productId") Long productId
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("recurringdepositproducts/template")
  Observable<String> retrieveTemplate16();
    

  /**
   * Update a Recurring Deposit Product
   * Updates a Recurring Deposit Product
   * @param productId productId (required)
   * @param putRecurringDepositProductsRequest  (required)
   * @return Observable&lt;PutRecurringDepositProductsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("recurringdepositproducts/{productId}")
  Observable<PutRecurringDepositProductsResponse> update18(
    @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutRecurringDepositProductsRequest putRecurringDepositProductsRequest
  );

}
