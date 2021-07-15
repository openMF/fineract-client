# GroupsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateOrGenerateCollectionSheet**](GroupsApi.md#activateOrGenerateCollectionSheet) | **POST** groups/{groupId} | Activate a Group | Associate Clients | Disassociate Clients | Transfer Clients across groups | Generate Collection Sheet | Save Collection Sheet | Unassign a Staff | Assign a Staff | Close a Group | Unassign a Role | Update a Role
[**create8**](GroupsApi.md#create8) | **POST** groups | Create a Group
[**delete11**](GroupsApi.md#delete11) | **DELETE** groups/{groupId} | Delete a Group
[**getGroupsTemplate**](GroupsApi.md#getGroupsTemplate) | **GET** groups/downloadtemplate | 
[**postGroupTemplate**](GroupsApi.md#postGroupTemplate) | **POST** groups/uploadtemplate | 
[**retrieveAccounts**](GroupsApi.md#retrieveAccounts) | **GET** groups/{groupId}/accounts | Retrieve Group accounts overview
[**retrieveAll24**](GroupsApi.md#retrieveAll24) | **GET** groups | List Groups
[**retrieveGsimAccounts**](GroupsApi.md#retrieveGsimAccounts) | **GET** groups/{groupId}/gsimaccounts | 
[**retrieveOne14**](GroupsApi.md#retrieveOne14) | **GET** groups/{groupId} | Retrieve a Group
[**retrieveTemplate7**](GroupsApi.md#retrieveTemplate7) | **GET** groups/template | Retrieve Group Template
[**retrieveglimAccounts**](GroupsApi.md#retrieveglimAccounts) | **GET** groups/{groupId}/glimaccounts | 
[**unassignLoanOfficer**](GroupsApi.md#unassignLoanOfficer) | **POST** groups/{groupId}/command/unassign_staff | Unassign a Staff
[**update12**](GroupsApi.md#update12) | **PUT** groups/{groupId} | Update a Group



## activateOrGenerateCollectionSheet

> PostGroupsGroupIdResponse activateOrGenerateCollectionSheet(groupId, postGroupsGroupIdRequest, command, roleId)

Activate a Group | Associate Clients | Disassociate Clients | Transfer Clients across groups | Generate Collection Sheet | Save Collection Sheet | Unassign a Staff | Assign a Staff | Close a Group | Unassign a Role | Update a Role

Activate a Group:  Groups can be created in a Pending state. This API exists to enable group activation.    If the group happens to be already active this API will result in an error.  Mandatory Fields: activationDate  Associate Clients:  This API allows to associate existing clients to a group.    The clients are listed from the office to which the group is associated.    If client(s) is already associated with group then API will result in an error.  Mandatory Fields: clientMembers  Disassociate Clients:  This API allows to disassociate clients from a group.    Disassociating a client with active joint liability group loans results in an error.  Mandatory Fields: clientMembers  Transfer Clients across groups:  This API allows to transfer clients from one group to another  Mandatory Fields: destinationGroupId and clients  Optional Fields: inheritDestinationGroupLoanOfficer (defaults to true) and transferActiveLoans (defaults to true)  Generate Collection Sheet:  This API retrieves repayment details of all jlg loans of all members of a group on a specified meeting date.  Mandatory Fields: calendarId and transactionDate  Save Collection Sheet:  This api allows the loan officer to perform bulk repayments of JLG loans for a group on its meeting date.  Mandatory Fields: calendarId, transactionDate, actualDisbursementDate  Optional Fields: clientsAttendance, bulkRepaymentTransaction, bulkDisbursementTransactions  Unassign a Staff:  Allows you to unassign the Staff.  Mandatory Fields: staffId  Assign a Staff:  Allows you to assign Staff to an existing Group.    The selected Staff should be belong to the same office (or an office higher up in the hierarchy) as this groupMandatory Fields: staffId  Optional Fields: inheritStaffForClientAccounts (Optional: Boolean if true all members of the group (i.e all clients with active loans and savings ) will inherit the staffId)  Close a Group:  This API exists to close a group. Groups can be closed if they don&#39;t have any non-closed clients/loans/savingsAccounts.    If the group has any active clients/loans/savingsAccount, this API will result in an error.Assign a Role:  Allows you to assign a Role to an existing member of a group.    We can define the different roles applicable to group members by adding code values to the pre-defined system code GROUPROLE. Example:Group leader etc.  Mandatory Fields: clientId, role  Unassign a Role:  Allows you to unassign Roles associated tp Group members.  Update a Role:  Allows you to update the member Role.  Mandatory Fields: role  Showing request/response for Transfer Clients across groups

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Long groupId = 56L; // Long | groupId
        PostGroupsGroupIdRequest postGroupsGroupIdRequest = new PostGroupsGroupIdRequest(); // PostGroupsGroupIdRequest | 
        String command = "command_example"; // String | command
        Long roleId = 56L; // Long | roleId
        try {
            PostGroupsGroupIdResponse result = apiInstance.activateOrGenerateCollectionSheet(groupId, postGroupsGroupIdRequest, command, roleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#activateOrGenerateCollectionSheet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **postGroupsGroupIdRequest** | [**PostGroupsGroupIdRequest**](PostGroupsGroupIdRequest.md)|  |
 **command** | **String**| command | [optional]
 **roleId** | **Long**| roleId | [optional]

### Return type

[**PostGroupsGroupIdResponse**](PostGroupsGroupIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## create8

> PostGroupsResponse create8(postGroupsRequest)

Create a Group

Creates a Group  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, clientMembers

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        PostGroupsRequest postGroupsRequest = new PostGroupsRequest(); // PostGroupsRequest | 
        try {
            PostGroupsResponse result = apiInstance.create8(postGroupsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#create8");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postGroupsRequest** | [**PostGroupsRequest**](PostGroupsRequest.md)|  |

### Return type

[**PostGroupsResponse**](PostGroupsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete11

> DeleteGroupsGroupIdResponse delete11(groupId)

Delete a Group

A group can be deleted if it is in pending state and has no associations - clients, loans or savings

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Long groupId = 56L; // Long | groupId
        try {
            DeleteGroupsGroupIdResponse result = apiInstance.delete11(groupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#delete11");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |

### Return type

[**DeleteGroupsGroupIdResponse**](DeleteGroupsGroupIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getGroupsTemplate

> getGroupsTemplate(officeId, staffId, dateFormat)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Long officeId = 56L; // Long | 
        Long staffId = 56L; // Long | 
        String dateFormat = "dateFormat_example"; // String | 
        try {
            apiInstance.getGroupsTemplate(officeId, staffId, dateFormat);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#getGroupsTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.ms-excel

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## postGroupTemplate

> String postGroupTemplate(file, locale, dateFormat)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        FormDataContentDisposition file = new FormDataContentDisposition(); // FormDataContentDisposition | 
        String locale = "locale_example"; // String | 
        String dateFormat = "dateFormat_example"; // String | 
        try {
            String result = apiInstance.postGroupTemplate(file, locale, dateFormat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#postGroupTemplate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | [**FormDataContentDisposition**](FormDataContentDisposition.md)|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: */*

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## retrieveAccounts

> GetGroupsGroupIdAccountsResponse retrieveAccounts(groupId)

Retrieve Group accounts overview

Retrieves details of all Loan and Savings accounts associated with this group.    Example Requests:    groups/1/accounts      groups/1/accounts?fields&#x3D;loanAccounts,savingsAccounts,memberLoanAccounts,  memberSavingsAccounts

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Long groupId = 56L; // Long | groupId
        try {
            GetGroupsGroupIdAccountsResponse result = apiInstance.retrieveAccounts(groupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#retrieveAccounts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |

### Return type

[**GetGroupsGroupIdAccountsResponse**](GetGroupsGroupIdAccountsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAll24

> GetGroupsResponse retrieveAll24(officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, orphansOnly)

List Groups

The default implementation of listing Groups returns 200 entries with support for pagination and sorting. Using the parameter limit with description -1 returns all entries.  Example Requests:    groups    groups?fields&#x3D;name,officeName,joinedDate    groups?offset&#x3D;10&amp;limit&#x3D;50    groups?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Long officeId = 56L; // Long | officeId
        Long staffId = 56L; // Long | staffId
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
            GetGroupsResponse result = apiInstance.retrieveAll24(officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, orphansOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#retrieveAll24");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveGsimAccounts

> String retrieveGsimAccounts(groupId, parentGSIMAccountNo, parentGSIMId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Long groupId = 56L; // Long | 
        String parentGSIMAccountNo = "parentGSIMAccountNo_example"; // String | 
        Long parentGSIMId = 56L; // Long | 
        try {
            String result = apiInstance.retrieveGsimAccounts(groupId, parentGSIMAccountNo, parentGSIMId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#retrieveGsimAccounts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**|  |
 **parentGSIMAccountNo** | **String**|  | [optional]
 **parentGSIMId** | **Long**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## retrieveOne14

> GetGroupsGroupIdResponse retrieveOne14(groupId, staffInSelectedOfficeOnly, roleId)

Retrieve a Group

Retrieve group information.  Example Requests:    groups/1    groups/1?associations&#x3D;clientMembers

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Long groupId = 56L; // Long | groupId
        Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
        Long roleId = 56L; // Long | roleId
        try {
            GetGroupsGroupIdResponse result = apiInstance.retrieveOne14(groupId, staffInSelectedOfficeOnly, roleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#retrieveOne14");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate7

> GetGroupsTemplateResponse retrieveTemplate7(officeId, center, centerId, command, staffInSelectedOfficeOnly)

Retrieve Group Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    groups/template    groups/template?officeId&#x3D;2    groups/template?centerId&#x3D;1    groups/template?centerId&#x3D;1&amp;staffInSelectedOfficeOnly&#x3D;true

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Long officeId = 56L; // Long | officeId
        Boolean center = true; // Boolean | center
        Long centerId = 56L; // Long | centerId
        String command = "command_example"; // String | command
        Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
        try {
            GetGroupsTemplateResponse result = apiInstance.retrieveTemplate7(officeId, center, centerId, command, staffInSelectedOfficeOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#retrieveTemplate7");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
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

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveglimAccounts

> String retrieveglimAccounts(groupId, parentLoanAccountNo)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Long groupId = 56L; // Long | 
        String parentLoanAccountNo = "parentLoanAccountNo_example"; // String | 
        try {
            String result = apiInstance.retrieveglimAccounts(groupId, parentLoanAccountNo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#retrieveglimAccounts");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**|  |
 **parentLoanAccountNo** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## unassignLoanOfficer

> PostGroupsGroupIdCommandUnassignStaffResponse unassignLoanOfficer(groupId, postGroupsGroupIdCommandUnassignStaffRequest)

Unassign a Staff

Allows you to unassign the Staff.  Mandatory Fields: staffId

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Long groupId = 56L; // Long | groupId
        PostGroupsGroupIdCommandUnassignStaffRequest postGroupsGroupIdCommandUnassignStaffRequest = new PostGroupsGroupIdCommandUnassignStaffRequest(); // PostGroupsGroupIdCommandUnassignStaffRequest | 
        try {
            PostGroupsGroupIdCommandUnassignStaffResponse result = apiInstance.unassignLoanOfficer(groupId, postGroupsGroupIdCommandUnassignStaffRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#unassignLoanOfficer");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **postGroupsGroupIdCommandUnassignStaffRequest** | [**PostGroupsGroupIdCommandUnassignStaffRequest**](PostGroupsGroupIdCommandUnassignStaffRequest.md)|  |

### Return type

[**PostGroupsGroupIdCommandUnassignStaffResponse**](PostGroupsGroupIdCommandUnassignStaffResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## update12

> PutGroupsGroupIdResponse update12(groupId, putGroupsGroupIdRequest)

Update a Group

Updates a Group

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.GroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        GroupsApi apiInstance = new GroupsApi(defaultClient);
        Long groupId = 56L; // Long | groupId
        PutGroupsGroupIdRequest putGroupsGroupIdRequest = new PutGroupsGroupIdRequest(); // PutGroupsGroupIdRequest | 
        try {
            PutGroupsGroupIdResponse result = apiInstance.update12(groupId, putGroupsGroupIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GroupsApi#update12");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupId** | **Long**| groupId |
 **putGroupsGroupIdRequest** | [**PutGroupsGroupIdRequest**](PutGroupsGroupIdRequest.md)|  |

### Return type

[**PutGroupsGroupIdResponse**](PutGroupsGroupIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

