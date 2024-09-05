# PaymentTypeApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createPaymentType**](PaymentTypeApi.md#createPaymentType) | **POST** v1/paymenttypes | Create a Payment Type |
| [**deleteCode1**](PaymentTypeApi.md#deleteCode1) | **DELETE** v1/paymenttypes/{paymentTypeId} | Delete a Payment Type |
| [**getAllPaymentTypes**](PaymentTypeApi.md#getAllPaymentTypes) | **GET** v1/paymenttypes | Retrieve all Payment Types |
| [**retrieveOnePaymentType**](PaymentTypeApi.md#retrieveOnePaymentType) | **GET** v1/paymenttypes/{paymentTypeId} | Retrieve a Payment Type |
| [**updatePaymentType**](PaymentTypeApi.md#updatePaymentType) | **PUT** v1/paymenttypes/{paymentTypeId} | Update a Payment Type |



Create a Payment Type

Creates a new Payment type  Mandatory Fields: name  Optional Fields: Description, isCashPayment,Position

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PaymentTypeApi::class.java)
val postPaymentTypesRequest : PostPaymentTypesRequest =  // PostPaymentTypesRequest | 

launch(Dispatchers.IO) {
    val result : PostPaymentTypesResponse = webService.createPaymentType(postPaymentTypesRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postPaymentTypesRequest** | [**PostPaymentTypesRequest**](PostPaymentTypesRequest.md)|  | |

### Return type

[**PostPaymentTypesResponse**](PostPaymentTypesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Payment Type

Deletes payment type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PaymentTypeApi::class.java)
val paymentTypeId : kotlin.Long = 789 // kotlin.Long | paymentTypeId

launch(Dispatchers.IO) {
    val result : DeletePaymentTypesPaymentTypeIdResponse = webService.deleteCode1(paymentTypeId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentTypeId** | **kotlin.Long**| paymentTypeId | |

### Return type

[**DeletePaymentTypesPaymentTypeIdResponse**](DeletePaymentTypesPaymentTypeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve all Payment Types

Retrieve list of payment types

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PaymentTypeApi::class.java)
val onlyWithCode : kotlin.Boolean = true // kotlin.Boolean | onlyWithCode

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetPaymentTypesResponse> = webService.getAllPaymentTypes(onlyWithCode)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **onlyWithCode** | **kotlin.Boolean**| onlyWithCode | [optional] |

### Return type

[**kotlin.collections.List&lt;GetPaymentTypesResponse&gt;**](GetPaymentTypesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Payment Type

Retrieves a payment type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PaymentTypeApi::class.java)
val paymentTypeId : kotlin.Long = 789 // kotlin.Long | paymentTypeId

launch(Dispatchers.IO) {
    val result : GetPaymentTypesPaymentTypeIdResponse = webService.retrieveOnePaymentType(paymentTypeId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **paymentTypeId** | **kotlin.Long**| paymentTypeId | |

### Return type

[**GetPaymentTypesPaymentTypeIdResponse**](GetPaymentTypesPaymentTypeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Payment Type

Updates a Payment Type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PaymentTypeApi::class.java)
val paymentTypeId : kotlin.Long = 789 // kotlin.Long | paymentTypeId
val putPaymentTypesPaymentTypeIdRequest : PutPaymentTypesPaymentTypeIdRequest =  // PutPaymentTypesPaymentTypeIdRequest | 

launch(Dispatchers.IO) {
    val result : PutPaymentTypesPaymentTypeIdResponse = webService.updatePaymentType(paymentTypeId, putPaymentTypesPaymentTypeIdRequest)
}
```

### Parameters
| **paymentTypeId** | **kotlin.Long**| paymentTypeId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putPaymentTypesPaymentTypeIdRequest** | [**PutPaymentTypesPaymentTypeIdRequest**](PutPaymentTypesPaymentTypeIdRequest.md)|  | |

### Return type

[**PutPaymentTypesPaymentTypeIdResponse**](PutPaymentTypesPaymentTypeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

