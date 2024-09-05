# ExternalEventConfigurationApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveExternalEventConfiguration**](ExternalEventConfigurationApi.md#retrieveExternalEventConfiguration) | **GET** v1/externalevents/configuration | List all external event configurations |
| [**updateExternalEventConfigurationsDetails**](ExternalEventConfigurationApi.md#updateExternalEventConfigurationsDetails) | **PUT** v1/externalevents/configuration | Enable/Disable external events posting |



List all external event configurations

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ExternalEventConfigurationApi::class.java)

launch(Dispatchers.IO) {
    val result : GetExternalEventConfigurationsResponse = webService.retrieveExternalEventConfiguration()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetExternalEventConfigurationsResponse**](GetExternalEventConfigurationsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Enable/Disable external events posting

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ExternalEventConfigurationApi::class.java)
val putExternalEventConfigurationsRequest : PutExternalEventConfigurationsRequest =  // PutExternalEventConfigurationsRequest | 

launch(Dispatchers.IO) {
    val result : CommandProcessingResult = webService.updateExternalEventConfigurationsDetails(putExternalEventConfigurationsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putExternalEventConfigurationsRequest** | [**PutExternalEventConfigurationsRequest**](PutExternalEventConfigurationsRequest.md)|  | |

### Return type

[**CommandProcessingResult**](CommandProcessingResult.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

