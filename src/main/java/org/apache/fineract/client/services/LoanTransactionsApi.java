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

import org.apache.fineract.client.models.GetLoansLoanIdTransactionsTemplateResponse;
import org.apache.fineract.client.models.GetLoansLoanIdTransactionsTransactionIdResponse;
import org.apache.fineract.client.models.PostLoansLoanIdTransactionsResponse;
import org.apache.fineract.client.models.PostLoansLoanIdTransactionsTransactionIdRequest;
import org.apache.fineract.client.models.PostLoansLoanIdTransactionsTransactionIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LoanTransactionsApi {
  /**
   * Adjust a Transaction
   * Note: there is no need to specify command&#x3D;{transactionType} parameter.  Mandatory Fields: transactionDate, transactionAmount
   * @param loanId loanId (required)
   * @param transactionId transactionId (required)
   * @param postLoansLoanIdTransactionsTransactionIdRequest  (required)
   * @return Call&lt;PostLoansLoanIdTransactionsTransactionIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loans/{loanId}/transactions/{transactionId}")
  Call<PostLoansLoanIdTransactionsTransactionIdResponse> adjustLoanTransaction(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId, @retrofit2.http.Body PostLoansLoanIdTransactionsTransactionIdRequest postLoansLoanIdTransactionsTransactionIdRequest
  );

  /**
   * Make a Repayment | Make a Refund of an Active Loan by Cash | Foreclosure of an Active Loan | Waive Interest | Write-off Loan | Make Recovery Payment | Undo Loan Write-off Transaction
   * Make Recovery Payment:  This API allows collecting recovery payments for written-off loans
   * @param loanId loanId (required)
   * @param body  (required)
   * @param command command (optional)
   * @return Call&lt;PostLoansLoanIdTransactionsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loans/{loanId}/transactions")
  Call<PostLoansLoanIdTransactionsResponse> executeLoanTransaction(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body Object body, @retrofit2.http.Query("command") String command
  );

  /**
   * Retrieve a Transaction Details
   * Retrieves a Transaction Details  Example Request:  loans/5/transactions/3
   * @param loanId loanId (required)
   * @param transactionId transactionId (required)
   * @return Call&lt;GetLoansLoanIdTransactionsTransactionIdResponse&gt;
   */
  @GET("loans/{loanId}/transactions/{transactionId}")
  Call<GetLoansLoanIdTransactionsTransactionIdResponse> retrieveTransaction(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("transactionId") Long transactionId
  );

  /**
   * Retrieve Loan Transaction Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  loans/1/transactions/template?command&#x3D;repayment
   * @param loanId loanId (required)
   * @param command command (optional)
   * @param dateFormat dateFormat (optional)
   * @param transactionDate transactionDate (optional)
   * @param locale locale (optional)
   * @return Call&lt;GetLoansLoanIdTransactionsTemplateResponse&gt;
   */
  @GET("loans/{loanId}/transactions/template")
  Call<GetLoansLoanIdTransactionsTemplateResponse> retrieveTransactionTemplate(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Query("command") String command, @retrofit2.http.Query("dateFormat") String dateFormat, @retrofit2.http.Query("transactionDate") Object transactionDate, @retrofit2.http.Query("locale") String locale
  );

}
