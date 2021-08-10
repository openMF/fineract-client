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
import org.apache.fineract.client.models.ExtensionData;
import org.apache.fineract.client.models.GeoCodeData;
import org.apache.fineract.client.models.InteropTransactionTypeData;
import org.apache.fineract.client.models.MoneyData;

/**
 * InteropTransferRequestData
 */

public class InteropTransferRequestData {
  public static final String SERIALIZED_NAME_TRANSACTION_CODE = "transactionCode";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CODE)
  private String transactionCode;

  public static final String SERIALIZED_NAME_REQUEST_CODE = "requestCode";
  @SerializedName(SERIALIZED_NAME_REQUEST_CODE)
  private String requestCode;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "accountId";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private MoneyData amount;

  /**
   * Gets or Sets transactionRole
   */
  @JsonAdapter(TransactionRoleEnum.Adapter.class)
  public enum TransactionRoleEnum {
    PAYER("PAYER"),
    
    PAYEE("PAYEE");

    private String value;

    TransactionRoleEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionRoleEnum fromValue(String value) {
      for (TransactionRoleEnum b : TransactionRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TransactionRoleEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionRoleEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionRoleEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TransactionRoleEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TRANSACTION_ROLE = "transactionRole";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ROLE)
  private TransactionRoleEnum transactionRole;

  public static final String SERIALIZED_NAME_TRANSACTION_TYPE = "transactionType";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_TYPE)
  private InteropTransactionTypeData transactionType;

  public static final String SERIALIZED_NAME_NOTE = "note";
  @SerializedName(SERIALIZED_NAME_NOTE)
  private String note;

  public static final String SERIALIZED_NAME_GEO_CODE = "geoCode";
  @SerializedName(SERIALIZED_NAME_GEO_CODE)
  private GeoCodeData geoCode;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private Date expiration;

  public static final String SERIALIZED_NAME_EXTENSION_LIST = "extensionList";
  @SerializedName(SERIALIZED_NAME_EXTENSION_LIST)
  private List<ExtensionData> extensionList = null;

  public static final String SERIALIZED_NAME_TRANSFER_CODE = "transferCode";
  @SerializedName(SERIALIZED_NAME_TRANSFER_CODE)
  private String transferCode;

  public static final String SERIALIZED_NAME_FSP_FEE = "fspFee";
  @SerializedName(SERIALIZED_NAME_FSP_FEE)
  private MoneyData fspFee;

  public static final String SERIALIZED_NAME_FSP_COMMISSION = "fspCommission";
  @SerializedName(SERIALIZED_NAME_FSP_COMMISSION)
  private MoneyData fspCommission;

  public static final String SERIALIZED_NAME_EXPIRATION_LOCAL_DATE = "expirationLocalDate";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_LOCAL_DATE)
  private Date expirationLocalDate;


  public InteropTransferRequestData transactionCode(String transactionCode) {
    
    this.transactionCode = transactionCode;
    return this;
  }

   /**
   * Get transactionCode
   * @return transactionCode
  **/
  @ApiModelProperty(required = true, value = "")

  public String getTransactionCode() {
    return transactionCode;
  }


  public void setTransactionCode(String transactionCode) {
    this.transactionCode = transactionCode;
  }


  public InteropTransferRequestData requestCode(String requestCode) {
    
    this.requestCode = requestCode;
    return this;
  }

   /**
   * Get requestCode
   * @return requestCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRequestCode() {
    return requestCode;
  }


  public void setRequestCode(String requestCode) {
    this.requestCode = requestCode;
  }


  public InteropTransferRequestData accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public InteropTransferRequestData amount(MoneyData amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "")

  public MoneyData getAmount() {
    return amount;
  }


  public void setAmount(MoneyData amount) {
    this.amount = amount;
  }


  public InteropTransferRequestData transactionRole(TransactionRoleEnum transactionRole) {
    
    this.transactionRole = transactionRole;
    return this;
  }

   /**
   * Get transactionRole
   * @return transactionRole
  **/
  @ApiModelProperty(required = true, value = "")

  public TransactionRoleEnum getTransactionRole() {
    return transactionRole;
  }


  public void setTransactionRole(TransactionRoleEnum transactionRole) {
    this.transactionRole = transactionRole;
  }


  public InteropTransferRequestData transactionType(InteropTransactionTypeData transactionType) {
    
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Get transactionType
   * @return transactionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InteropTransactionTypeData getTransactionType() {
    return transactionType;
  }


  public void setTransactionType(InteropTransactionTypeData transactionType) {
    this.transactionType = transactionType;
  }


  public InteropTransferRequestData note(String note) {
    
    this.note = note;
    return this;
  }

   /**
   * Get note
   * @return note
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNote() {
    return note;
  }


  public void setNote(String note) {
    this.note = note;
  }


  public InteropTransferRequestData geoCode(GeoCodeData geoCode) {
    
    this.geoCode = geoCode;
    return this;
  }

   /**
   * Get geoCode
   * @return geoCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GeoCodeData getGeoCode() {
    return geoCode;
  }


  public void setGeoCode(GeoCodeData geoCode) {
    this.geoCode = geoCode;
  }


  public InteropTransferRequestData expiration(Date expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getExpiration() {
    return expiration;
  }


  public void setExpiration(Date expiration) {
    this.expiration = expiration;
  }


  public InteropTransferRequestData extensionList(List<ExtensionData> extensionList) {
    
    this.extensionList = extensionList;
    return this;
  }

  public InteropTransferRequestData addExtensionListItem(ExtensionData extensionListItem) {
    if (this.extensionList == null) {
      this.extensionList = new ArrayList<ExtensionData>();
    }
    this.extensionList.add(extensionListItem);
    return this;
  }

   /**
   * Get extensionList
   * @return extensionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ExtensionData> getExtensionList() {
    return extensionList;
  }


  public void setExtensionList(List<ExtensionData> extensionList) {
    this.extensionList = extensionList;
  }


  public InteropTransferRequestData transferCode(String transferCode) {
    
    this.transferCode = transferCode;
    return this;
  }

   /**
   * Get transferCode
   * @return transferCode
  **/
  @ApiModelProperty(required = true, value = "")

  public String getTransferCode() {
    return transferCode;
  }


  public void setTransferCode(String transferCode) {
    this.transferCode = transferCode;
  }


  public InteropTransferRequestData fspFee(MoneyData fspFee) {
    
    this.fspFee = fspFee;
    return this;
  }

   /**
   * Get fspFee
   * @return fspFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MoneyData getFspFee() {
    return fspFee;
  }


  public void setFspFee(MoneyData fspFee) {
    this.fspFee = fspFee;
  }


  public InteropTransferRequestData fspCommission(MoneyData fspCommission) {
    
    this.fspCommission = fspCommission;
    return this;
  }

   /**
   * Get fspCommission
   * @return fspCommission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MoneyData getFspCommission() {
    return fspCommission;
  }


  public void setFspCommission(MoneyData fspCommission) {
    this.fspCommission = fspCommission;
  }


  public InteropTransferRequestData expirationLocalDate(Date expirationLocalDate) {
    
    this.expirationLocalDate = expirationLocalDate;
    return this;
  }

   /**
   * Get expirationLocalDate
   * @return expirationLocalDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getExpirationLocalDate() {
    return expirationLocalDate;
  }


  public void setExpirationLocalDate(Date expirationLocalDate) {
    this.expirationLocalDate = expirationLocalDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteropTransferRequestData interopTransferRequestData = (InteropTransferRequestData) o;
    return Objects.equals(this.transactionCode, interopTransferRequestData.transactionCode) &&
        Objects.equals(this.requestCode, interopTransferRequestData.requestCode) &&
        Objects.equals(this.accountId, interopTransferRequestData.accountId) &&
        Objects.equals(this.amount, interopTransferRequestData.amount) &&
        Objects.equals(this.transactionRole, interopTransferRequestData.transactionRole) &&
        Objects.equals(this.transactionType, interopTransferRequestData.transactionType) &&
        Objects.equals(this.note, interopTransferRequestData.note) &&
        Objects.equals(this.geoCode, interopTransferRequestData.geoCode) &&
        Objects.equals(this.expiration, interopTransferRequestData.expiration) &&
        Objects.equals(this.extensionList, interopTransferRequestData.extensionList) &&
        Objects.equals(this.transferCode, interopTransferRequestData.transferCode) &&
        Objects.equals(this.fspFee, interopTransferRequestData.fspFee) &&
        Objects.equals(this.fspCommission, interopTransferRequestData.fspCommission) &&
        Objects.equals(this.expirationLocalDate, interopTransferRequestData.expirationLocalDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionCode, requestCode, accountId, amount, transactionRole, transactionType, note, geoCode, expiration, extensionList, transferCode, fspFee, fspCommission, expirationLocalDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteropTransferRequestData {\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    requestCode: ").append(toIndentedString(requestCode)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionRole: ").append(toIndentedString(transactionRole)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    geoCode: ").append(toIndentedString(geoCode)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    extensionList: ").append(toIndentedString(extensionList)).append("\n");
    sb.append("    transferCode: ").append(toIndentedString(transferCode)).append("\n");
    sb.append("    fspFee: ").append(toIndentedString(fspFee)).append("\n");
    sb.append("    fspCommission: ").append(toIndentedString(fspCommission)).append("\n");
    sb.append("    expirationLocalDate: ").append(toIndentedString(expirationLocalDate)).append("\n");
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

