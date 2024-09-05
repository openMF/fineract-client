# ExternalAssetOwnersApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getActiveTransfer**](ExternalAssetOwnersApi.md#getActiveTransfer) | **GET** v1/external-asset-owners/transfers/active-transfer | Retrieve Active Asset Owner Transfer |
| [**getJournalEntriesOfOwner**](ExternalAssetOwnersApi.md#getJournalEntriesOfOwner) | **GET** v1/external-asset-owners/owners/external-id/{ownerExternalId}/journal-entries | Retrieve Journal Entries of Owner |
| [**getJournalEntriesOfTransfer**](ExternalAssetOwnersApi.md#getJournalEntriesOfTransfer) | **GET** v1/external-asset-owners/transfers/{transferId}/journal-entries | Retrieve Journal Entries of Transfer |
| [**getTransfers**](ExternalAssetOwnersApi.md#getTransfers) | **GET** v1/external-asset-owners/transfers | Retrieve External Asset Owner Transfers |
| [**searchInvestorData**](ExternalAssetOwnersApi.md#searchInvestorData) | **POST** v1/external-asset-owners/search | Search External Asset Owner Transfers by text or date ranges to settlement or effective dates |
| [**transferRequestWithId**](ExternalAssetOwnersApi.md#transferRequestWithId) | **POST** v1/external-asset-owners/transfers/{id} |  |
| [**transferRequestWithId1**](ExternalAssetOwnersApi.md#transferRequestWithId1) | **POST** v1/external-asset-owners/transfers/external-id/{externalId} |  |
| [**transferRequestWithLoanExternalId**](ExternalAssetOwnersApi.md#transferRequestWithLoanExternalId) | **POST** v1/external-asset-owners/transfers/loans/external-id/{loanExternalId} |  |
| [**transferRequestWithLoanId**](ExternalAssetOwnersApi.md#transferRequestWithLoanId) | **POST** v1/external-asset-owners/transfers/loans/{loanId} |  |



Retrieve Active Asset Owner Transfer

Retrieve Active External Asset Owner Transfer by transferExternalId, loanId or loanExternalId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ExternalAssetOwnersApi::class.java)
val transferExternalId : kotlin.String = transferExternalId_example // kotlin.String | transferExternalId
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId

launch(Dispatchers.IO) {
    val result : ExternalTransferData = webService.getActiveTransfer(transferExternalId, loanId, loanExternalId)
}
```

### Parameters
| **transferExternalId** | **kotlin.String**| transferExternalId | [optional] |
| **loanId** | **kotlin.Long**| loanId | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanExternalId** | **kotlin.String**| loanExternalId | [optional] |

### Return type

[**ExternalTransferData**](ExternalTransferData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Journal Entries of Owner

Retrieve Journal entries of owner by owner externalId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ExternalAssetOwnersApi::class.java)
val ownerExternalId : kotlin.String = ownerExternalId_example // kotlin.String | ownerExternalId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit

launch(Dispatchers.IO) {
    val result : ExternalOwnerJournalEntryData = webService.getJournalEntriesOfOwner(ownerExternalId, offset, limit)
}
```

### Parameters
| **ownerExternalId** | **kotlin.String**| ownerExternalId | |
| **offset** | **kotlin.Int**| offset | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| limit | [optional] |

### Return type

[**ExternalOwnerJournalEntryData**](ExternalOwnerJournalEntryData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Journal Entries of Transfer

Retrieve Journal entries of transfer by transferId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ExternalAssetOwnersApi::class.java)
val transferId : kotlin.Long = 789 // kotlin.Long | transferId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit

launch(Dispatchers.IO) {
    val result : ExternalOwnerTransferJournalEntryData = webService.getJournalEntriesOfTransfer(transferId, offset, limit)
}
```

### Parameters
| **transferId** | **kotlin.Long**| transferId | |
| **offset** | **kotlin.Int**| offset | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| limit | [optional] |

### Return type

[**ExternalOwnerTransferJournalEntryData**](ExternalOwnerTransferJournalEntryData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve External Asset Owner Transfers

Retrieve External Asset Owner Transfer items by transferExternalId, loanId or loanExternalId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ExternalAssetOwnersApi::class.java)
val transferExternalId : kotlin.String = transferExternalId_example // kotlin.String | transferExternalId
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | loanExternalId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit

launch(Dispatchers.IO) {
    val result : PageExternalTransferData = webService.getTransfers(transferExternalId, loanId, loanExternalId, offset, limit)
}
```

### Parameters
| **transferExternalId** | **kotlin.String**| transferExternalId | [optional] |
| **loanId** | **kotlin.Long**| loanId | [optional] |
| **loanExternalId** | **kotlin.String**| loanExternalId | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| limit | [optional] |

### Return type

[**PageExternalTransferData**](PageExternalTransferData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Search External Asset Owner Transfers by text or date ranges to settlement or effective dates

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ExternalAssetOwnersApi::class.java)
val pagedRequestExternalAssetOwnerSearchRequest : PagedRequestExternalAssetOwnerSearchRequest =  // PagedRequestExternalAssetOwnerSearchRequest | 

launch(Dispatchers.IO) {
    val result : PageExternalTransferData = webService.searchInvestorData(pagedRequestExternalAssetOwnerSearchRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **pagedRequestExternalAssetOwnerSearchRequest** | [**PagedRequestExternalAssetOwnerSearchRequest**](PagedRequestExternalAssetOwnerSearchRequest.md)|  | [optional] |

### Return type

[**PageExternalTransferData**](PageExternalTransferData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ExternalAssetOwnersApi::class.java)
val id : kotlin.Long = 789 // kotlin.Long | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostInitiateTransferResponse = webService.transferRequestWithId(id, command)
}
```

### Parameters
| **id** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostInitiateTransferResponse**](PostInitiateTransferResponse.md)

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
val webService = apiClient.createWebservice(ExternalAssetOwnersApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostInitiateTransferResponse = webService.transferRequestWithId1(externalId, command)
}
```

### Parameters
| **externalId** | **kotlin.String**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostInitiateTransferResponse**](PostInitiateTransferResponse.md)

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
val webService = apiClient.createWebservice(ExternalAssetOwnersApi::class.java)
val loanExternalId : kotlin.String = loanExternalId_example // kotlin.String | 
val postInitiateTransferRequest : PostInitiateTransferRequest =  // PostInitiateTransferRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostInitiateTransferResponse = webService.transferRequestWithLoanExternalId(loanExternalId, postInitiateTransferRequest, command)
}
```

### Parameters
| **loanExternalId** | **kotlin.String**|  | |
| **postInitiateTransferRequest** | [**PostInitiateTransferRequest**](PostInitiateTransferRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostInitiateTransferResponse**](PostInitiateTransferResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ExternalAssetOwnersApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | 
val postInitiateTransferRequest : PostInitiateTransferRequest =  // PostInitiateTransferRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostInitiateTransferResponse = webService.transferRequestWithLoanId(loanId, postInitiateTransferRequest, command)
}
```

### Parameters
| **loanId** | **kotlin.Long**|  | |
| **postInitiateTransferRequest** | [**PostInitiateTransferRequest**](PostInitiateTransferRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostInitiateTransferResponse**](PostInitiateTransferResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

