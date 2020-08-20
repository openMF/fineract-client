# ClientApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activate**](ClientApi.md#activate) | **POST** clients/{clientId} | Activate a Client | Close a Client | Reject a Client | Withdraw a Client | Reactivate a Client | UndoReject a Client | UndoWithdraw a Client | Assign a Staff | Unassign a Staff | Update Default Savings Account | Propose a Client Transfer | Withdraw a Client Transfer | Reject a Client Transfer | Accept a Client Transfer | Propose and Accept a Client Transfer
[**create**](ClientApi.md#create) | **POST** clients | Create a Client
[**delete**](ClientApi.md#delete) | **DELETE** clients/{clientId} | Delete a Client
[**getClientTemplate**](ClientApi.md#getClientTemplate) | **GET** clients/downloadtemplate | 
[**postClientTemplate**](ClientApi.md#postClientTemplate) | **POST** clients/uploadtemplate | 
[**retrieveAll**](ClientApi.md#retrieveAll) | **GET** clients | List Clients
[**retrieveAssociatedAccounts**](ClientApi.md#retrieveAssociatedAccounts) | **GET** clients/{clientId}/accounts | Retrieve client accounts overview
[**retrieveObligeeDetails**](ClientApi.md#retrieveObligeeDetails) | **GET** clients/{clientId}/obligeedetails | 
[**retrieveOne**](ClientApi.md#retrieveOne) | **GET** clients/{clientId} | Retrieve a Client
[**retrieveTemplate**](ClientApi.md#retrieveTemplate) | **GET** clients/template | Retrieve Client Details Template
[**retrieveTransferTemplate**](ClientApi.md#retrieveTransferTemplate) | **GET** clients/{clientId}/transferproposaldate | 
[**update**](ClientApi.md#update) | **PUT** clients/{clientId} | Update a Client


<a name="activate"></a>
# **activate**
> PostClientsClientIdResponse activate(clientId, body, command)

Activate a Client | Close a Client | Reject a Client | Withdraw a Client | Reactivate a Client | UndoReject a Client | UndoWithdraw a Client | Assign a Staff | Unassign a Staff | Update Default Savings Account | Propose a Client Transfer | Withdraw a Client Transfer | Reject a Client Transfer | Accept a Client Transfer | Propose and Accept a Client Transfer

Activate a Client:  Clients can be created in a Pending state. This API exists to enable client activation (for when a client becomes an approved member of the financial Institution).  If the client happens to be already active this API will result in an error.  Close a Client:  Clients can be closed if they do not have any non-closed loans/savingsAccount. This API exists to close a client .  If the client have any active loans/savingsAccount this API will result in an error.  Reject a Client:  Clients can be rejected when client is in pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: rejectionDate, rejectionReasonId  Withdraw a Client:  Client applications can be withdrawn when client is in a pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: withdrawalDate, withdrawalReasonId  Reactivate a Client: Clients can be reactivated after they have been closed.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reactivationDate  UndoReject a Client:  Clients can be reactivated after they have been rejected.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDateUndoWithdraw a Client:  Clients can be reactivated after they have been withdrawn.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDate  Assign a Staff:  Allows you to assign a Staff for existed Client.  The selected Staff should belong to the same office (or an officer higher up in the hierarchy) as the Client he manages.  Unassign a Staff:  Allows you to unassign the Staff assigned to a Client.  Update Default Savings Account:  Allows you to modify or assign a default savings account for an existing Client.  The selected savings account should be one among the existing savings account for a particular customer.  Propose a Client Transfer:  Allows you to propose the transfer of a Client to a different Office.  Withdraw a Client Transfer:  Allows you to withdraw the proposed transfer of a Client to a different Office.  Withdrawal can happen only if the destination Branch (to which the transfer was proposed) has not already accepted the transfer proposal  Reject a Client Transfer:  Allows the Destination Branch to reject the proposed Client Transfer.  Accept a Client Transfer:  Allows the Destination Branch to accept the proposed Client Transfer.  The destination branch may also choose to link this client to a group (in which case, any existing active JLG loan of the client is rescheduled to match the meeting frequency of the group) and loan Officer at the time of accepting the transfer  Propose and Accept a Client Transfer:  Abstraction over the Propose and Accept Client Transfer API&#39;s which enable a user with Data Scope over both the Target and Destination Branches to directly transfer a Client to the destination Office.  Showing request/response for &#39;Reject a Client Transfer&#39;

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientApi;


ClientApi apiInstance = new ClientApi();
Long clientId = 789L; // Long | clientId
PostClientsClientIdRequest body = new PostClientsClientIdRequest(); // PostClientsClientIdRequest | body
String command = "command_example"; // String | command
try {
    PostClientsClientIdResponse result = apiInstance.activate(clientId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#activate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **body** | [**PostClientsClientIdRequest**](PostClientsClientIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostClientsClientIdResponse**](PostClientsClientIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="create"></a>
# **create**
> PostClientsResponse create(body)

Create a Client

Note:  1. You can enter either:firstname/middlename/lastname - for a person (middlename is optional) OR fullname - for a business or organisation (or person known by one name).  2.If address is enable(enable-address&#x3D;true), then additional field called address has to be passed.  Mandatory Fields: firstname and lastname OR fullname, officeId, active&#x3D;true and activationDate OR active&#x3D;false, if(address enabled) address  Optional Fields: groupId, externalId, accountNo, staffId, mobileNo, savingsProductId, genderId, clientTypeId, clientClassificationId

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientApi;


ClientApi apiInstance = new ClientApi();
PostClientsRequest body = new PostClientsRequest(); // PostClientsRequest | 
try {
    PostClientsResponse result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostClientsRequest**](PostClientsRequest.md)|  |

### Return type

[**PostClientsResponse**](PostClientsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteClientsClientIdResponse delete(clientId, body)

Delete a Client

If a client is in Pending state, you are allowed to Delete it. The delete is a &#39;hard delete&#39; and cannot be recovered from. Once clients become active or have loans or savings associated with them, you cannot delete the client but you may Close the client if they have left the program.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientApi;


ClientApi apiInstance = new ClientApi();
Long clientId = 789L; // Long | clientId
DeleteClientsClientIdRequest body = new DeleteClientsClientIdRequest(); // DeleteClientsClientIdRequest | body
try {
    DeleteClientsClientIdResponse result = apiInstance.delete(clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **body** | [**DeleteClientsClientIdRequest**](DeleteClientsClientIdRequest.md)| body |

### Return type

[**DeleteClientsClientIdResponse**](DeleteClientsClientIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientTemplate"></a>
# **getClientTemplate**
> getClientTemplate(legalFormType, officeId, staffId, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientApi;


ClientApi apiInstance = new ClientApi();
String legalFormType = "legalFormType_example"; // String | 
Long officeId = 789L; // Long | 
Long staffId = 789L; // Long | 
String dateFormat = "dateFormat_example"; // String | 
try {
    apiInstance.getClientTemplate(legalFormType, officeId, staffId, dateFormat);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#getClientTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legalFormType** | **String**|  | [optional]
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

<a name="postClientTemplate"></a>
# **postClientTemplate**
> String postClientTemplate(legalFormType, file, locale, dateFormat)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientApi;


ClientApi apiInstance = new ClientApi();
String legalFormType = "legalFormType_example"; // String | 
File file = new File("/path/to/file.txt"); // File | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
try {
    String result = apiInstance.postClientTemplate(legalFormType, file, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#postClientTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **legalFormType** | **String**|  | [optional]
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

<a name="retrieveAll"></a>
# **retrieveAll**
> GetClientsResponse retrieveAll(sqlSearch, officeId, externalId, displayName, firstName, lastName, underHierarchy, offset, limit, orderBy, sortOrder, orphansOnly)

List Clients

The list capability of clients can support pagination and sorting.  Example Requests:  clients  clients?fields&#x3D;displayName,officeName,timeline  clients?offset&#x3D;10&amp;limit&#x3D;50  clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientApi;


ClientApi apiInstance = new ClientApi();
String sqlSearch = "sqlSearch_example"; // String | sqlSearch
Long officeId = 789L; // Long | officeId
String externalId = "externalId_example"; // String | externalId
String displayName = "displayName_example"; // String | displayName
String firstName = "firstName_example"; // String | firstName
String lastName = "lastName_example"; // String | lastName
String underHierarchy = "underHierarchy_example"; // String | underHierarchy
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
Boolean orphansOnly = true; // Boolean | orphansOnly
try {
    GetClientsResponse result = apiInstance.retrieveAll(sqlSearch, officeId, externalId, displayName, firstName, lastName, underHierarchy, offset, limit, orderBy, sortOrder, orphansOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sqlSearch** | **String**| sqlSearch | [optional]
 **officeId** | **Long**| officeId | [optional]
 **externalId** | **String**| externalId | [optional]
 **displayName** | **String**| displayName | [optional]
 **firstName** | **String**| firstName | [optional]
 **lastName** | **String**| lastName | [optional]
 **underHierarchy** | **String**| underHierarchy | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **orphansOnly** | **Boolean**| orphansOnly | [optional]

### Return type

[**GetClientsResponse**](GetClientsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAssociatedAccounts"></a>
# **retrieveAssociatedAccounts**
> GetClientsClientIdAccountsResponse retrieveAssociatedAccounts(clientId)

Retrieve client accounts overview

An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:   clients/1/accounts  clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientApi;


ClientApi apiInstance = new ClientApi();
Long clientId = 789L; // Long | clientId
try {
    GetClientsClientIdAccountsResponse result = apiInstance.retrieveAssociatedAccounts(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#retrieveAssociatedAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |

### Return type

[**GetClientsClientIdAccountsResponse**](GetClientsClientIdAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveObligeeDetails"></a>
# **retrieveObligeeDetails**
> String retrieveObligeeDetails(clientId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientApi;


ClientApi apiInstance = new ClientApi();
Long clientId = 789L; // Long | 
try {
    String result = apiInstance.retrieveObligeeDetails(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#retrieveObligeeDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetClientsClientIdResponse retrieveOne(clientId, staffInSelectedOfficeOnly)

Retrieve a Client

Example Requests:  clients/1   clients/1?template&#x3D;true   clients/1?fields&#x3D;id,displayName,officeName

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientApi;


ClientApi apiInstance = new ClientApi();
Long clientId = 789L; // Long | clientId
Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
try {
    GetClientsClientIdResponse result = apiInstance.retrieveOne(clientId, staffInSelectedOfficeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetClientsClientIdResponse**](GetClientsClientIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> GetClientsTemplateResponse retrieveTemplate(officeId, commandParam, staffInSelectedOfficeOnly)

Retrieve Client Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  clients/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientApi;


ClientApi apiInstance = new ClientApi();
Long officeId = 789L; // Long | officeId
String commandParam = "commandParam_example"; // String | commandParam
Boolean staffInSelectedOfficeOnly = false; // Boolean | staffInSelectedOfficeOnly
try {
    GetClientsTemplateResponse result = apiInstance.retrieveTemplate(officeId, commandParam, staffInSelectedOfficeOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId | [optional]
 **commandParam** | **String**| commandParam | [optional]
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetClientsTemplateResponse**](GetClientsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTransferTemplate"></a>
# **retrieveTransferTemplate**
> String retrieveTransferTemplate(clientId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientApi;


ClientApi apiInstance = new ClientApi();
Long clientId = 789L; // Long | 
try {
    String result = apiInstance.retrieveTransferTemplate(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#retrieveTransferTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutClientsClientIdResponse update(clientId, body)

Update a Client

Note: You can update any of the basic attributes of a client (but not its associations) using this API.  Changing the relationship between a client and its office is not supported through this API. An API specific to handling transfers of clients between offices is available for the same.  The relationship between a client and a group must be removed through the Groups API.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ClientApi;


ClientApi apiInstance = new ClientApi();
Long clientId = 789L; // Long | clientId
PutClientsClientIdRequest body = new PutClientsClientIdRequest(); // PutClientsClientIdRequest | 
try {
    PutClientsClientIdResponse result = apiInstance.update(clientId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId |
 **body** | [**PutClientsClientIdRequest**](PutClientsClientIdRequest.md)|  |

### Return type

[**PutClientsClientIdResponse**](PutClientsClientIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

