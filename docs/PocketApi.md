# PocketApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**handleCommands8**](PocketApi.md#handleCommands8) | **POST** v1/self/pockets | Link/delink accounts to/from pocket |
| [**retrieveAll37**](PocketApi.md#retrieveAll37) | **GET** v1/self/pockets | Retrieve accounts linked to pocket |



Link/delink accounts to/from pocket

Pockets behave as favourites. An user can link his/her Loan, Savings and Share accounts to pocket for faster access. In a similar way linked accounts can be delinked from the pocket.  Example Requests:  self/pockets?command&#x3D;linkAccounts  self/pockets?command&#x3D;delinkAccounts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PocketApi::class.java)
val command : kotlin.String = command_example // kotlin.String | command
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : PostLinkDelinkAccountsToFromPocketResponse = webService.handleCommands8(command, body)
}
```

### Parameters
| **command** | **kotlin.String**| command | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

[**PostLinkDelinkAccountsToFromPocketResponse**](PostLinkDelinkAccountsToFromPocketResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Retrieve accounts linked to pocket

All linked loan  Example Requests:   self/pockets

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PocketApi::class.java)

launch(Dispatchers.IO) {
    val result : GetAccountsLinkedToPocketResponse = webService.retrieveAll37()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAccountsLinkedToPocketResponse**](GetAccountsLinkedToPocketResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

