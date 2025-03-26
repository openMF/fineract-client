# LoanCollateralApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createCollateral**](LoanCollateralApi.md#createCollateral) | **POST** v1/loans/{loanId}/collaterals | Create a Collateral |
| [**deleteCollateral**](LoanCollateralApi.md#deleteCollateral) | **DELETE** v1/loans/{loanId}/collaterals/{collateralId} | Remove a Collateral |
| [**newCollateralTemplate**](LoanCollateralApi.md#newCollateralTemplate) | **GET** v1/loans/{loanId}/collaterals/template | Retrieve Collateral Details Template |
| [**retrieveCollateralDetails**](LoanCollateralApi.md#retrieveCollateralDetails) | **GET** v1/loans/{loanId}/collaterals | List Loan Collaterals |
| [**retrieveCollateralDetails1**](LoanCollateralApi.md#retrieveCollateralDetails1) | **GET** v1/loans/{loanId}/collaterals/{collateralId} | Retrieve a Collateral |
| [**updateCollateral**](LoanCollateralApi.md#updateCollateral) | **PUT** v1/loans/{loanId}/collaterals/{collateralId} | Update a Collateral |



Create a Collateral

Note: Currently, Collaterals may be added only before a Loan is approved

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanCollateralApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val postLoansLoanIdCollateralsRequest : PostLoansLoanIdCollateralsRequest =  // PostLoansLoanIdCollateralsRequest | 

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdCollateralsResponse = webService.createCollateral(loanId, postLoansLoanIdCollateralsRequest)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postLoansLoanIdCollateralsRequest** | [**PostLoansLoanIdCollateralsRequest**](PostLoansLoanIdCollateralsRequest.md)|  | |

### Return type

[**PostLoansLoanIdCollateralsResponse**](PostLoansLoanIdCollateralsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Remove a Collateral

Note: A collateral can only be removed from Loans that are not yet approved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanCollateralApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val collateralId : kotlin.Long = 789 // kotlin.Long | collateralId

launch(Dispatchers.IO) {
    val result : DeleteLoansLoanIdCollateralsCollateralIdResponse = webService.deleteCollateral(loanId, collateralId)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **collateralId** | **kotlin.Long**| collateralId | |

### Return type

[**DeleteLoansLoanIdCollateralsCollateralIdResponse**](DeleteLoansLoanIdCollateralsCollateralIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Collateral Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/collaterals/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanCollateralApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdCollateralsTemplateResponse = webService.newCollateralTemplate(loanId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**| loanId | |

### Return type

[**GetLoansLoanIdCollateralsTemplateResponse**](GetLoansLoanIdCollateralsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Loan Collaterals

Example Requests:  loans/1/collaterals   loans/1/collaterals?fields&#x3D;value,description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanCollateralApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetLoansLoanIdCollateralsResponse> = webService.retrieveCollateralDetails(loanId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**| loanId | |

### Return type

[**kotlin.collections.List&lt;GetLoansLoanIdCollateralsResponse&gt;**](GetLoansLoanIdCollateralsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Collateral

Example Requests:  /loans/1/collaterals/1   /loans/1/collaterals/1?fields&#x3D;description,description

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanCollateralApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val collateralId : kotlin.Long = 789 // kotlin.Long | collateralId

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdCollateralsResponse = webService.retrieveCollateralDetails1(loanId, collateralId)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **collateralId** | **kotlin.Long**| collateralId | |

### Return type

[**GetLoansLoanIdCollateralsResponse**](GetLoansLoanIdCollateralsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Collateral

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanCollateralApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val collateralId : kotlin.Long = 789 // kotlin.Long | collateralId
val putLoansLoandIdCollateralsCollateralIdRequest : PutLoansLoandIdCollateralsCollateralIdRequest =  // PutLoansLoandIdCollateralsCollateralIdRequest | 

launch(Dispatchers.IO) {
    val result : PutLoansLoanIdCollateralsCollateralIdResponse = webService.updateCollateral(loanId, collateralId, putLoansLoandIdCollateralsCollateralIdRequest)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **collateralId** | **kotlin.Long**| collateralId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putLoansLoandIdCollateralsCollateralIdRequest** | [**PutLoansLoandIdCollateralsCollateralIdRequest**](PutLoansLoandIdCollateralsCollateralIdRequest.md)|  | |

### Return type

[**PutLoansLoanIdCollateralsCollateralIdResponse**](PutLoansLoanIdCollateralsCollateralIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

