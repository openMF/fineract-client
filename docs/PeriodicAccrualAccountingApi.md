# PeriodicAccrualAccountingApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**executePeriodicAccrualAccounting**](PeriodicAccrualAccountingApi.md#executePeriodicAccrualAccounting) | **POST** v1/runaccruals | Executes Periodic Accrual Accounting |



Executes Periodic Accrual Accounting

Mandatory Fields  tillDate 

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(PeriodicAccrualAccountingApi::class.java)
val postRunaccrualsRequest : PostRunaccrualsRequest =  // PostRunaccrualsRequest | 

launch(Dispatchers.IO) {
    webService.executePeriodicAccrualAccounting(postRunaccrualsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postRunaccrualsRequest** | [**PostRunaccrualsRequest**](PostRunaccrualsRequest.md)|  | |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

