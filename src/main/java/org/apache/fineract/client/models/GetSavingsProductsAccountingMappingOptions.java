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
/*
 * Apache Fineract
 * Apache Fineract is a secure, multi-tenanted microfinance platform  The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform<br>The [reference app](https://cui.fineract.dev) (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation  - The API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) - Find out more about Apache Fineract [here](/fineract-provider/api-docs/apiLive.htm#top) - You can [Try The API From Your Browser](/fineract-provider/api-docs/apiLive.htm#interact) - The Generic Options are available [here](/fineract-provider/api-docs/apiLive.htm#genopts) - Find out more about [Updating Dates and Numbers](/fineract-provider/api-docs/apiLive.htm#dates_and_numbers) - For the Authentication and the Basic of HTTP and HTTPS refer [here](/fineract-provider/api-docs/apiLive.htm#authentication_overview) - Check about ERROR codes [here](/fineract-provider/api-docs/apiLive.htm#errors)  Please refer to the [old documentation](/fineract-provider/api-docs/apiLive.htm) for any documentation queries
 *
 * The version of the OpenAPI document: 1.5.0-11-gd287218-dirty
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.fineract.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.GetSavingsProductsAssetAccountOptions;
import org.apache.fineract.client.models.GetSavingsProductsExpenseAccountOptions;
import org.apache.fineract.client.models.GetSavingsProductsIncomeAccountOptions;
import org.apache.fineract.client.models.GetSavingsProductsLiabilityAccountOptions;

/**
 * GetSavingsProductsAccountingMappingOptions
 */

public class GetSavingsProductsAccountingMappingOptions {
  public static final String SERIALIZED_NAME_LIABILITY_ACCOUNT_OPTIONS = "liabilityAccountOptions";
  @SerializedName(SERIALIZED_NAME_LIABILITY_ACCOUNT_OPTIONS)
  private List<GetSavingsProductsLiabilityAccountOptions> liabilityAccountOptions = null;

  public static final String SERIALIZED_NAME_ASSET_ACCOUNT_OPTIONS = "assetAccountOptions";
  @SerializedName(SERIALIZED_NAME_ASSET_ACCOUNT_OPTIONS)
  private List<GetSavingsProductsAssetAccountOptions> assetAccountOptions = null;

  public static final String SERIALIZED_NAME_EXPENSE_ACCOUNT_OPTIONS = "expenseAccountOptions";
  @SerializedName(SERIALIZED_NAME_EXPENSE_ACCOUNT_OPTIONS)
  private List<GetSavingsProductsExpenseAccountOptions> expenseAccountOptions = null;

  public static final String SERIALIZED_NAME_INCOME_ACCOUNT_OPTIONS = "incomeAccountOptions";
  @SerializedName(SERIALIZED_NAME_INCOME_ACCOUNT_OPTIONS)
  private List<GetSavingsProductsIncomeAccountOptions> incomeAccountOptions = null;


  public GetSavingsProductsAccountingMappingOptions liabilityAccountOptions(List<GetSavingsProductsLiabilityAccountOptions> liabilityAccountOptions) {
    
    this.liabilityAccountOptions = liabilityAccountOptions;
    return this;
  }

  public GetSavingsProductsAccountingMappingOptions addLiabilityAccountOptionsItem(GetSavingsProductsLiabilityAccountOptions liabilityAccountOptionsItem) {
    if (this.liabilityAccountOptions == null) {
      this.liabilityAccountOptions = new ArrayList<GetSavingsProductsLiabilityAccountOptions>();
    }
    this.liabilityAccountOptions.add(liabilityAccountOptionsItem);
    return this;
  }

