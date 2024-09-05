# EntityFieldConfigurationApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getAddresses**](EntityFieldConfigurationApi.md#getAddresses) | **GET** v1/fieldconfiguration/{entity} | Retrieves the Entity Field Configuration |



Retrieves the Entity Field Configuration

It retrieves all the Entity Field Configuration

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(EntityFieldConfigurationApi::class.java)
val entity : kotlin.String = entity_example // kotlin.String | entity

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetFieldConfigurationEntityResponse> = webService.getAddresses(entity)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entity** | **kotlin.String**| entity | |

### Return type

[**kotlin.collections.List&lt;GetFieldConfigurationEntityResponse&gt;**](GetFieldConfigurationEntityResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

