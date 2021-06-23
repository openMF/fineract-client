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

import org.apache.fineract.client.models.DeleteSelfBeneficiariesTPTBeneficiaryIdResponse;
import org.apache.fineract.client.models.GetSelfBeneficiariesTPTResponse;
import org.apache.fineract.client.models.GetSelfBeneficiariesTPTTemplateResponse;
import org.apache.fineract.client.models.PostSelfBeneficiariesTPTRequest;
import org.apache.fineract.client.models.PostSelfBeneficiariesTPTResponse;
import org.apache.fineract.client.models.PutSelfBeneficiariesTPTBeneficiaryIdRequest;
import org.apache.fineract.client.models.PutSelfBeneficiariesTPTBeneficiaryIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SelfThirdPartyTransferApi {
  /**
   * Add TPT Beneficiary
   * Api to add third party beneficiary linked to current user.  Parameter Definitions  name : Nick name for beneficiary, should be unique for an self service user  officeName : Office Name of beneficiary(not id)  accountNumber : Account Number of beneficiary(not id)  transferLimit : Each transfer initiated to this account will not exceed this amount  Example Requests:  /self/beneficiaries/tpt  Mandatory Fields: name, officeName, accountNumber, accountType  Optional Fields: transferLimit
   * @param postSelfBeneficiariesTPTRequest  (required)
   * @return Observable&lt;PostSelfBeneficiariesTPTResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("self/beneficiaries/tpt")
  Observable<PostSelfBeneficiariesTPTResponse> add(
    @retrofit2.http.Body PostSelfBeneficiariesTPTRequest postSelfBeneficiariesTPTRequest
  );

  /**
   * Delete TPT Beneficiary
   * Api to delete third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}
   * @param beneficiaryId  (required)
   * @return Observable&lt;DeleteSelfBeneficiariesTPTBeneficiaryIdResponse&gt;
   */
  @DELETE("self/beneficiaries/tpt/{beneficiaryId}")
  Observable<DeleteSelfBeneficiariesTPTBeneficiaryIdResponse> delete20(
    @retrofit2.http.Path("beneficiaryId") Long beneficiaryId
  );

  /**
   * Get All TPT Beneficiary
   * Api to get all third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt
   * @return Observable&lt;List&lt;GetSelfBeneficiariesTPTResponse&gt;&gt;
   */
  @GET("self/beneficiaries/tpt")
  Observable<List<GetSelfBeneficiariesTPTResponse>> retrieveAll35();
    

  /**
   * Beneficiary Third Party Transfer Template
   * Returns Account Type enumerations. Self User is expected to know office name and account number to be able to add beneficiary.  Example Requests:  /self/beneficiaries/tpt/template
   * @return Observable&lt;GetSelfBeneficiariesTPTTemplateResponse&gt;
   */
  @GET("self/beneficiaries/tpt/template")
  Observable<GetSelfBeneficiariesTPTTemplateResponse> template16();
    

  /**
   * Update TPT Beneficiary
   * Api to update third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}  Optional Fields: name, transferLimit
   * @param beneficiaryId beneficiaryId (required)
   * @param putSelfBeneficiariesTPTBeneficiaryIdRequest  (required)
   * @return Observable&lt;PutSelfBeneficiariesTPTBeneficiaryIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("self/beneficiaries/tpt/{beneficiaryId}")
  Observable<PutSelfBeneficiariesTPTBeneficiaryIdResponse> update21(
    @retrofit2.http.Path("beneficiaryId") Long beneficiaryId, @retrofit2.http.Body PutSelfBeneficiariesTPTBeneficiaryIdRequest putSelfBeneficiariesTPTBeneficiaryIdRequest
  );

}
