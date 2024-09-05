# LoanCOBCatchUpApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**executeLoanCOBCatchUp**](LoanCOBCatchUpApi.md#executeLoanCOBCatchUp) | **POST** v1/loans/catch-up | Executes Loan COB Catch Up |
| [**getOldestCOBProcessedLoan**](LoanCOBCatchUpApi.md#getOldestCOBProcessedLoan) | **GET** v1/loans/oldest-cob-closed | Retrieves the oldest COB processed loan |
| [**isCatchUpRunning**](LoanCOBCatchUpApi.md#isCatchUpRunning) | **GET** v1/loans/is-catch-up-running | Retrieves whether Loan COB catch up is running |



Executes Loan COB Catch Up

Executes the Loan COB job on every day from the oldest Loan to the current COB business date

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanCOBCatchUpApi::class.java)

launch(Dispatchers.IO) {
    webService.executeLoanCOBCatchUp()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


Retrieves the oldest COB processed loan

Retrieves the COB business date and the oldest COB processed loan

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanCOBCatchUpApi::class.java)

launch(Dispatchers.IO) {
    val result : GetOldestCOBProcessedLoanResponse = webService.getOldestCOBProcessedLoan()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetOldestCOBProcessedLoanResponse**](GetOldestCOBProcessedLoanResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieves whether Loan COB catch up is running

Retrieves whether Loan COB catch up is running, and the current execution date if it is running.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanCOBCatchUpApi::class.java)

launch(Dispatchers.IO) {
    val result : IsCatchUpRunningResponse = webService.isCatchUpRunning()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**IsCatchUpRunningResponse**](IsCatchUpRunningResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

