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
 * DeleteEntityTypeEntityIdDocumentsResponse
 */

public class DeleteEntityTypeEntityIdDocumentsResponse {
    @SerializedName("resourceId")
    private Long resourceId = null;

    @SerializedName("changes")
    private PutEntityTypeEntityIdDocumentsResponseChangesSwagger changes = null;

    @SerializedName("resourceIdentifier")
    private String resourceIdentifier = null;

    public DeleteEntityTypeEntityIdDocumentsResponse resourceId(Long resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get resourceId
     *
     * @return resourceId
     **/
    @ApiModelProperty(example = "3", value = "")
    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    public DeleteEntityTypeEntityIdDocumentsResponse changes(PutEntityTypeEntityIdDocumentsResponseChangesSwagger changes) {
        this.changes = changes;
        return this;
    }

    /**
     * Get changes
     *
     * @return changes
     **/
    @ApiModelProperty(value = "")
    public PutEntityTypeEntityIdDocumentsResponseChangesSwagger getChanges() {
        return changes;
    }

    public void setChanges(PutEntityTypeEntityIdDocumentsResponseChangesSwagger changes) {
        this.changes = changes;
    }

    public DeleteEntityTypeEntityIdDocumentsResponse resourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    /**
     * Get resourceIdentifier
     *
     * @return resourceIdentifier
     **/
    @ApiModelProperty(example = "3", value = "")
    public String getResourceIdentifier() {
        return resourceIdentifier;
    }

    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteEntityTypeEntityIdDocumentsResponse deleteEntityTypeEntityIdDocumentsResponse = (DeleteEntityTypeEntityIdDocumentsResponse) o;
        return Objects.equals(this.resourceId, deleteEntityTypeEntityIdDocumentsResponse.resourceId) &&
                Objects.equals(this.changes, deleteEntityTypeEntityIdDocumentsResponse.changes) &&
                Objects.equals(this.resourceIdentifier, deleteEntityTypeEntityIdDocumentsResponse.resourceIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, changes, resourceIdentifier);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEntityTypeEntityIdDocumentsResponse {\n");

        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
        sb.append("    resourceIdentifier: ").append(toIndentedString(resourceIdentifier)).append("\n");
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

