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
 * The version of the OpenAPI document: 1.5.0-23-g1ac2469-dirty
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

/**
 * GetAccountsChargesCurrency
 */

public class GetAccountsChargesCurrency {
  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DECIMAL_PLACES = "decimalPlaces";
  @SerializedName(SERIALIZED_NAME_DECIMAL_PLACES)
  private Integer decimalPlaces;

  public static final String SERIALIZED_NAME_DISPLAY_SYMBOL = "displaySymbol";
  @SerializedName(SERIALIZED_NAME_DISPLAY_SYMBOL)
  private String displaySymbol;

  public static final String SERIALIZED_NAME_NAME_CODE = "nameCode";
  @SerializedName(SERIALIZED_NAME_NAME_CODE)
  private String nameCode;

  public static final String SERIALIZED_NAME_DISPLAY_LABEL = "displayLabel";
  @SerializedName(SERIALIZED_NAME_DISPLAY_LABEL)
  private String displayLabel;


  public GetAccountsChargesCurrency code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "")

  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public GetAccountsChargesCurrency name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US Dollar", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GetAccountsChargesCurrency decimalPlaces(Integer decimalPlaces) {
    
    this.decimalPlaces = decimalPlaces;
    return this;
  }

   /**
   * Get decimalPlaces
   * @return decimalPlaces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getDecimalPlaces() {
    return decimalPlaces;
  }


  public void setDecimalPlaces(Integer decimalPlaces) {
    this.decimalPlaces = decimalPlaces;
  }


  public GetAccountsChargesCurrency displaySymbol(String displaySymbol) {
    
    this.displaySymbol = displaySymbol;
    return this;
  }

   /**
   * Get displaySymbol
   * @return displaySymbol
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "$", value = "")

  public String getDisplaySymbol() {
    return displaySymbol;
  }


  public void setDisplaySymbol(String displaySymbol) {
    this.displaySymbol = displaySymbol;
  }


  public GetAccountsChargesCurrency nameCode(String nameCode) {
    
    this.nameCode = nameCode;
    return this;
  }

   /**
   * Get nameCode
   * @return nameCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "currency.USD", value = "")

  public String getNameCode() {
    return nameCode;
  }


  public void setNameCode(String nameCode) {
    this.nameCode = nameCode;
  }


  public GetAccountsChargesCurrency displayLabel(String displayLabel) {
    
    this.displayLabel = displayLabel;
    return this;
  }

   /**
   * Get displayLabel
   * @return displayLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "US Dollar ($)", value = "")

  public String getDisplayLabel() {
    return displayLabel;
  }


  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAccountsChargesCurrency getAccountsChargesCurrency = (GetAccountsChargesCurrency) o;
    return Objects.equals(this.code, getAccountsChargesCurrency.code) &&
        Objects.equals(this.name, getAccountsChargesCurrency.name) &&
        Objects.equals(this.decimalPlaces, getAccountsChargesCurrency.decimalPlaces) &&
        Objects.equals(this.displaySymbol, getAccountsChargesCurrency.displaySymbol) &&
        Objects.equals(this.nameCode, getAccountsChargesCurrency.nameCode) &&
        Objects.equals(this.displayLabel, getAccountsChargesCurrency.displayLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, name, decimalPlaces, displaySymbol, nameCode, displayLabel);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAccountsChargesCurrency {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
    sb.append("    displaySymbol: ").append(toIndentedString(displaySymbol)).append("\n");
    sb.append("    nameCode: ").append(toIndentedString(nameCode)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
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

