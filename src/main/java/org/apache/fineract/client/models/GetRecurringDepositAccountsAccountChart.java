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
import java.util.Date;
import java.util.List;
import org.apache.fineract.client.models.GetRecurringDepositAccountsChartSlabs;
import org.apache.fineract.client.models.GetRecurringDepositAccountsPeriodTypes;

/**
 * GetRecurringDepositAccountsAccountChart
 */

public class GetRecurringDepositAccountsAccountChart {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_FROM_DATE = "fromDate";
  @SerializedName(SERIALIZED_NAME_FROM_DATE)
  private Date fromDate;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Integer accountId;

  public static final String SERIALIZED_NAME_ACCOUNT_NUMBER = "accountNumber";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NUMBER)
  private Long accountNumber;

  public static final String SERIALIZED_NAME_CHART_SLABS = "chartSlabs";
  @SerializedName(SERIALIZED_NAME_CHART_SLABS)
  private List<GetRecurringDepositAccountsChartSlabs> chartSlabs = null;

  public static final String SERIALIZED_NAME_PERIOD_TYPES = "periodTypes";
  @SerializedName(SERIALIZED_NAME_PERIOD_TYPES)
  private List<GetRecurringDepositAccountsPeriodTypes> periodTypes = null;


  public GetRecurringDepositAccountsAccountChart id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4", value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GetRecurringDepositAccountsAccountChart fromDate(Date fromDate) {
    
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getFromDate() {
    return fromDate;
  }


  public void setFromDate(Date fromDate) {
    this.fromDate = fromDate;
  }


  public GetRecurringDepositAccountsAccountChart accountId(Integer accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "")

  public Integer getAccountId() {
    return accountId;
  }


  public void setAccountId(Integer accountId) {
    this.accountId = accountId;
  }


  public GetRecurringDepositAccountsAccountChart accountNumber(Long accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * Get accountNumber
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getAccountNumber() {
    return accountNumber;
  }


  public void setAccountNumber(Long accountNumber) {
    this.accountNumber = accountNumber;
  }


  public GetRecurringDepositAccountsAccountChart chartSlabs(List<GetRecurringDepositAccountsChartSlabs> chartSlabs) {
    
    this.chartSlabs = chartSlabs;
    return this;
  }

  public GetRecurringDepositAccountsAccountChart addChartSlabsItem(GetRecurringDepositAccountsChartSlabs chartSlabsItem) {
    if (this.chartSlabs == null) {
      this.chartSlabs = new ArrayList<GetRecurringDepositAccountsChartSlabs>();
    }
    this.chartSlabs.add(chartSlabsItem);
    return this;
  }

   /**
   * Get chartSlabs
   * @return chartSlabs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetRecurringDepositAccountsChartSlabs> getChartSlabs() {
    return chartSlabs;
  }


  public void setChartSlabs(List<GetRecurringDepositAccountsChartSlabs> chartSlabs) {
    this.chartSlabs = chartSlabs;
  }


  public GetRecurringDepositAccountsAccountChart periodTypes(List<GetRecurringDepositAccountsPeriodTypes> periodTypes) {
    
    this.periodTypes = periodTypes;
    return this;
  }

  public GetRecurringDepositAccountsAccountChart addPeriodTypesItem(GetRecurringDepositAccountsPeriodTypes periodTypesItem) {
    if (this.periodTypes == null) {
      this.periodTypes = new ArrayList<GetRecurringDepositAccountsPeriodTypes>();
    }
    this.periodTypes.add(periodTypesItem);
    return this;
  }

   /**
   * Get periodTypes
   * @return periodTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<GetRecurringDepositAccountsPeriodTypes> getPeriodTypes() {
    return periodTypes;
  }


  public void setPeriodTypes(List<GetRecurringDepositAccountsPeriodTypes> periodTypes) {
    this.periodTypes = periodTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRecurringDepositAccountsAccountChart getRecurringDepositAccountsAccountChart = (GetRecurringDepositAccountsAccountChart) o;
    return Objects.equals(this.id, getRecurringDepositAccountsAccountChart.id) &&
        Objects.equals(this.fromDate, getRecurringDepositAccountsAccountChart.fromDate) &&
        Objects.equals(this.accountId, getRecurringDepositAccountsAccountChart.accountId) &&
        Objects.equals(this.accountNumber, getRecurringDepositAccountsAccountChart.accountNumber) &&
        Objects.equals(this.chartSlabs, getRecurringDepositAccountsAccountChart.chartSlabs) &&
        Objects.equals(this.periodTypes, getRecurringDepositAccountsAccountChart.periodTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, fromDate, accountId, accountNumber, chartSlabs, periodTypes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRecurringDepositAccountsAccountChart {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    chartSlabs: ").append(toIndentedString(chartSlabs)).append("\n");
    sb.append("    periodTypes: ").append(toIndentedString(periodTypes)).append("\n");
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

