# SelfClientApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addNewClientImage2**](SelfClientApi.md#addNewClientImage2) | **POST** v1/self/clients/{clientId}/images |  |
| [**deleteClientImage1**](SelfClientApi.md#deleteClientImage1) | **DELETE** v1/self/clients/{clientId}/images |  |
| [**retrieveAll36**](SelfClientApi.md#retrieveAll36) | **GET** v1/self/clients | List Clients associated to the user |
| [**retrieveAllClientCharges1**](SelfClientApi.md#retrieveAllClientCharges1) | **GET** v1/self/clients/{clientId}/charges | List Client Charges |
| [**retrieveAllClientTransactions2**](SelfClientApi.md#retrieveAllClientTransactions2) | **GET** v1/self/clients/{clientId}/transactions | List Client Transactions |
| [**retrieveAssociatedAccounts2**](SelfClientApi.md#retrieveAssociatedAccounts2) | **GET** v1/self/clients/{clientId}/accounts | Retrieve client accounts overview |
| [**retrieveClientCharge1**](SelfClientApi.md#retrieveClientCharge1) | **GET** v1/self/clients/{clientId}/charges/{chargeId} | Retrieve a Client Charge |
| [**retrieveClientTransaction4**](SelfClientApi.md#retrieveClientTransaction4) | **GET** v1/self/clients/{clientId}/transactions/{transactionId} | Retrieve a Client Transaction |
| [**retrieveImage1**](SelfClientApi.md#retrieveImage1) | **GET** v1/self/clients/{clientId}/images | Retrieve Client Image |
| [**retrieveObligeeDetails2**](SelfClientApi.md#retrieveObligeeDetails2) | **GET** v1/self/clients/{clientId}/obligeedetails |  |
| [**retrieveOne28**](SelfClientApi.md#retrieveOne28) | **GET** v1/self/clients/{clientId} | Retrieve a Client |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | 
val contentLength : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.addNewClientImage2(clientId, contentLength, dateFormat, locale, uploadedInputStream)
}
```

### Parameters
| **clientId** | **kotlin.Long**|  | |
| **contentLength** | **kotlin.Long**|  | [optional] |
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
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.deleteClientImage1(clientId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**|  | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Clients associated to the user

The list capability of clients can support pagination and sorting.  Example Requests:  self/clients  self/clients?fields&#x3D;displayName,officeName  self/clients?offset&#x3D;10&amp;limit&#x3D;50  self/clients?orderBy&#x3D;displayName&amp;sortOrder&#x3D;DESC

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfClientApi::class.java)
val displayName : kotlin.String = displayName_example // kotlin.String | displayName
val firstName : kotlin.String = firstName_example // kotlin.String | firstName
val lastName : kotlin.String = lastName_example // kotlin.String | lastName
val offset : kotlin.Int = 56 // kotlin.Int | offset
val status : kotlin.String = status_example // kotlin.String | status
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder

launch(Dispatchers.IO) {
    val result : GetSelfClientsResponse = webService.retrieveAll36(displayName, firstName, lastName, offset, status, limit, orderBy, sortOrder)
}
```

### Parameters
| **displayName** | **kotlin.String**| displayName | [optional] |
| **firstName** | **kotlin.String**| firstName | [optional] |
| **lastName** | **kotlin.String**| lastName | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **status** | **kotlin.String**| status | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |

### Return type

[**GetSelfClientsResponse**](GetSelfClientsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Client Charges

The list capability of client charges supports pagination.  Example Requests:  self/clients/1/charges  self/clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val chargeStatus : kotlin.String = chargeStatus_example // kotlin.String | chargeStatus
val pendingPayment : kotlin.Boolean = true // kotlin.Boolean | pendingPayment
val limit : kotlin.Int = 56 // kotlin.Int | limit
val offset : kotlin.Int = 56 // kotlin.Int | offset

launch(Dispatchers.IO) {
    val result : GetSelfClientsClientIdChargesResponse = webService.retrieveAllClientCharges1(clientId, chargeStatus, pendingPayment, limit, offset)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| **chargeStatus** | **kotlin.String**| chargeStatus | [optional] [default to &quot;all&quot;] |
| **pendingPayment** | **kotlin.Boolean**| pendingPayment | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **offset** | **kotlin.Int**| offset | [optional] |

### Return type

[**GetSelfClientsClientIdChargesResponse**](GetSelfClientsClientIdChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Client Transactions

The list capability of client transaction can support pagination.  Example Requests:  self/clients/189/transactions  self/clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit

launch(Dispatchers.IO) {
    val result : GetSelfClientsClientIdTransactionsResponse = webService.retrieveAllClientTransactions2(clientId, offset, limit)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| **offset** | **kotlin.Int**| offset | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| limit | [optional] |

### Return type

[**GetSelfClientsClientIdTransactionsResponse**](GetSelfClientsClientIdTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve client accounts overview

An example of how a loan portfolio summary can be provided. This is requested in a specific use case of the community application. It is quite reasonable to add resources like this to simplify User Interface development.  Example Requests:  self/clients/1/accounts   self/clients/1/accounts?fields&#x3D;loanAccounts,savingsAccounts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId

launch(Dispatchers.IO) {
    val result : GetSelfClientsClientIdAccountsResponse = webService.retrieveAssociatedAccounts2(clientId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**| clientId | |

### Return type

[**GetSelfClientsClientIdAccountsResponse**](GetSelfClientsClientIdAccountsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Client Charge

Retrieves a Client Charge  Example Requests:  self/clients/1/charges/1   self/clients/1/charges/1?fields&#x3D;name,id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val chargeId : kotlin.Long = 789 // kotlin.Long | chargeId

launch(Dispatchers.IO) {
    val result : GetSelfClientsClientIdChargesChargeIdResponse = webService.retrieveClientCharge1(clientId, chargeId)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chargeId** | **kotlin.Long**| chargeId | |

### Return type

[**GetSelfClientsClientIdChargesChargeIdResponse**](GetSelfClientsClientIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Client Transaction

Retrieves a Client TransactionExample Requests:  self/clients/1/transactions/1   self/clients/1/transactions/1?fields&#x3D;id,officeName

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId

launch(Dispatchers.IO) {
    val result : GetSelfClientsClientIdTransactionsTransactionIdResponse = webService.retrieveClientTransaction4(clientId, transactionId)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionId** | **kotlin.Long**| transactionId | |

### Return type

[**GetSelfClientsClientIdTransactionsTransactionIdResponse**](GetSelfClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Client Image

Optional arguments are identical to those of Get Image associated with an Entity (Binary file)  Example Requests:  self/clients/1/images

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val maxWidth : kotlin.Int = maxWidth // kotlin.Int | 
val maxHeight : kotlin.Int = maxHeight // kotlin.Int | 
val output : kotlin.String = output // kotlin.String | 

launch(Dispatchers.IO) {
    webService.retrieveImage1(clientId, maxWidth, maxHeight, output)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| **maxWidth** | **kotlin.Int**|  | [optional] |
| **maxHeight** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **output** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveObligeeDetails2(clientId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**|  | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Client

Retrieves a Client  Example Requests:  self/clients/1  self/clients/1?fields&#x3D;id,displayName,officeName

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfClientApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId

launch(Dispatchers.IO) {
    val result : GetSelfClientsClientIdResponse = webService.retrieveOne28(clientId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**| clientId | |

### Return type

[**GetSelfClientsClientIdResponse**](GetSelfClientsClientIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

