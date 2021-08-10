/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * Apache Fineract
 * Apache Fineract is a secure, multi-tenanted microfinance platform  The goal of the Apache Fineract API is to empower developers to build apps on top of the Apache Fineract Platform<br>The [reference app](https://cui.fineract.dev) (username: mifos, password: password) works on the same demo tenant as the interactive links in this documentation  - The API is organized around [REST](https://en.wikipedia.org/wiki/Representational_state_transfer) - Find out more about Apache Fineract [here](/fineract-provider/api-docs/apiLive.htm#top) - You can [Try The API From Your Browser](/fineract-provider/api-docs/apiLive.htm#interact) - The Generic Options are available [here](/fineract-provider/api-docs/apiLive.htm#genopts) - Find out more about [Updating Dates and Numbers](/fineract-provider/api-docs/apiLive.htm#dates_and_numbers) - For the Authentication and the Basic of HTTP and HTTPS refer [here](/fineract-provider/api-docs/apiLive.htm#authentication_overview) - Check about ERROR codes [here](/fineract-provider/api-docs/apiLive.htm#errors)  Please refer to the [old documentation](/fineract-provider/api-docs/apiLive.htm) for any documentation queries
 *
 * The version of the OpenAPI document: 1.5.0-11-gd287218-dirty
 * Contact: dev@fineract.apache.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.apache.fineract.client.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CommandWrapper
 */

public class CommandWrapper {
  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private Long groupId;

  public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private Long clientId;

  public static final String SERIALIZED_NAME_LOAN_ID = "loanId";
  @SerializedName(SERIALIZED_NAME_LOAN_ID)
  private Long loanId;

  public static final String SERIALIZED_NAME_SAVINGS_ID = "savingsId";
  @SerializedName(SERIALIZED_NAME_SAVINGS_ID)
  private Long savingsId;

  public static final String SERIALIZED_NAME_ENTITY_NAME = "entityName";
  @SerializedName(SERIALIZED_NAME_ENTITY_NAME)
  private String entityName;

  public static final String SERIALIZED_NAME_TASK_PERMISSION_NAME = "taskPermissionName";
  @SerializedName(SERIALIZED_NAME_TASK_PERMISSION_NAME)
  private String taskPermissionName;

  public static final String SERIALIZED_NAME_ENTITY_ID = "entityId";
  @SerializedName(SERIALIZED_NAME_ENTITY_ID)
  private Long entityId;

  public static final String SERIALIZED_NAME_SUBENTITY_ID = "subentityId";
  @SerializedName(SERIALIZED_NAME_SUBENTITY_ID)
  private Long subentityId;

  public static final String SERIALIZED_NAME_HREF = "href";
  @SerializedName(SERIALIZED_NAME_HREF)
  private String href;

  public static final String SERIALIZED_NAME_JSON = "json";
  @SerializedName(SERIALIZED_NAME_JSON)
  private String json;

  public static final String SERIALIZED_NAME_TRANSACTION_ID = "transactionId";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_ID)
  private String transactionId;

  public static final String SERIALIZED_NAME_PRODUCT_ID = "productId";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId;

  public static final String SERIALIZED_NAME_CREDIT_BUREAU_ID = "creditBureauId";
  @SerializedName(SERIALIZED_NAME_CREDIT_BUREAU_ID)
  private Long creditBureauId;

  public static final String SERIALIZED_NAME_ORGANISATION_CREDIT_BUREAU_ID = "organisationCreditBureauId";
  @SerializedName(SERIALIZED_NAME_ORGANISATION_CREDIT_BUREAU_ID)
  private Long organisationCreditBureauId;

  public static final String SERIALIZED_NAME_UPDATE = "update";
  @SerializedName(SERIALIZED_NAME_UPDATE)
  private Boolean update;

  public static final String SERIALIZED_NAME_CREATE = "create";
  @SerializedName(SERIALIZED_NAME_CREATE)
  private Boolean create;

  public static final String SERIALIZED_NAME_CREATE_DATATABLE = "createDatatable";
  @SerializedName(SERIALIZED_NAME_CREATE_DATATABLE)
  private Boolean createDatatable;

  public static final String SERIALIZED_NAME_DELETE = "delete";
  @SerializedName(SERIALIZED_NAME_DELETE)
  private Boolean delete;

  public static final String SERIALIZED_NAME_DELETE_DATATABLE = "deleteDatatable";
  @SerializedName(SERIALIZED_NAME_DELETE_DATATABLE)
  private Boolean deleteDatatable;

  public static final String SERIALIZED_NAME_UPDATE_DATATABLE = "updateDatatable";
  @SerializedName(SERIALIZED_NAME_UPDATE_DATATABLE)
  private Boolean updateDatatable;

  public static final String SERIALIZED_NAME_DATATABLE_RESOURCE = "datatableResource";
  @SerializedName(SERIALIZED_NAME_DATATABLE_RESOURCE)
  private Boolean datatableResource;

  public static final String SERIALIZED_NAME_DELETE_ONE_TO_ONE = "deleteOneToOne";
  @SerializedName(SERIALIZED_NAME_DELETE_ONE_TO_ONE)
  private Boolean deleteOneToOne;

  public static final String SERIALIZED_NAME_DELETE_MULTIPLE = "deleteMultiple";
  @SerializedName(SERIALIZED_NAME_DELETE_MULTIPLE)
  private Boolean deleteMultiple;

  public static final String SERIALIZED_NAME_UPDATE_ONE_TO_ONE = "updateOneToOne";
  @SerializedName(SERIALIZED_NAME_UPDATE_ONE_TO_ONE)
  private Boolean updateOneToOne;

  public static final String SERIALIZED_NAME_UPDATE_MULTIPLE = "updateMultiple";
  @SerializedName(SERIALIZED_NAME_UPDATE_MULTIPLE)
  private Boolean updateMultiple;

  public static final String SERIALIZED_NAME_REGISTER_DATATABLE = "registerDatatable";
  @SerializedName(SERIALIZED_NAME_REGISTER_DATATABLE)
  private Boolean registerDatatable;

  public static final String SERIALIZED_NAME_NOTE_RESOURCE = "noteResource";
  @SerializedName(SERIALIZED_NAME_NOTE_RESOURCE)
  private Boolean noteResource;

  public static final String SERIALIZED_NAME_CACHE_RESOURCE = "cacheResource";
  @SerializedName(SERIALIZED_NAME_CACHE_RESOURCE)
  private Boolean cacheResource;

  public static final String SERIALIZED_NAME_UPDATE_OPERATION = "updateOperation";
  @SerializedName(SERIALIZED_NAME_UPDATE_OPERATION)
  private Boolean updateOperation;

  public static final String SERIALIZED_NAME_DELETE_OPERATION = "deleteOperation";
  @SerializedName(SERIALIZED_NAME_DELETE_OPERATION)
  private Boolean deleteOperation;

  public static final String SERIALIZED_NAME_SURVEY_RESOURCE = "surveyResource";
  @SerializedName(SERIALIZED_NAME_SURVEY_RESOURCE)
  private Boolean surveyResource;

  public static final String SERIALIZED_NAME_REGISTER_SURVEY = "registerSurvey";
  @SerializedName(SERIALIZED_NAME_REGISTER_SURVEY)
  private Boolean registerSurvey;

  public static final String SERIALIZED_NAME_FULL_FIL_SURVEY = "fullFilSurvey";
  @SerializedName(SERIALIZED_NAME_FULL_FIL_SURVEY)
  private Boolean fullFilSurvey;

  public static final String SERIALIZED_NAME_WORKING_DAYS_RESOURCE = "workingDaysResource";
  @SerializedName(SERIALIZED_NAME_WORKING_DAYS_RESOURCE)
  private Boolean workingDaysResource;

  public static final String SERIALIZED_NAME_PASSWORD_PREFERENCES_RESOURCE = "passwordPreferencesResource";
  @SerializedName(SERIALIZED_NAME_PASSWORD_PREFERENCES_RESOURCE)
  private Boolean passwordPreferencesResource;

  public static final String SERIALIZED_NAME_PERMISSION_RESOURCE = "permissionResource";
  @SerializedName(SERIALIZED_NAME_PERMISSION_RESOURCE)
  private Boolean permissionResource;

  public static final String SERIALIZED_NAME_USER_RESOURCE = "userResource";
  @SerializedName(SERIALIZED_NAME_USER_RESOURCE)
  private Boolean userResource;

  public static final String SERIALIZED_NAME_CURRENCY_RESOURCE = "currencyResource";
  @SerializedName(SERIALIZED_NAME_CURRENCY_RESOURCE)
  private Boolean currencyResource;

  public static final String SERIALIZED_NAME_LOAN_DISBURSE_DETAIL_RESOURCE = "loanDisburseDetailResource";
  @SerializedName(SERIALIZED_NAME_LOAN_DISBURSE_DETAIL_RESOURCE)
  private Boolean loanDisburseDetailResource;

  public static final String SERIALIZED_NAME_UPDATE_DISBURSEMENT_DATE = "updateDisbursementDate";
  @SerializedName(SERIALIZED_NAME_UPDATE_DISBURSEMENT_DATE)
  private Boolean updateDisbursementDate;


  public CommandWrapper groupId(Long groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getGroupId() {
    return groupId;
  }


  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }


  public CommandWrapper clientId(Long clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getClientId() {
    return clientId;
  }


  public void setClientId(Long clientId) {
    this.clientId = clientId;
  }


  public CommandWrapper loanId(Long loanId) {
    
    this.loanId = loanId;
    return this;
  }

   /**
   * Get loanId
   * @return loanId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLoanId() {
    return loanId;
  }


  public void setLoanId(Long loanId) {
    this.loanId = loanId;
  }


  public CommandWrapper savingsId(Long savingsId) {
    
    this.savingsId = savingsId;
    return this;
  }

   /**
   * Get savingsId
   * @return savingsId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSavingsId() {
    return savingsId;
  }


  public void setSavingsId(Long savingsId) {
    this.savingsId = savingsId;
  }


  public CommandWrapper entityName(String entityName) {
    
    this.entityName = entityName;
    return this;
  }

   /**
   * Get entityName
   * @return entityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getEntityName() {
    return entityName;
  }


  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }


  public CommandWrapper taskPermissionName(String taskPermissionName) {
    
    this.taskPermissionName = taskPermissionName;
    return this;
  }

   /**
   * Get taskPermissionName
   * @return taskPermissionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskPermissionName() {
    return taskPermissionName;
  }


  public void setTaskPermissionName(String taskPermissionName) {
    this.taskPermissionName = taskPermissionName;
  }


  public CommandWrapper entityId(Long entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getEntityId() {
    return entityId;
  }


  public void setEntityId(Long entityId) {
    this.entityId = entityId;
  }


  public CommandWrapper subentityId(Long subentityId) {
    
    this.subentityId = subentityId;
    return this;
  }

   /**
   * Get subentityId
   * @return subentityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getSubentityId() {
    return subentityId;
  }


  public void setSubentityId(Long subentityId) {
    this.subentityId = subentityId;
  }


  public CommandWrapper href(String href) {
    
    this.href = href;
    return this;
  }

   /**
   * Get href
   * @return href
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHref() {
    return href;
  }


  public void setHref(String href) {
    this.href = href;
  }


  public CommandWrapper json(String json) {
    
    this.json = json;
    return this;
  }

   /**
   * Get json
   * @return json
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJson() {
    return json;
  }


  public void setJson(String json) {
    this.json = json;
  }


  public CommandWrapper transactionId(String transactionId) {
    
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Get transactionId
   * @return transactionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTransactionId() {
    return transactionId;
  }


  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }


  public CommandWrapper productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * Get productId
   * @return productId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public CommandWrapper creditBureauId(Long creditBureauId) {
    
    this.creditBureauId = creditBureauId;
    return this;
  }

   /**
   * Get creditBureauId
   * @return creditBureauId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getCreditBureauId() {
    return creditBureauId;
  }


  public void setCreditBureauId(Long creditBureauId) {
    this.creditBureauId = creditBureauId;
  }


  public CommandWrapper organisationCreditBureauId(Long organisationCreditBureauId) {
    
    this.organisationCreditBureauId = organisationCreditBureauId;
    return this;
  }

   /**
   * Get organisationCreditBureauId
   * @return organisationCreditBureauId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getOrganisationCreditBureauId() {
    return organisationCreditBureauId;
  }


  public void setOrganisationCreditBureauId(Long organisationCreditBureauId) {
    this.organisationCreditBureauId = organisationCreditBureauId;
  }


  public CommandWrapper update(Boolean update) {
    
    this.update = update;
    return this;
  }

   /**
   * Get update
   * @return update
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUpdate() {
    return update;
  }


  public void setUpdate(Boolean update) {
    this.update = update;
  }


  public CommandWrapper create(Boolean create) {
    
    this.create = create;
    return this;
  }

   /**
   * Get create
   * @return create
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCreate() {
    return create;
  }


  public void setCreate(Boolean create) {
    this.create = create;
  }


  public CommandWrapper createDatatable(Boolean createDatatable) {
    
    this.createDatatable = createDatatable;
    return this;
  }

   /**
   * Get createDatatable
   * @return createDatatable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCreateDatatable() {
    return createDatatable;
  }


  public void setCreateDatatable(Boolean createDatatable) {
    this.createDatatable = createDatatable;
  }


  public CommandWrapper delete(Boolean delete) {
    
    this.delete = delete;
    return this;
  }

   /**
   * Get delete
   * @return delete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDelete() {
    return delete;
  }


  public void setDelete(Boolean delete) {
    this.delete = delete;
  }


  public CommandWrapper deleteDatatable(Boolean deleteDatatable) {
    
    this.deleteDatatable = deleteDatatable;
    return this;
  }

   /**
   * Get deleteDatatable
   * @return deleteDatatable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleteDatatable() {
    return deleteDatatable;
  }


  public void setDeleteDatatable(Boolean deleteDatatable) {
    this.deleteDatatable = deleteDatatable;
  }


  public CommandWrapper updateDatatable(Boolean updateDatatable) {
    
    this.updateDatatable = updateDatatable;
    return this;
  }

   /**
   * Get updateDatatable
   * @return updateDatatable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUpdateDatatable() {
    return updateDatatable;
  }


  public void setUpdateDatatable(Boolean updateDatatable) {
    this.updateDatatable = updateDatatable;
  }


  public CommandWrapper datatableResource(Boolean datatableResource) {
    
    this.datatableResource = datatableResource;
    return this;
  }

   /**
   * Get datatableResource
   * @return datatableResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDatatableResource() {
    return datatableResource;
  }


  public void setDatatableResource(Boolean datatableResource) {
    this.datatableResource = datatableResource;
  }


  public CommandWrapper deleteOneToOne(Boolean deleteOneToOne) {
    
    this.deleteOneToOne = deleteOneToOne;
    return this;
  }

   /**
   * Get deleteOneToOne
   * @return deleteOneToOne
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleteOneToOne() {
    return deleteOneToOne;
  }


  public void setDeleteOneToOne(Boolean deleteOneToOne) {
    this.deleteOneToOne = deleteOneToOne;
  }


  public CommandWrapper deleteMultiple(Boolean deleteMultiple) {
    
    this.deleteMultiple = deleteMultiple;
    return this;
  }

   /**
   * Get deleteMultiple
   * @return deleteMultiple
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleteMultiple() {
    return deleteMultiple;
  }


  public void setDeleteMultiple(Boolean deleteMultiple) {
    this.deleteMultiple = deleteMultiple;
  }


  public CommandWrapper updateOneToOne(Boolean updateOneToOne) {
    
    this.updateOneToOne = updateOneToOne;
    return this;
  }

   /**
   * Get updateOneToOne
   * @return updateOneToOne
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUpdateOneToOne() {
    return updateOneToOne;
  }


  public void setUpdateOneToOne(Boolean updateOneToOne) {
    this.updateOneToOne = updateOneToOne;
  }


  public CommandWrapper updateMultiple(Boolean updateMultiple) {
    
    this.updateMultiple = updateMultiple;
    return this;
  }

   /**
   * Get updateMultiple
   * @return updateMultiple
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUpdateMultiple() {
    return updateMultiple;
  }


  public void setUpdateMultiple(Boolean updateMultiple) {
    this.updateMultiple = updateMultiple;
  }


  public CommandWrapper registerDatatable(Boolean registerDatatable) {
    
    this.registerDatatable = registerDatatable;
    return this;
  }

   /**
   * Get registerDatatable
   * @return registerDatatable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRegisterDatatable() {
    return registerDatatable;
  }


  public void setRegisterDatatable(Boolean registerDatatable) {
    this.registerDatatable = registerDatatable;
  }


  public CommandWrapper noteResource(Boolean noteResource) {
    
    this.noteResource = noteResource;
    return this;
  }

   /**
   * Get noteResource
   * @return noteResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getNoteResource() {
    return noteResource;
  }


  public void setNoteResource(Boolean noteResource) {
    this.noteResource = noteResource;
  }


  public CommandWrapper cacheResource(Boolean cacheResource) {
    
    this.cacheResource = cacheResource;
    return this;
  }

   /**
   * Get cacheResource
   * @return cacheResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCacheResource() {
    return cacheResource;
  }


  public void setCacheResource(Boolean cacheResource) {
    this.cacheResource = cacheResource;
  }


  public CommandWrapper updateOperation(Boolean updateOperation) {
    
    this.updateOperation = updateOperation;
    return this;
  }

   /**
   * Get updateOperation
   * @return updateOperation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUpdateOperation() {
    return updateOperation;
  }


  public void setUpdateOperation(Boolean updateOperation) {
    this.updateOperation = updateOperation;
  }


  public CommandWrapper deleteOperation(Boolean deleteOperation) {
    
    this.deleteOperation = deleteOperation;
    return this;
  }

   /**
   * Get deleteOperation
   * @return deleteOperation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getDeleteOperation() {
    return deleteOperation;
  }


  public void setDeleteOperation(Boolean deleteOperation) {
    this.deleteOperation = deleteOperation;
  }


  public CommandWrapper surveyResource(Boolean surveyResource) {
    
    this.surveyResource = surveyResource;
    return this;
  }

   /**
   * Get surveyResource
   * @return surveyResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSurveyResource() {
    return surveyResource;
  }


  public void setSurveyResource(Boolean surveyResource) {
    this.surveyResource = surveyResource;
  }


  public CommandWrapper registerSurvey(Boolean registerSurvey) {
    
    this.registerSurvey = registerSurvey;
    return this;
  }

   /**
   * Get registerSurvey
   * @return registerSurvey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRegisterSurvey() {
    return registerSurvey;
  }


  public void setRegisterSurvey(Boolean registerSurvey) {
    this.registerSurvey = registerSurvey;
  }


  public CommandWrapper fullFilSurvey(Boolean fullFilSurvey) {
    
    this.fullFilSurvey = fullFilSurvey;
    return this;
  }

   /**
   * Get fullFilSurvey
   * @return fullFilSurvey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getFullFilSurvey() {
    return fullFilSurvey;
  }


  public void setFullFilSurvey(Boolean fullFilSurvey) {
    this.fullFilSurvey = fullFilSurvey;
  }


  public CommandWrapper workingDaysResource(Boolean workingDaysResource) {
    
    this.workingDaysResource = workingDaysResource;
    return this;
  }

   /**
   * Get workingDaysResource
   * @return workingDaysResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getWorkingDaysResource() {
    return workingDaysResource;
  }


  public void setWorkingDaysResource(Boolean workingDaysResource) {
    this.workingDaysResource = workingDaysResource;
  }


  public CommandWrapper passwordPreferencesResource(Boolean passwordPreferencesResource) {
    
    this.passwordPreferencesResource = passwordPreferencesResource;
    return this;
  }

   /**
   * Get passwordPreferencesResource
   * @return passwordPreferencesResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPasswordPreferencesResource() {
    return passwordPreferencesResource;
  }


  public void setPasswordPreferencesResource(Boolean passwordPreferencesResource) {
    this.passwordPreferencesResource = passwordPreferencesResource;
  }


  public CommandWrapper permissionResource(Boolean permissionResource) {
    
    this.permissionResource = permissionResource;
    return this;
  }

   /**
   * Get permissionResource
   * @return permissionResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPermissionResource() {
    return permissionResource;
  }


  public void setPermissionResource(Boolean permissionResource) {
    this.permissionResource = permissionResource;
  }


  public CommandWrapper userResource(Boolean userResource) {
    
    this.userResource = userResource;
    return this;
  }

   /**
   * Get userResource
   * @return userResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUserResource() {
    return userResource;
  }


  public void setUserResource(Boolean userResource) {
    this.userResource = userResource;
  }


  public CommandWrapper currencyResource(Boolean currencyResource) {
    
    this.currencyResource = currencyResource;
    return this;
  }

   /**
   * Get currencyResource
   * @return currencyResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getCurrencyResource() {
    return currencyResource;
  }


  public void setCurrencyResource(Boolean currencyResource) {
    this.currencyResource = currencyResource;
  }


  public CommandWrapper loanDisburseDetailResource(Boolean loanDisburseDetailResource) {
    
    this.loanDisburseDetailResource = loanDisburseDetailResource;
    return this;
  }

   /**
   * Get loanDisburseDetailResource
   * @return loanDisburseDetailResource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getLoanDisburseDetailResource() {
    return loanDisburseDetailResource;
  }


  public void setLoanDisburseDetailResource(Boolean loanDisburseDetailResource) {
    this.loanDisburseDetailResource = loanDisburseDetailResource;
  }


  public CommandWrapper updateDisbursementDate(Boolean updateDisbursementDate) {
    
    this.updateDisbursementDate = updateDisbursementDate;
    return this;
  }

   /**
   * Get updateDisbursementDate
   * @return updateDisbursementDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUpdateDisbursementDate() {
    return updateDisbursementDate;
  }


  public void setUpdateDisbursementDate(Boolean updateDisbursementDate) {
    this.updateDisbursementDate = updateDisbursementDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommandWrapper commandWrapper = (CommandWrapper) o;
    return Objects.equals(this.groupId, commandWrapper.groupId) &&
        Objects.equals(this.clientId, commandWrapper.clientId) &&
        Objects.equals(this.loanId, commandWrapper.loanId) &&
        Objects.equals(this.savingsId, commandWrapper.savingsId) &&
        Objects.equals(this.entityName, commandWrapper.entityName) &&
        Objects.equals(this.taskPermissionName, commandWrapper.taskPermissionName) &&
        Objects.equals(this.entityId, commandWrapper.entityId) &&
        Objects.equals(this.subentityId, commandWrapper.subentityId) &&
        Objects.equals(this.href, commandWrapper.href) &&
        Objects.equals(this.json, commandWrapper.json) &&
        Objects.equals(this.transactionId, commandWrapper.transactionId) &&
        Objects.equals(this.productId, commandWrapper.productId) &&
        Objects.equals(this.creditBureauId, commandWrapper.creditBureauId) &&
        Objects.equals(this.organisationCreditBureauId, commandWrapper.organisationCreditBureauId) &&
        Objects.equals(this.update, commandWrapper.update) &&
        Objects.equals(this.create, commandWrapper.create) &&
        Objects.equals(this.createDatatable, commandWrapper.createDatatable) &&
        Objects.equals(this.delete, commandWrapper.delete) &&
        Objects.equals(this.deleteDatatable, commandWrapper.deleteDatatable) &&
        Objects.equals(this.updateDatatable, commandWrapper.updateDatatable) &&
        Objects.equals(this.datatableResource, commandWrapper.datatableResource) &&
        Objects.equals(this.deleteOneToOne, commandWrapper.deleteOneToOne) &&
        Objects.equals(this.deleteMultiple, commandWrapper.deleteMultiple) &&
        Objects.equals(this.updateOneToOne, commandWrapper.updateOneToOne) &&
        Objects.equals(this.updateMultiple, commandWrapper.updateMultiple) &&
        Objects.equals(this.registerDatatable, commandWrapper.registerDatatable) &&
        Objects.equals(this.noteResource, commandWrapper.noteResource) &&
        Objects.equals(this.cacheResource, commandWrapper.cacheResource) &&
        Objects.equals(this.updateOperation, commandWrapper.updateOperation) &&
        Objects.equals(this.deleteOperation, commandWrapper.deleteOperation) &&
        Objects.equals(this.surveyResource, commandWrapper.surveyResource) &&
        Objects.equals(this.registerSurvey, commandWrapper.registerSurvey) &&
        Objects.equals(this.fullFilSurvey, commandWrapper.fullFilSurvey) &&
        Objects.equals(this.workingDaysResource, commandWrapper.workingDaysResource) &&
        Objects.equals(this.passwordPreferencesResource, commandWrapper.passwordPreferencesResource) &&
        Objects.equals(this.permissionResource, commandWrapper.permissionResource) &&
        Objects.equals(this.userResource, commandWrapper.userResource) &&
        Objects.equals(this.currencyResource, commandWrapper.currencyResource) &&
        Objects.equals(this.loanDisburseDetailResource, commandWrapper.loanDisburseDetailResource) &&
        Objects.equals(this.updateDisbursementDate, commandWrapper.updateDisbursementDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupId, clientId, loanId, savingsId, entityName, taskPermissionName, entityId, subentityId, href, json, transactionId, productId, creditBureauId, organisationCreditBureauId, update, create, createDatatable, delete, deleteDatatable, updateDatatable, datatableResource, deleteOneToOne, deleteMultiple, updateOneToOne, updateMultiple, registerDatatable, noteResource, cacheResource, updateOperation, deleteOperation, surveyResource, registerSurvey, fullFilSurvey, workingDaysResource, passwordPreferencesResource, permissionResource, userResource, currencyResource, loanDisburseDetailResource, updateDisbursementDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommandWrapper {\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    loanId: ").append(toIndentedString(loanId)).append("\n");
    sb.append("    savingsId: ").append(toIndentedString(savingsId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    taskPermissionName: ").append(toIndentedString(taskPermissionName)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    subentityId: ").append(toIndentedString(subentityId)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    json: ").append(toIndentedString(json)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    creditBureauId: ").append(toIndentedString(creditBureauId)).append("\n");
    sb.append("    organisationCreditBureauId: ").append(toIndentedString(organisationCreditBureauId)).append("\n");
    sb.append("    update: ").append(toIndentedString(update)).append("\n");
    sb.append("    create: ").append(toIndentedString(create)).append("\n");
    sb.append("    createDatatable: ").append(toIndentedString(createDatatable)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
    sb.append("    deleteDatatable: ").append(toIndentedString(deleteDatatable)).append("\n");
    sb.append("    updateDatatable: ").append(toIndentedString(updateDatatable)).append("\n");
    sb.append("    datatableResource: ").append(toIndentedString(datatableResource)).append("\n");
    sb.append("    deleteOneToOne: ").append(toIndentedString(deleteOneToOne)).append("\n");
    sb.append("    deleteMultiple: ").append(toIndentedString(deleteMultiple)).append("\n");
    sb.append("    updateOneToOne: ").append(toIndentedString(updateOneToOne)).append("\n");
    sb.append("    updateMultiple: ").append(toIndentedString(updateMultiple)).append("\n");
    sb.append("    registerDatatable: ").append(toIndentedString(registerDatatable)).append("\n");
    sb.append("    noteResource: ").append(toIndentedString(noteResource)).append("\n");
    sb.append("    cacheResource: ").append(toIndentedString(cacheResource)).append("\n");
    sb.append("    updateOperation: ").append(toIndentedString(updateOperation)).append("\n");
    sb.append("    deleteOperation: ").append(toIndentedString(deleteOperation)).append("\n");
    sb.append("    surveyResource: ").append(toIndentedString(surveyResource)).append("\n");
    sb.append("    registerSurvey: ").append(toIndentedString(registerSurvey)).append("\n");
    sb.append("    fullFilSurvey: ").append(toIndentedString(fullFilSurvey)).append("\n");
    sb.append("    workingDaysResource: ").append(toIndentedString(workingDaysResource)).append("\n");
    sb.append("    passwordPreferencesResource: ").append(toIndentedString(passwordPreferencesResource)).append("\n");
    sb.append("    permissionResource: ").append(toIndentedString(permissionResource)).append("\n");
    sb.append("    userResource: ").append(toIndentedString(userResource)).append("\n");
    sb.append("    currencyResource: ").append(toIndentedString(currencyResource)).append("\n");
    sb.append("    loanDisburseDetailResource: ").append(toIndentedString(loanDisburseDetailResource)).append("\n");
    sb.append("    updateDisbursementDate: ").append(toIndentedString(updateDisbursementDate)).append("\n");
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

