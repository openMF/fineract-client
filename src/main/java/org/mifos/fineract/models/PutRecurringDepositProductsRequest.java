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
 * PutRecurringDepositProductsRequest
 */

public class PutRecurringDepositProductsRequest {
    @SerializedName("description")
    private String description = null;

    @SerializedName("locale")
    private String locale = null;

    @SerializedName("minDepositTerm")
    private Integer minDepositTerm = null;

    @SerializedName("minDepositTermTypeId")
    private Integer minDepositTermTypeId = null;

    public PutRecurringDepositProductsRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @ApiModelProperty(example = "Recurring deposit product new offerings", value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PutRecurringDepositProductsRequest locale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * Get locale
     *
     * @return locale
     **/
    @ApiModelProperty(example = "en", value = "")
    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public PutRecurringDepositProductsRequest minDepositTerm(Integer minDepositTerm) {
        this.minDepositTerm = minDepositTerm;
        return this;
    }

    /**
     * Get minDepositTerm
     *
     * @return minDepositTerm
     **/
    @ApiModelProperty(example = "5", value = "")
    public Integer getMinDepositTerm() {
        return minDepositTerm;
    }

    public void setMinDepositTerm(Integer minDepositTerm) {
        this.minDepositTerm = minDepositTerm;
    }

    public PutRecurringDepositProductsRequest minDepositTermTypeId(Integer minDepositTermTypeId) {
        this.minDepositTermTypeId = minDepositTermTypeId;
        return this;
    }

    /**
     * Get minDepositTermTypeId
     *
     * @return minDepositTermTypeId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Integer getMinDepositTermTypeId() {
        return minDepositTermTypeId;
    }

    public void setMinDepositTermTypeId(Integer minDepositTermTypeId) {
        this.minDepositTermTypeId = minDepositTermTypeId;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutRecurringDepositProductsRequest putRecurringDepositProductsRequest = (PutRecurringDepositProductsRequest) o;
        return Objects.equals(this.description, putRecurringDepositProductsRequest.description) &&
                Objects.equals(this.locale, putRecurringDepositProductsRequest.locale) &&
                Objects.equals(this.minDepositTerm, putRecurringDepositProductsRequest.minDepositTerm) &&
                Objects.equals(this.minDepositTermTypeId, putRecurringDepositProductsRequest.minDepositTermTypeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, locale, minDepositTerm, minDepositTermTypeId);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutRecurringDepositProductsRequest {\n");

        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    minDepositTerm: ").append(toIndentedString(minDepositTerm)).append("\n");
        sb.append("    minDepositTermTypeId: ").append(toIndentedString(minDepositTermTypeId)).append("\n");
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

