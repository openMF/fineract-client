# ClientApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**activate1**](ClientApi.md#activate1) | **POST** v1/clients/{clientId} | Activate a Client | Close a Client | Reject a Client | Withdraw a Client | Reactivate a Client | UndoReject a Client | UndoWithdraw a Client | Assign a Staff | Unassign a Staff | Update Default Savings Account | Propose a Client Transfer | Withdraw a Client Transfer | Reject a Client Transfer | Accept a Client Transfer | Propose and Accept a Client Transfer |
| [**applyCommand**](ClientApi.md#applyCommand) | **POST** v1/clients/external-id/{externalId} | Activate a Client | Close a Client | Reject a Client | Withdraw a Client | Reactivate a Client | UndoReject a Client | UndoWithdraw a Client | Assign a Staff | Unassign a Staff | Update Default Savings Account | Propose a Client Transfer | Withdraw a Client Transfer | Reject a Client Transfer | Accept a Client Transfer | Propose and Accept a Client Transfer |
| [**create6**](ClientApi.md#create6) | **POST** v1/clients | Create a Client |
| [**delete10**](ClientApi.md#delete10) | **DELETE** v1/clients/external-id/{externalId} | Delete a Client |
| [**delete9**](ClientApi.md#delete9) | **DELETE** v1/clients/{clientId} | Delete a Client |
| [**getClientTemplate**](ClientApi.md#getClientTemplate) | **GET** v1/clients/downloadtemplate |  |
| [**postClientTemplate**](ClientApi.md#postClientTemplate) | **POST** v1/clients/uploadtemplate |  |
| [**retrieveAll21**](ClientApi.md#retrieveAll21) | **GET** v1/clients | List Clients |
| [**retrieveAssociatedAccounts**](ClientApi.md#retrieveAssociatedAccounts) | **GET** v1/clients/{clientId}/accounts | Retrieve client accounts overview |
| [**retrieveAssociatedAccounts1**](ClientApi.md#retrieveAssociatedAccounts1) | **GET** v1/clients/external-id/{externalId}/accounts | Retrieve client accounts overview |
| [**retrieveObligeeDetails**](ClientApi.md#retrieveObligeeDetails) | **GET** v1/clients/{clientId}/obligeedetails | Retrieve client obligee details |
| [**retrieveObligeeDetails1**](ClientApi.md#retrieveObligeeDetails1) | **GET** v1/clients/external-id/{externalId}/obligeedetails | Retrieve client obligee details |
| [**retrieveOne11**](ClientApi.md#retrieveOne11) | **GET** v1/clients/{clientId} | Retrieve a Client |
| [**retrieveOne12**](ClientApi.md#retrieveOne12) | **GET** v1/clients/external-id/{externalId} | Retrieve a Client by External Id |
| [**retrieveTemplate5**](ClientApi.md#retrieveTemplate5) | **GET** v1/clients/template | Retrieve Client Details Template |
| [**retrieveTransferTemplate**](ClientApi.md#retrieveTransferTemplate) | **GET** v1/clients/{clientId}/transferproposaldate | Retrieve client transfer template |
| [**retrieveTransferTemplate1**](ClientApi.md#retrieveTransferTemplate1) | **GET** v1/clients/external-id/{externalId}/transferproposaldate | Retrieve client transfer template |
| [**update10**](ClientApi.md#update10) | **PUT** v1/clients/{clientId} | Update a Client |
| [**update11**](ClientApi.md#update11) | **PUT** v1/clients/external-id/{externalId} | Update a Client using the External Id |



Activate a Client | Close a Client | Reject a Client | Withdraw a Client | Reactivate a Client | UndoReject a Client | UndoWithdraw a Client | Assign a Staff | Unassign a Staff | Update Default Savings Account | Propose a Client Transfer | Withdraw a Client Transfer | Reject a Client Transfer | Accept a Client Transfer | Propose and Accept a Client Transfer

Activate a Client:  Clients can be created in a Pending state. This API exists to enable client activation (for when a client becomes an approved member of the financial Institution).  If the client happens to be already active this API will result in an error.  Close a Client:  Clients can be closed if they do not have any non-closed loans/savingsAccount. This API exists to close a client .  If the client have any active loans/savingsAccount this API will result in an error.  Reject a Client:  Clients can be rejected when client is in pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: rejectionDate, rejectionReasonId  Withdraw a Client:  Client applications can be withdrawn when client is in a pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: withdrawalDate, withdrawalReasonId  Reactivate a Client: Clients can be reactivated after they have been closed.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reactivationDate  UndoReject a Client:  Clients can be reactivated after they have been rejected.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDateUndoWithdraw a Client:  Clients can be reactivated after they have been withdrawn.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDate  Assign a Staff:  Allows you to assign a Staff for existed Client.  The selected Staff should belong to the same office (or an officer higher up in the hierarchy) as the Client he manages.  Unassign a Staff:  Allows you to unassign the Staff assigned to a Client.  Update Default Savings Account:  Allows you to modify or assign a default savings account for an existing Client.  The selected savings account should be one among the existing savings account for a particular customer.  Propose a Client Transfer:  Allows you to propose the transfer of a Client to a different Office.  Withdraw a Client Transfer:  Allows you to withdraw the proposed transfer of a Client to a different Office.  Withdrawal can happen only if the destination Branch (to which the transfer was proposed) has not already accepted the transfer proposal  Reject a Client Transfer:  Allows the Destination Branch to reject the proposed Client Transfer.  Accept a Client Transfer:  Allows the Destination Branch to accept the proposed Client Transfer.  The destination branch may also choose to link this client to a group (in which case, any existing active JLG loan of the client is rescheduled to match the meeting frequency of the group) and loan Officer at the time of accepting the transfer  Propose and Accept a Client Transfer:  Abstraction over the Propose and Accept Client Transfer API&#39;s which enable a user with Data Scope over both the Target and Destination Branches to directly transfer a Client to the destination Office.  Showing request/response for &#39;Reject a Client Transfer&#39;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val postClientsClientIdRequest : PostClientsClientIdRequest =  // PostClientsClientIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostClientsClientIdResponse = webService.activate1(clientId, postClientsClientIdRequest, command)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| **postClientsClientIdRequest** | [**PostClientsClientIdRequest**](PostClientsClientIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostClientsClientIdResponse**](PostClientsClientIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Activate a Client | Close a Client | Reject a Client | Withdraw a Client | Reactivate a Client | UndoReject a Client | UndoWithdraw a Client | Assign a Staff | Unassign a Staff | Update Default Savings Account | Propose a Client Transfer | Withdraw a Client Transfer | Reject a Client Transfer | Accept a Client Transfer | Propose and Accept a Client Transfer

Activate a Client:  Clients can be created in a Pending state. This API exists to enable client activation (for when a client becomes an approved member of the financial Institution).  If the client happens to be already active this API will result in an error.  Close a Client:  Clients can be closed if they do not have any non-closed loans/savingsAccount. This API exists to close a client .  If the client have any active loans/savingsAccount this API will result in an error.  Reject a Client:  Clients can be rejected when client is in pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: rejectionDate, rejectionReasonId  Withdraw a Client:  Client applications can be withdrawn when client is in a pending for activation status.  If the client is any other status, this API throws an error.  Mandatory Fields: withdrawalDate, withdrawalReasonId  Reactivate a Client: Clients can be reactivated after they have been closed.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reactivationDate  UndoReject a Client:  Clients can be reactivated after they have been rejected.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDateUndoWithdraw a Client:  Clients can be reactivated after they have been withdrawn.  Trying to reactivate a client in any other state throws an error.  Mandatory Fields: reopenedDate  Assign a Staff:  Allows you to assign a Staff for existed Client.  The selected Staff should belong to the same office (or an officer higher up in the hierarchy) as the Client he manages.  Unassign a Staff:  Allows you to unassign the Staff assigned to a Client.  Update Default Savings Account:  Allows you to modify or assign a default savings account for an existing Client.  The selected savings account should be one among the existing savings account for a particular customer.  Propose a Client Transfer:  Allows you to propose the transfer of a Client to a different Office.  Withdraw a Client Transfer:  Allows you to withdraw the proposed transfer of a Client to a different Office.  Withdrawal can happen only if the destination Branch (to which the transfer was proposed) has not already accepted the transfer proposal  Reject a Client Transfer:  Allows the Destination Branch to reject the proposed Client Transfer.  Accept a Client Transfer:  Allows the Destination Branch to accept the proposed Client Transfer.  The destination branch may also choose to link this client to a group (in which case, any existing active JLG loan of the client is rescheduled to match the meeting frequency of the group) and loan Officer at the time of accepting the transfer  Propose and Accept a Client Transfer:  Abstraction over the Propose and Accept Client Transfer API&#39;s which enable a user with Data Scope over both the Target and Destination Branches to directly transfer a Client to the destination Office.  Showing request/response for &#39;Reject a Client Transfer&#39;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val postClientsClientIdRequest : PostClientsClientIdRequest =  // PostClientsClientIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostClientsClientIdResponse = webService.applyCommand(externalId, postClientsClientIdRequest, command)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | |
| **postClientsClientIdRequest** | [**PostClientsClientIdRequest**](PostClientsClientIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostClientsClientIdResponse**](PostClientsClientIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Create a Client

Note:  1. You can enter either:firstname/middlename/lastname - for a person (middlename is optional) OR fullname - for a business or organisation (or person known by one name).  2.If address is enable(enable-address&#x3D;true), then additional field called address has to be passed.  Mandatory Fields: firstname and lastname OR fullname, officeId, active&#x3D;true and activationDate OR active&#x3D;false, if(address enabled) address  Optional Fields: groupId, externalId, accountNo, staffId, mobileNo, savingsProductId, genderId, clientTypeId, clientClassificationId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val postClientsRequest : PostClientsRequest =  // PostClientsRequest | 

launch(Dispatchers.IO) {
    val result : PostClientsResponse = webService.create6(postClientsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postClientsRequest** | [**PostClientsRequest**](PostClientsRequest.md)|  | |

### Return type

[**PostClientsResponse**](PostClientsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Client

If a client is in Pending state, you are allowed to Delete it. The delete is a &#39;hard delete&#39; and cannot be recovered from. Once clients become active or have loans or savings associated with them, you cannot delete the client but you may Close the client if they have left the program.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val body : kotlin.Any = Object // kotlin.Any | 

launch(Dispatchers.IO) {
    val result : DeleteClientsClientIdResponse = webService.delete10(externalId, body)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | |

### Return type

[**DeleteClientsClientIdResponse**](DeleteClientsClientIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Client

If a client is in Pending state, you are allowed to Delete it. The delete is a &#39;hard delete&#39; and cannot be recovered from. Once clients become active or have loans or savings associated with them, you cannot delete the client but you may Close the client if they have left the program.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val body : kotlin.Any = Object // kotlin.Any | 

launch(Dispatchers.IO) {
    val result : DeleteClientsClientIdResponse = webService.delete9(clientId, body)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.Any**|  | |

### Return type

[**DeleteClientsClientIdResponse**](DeleteClientsClientIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val legalFormType : kotlin.String = legalFormType_example // kotlin.String | 
val officeId : kotlin.Long = 789 // kotlin.Long | 
val staffId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getClientTemplate(legalFormType, officeId, staffId, dateFormat)
}
```

### Parameters
| **legalFormType** | **kotlin.String**|  | [optional] |
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
val webService = apiClient.createWebservice(ClientApi::class.java)
val legalFormType : kotlin.String = legalFormType_example // kotlin.String | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postClientTemplate(legalFormType, dateFormat, locale, uploadedInputStream)
}
```

### Parameters
| **legalFormType** | **kotlin.String**|  | [optional] |
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


List Clients

The list capability of clients can support pagination and sorting.  Example Requests:  clients  clients?fields&#x3D;displayName,officeName,timeline  clients?offset&#x3D;10&amp;limit&#x3D;50  clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | officeId
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val displayName : kotlin.String = displayName_example // kotlin.String | displayName
val firstName : kotlin.String = firstName_example // kotlin.String | firstName
val lastName : kotlin.String = lastName_example // kotlin.String | lastName
val status : kotlin.String = status_example // kotlin.String | status
val underHierarchy : kotlin.String = underHierarchy_example // kotlin.String | underHierarchy
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
val orphansOnly : kotlin.Boolean = true // kotlin.Boolean | orphansOnly

launch(Dispatchers.IO) {
    val result : GetClientsResponse = webService.retrieveAll21(officeId, externalId, displayName, firstName, lastName, status, underHierarchy, offset, limit, orderBy, sortOrder, orphansOnly)
}
```

### Parameters
| **officeId** | **kotlin.Long**| officeId | [optional] |
| **externalId** | **kotlin.String**| externalId | [optional] |
| **displayName** | **kotlin.String**| displayName | [optional] |
| **firstName** | **kotlin.String**| firstName | [optional] |
| **lastName** | **kotlin.String**| lastName | [optional] |
| **status** | **kotlin.String**| status | [optional] |
| **underHierarchy** | **kotlin.String**| underHierarchy | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **orphansOnly** | **kotlin.Boolean**| orphansOnly | [optional] |

### Return type

[**GetClientsResponse**](GetClientsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve client accounts overview

An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:   clients/1/accounts  clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId

launch(Dispatchers.IO) {
    val result : GetClientsClientIdAccountsResponse = webService.retrieveAssociatedAccounts(clientId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**| clientId | |

### Return type

[**GetClientsClientIdAccountsResponse**](GetClientsClientIdAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve client accounts overview

An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:   clients/123-456/accounts  clients/123-456/accounts?fields&#x3D;loanAccounts,savingsAccounts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId

launch(Dispatchers.IO) {
    val result : GetClientsClientIdAccountsResponse = webService.retrieveAssociatedAccounts1(externalId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String**| externalId | |

### Return type

[**GetClientsClientIdAccountsResponse**](GetClientsClientIdAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve client obligee details

Retrieve client obligee details

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : GetClientObligeeDetailsResponse = webService.retrieveObligeeDetails(clientId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**|  | |

### Return type

[**GetClientObligeeDetailsResponse**](GetClientObligeeDetailsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve client obligee details

Retrieve client obligee details using the client external Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : GetClientObligeeDetailsResponse = webService.retrieveObligeeDetails1(externalId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String**|  | |

### Return type

[**GetClientObligeeDetailsResponse**](GetClientObligeeDetailsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Client

Example Requests:  clients/1   clients/1?template&#x3D;true   clients/1?fields&#x3D;id,displayName,officeName

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly

launch(Dispatchers.IO) {
    val result : GetClientsClientIdResponse = webService.retrieveOne11(clientId, staffInSelectedOfficeOnly)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |

### Return type

[**GetClientsClientIdResponse**](GetClientsClientIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Client by External Id

Example Requests:  clients/123-456   clients/123-456?template&#x3D;true   clients/123-456?fields&#x3D;id,displayName,officeName

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly

launch(Dispatchers.IO) {
    val result : GetClientsClientIdResponse = webService.retrieveOne12(externalId, staffInSelectedOfficeOnly)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |

### Return type

[**GetClientsClientIdResponse**](GetClientsClientIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Client Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  clients/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | officeId
val commandParam : kotlin.String = commandParam_example // kotlin.String | commandParam
val staffInSelectedOfficeOnly : kotlin.Boolean = true // kotlin.Boolean | staffInSelectedOfficeOnly

launch(Dispatchers.IO) {
    val result : GetClientsTemplateResponse = webService.retrieveTemplate5(officeId, commandParam, staffInSelectedOfficeOnly)
}
```

### Parameters
| **officeId** | **kotlin.Long**| officeId | [optional] |
| **commandParam** | **kotlin.String**| commandParam | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **staffInSelectedOfficeOnly** | **kotlin.Boolean**| staffInSelectedOfficeOnly | [optional] [default to false] |

### Return type

[**GetClientsTemplateResponse**](GetClientsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve client transfer template

Retrieve client transfer template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : GetClientTransferProposalDateResponse = webService.retrieveTransferTemplate(clientId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**|  | |

### Return type

[**GetClientTransferProposalDateResponse**](GetClientTransferProposalDateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve client transfer template

Retrieve client transfer template using the client external Id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : GetClientTransferProposalDateResponse = webService.retrieveTransferTemplate1(externalId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **externalId** | **kotlin.String**|  | |

### Return type

[**GetClientTransferProposalDateResponse**](GetClientTransferProposalDateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Client

Note: You can update any of the basic attributes of a client (but not its associations) using this API.  Changing the relationship between a client and its office is not supported through this API. An API specific to handling transfers of clients between offices is available for the same.  The relationship between a client and a group must be removed through the Groups API.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val putClientsClientIdRequest : PutClientsClientIdRequest =  // PutClientsClientIdRequest | 

launch(Dispatchers.IO) {
    val result : PutClientsClientIdResponse = webService.update10(clientId, putClientsClientIdRequest)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putClientsClientIdRequest** | [**PutClientsClientIdRequest**](PutClientsClientIdRequest.md)|  | |

### Return type

[**PutClientsClientIdResponse**](PutClientsClientIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update a Client using the External Id

Note: You can update any of the basic attributes of a client (but not its associations) using this API.  Changing the relationship between a client and its office is not supported through this API. An API specific to handling transfers of clients between offices is available for the same.  The relationship between a client and a group must be removed through the Groups API.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val putClientsClientIdRequest : PutClientsClientIdRequest =  // PutClientsClientIdRequest | 

launch(Dispatchers.IO) {
    val result : PutClientsClientIdResponse = webService.update11(externalId, putClientsClientIdRequest)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putClientsClientIdRequest** | [**PutClientsClientIdRequest**](PutClientsClientIdRequest.md)|  | |

### Return type

[**PutClientsClientIdResponse**](PutClientsClientIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

