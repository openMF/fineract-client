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
 * PutClientsClientIdIdentifiersIdentifierIdRequest
 */

public class PutClientsClientIdIdentifiersIdentifierIdRequest {
    @SerializedName("documentTypeId")
    private Integer documentTypeId = null;

    @SerializedName("documentKey")
    private String documentKey = null;

    @SerializedName("description")
    private String description = null;

    public PutClientsClientIdIdentifiersIdentifierIdRequest documentTypeId(Integer documentTypeId) {
        this.documentTypeId = documentTypeId;
        return this;
    }

    /**
     * Get documentTypeId
     *
     * @return documentTypeId
     **/
    @ApiModelProperty(example = "4", value = "")
    public Integer getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(Integer documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    public PutClientsClientIdIdentifiersIdentifierIdRequest documentKey(String documentKey) {
        this.documentKey = documentKey;
        return this;
    }

    /**
     * Get documentKey
     *
     * @return documentKey
     **/
    @ApiModelProperty(example = "KA-94667", value = "")
    public String getDocumentKey() {
        return documentKey;
    }

    public void setDocumentKey(String documentKey) {
        this.documentKey = documentKey;
    }

    public PutClientsClientIdIdentifiersIdentifierIdRequest description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @ApiModelProperty(example = "Document has been updated", value = "")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PutClientsClientIdIdentifiersIdentifierIdRequest putClientsClientIdIdentifiersIdentifierIdRequest = (PutClientsClientIdIdentifiersIdentifierIdRequest) o;
        return Objects.equals(this.documentTypeId, putClientsClientIdIdentifiersIdentifierIdRequest.documentTypeId) &&
                Objects.equals(this.documentKey, putClientsClientIdIdentifiersIdentifierIdRequest.documentKey) &&
                Objects.equals(this.description, putClientsClientIdIdentifiersIdentifierIdRequest.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentTypeId, documentKey, description);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PutClientsClientIdIdentifiersIdentifierIdRequest {\n");

        sb.append("    documentTypeId: ").append(toIndentedString(documentTypeId)).append("\n");
        sb.append("    documentKey: ").append(toIndentedString(documentKey)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

