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
 * GetRolesRoleIdPermissionsResponse
 */

public class GetRolesRoleIdPermissionsResponse {
  @SerializedName("id")
  private Long id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("permissionUsageData")
  private List<GetRolesRoleIdPermissionsResponsePermissionData> permissionUsageData = null;

  public GetRolesRoleIdPermissionsResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   **/
  @ApiModelProperty(example = "1", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public GetRolesRoleIdPermissionsResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   **/
  @ApiModelProperty(example = "Super Users", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GetRolesRoleIdPermissionsResponse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   **/
  @ApiModelProperty(example = "This role provides all application permissions.", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GetRolesRoleIdPermissionsResponse permissionUsageData(List<GetRolesRoleIdPermissionsResponsePermissionData> permissionUsageData) {
    this.permissionUsageData = permissionUsageData;
    return this;
  }

  public GetRolesRoleIdPermissionsResponse addPermissionUsageDataItem(GetRolesRoleIdPermissionsResponsePermissionData permissionUsageDataItem) {
    if (this.permissionUsageData == null) {
      this.permissionUsageData = new ArrayList<GetRolesRoleIdPermissionsResponsePermissionData>();
    }
    this.permissionUsageData.add(permissionUsageDataItem);
    return this;
  }

  /**
   * Get permissionUsageData
   *
   * @return permissionUsageData
   **/
  @ApiModelProperty(value = "")
  public List<GetRolesRoleIdPermissionsResponsePermissionData> getPermissionUsageData() {
    return permissionUsageData;
  }

  public void setPermissionUsageData(List<GetRolesRoleIdPermissionsResponsePermissionData> permissionUsageData) {
    this.permissionUsageData = permissionUsageData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetRolesRoleIdPermissionsResponse getRolesRoleIdPermissionsResponse = (GetRolesRoleIdPermissionsResponse) o;
    return Objects.equals(this.id, getRolesRoleIdPermissionsResponse.id) &&
            Objects.equals(this.name, getRolesRoleIdPermissionsResponse.name) &&
            Objects.equals(this.description, getRolesRoleIdPermissionsResponse.description) &&
            Objects.equals(this.permissionUsageData, getRolesRoleIdPermissionsResponse.permissionUsageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, permissionUsageData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetRolesRoleIdPermissionsResponse {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    permissionUsageData: ").append(toIndentedString(permissionUsageData)).append("\n");
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

