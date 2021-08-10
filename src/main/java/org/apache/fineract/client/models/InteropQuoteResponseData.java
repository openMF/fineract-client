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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.fineract.client.models.ExtensionData;
import org.apache.fineract.client.models.MoneyData;

/**
 * InteropQuoteResponseData
 */

public class InteropQuoteResponseData {
  public static final String SERIALIZED_NAME_OFFICE_ID = "officeId";
  @SerializedName(SERIALIZED_NAME_OFFICE_ID)
  private Long officeId;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Long clientId;

  public static final String SERIALIZED_NAME_LOAN_ID = "loanId";
  @SerializedName(SERIALIZED_NAME_LOAN_ID)
  private Long loanId;

  public static final String SERIALIZED_NAME_SAVINGS_ID = "savingsId";
  @SerializedName(SERIALIZED_NAME_SAVINGS_ID)
  private Long savingsId;

  public static final String SERIALIZED_NAME_SUB_RESOURCE_ID = "subResourceId";
  @SerializedName(SERIALIZED_NAME_SUB_RESOURCE_ID)
  private Long subResourceId;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_CHANGES = "changes";
  @SerializedName(SERIALIZED_NAME_CHANGES)
  private Map<String, Object> changes = null;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId;

  public static final String SERIALIZED_NAME_GSIM_ID = "gsimId";
  @SerializedName(SERIALIZED_NAME_GSIM_ID)
  private Long gsimId;

  public static final String SERIALIZED_NAME_GLIM_ID = "glimId";
  @SerializedName(SERIALIZED_NAME_GLIM_ID)
  private Long glimId;

  public static final String SERIALIZED_NAME_ROLLBACK_TRANSACTION = "rollbackTransaction";
  @SerializedName(SERIALIZED_NAME_ROLLBACK_TRANSACTION)
  private Boolean rollbackTransaction;

