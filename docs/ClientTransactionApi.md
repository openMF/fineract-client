# ClientTransactionApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveAllClientTransactions**](ClientTransactionApi.md#retrieveAllClientTransactions) | **GET** v1/clients/{clientId}/transactions | List Client Transactions |
| [**retrieveAllClientTransactions1**](ClientTransactionApi.md#retrieveAllClientTransactions1) | **GET** v1/clients/external-id/{clientExternalId}/transactions | List Client Transactions |
| [**retrieveClientTransaction**](ClientTransactionApi.md#retrieveClientTransaction) | **GET** v1/clients/{clientId}/transactions/{transactionId} | Retrieve a Client Transaction |
| [**retrieveClientTransaction1**](ClientTransactionApi.md#retrieveClientTransaction1) | **GET** v1/clients/{clientId}/transactions/external-id/{transactionExternalId} | Retrieve a Client Transaction |
| [**retrieveClientTransaction2**](ClientTransactionApi.md#retrieveClientTransaction2) | **GET** v1/clients/external-id/{clientExternalId}/transactions/{transactionId} | Retrieve a Client Transaction |
| [**retrieveClientTransaction3**](ClientTransactionApi.md#retrieveClientTransaction3) | **GET** v1/clients/external-id/{clientExternalId}/transactions/external-id/{transactionExternalId} | Retrieve a Client Transaction |
| [**undoClientTransaction**](ClientTransactionApi.md#undoClientTransaction) | **POST** v1/clients/{clientId}/transactions/{transactionId} | Undo a Client Transaction |
| [**undoClientTransaction1**](ClientTransactionApi.md#undoClientTransaction1) | **POST** v1/clients/{clientId}/transactions/external-id/{transactionExternalId} | Undo a Client Transaction |
| [**undoClientTransaction2**](ClientTransactionApi.md#undoClientTransaction2) | **POST** v1/clients/external-id/{clientExternalId}/transactions/{transactionId} | Undo a Client Transaction |
| [**undoClientTransaction3**](ClientTransactionApi.md#undoClientTransaction3) | **POST** v1/clients/external-id/{clientExternalId}/transactions/external-id/{transactionExternalId} | Undo a Client Transaction |



List Client Transactions

The list capability of client transaction can support pagination.  Example Requests:  clients/189/transactions  clients/189/transactions?offset&#x3D;10&amp;limit&#x3D;50

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientTransactionApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit

launch(Dispatchers.IO) {
    val result : GetClientsClientIdTransactionsResponse = webService.retrieveAllClientTransactions(clientId, offset, limit)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| **offset** | **kotlin.Int**| offset | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| limit | [optional] |

### Return type

[**GetClientsClientIdTransactionsResponse**](GetClientsClientIdTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Client Transactions

The list capability of client transaction can support pagination.  Example Requests:  clients/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions  clients/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions?offset&#x3D;10&amp;limit&#x3D;50

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientTransactionApi::class.java)
val clientExternalId : kotlin.String = clientExternalId_example // kotlin.String | clientExternalId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit

launch(Dispatchers.IO) {
    val result : GetClientsClientIdTransactionsResponse = webService.retrieveAllClientTransactions1(clientExternalId, offset, limit)
}
```

### Parameters
| **clientExternalId** | **kotlin.String**| clientExternalId | |
| **offset** | **kotlin.Int**| offset | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| limit | [optional] |

### Return type

[**GetClientsClientIdTransactionsResponse**](GetClientsClientIdTransactionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Client Transaction

Example Requests: clients/1/transactions/1   clients/1/transactions/1?fields&#x3D;id,officeName

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientTransactionApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId

launch(Dispatchers.IO) {
    val result : GetClientsClientIdTransactionsTransactionIdResponse = webService.retrieveClientTransaction(clientId, transactionId)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionId** | **kotlin.Long**| transactionId | |

### Return type

[**GetClientsClientIdTransactionsTransactionIdResponse**](GetClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Client Transaction

Example Requests: clients/1/transactions/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854   clients/1/transactions/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?fields&#x3D;id,officeName

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientTransactionApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val transactionExternalId : kotlin.String = transactionExternalId_example // kotlin.String | transactionExternalId

launch(Dispatchers.IO) {
    val result : GetClientsClientIdTransactionsTransactionIdResponse = webService.retrieveClientTransaction1(clientId, transactionExternalId)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionExternalId** | **kotlin.String**| transactionExternalId | |

### Return type

[**GetClientsClientIdTransactionsTransactionIdResponse**](GetClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Client Transaction

Example Requests: clients/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions/1   clients/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions/1?fields&#x3D;id,officeName

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientTransactionApi::class.java)
val clientExternalId : kotlin.String = clientExternalId_example // kotlin.String | clientExternalId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId

launch(Dispatchers.IO) {
    val result : GetClientsClientIdTransactionsTransactionIdResponse = webService.retrieveClientTransaction2(clientExternalId, transactionId)
}
```

### Parameters
| **clientExternalId** | **kotlin.String**| clientExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionId** | **kotlin.Long**| transactionId | |

### Return type

[**GetClientsClientIdTransactionsTransactionIdResponse**](GetClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Client Transaction

Example Requests: clients/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854   clients/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854/transactions/external-id/7dd80a7c-ycba-a446-t378-91eb6f53e854?fields&#x3D;id,officeName

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientTransactionApi::class.java)
val clientExternalId : kotlin.String = clientExternalId_example // kotlin.String | clientExternalId
val transactionExternalId : kotlin.String = transactionExternalId_example // kotlin.String | transactionExternalId

launch(Dispatchers.IO) {
    val result : GetClientsClientIdTransactionsTransactionIdResponse = webService.retrieveClientTransaction3(clientExternalId, transactionExternalId)
}
```

### Parameters
| **clientExternalId** | **kotlin.String**| clientExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionExternalId** | **kotlin.String**| transactionExternalId | |

### Return type

[**GetClientsClientIdTransactionsTransactionIdResponse**](GetClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Undo a Client Transaction

Undoes a Client Transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientTransactionApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostClientsClientIdTransactionsTransactionIdResponse = webService.undoClientTransaction(clientId, transactionId, command)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| **transactionId** | **kotlin.Long**| transactionId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostClientsClientIdTransactionsTransactionIdResponse**](PostClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Undo a Client Transaction

Undoes a Client Transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientTransactionApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val transactionExternalId : kotlin.String = transactionExternalId_example // kotlin.String | transactionExternalId
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostClientsClientIdTransactionsTransactionIdResponse = webService.undoClientTransaction1(clientId, transactionExternalId, command)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| **transactionExternalId** | **kotlin.String**| transactionExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostClientsClientIdTransactionsTransactionIdResponse**](PostClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Undo a Client Transaction

Undoes a Client Transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientTransactionApi::class.java)
val clientExternalId : kotlin.String = clientExternalId_example // kotlin.String | clientExternalId
val transactionId : kotlin.Long = 789 // kotlin.Long | transactionId
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostClientsClientIdTransactionsTransactionIdResponse = webService.undoClientTransaction2(clientExternalId, transactionId, command)
}
```

### Parameters
| **clientExternalId** | **kotlin.String**| clientExternalId | |
| **transactionId** | **kotlin.Long**| transactionId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostClientsClientIdTransactionsTransactionIdResponse**](PostClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Undo a Client Transaction

Undoes a Client Transaction

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientTransactionApi::class.java)
val clientExternalId : kotlin.String = clientExternalId_example // kotlin.String | clientExternalId
val transactionExternalId : kotlin.String = transactionExternalId_example // kotlin.String | transactionExternalId
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostClientsClientIdTransactionsTransactionIdResponse = webService.undoClientTransaction3(clientExternalId, transactionExternalId, command)
}
```

### Parameters
| **clientExternalId** | **kotlin.String**| clientExternalId | |
| **transactionExternalId** | **kotlin.String**| transactionExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostClientsClientIdTransactionsTransactionIdResponse**](PostClientsClientIdTransactionsTransactionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

