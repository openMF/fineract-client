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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PostProvisioningCriteriaRequest
 */

public class PostProvisioningCriteriaRequest {
    @SerializedName("criteriaName")
    private String criteriaName = null;

    @SerializedName("loanProducts")
    private List<LoanProductData> loanProducts = null;

    @SerializedName("provisioningcriteria")
    private List<ProvisioningCriteriaDefinitionData> provisioningcriteria = null;

    public PostProvisioningCriteriaRequest criteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
        return this;
    }

    /**
     * Get criteriaName
     *
     * @return criteriaName
     **/
    @ApiModelProperty(example = "High Risk Products Criteria", value = "")
    public String getCriteriaName() {
        return criteriaName;
    }

    public void setCriteriaName(String criteriaName) {
        this.criteriaName = criteriaName;
    }

    public PostProvisioningCriteriaRequest loanProducts(List<LoanProductData> loanProducts) {
        this.loanProducts = loanProducts;
        return this;
    }

    public PostProvisioningCriteriaRequest addLoanProductsItem(LoanProductData loanProductsItem) {
        if (this.loanProducts == null) {
            this.loanProducts = new ArrayList<LoanProductData>();
        }
        this.loanProducts.add(loanProductsItem);
        return this;
    }

    /**
     * Get loanProducts
     *
     * @return loanProducts
     **/
    @ApiModelProperty(value = "")
    public List<LoanProductData> getLoanProducts() {
        return loanProducts;
    }

    public void setLoanProducts(List<LoanProductData> loanProducts) {
        this.loanProducts = loanProducts;
    }

    public PostProvisioningCriteriaRequest provisioningcriteria(List<ProvisioningCriteriaDefinitionData> provisioningcriteria) {
        this.provisioningcriteria = provisioningcriteria;
        return this;
    }

    public PostProvisioningCriteriaRequest addProvisioningcriteriaItem(ProvisioningCriteriaDefinitionData provisioningcriteriaItem) {
        if (this.provisioningcriteria == null) {
            this.provisioningcriteria = new ArrayList<ProvisioningCriteriaDefinitionData>();
        }
        this.provisioningcriteria.add(provisioningcriteriaItem);
        return this;
    }

    /**
     * Get provisioningcriteria
     *
     * @return provisioningcriteria
     **/
    @ApiModelProperty(value = "")
    public List<ProvisioningCriteriaDefinitionData> getProvisioningcriteria() {
        return provisioningcriteria;
    }

    public void setProvisioningcriteria(List<ProvisioningCriteriaDefinitionData> provisioningcriteria) {
        this.provisioningcriteria = provisioningcriteria;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostProvisioningCriteriaRequest postProvisioningCriteriaRequest = (PostProvisioningCriteriaRequest) o;
        return Objects.equals(this.criteriaName, postProvisioningCriteriaRequest.criteriaName) &&
                Objects.equals(this.loanProducts, postProvisioningCriteriaRequest.loanProducts) &&
                Objects.equals(this.provisioningcriteria, postProvisioningCriteriaRequest.provisioningcriteria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criteriaName, loanProducts, provisioningcriteria);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostProvisioningCriteriaRequest {\n");

        sb.append("    criteriaName: ").append(toIndentedString(criteriaName)).append("\n");
        sb.append("    loanProducts: ").append(toIndentedString(loanProducts)).append("\n");
        sb.append("    provisioningcriteria: ").append(toIndentedString(provisioningcriteria)).append("\n");
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

