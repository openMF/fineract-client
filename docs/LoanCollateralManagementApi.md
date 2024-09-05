# LoanCollateralManagementApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteLoanCollateral**](LoanCollateralManagementApi.md#deleteLoanCollateral) | **DELETE** v1/loan-collateral-management/{id} | Delete Loan Collateral |
| [**getLoanCollateral**](LoanCollateralManagementApi.md#getLoanCollateral) | **GET** v1/loan-collateral-management/{collateralId} | Get Loan Collateral Details |



Delete Loan Collateral

Delete Loan Collateral

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanCollateralManagementApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val id : kotlin.Long = 789 // kotlin.Long | loan collateral id

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.deleteLoanCollateral(loanId, id)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.Long**| loan collateral id | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Loan Collateral Details

Get Loan Collateral Details

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanCollateralManagementApi::class.java)
val collateralId : kotlin.Long = 789 // kotlin.Long | collateralId

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getLoanCollateral(collateralId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **collateralId** | **kotlin.Long**| collateralId | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

