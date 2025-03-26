# ExternalServicesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveOne2**](ExternalServicesApi.md#retrieveOne2) | **GET** v1/externalservice/{servicename} | Retrieve External Services Configuration |
| [**updateExternalServiceProperties**](ExternalServicesApi.md#updateExternalServiceProperties) | **PUT** v1/externalservice/{servicename} | Update External Service |



Retrieve External Services Configuration

Returns a external Service configurations based on the Service Name.  Service Names supported are S3 and SMTP.  Example Requests:  externalservice/SMTP

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ExternalServicesApi::class.java)
val servicename : kotlin.String = servicename_example // kotlin.String | servicename

launch(Dispatchers.IO) {
    val result : ExternalServicesPropertiesData = webService.retrieveOne2(servicename)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **servicename** | **kotlin.String**| servicename | |

### Return type

[**ExternalServicesPropertiesData**](ExternalServicesPropertiesData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update External Service

Updates the external Service Configuration for a Service Name.  Example:   externalservice/S3

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ExternalServicesApi::class.java)
val servicename : kotlin.String = servicename_example // kotlin.String | servicename
val putExternalServiceRequest : PutExternalServiceRequest =  // PutExternalServiceRequest | 

launch(Dispatchers.IO) {
    webService.updateExternalServiceProperties(servicename, putExternalServiceRequest)
}
```

### Parameters
| **servicename** | **kotlin.String**| servicename | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putExternalServiceRequest** | [**PutExternalServiceRequest**](PutExternalServiceRequest.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

