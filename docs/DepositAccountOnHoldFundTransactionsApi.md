# DepositAccountOnHoldFundTransactionsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**retrieveAll28**](DepositAccountOnHoldFundTransactionsApi.md#retrieveAll28) | **GET** v1/savingsaccounts/{savingsId}/onholdtransactions |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(DepositAccountOnHoldFundTransactionsApi::class.java)
val savingsId : kotlin.Long = 789 // kotlin.Long | 
val guarantorFundingId : kotlin.Long = 789 // kotlin.Long | 
val offset : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val orderBy : kotlin.String = orderBy_example // kotlin.String | 
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveAll28(savingsId, guarantorFundingId, offset, limit, orderBy, sortOrder)
}
```

### Parameters
| **savingsId** | **kotlin.Long**|  | |
| **guarantorFundingId** | **kotlin.Long**|  | [optional] |
| **offset** | **kotlin.Int**|  | [optional] |
| **limit** | **kotlin.Int**|  | [optional] |
| **orderBy** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

