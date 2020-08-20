# GroupsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateOrGenerateCollectionSheet**](GroupsApi.md#activateOrGenerateCollectionSheet) | **POST** groups/{groupId} | Activate a Group | Associate Clients | Disassociate Clients | Transfer Clients across groups | Generate Collection Sheet | Save Collection Sheet | Unassign a Staff | Assign a Staff | Close a Group | Unassign a Role | Update a Role
[**create**](GroupsApi.md#create) | **POST** groups | Create a Group
[**delete**](GroupsApi.md#delete) | **DELETE** groups/{groupId} | Delete a Group
[**getGroupsTemplate**](GroupsApi.md#getGroupsTemplate) | **GET** groups/downloadtemplate | 
[**postGroupTemplate**](GroupsApi.md#postGroupTemplate) | **POST** groups/uploadtemplate | 
[**retrieveAccounts**](GroupsApi.md#retrieveAccounts) | **GET** groups/{groupId}/accounts | Retrieve Group accounts overview
[**retrieveAll**](GroupsApi.md#retrieveAll) | **GET** groups | List Groups
[**retrieveOne**](GroupsApi.md#retrieveOne) | **GET** groups/{groupId} | Retrieve a Group
[**retrieveTemplate**](GroupsApi.md#retrieveTemplate) | **GET** groups/template | Retrieve Group Template
[**unassignLoanOfficer**](GroupsApi.md#unassignLoanOfficer) | **POST** groups/{groupId}/command/unassign_staff | Unassign a Staff
[**update**](GroupsApi.md#update) | **PUT** groups/{groupId} | Update a Group


<a name="activateOrGenerateCollectionSheet"></a>
# **activateOrGenerateCollectionSheet**
> PostGroupsGroupIdResponse activateOrGenerateCollectionSheet(groupId, body, command, roleId)

Activate a Group | Associate Clients | Disassociate Clients | Transfer Clients across groups | Generate Collection Sheet | Save Collection Sheet | Unassign a Staff | Assign a Staff | Close a Group | Unassign a Role | Update a Role

Activate a Group:  Groups can be created in a Pending state. This API exists to enable group activation.    If the group happens to be already active this API will result in an error.  Mandatory Fields: activationDate  Associate Clients:  This API allows to associate existing clients to a group.    The clients are listed from the office to which the group is associated.    If client(s) is already associated with group then API will result in an error.  Mandatory Fields: clientMembers  Disassociate Clients:  This API allows to disassociate clients from a group.    Disassociating a client with active joint liability group loans results in an error.  Mandatory Fields: clientMembers  Transfer Clients across groups:  This API allows to transfer clients from one group to another  Mandatory Fields: destinationGroupId and clients  Optional Fields: inheritDestinationGroupLoanOfficer (defaults to true) and transferActiveLoans (defaults to true)  Generate Collection Sheet:  This API retrieves repayment details of all jlg loans of all members of a group on a specified meeting date.  Mandatory Fields: calendarId and transactionDate  Save Collection Sheet:  This api allows the loan officer to perform bulk repayments of JLG loans for a group on its meeting date.  Mandatory Fields: calendarId, transactionDate, actualDisbursementDate  Optional Fields: clientsAttendance, bulkRepaymentTransaction, bulkDisbursementTransactions  Unassign a Staff:  Allows you to unassign the Staff.  Mandatory Fields: staffId  Assign a Staff:  Allows you to assign Staff to an existing Group.    The selected Staff should be belong to the same office (or an office higher up in the hierarchy) as this groupMandatory Fields: staffId  Optional Fields: inheritStaffForClientAccounts (Optional: Boolean if true all members of the group (i.e all clients with active loans and savings ) will inherit the staffId)  Close a Group:  This API exists to close a group. Groups can be closed if they don&#39;t have any non-closed clients/loans/savingsAccounts.    If the group has any active clients/loans/savingsAccount, this API will result in an error.Assign a Role:  Allows you to assign a Role to an existing member of a group.    We can define the different roles applicable to group members by adding code values to the pre-defined system code GROUPROLE. Example:Group leader etc.  Mandatory Fields: clientId, role  Unassign a Role:  Allows you to unassign Roles associated tp Group members.  Update a Role:  Allows you to update the member Role.  Mandatory Fields: role  Showing request/response for Transfer Clients across groups

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
Long groupId = 789L; // Long | groupId
PostGroupsGroupIdRequest body = new PostGroupsGroupIdRequest(); // PostGroupsGroupIdRequest | body
String command = "command_example"; // String | command
Long roleId = 789L; // Long | roleId
try {
    PostGroupsGroupIdResponse result = apiInstance.activateOrGenerateCollectionSheet(groupId, body, command, roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#activateOrGenerateCollectionSheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **body** | [**PostGroupsGroupIdRequest**](PostGroupsGroupIdRequest.md)| body |
 **command** | **String**| command | [optional]
 **roleId** | **Long**| roleId | [optional]

### Return type

[**PostGroupsGroupIdResponse**](PostGroupsGroupIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="create"></a>
# **create**
> PostGroupsResponse create(body)

Create a Group

Creates a Group  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, clientMembers

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
PostGroupsRequest body = new PostGroupsRequest(); // PostGroupsRequest | body
try {
    PostGroupsResponse result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostGroupsRequest**](PostGroupsRequest.md)| body |

### Return type

[**PostGroupsResponse**](PostGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteGroupsGroupIdResponse delete(groupId)

Delete a Group

A group can be deleted if it is in pending state and has no associations - clients, loans or savings

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
Long groupId = 789L; // Long | groupId
try {
    DeleteGroupsGroupIdResponse result = apiInstance.delete(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |

### Return type

[**DeleteGroupsGroupIdResponse**](DeleteGroupsGroupIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupsTemplate"></a>
# **getGroupsTemplate**
> getGroupsTemplate(officeId, staffId, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
Long officeId = 789L; // Long | 
Long staffId = 789L; // Long | 
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getGroupsTemplate(officeId, staffId, dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#getGroupsTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**|  | [optional]
 **staffId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="postGroupTemplate"></a>
# **postGroupTemplate**
> String postGroupTemplate(file, locale, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postGroupTemplate(file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#postGroupTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **File**|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="retrieveAccounts"></a>
# **retrieveAccounts**
> GetGroupsGroupIdAccountsResponse retrieveAccounts(groupId)

Retrieve Group accounts overview

Retrieves details of all Loan and Savings accounts associated with this group.    Example Requests:    groups/1/accounts      groups/1/accounts?fields&#x3D;loanAccounts,savingsAccounts,memberLoanAccounts,  memberSavingsAccounts

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
Long groupId = 789L; // Long | groupId
try {
    GetGroupsGroupIdAccountsResponse result = apiInstance.retrieveAccounts(groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#retrieveAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |

### Return type

[**GetGroupsGroupIdAccountsResponse**](GetGroupsGroupIdAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> GetGroupsResponse retrieveAll(sqlSearch, officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, orphansOnly)

List Groups

The default implementation of listing Groups returns 200 entries with support for pagination and sorting. Using the parameter limit with value -1 returns all entries.  Example Requests:    groups    groups?fields&#x3D;name,officeName,joinedDate    groups?offset&#x3D;10&amp;limit&#x3D;50    groups?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
String sqlSearch = "sqlSearch_example"; // String | sqlSearch
Long officeId = 789L; // Long | officeId
Long staffId = 789L; // Long | staffId
String externalId = "externalId_example"; // String | externalId
String name = "name_example"; // String | name
String underHierarchy = "underHierarchy_example"; // String | underHierarchy
Boolean paged = true; // Boolean | paged
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
Boolean orphansOnly = true; // Boolean | orphansOnly
try {
    GetGroupsResponse result = apiInstance.retrieveAll(sqlSearch, officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, orphansOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sqlSearch** | **String**| sqlSearch | [optional]
 **officeId** | **Long**| officeId | [optional]
 **staffId** | **Long**| staffId | [optional]
 **externalId** | **String**| externalId | [optional]
 **name** | **String**| name | [optional]
 **underHierarchy** | **String**| underHierarchy | [optional]
 **paged** | **Boolean**| paged | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **orphansOnly** | **Boolean**| orphansOnly | [optional]

### Return type

[**GetGroupsResponse**](GetGroupsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetGroupsGroupIdResponse retrieveOne(groupId, staffInSelectedOfficeOnly, roleId)

Retrieve a Group

Retrieve group information.  Example Requests:    groups/1    groups/1?associations&#x3D;clientMembers

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
Long groupId = 789L; // Long | groupId
Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
Long roleId = 789L; // Long | roleId
try {
    GetGroupsGroupIdResponse result = apiInstance.retrieveOne(groupId, staffInSelectedOfficeOnly, roleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]
 **roleId** | **Long**| roleId | [optional]

### Return type

[**GetGroupsGroupIdResponse**](GetGroupsGroupIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> GetGroupsTemplateResponse retrieveTemplate(officeId, center, centerId, command, staffInSelectedOfficeOnly)

Retrieve Group Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    groups/template    groups/template?officeId&#x3D;2    groups/template?centerId&#x3D;1    groups/template?centerId&#x3D;1&amp;staffInSelectedOfficeOnly&#x3D;true

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
Long officeId = 789L; // Long | officeId
Boolean center = true; // Boolean | center
Long centerId = 789L; // Long | centerId
String command = "command_example"; // String | command
Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
try {
    GetGroupsTemplateResponse result = apiInstance.retrieveTemplate(officeId, center, centerId, command, staffInSelectedOfficeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId | [optional]
 **center** | **Boolean**| center | [optional]
 **centerId** | **Long**| centerId | [optional]
 **command** | **String**| command | [optional]
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetGroupsTemplateResponse**](GetGroupsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="unassignLoanOfficer"></a>
# **unassignLoanOfficer**
> PostGroupsGroupIdCommandUnassignStaffResponse unassignLoanOfficer(groupId, body)

Unassign a Staff

Allows you to unassign the Staff.  Mandatory Fields: staffId

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
Long groupId = 789L; // Long | groupId
PostGroupsGroupIdCommandUnassignStaffRequest body = new PostGroupsGroupIdCommandUnassignStaffRequest(); // PostGroupsGroupIdCommandUnassignStaffRequest | body
try {
    PostGroupsGroupIdCommandUnassignStaffResponse result = apiInstance.unassignLoanOfficer(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#unassignLoanOfficer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **body** | [**PostGroupsGroupIdCommandUnassignStaffRequest**](PostGroupsGroupIdCommandUnassignStaffRequest.md)| body |

### Return type

[**PostGroupsGroupIdCommandUnassignStaffResponse**](PostGroupsGroupIdCommandUnassignStaffResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutGroupsGroupIdResponse update(groupId, body)

Update a Group

Updates a Group

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.GroupsApi;


GroupsApi apiInstance = new GroupsApi();
Long groupId = 789L; // Long | groupId
PutGroupsGroupIdRequest body = new PutGroupsGroupIdRequest(); // PutGroupsGroupIdRequest | body
try {
    PutGroupsGroupIdResponse result = apiInstance.update(groupId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GroupsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **body** | [**PutGroupsGroupIdRequest**](PutGroupsGroupIdRequest.md)| body |

### Return type

[**PutGroupsGroupIdResponse**](PutGroupsGroupIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

