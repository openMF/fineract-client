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
import org.apache.fineract.client.models.EnumOptionData;

/**
 * JournalEntryData
 */

public class JournalEntryData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_GL_ACCOUNT_ID = "glAccountId";
  @SerializedName(SERIALIZED_NAME_GL_ACCOUNT_ID)
  private Long glAccountId;

  public static final String SERIALIZED_NAME_GL_ACCOUNT_TYPE = "glAccountType";
  @SerializedName(SERIALIZED_NAME_GL_ACCOUNT_TYPE)
  private EnumOptionData glAccountType;

  public static final String SERIALIZED_NAME_TRANSACTION_DATE = "transactionDate";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DATE)
  private Date transactionDate;

  public static final String SERIALIZED_NAME_ENTRY_TYPE = "entryType";
  @SerializedName(SERIALIZED_NAME_ENTRY_TYPE)
  private EnumOptionData entryType;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private BigDecimal amount;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_ROW_INDEX = "rowIndex";
  @SerializedName(SERIALIZED_NAME_ROW_INDEX)
  private Integer rowIndex;


  public JournalEntryData id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public JournalEntryData officeId(Long officeId) {
    
    this.officeId = officeId;
    return this;
  }

   /**
   * Get officeId
   * @return officeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOfficeId() {
    return officeId;
  }


  public void setOfficeId(Long officeId) {
    this.officeId = officeId;
  }


  public JournalEntryData glAccountId(Long glAccountId) {
    
    this.glAccountId = glAccountId;
    return this;
  }

   /**
   * Get glAccountId
   * @return glAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGlAccountId() {
    return glAccountId;
  }


  public void setGlAccountId(Long glAccountId) {
    this.glAccountId = glAccountId;
  }


  public JournalEntryData glAccountType(EnumOptionData glAccountType) {
    
    this.glAccountType = glAccountType;
    return this;
  }

   /**
   * Get glAccountType
   * @return glAccountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getGlAccountType() {
    return glAccountType;
  }


  public void setGlAccountType(EnumOptionData glAccountType) {
    this.glAccountType = glAccountType;
  }


  public JournalEntryData transactionDate(Date transactionDate) {
    
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * Get transactionDate
   * @return transactionDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getTransactionDate() {
    return transactionDate;
  }


  public void setTransactionDate(Date transactionDate) {
    this.transactionDate = transactionDate;
  }


  public JournalEntryData entryType(EnumOptionData entryType) {
    
    this.entryType = entryType;
    return this;
  }

   /**
   * Get entryType
   * @return entryType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public EnumOptionData getEntryType() {
    return entryType;
  }


  public void setEntryType(EnumOptionData entryType) {
    this.entryType = entryType;
  }


  public JournalEntryData amount(BigDecimal amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getAmount() {
    return amount;
  }


  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  public JournalEntryData transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public JournalEntryData rowIndex(Integer rowIndex) {
    
    this.rowIndex = rowIndex;
    return this;
  }

   /**
   * Get rowIndex
   * @return rowIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRowIndex() {
    return rowIndex;
  }


  public void setRowIndex(Integer rowIndex) {
    this.rowIndex = rowIndex;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JournalEntryData journalEntryData = (JournalEntryData) o;
    return Objects.equals(this.id, journalEntryData.id) &&
        Objects.equals(this.officeId, journalEntryData.officeId) &&
        Objects.equals(this.glAccountId, journalEntryData.glAccountId) &&
        Objects.equals(this.glAccountType, journalEntryData.glAccountType) &&
        Objects.equals(this.transactionDate, journalEntryData.transactionDate) &&
        Objects.equals(this.entryType, journalEntryData.entryType) &&
        Objects.equals(this.amount, journalEntryData.amount) &&
        Objects.equals(this.transactionId, journalEntryData.transactionId) &&
        Objects.equals(this.rowIndex, journalEntryData.rowIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, officeId, glAccountId, glAccountType, transactionDate, entryType, amount, transactionId, rowIndex);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JournalEntryData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    glAccountId: ").append(toIndentedString(glAccountId)).append("\n");
    sb.append("    glAccountType: ").append(toIndentedString(glAccountType)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    entryType: ").append(toIndentedString(entryType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    rowIndex: ").append(toIndentedString(rowIndex)).append("\n");
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

