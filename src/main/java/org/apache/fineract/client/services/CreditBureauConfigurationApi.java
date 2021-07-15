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


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CreditBureauConfigurationApi {
  /**
   * 
   * 
   * @param organisationCreditBureauId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("CreditBureauConfiguration/organisationCreditBureau/{organisationCreditBureauId}")
  Observable<String> addOrganisationCreditBureau(
    @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param creditBureauId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("CreditBureauConfiguration/configuration/{creditBureauId}")
  Observable<String> createCreditBureauConfiguration(
    @retrofit2.http.Path("creditBureauId") Long creditBureauId, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param organisationCreditBureauId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("CreditBureauConfiguration/mappings/{organisationCreditBureauId}")
  Observable<String> createCreditBureauLoanProductMapping(
    @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("CreditBureauConfiguration/loanProduct")
  Observable<String> fetchLoanProducts();
    

  /**
   * 
   * 
   * @param loanProductId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("CreditBureauConfiguration/loanProduct/{loanProductId}")
  Observable<String> fetchMappingByLoanProductId(
    @retrofit2.http.Path("loanProductId") Long loanProductId
  );

  /**
   * 
   * 
   * @param organisationCreditBureauId  (required)
   * @return Observable&lt;String&gt;
   */
  @GET("CreditBureauConfiguration/config/{organisationCreditBureauId}")
  Observable<String> getConfiguration(
    @retrofit2.http.Path("organisationCreditBureauId") Long organisationCreditBureauId
  );

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("CreditBureauConfiguration")
  Observable<String> getCreditBureau();
    

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("CreditBureauConfiguration/mappings")
  Observable<String> getCreditBureauLoanProductMapping();
    

  /**
   * 
   * 
   * @return Observable&lt;String&gt;
   */
  @GET("CreditBureauConfiguration/organisationCreditBureau")
  Observable<String> getOrganisationCreditBureau();
    

  /**
   * 
   * 
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("CreditBureauConfiguration/organisationCreditBureau")
  Observable<String> updateCreditBureau(
    @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param configurationId  (required)
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("CreditBureauConfiguration/configuration/{configurationId}")
  Observable<String> updateCreditBureauConfiguration(
    @retrofit2.http.Path("configurationId") Long configurationId, @retrofit2.http.Body String body
  );

  /**
   * 
   * 
   * @param body  (optional)
   * @return Observable&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("CreditBureauConfiguration/mappings")
  Observable<String> updateCreditBureauLoanProductMapping(
    @retrofit2.http.Body String body
  );

}
