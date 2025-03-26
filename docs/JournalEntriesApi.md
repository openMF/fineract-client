# JournalEntriesApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createGLJournalEntry**](JournalEntriesApi.md#createGLJournalEntry) | **POST** v1/journalentries | Create \&quot;Balanced\&quot; Journal Entries |
| [**createReversalJournalEntry**](JournalEntriesApi.md#createReversalJournalEntry) | **POST** v1/journalentries/{transactionId} | Update Running balances for Journal Entries |
| [**getJournalEntriesTemplate**](JournalEntriesApi.md#getJournalEntriesTemplate) | **GET** v1/journalentries/downloadtemplate |  |
| [**postJournalEntriesTemplate**](JournalEntriesApi.md#postJournalEntriesTemplate) | **POST** v1/journalentries/uploadtemplate |  |
| [**retrieveAll1**](JournalEntriesApi.md#retrieveAll1) | **GET** v1/journalentries | List Journal Entries |
| [**retrieveJournalEntries**](JournalEntriesApi.md#retrieveJournalEntries) | **GET** v1/journalentries/provisioning |  |
| [**retrieveJournalEntryById**](JournalEntriesApi.md#retrieveJournalEntryById) | **GET** v1/journalentries/{journalEntryId} | Retrieve a single Entry |
| [**retrieveOpeningBalance**](JournalEntriesApi.md#retrieveOpeningBalance) | **GET** v1/journalentries/openingbalance |  |



Create \&quot;Balanced\&quot; Journal Entries

Note: A Balanced (simple) Journal entry would have atleast one \&quot;Debit\&quot; and one \&quot;Credit\&quot; entry whose amounts are equal  Compound Journal entries may have \&quot;n\&quot; debits and \&quot;m\&quot; credits where both \&quot;m\&quot; and \&quot;n\&quot; are greater than 0 and the net sum or all debits and credits are equal    Mandatory Fields officeId, transactionDate   credits- glAccountId, amount, comments    debits-  glAccountId, amount, comments    Optional Fields paymentTypeId, accountNumber, checkNumber, routingCode, receiptNumber, bankNumber

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(JournalEntriesApi::class.java)
val command : kotlin.String = command_example // kotlin.String | command
val journalEntryCommand : JournalEntryCommand =  // JournalEntryCommand | 

launch(Dispatchers.IO) {
    val result : PostJournalEntriesResponse = webService.createGLJournalEntry(command, journalEntryCommand)
}
```

### Parameters
| **command** | **kotlin.String**| command | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **journalEntryCommand** | [**JournalEntryCommand**](JournalEntryCommand.md)|  | [optional] |

### Return type

[**PostJournalEntriesResponse**](PostJournalEntriesResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Update Running balances for Journal Entries

This API calculates the running balances for office. If office ID not provided this API calculates running balances for all offices.  Mandatory Fields officeId

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(JournalEntriesApi::class.java)
val transactionId : kotlin.String = transactionId_example // kotlin.String | transactionId
val command : kotlin.String = command_example // kotlin.String | command
val postJournalEntriesTransactionIdRequest : PostJournalEntriesTransactionIdRequest =  // PostJournalEntriesTransactionIdRequest | 

launch(Dispatchers.IO) {
    val result : PostJournalEntriesTransactionIdResponse = webService.createReversalJournalEntry(transactionId, command, postJournalEntriesTransactionIdRequest)
}
```

### Parameters
| **transactionId** | **kotlin.String**| transactionId | |
| **command** | **kotlin.String**| command | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postJournalEntriesTransactionIdRequest** | [**PostJournalEntriesTransactionIdRequest**](PostJournalEntriesTransactionIdRequest.md)|  | [optional] |

### Return type

[**PostJournalEntriesTransactionIdResponse**](PostJournalEntriesTransactionIdResponse.md)

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
val webService = apiClient.createWebservice(JournalEntriesApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getJournalEntriesTemplate(officeId, dateFormat)
}
```

### Parameters
| **officeId** | **kotlin.Long**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateFormat** | **kotlin.String**|  | [optional] |

### Return type

null (empty response body)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(JournalEntriesApi::class.java)
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postJournalEntriesTemplate(dateFormat, locale, uploadedInputStream)
}
```

### Parameters
| **dateFormat** | **kotlin.String**|  | [optional] |
| **locale** | **kotlin.String**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **uploadedInputStream** | **java.io.File**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*


List Journal Entries

The list capability of journal entries can support pagination and sorting.  Example Requests:  journalentries  journalentries?transactionId&#x3D;PB37X8Y21EQUY4S  journalentries?officeId&#x3D;1&amp;manualEntriesOnly&#x3D;true&amp;fromDate&#x3D;1 July 2013&amp;toDate&#x3D;15 July 2013&amp;dateFormat&#x3D;dd MMMM yyyy&amp;locale&#x3D;en  journalentries?fields&#x3D;officeName,glAccountName,transactionDate  journalentries?offset&#x3D;10&amp;limit&#x3D;50  journalentries?orderBy&#x3D;transactionId&amp;sortOrder&#x3D;DESC  journalentries?runningBalance&#x3D;true  journalentries?transactionDetails&#x3D;true  journalentries?loanId&#x3D;12  journalentries?savingsId&#x3D;24

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(JournalEntriesApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | officeId
val glAccountId : kotlin.Long = 789 // kotlin.Long | glAccountId
val manualEntriesOnly : kotlin.Boolean = true // kotlin.Boolean | manualEntriesOnly
val fromDate : kotlin.Any = Object // kotlin.Any | fromDate
val toDate : kotlin.Any = Object // kotlin.Any | toDate
val submittedOnDateFrom : kotlin.Any = Object // kotlin.Any | submittedOnDateFrom
val submittedOnDateTo : kotlin.Any = Object // kotlin.Any | submittedOnDateTo
val transactionId : kotlin.String = transactionId_example // kotlin.String | transactionId
val entityType : kotlin.Int = 56 // kotlin.Int | entityType
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
val locale : kotlin.String = locale_example // kotlin.String | locale
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | dateFormat
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val savingsId : kotlin.Long = 789 // kotlin.Long | savingsId
val runningBalance : kotlin.Boolean = true // kotlin.Boolean | runningBalance
val transactionDetails : kotlin.Boolean = true // kotlin.Boolean | transactionDetails

launch(Dispatchers.IO) {
    val result : GetJournalEntriesTransactionIdResponse = webService.retrieveAll1(officeId, glAccountId, manualEntriesOnly, fromDate, toDate, submittedOnDateFrom, submittedOnDateTo, transactionId, entityType, offset, limit, orderBy, sortOrder, locale, dateFormat, loanId, savingsId, runningBalance, transactionDetails)
}
```

### Parameters
| **officeId** | **kotlin.Long**| officeId | [optional] |
| **glAccountId** | **kotlin.Long**| glAccountId | [optional] |
| **manualEntriesOnly** | **kotlin.Boolean**| manualEntriesOnly | [optional] |
| **fromDate** | [**kotlin.Any**](.md)| fromDate | [optional] |
| **toDate** | [**kotlin.Any**](.md)| toDate | [optional] |
| **submittedOnDateFrom** | [**kotlin.Any**](.md)| submittedOnDateFrom | [optional] |
| **submittedOnDateTo** | [**kotlin.Any**](.md)| submittedOnDateTo | [optional] |
| **transactionId** | **kotlin.String**| transactionId | [optional] |
| **entityType** | **kotlin.Int**| entityType | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |
| **locale** | **kotlin.String**| locale | [optional] |
| **dateFormat** | **kotlin.String**| dateFormat | [optional] |
| **loanId** | **kotlin.Long**| loanId | [optional] |
| **savingsId** | **kotlin.Long**| savingsId | [optional] |
| **runningBalance** | **kotlin.Boolean**| runningBalance | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionDetails** | **kotlin.Boolean**| transactionDetails | [optional] |

### Return type

[**GetJournalEntriesTransactionIdResponse**](GetJournalEntriesTransactionIdResponse.md)

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
val webService = apiClient.createWebservice(JournalEntriesApi::class.java)
val offset : kotlin.Int = 56 // kotlin.Int | 
val limit : kotlin.Int = 56 // kotlin.Int | 
val entryId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveJournalEntries(offset, limit, entryId)
}
```

### Parameters
| **offset** | **kotlin.Int**|  | [optional] |
| **limit** | **kotlin.Int**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **entryId** | **kotlin.Long**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a single Entry

Example Requests:  journalentries/1    journalentries/1?fields&#x3D;officeName,glAccountId,entryType,amount  journalentries/1?runningBalance&#x3D;true  journalentries/1?transactionDetails&#x3D;true

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(JournalEntriesApi::class.java)
val journalEntryId : kotlin.Long = 789 // kotlin.Long | journalEntryId
val runningBalance : kotlin.Boolean = true // kotlin.Boolean | runningBalance
val transactionDetails : kotlin.Boolean = true // kotlin.Boolean | transactionDetails

launch(Dispatchers.IO) {
    val result : JournalEntryTransactionItem = webService.retrieveJournalEntryById(journalEntryId, runningBalance, transactionDetails)
}
```

### Parameters
| **journalEntryId** | **kotlin.Long**| journalEntryId | |
| **runningBalance** | **kotlin.Boolean**| runningBalance | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transactionDetails** | **kotlin.Boolean**| transactionDetails | [optional] |

### Return type

[**JournalEntryTransactionItem**](JournalEntryTransactionItem.md)

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
val webService = apiClient.createWebservice(JournalEntriesApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | 
val currencyCode : kotlin.String = currencyCode_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveOpeningBalance(officeId, currencyCode)
}
```

### Parameters
| **officeId** | **kotlin.Long**|  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **currencyCode** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

