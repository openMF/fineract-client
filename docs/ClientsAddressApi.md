# ClientsAddressApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addClientAddress**](ClientsAddressApi.md#addClientAddress) | **POST** v1/client/{clientid}/addresses | Create an address for a Client |
| [**getAddresses1**](ClientsAddressApi.md#getAddresses1) | **GET** v1/client/{clientid}/addresses | List all addresses for a Client |
| [**getAddressesTemplate**](ClientsAddressApi.md#getAddressesTemplate) | **GET** v1/client/addresses/template |  |
| [**updateClientAddress**](ClientsAddressApi.md#updateClientAddress) | **PUT** v1/client/{clientid}/addresses | Update an address for a Client |



Create an address for a Client

Mandatory Fields :  type and clientId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientsAddressApi::class.java)
val clientid : kotlin.Long = 789 // kotlin.Long | clientId
val postClientClientIdAddressesRequest : PostClientClientIdAddressesRequest =  // PostClientClientIdAddressesRequest | 
val type : kotlin.Long = 789 // kotlin.Long | type

launch(Dispatchers.IO) {
    val result : PostClientClientIdAddressesResponse = webService.addClientAddress(clientid, postClientClientIdAddressesRequest, type)
}
```

### Parameters
| **clientid** | **kotlin.Long**| clientId | |
| **postClientClientIdAddressesRequest** | [**PostClientClientIdAddressesRequest**](PostClientClientIdAddressesRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.Long**| type | [optional] |

### Return type

[**PostClientClientIdAddressesResponse**](PostClientClientIdAddressesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List all addresses for a Client

Example Requests:  client/1/addresses   clients/1/addresses?status&#x3D;false,true&amp;&amp;type&#x3D;1,2,3

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientsAddressApi::class.java)
val clientid : kotlin.Long = 789 // kotlin.Long | clientId
val status : kotlin.String = status_example // kotlin.String | status
val type : kotlin.Long = 789 // kotlin.Long | type

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetClientClientIdAddressesResponse> = webService.getAddresses1(clientid, status, type)
}
```

### Parameters
| **clientid** | **kotlin.Long**| clientId | |
| **status** | **kotlin.String**| status | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.Long**| type | [optional] |

### Return type

[**kotlin.collections.List&lt;GetClientClientIdAddressesResponse&gt;**](GetClientClientIdAddressesResponse.md)

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
val webService = apiClient.createWebservice(ClientsAddressApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getAddressesTemplate()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update an address for a Client

All the address fields can be updated by using update client address API  Mandatory Fields type and addressId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientsAddressApi::class.java)
val clientid : kotlin.Long = 789 // kotlin.Long | clientId
val putClientClientIdAddressesRequest : PutClientClientIdAddressesRequest =  // PutClientClientIdAddressesRequest | 

launch(Dispatchers.IO) {
    val result : PutClientClientIdAddressesResponse = webService.updateClientAddress(clientid, putClientClientIdAddressesRequest)
}
```

### Parameters
| **clientid** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putClientClientIdAddressesRequest** | [**PutClientClientIdAddressesRequest**](PutClientClientIdAddressesRequest.md)|  | |

### Return type

[**PutClientClientIdAddressesResponse**](PutClientClientIdAddressesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

