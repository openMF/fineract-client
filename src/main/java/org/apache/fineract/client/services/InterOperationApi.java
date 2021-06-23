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

import org.apache.fineract.client.models.InteropAccountData;
import org.apache.fineract.client.models.InteropIdentifierAccountResponseData;
import org.apache.fineract.client.models.InteropIdentifierRequestData;
import org.apache.fineract.client.models.InteropIdentifiersResponseData;
import org.apache.fineract.client.models.InteropKycResponseData;
import org.apache.fineract.client.models.InteropQuoteRequestData;
import org.apache.fineract.client.models.InteropQuoteResponseData;
import org.apache.fineract.client.models.InteropTransactionRequestData;
import org.apache.fineract.client.models.InteropTransactionRequestResponseData;
import org.apache.fineract.client.models.InteropTransactionsData;
import org.apache.fineract.client.models.InteropTransferRequestData;
import org.apache.fineract.client.models.InteropTransferResponseData;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface InterOperationApi {
  /**
   * Calculate Interoperation Quote
   * 
   * @param interopQuoteRequestData  (required)
   * @return Observable&lt;InteropQuoteResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interoperation/quotes")
  Observable<InteropQuoteResponseData> createQuote(
    @retrofit2.http.Body InteropQuoteRequestData interopQuoteRequestData
  );

  /**
   * Allow Interoperation Transaction Request
   * 
   * @param interopTransactionRequestData  (required)
   * @return Observable&lt;InteropTransactionRequestResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interoperation/requests")
  Observable<InteropTransactionRequestResponseData> createTransactionRequest(
    @retrofit2.http.Body InteropTransactionRequestData interopTransactionRequestData
  );

  /**
   * Allow Interoperation Identifier registration
   * 
   * @param idType idType (required)
   * @param idValue idValue (required)
   * @param interopIdentifierRequestData  (required)
   * @return Observable&lt;InteropIdentifierAccountResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("interoperation/parties/{idType}/{idValue}")
  Observable<InteropIdentifierAccountResponseData> deleteAccountIdentifier(
    @retrofit2.http.Path("idType") String idType, @retrofit2.http.Path("idValue") String idValue, @retrofit2.http.Body InteropIdentifierRequestData interopIdentifierRequestData
  );

  /**
   * Allow Interoperation Identifier registration
   * 
   * @param idType idType (required)
   * @param idValue idValue (required)
   * @param subIdOrType subIdOrType (required)
   * @param interopIdentifierRequestData  (required)
   * @return Observable&lt;InteropIdentifierAccountResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @DELETE("interoperation/parties/{idType}/{idValue}/{subIdOrType}")
  Observable<InteropIdentifierAccountResponseData> deleteAccountIdentifier1(
    @retrofit2.http.Path("idType") String idType, @retrofit2.http.Path("idValue") String idValue, @retrofit2.http.Path("subIdOrType") String subIdOrType, @retrofit2.http.Body InteropIdentifierRequestData interopIdentifierRequestData
  );

  /**
   * Disburse Loan by Account Id
   * 
   * @param accountId accountId (required)
   * @return Observable&lt;String&gt;
   */
  @POST("interoperation/transactions/{accountId}/disburse")
  Observable<String> disburseLoan(
    @retrofit2.http.Path("accountId") String accountId
  );

  /**
   * Query Interoperation Account by secondary identifier
   * 
   * @param idType idType (required)
   * @param idValue idValue (required)
   * @return Observable&lt;InteropIdentifierAccountResponseData&gt;
   */
  @GET("interoperation/parties/{idType}/{idValue}")
  Observable<InteropIdentifierAccountResponseData> getAccountByIdentifier(
    @retrofit2.http.Path("idType") String idType, @retrofit2.http.Path("idValue") String idValue
  );

  /**
   * Query Interoperation Account by secondary identifier
   * 
   * @param idType idType (required)
   * @param idValue idValue (required)
   * @param subIdOrType subIdOrType (required)
   * @return Observable&lt;InteropIdentifierAccountResponseData&gt;
   */
  @GET("interoperation/parties/{idType}/{idValue}/{subIdOrType}")
  Observable<InteropIdentifierAccountResponseData> getAccountByIdentifier1(
    @retrofit2.http.Path("idType") String idType, @retrofit2.http.Path("idValue") String idValue, @retrofit2.http.Path("subIdOrType") String subIdOrType
  );

  /**
   * Query Interoperation Account details
   * 
   * @param accountId accountId (required)
   * @return Observable&lt;InteropAccountData&gt;
   */
  @GET("interoperation/accounts/{accountId}")
  Observable<InteropAccountData> getAccountDetails(
    @retrofit2.http.Path("accountId") String accountId
  );

  /**
   * Query Interoperation secondary identifiers by Account Id
   * 
   * @param accountId accountId (required)
   * @return Observable&lt;InteropIdentifiersResponseData&gt;
   */
  @GET("interoperation/accounts/{accountId}/identifiers")
  Observable<InteropIdentifiersResponseData> getAccountIdentifiers(
    @retrofit2.http.Path("accountId") String accountId
  );

  /**
   * Query transactions by Account Id
   * 
   * @param accountId accountId (required)
   * @param debit debit (optional, default to true)
   * @param credit credit (optional, default to false)
   * @param fromBookingDateTime fromBookingDateTime (optional)
   * @param toBookingDateTime toBookingDateTime (optional)
   * @return Observable&lt;InteropTransactionsData&gt;
   */
  @GET("interoperation/accounts/{accountId}/transactions")
  Observable<InteropTransactionsData> getAccountTransactions(
    @retrofit2.http.Path("accountId") String accountId, @retrofit2.http.Query("debit") Boolean debit, @retrofit2.http.Query("credit") Boolean credit, @retrofit2.http.Query("fromBookingDateTime") String fromBookingDateTime, @retrofit2.http.Query("toBookingDateTime") String toBookingDateTime
  );

  /**
   * Query KYC by Account Id
   * 
   * @param accountId accountId (required)
   * @return Observable&lt;InteropKycResponseData&gt;
   */
  @GET("interoperation/accounts/{accountId}/kyc")
  Observable<InteropKycResponseData> getClientKyc(
    @retrofit2.http.Path("accountId") String accountId
  );

  /**
   * Query Interoperation Quote
   * 
   * @param transactionCode transactionCode (required)
   * @param quoteCode quoteCode (required)
   * @return Observable&lt;InteropQuoteResponseData&gt;
   */
  @GET("interoperation/transactions/{transactionCode}/quotes/{quoteCode}")
  Observable<InteropQuoteResponseData> getQuote(
    @retrofit2.http.Path("transactionCode") String transactionCode, @retrofit2.http.Path("quoteCode") String quoteCode
  );

  /**
   * Query Interoperation Transaction Request
   * 
   * @param transactionCode transactionCode (required)
   * @param requestCode requestCode (required)
   * @return Observable&lt;InteropTransactionRequestResponseData&gt;
   */
  @GET("interoperation/transactions/{transactionCode}/requests/{requestCode}")
  Observable<InteropTransactionRequestResponseData> getTransactionRequest(
    @retrofit2.http.Path("transactionCode") String transactionCode, @retrofit2.http.Path("requestCode") String requestCode
  );

  /**
   * Query Interoperation Transfer
   * 
   * @param transactionCode transactionCode (required)
   * @param transferCode transferCode (required)
   * @return Observable&lt;InteropTransferResponseData&gt;
   */
  @GET("interoperation/transactions/{transactionCode}/transfers/{transferCode}")
  Observable<InteropTransferResponseData> getTransfer(
    @retrofit2.http.Path("transactionCode") String transactionCode, @retrofit2.http.Path("transferCode") String transferCode
  );

  /**
   * Query Interoperation Health Request
   * 
   * @return Completable
   */
  @GET("interoperation/health")
  Completable health();
    

  /**
   * Prepare Interoperation Transfer
   * 
   * @param interopTransferRequestData  (required)
   * @param action action (optional)
   * @return Observable&lt;InteropTransferResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interoperation/transfers")
  Observable<InteropTransferResponseData> performTransfer(
    @retrofit2.http.Body InteropTransferRequestData interopTransferRequestData, @retrofit2.http.Query("action") String action
  );

  /**
   * Interoperation Identifier registration
   * 
   * @param idType idType (required)
   * @param idValue idValue (required)
   * @param interopIdentifierRequestData  (required)
   * @return Observable&lt;InteropIdentifierAccountResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interoperation/parties/{idType}/{idValue}")
  Observable<InteropIdentifierAccountResponseData> registerAccountIdentifier(
    @retrofit2.http.Path("idType") String idType, @retrofit2.http.Path("idValue") String idValue, @retrofit2.http.Body InteropIdentifierRequestData interopIdentifierRequestData
  );

  /**
   * Interoperation Identifier registration
   * 
   * @param idType idType (required)
   * @param idValue idValue (required)
   * @param subIdOrType subIdOrType (required)
   * @param interopIdentifierRequestData  (required)
   * @return Observable&lt;InteropIdentifierAccountResponseData&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("interoperation/parties/{idType}/{idValue}/{subIdOrType}")
  Observable<InteropIdentifierAccountResponseData> registerAccountIdentifier1(
    @retrofit2.http.Path("idType") String idType, @retrofit2.http.Path("idValue") String idValue, @retrofit2.http.Path("subIdOrType") String subIdOrType, @retrofit2.http.Body InteropIdentifierRequestData interopIdentifierRequestData
  );

}
