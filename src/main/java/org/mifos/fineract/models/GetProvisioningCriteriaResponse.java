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
 * GetProvisioningCriteriaResponse
 */

public class GetProvisioningCriteriaResponse {
    @SerializedName("criteriaId")
    private Long criteriaId = null;

    @SerializedName("criteriaName")
    private String criteriaName = null;

    @SerializedName("createdBy")
    private String createdBy = null;

    public GetProvisioningCriteriaResponse criteriaId(Long criteriaId) {
        this.criteriaId = criteriaId;
        return this;
    }

    /**
     * Get criteriaId
     *
     * @return criteriaId
     **/
    @ApiModelProperty(example = "1", value = "")
    public Long getCriteriaId() {
        return criteriaId;
    }

    public void setCriteriaId(Long criteriaId) {
        this.criteriaId = criteriaId;
    }

    public GetProvisioningCriteriaResponse criteriaName(String criteriaName) {
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

    public GetProvisioningCriteriaResponse createdBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * Get createdBy
     *
     * @return createdBy
     **/
    @ApiModelProperty(example = "mifos", value = "")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetProvisioningCriteriaResponse getProvisioningCriteriaResponse = (GetProvisioningCriteriaResponse) o;
        return Objects.equals(this.criteriaId, getProvisioningCriteriaResponse.criteriaId) &&
                Objects.equals(this.criteriaName, getProvisioningCriteriaResponse.criteriaName) &&
                Objects.equals(this.createdBy, getProvisioningCriteriaResponse.createdBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criteriaId, criteriaName, createdBy);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetProvisioningCriteriaResponse {\n");

        sb.append("    criteriaId: ").append(toIndentedString(criteriaId)).append("\n");
        sb.append("    criteriaName: ").append(toIndentedString(criteriaName)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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

