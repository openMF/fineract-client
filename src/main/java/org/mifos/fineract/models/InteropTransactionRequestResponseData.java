/*
 * Apache Fineract API Documentation
 * Apache Fineract is a secure, multi-tenanted microfinance platform. <br />              The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform. The reference app [  https://demo.openmf.org  ] (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation.              <br/>The API                 is organized around REST [ https://en.wikipedia.org/wiki/Representational_state_transfer ]               <br/> Find out more about Apache Fineract on [ https://demo.openmf.org/api-docs/apiLive.htm#top ]              <br/> You can Try The API From Your Browser itself at [ https://demo.openmf.org/api-docs/apiLive.htm#interact ]              <br/> The Generic Options are available at [ https://demo.openmf.org/api-docs/apiLive.htm#genopts ]              <br/> Find out more about Updating Dates and Numbers at [ https://demo.openmf.org/api-docs/apiLive.htm#dates_and_numbers ]              <br/> For the Authentication and the Basic of HTTP and HTTPS refer [ https://demo.openmf.org/api-docs/apiLive.htm#authentication_overview ]              <br/> Check about ERROR codes at [ https://demo.openmf.org/api-docs/apiLive.htm#errors ]               <br/> <br/> Please refer to the old documentation for any documentation queries [ https://demo.openmf.org/api-docs/apiLive.htm ]              <br/>             ______________________________________________________________________________________________________________________________
 *
 * OpenAPI spec version: 1.0.0
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.mifos.fineract.models;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.*;

/**
 * InteropTransactionRequestResponseData
 */

public class InteropTransactionRequestResponseData {
    @SerializedName("officeId")
    private Long officeId = null;

    @SerializedName("groupId")
    private Long groupId = null;

    @SerializedName("clientId")
    private Long clientId = null;

    @SerializedName("loanId")
    private Long loanId = null;

    @SerializedName("savingsId")
    private Long savingsId = null;

    @SerializedName("subResourceId")
    private Long subResourceId = null;

    @SerializedName("transactionId")
    private String transactionId = null;

    @SerializedName("changes")
    private Map<String, Object> changes = null;

    @SerializedName("productId")
    private Long productId = null;

    @SerializedName("rollbackTransaction")
    private Boolean rollbackTransaction = null;

    @SerializedName("transactionCode")
    private String transactionCode = null;
    @SerializedName("state")
    private StateEnum state = null;
    @SerializedName("expiration")
    private String expiration = null;
    @SerializedName("extensionList")
    private List<ExtensionData> extensionList = null;
    @SerializedName("requestCode")
    private String requestCode = null;

    public InteropTransactionRequestResponseData officeId(Long officeId) {
        this.officeId = officeId;
        return this;
    }

    /**
     * Get officeId
     *
     * @return officeId
     **/
    @ApiModelProperty(value = "")
    public Long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    public InteropTransactionRequestResponseData groupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * Get groupId
     *
     * @return groupId
     **/
    @ApiModelProperty(value = "")
    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public InteropTransactionRequestResponseData clientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get clientId
     *
     * @return clientId
     **/
    @ApiModelProperty(value = "")
    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public InteropTransactionRequestResponseData loanId(Long loanId) {
        this.loanId = loanId;
        return this;
    }

    /**
     * Get loanId
     *
     * @return loanId
     **/
    @ApiModelProperty(value = "")
    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public InteropTransactionRequestResponseData savingsId(Long savingsId) {
        this.savingsId = savingsId;
        return this;
    }

    /**
     * Get savingsId
     *
     * @return savingsId
     **/
    @ApiModelProperty(value = "")
    public Long getSavingsId() {
        return savingsId;
    }

    public void setSavingsId(Long savingsId) {
        this.savingsId = savingsId;
    }

    public InteropTransactionRequestResponseData subResourceId(Long subResourceId) {
        this.subResourceId = subResourceId;
        return this;
    }

    /**
     * Get subResourceId
     *
     * @return subResourceId
     **/
    @ApiModelProperty(value = "")
    public Long getSubResourceId() {
        return subResourceId;
    }

    public void setSubResourceId(Long subResourceId) {
        this.subResourceId = subResourceId;
    }

    public InteropTransactionRequestResponseData transactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * Get transactionId
     *
     * @return transactionId
     **/
    @ApiModelProperty(value = "")
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public InteropTransactionRequestResponseData changes(Map<String, Object> changes) {
        this.changes = changes;
        return this;
    }

    public InteropTransactionRequestResponseData putChangesItem(String key, Object changesItem) {
        if (this.changes == null) {
            this.changes = new HashMap<String, Object>();
        }
        this.changes.put(key, changesItem);
        return this;
    }

    /**
     * Get changes
     *
     * @return changes
     **/
    @ApiModelProperty(value = "")
    public Map<String, Object> getChanges() {
        return changes;
    }

    public void setChanges(Map<String, Object> changes) {
        this.changes = changes;
    }