  public static final String SERIALIZED_NAME_TRANSACTION_CODE = "transactionCode";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_CODE)
  private String transactionCode;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACCEPTED("ACCEPTED"),
    
    REJECTED("REJECTED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_EXPIRATION = "expiration";
  @SerializedName(SERIALIZED_NAME_EXPIRATION)
  private String expiration;

  public static final String SERIALIZED_NAME_EXTENSION_LIST = "extensionList";
  @SerializedName(SERIALIZED_NAME_EXTENSION_LIST)
  private List<ExtensionData> extensionList = null;

  public static final String SERIALIZED_NAME_QUOTE_CODE = "quoteCode";
  @SerializedName(SERIALIZED_NAME_QUOTE_CODE)
  private String quoteCode;

  public static final String SERIALIZED_NAME_FSP_FEE = "fspFee";
  @SerializedName(SERIALIZED_NAME_FSP_FEE)
  private MoneyData fspFee;

  public static final String SERIALIZED_NAME_FSP_COMMISSION = "fspCommission";
  @SerializedName(SERIALIZED_NAME_FSP_COMMISSION)
  private MoneyData fspCommission;

  public static final String SERIALIZED_NAME_CREDIT_REPORT = "creditReport";
  @SerializedName(SERIALIZED_NAME_CREDIT_REPORT)
  private Object creditReport;


  public InteropQuoteResponseData officeId(Long officeId) {
    
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


  public InteropQuoteResponseData groupId(Long groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGroupId() {
    return groupId;
  }


  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public InteropQuoteResponseData clientId(Long clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getClientId() {
    return clientId;
  }


  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }


  public InteropQuoteResponseData loanId(Long loanId) {
    
    this.loanId = loanId;
    return this;
  }

   /**
   * Get loanId
   * @return loanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLoanId() {
    return loanId;
  }


  public void setLoanId(Long loanId) {
    this.loanId = loanId;
  }


  public InteropQuoteResponseData savingsId(Long savingsId) {
    
    this.savingsId = savingsId;
    return this;
  }

   /**
   * Get savingsId
   * @return savingsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSavingsId() {
    return savingsId;
  }


  public void setSavingsId(Long savingsId) {
    this.savingsId = savingsId;
  }


  public InteropQuoteResponseData subResourceId(Long subResourceId) {
    
    this.subResourceId = subResourceId;
    return this;
  }

   /**
   * Get subResourceId
   * @return subResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSubResourceId() {
    return subResourceId;
  }


  public void setSubResourceId(Long subResourceId) {
    this.subResourceId = subResourceId;
  }


  public InteropQuoteResponseData transactionId(String transactionId) {
    
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


  public InteropQuoteResponseData changes(Map<String, Object> changes) {
    
    this.changes = changes;
    return this;
  }

  public InteropQuoteResponseData putChangesItem(String key, Object changesItem) {
    if (this.changes == null) {
      this.changes = new HashMap<String, Object>();
    }
    this.changes.put(key, changesItem);
    return this;
  }

   /**
   * Get changes
   * @return changes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getChanges() {
    return changes;
  }


  public void setChanges(Map<String, Object> changes) {
    this.changes = changes;
  }


  public InteropQuoteResponseData productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public InteropQuoteResponseData gsimId(Long gsimId) {
    
    this.gsimId = gsimId;
    return this;
  }

   /**
   * Get gsimId
   * @return gsimId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGsimId() {
    return gsimId;
  }


  public void setGsimId(Long gsimId) {
    this.gsimId = gsimId;
  }


  public InteropQuoteResponseData glimId(Long glimId) {
    
    this.glimId = glimId;
    return this;
  }

   /**
   * Get glimId
   * @return glimId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGlimId() {
    return glimId;
  }


  public void setGlimId(Long glimId) {
    this.glimId = glimId;
  }


  public InteropQuoteResponseData rollbackTransaction(Boolean rollbackTransaction) {
    
    this.rollbackTransaction = rollbackTransaction;
    return this;
  }

   /**
   * Get rollbackTransaction
   * @return rollbackTransaction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRollbackTransaction() {
    return rollbackTransaction;
  }


  public void setRollbackTransaction(Boolean rollbackTransaction) {
    this.rollbackTransaction = rollbackTransaction;
  }


  public InteropQuoteResponseData transactionCode(String transactionCode) {
    
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


  public InteropQuoteResponseData state(StateEnum state) {
    
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(required = true, value = "")

  public StateEnum getState() {
    return state;
  }


  public void setState(StateEnum state) {
    this.state = state;
  }


  public InteropQuoteResponseData expiration(String expiration) {
    
    this.expiration = expiration;
    return this;
  }

   /**
   * Get expiration
   * @return expiration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpiration() {
    return expiration;
  }


  public void setExpiration(String expiration) {
    this.expiration = expiration;
  }


  public InteropQuoteResponseData extensionList(List<ExtensionData> extensionList) {
    
    this.extensionList = extensionList;
    return this;
  }

  public InteropQuoteResponseData addExtensionListItem(ExtensionData extensionListItem) {
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


  public InteropQuoteResponseData quoteCode(String quoteCode) {
    
    this.quoteCode = quoteCode;
    return this;
  }

   /**
   * Get quoteCode
   * @return quoteCode
  **/
  @ApiModelProperty(required = true, value = "")

  public String getQuoteCode() {
    return quoteCode;
  }


  public void setQuoteCode(String quoteCode) {
    this.quoteCode = quoteCode;
  }


  public InteropQuoteResponseData fspFee(MoneyData fspFee) {
    
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


  public InteropQuoteResponseData fspCommission(MoneyData fspCommission) {
    
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


  public InteropQuoteResponseData creditReport(Object creditReport) {
    
    this.creditReport = creditReport;
    return this;
  }

   /**
   * Get creditReport
   * @return creditReport
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getCreditReport() {
    return creditReport;
  }


  public void setCreditReport(Object creditReport) {
    this.creditReport = creditReport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteropQuoteResponseData interopQuoteResponseData = (InteropQuoteResponseData) o;
    return Objects.equals(this.officeId, interopQuoteResponseData.officeId) &&
        Objects.equals(this.groupId, interopQuoteResponseData.groupId) &&
        Objects.equals(this.clientId, interopQuoteResponseData.clientId) &&
        Objects.equals(this.loanId, interopQuoteResponseData.loanId) &&
        Objects.equals(this.savingsId, interopQuoteResponseData.savingsId) &&
        Objects.equals(this.subResourceId, interopQuoteResponseData.subResourceId) &&
        Objects.equals(this.transactionId, interopQuoteResponseData.transactionId) &&
        Objects.equals(this.changes, interopQuoteResponseData.changes) &&
        Objects.equals(this.productId, interopQuoteResponseData.productId) &&
        Objects.equals(this.gsimId, interopQuoteResponseData.gsimId) &&
        Objects.equals(this.glimId, interopQuoteResponseData.glimId) &&
        Objects.equals(this.rollbackTransaction, interopQuoteResponseData.rollbackTransaction) &&
        Objects.equals(this.transactionCode, interopQuoteResponseData.transactionCode) &&
        Objects.equals(this.state, interopQuoteResponseData.state) &&
        Objects.equals(this.expiration, interopQuoteResponseData.expiration) &&
        Objects.equals(this.extensionList, interopQuoteResponseData.extensionList) &&
        Objects.equals(this.quoteCode, interopQuoteResponseData.quoteCode) &&
        Objects.equals(this.fspFee, interopQuoteResponseData.fspFee) &&
        Objects.equals(this.fspCommission, interopQuoteResponseData.fspCommission) &&
        Objects.equals(this.creditReport, interopQuoteResponseData.creditReport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(officeId, groupId, clientId, loanId, savingsId, subResourceId, transactionId, changes, productId, gsimId, glimId, rollbackTransaction, transactionCode, state, expiration, extensionList, quoteCode, fspFee, fspCommission, creditReport);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteropQuoteResponseData {\n");
    sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    savingsId: ").append(toIndentedString(savingsId)).append("\n");
    sb.append("    subResourceId: ").append(toIndentedString(subResourceId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    gsimId: ").append(toIndentedString(gsimId)).append("\n");
    sb.append("    glimId: ").append(toIndentedString(glimId)).append("\n");
    sb.append("    rollbackTransaction: ").append(toIndentedString(rollbackTransaction)).append("\n");
    sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    extensionList: ").append(toIndentedString(extensionList)).append("\n");
    sb.append("    quoteCode: ").append(toIndentedString(quoteCode)).append("\n");
    sb.append("    fspFee: ").append(toIndentedString(fspFee)).append("\n");
    sb.append("    fspCommission: ").append(toIndentedString(fspCommission)).append("\n");
    sb.append("    creditReport: ").append(toIndentedString(creditReport)).append("\n");
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

