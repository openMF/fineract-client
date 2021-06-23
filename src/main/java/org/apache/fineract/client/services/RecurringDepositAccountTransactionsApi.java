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

import org.apache.fineract.client.models.GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse;
import org.apache.fineract.client.models.GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest;
import org.apache.fineract.client.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse;
import org.apache.fineract.client.models.PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RecurringDepositAccountTransactionsApi {
  /**
   * Adjust Transaction | Undo transaction
   * Adjust Transaction:  This command modifies the given transaction.  Undo transaction:  This command reverses the given transaction.  Showing request/response for &#39;Adjust Transaction&#39;
   * @param recurringDepositAccountId recurringDepositAccountId (required)
   * @param transactionId transactionId (required)
   * @param postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest  (required)
   * @param command command (optional)
   * @return Observable&lt;PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId}")
  Observable<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> handleTransactionCommands(
    @retrofit2.http.Path("recurringDepositAccountId") Long recurringDepositAccountId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Body PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest, @retrofit2.http.Query("command") String command
  );

  /**
   * Retrieve Recurring Deposit Account Transaction
   * Retrieves Recurring Deposit Account Transaction  Example Requests:  recurringdepositaccounts/1/transactions/1
   * @param recurringDepositAccountId recurringDepositAccountId (required)
   * @param transactionId transactionId (required)
   * @return Observable&lt;GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse&gt;
   */
  @GET("recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId}")
  Observable<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> retrieveOne20(
    @retrofit2.http.Path("recurringDepositAccountId") Long recurringDepositAccountId, @retrofit2.http.Path("transactionId") Long transactionId
  );

  /**
   * Retrieve Recurring Deposit Account Transaction Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  recurringdepositaccounts/1/transactions/template?command&#x3D;deposit  recurringdepositaccounts/1/transactions/template?command&#x3D;withdrawal
   * @param recurringDepositAccountId recurringDepositAccountId (required)
   * @param command command (optional)
   * @return Observable&lt;GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse&gt;
   */
  @GET("recurringdepositaccounts/{recurringDepositAccountId}/transactions/template")
  Observable<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse> retrieveTemplate15(
    @retrofit2.http.Path("recurringDepositAccountId") Long recurringDepositAccountId, @retrofit2.http.Query("command") String command
  );

  /**
   * Deposit Transaction | Withdrawal Transaction
   * Deposit Transaction:  Used for a deposit transaction  Withdrawal Transaction:  Used for a Withdrawal Transaction  Showing request/response for Deposit Transaction
   * @param recurringDepositAccountId recurringDepositAccountId (required)
   * @param postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest  (required)
   * @param command command (optional)
   * @return Observable&lt;PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("recurringdepositaccounts/{recurringDepositAccountId}/transactions")
  Observable<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse> transaction1(
    @retrofit2.http.Path("recurringDepositAccountId") Long recurringDepositAccountId, @retrofit2.http.Body PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest postRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest, @retrofit2.http.Query("command") String command
  );

}
