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

import java.util.Objects;

/**
 * GetAccountsSummary
 */

public class GetAccountsSummary {
    @SerializedName("id")
    private Integer id = null;

    @SerializedName("accountNo")
    private Long accountNo = null;

    @SerializedName("totalApprovedShares")
    private Integer totalApprovedShares = null;

    @SerializedName("totalPendingForApprovalShares")
    private Integer totalPendingForApprovalShares = null;

    @SerializedName("productId")
    private Integer productId = null;

    @SerializedName("productName")
    private String productName = null;

    @SerializedName("status")
    private GetAccountsStatus status = null;

    @SerializedName("timeline")
    private GetAccountsTimeline timeline = null;

    @SerializedName("currency")
    private GetAccountsCurrency currency = null;

    public GetAccountsSummary id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @ApiModelProperty(example = "2", value = "")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public GetAccountsSummary accountNo(Long accountNo) {
        this.accountNo = accountNo;
        return this;
    }

    /**
     * Get accountNo
     *
     * @return accountNo
     **/
    @ApiModelProperty(example = "2", value = "")
    public Long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Long accountNo) {
        this.accountNo = accountNo;
    }

    public GetAccountsSummary totalApprovedShares(Integer totalApprovedShares) {
        this.totalApprovedShares = totalApprovedShares;
        return this;
    }

    /**
     * Get totalApprovedShares
     *
     * @return totalApprovedShares
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getTotalApprovedShares() {
        return totalApprovedShares;
    }

    public void setTotalApprovedShares(Integer totalApprovedShares) {
        this.totalApprovedShares = totalApprovedShares;
    }

    public GetAccountsSummary totalPendingForApprovalShares(Integer totalPendingForApprovalShares) {
        this.totalPendingForApprovalShares = totalPendingForApprovalShares;
        return this;
    }

    /**
     * Get totalPendingForApprovalShares
     *
     * @return totalPendingForApprovalShares
     **/
    @ApiModelProperty(example = "0", value = "")
    public Integer getTotalPendingForApprovalShares() {
        return totalPendingForApprovalShares;
    }

    public void setTotalPendingForApprovalShares(Integer totalPendingForApprovalShares) {
        this.totalPendingForApprovalShares = totalPendingForApprovalShares;
    }

    public GetAccountsSummary productId(Integer productId) {
        this.productId = productId;
        return this;
    }

    /**
     * Get productId
     *
     * @return productId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public GetAccountsSummary productName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * Get productName
     *
     * @return productName
     **/
    @ApiModelProperty(example = "Conflux Share Product", value = "")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public GetAccountsSummary status(GetAccountsStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     **/
    @ApiModelProperty(value = "")
    public GetAccountsStatus getStatus() {
        return status;
    }

    public void setStatus(GetAccountsStatus status) {
        this.status = status;
    }

    public GetAccountsSummary timeline(GetAccountsTimeline timeline) {
        this.timeline = timeline;
        return this;
    }

    /**
     * Get timeline
     *
     * @return timeline
     **/
    @ApiModelProperty(value = "")
    public GetAccountsTimeline getTimeline() {
        return timeline;
    }

    public void setTimeline(GetAccountsTimeline timeline) {
        this.timeline = timeline;
    }

    public GetAccountsSummary currency(GetAccountsCurrency currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Get currency
     *
     * @return currency
     **/
    @ApiModelProperty(value = "")
    public GetAccountsCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(GetAccountsCurrency currency) {
        this.currency = currency;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetAccountsSummary getAccountsSummary = (GetAccountsSummary) o;
        return Objects.equals(this.id, getAccountsSummary.id) &&
                Objects.equals(this.accountNo, getAccountsSummary.accountNo) &&
                Objects.equals(this.totalApprovedShares, getAccountsSummary.totalApprovedShares) &&
                Objects.equals(this.totalPendingForApprovalShares, getAccountsSummary.totalPendingForApprovalShares) &&
                Objects.equals(this.productId, getAccountsSummary.productId) &&
                Objects.equals(this.productName, getAccountsSummary.productName) &&
                Objects.equals(this.status, getAccountsSummary.status) &&
                Objects.equals(this.timeline, getAccountsSummary.timeline) &&
                Objects.equals(this.currency, getAccountsSummary.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNo, totalApprovedShares, totalPendingForApprovalShares, productId, productName, status, timeline, currency);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetAccountsSummary {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
        sb.append("    totalApprovedShares: ").append(toIndentedString(totalApprovedShares)).append("\n");
        sb.append("    totalPendingForApprovalShares: ").append(toIndentedString(totalPendingForApprovalShares)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    timeline: ").append(toIndentedString(timeline)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

