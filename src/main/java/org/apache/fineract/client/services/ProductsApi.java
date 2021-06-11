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

import org.apache.fineract.client.models.GetProductsTypeProductIdResponse;
import org.apache.fineract.client.models.GetProductsTypeResponse;
import org.apache.fineract.client.models.PostProductsTypeRequest;
import org.apache.fineract.client.models.PostProductsTypeResponse;
import org.apache.fineract.client.models.PutProductsTypeProductIdRequest;
import org.apache.fineract.client.models.PutProductsTypeProductIdResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ProductsApi {
  /**
   * Create a Share Product
   * Creates a Share Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, locale, totalShares, unitPrice, nominalShares,allowDividendCalculationForInactiveClients,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): shareReferenceId, shareSuspenseId, shareEquityId, incomeFromFeeAccountId  Optional Fields: sharesIssued, minimumShares, maximumShares, minimumActivePeriodForDividends, minimumactiveperiodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType, marketPricePeriods, chargesSelected
   * @param type type (required)
   * @param postProductsTypeRequest  (required)
   * @return Call&lt;PostProductsTypeResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("products/{type}")
  Call<PostProductsTypeResponse> createProduct(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Body PostProductsTypeRequest postProductsTypeRequest
  );

  /**
   * 
   * 
   * @param type type (required)
   * @param productId productId (required)
   * @param command command (optional)
   * @return Call&lt;String&gt;
   */
  @POST("products/{type}/{productId}")
  Call<String> handleCommands3(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Query("command") String command
  );

  /**
   * List Share Products
   * Lists Share Products  Mandatory Fields: limit, offset  Example Requests:  shareproducts
   * @param type type (required)
   * @param offset offset (optional)
   * @param limit limit (optional)
   * @return Call&lt;GetProductsTypeResponse&gt;
   */
  @GET("products/{type}")
  Call<GetProductsTypeResponse> retrieveAllProducts(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Query("offset") Integer offset, @retrofit2.http.Query("limit") Integer limit
  );

  /**
   * Retrieve a Share Product
   * Retrieves a Share Product  Example Requests:  products/share/1   products/share/1?template&#x3D;true
   * @param productId productId (required)
   * @param type type (required)
   * @return Call&lt;GetProductsTypeProductIdResponse&gt;
   */
  @GET("products/{type}/{productId}")
  Call<GetProductsTypeProductIdResponse> retrieveProduct(
    @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Path("type") String type
  );

  /**
   * 
   * 
   * @param type type (required)
   * @return Call&lt;String&gt;
   */
  @GET("products/{type}/template")
  Call<String> retrieveTemplate12(
    @retrofit2.http.Path("type") String type
  );

  /**
   * Update a Share Product
   * Updates a Share Product
   * @param type type (required)
   * @param productId productId (required)
   * @param putProductsTypeProductIdRequest  (required)
   * @return Call&lt;PutProductsTypeProductIdResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PUT("products/{type}/{productId}")
  Call<PutProductsTypeProductIdResponse> updateProduct(
    @retrofit2.http.Path("type") String type, @retrofit2.http.Path("productId") Long productId, @retrofit2.http.Body PutProductsTypeProductIdRequest putProductsTypeProductIdRequest
  );

}