    public InteropTransactionRequestResponseData productId(Long productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Get productId
     *
     * @return productId
     **/
    @ApiModelProperty(value = "")
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public InteropTransactionRequestResponseData rollbackTransaction(Boolean rollbackTransaction) {
        this.rollbackTransaction = rollbackTransaction;
        return this;
    }

    /**
     * Get rollbackTransaction
     *
     * @return rollbackTransaction
     **/
    @ApiModelProperty(value = "")
    public Boolean isRollbackTransaction() {
        return rollbackTransaction;
    }

    public void setRollbackTransaction(Boolean rollbackTransaction) {
        this.rollbackTransaction = rollbackTransaction;
    }

    public InteropTransactionRequestResponseData transactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
        return this;
    }

    /**
     * Get transactionCode
     *
     * @return transactionCode
     **/
    @ApiModelProperty(required = true, value = "")
    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode;
    }

    public InteropTransactionRequestResponseData state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     *
     * @return state
     **/
    @ApiModelProperty(required = true, value = "")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public InteropTransactionRequestResponseData expiration(String expiration) {
        this.expiration = expiration;
        return this;
    }

    /**
     * Get expiration
     *
     * @return expiration
     **/
    @ApiModelProperty(value = "")
    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public InteropTransactionRequestResponseData extensionList(List<ExtensionData> extensionList) {
        this.extensionList = extensionList;
        return this;
    }

    public InteropTransactionRequestResponseData addExtensionListItem(ExtensionData extensionListItem) {
        if (this.extensionList == null) {
            this.extensionList = new ArrayList<ExtensionData>();
        }
        this.extensionList.add(extensionListItem);
        return this;
    }

    /**
     * Get extensionList
     *
     * @return extensionList
     **/
    @ApiModelProperty(value = "")
    public List<ExtensionData> getExtensionList() {
        return extensionList;
    }

    public void setExtensionList(List<ExtensionData> extensionList) {
        this.extensionList = extensionList;
    }

    public InteropTransactionRequestResponseData requestCode(String requestCode) {
        this.requestCode = requestCode;
        return this;
    }

    /**
     * Get requestCode
     *
     * @return requestCode
     **/
    @ApiModelProperty(required = true, value = "")
    public String getRequestCode() {
        return requestCode;
    }

    public void setRequestCode(String requestCode) {
        this.requestCode = requestCode;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InteropTransactionRequestResponseData interopTransactionRequestResponseData = (InteropTransactionRequestResponseData) o;
        return Objects.equals(this.officeId, interopTransactionRequestResponseData.officeId) &&
                Objects.equals(this.groupId, interopTransactionRequestResponseData.groupId) &&
                Objects.equals(this.clientId, interopTransactionRequestResponseData.clientId) &&
                Objects.equals(this.loanId, interopTransactionRequestResponseData.loanId) &&
                Objects.equals(this.savingsId, interopTransactionRequestResponseData.savingsId) &&
                Objects.equals(this.subResourceId, interopTransactionRequestResponseData.subResourceId) &&
                Objects.equals(this.transactionId, interopTransactionRequestResponseData.transactionId) &&
                Objects.equals(this.changes, interopTransactionRequestResponseData.changes) &&
                Objects.equals(this.productId, interopTransactionRequestResponseData.productId) &&
                Objects.equals(this.rollbackTransaction, interopTransactionRequestResponseData.rollbackTransaction) &&
                Objects.equals(this.transactionCode, interopTransactionRequestResponseData.transactionCode) &&
                Objects.equals(this.state, interopTransactionRequestResponseData.state) &&
                Objects.equals(this.expiration, interopTransactionRequestResponseData.expiration) &&
                Objects.equals(this.extensionList, interopTransactionRequestResponseData.extensionList) &&
                Objects.equals(this.requestCode, interopTransactionRequestResponseData.requestCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(officeId, groupId, clientId, loanId, savingsId, subResourceId, transactionId, changes, productId, rollbackTransaction, transactionCode, state, expiration, extensionList, requestCode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InteropTransactionRequestResponseData {\n");

        sb.append("    officeId: ").append(toIndentedString(officeId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
        sb.append("    savingsId: ").append(toIndentedString(savingsId)).append("\n");
        sb.append("    subResourceId: ").append(toIndentedString(subResourceId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    rollbackTransaction: ").append(toIndentedString(rollbackTransaction)).append("\n");
        sb.append("    transactionCode: ").append(toIndentedString(transactionCode)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
        sb.append("    extensionList: ").append(toIndentedString(extensionList)).append("\n");
        sb.append("    requestCode: ").append(toIndentedString(requestCode)).append("\n");
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

        public static StateEnum fromValue(String text) {
            for (StateEnum b : StateEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static class Adapter extends TypeAdapter<StateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StateEnum.fromValue(String.valueOf(value));
            }
        }
    }

}

