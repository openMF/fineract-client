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

import org.apache.fineract.client.models.DeleteFixedDepositProductsProductIdResponse;
import org.apache.fineract.client.models.GetFixedDepositProductsProductIdResponse;
import org.apache.fineract.client.models.GetFixedDepositProductsResponse;
import org.apache.fineract.client.models.PostFixedDepositProductsRequest;
import org.apache.fineract.client.models.PostFixedDepositProductsResponse;
import org.apache.fineract.client.models.PutFixedDepositProductsProductIdRequest;
import org.apache.fineract.client.models.PutFixedDepositProductsProductIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FixedDepositProductApi {
  /**
   * Create a Fixed Deposit Product
   * Creates a Fixed Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, accountingRule  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, , withHoldTax, taxGroupId   Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId
   * @param postFixedDepositProductsRequest  (required)
   * @return Observable&lt;PostFixedDepositProductsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fixeddepositproducts")
  Observable<PostFixedDepositProductsResponse> create11(
    @retrofit2.http.Body PostFixedDepositProductsRequest postFixedDepositProductsRequest
  );

  /**
   * Delete a Fixed Deposit Product
   * Deletes a Fixed Deposit Product
   * @param productId productId (required)
   * @return Observable&lt;DeleteFixedDepositProductsProductIdResponse&gt;
   */
  @DELETE("fixeddepositproducts/{productId}")
  Observable<DeleteFixedDepositProductsProductIdResponse> delete15(
    @retrofit2.http.Path("productId") Long productId
  );

  /**
   * List Fixed Deposit Products
   * Lists Fixed Deposit Products  Example Requests:  fixeddepositproducts   fixeddepositproducts?fields&#x3D;name
   * @return Observable&lt;List&lt;GetFixedDepositProductsResponse&gt;&gt;
   */
  @GET("fixeddepositproducts")
  Observable<List<GetFixedDepositProductsResponse>> retrieveAll30();
    

  /**
   * Retrieve a Fixed Deposit Product
   * Retrieves a Fixed Deposit Product  Example Requests:  fixeddepositproducts/1   fixeddepositproducts/1?template&#x3D;true   fixeddepositproducts/1?fields&#x3D;name,description
   * @param productId productId (required)
   * @return Observable&lt;GetFixedDepositProductsProductIdResponse&gt;
   */
  @GET("fixeddepositproducts/{productId}")
  Observable<GetFixedDepositProductsProductIdResponse> retrieveOne19(
    @retrofit2.http.Path("productId") Long productId
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("fixeddepositproducts/template")
  Observable<String> retrieveTemplate14();
    

  /**
   * Update a Fixed Deposit Product
   * Updates a Fixed Deposit Product
   * @param productId productId (required)
   * @param putFixedDepositProductsProductIdRequest  (required)
   * @return Observable&lt;PutFixedDepositProductsProductIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("fixeddepositproducts/{productId}")
  Observable<PutFixedDepositProductsProductIdResponse> update16(
    @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutFixedDepositProductsProductIdRequest putFixedDepositProductsProductIdRequest
  );

}
