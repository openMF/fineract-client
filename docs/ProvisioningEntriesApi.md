# ProvisioningEntriesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createProvisioningEntries**](ProvisioningEntriesApi.md#createProvisioningEntries) | **POST** v1/provisioningentries | Create new Provisioning Entries |
| [**modifyProvisioningEntry**](ProvisioningEntriesApi.md#modifyProvisioningEntry) | **POST** v1/provisioningentries/{entryId} | Recreates Provisioning Entry |
| [**retrieveAllProvisioningEntries**](ProvisioningEntriesApi.md#retrieveAllProvisioningEntries) | **GET** v1/provisioningentries | List all Provisioning Entries |
| [**retrieveProviioningEntries**](ProvisioningEntriesApi.md#retrieveProviioningEntries) | **GET** v1/provisioningentries/entries |  |
| [**retrieveProvisioningEntry**](ProvisioningEntriesApi.md#retrieveProvisioningEntry) | **GET** v1/provisioningentries/{entryId} | Retrieves a Provisioning Entry |



Create new Provisioning Entries

Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProvisioningEntriesApi::class.java)
val postProvisioningEntriesRequest : PostProvisioningEntriesRequest =  // PostProvisioningEntriesRequest | 

launch(Dispatchers.IO) {
    val result : PostProvisioningEntriesResponse = webService.createProvisioningEntries(postProvisioningEntriesRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postProvisioningEntriesRequest** | [**PostProvisioningEntriesRequest**](PostProvisioningEntriesRequest.md)|  | [optional] |

### Return type

[**PostProvisioningEntriesResponse**](PostProvisioningEntriesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Recreates Provisioning Entry

Recreates Provisioning Entry | createjournalentry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProvisioningEntriesApi::class.java)
val entryId : kotlin.Long = 789 // kotlin.Long | entryId
val command : kotlin.String = command_example // kotlin.String | command=createjournalentry command=recreateprovisioningentry
val putProvisioningEntriesRequest : PutProvisioningEntriesRequest =  // PutProvisioningEntriesRequest | 

launch(Dispatchers.IO) {
    val result : PutProvisioningEntriesResponse = webService.modifyProvisioningEntry(entryId, command, putProvisioningEntriesRequest)
}
```

### Parameters
| **entryId** | **kotlin.Long**| entryId | |
| **command** | **kotlin.String**| command&#x3D;createjournalentry command&#x3D;recreateprovisioningentry | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putProvisioningEntriesRequest** | [**PutProvisioningEntriesRequest**](PutProvisioningEntriesRequest.md)|  | [optional] |

### Return type

[**PutProvisioningEntriesResponse**](PutProvisioningEntriesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List all Provisioning Entries

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProvisioningEntriesApi::class.java)
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<ProvisioningEntryData> = webService.retrieveAllProvisioningEntries(offset, limit)
}
```

### Parameters
| **offset** | **kotlin.Int**| offset | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| limit | [optional] |

### Return type

[**kotlin.collections.List&lt;ProvisioningEntryData&gt;**](ProvisioningEntryData.md)

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
val webService = apiClient.createWebservice(ProvisioningEntriesApi::class.java)
val entryId : kotlin.Long = 789 // kotlin.Long | 
val offset : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val officeId : kotlin.Long = 789 // kotlin.Long | 
val productId : kotlin.Long = 789 // kotlin.Long | 
val categoryId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : LoanProductProvisioningEntryData = webService.retrieveProviioningEntries(entryId, offset, limit, officeId, productId, categoryId)
}
```

### Parameters
| **entryId** | **kotlin.Long**|  | [optional] |
| **offset** | **kotlin.Int**|  | [optional] |
| **limit** | **kotlin.Int**|  | [optional] |
| **officeId** | **kotlin.Long**|  | [optional] |
| **productId** | **kotlin.Long**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **categoryId** | **kotlin.Long**|  | [optional] |

### Return type

[**LoanProductProvisioningEntryData**](LoanProductProvisioningEntryData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieves a Provisioning Entry

Returns the details of a generated Provisioning Entry.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProvisioningEntriesApi::class.java)
val entryId : kotlin.Long = 789 // kotlin.Long | entryId

launch(Dispatchers.IO) {
    val result : ProvisioningEntryData = webService.retrieveProvisioningEntry(entryId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entryId** | **kotlin.Long**| entryId | |

### Return type

[**ProvisioningEntryData**](ProvisioningEntryData.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

