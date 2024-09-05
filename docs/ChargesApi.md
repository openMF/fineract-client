# ChargesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCharge**](ChargesApi.md#createCharge) | **POST** v1/charges | Create/Define a Charge |
| [**deleteCharge**](ChargesApi.md#deleteCharge) | **DELETE** v1/charges/{chargeId} | Delete a Charge |
| [**retrieveAllCharges**](ChargesApi.md#retrieveAllCharges) | **GET** v1/charges | Retrieve Charges |
| [**retrieveCharge**](ChargesApi.md#retrieveCharge) | **GET** v1/charges/{chargeId} | Retrieve a Charge |
| [**retrieveNewChargeDetails**](ChargesApi.md#retrieveNewChargeDetails) | **GET** v1/charges/template | Retrieve Charge Template |
| [**updateCharge**](ChargesApi.md#updateCharge) | **PUT** v1/charges/{chargeId} | Update a Charge |



Create/Define a Charge

Define a new charge that can later be associated with loans and savings through their respective product definitions or directly on each account instance.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ChargesApi::class.java)
val postChargesRequest : PostChargesRequest =  // PostChargesRequest | 

launch(Dispatchers.IO) {
    val result : PostChargesResponse = webService.createCharge(postChargesRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postChargesRequest** | [**PostChargesRequest**](PostChargesRequest.md)|  | |

### Return type

[**PostChargesResponse**](PostChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Charge

Deletes a Charge.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ChargesApi::class.java)
val chargeId : kotlin.Long = 789 // kotlin.Long | chargeId

launch(Dispatchers.IO) {
    val result : DeleteChargesChargeIdResponse = webService.deleteCharge(chargeId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chargeId** | **kotlin.Long**| chargeId | |

### Return type

[**DeleteChargesChargeIdResponse**](DeleteChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Charges

Returns the list of defined charges.  Example Requests:  charges

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ChargesApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetChargesResponse> = webService.retrieveAllCharges()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetChargesResponse&gt;**](GetChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Charge

Returns the details of a defined Charge.  Example Requests:  charges/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ChargesApi::class.java)
val chargeId : kotlin.Long = 789 // kotlin.Long | chargeId

launch(Dispatchers.IO) {
    val result : GetChargesResponse = webService.retrieveCharge(chargeId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chargeId** | **kotlin.Long**| chargeId | |

### Return type

[**GetChargesResponse**](GetChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Charge Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  charges/template 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ChargesApi::class.java)

launch(Dispatchers.IO) {
    val result : GetChargesTemplateResponse = webService.retrieveNewChargeDetails()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetChargesTemplateResponse**](GetChargesTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Charge

Updates the details of a Charge.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ChargesApi::class.java)
val chargeId : kotlin.Long = 789 // kotlin.Long | chargeId
val putChargesChargeIdRequest : PutChargesChargeIdRequest =  // PutChargesChargeIdRequest | 

launch(Dispatchers.IO) {
    val result : PutChargesChargeIdResponse = webService.updateCharge(chargeId, putChargesChargeIdRequest)
}
```

### Parameters
| **chargeId** | **kotlin.Long**| chargeId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putChargesChargeIdRequest** | [**PutChargesChargeIdRequest**](PutChargesChargeIdRequest.md)|  | |

### Return type

[**PutChargesChargeIdResponse**](PutChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