   /**
   * Get liabilityAccountOptions
   * @return liabilityAccountOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetSavingsProductsLiabilityAccountOptions> getLiabilityAccountOptions() {
    return liabilityAccountOptions;
  }


  public void setLiabilityAccountOptions(List<GetSavingsProductsLiabilityAccountOptions> liabilityAccountOptions) {
    this.liabilityAccountOptions = liabilityAccountOptions;
  }


  public GetSavingsProductsAccountingMappingOptions assetAccountOptions(List<GetSavingsProductsAssetAccountOptions> assetAccountOptions) {
    
    this.assetAccountOptions = assetAccountOptions;
    return this;
  }

  public GetSavingsProductsAccountingMappingOptions addAssetAccountOptionsItem(GetSavingsProductsAssetAccountOptions assetAccountOptionsItem) {
    if (this.assetAccountOptions == null) {
      this.assetAccountOptions = new ArrayList<GetSavingsProductsAssetAccountOptions>();
    }
    this.assetAccountOptions.add(assetAccountOptionsItem);
    return this;
  }

   /**
   * Get assetAccountOptions
   * @return assetAccountOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetSavingsProductsAssetAccountOptions> getAssetAccountOptions() {
    return assetAccountOptions;
  }


  public void setAssetAccountOptions(List<GetSavingsProductsAssetAccountOptions> assetAccountOptions) {
    this.assetAccountOptions = assetAccountOptions;
  }


  public GetSavingsProductsAccountingMappingOptions expenseAccountOptions(List<GetSavingsProductsExpenseAccountOptions> expenseAccountOptions) {
    
    this.expenseAccountOptions = expenseAccountOptions;
    return this;
  }

  public GetSavingsProductsAccountingMappingOptions addExpenseAccountOptionsItem(GetSavingsProductsExpenseAccountOptions expenseAccountOptionsItem) {
    if (this.expenseAccountOptions == null) {
      this.expenseAccountOptions = new ArrayList<GetSavingsProductsExpenseAccountOptions>();
    }
    this.expenseAccountOptions.add(expenseAccountOptionsItem);
    return this;
  }

   /**
   * Get expenseAccountOptions
   * @return expenseAccountOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetSavingsProductsExpenseAccountOptions> getExpenseAccountOptions() {
    return expenseAccountOptions;
  }


  public void setExpenseAccountOptions(List<GetSavingsProductsExpenseAccountOptions> expenseAccountOptions) {
    this.expenseAccountOptions = expenseAccountOptions;
  }


  public GetSavingsProductsAccountingMappingOptions incomeAccountOptions(List<GetSavingsProductsIncomeAccountOptions> incomeAccountOptions) {
    
    this.incomeAccountOptions = incomeAccountOptions;
    return this;
  }

  public GetSavingsProductsAccountingMappingOptions addIncomeAccountOptionsItem(GetSavingsProductsIncomeAccountOptions incomeAccountOptionsItem) {
    if (this.incomeAccountOptions == null) {
      this.incomeAccountOptions = new ArrayList<GetSavingsProductsIncomeAccountOptions>();
    }
    this.incomeAccountOptions.add(incomeAccountOptionsItem);
    return this;
  }

   /**
   * Get incomeAccountOptions
   * @return incomeAccountOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetSavingsProductsIncomeAccountOptions> getIncomeAccountOptions() {
    return incomeAccountOptions;
  }


  public void setIncomeAccountOptions(List<GetSavingsProductsIncomeAccountOptions> incomeAccountOptions) {
    this.incomeAccountOptions = incomeAccountOptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSavingsProductsAccountingMappingOptions getSavingsProductsAccountingMappingOptions = (GetSavingsProductsAccountingMappingOptions) o;
    return Objects.equals(this.liabilityAccountOptions, getSavingsProductsAccountingMappingOptions.liabilityAccountOptions) &&
        Objects.equals(this.assetAccountOptions, getSavingsProductsAccountingMappingOptions.assetAccountOptions) &&
        Objects.equals(this.expenseAccountOptions, getSavingsProductsAccountingMappingOptions.expenseAccountOptions) &&
        Objects.equals(this.incomeAccountOptions, getSavingsProductsAccountingMappingOptions.incomeAccountOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(liabilityAccountOptions, assetAccountOptions, expenseAccountOptions, incomeAccountOptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSavingsProductsAccountingMappingOptions {\n");
    sb.append("    liabilityAccountOptions: ").append(toIndentedString(liabilityAccountOptions)).append("\n");
    sb.append("    assetAccountOptions: ").append(toIndentedString(assetAccountOptions)).append("\n");
    sb.append("    expenseAccountOptions: ").append(toIndentedString(expenseAccountOptions)).append("\n");
    sb.append("    incomeAccountOptions: ").append(toIndentedString(incomeAccountOptions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

