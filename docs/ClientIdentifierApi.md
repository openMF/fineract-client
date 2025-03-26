# ClientIdentifierApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createClientIdentifier**](ClientIdentifierApi.md#createClientIdentifier) | **POST** v1/clients/{clientId}/identifiers | Create an Identifier for a Client |
| [**deleteClientIdentifier**](ClientIdentifierApi.md#deleteClientIdentifier) | **DELETE** v1/clients/{clientId}/identifiers/{identifierId} | Delete a Client Identifier |
| [**newClientIdentifierDetails**](ClientIdentifierApi.md#newClientIdentifierDetails) | **GET** v1/clients/{clientId}/identifiers/template | Retrieve Client Identifier Details Template |
| [**retrieveAllClientIdentifiers**](ClientIdentifierApi.md#retrieveAllClientIdentifiers) | **GET** v1/clients/{clientId}/identifiers | List all Identifiers for a Client |
| [**retrieveClientIdentifiers**](ClientIdentifierApi.md#retrieveClientIdentifiers) | **GET** v1/clients/{clientId}/identifiers/{identifierId} | Retrieve a Client Identifier |
| [**updateClientIdentifer**](ClientIdentifierApi.md#updateClientIdentifer) | **PUT** v1/clients/{clientId}/identifiers/{identifierId} | Update a Client Identifier |



Create an Identifier for a Client

Mandatory Fields documentKey, documentTypeId 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientIdentifierApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val postClientsClientIdIdentifiersRequest : PostClientsClientIdIdentifiersRequest =  // PostClientsClientIdIdentifiersRequest | 

launch(Dispatchers.IO) {
    val result : PostClientsClientIdIdentifiersResponse = webService.createClientIdentifier(clientId, postClientsClientIdIdentifiersRequest)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postClientsClientIdIdentifiersRequest** | [**PostClientsClientIdIdentifiersRequest**](PostClientsClientIdIdentifiersRequest.md)|  | |

### Return type

[**PostClientsClientIdIdentifiersResponse**](PostClientsClientIdIdentifiersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Client Identifier

Deletes a Client Identifier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientIdentifierApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val identifierId : kotlin.Long = 789 // kotlin.Long | identifierId

launch(Dispatchers.IO) {
    val result : DeleteClientsClientIdIdentifiersIdentifierIdResponse = webService.deleteClientIdentifier(clientId, identifierId)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **identifierId** | **kotlin.Long**| identifierId | |

### Return type

[**DeleteClientsClientIdIdentifiersIdentifierIdResponse**](DeleteClientsClientIdIdentifiersIdentifierIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Client Identifier Details Template

This is a convenience resource useful for building maintenance user interface screens for client applications. The template data returned consists of any or all of:   Field Defaults  Allowed description Lists   Example Request: clients/1/identifiers/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientIdentifierApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId

launch(Dispatchers.IO) {
    val result : GetClientsClientIdIdentifiersTemplateResponse = webService.newClientIdentifierDetails(clientId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**| clientId | |

### Return type

[**GetClientsClientIdIdentifiersTemplateResponse**](GetClientsClientIdIdentifiersTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List all Identifiers for a Client

Example Requests: clients/1/identifiers   clients/1/identifiers?fields&#x3D;documentKey,documentType,description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientIdentifierApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetClientsClientIdIdentifiersResponse> = webService.retrieveAllClientIdentifiers(clientId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**| clientId | |

### Return type

[**kotlin.collections.List&lt;GetClientsClientIdIdentifiersResponse&gt;**](GetClientsClientIdIdentifiersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Client Identifier

Example Requests: clients/1/identifier/2   clients/1/identifier/2?template&#x3D;true  clients/1/identifiers/2?fields&#x3D;documentKey,documentType,description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientIdentifierApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val identifierId : kotlin.Long = 789 // kotlin.Long | identifierId

launch(Dispatchers.IO) {
    val result : GetClientsClientIdIdentifiersResponse = webService.retrieveClientIdentifiers(clientId, identifierId)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **identifierId** | **kotlin.Long**| identifierId | |

### Return type

[**GetClientsClientIdIdentifiersResponse**](GetClientsClientIdIdentifiersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Client Identifier

Updates a Client Identifier

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientIdentifierApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val identifierId : kotlin.Long = 789 // kotlin.Long | identifierId
val putClientsClientIdIdentifiersIdentifierIdRequest : PutClientsClientIdIdentifiersIdentifierIdRequest =  // PutClientsClientIdIdentifiersIdentifierIdRequest | 

launch(Dispatchers.IO) {
    val result : PutClientsClientIdIdentifiersIdentifierIdResponse = webService.updateClientIdentifer(clientId, identifierId, putClientsClientIdIdentifiersIdentifierIdRequest)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| **identifierId** | **kotlin.Long**| identifierId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putClientsClientIdIdentifiersIdentifierIdRequest** | [**PutClientsClientIdIdentifiersIdentifierIdRequest**](PutClientsClientIdIdentifiersIdentifierIdRequest.md)|  | |

### Return type

[**PutClientsClientIdIdentifiersIdentifierIdResponse**](PutClientsClientIdIdentifiersIdentifierIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

