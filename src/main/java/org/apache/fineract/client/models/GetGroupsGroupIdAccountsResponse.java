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
import java.util.ArrayList;
import java.util.List;
import org.apache.fineract.client.models.GetGroupsGroupIdAccountsLoanAccounts;
import org.apache.fineract.client.models.GetGroupsGroupIdAccountsMemberLoanAccounts;
import org.apache.fineract.client.models.GetGroupsGroupIdAccountsMemberSavingsAccounts;
import org.apache.fineract.client.models.GetGroupsGroupIdAccountsSavingAccounts;

/**
 * GetGroupsGroupIdAccountsResponse
 */
@ApiModel(description = "GetGroupsGroupIdAccountsResponse")

public class GetGroupsGroupIdAccountsResponse {
  public static final String SERIALIZED_NAME_LOAN_ACCOUNTS = "loanAccounts";
  @SerializedName(SERIALIZED_NAME_LOAN_ACCOUNTS)
  private List<GetGroupsGroupIdAccountsLoanAccounts> loanAccounts = null;

  public static final String SERIALIZED_NAME_SAVINGS_ACCOUNTS = "savingsAccounts";
  @SerializedName(SERIALIZED_NAME_SAVINGS_ACCOUNTS)
  private List<GetGroupsGroupIdAccountsSavingAccounts> savingsAccounts = null;

  public static final String SERIALIZED_NAME_MEMBER_LOAN_ACCOUNTS = "memberLoanAccounts";
  @SerializedName(SERIALIZED_NAME_MEMBER_LOAN_ACCOUNTS)
  private List<GetGroupsGroupIdAccountsMemberLoanAccounts> memberLoanAccounts = null;

  public static final String SERIALIZED_NAME_MEMBER_SAVINGS_ACCOUNTS = "memberSavingsAccounts";
  @SerializedName(SERIALIZED_NAME_MEMBER_SAVINGS_ACCOUNTS)
  private List<GetGroupsGroupIdAccountsMemberSavingsAccounts> memberSavingsAccounts = null;


  public GetGroupsGroupIdAccountsResponse loanAccounts(List<GetGroupsGroupIdAccountsLoanAccounts> loanAccounts) {
    
    this.loanAccounts = loanAccounts;
    return this;
  }

  public GetGroupsGroupIdAccountsResponse addLoanAccountsItem(GetGroupsGroupIdAccountsLoanAccounts loanAccountsItem) {
    if (this.loanAccounts == null) {
      this.loanAccounts = new ArrayList<GetGroupsGroupIdAccountsLoanAccounts>();
    }
    this.loanAccounts.add(loanAccountsItem);
    return this;
  }

   /**
   * Get loanAccounts
   * @return loanAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetGroupsGroupIdAccountsLoanAccounts> getLoanAccounts() {
    return loanAccounts;
  }


  public void setLoanAccounts(List<GetGroupsGroupIdAccountsLoanAccounts> loanAccounts) {
    this.loanAccounts = loanAccounts;
  }


  public GetGroupsGroupIdAccountsResponse savingsAccounts(List<GetGroupsGroupIdAccountsSavingAccounts> savingsAccounts) {
    
    this.savingsAccounts = savingsAccounts;
    return this;
  }

  public GetGroupsGroupIdAccountsResponse addSavingsAccountsItem(GetGroupsGroupIdAccountsSavingAccounts savingsAccountsItem) {
    if (this.savingsAccounts == null) {
      this.savingsAccounts = new ArrayList<GetGroupsGroupIdAccountsSavingAccounts>();
    }
    this.savingsAccounts.add(savingsAccountsItem);
    return this;
  }

   /**
   * Get savingsAccounts
   * @return savingsAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetGroupsGroupIdAccountsSavingAccounts> getSavingsAccounts() {
    return savingsAccounts;
  }


  public void setSavingsAccounts(List<GetGroupsGroupIdAccountsSavingAccounts> savingsAccounts) {
    this.savingsAccounts = savingsAccounts;
  }


  public GetGroupsGroupIdAccountsResponse memberLoanAccounts(List<GetGroupsGroupIdAccountsMemberLoanAccounts> memberLoanAccounts) {
    
    this.memberLoanAccounts = memberLoanAccounts;
    return this;
  }

  public GetGroupsGroupIdAccountsResponse addMemberLoanAccountsItem(GetGroupsGroupIdAccountsMemberLoanAccounts memberLoanAccountsItem) {
    if (this.memberLoanAccounts == null) {
      this.memberLoanAccounts = new ArrayList<GetGroupsGroupIdAccountsMemberLoanAccounts>();
    }
    this.memberLoanAccounts.add(memberLoanAccountsItem);
    return this;
  }

   /**
   * Get memberLoanAccounts
   * @return memberLoanAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetGroupsGroupIdAccountsMemberLoanAccounts> getMemberLoanAccounts() {
    return memberLoanAccounts;
  }


  public void setMemberLoanAccounts(List<GetGroupsGroupIdAccountsMemberLoanAccounts> memberLoanAccounts) {
    this.memberLoanAccounts = memberLoanAccounts;
  }


  public GetGroupsGroupIdAccountsResponse memberSavingsAccounts(List<GetGroupsGroupIdAccountsMemberSavingsAccounts> memberSavingsAccounts) {
    
    this.memberSavingsAccounts = memberSavingsAccounts;
    return this;
  }

  public GetGroupsGroupIdAccountsResponse addMemberSavingsAccountsItem(GetGroupsGroupIdAccountsMemberSavingsAccounts memberSavingsAccountsItem) {
    if (this.memberSavingsAccounts == null) {
      this.memberSavingsAccounts = new ArrayList<GetGroupsGroupIdAccountsMemberSavingsAccounts>();
    }
    this.memberSavingsAccounts.add(memberSavingsAccountsItem);
    return this;
  }

   /**
   * Get memberSavingsAccounts
   * @return memberSavingsAccounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetGroupsGroupIdAccountsMemberSavingsAccounts> getMemberSavingsAccounts() {
    return memberSavingsAccounts;
  }


  public void setMemberSavingsAccounts(List<GetGroupsGroupIdAccountsMemberSavingsAccounts> memberSavingsAccounts) {
    this.memberSavingsAccounts = memberSavingsAccounts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetGroupsGroupIdAccountsResponse getGroupsGroupIdAccountsResponse = (GetGroupsGroupIdAccountsResponse) o;
    return Objects.equals(this.loanAccounts, getGroupsGroupIdAccountsResponse.loanAccounts) &&
        Objects.equals(this.savingsAccounts, getGroupsGroupIdAccountsResponse.savingsAccounts) &&
        Objects.equals(this.memberLoanAccounts, getGroupsGroupIdAccountsResponse.memberLoanAccounts) &&
        Objects.equals(this.memberSavingsAccounts, getGroupsGroupIdAccountsResponse.memberSavingsAccounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loanAccounts, savingsAccounts, memberLoanAccounts, memberSavingsAccounts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetGroupsGroupIdAccountsResponse {\n");
    sb.append("    loanAccounts: ").append(toIndentedString(loanAccounts)).append("\n");
    sb.append("    savingsAccounts: ").append(toIndentedString(savingsAccounts)).append("\n");
    sb.append("    memberLoanAccounts: ").append(toIndentedString(memberLoanAccounts)).append("\n");
    sb.append("    memberSavingsAccounts: ").append(toIndentedString(memberSavingsAccounts)).append("\n");
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

