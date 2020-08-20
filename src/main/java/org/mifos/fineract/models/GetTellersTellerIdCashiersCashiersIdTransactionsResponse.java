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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * GetTellersTellerIdCashiersCashiersIdTransactionsResponse
 */

public class GetTellersTellerIdCashiersCashiersIdTransactionsResponse {
    @SerializedName("id")
    private Long id = null;

    @SerializedName("cashierId")
    private Long cashierId = null;

    @SerializedName("txnType")
    private CashierTxnType txnType = null;

    @SerializedName("txnAmount")
    private BigDecimal txnAmount = null;

    @SerializedName("txnDate")
    private DateTime txnDate = null;

    @SerializedName("entityId")
    private Long entityId = null;

    @SerializedName("entityType")
    private String entityType = null;

    @SerializedName("txnNote")
    private String txnNote = null;

    @SerializedName("createdDate")
    private DateTime createdDate = null;

    @SerializedName("officeId")
    private Long officeId = null;

    @SerializedName("officeName")
    private String officeName = null;

    @SerializedName("tellerId")
    private Long tellerId = null;

    @SerializedName("cashierName")
    private String cashierName = null;

    public GetTellersTellerIdCashiersCashiersIdTransactionsResponse id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
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
     *
     * @return cashierId
     **/
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
     *
     * @return txnType
     **/
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
     *
     * @return txnAmount
     **/
    @ApiModelProperty(example = "1000.0", value = "")
    public BigDecimal getTxnAmount() {
        return txnAmount;
    }

    public void setTxnAmount(BigDecimal txnAmount) {
        this.txnAmount = txnAmount;
    }

    public GetTellersTellerIdCashiersCashiersIdTransactionsResponse txnDate(DateTime txnDate) {
        this.txnDate = txnDate;
        return this;
    }

    /**
     * Get txnDate
     *
     * @return txnDate
     **/
    @ApiModelProperty(example = "Feb 25, 2015 12:00:00 AM", value = "")
    public DateTime getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(DateTime txnDate) {
        this.txnDate = txnDate;
    }

    public GetTellersTellerIdCashiersCashiersIdTransactionsResponse entityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * Get entityId
     *
     * @return entityId
     **/
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
     *
     * @return entityType
     **/
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
     *
     * @return txnNote
     **/
    @ApiModelProperty(example = "Disbursement, Loan:2-000000002,Client:1-Test 1", value = "")
    public String getTxnNote() {
        return txnNote;
    }

    public void setTxnNote(String txnNote) {
        this.txnNote = txnNote;
    }

    public GetTellersTellerIdCashiersCashiersIdTransactionsResponse createdDate(DateTime createdDate) {
        this.createdDate = createdDate;
        return this;
    }

    /**
     * Get createdDate
     *
     * @return createdDate
     **/
    @ApiModelProperty(example = "Feb 25, 2015 12:00:00 AM", value = "")
    public DateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(DateTime createdDate) {
        this.createdDate = createdDate;
    }

    public GetTellersTellerIdCashiersCashiersIdTransactionsResponse officeId(Long officeId) {
        this.officeId = officeId;
        return this;
    }

    /**
     * Get officeId
     *
     * @return officeId
     **/
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
     *
     * @return officeName
     **/
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
     *
     * @return tellerId
     **/
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
     *
     * @return cashierName
     **/
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

