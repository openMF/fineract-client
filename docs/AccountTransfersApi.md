# AccountTransfersApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create4**](AccountTransfersApi.md#create4) | **POST** v1/accounttransfers | Create new Transfer |
| [**retrieveAll18**](AccountTransfersApi.md#retrieveAll18) | **GET** v1/accounttransfers | List account transfers |
| [**retrieveOne9**](AccountTransfersApi.md#retrieveOne9) | **GET** v1/accounttransfers/{transferId} | Retrieve account transfer |
| [**template5**](AccountTransfersApi.md#template5) | **GET** v1/accounttransfers/template | Retrieve Account Transfer Template |
| [**templateRefundByTransfer**](AccountTransfersApi.md#templateRefundByTransfer) | **GET** v1/accounttransfers/templateRefundByTransfer | Retrieve Refund of an Active Loan by Transfer Template |
| [**templateRefundByTransferPost**](AccountTransfersApi.md#templateRefundByTransferPost) | **POST** v1/accounttransfers/refundByTransfer | Refund of an Active Loan by Transfer |



Create new Transfer

Ability to create new transfer of monetary funds from one account to another.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountTransfersApi::class.java)
val postAccountTransfersRequest : PostAccountTransfersRequest =  // PostAccountTransfersRequest | 

launch(Dispatchers.IO) {
    val result : PostAccountTransfersResponse = webService.create4(postAccountTransfersRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postAccountTransfersRequest** | [**PostAccountTransfersRequest**](PostAccountTransfersRequest.md)|  | |

### Return type

[**PostAccountTransfersResponse**](PostAccountTransfersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List account transfers

Lists account&#39;s transfers  Example Requests:    accounttransfers

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountTransfersApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = limit // kotlin.Int | 
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
val accountDetailId : kotlin.Long = 789 // kotlin.Long | accountDetailId

launch(Dispatchers.IO) {
    val result : GetAccountTransfersResponse = webService.retrieveAll18(externalId, offset, limit, orderBy, sortOrder, accountDetailId)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**|  | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountDetailId** | **kotlin.Long**| accountDetailId | [optional] |

### Return type

[**GetAccountTransfersResponse**](GetAccountTransfersResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve account transfer

Retrieves account transfer  Example Requests :    accounttransfers/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountTransfersApi::class.java)
val transferId : kotlin.Long = 789 // kotlin.Long | transferId

launch(Dispatchers.IO) {
    val result : GetAccountTransfersPageItems = webService.retrieveOne9(transferId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transferId** | **kotlin.Long**| transferId | |

### Return type

[**GetAccountTransfersPageItems**](GetAccountTransfersPageItems.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Account Transfer Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:    Field Defaults  Allowed Value Lists  Example Requests:    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1    accounttransfers/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1    accounttransfers/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountTransfersApi::class.java)
val fromOfficeId : kotlin.Long = 789 // kotlin.Long | fromOfficeId
val fromClientId : kotlin.Long = 789 // kotlin.Long | fromClientId
val fromAccountId : kotlin.Long = 789 // kotlin.Long | fromAccountId
val fromAccountType : kotlin.Int = 56 // kotlin.Int | fromAccountType
val toOfficeId : kotlin.Long = 789 // kotlin.Long | toOfficeId
val toClientId : kotlin.Long = 789 // kotlin.Long | toClientId
val toAccountId : kotlin.Long = 789 // kotlin.Long | toAccountId
val toAccountType : kotlin.Int = 56 // kotlin.Int | toAccountType

launch(Dispatchers.IO) {
    val result : GetAccountTransfersTemplateResponse = webService.template5(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType)
}
```

### Parameters
| **fromOfficeId** | **kotlin.Long**| fromOfficeId | [optional] |
| **fromClientId** | **kotlin.Long**| fromClientId | [optional] |
| **fromAccountId** | **kotlin.Long**| fromAccountId | [optional] |
| **fromAccountType** | **kotlin.Int**| fromAccountType | [optional] |
| **toOfficeId** | **kotlin.Long**| toOfficeId | [optional] |
| **toClientId** | **kotlin.Long**| toClientId | [optional] |
| **toAccountId** | **kotlin.Long**| toAccountId | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **toAccountType** | **kotlin.Int**| toAccountType | [optional] |

### Return type

[**GetAccountTransfersTemplateResponse**](GetAccountTransfersTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Refund of an Active Loan by Transfer Template

Retrieves Refund of an Active Loan by Transfer TemplateExample Requests :    accounttransfers/templateRefundByTransfer?fromAccountId&#x3D;2&amp;fromAccountType&#x3D;1&amp; toAccountId&#x3D;1&amp;toAccountType&#x3D;2&amp;toClientId&#x3D;1&amp;toOfficeId&#x3D;1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountTransfersApi::class.java)
val fromOfficeId : kotlin.Long = 789 // kotlin.Long | fromOfficeId
val fromClientId : kotlin.Long = 789 // kotlin.Long | fromClientId
val fromAccountId : kotlin.Long = 789 // kotlin.Long | fromAccountId
val fromAccountType : kotlin.Int = 56 // kotlin.Int | fromAccountType
val toOfficeId : kotlin.Long = 789 // kotlin.Long | toOfficeId
val toClientId : kotlin.Long = 789 // kotlin.Long | toClientId
val toAccountId : kotlin.Long = 789 // kotlin.Long | toAccountId
val toAccountType : kotlin.Int = 56 // kotlin.Int | toAccountType

launch(Dispatchers.IO) {
    val result : GetAccountTransfersTemplateRefundByTransferResponse = webService.templateRefundByTransfer(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType)
}
```

### Parameters
| **fromOfficeId** | **kotlin.Long**| fromOfficeId | [optional] |
| **fromClientId** | **kotlin.Long**| fromClientId | [optional] |
| **fromAccountId** | **kotlin.Long**| fromAccountId | [optional] |
| **fromAccountType** | **kotlin.Int**| fromAccountType | [optional] |
| **toOfficeId** | **kotlin.Long**| toOfficeId | [optional] |
| **toClientId** | **kotlin.Long**| toClientId | [optional] |
| **toAccountId** | **kotlin.Long**| toAccountId | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **toAccountType** | **kotlin.Int**| toAccountType | [optional] |

### Return type

[**GetAccountTransfersTemplateRefundByTransferResponse**](GetAccountTransfersTemplateRefundByTransferResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Refund of an Active Loan by Transfer

Ability to refund an active loan by transferring to a savings account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountTransfersApi::class.java)
val postAccountTransfersRefundByTransferRequest : PostAccountTransfersRefundByTransferRequest =  // PostAccountTransfersRefundByTransferRequest | 

launch(Dispatchers.IO) {
    val result : PostAccountTransfersRefundByTransferResponse = webService.templateRefundByTransferPost(postAccountTransfersRefundByTransferRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postAccountTransfersRefundByTransferRequest** | [**PostAccountTransfersRefundByTransferRequest**](PostAccountTransfersRefundByTransferRequest.md)|  | |

### Return type

[**PostAccountTransfersRefundByTransferResponse**](PostAccountTransfersRefundByTransferResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

