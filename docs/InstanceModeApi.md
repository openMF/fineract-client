# InstanceModeApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**changeMode**](InstanceModeApi.md#changeMode) | **PUT** v1/instance-mode | Changes the Fineract instance mode |



Changes the Fineract instance mode

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(InstanceModeApi::class.java)
val changeInstanceModeRequest : ChangeInstanceModeRequest =  // ChangeInstanceModeRequest | 

launch(Dispatchers.IO) {
    webService.changeMode(changeInstanceModeRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **changeInstanceModeRequest** | [**ChangeInstanceModeRequest**](ChangeInstanceModeRequest.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

