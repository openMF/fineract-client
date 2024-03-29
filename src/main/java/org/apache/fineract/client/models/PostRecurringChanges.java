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
 * The version of the OpenAPI document: 1.5.0-39-gc7b9611-dirty
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
 * PostRecurringChanges
 */

public class PostRecurringChanges {
  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private String accountNumber;

  public static final String SERIALIZED_NAME_CHECK_NUMBER = "checkNumber";
  @SerializedName(SERIALIZED_NAME_CHECK_NUMBER)
  private String checkNumber;

  public static final String SERIALIZED_NAME_ROUTING_CODE = "routingCode";
  @SerializedName(SERIALIZED_NAME_ROUTING_CODE)
  private String routingCode;

  public static final String SERIALIZED_NAME_RECEIPT_NUMBER = "receiptNumber";
  @SerializedName(SERIALIZED_NAME_RECEIPT_NUMBER)
  private String receiptNumber;

  public static final String SERIALIZED_NAME_BANK_NUMBER = "bankNumber";
  @SerializedName(SERIALIZED_NAME_BANK_NUMBER)
  private String bankNumber;


  public PostRecurringChanges accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "acc123", value = "")

  public String getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public PostRecurringChanges checkNumber(String checkNumber) {
    
    this.checkNumber = checkNumber;
    return this;
  }

   /**
   * Get checkNumber
   * @return checkNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "che123", value = "")

  public String getCheckNumber() {
    return checkNumber;
  }


  public void setCheckNumber(String checkNumber) {
    this.checkNumber = checkNumber;
  }


  public PostRecurringChanges routingCode(String routingCode) {
    
    this.routingCode = routingCode;
    return this;
  }

   /**
   * Get routingCode
   * @return routingCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rou123", value = "")

  public String getRoutingCode() {
    return routingCode;
  }


  public void setRoutingCode(String routingCode) {
    this.routingCode = routingCode;
  }


  public PostRecurringChanges receiptNumber(String receiptNumber) {
    
    this.receiptNumber = receiptNumber;
    return this;
  }

   /**
   * Get receiptNumber
   * @return receiptNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "rec123", value = "")

  public String getReceiptNumber() {
    return receiptNumber;
  }


  public void setReceiptNumber(String receiptNumber) {
    this.receiptNumber = receiptNumber;
  }


  public PostRecurringChanges bankNumber(String bankNumber) {
    
    this.bankNumber = bankNumber;
    return this;
  }

   /**
   * Get bankNumber
   * @return bankNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ban123", value = "")

  public String getBankNumber() {
    return bankNumber;
  }


  public void setBankNumber(String bankNumber) {
    this.bankNumber = bankNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostRecurringChanges postRecurringChanges = (PostRecurringChanges) o;
    return Objects.equals(this.accountNumber, postRecurringChanges.accountNumber) &&
        Objects.equals(this.checkNumber, postRecurringChanges.checkNumber) &&
        Objects.equals(this.routingCode, postRecurringChanges.routingCode) &&
        Objects.equals(this.receiptNumber, postRecurringChanges.receiptNumber) &&
        Objects.equals(this.bankNumber, postRecurringChanges.bankNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, checkNumber, routingCode, receiptNumber, bankNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostRecurringChanges {\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    checkNumber: ").append(toIndentedString(checkNumber)).append("\n");
    sb.append("    routingCode: ").append(toIndentedString(routingCode)).append("\n");
    sb.append("    receiptNumber: ").append(toIndentedString(receiptNumber)).append("\n");
    sb.append("    bankNumber: ").append(toIndentedString(bankNumber)).append("\n");
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

