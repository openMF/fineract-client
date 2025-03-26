# GlobalConfigurationApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveConfiguration**](GlobalConfigurationApi.md#retrieveConfiguration) | **GET** v1/configurations | Retrieve Global Configuration | Retrieve Global Configuration for surveys |
| [**retrieveOne3**](GlobalConfigurationApi.md#retrieveOne3) | **GET** v1/configurations/{configId} | Retrieve Global Configuration |
| [**retrieveOneByName**](GlobalConfigurationApi.md#retrieveOneByName) | **GET** v1/configurations/name/{name} | Retrieve Global Configuration |
| [**updateConfiguration1**](GlobalConfigurationApi.md#updateConfiguration1) | **PUT** v1/configurations/{configId} | Update Global Configuration |



Retrieve Global Configuration | Retrieve Global Configuration for surveys

Returns the list global enable/disable configurations.  Example Requests:  configurations   Returns the list global enable/disable survey configurations.  Example Requests:  configurations/survey

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GlobalConfigurationApi::class.java)
val survey : kotlin.Boolean = true // kotlin.Boolean | survey

launch(Dispatchers.IO) {
    val result : GetGlobalConfigurationsResponse = webService.retrieveConfiguration(survey)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **survey** | **kotlin.Boolean**| survey | [optional] [default to false] |

### Return type

[**GetGlobalConfigurationsResponse**](GetGlobalConfigurationsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Global Configuration

Returns a global enable/disable configurations.  Example Requests:  configurations/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GlobalConfigurationApi::class.java)
val configId : kotlin.Long = 789 // kotlin.Long | configId

launch(Dispatchers.IO) {
    val result : GetGlobalConfigurationsResponse = webService.retrieveOne3(configId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **configId** | **kotlin.Long**| configId | |

### Return type

[**GetGlobalConfigurationsResponse**](GetGlobalConfigurationsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Global Configuration

Returns a global enable/disable configuration.  Example Requests:  configurations/name/Enable-Address

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GlobalConfigurationApi::class.java)
val name : kotlin.String = name_example // kotlin.String | name

launch(Dispatchers.IO) {
    val result : GlobalConfigurationPropertyData = webService.retrieveOneByName(name)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **name** | **kotlin.String**| name | |

### Return type

[**GlobalConfigurationPropertyData**](GlobalConfigurationPropertyData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update Global Configuration

Updates an enable/disable global configuration item.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(GlobalConfigurationApi::class.java)
val configId : kotlin.Long = 789 // kotlin.Long | configId
val putGlobalConfigurationsRequest : PutGlobalConfigurationsRequest =  // PutGlobalConfigurationsRequest | 

launch(Dispatchers.IO) {
    val result : PutGlobalConfigurationsResponse = webService.updateConfiguration1(configId, putGlobalConfigurationsRequest)
}
```

### Parameters
| **configId** | **kotlin.Long**| configId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putGlobalConfigurationsRequest** | [**PutGlobalConfigurationsRequest**](PutGlobalConfigurationsRequest.md)|  | |

### Return type

[**PutGlobalConfigurationsResponse**](PutGlobalConfigurationsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

