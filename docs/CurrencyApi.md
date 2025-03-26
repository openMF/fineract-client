# CurrencyApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveCurrencies**](CurrencyApi.md#retrieveCurrencies) | **GET** v1/currencies | Retrieve Currency Configuration |
| [**updateCurrencies**](CurrencyApi.md#updateCurrencies) | **PUT** v1/currencies | Update Currency Configuration |



Retrieve Currency Configuration

Returns the list of currencies permitted for use AND the list of currencies not selected (but available for selection).  Example Requests:  currencies   currencies?fields&#x3D;selectedCurrencyOptions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CurrencyApi::class.java)

launch(Dispatchers.IO) {
    val result : GetCurrenciesResponse = webService.retrieveCurrencies()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetCurrenciesResponse**](GetCurrenciesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update Currency Configuration

Updates the list of currencies permitted for use.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CurrencyApi::class.java)
val putCurrenciesRequest : PutCurrenciesRequest =  // PutCurrenciesRequest | 

launch(Dispatchers.IO) {
    val result : PutCurrenciesResponse = webService.updateCurrencies(putCurrenciesRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putCurrenciesRequest** | [**PutCurrenciesRequest**](PutCurrenciesRequest.md)|  | |

### Return type

[**PutCurrenciesResponse**](PutCurrenciesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

