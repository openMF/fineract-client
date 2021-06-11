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

import org.apache.fineract.client.models.DeleteLoansLoanIdCollateralsCollateralIdResponse;
import org.apache.fineract.client.models.GetLoansLoanIdCollateralsResponse;
import org.apache.fineract.client.models.GetLoansLoanIdCollateralsTemplateResponse;
import org.apache.fineract.client.models.PostLoansLoanIdCollateralsRequest;
import org.apache.fineract.client.models.PostLoansLoanIdCollateralsResponse;
import org.apache.fineract.client.models.PutLoansLoanIdCollateralsCollateralIdResponse;
import org.apache.fineract.client.models.PutLoansLoandIdCollateralsCollateralIdRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LoanCollateralApi {
  /**
   * Create a Collateral
   * Note: Currently, Collaterals may be added only before a Loan is approved
   * @param loanId loanId (required)
   * @param postLoansLoanIdCollateralsRequest  (required)
   * @return Call&lt;PostLoansLoanIdCollateralsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("loans/{loanId}/collaterals")
  Call<PostLoansLoanIdCollateralsResponse> createCollateral(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Body PostLoansLoanIdCollateralsRequest postLoansLoanIdCollateralsRequest
  );

  /**
   * Remove a Collateral
   * Note: A collateral can only be removed from Loans that are not yet approved.
   * @param loanId loanId (required)
   * @param collateralId collateralId (required)
   * @return Call&lt;DeleteLoansLoanIdCollateralsCollateralIdResponse&gt;
   */
  @DELETE("loans/{loanId}/collaterals/{collateralId}")
  Call<DeleteLoansLoanIdCollateralsCollateralIdResponse> deleteCollateral(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("collateralId") Long collateralId
  );

  /**
   * Retrieve Collateral Details Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/collaterals/template
   * @param loanId loanId (required)
   * @return Call&lt;GetLoansLoanIdCollateralsTemplateResponse&gt;
   */
  @GET("loans/{loanId}/collaterals/template")
  Call<GetLoansLoanIdCollateralsTemplateResponse> newCollateralTemplate(
    @retrofit2.http.Path("loanId") Long loanId
  );

  /**
   * List Loan Collaterals
   * Example Requests:  loans/1/collaterals   loans/1/collaterals?fields&#x3D;value,description
   * @param loanId loanId (required)
   * @return Call&lt;List&lt;GetLoansLoanIdCollateralsResponse&gt;&gt;
   */
  @GET("loans/{loanId}/collaterals")
  Call<List<GetLoansLoanIdCollateralsResponse>> retrieveCollateralDetails(
    @retrofit2.http.Path("loanId") Long loanId
  );

  /**
   * Retrieve a Collateral
   * Example Requests:  /loans/1/collaterals/1   /loans/1/collaterals/1?fields&#x3D;description,description
   * @param loanId loanId (required)
   * @param collateralId collateralId (required)
   * @return Call&lt;GetLoansLoanIdCollateralsResponse&gt;
   */
  @GET("loans/{loanId}/collaterals/{collateralId}")
  Call<GetLoansLoanIdCollateralsResponse> retrieveCollateralDetails1(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("collateralId") Long collateralId
  );

  /**
   * Update a Collateral
   * 
   * @param loanId loanId (required)
   * @param collateralId collateralId (required)
   * @param putLoansLoandIdCollateralsCollateralIdRequest  (required)
   * @return Call&lt;PutLoansLoanIdCollateralsCollateralIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("loans/{loanId}/collaterals/{collateralId}")
  Call<PutLoansLoanIdCollateralsCollateralIdResponse> updateCollateral(
    @retrofit2.http.Path("loanId") Long loanId, @retrofit2.http.Path("collateralId") Long collateralId, @retrofit2.http.Body PutLoansLoandIdCollateralsCollateralIdRequest putLoansLoandIdCollateralsCollateralIdRequest
  );

}
