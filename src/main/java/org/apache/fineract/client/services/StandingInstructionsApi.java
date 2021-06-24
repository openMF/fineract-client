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

import org.apache.fineract.client.models.GetStandingInstructionsResponse;
import org.apache.fineract.client.models.GetStandingInstructionsStandingInstructionIdResponse;
import org.apache.fineract.client.models.GetStandingInstructionsTemplateResponse;
import org.apache.fineract.client.models.PostStandingInstructionsRequest;
import org.apache.fineract.client.models.PostStandingInstructionsResponse;
import org.apache.fineract.client.models.PutStandingInstructionsStandingInstructionIdRequest;
import org.apache.fineract.client.models.PutStandingInstructionsStandingInstructionIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface StandingInstructionsApi {
  /**
   * Create new Standing Instruction
   * Ability to create new instruction for transfer of monetary funds from one account to another
   * @param postStandingInstructionsRequest  (required)
   * @return Observable&lt;PostStandingInstructionsResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("standinginstructions")
  Observable<PostStandingInstructionsResponse> create5(
    @retrofit2.http.Body PostStandingInstructionsRequest postStandingInstructionsRequest
  );

  /**
   * List Standing Instructions
   * Example Requests:  standinginstructions
   * @param sqlSearch sqlSearch (optional)
   * @param externalId externalId (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @param transferType transferType (optional)
   * @param clientName clientName (optional)
   * @param clientId clientId (optional)
   * @param fromAccountId fromAccountId (optional)
   * @param fromAccountType fromAccountType (optional)
   * @return Observable&lt;GetStandingInstructionsResponse&gt;
   */
  @GET("standinginstructions")
  Observable<GetStandingInstructionsResponse> retrieveAll19(
    @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("externalId") String externalId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder, @retrofit2.http.Query("transferType") Integer transferType, @retrofit2.http.Query("clientName") String clientName, @retrofit2.http.Query("clientId") Long clientId, @retrofit2.http.Query("fromAccountId") Long fromAccountId, @retrofit2.http.Query("fromAccountType") Integer fromAccountType
  );

  /**
   * Retrieve Standing Instruction
   * Example Requests :  standinginstructions/1
   * @param standingInstructionId standingInstructionId (required)
   * @param sqlSearch sqlSearch (optional)
   * @param externalId externalId (optional)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @param orderBy orderBy (optional)
   * @param sortOrder sortOrder (optional)
   * @return Observable&lt;GetStandingInstructionsStandingInstructionIdResponse&gt;
   */
  @GET("standinginstructions/{standingInstructionId}")
  Observable<GetStandingInstructionsStandingInstructionIdResponse> retrieveOne10(
    @retrofit2.http.Path("standingInstructionId") Long standingInstructionId, @retrofit2.http.Query("sqlSearch") String sqlSearch, @retrofit2.http.Query("externalId") String externalId, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit, @retrofit2.http.Query("orderBy") String orderBy, @retrofit2.http.Query("sortOrder") String sortOrder
  );

  /**
   * Retrieve Standing Instruction Template
   * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1&amp;transferType&#x3D;1  standinginstructions/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1&amp;transferType&#x3D;1
   * @param fromOfficeId fromOfficeId (optional)
   * @param fromClientId fromClientId (optional)
   * @param fromAccountId fromAccountId (optional)
   * @param fromAccountType fromAccountType (optional)
   * @param toOfficeId toOfficeId (optional)
   * @param toClientId toClientId (optional)
   * @param toAccountId toAccountId (optional)
   * @param toAccountType toAccountType (optional)
   * @param transferType transferType (optional)
   * @return Observable&lt;GetStandingInstructionsTemplateResponse&gt;
   */
  @GET("standinginstructions/template")
  Observable<GetStandingInstructionsTemplateResponse> template6(
    @retrofit2.http.Query("fromOfficeId") Long fromOfficeId, @retrofit2.http.Query("fromClientId") Long fromClientId, @retrofit2.http.Query("fromAccountId") Long fromAccountId, @retrofit2.http.Query("fromAccountType") Integer fromAccountType, @retrofit2.http.Query("toOfficeId") Long toOfficeId, @retrofit2.http.Query("toClientId") Long toClientId, @retrofit2.http.Query("toAccountId") Long toAccountId, @retrofit2.http.Query("toAccountType") Integer toAccountType, @retrofit2.http.Query("transferType") Integer transferType
  );

  /**
   * Update Standing Instruction | Delete Standing Instruction
   * Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;update   Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;delete
   * @param standingInstructionId standingInstructionId (required)
   * @param command command (optional)
   * @param putStandingInstructionsStandingInstructionIdRequest  (optional)
   * @return Observable&lt;PutStandingInstructionsStandingInstructionIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("standinginstructions/{standingInstructionId}")
  Observable<PutStandingInstructionsStandingInstructionIdResponse> update9(
    @retrofit2.http.Path("standingInstructionId") Long standingInstructionId, @retrofit2.http.Query("command") String command, @retrofit2.http.Body PutStandingInstructionsStandingInstructionIdRequest putStandingInstructionsStandingInstructionIdRequest
  );

}
