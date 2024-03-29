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
import java.math.BigDecimal;
import java.util.Date;
import org.apache.fineract.client.models.CashierTxnType;

/**
 * GetTellersTellerIdCashiersCashiersIdTransactionsResponse
 */
@ApiModel(description = "GetTellersTellerIdCashiersCashiersIdTransactionsResponse")

public class GetTellersTellerIdCashiersCashiersIdTransactionsResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_CASHIER_ID = "cashierId";
  @SerializedName(SERIALIZED_NAME_CASHIER_ID)
  private Long cashierId;

  public static final String SERIALIZED_NAME_TXN_TYPE = "txnType";
  @SerializedName(SERIALIZED_NAME_TXN_TYPE)
  private CashierTxnType txnType;

  public static final String SERIALIZED_NAME_TXN_AMOUNT = "txnAmount";
  @SerializedName(SERIALIZED_NAME_TXN_AMOUNT)
  private BigDecimal txnAmount;

  public static final String SERIALIZED_NAME_TXN_DATE = "txnDate";
  @SerializedName(SERIALIZED_NAME_TXN_DATE)
  private Date txnDate;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private Long entityId;

  public static final String SERIALIZED_NAME_ENTITY_TYPE = "entityType";
  @SerializedName(SERIALIZED_NAME_ENTITY_TYPE)
  private String entityType;

  public static final String SERIALIZED_NAME_TXN_NOTE = "txnNote";
  @SerializedName(SERIALIZED_NAME_TXN_NOTE)
  private String txnNote;

  public static final String SERIALIZED_NAME_CREATED_DATE = "createdDate";
  @SerializedName(SERIALIZED_NAME_CREATED_DATE)
  private Date createdDate;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_OFFICE_NAME = "officeName";
  @SerializedName(SERIALIZED_NAME_OFFICE_NAME)
  private String officeName;

  public static final String SERIALIZED_NAME_TELLER_ID = "tellerId";
  @SerializedName(SERIALIZED_NAME_TELLER_ID)
  private Long tellerId;

  public static final String SERIALIZED_NAME_CASHIER_NAME = "cashierName";
  @SerializedName(SERIALIZED_NAME_CASHIER_NAME)
  private String cashierName;


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8", value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse cashierId(Long cashierId) {
    
    this.cashierId = cashierId;
    return this;
  }

   /**
   * Get cashierId
   * @return cashierId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15", value = "")

  public Long getCashierId() {
    return cashierId;
  }


  public void setCashierId(Long cashierId) {
    this.cashierId = cashierId;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse txnType(CashierTxnType txnType) {
    
    this.txnType = txnType;
    return this;
  }

   /**
   * Get txnType
   * @return txnType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public CashierTxnType getTxnType() {
    return txnType;
  }


  public void setTxnType(CashierTxnType txnType) {
    this.txnType = txnType;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse txnAmount(BigDecimal txnAmount) {
    
    this.txnAmount = txnAmount;
    return this;
  }

   /**
   * Get txnAmount
   * @return txnAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "")

  public BigDecimal getTxnAmount() {
    return txnAmount;
  }


  public void setTxnAmount(BigDecimal txnAmount) {
    this.txnAmount = txnAmount;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse txnDate(Date txnDate) {
    
    this.txnDate = txnDate;
    return this;
  }

   /**
   * Get txnDate
   * @return txnDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getTxnDate() {
    return txnDate;
  }


  public void setTxnDate(Date txnDate) {
    this.txnDate = txnDate;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse entityId(Long entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Long getEntityId() {
    return entityId;
  }


  public void setEntityId(Long entityId) {
    this.entityId = entityId;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "loans", value = "")

  public String getEntityType() {
    return entityType;
  }


  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse txnNote(String txnNote) {
    
    this.txnNote = txnNote;
    return this;
  }

   /**
   * Get txnNote
   * @return txnNote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Disbursement, Loan:2-000000002,Client:1-Test 1", value = "")

  public String getTxnNote() {
    return txnNote;
  }


  public void setTxnNote(String txnNote) {
    this.txnNote = txnNote;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse createdDate(Date createdDate) {
    
    this.createdDate = createdDate;
    return this;
  }

   /**
   * Get createdDate
   * @return createdDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getCreatedDate() {
    return createdDate;
  }


  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse officeId(Long officeId) {
    
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


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse officeName(String officeName) {
    
    this.officeName = officeName;
    return this;
  }

   /**
   * Get officeName
   * @return officeName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Head Office", value = "")

  public String getOfficeName() {
    return officeName;
  }


  public void setOfficeName(String officeName) {
    this.officeName = officeName;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse tellerId(Long tellerId) {
    
    this.tellerId = tellerId;
    return this;
  }

   /**
   * Get tellerId
   * @return tellerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "")

  public Long getTellerId() {
    return tellerId;
  }


  public void setTellerId(Long tellerId) {
    this.tellerId = tellerId;
  }


  public GetTellersTellerIdCashiersCashiersIdTransactionsResponse cashierName(String cashierName) {
    
    this.cashierName = cashierName;
    return this;
  }

   /**
   * Get cashierName
   * @return cashierName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "B, Ramesh", value = "")

  public String getCashierName() {
    return cashierName;
  }


  public void setCashierName(String cashierName) {
    this.cashierName = cashierName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTellersTellerIdCashiersCashiersIdTransactionsResponse getTellersTellerIdCashiersCashiersIdTransactionsResponse = (GetTellersTellerIdCashiersCashiersIdTransactionsResponse) o;
    return Objects.equals(this.id, getTellersTellerIdCashiersCashiersIdTransactionsResponse.id) &&
        Objects.equals(this.cashierId, getTellersTellerIdCashiersCashiersIdTransactionsResponse.cashierId) &&
        Objects.equals(this.txnType, getTellersTellerIdCashiersCashiersIdTransactionsResponse.txnType) &&
        Objects.equals(this.txnAmount, getTellersTellerIdCashiersCashiersIdTransactionsResponse.txnAmount) &&
        Objects.equals(this.txnDate, getTellersTellerIdCashiersCashiersIdTransactionsResponse.txnDate) &&
        Objects.equals(this.entityId, getTellersTellerIdCashiersCashiersIdTransactionsResponse.entityId) &&
        Objects.equals(this.entityType, getTellersTellerIdCashiersCashiersIdTransactionsResponse.entityType) &&
        Objects.equals(this.txnNote, getTellersTellerIdCashiersCashiersIdTransactionsResponse.txnNote) &&
        Objects.equals(this.createdDate, getTellersTellerIdCashiersCashiersIdTransactionsResponse.createdDate) &&
        Objects.equals(this.officeId, getTellersTellerIdCashiersCashiersIdTransactionsResponse.officeId) &&
        Objects.equals(this.officeName, getTellersTellerIdCashiersCashiersIdTransactionsResponse.officeName) &&
        Objects.equals(this.tellerId, getTellersTellerIdCashiersCashiersIdTransactionsResponse.tellerId) &&
        Objects.equals(this.cashierName, getTellersTellerIdCashiersCashiersIdTransactionsResponse.cashierName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cashierId, txnType, txnAmount, txnDate, entityId, entityType, txnNote, createdDate, officeId, officeName, tellerId, cashierName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTellersTellerIdCashiersCashiersIdTransactionsResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cashierId: ").append(toIndentedString(cashierId)).append("\n");
    sb.append("    txnType: ").append(toIndentedString(txnType)).append("\n");
    sb.append("    txnAmount: ").append(toIndentedString(txnAmount)).append("\n");
    sb.append("    txnDate: ").append(toIndentedString(txnDate)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    txnNote: ").append(toIndentedString(txnNote)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    officeName: ").append(toIndentedString(officeName)).append("\n");
    sb.append("    tellerId: ").append(toIndentedString(tellerId)).append("\n");
    sb.append("    cashierName: ").append(toIndentedString(cashierName)).append("\n");
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

