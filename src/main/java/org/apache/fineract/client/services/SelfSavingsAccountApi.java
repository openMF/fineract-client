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

import org.apache.fineract.client.models.GetSelfSavingsAccountsAccountIdChargesResponse;
import org.apache.fineract.client.models.GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse;
import org.apache.fineract.client.models.GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.GetSelfSavingsAccountsResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfSavingsAccountApi {
  /**
   * 
   * 
   * @param accountId  (required)
   * @param command  (optional)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("self/savingsaccounts/{accountId}")
  Observable<String> modifySavingsAccountApplication(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
  );

  /**
   * List Savings Charges
   * Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage
   * @param accountId accountId (required)
   * @param chargeStatus chargeStatus (optional, default to &quot;all&quot;)
   * @return Observable&lt;List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;&gt;
   */
  @GET("self/savingsaccounts/{accountId}/charges")
  Observable<List<GetSelfSavingsAccountsAccountIdChargesResponse>> retrieveAllSavingsAccountCharges1(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("chargeStatus") String chargeStatus
  );

  /**
   * Retrieve a savings account
   * Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions
   * @param accountId accountId (required)
   * @param chargeStatus chargeStatus (optional, default to &quot;all&quot;)
   * @return Observable&lt;GetSelfSavingsAccountsResponse&gt;
   */
  @GET("self/savingsaccounts/{accountId}")
  Observable<GetSelfSavingsAccountsResponse> retrieveSavings(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Query("chargeStatus") String chargeStatus
  );

  /**
   * Retrieve a Savings account Charge
   * Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage
   * @param accountId accountId (required)
   * @param savingsAccountChargeId savingsAccountChargeId (required)
   * @return Observable&lt;GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse&gt;
   */
  @GET("self/savingsaccounts/{accountId}/charges/{savingsAccountChargeId}")
  Observable<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> retrieveSavingsAccountCharge1(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Path("savingsAccountChargeId") Long savingsAccountChargeId
  );

  /**
   * Retrieve Savings Account Transaction
   * Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1
   * @param accountId accountId (required)
   * @param transactionId transactionId (required)
   * @return Observable&lt;GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse&gt;
   */
  @GET("self/savingsaccounts/{accountId}/transactions/{transactionId}")
  Observable<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> retrieveSavingsTransaction(
    @retrofit2.http.Path("accountId") Long accountId, @retrofit2.http.Path("transactionId") Long transactionId
  );

  /**
   * 
   * 
   * @param command  (optional)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("self/savingsaccounts")
  Observable<String> submitSavingsAccountApplication(
    @retrofit2.http.Query("command") String command, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param clientId  (optional)
   * @param productId  (optional)
   * @return Observable&lt;String&gt;
   */
  @GET("self/savingsaccounts/template")
  Observable<String> template18(
    @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("productId") Long productId
  );

}
