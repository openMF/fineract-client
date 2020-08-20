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
 * GetProductsAccountingMappings
 */

public class GetProductsAccountingMappings {
    @SerializedName("shareReferenceId")
    private GetShareReferenceId shareReferenceId = null;

    @SerializedName("incomeFromFeeAccountId")
    private GetIncomeFromFeeAccountId incomeFromFeeAccountId = null;

    @SerializedName("shareEquityId")
    private GetShareEquityId shareEquityId = null;

    @SerializedName("shareSuspenseId")
    private GetShareSuspenseId shareSuspenseId = null;

    public GetProductsAccountingMappings shareReferenceId(GetShareReferenceId shareReferenceId) {
        this.shareReferenceId = shareReferenceId;
        return this;
    }

    /**
     * Get shareReferenceId
     *
     * @return shareReferenceId
     **/
    @ApiModelProperty(value = "")
    public GetShareReferenceId getShareReferenceId() {
        return shareReferenceId;
    }

    public void setShareReferenceId(GetShareReferenceId shareReferenceId) {
        this.shareReferenceId = shareReferenceId;
    }

    public GetProductsAccountingMappings incomeFromFeeAccountId(GetIncomeFromFeeAccountId incomeFromFeeAccountId) {
        this.incomeFromFeeAccountId = incomeFromFeeAccountId;
        return this;
    }

    /**
     * Get incomeFromFeeAccountId
     *
     * @return incomeFromFeeAccountId
     **/
    @ApiModelProperty(value = "")
    public GetIncomeFromFeeAccountId getIncomeFromFeeAccountId() {
        return incomeFromFeeAccountId;
    }

    public void setIncomeFromFeeAccountId(GetIncomeFromFeeAccountId incomeFromFeeAccountId) {
        this.incomeFromFeeAccountId = incomeFromFeeAccountId;
    }

    public GetProductsAccountingMappings shareEquityId(GetShareEquityId shareEquityId) {
        this.shareEquityId = shareEquityId;
        return this;
    }

    /**
     * Get shareEquityId
     *
     * @return shareEquityId
     **/
    @ApiModelProperty(value = "")
    public GetShareEquityId getShareEquityId() {
        return shareEquityId;
    }

    public void setShareEquityId(GetShareEquityId shareEquityId) {
        this.shareEquityId = shareEquityId;
    }

    public GetProductsAccountingMappings shareSuspenseId(GetShareSuspenseId shareSuspenseId) {
        this.shareSuspenseId = shareSuspenseId;
        return this;
    }

    /**
     * Get shareSuspenseId
     *
     * @return shareSuspenseId
     **/
    @ApiModelProperty(value = "")
    public GetShareSuspenseId getShareSuspenseId() {
        return shareSuspenseId;
    }

    public void setShareSuspenseId(GetShareSuspenseId shareSuspenseId) {
        this.shareSuspenseId = shareSuspenseId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetProductsAccountingMappings getProductsAccountingMappings = (GetProductsAccountingMappings) o;
        return Objects.equals(this.shareReferenceId, getProductsAccountingMappings.shareReferenceId) &&
                Objects.equals(this.incomeFromFeeAccountId, getProductsAccountingMappings.incomeFromFeeAccountId) &&
                Objects.equals(this.shareEquityId, getProductsAccountingMappings.shareEquityId) &&
                Objects.equals(this.shareSuspenseId, getProductsAccountingMappings.shareSuspenseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareReferenceId, incomeFromFeeAccountId, shareEquityId, shareSuspenseId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProductsAccountingMappings {\n");

        sb.append("    shareReferenceId: ").append(toIndentedString(shareReferenceId)).append("\n");
        sb.append("    incomeFromFeeAccountId: ").append(toIndentedString(incomeFromFeeAccountId)).append("\n");
        sb.append("    shareEquityId: ").append(toIndentedString(shareEquityId)).append("\n");
        sb.append("    shareSuspenseId: ").append(toIndentedString(shareSuspenseId)).append("\n");
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

