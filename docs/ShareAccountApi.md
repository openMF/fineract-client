# ShareAccountApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createAccount**](ShareAccountApi.md#createAccount) | **POST** v1/accounts/{type} | Submit new share application |
| [**getSharedAccountsTemplate**](ShareAccountApi.md#getSharedAccountsTemplate) | **GET** v1/accounts/{type}/downloadtemplate |  |
| [**handleCommands2**](ShareAccountApi.md#handleCommands2) | **POST** v1/accounts/{type}/{accountId} | Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account |
| [**postSharedAccountsTemplate**](ShareAccountApi.md#postSharedAccountsTemplate) | **POST** v1/accounts/{type}/uploadtemplate |  |
| [**retrieveAccount**](ShareAccountApi.md#retrieveAccount) | **GET** v1/accounts/{type}/{accountId} | Retrieve a share application/account |
| [**retrieveAllAccounts1**](ShareAccountApi.md#retrieveAllAccounts1) | **GET** v1/accounts/{type} | List share applications/accounts |
| [**template7**](ShareAccountApi.md#template7) | **GET** v1/accounts/{type}/template | Retrieve Share Account Template |
| [**updateAccount**](ShareAccountApi.md#updateAccount) | **PUT** v1/accounts/{type}/{accountId} | Modify a share application |



Submit new share application

Submits new share application  Mandatory Fields: clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate  Optional Fields: accountNo, externalId  Inherited from Product (if not provided): minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ShareAccountApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type
val postAccountsTypeRequest : PostAccountsTypeRequest =  // PostAccountsTypeRequest | 

launch(Dispatchers.IO) {
    val result : PostAccountsTypeResponse = webService.createAccount(type, postAccountsTypeRequest)
}
```

### Parameters
| **type** | **kotlin.String**| type | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postAccountsTypeRequest** | [**PostAccountsTypeRequest**](PostAccountsTypeRequest.md)|  | |

### Return type

[**PostAccountsTypeResponse**](PostAccountsTypeResponse.md)

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
val webService = apiClient.createWebservice(ShareAccountApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type
val officeId : kotlin.Long = 789 // kotlin.Long | 
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 

launch(Dispatchers.IO) {
    webService.getSharedAccountsTemplate(type, officeId, dateFormat)
}
```

### Parameters
| **type** | **kotlin.String**| type | |
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


Approve share application | Undo approval share application | Reject share application | Activate a share account | Close a share account | Apply additional shares on a share account | Approve additional shares request on a share account | Reject additional shares request on a share account | Redeem shares on a share account

Approve share application:  Approves share application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval share application:  Will move &#39;approved&#39; share application back to &#39;Submitted and pending approval&#39; state.  Reject share application:  Rejects share application so long as its in &#39;Submitted and pending approval&#39; state.  Activate a share account:  Results in an approved share application being converted into an &#39;active&#39; share account.  Close a share account:  Results in an Activated share application being converted into an &#39;closed&#39; share account.  closedDate is closure date of share account  Mandatory Fields: dateFormat,locale,closedDate  Apply additional shares on a share account:  requestedDate is requsted date of share purchase  requestedShares is number of shares to be purchase  Mandatory Fields: dateFormat,locale,requestedDate, requestedShares  Approve additional shares request on a share account  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Reject additional shares request on a share account:  requestedShares is Share purchase transaction ids  Mandatory Fields: requestedShares  Redeem shares on a share account:  Results redeem some/all shares from share account.  requestedDate is requsted date of shares redeem  requestedShares is number of shares to be redeemed  Mandatory Fields: dateFormat,locale,requestedDate,requestedShares  Showing request/response for &#39;Reject additional shares request on a share account&#39;  For more info visit this link - https://fineract.apache.org/legacy-docs/apiLive.htm#shareaccounts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ShareAccountApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val postAccountsTypeAccountIdRequest : PostAccountsTypeAccountIdRequest =  // PostAccountsTypeAccountIdRequest | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostAccountsTypeAccountIdResponse = webService.handleCommands2(type, accountId, postAccountsTypeAccountIdRequest, command)
}
```

### Parameters
| **type** | **kotlin.String**| type | |
| **accountId** | **kotlin.Long**| accountId | |
| **postAccountsTypeAccountIdRequest** | [**PostAccountsTypeAccountIdRequest**](PostAccountsTypeAccountIdRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostAccountsTypeAccountIdResponse**](PostAccountsTypeAccountIdResponse.md)

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
val webService = apiClient.createWebservice(ShareAccountApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | 
val locale : kotlin.String = locale_example // kotlin.String | 
val uploadedInputStream : java.io.File = BINARY_DATA_HERE // java.io.File | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.postSharedAccountsTemplate(type, dateFormat, locale, uploadedInputStream)
}
```

### Parameters
| **type** | **kotlin.String**| type | |
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


Retrieve a share application/account

Retrieves a share application/account  Example Requests :  shareaccount/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ShareAccountApi::class.java)
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val type : kotlin.String = type_example // kotlin.String | type

launch(Dispatchers.IO) {
    val result : GetAccountsTypeAccountIdResponse = webService.retrieveAccount(accountId, type)
}
```

### Parameters
| **accountId** | **kotlin.Long**| accountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.String**| type | |

### Return type

[**GetAccountsTypeAccountIdResponse**](GetAccountsTypeAccountIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List share applications/accounts

Lists share applications/accounts  Example Requests:  shareaccount

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ShareAccountApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit

launch(Dispatchers.IO) {
    val result : GetAccountsTypeResponse = webService.retrieveAllAccounts1(type, offset, limit)
}
```

### Parameters
| **type** | **kotlin.String**| type | |
| **offset** | **kotlin.Int**| offset | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| limit | [optional] |

### Return type

[**GetAccountsTypeResponse**](GetAccountsTypeResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Share Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  accounts/share/template?clientId&#x3D;1   accounts/share/template?clientId&#x3D;1&amp;productId&#x3D;1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ShareAccountApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val productId : kotlin.Long = 789 // kotlin.Long | productId

launch(Dispatchers.IO) {
    val result : GetAccountsTypeTemplateResponse = webService.template7(type, clientId, productId)
}
```

### Parameters
| **type** | **kotlin.String**| type | |
| **clientId** | **kotlin.Long**| clientId | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **productId** | **kotlin.Long**| productId | [optional] |

### Return type

[**GetAccountsTypeTemplateResponse**](GetAccountsTypeTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Modify a share application

Share application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ShareAccountApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type
val accountId : kotlin.Long = 789 // kotlin.Long | accountId
val putAccountsTypeAccountIdRequest : PutAccountsTypeAccountIdRequest =  // PutAccountsTypeAccountIdRequest | 

launch(Dispatchers.IO) {
    val result : PutAccountsTypeAccountIdResponse = webService.updateAccount(type, accountId, putAccountsTypeAccountIdRequest)
}
```

### Parameters
| **type** | **kotlin.String**| type | |
| **accountId** | **kotlin.Long**| accountId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putAccountsTypeAccountIdRequest** | [**PutAccountsTypeAccountIdRequest**](PutAccountsTypeAccountIdRequest.md)|  | |

### Return type

[**PutAccountsTypeAccountIdResponse**](PutAccountsTypeAccountIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

