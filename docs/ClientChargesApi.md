# ClientChargesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**applyClientCharge**](ClientChargesApi.md#applyClientCharge) | **POST** v1/clients/{clientId}/charges | Add Client Charge |
| [**deleteClientCharge**](ClientChargesApi.md#deleteClientCharge) | **DELETE** v1/clients/{clientId}/charges/{chargeId} | Delete a Client Charge |
| [**payOrWaiveClientCharge**](ClientChargesApi.md#payOrWaiveClientCharge) | **POST** v1/clients/{clientId}/charges/{chargeId} | Pay a Client Charge | Waive a Client Charge |
| [**retrieveAllClientCharges**](ClientChargesApi.md#retrieveAllClientCharges) | **GET** v1/clients/{clientId}/charges | List Client Charges |
| [**retrieveClientCharge**](ClientChargesApi.md#retrieveClientCharge) | **GET** v1/clients/{clientId}/charges/{chargeId} | Retrieve a Client Charge |
| [**retrieveTemplate4**](ClientChargesApi.md#retrieveTemplate4) | **GET** v1/clients/{clientId}/charges/template |  |



Add Client Charge

 This API associates a Client charge with an implicit Client account Mandatory Fields :  chargeId and dueDate   Optional Fields :  amount

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientChargesApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val postClientsClientIdChargesRequest : PostClientsClientIdChargesRequest =  // PostClientsClientIdChargesRequest | 

launch(Dispatchers.IO) {
    val result : PostClientsClientIdChargesResponse = webService.applyClientCharge(clientId, postClientsClientIdChargesRequest)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postClientsClientIdChargesRequest** | [**PostClientsClientIdChargesRequest**](PostClientsClientIdChargesRequest.md)|  | |

### Return type

[**PostClientsClientIdChargesResponse**](PostClientsClientIdChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Client Charge

Deletes a Client Charge on which no transactions have taken place (either payments or waivers). 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientChargesApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val chargeId : kotlin.Long = 789 // kotlin.Long | chargeId

launch(Dispatchers.IO) {
    val result : DeleteClientsClientIdChargesChargeIdResponse = webService.deleteClientCharge(clientId, chargeId)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chargeId** | **kotlin.Long**| chargeId | |

### Return type

[**DeleteClientsClientIdChargesChargeIdResponse**](DeleteClientsClientIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Pay a Client Charge | Waive a Client Charge

Pay a Client Charge:  Mandatory Fields:transactionDate and amount \&quot;Pay either a part of or the entire due amount for a charge.(command&#x3D;paycharge)  Waive a Client Charge:   This API provides the facility of waiving off the remaining amount on a client charge (command&#x3D;waive)  Showing request/response for &#39;Pay a Client Charge&#39;

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientChargesApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val chargeId : kotlin.Long = 789 // kotlin.Long | chargeId
val postClientsClientIdChargesChargeIdRequest : PostClientsClientIdChargesChargeIdRequest =  // PostClientsClientIdChargesChargeIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostClientsClientIdChargesChargeIdResponse = webService.payOrWaiveClientCharge(clientId, chargeId, postClientsClientIdChargesChargeIdRequest, command)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| **chargeId** | **kotlin.Long**| chargeId | |
| **postClientsClientIdChargesChargeIdRequest** | [**PostClientsClientIdChargesChargeIdRequest**](PostClientsClientIdChargesChargeIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostClientsClientIdChargesChargeIdResponse**](PostClientsClientIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List Client Charges

The list capability of client charges supports pagination.Example Requests: clients/1/charges  clients/1/charges?offset&#x3D;0&amp;limit&#x3D;5

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientChargesApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val chargeStatus : kotlin.String = chargeStatus_example // kotlin.String | chargeStatus
val pendingPayment : kotlin.Boolean = true // kotlin.Boolean | pendingPayment
val limit : kotlin.Int = 56 // kotlin.Int | limit
val offset : kotlin.Int = 56 // kotlin.Int | offset

launch(Dispatchers.IO) {
    val result : GetClientsClientIdChargesResponse = webService.retrieveAllClientCharges(clientId, chargeStatus, pendingPayment, limit, offset)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| **chargeStatus** | **kotlin.String**| chargeStatus | [optional] [default to &quot;all&quot;] |
| **pendingPayment** | **kotlin.Boolean**| pendingPayment | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **offset** | **kotlin.Int**| offset | [optional] |

### Return type

[**GetClientsClientIdChargesResponse**](GetClientsClientIdChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Client Charge

Example Requests: clients/1/charges/1   clients/1/charges/1?fields&#x3D;name,id

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ClientChargesApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val chargeId : kotlin.Long = 789 // kotlin.Long | chargeId

launch(Dispatchers.IO) {
    val result : GetClientsChargesPageItems = webService.retrieveClientCharge(clientId, chargeId)
}
```

### Parameters
| **clientId** | **kotlin.Long**| clientId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **chargeId** | **kotlin.Long**| chargeId | |

### Return type

[**GetClientsChargesPageItems**](GetClientsChargesPageItems.md)

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
val webService = apiClient.createWebservice(ClientChargesApi::class.java)
val clientId : kotlin.Long = 789 // kotlin.Long | clientId

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveTemplate4(clientId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clientId** | **kotlin.Long**| clientId | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

