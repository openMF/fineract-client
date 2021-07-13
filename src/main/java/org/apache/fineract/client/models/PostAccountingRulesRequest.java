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
 * PostAccountingRulesRequest
 */
@ApiModel(description = "PostAccountingRulesRequest")

public class PostAccountingRulesRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_ACCOUNT_TO_DEBIT = "accountToDebit";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TO_DEBIT)
  private Long accountToDebit;

  public static final String SERIALIZED_NAME_ACCOUNT_TO_CREDIT = "accountToCredit";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TO_CREDIT)
  private Long accountToCredit;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;


  public PostAccountingRulesRequest name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test", value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PostAccountingRulesRequest officeId(Long officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Long getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }


  public PostAccountingRulesRequest accountToDebit(Long accountToDebit) {
    
    this.accountToDebit = accountToDebit;
    return this;
  }

   /**
   * Get accountToDebit
   * @return accountToDebit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "21", value = "")

  public Long getAccountToDebit() {
    return accountToDebit;
  }


  public void setAccountToDebit(Long accountToDebit) {
    this.accountToDebit = accountToDebit;
  }


  public PostAccountingRulesRequest accountToCredit(Long accountToCredit) {
    
    this.accountToCredit = accountToCredit;
    return this;
  }

   /**
   * Get accountToCredit
   * @return accountToCredit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "9", value = "")

  public Long getAccountToCredit() {
    return accountToCredit;
  }


  public void setAccountToCredit(Long accountToCredit) {
    this.accountToCredit = accountToCredit;
  }


  public PostAccountingRulesRequest description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Employee salary", value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAccountingRulesRequest postAccountingRulesRequest = (PostAccountingRulesRequest) o;
    return Objects.equals(this.name, postAccountingRulesRequest.name) &&
        Objects.equals(this.officeId, postAccountingRulesRequest.officeId) &&
        Objects.equals(this.accountToDebit, postAccountingRulesRequest.accountToDebit) &&
        Objects.equals(this.accountToCredit, postAccountingRulesRequest.accountToCredit) &&
        Objects.equals(this.description, postAccountingRulesRequest.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, officeId, accountToDebit, accountToCredit, description);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAccountingRulesRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    accountToDebit: ").append(toIndentedString(accountToDebit)).append("\n");
    sb.append("    accountToCredit: ").append(toIndentedString(accountToCredit)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

