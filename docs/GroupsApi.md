# GroupsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**activateOrGenerateCollectionSheet**](GroupsApi.md#activateOrGenerateCollectionSheet) | **POST** v1/groups/{groupId} | Activate a Group | Associate Clients | Disassociate Clients | Transfer Clients across groups | Generate Collection Sheet | Save Collection Sheet | Unassign a Staff | Assign a Staff | Close a Group | Unassign a Role | Update a Role |
| [**create8**](GroupsApi.md#create8) | **POST** v1/groups | Create a Group |
| [**delete12**](GroupsApi.md#delete12) | **DELETE** v1/groups/{groupId} | Delete a Group |
| [**getGroupsTemplate**](GroupsApi.md#getGroupsTemplate) | **GET** v1/groups/downloadtemplate |  |
| [**postGroupTemplate**](GroupsApi.md#postGroupTemplate) | **POST** v1/groups/uploadtemplate |  |
| [**retrieveAccounts**](GroupsApi.md#retrieveAccounts) | **GET** v1/groups/{groupId}/accounts | Retrieve Group accounts overview |
| [**retrieveAll24**](GroupsApi.md#retrieveAll24) | **GET** v1/groups | List Groups |
| [**retrieveGsimAccounts**](GroupsApi.md#retrieveGsimAccounts) | **GET** v1/groups/{groupId}/gsimaccounts |  |
| [**retrieveOne15**](GroupsApi.md#retrieveOne15) | **GET** v1/groups/{groupId} | Retrieve a Group |
| [**retrieveTemplate7**](GroupsApi.md#retrieveTemplate7) | **GET** v1/groups/template | Retrieve Group Template |
| [**retrieveglimAccounts**](GroupsApi.md#retrieveglimAccounts) | **GET** v1/groups/{groupId}/glimaccounts |  |
| [**unassignLoanOfficer**](GroupsApi.md#unassignLoanOfficer) | **POST** v1/groups/{groupId}/command/unassign_staff | Unassign a Staff |
| [**update13**](GroupsApi.md#update13) | **PUT** v1/groups/{groupId} | Update a Group |



Activate a Group | Associate Clients | Disassociate Clients | Transfer Clients across groups | Generate Collection Sheet | Save Collection Sheet | Unassign a Staff | Assign a Staff | Close a Group | Unassign a Role | Update a Role

Activate a Group:  Groups can be created in a Pending state. This API exists to enable group activation.    If the group happens to be already active this API will result in an error.  Mandatory Fields: activationDate  Associate Clients:  This API allows to associate existing clients to a group.    The clients are listed from the office to which the group is associated.    If client(s) is already associated with group then API will result in an error.  Mandatory Fields: clientMembers  Disassociate Clients:  This API allows to disassociate clients from a group.    Disassociating a client with active joint liability group loans results in an error.  Mandatory Fields: clientMembers  Transfer Clients across groups:  This API allows to transfer clients from one group to another  Mandatory Fields: destinationGroupId and clients  Optional Fields: inheritDestinationGroupLoanOfficer (defaults to true) and transferActiveLoans (defaults to true)  Generate Collection Sheet:  This API retrieves repayment details of all jlg loans of all members of a group on a specified meeting date.  Mandatory Fields: calendarId and transactionDate  Save Collection Sheet:  This api allows the loan officer to perform bulk repayments of JLG loans for a group on its meeting date.  Mandatory Fields: calendarId, transactionDate, actualDisbursementDate  Optional Fields: clientsAttendance, bulkRepaymentTransaction, bulkDisbursementTransactions  Unassign a Staff:  Allows you to unassign the Staff.  Mandatory Fields: staffId  Assign a Staff:  Allows you to assign Staff to an existing Group.    The selected Staff should be belong to the same office (or an office higher up in the hierarchy) as this groupMandatory Fields: staffId  Optional Fields: inheritStaffForClientAccounts (Optional: Boolean if true all members of the group (i.e all clients with active loans and savings ) will inherit the staffId)  Close a Group:  This API exists to close a group. Groups can be closed if they don&#39;t have any non-closed clients/loans/savingsAccounts.    If the group has any active clients/loans/savingsAccount, this API will result in an error.Assign a Role:  Allows you to assign a Role to an existing member of a group.    We can define the different roles applicable to group members by adding code values to the pre-defined system code GROUPROLE. Example:Group leader etc.  Mandatory Fields: clientId, role  Unassign a Role:  Allows you to unassign Roles associated tp Group members.  Update a Role:  Allows you to update the member Role.  Mandatory Fields: role  Showing request/response for Transfer Clients across groups

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val groupId : kotlin.Long = 789 // kotlin.Long | groupId
val postGroupsGroupIdRequest : PostGroupsGroupIdRequest =  // PostGroupsGroupIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command
val roleId : kotlin.Long = 789 // kotlin.Long | roleId

launch(Dispatchers.IO) {
    val result : PostGroupsGroupIdResponse = webService.activateOrGenerateCollectionSheet(groupId, postGroupsGroupIdRequest, command, roleId)
}
```

### Parameters
| **groupId** | **kotlin.Long**| groupId | |
| **postGroupsGroupIdRequest** | [**PostGroupsGroupIdRequest**](PostGroupsGroupIdRequest.md)|  | |
| **command** | **kotlin.String**| command | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **kotlin.Long**| roleId | [optional] |

### Return type

[**PostGroupsGroupIdResponse**](PostGroupsGroupIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Create a Group

Creates a Group  Mandatory Fields: name, officeId, active, activationDate (if active&#x3D;true)  Optional Fields: externalId, staffId, clientMembers

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val postGroupsRequest : PostGroupsRequest =  // PostGroupsRequest | 

launch(Dispatchers.IO) {
    val result : PostGroupsResponse = webService.create8(postGroupsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postGroupsRequest** | [**PostGroupsRequest**](PostGroupsRequest.md)|  | |

### Return type

[**PostGroupsResponse**](PostGroupsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Group

A group can be deleted if it is in pending state and has no associations - clients, loans or savings

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val groupId : kotlin.Long = 789 // kotlin.Long | groupId

launch(Dispatchers.IO) {
    val result : DeleteGroupsGroupIdResponse = webService.delete12(groupId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **kotlin.Long**| groupId | |

### Return type

[**DeleteGroupsGroupIdResponse**](DeleteGroupsGroupIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val staffId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getGroupsTemplate(officeId, staffId, dateFormat)
}
```

### Parameters
| **officeId** | **kotlin.Long**|  | [optional] |
| **staffId** | **kotlin.Long**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateFormat** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postGroupTemplate(dateFormat, locale, uploadedInputStream)
}
```

### Parameters
| **dateFormat** | **kotlin.String**|  | [optional] |
| **locale** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadedInputStream** | **java.io.File**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*


Retrieve Group accounts overview

Retrieves details of all Loan and Savings accounts associated with this group.    Example Requests:    groups/1/accounts      groups/1/accounts?fields&#x3D;loanAccounts,savingsAccounts,memberLoanAccounts,  memberSavingsAccounts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val groupId : kotlin.Long = 789 // kotlin.Long | groupId

launch(Dispatchers.IO) {
    val result : GetGroupsGroupIdAccountsResponse = webService.retrieveAccounts(groupId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **groupId** | **kotlin.Long**| groupId | |

### Return type

[**GetGroupsGroupIdAccountsResponse**](GetGroupsGroupIdAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Groups

The default implementation of listing Groups returns 200 entries with support for pagination and sorting. Using the parameter limit with description -1 returns all entries.  Example Requests:    groups    groups?fields&#x3D;name,officeName,joinedDate    groups?offset&#x3D;10&amp;limit&#x3D;50    groups?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | officeId
val staffId : kotlin.Long = 789 // kotlin.Long | staffId
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val name : kotlin.String = name_example // kotlin.String | name
val underHierarchy : kotlin.String = underHierarchy_example // kotlin.String | underHierarchy
val paged : kotlin.Boolean = true // kotlin.Boolean | paged
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
val orphansOnly : kotlin.Boolean = true // kotlin.Boolean | orphansOnly

launch(Dispatchers.IO) {
    val result : GetGroupsResponse = webService.retrieveAll24(officeId, staffId, externalId, name, underHierarchy, paged, offset, limit, orderBy, sortOrder, orphansOnly)
}
```

### Parameters
| **officeId** | **kotlin.Long**| officeId | [optional] |
| **staffId** | **kotlin.Long**| staffId | [optional] |
| **externalId** | **kotlin.String**| externalId | [optional] |
| **name** | **kotlin.String**| name | [optional] |
| **underHierarchy** | **kotlin.String**| underHierarchy | [optional] |
| **paged** | **kotlin.Boolean**| paged | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orphansOnly** | **kotlin.Boolean**| orphansOnly | [optional] |

### Return type

[**GetGroupsResponse**](GetGroupsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val groupId : kotlin.Long = 789 // kotlin.Long | 
val parentGSIMAccountNo : kotlin.String = parentGSIMAccountNo_example // kotlin.String | 
val parentGSIMId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveGsimAccounts(groupId, parentGSIMAccountNo, parentGSIMId)
}
```

### Parameters
| **groupId** | **kotlin.Long**|  | |
| **parentGSIMAccountNo** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **parentGSIMId** | **kotlin.Long**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Group

Retrieve group information.  Example Requests:    groups/1    groups/1?associations&#x3D;clientMembers

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val groupId : kotlin.Long = 789 // kotlin.Long | groupId
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly
val roleId : kotlin.Long = 789 // kotlin.Long | roleId

launch(Dispatchers.IO) {
    val result : GetGroupsGroupIdResponse = webService.retrieveOne15(groupId, staffInSelectedOfficeOnly, roleId)
}
```

### Parameters
| **groupId** | **kotlin.Long**| groupId | |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **roleId** | **kotlin.Long**| roleId | [optional] |

### Return type

[**GetGroupsGroupIdResponse**](GetGroupsGroupIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Group Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    groups/template    groups/template?officeId&#x3D;2    groups/template?centerId&#x3D;1    groups/template?centerId&#x3D;1&amp;staffInSelectedOfficeOnly&#x3D;true

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | officeId
val center : kotlin.Boolean = true // kotlin.Boolean | center
val centerId : kotlin.Long = 789 // kotlin.Long | centerId
val command : kotlin.String = command_example // kotlin.String | command
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly

launch(Dispatchers.IO) {
    val result : GetGroupsTemplateResponse = webService.retrieveTemplate7(officeId, center, centerId, command, staffInSelectedOfficeOnly)
}
```

### Parameters
| **officeId** | **kotlin.Long**| officeId | [optional] |
| **center** | **kotlin.Boolean**| center | [optional] |
| **centerId** | **kotlin.Long**| centerId | [optional] |
| **command** | **kotlin.String**| command | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |

### Return type

[**GetGroupsTemplateResponse**](GetGroupsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val groupId : kotlin.Long = 789 // kotlin.Long | 
val parentLoanAccountNo : kotlin.String = parentLoanAccountNo_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveglimAccounts(groupId, parentLoanAccountNo)
}
```

### Parameters
| **groupId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **parentLoanAccountNo** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Unassign a Staff

Allows you to unassign the Staff.  Mandatory Fields: staffId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val groupId : kotlin.Long = 789 // kotlin.Long | groupId
val postGroupsGroupIdCommandUnassignStaffRequest : PostGroupsGroupIdCommandUnassignStaffRequest =  // PostGroupsGroupIdCommandUnassignStaffRequest | 

launch(Dispatchers.IO) {
    val result : PostGroupsGroupIdCommandUnassignStaffResponse = webService.unassignLoanOfficer(groupId, postGroupsGroupIdCommandUnassignStaffRequest)
}
```

### Parameters
| **groupId** | **kotlin.Long**| groupId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postGroupsGroupIdCommandUnassignStaffRequest** | [**PostGroupsGroupIdCommandUnassignStaffRequest**](PostGroupsGroupIdCommandUnassignStaffRequest.md)|  | |

### Return type

[**PostGroupsGroupIdCommandUnassignStaffResponse**](PostGroupsGroupIdCommandUnassignStaffResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update a Group

Updates a Group

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GroupsApi::class.java)
val groupId : kotlin.Long = 789 // kotlin.Long | groupId
val putGroupsGroupIdRequest : PutGroupsGroupIdRequest =  // PutGroupsGroupIdRequest | 

launch(Dispatchers.IO) {
    val result : PutGroupsGroupIdResponse = webService.update13(groupId, putGroupsGroupIdRequest)
}
```

### Parameters
| **groupId** | **kotlin.Long**| groupId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putGroupsGroupIdRequest** | [**PutGroupsGroupIdRequest**](PutGroupsGroupIdRequest.md)|  | |

### Return type

[**PutGroupsGroupIdResponse**](PutGroupsGroupIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

