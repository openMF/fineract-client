# LoanChargesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteLoanCharge**](LoanChargesApi.md#deleteLoanCharge) | **DELETE** v1/loans/{loanId}/charges/{loanChargeId} | Delete a Loan Charge |
| [**deleteLoanCharge1**](LoanChargesApi.md#deleteLoanCharge1) | **DELETE** v1/loans/{loanId}/charges/external-id/{loanChargeExternalId} | Delete a Loan Charge |
| [**deleteLoanCharge2**](LoanChargesApi.md#deleteLoanCharge2) | **DELETE** v1/loans/external-id/{loanExternalId}/charges/{loanChargeId} | Delete a Loan Charge |
| [**deleteLoanCharge3**](LoanChargesApi.md#deleteLoanCharge3) | **DELETE** v1/loans/external-id/{loanExternalId}/charges/external-id/{loanChargeExternalId} | Delete a Loan Charge |
| [**executeLoanCharge**](LoanChargesApi.md#executeLoanCharge) | **POST** v1/loans/{loanId}/charges | Create a Loan Charge (no command provided) or Pay a charge (command&#x3D;pay) |
| [**executeLoanCharge1**](LoanChargesApi.md#executeLoanCharge1) | **POST** v1/loans/external-id/{loanExternalId}/charges | Create a Loan Charge (no command provided) or Pay a charge (command&#x3D;pay) |
| [**executeLoanCharge2**](LoanChargesApi.md#executeLoanCharge2) | **POST** v1/loans/{loanId}/charges/{loanChargeId} | Pay / Waive / Adjustment for Loan Charge |
| [**executeLoanCharge3**](LoanChargesApi.md#executeLoanCharge3) | **POST** v1/loans/{loanId}/charges/external-id/{loanChargeExternalId} | Pay / Waive / Adjustment for Loan Charge |
| [**executeLoanCharge4**](LoanChargesApi.md#executeLoanCharge4) | **POST** v1/loans/external-id/{loanExternalId}/charges/{loanChargeId} | Pay / Waive / Adjustment for Loan Charge |
| [**executeLoanCharge5**](LoanChargesApi.md#executeLoanCharge5) | **POST** v1/loans/external-id/{loanExternalId}/charges/external-id/{loanChargeExternalId} | Pay / Waive / Adjustment for Loan Charge |
| [**retrieveAllLoanCharges**](LoanChargesApi.md#retrieveAllLoanCharges) | **GET** v1/loans/{loanId}/charges | List Loan Charges |
| [**retrieveAllLoanCharges1**](LoanChargesApi.md#retrieveAllLoanCharges1) | **GET** v1/loans/external-id/{loanExternalId}/charges | List Loan Charges |
| [**retrieveLoanCharge**](LoanChargesApi.md#retrieveLoanCharge) | **GET** v1/loans/{loanId}/charges/{loanChargeId} | Retrieve a Loan Charge |
| [**retrieveLoanCharge1**](LoanChargesApi.md#retrieveLoanCharge1) | **GET** v1/loans/{loanId}/charges/external-id/{loanChargeExternalId} | Retrieve a Loan Charge |
| [**retrieveLoanCharge2**](LoanChargesApi.md#retrieveLoanCharge2) | **GET** v1/loans/external-id/{loanExternalId}/charges/{loanChargeId} | Retrieve a Loan Charge |
| [**retrieveLoanCharge3**](LoanChargesApi.md#retrieveLoanCharge3) | **GET** v1/loans/external-id/{loanExternalId}/charges/external-id/{loanChargeExternalId} | Retrieve a Loan Charge |
| [**retrieveTemplate8**](LoanChargesApi.md#retrieveTemplate8) | **GET** v1/loans/{loanId}/charges/template | Retrieve Loan Charges Template |
| [**retrieveTemplate9**](LoanChargesApi.md#retrieveTemplate9) | **GET** v1/loans/external-id/{loanExternalId}/charges/template | Retrieve Loan Charges Template |
| [**updateLoanCharge**](LoanChargesApi.md#updateLoanCharge) | **PUT** v1/loans/{loanId}/charges/{loanChargeId} | Update a Loan Charge |
| [**updateLoanCharge1**](LoanChargesApi.md#updateLoanCharge1) | **PUT** v1/loans/{loanId}/charges/external-id/{loanChargeExternalId} | Update a Loan Charge |
| [**updateLoanCharge2**](LoanChargesApi.md#updateLoanCharge2) | **PUT** v1/loans/external-id/{loanExternalId}/charges/{loanChargeId} | Update a Loan Charge |
| [**updateLoanCharge3**](LoanChargesApi.md#updateLoanCharge3) | **PUT** v1/loans/external-id/{loanExternalId}/charges/external-id/{loanChargeExternalId} | Update a Loan Charge |



Delete a Loan Charge

Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val loanChargeId : kotlin.Long = 789 // kotlin.Long | loanChargeId

launch(Dispatchers.IO) {
    val result : DeleteLoansLoanIdChargesChargeIdResponse = webService.deleteLoanCharge(loanId, loanChargeId)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanChargeId** | **kotlin.Long**| loanChargeId | |

### Return type

[**DeleteLoansLoanIdChargesChargeIdResponse**](DeleteLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete a Loan Charge

Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val loanChargeExternalId : kotlin.String = loanChargeExternalId_example // kotlin.String | loanChargeExternalId

launch(Dispatchers.IO) {
    val result : DeleteLoansLoanIdChargesChargeIdResponse = webService.deleteLoanCharge1(loanId, loanChargeExternalId)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanChargeExternalId** | **kotlin.String**| loanChargeExternalId | |

### Return type

[**DeleteLoansLoanIdChargesChargeIdResponse**](DeleteLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete a Loan Charge

Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val loanChargeId : kotlin.Long = 789 // kotlin.Long | loanChargeId

launch(Dispatchers.IO) {
    val result : DeleteLoansLoanIdChargesChargeIdResponse = webService.deleteLoanCharge2(loanExternalId, loanChargeId)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanChargeId** | **kotlin.Long**| loanChargeId | |

### Return type

[**DeleteLoansLoanIdChargesChargeIdResponse**](DeleteLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Delete a Loan Charge

Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val loanChargeExternalId : kotlin.String = loanChargeExternalId_example // kotlin.String | loanChargeExternalId

launch(Dispatchers.IO) {
    val result : DeleteLoansLoanIdChargesChargeIdResponse = webService.deleteLoanCharge3(loanExternalId, loanChargeExternalId)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanChargeExternalId** | **kotlin.String**| loanChargeExternalId | |

### Return type

[**DeleteLoansLoanIdChargesChargeIdResponse**](DeleteLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Create a Loan Charge (no command provided) or Pay a charge (command&#x3D;pay)

Creates a Loan Charge | Pay a Loan Charge

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val postLoansLoanIdChargesRequest : PostLoansLoanIdChargesRequest =  // PostLoansLoanIdChargesRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdChargesResponse = webService.executeLoanCharge(loanId, postLoansLoanIdChargesRequest, command)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **postLoansLoanIdChargesRequest** | [**PostLoansLoanIdChargesRequest**](PostLoansLoanIdChargesRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdChargesResponse**](PostLoansLoanIdChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Create a Loan Charge (no command provided) or Pay a charge (command&#x3D;pay)

Creates a Loan Charge | Pay a Loan Charge

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val postLoansLoanIdChargesRequest : PostLoansLoanIdChargesRequest =  // PostLoansLoanIdChargesRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdChargesResponse = webService.executeLoanCharge1(loanExternalId, postLoansLoanIdChargesRequest, command)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **postLoansLoanIdChargesRequest** | [**PostLoansLoanIdChargesRequest**](PostLoansLoanIdChargesRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdChargesResponse**](PostLoansLoanIdChargesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Pay / Waive / Adjustment for Loan Charge

Loan Charge will be paid if the loan is linked with a savings account | Waive Loan Charge | Add Charge Adjustment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val loanChargeId : kotlin.Long = 789 // kotlin.Long | loanChargeId
val postLoansLoanIdChargesChargeIdRequest : PostLoansLoanIdChargesChargeIdRequest =  // PostLoansLoanIdChargesChargeIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdChargesChargeIdResponse = webService.executeLoanCharge2(loanId, loanChargeId, postLoansLoanIdChargesChargeIdRequest, command)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **loanChargeId** | **kotlin.Long**| loanChargeId | |
| **postLoansLoanIdChargesChargeIdRequest** | [**PostLoansLoanIdChargesChargeIdRequest**](PostLoansLoanIdChargesChargeIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdChargesChargeIdResponse**](PostLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Pay / Waive / Adjustment for Loan Charge

Loan Charge will be paid if the loan is linked with a savings account | Waive Loan Charge | Add Charge Adjustment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val loanChargeExternalId : kotlin.String = loanChargeExternalId_example // kotlin.String | loanChargeExternalId
val postLoansLoanIdChargesChargeIdRequest : PostLoansLoanIdChargesChargeIdRequest =  // PostLoansLoanIdChargesChargeIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdChargesChargeIdResponse = webService.executeLoanCharge3(loanId, loanChargeExternalId, postLoansLoanIdChargesChargeIdRequest, command)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **loanChargeExternalId** | **kotlin.String**| loanChargeExternalId | |
| **postLoansLoanIdChargesChargeIdRequest** | [**PostLoansLoanIdChargesChargeIdRequest**](PostLoansLoanIdChargesChargeIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdChargesChargeIdResponse**](PostLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Pay / Waive / Adjustment for Loan Charge

Loan Charge will be paid if the loan is linked with a savings account | Waive Loan Charge | Add Charge Adjustment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val loanChargeId : kotlin.Long = 789 // kotlin.Long | loanChargeId
val postLoansLoanIdChargesChargeIdRequest : PostLoansLoanIdChargesChargeIdRequest =  // PostLoansLoanIdChargesChargeIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdChargesChargeIdResponse = webService.executeLoanCharge4(loanExternalId, loanChargeId, postLoansLoanIdChargesChargeIdRequest, command)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **loanChargeId** | **kotlin.Long**| loanChargeId | |
| **postLoansLoanIdChargesChargeIdRequest** | [**PostLoansLoanIdChargesChargeIdRequest**](PostLoansLoanIdChargesChargeIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdChargesChargeIdResponse**](PostLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Pay / Waive / Adjustment for Loan Charge

Loan Charge will be paid if the loan is linked with a savings account | Waive Loan Charge | Add Charge Adjustment

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val loanChargeExternalId : kotlin.String = loanChargeExternalId_example // kotlin.String | loanChargeExternalId
val postLoansLoanIdChargesChargeIdRequest : PostLoansLoanIdChargesChargeIdRequest =  // PostLoansLoanIdChargesChargeIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostLoansLoanIdChargesChargeIdResponse = webService.executeLoanCharge5(loanExternalId, loanChargeExternalId, postLoansLoanIdChargesChargeIdRequest, command)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **loanChargeExternalId** | **kotlin.String**| loanChargeExternalId | |
| **postLoansLoanIdChargesChargeIdRequest** | [**PostLoansLoanIdChargesChargeIdRequest**](PostLoansLoanIdChargesChargeIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostLoansLoanIdChargesChargeIdResponse**](PostLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List Loan Charges

It lists all the Loan Charges specific to a Loan   Example Requests:  loans/1/charges   loans/1/charges?fields&#x3D;name,amountOrPercentage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetLoansLoanIdChargesChargeIdResponse> = webService.retrieveAllLoanCharges(loanId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**| loanId | |

### Return type

[**kotlin.collections.List&lt;GetLoansLoanIdChargesChargeIdResponse&gt;**](GetLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Loan Charges

It lists all the Loan Charges specific to a Loan   Example Requests:  loans/1/charges   loans/1/charges?fields&#x3D;name,amountOrPercentage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetLoansLoanIdChargesChargeIdResponse> = webService.retrieveAllLoanCharges1(loanExternalId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanExternalId** | **kotlin.String**| loanExternalId | |

### Return type

[**kotlin.collections.List&lt;GetLoansLoanIdChargesChargeIdResponse&gt;**](GetLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Loan Charge

Retrieves Loan Charge according to the Loan ID and Loan Charge IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val loanChargeId : kotlin.Long = 789 // kotlin.Long | loanChargeId

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdChargesChargeIdResponse = webService.retrieveLoanCharge(loanId, loanChargeId)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanChargeId** | **kotlin.Long**| loanChargeId | |

### Return type

[**GetLoansLoanIdChargesChargeIdResponse**](GetLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Loan Charge

Retrieves Loan Charge according to the Loan ID and Loan Charge External IDExample Requests:  /loans/1/charges/1   /loans/1/charges/external-id/1?fields&#x3D;name,amountOrPercentage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val loanChargeExternalId : kotlin.String = loanChargeExternalId_example // kotlin.String | loanChargeExternalId

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdChargesChargeIdResponse = webService.retrieveLoanCharge1(loanId, loanChargeExternalId)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanChargeExternalId** | **kotlin.String**| loanChargeExternalId | |

### Return type

[**GetLoansLoanIdChargesChargeIdResponse**](GetLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Loan Charge

Retrieves Loan Charge according to the Loan external ID and Loan Charge IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val loanChargeId : kotlin.Long = 789 // kotlin.Long | loanChargeId

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdChargesChargeIdResponse = webService.retrieveLoanCharge2(loanExternalId, loanChargeId)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanChargeId** | **kotlin.Long**| loanChargeId | |

### Return type

[**GetLoansLoanIdChargesChargeIdResponse**](GetLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Loan Charge

Retrieves Loan Charge according to the Loan External ID and Loan Charge External IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val loanChargeExternalId : kotlin.String = loanChargeExternalId_example // kotlin.String | loanChargeExternalId

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdChargesChargeIdResponse = webService.retrieveLoanCharge3(loanExternalId, loanChargeExternalId)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanChargeExternalId** | **kotlin.String**| loanChargeExternalId | |

### Return type

[**GetLoansLoanIdChargesChargeIdResponse**](GetLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Loan Charges Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  loans/1/charges/template  

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdChargesTemplateResponse = webService.retrieveTemplate8(loanId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**| loanId | |

### Return type

[**GetLoansLoanIdChargesTemplateResponse**](GetLoansLoanIdChargesTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Loan Charges Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  loans/1/charges/template  

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId

launch(Dispatchers.IO) {
    val result : GetLoansLoanIdChargesTemplateResponse = webService.retrieveTemplate9(loanExternalId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanExternalId** | **kotlin.String**| loanExternalId | |

### Return type

[**GetLoansLoanIdChargesTemplateResponse**](GetLoansLoanIdChargesTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Loan Charge

Currently Loan Charges may be updated only if the Loan is not yet approved

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val loanChargeId : kotlin.Long = 789 // kotlin.Long | loanChargeId
val putLoansLoanIdChargesChargeIdRequest : PutLoansLoanIdChargesChargeIdRequest =  // PutLoansLoanIdChargesChargeIdRequest | 

launch(Dispatchers.IO) {
    val result : PutLoansLoanIdChargesChargeIdResponse = webService.updateLoanCharge(loanId, loanChargeId, putLoansLoanIdChargesChargeIdRequest)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **loanChargeId** | **kotlin.Long**| loanChargeId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putLoansLoanIdChargesChargeIdRequest** | [**PutLoansLoanIdChargesChargeIdRequest**](PutLoansLoanIdChargesChargeIdRequest.md)|  | |

### Return type

[**PutLoansLoanIdChargesChargeIdResponse**](PutLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update a Loan Charge

Currently Loan Charges may be updated only if the Loan is not yet approved

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val loanChargeExternalId : kotlin.String = loanChargeExternalId_example // kotlin.String | loanChargeExternalId
val putLoansLoanIdChargesChargeIdRequest : PutLoansLoanIdChargesChargeIdRequest =  // PutLoansLoanIdChargesChargeIdRequest | 

launch(Dispatchers.IO) {
    val result : PutLoansLoanIdChargesChargeIdResponse = webService.updateLoanCharge1(loanId, loanChargeExternalId, putLoansLoanIdChargesChargeIdRequest)
}
```

### Parameters
| **loanId** | **kotlin.Long**| loanId | |
| **loanChargeExternalId** | **kotlin.String**| loanChargeExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putLoansLoanIdChargesChargeIdRequest** | [**PutLoansLoanIdChargesChargeIdRequest**](PutLoansLoanIdChargesChargeIdRequest.md)|  | |

### Return type

[**PutLoansLoanIdChargesChargeIdResponse**](PutLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update a Loan Charge

Currently Loan Charges may be updated only if the Loan is not yet approved

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val loanChargeId : kotlin.Long = 789 // kotlin.Long | loanChargeId
val putLoansLoanIdChargesChargeIdRequest : PutLoansLoanIdChargesChargeIdRequest =  // PutLoansLoanIdChargesChargeIdRequest | 

launch(Dispatchers.IO) {
    val result : PutLoansLoanIdChargesChargeIdResponse = webService.updateLoanCharge2(loanExternalId, loanChargeId, putLoansLoanIdChargesChargeIdRequest)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **loanChargeId** | **kotlin.Long**| loanChargeId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putLoansLoanIdChargesChargeIdRequest** | [**PutLoansLoanIdChargesChargeIdRequest**](PutLoansLoanIdChargesChargeIdRequest.md)|  | |

### Return type

[**PutLoansLoanIdChargesChargeIdResponse**](PutLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update a Loan Charge

Currently Loan Charges may be updated only if the Loan is not yet approved

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(LoanChargesApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val loanChargeExternalId : kotlin.String = loanChargeExternalId_example // kotlin.String | loanChargeExternalId
val putLoansLoanIdChargesChargeIdRequest : PutLoansLoanIdChargesChargeIdRequest =  // PutLoansLoanIdChargesChargeIdRequest | 

launch(Dispatchers.IO) {
    val result : PutLoansLoanIdChargesChargeIdResponse = webService.updateLoanCharge3(loanExternalId, loanChargeExternalId, putLoansLoanIdChargesChargeIdRequest)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**| loanExternalId | |
| **loanChargeExternalId** | **kotlin.String**| loanChargeExternalId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putLoansLoanIdChargesChargeIdRequest** | [**PutLoansLoanIdChargesChargeIdRequest**](PutLoansLoanIdChargesChargeIdRequest.md)|  | |

### Return type

[**PutLoansLoanIdChargesChargeIdResponse**](PutLoansLoanIdChargesChargeIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

