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

import org.apache.fineract.client.models.PostLoansLoanIdScheduleResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LoanReschedulingApi {
  /**
   * Calculate loan repayment schedule based on Loan term variations | Updates loan repayment schedule based on Loan term variations | Updates loan repayment schedule by removing Loan term variations
   * Calculate loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule based on Loan term variations:  Mandatory Fields: exceptions,locale,dateFormat  Updates loan repayment schedule by removing Loan term variations:  It updates the loan repayment schedule by removing Loan term variations  Showing request/response for &#39;Updates loan repayment schedule by removing Loan term variations&#39;
   * @param loanId loanId (required)
   * @param body  (required)
   * @param command command (optional)
   * @return Observable&lt;PostLoansLoanIdScheduleResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loans/{loanId}/schedule")
  Observable<PostLoansLoanIdScheduleResponse> calculateLoanScheduleOrSubmitVariableSchedule(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body Object body, @retrofit2.http.Query("command") String command
  );

}
