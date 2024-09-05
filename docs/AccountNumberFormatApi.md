# AccountNumberFormatApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create**](AccountNumberFormatApi.md#create) | **POST** v1/accountnumberformats | Create an Account number format |
| [**delete**](AccountNumberFormatApi.md#delete) | **DELETE** v1/accountnumberformats/{accountNumberFormatId} | Delete an Account number format |
| [**retrieveAll3**](AccountNumberFormatApi.md#retrieveAll3) | **GET** v1/accountnumberformats | List Account number formats |
| [**retrieveOne**](AccountNumberFormatApi.md#retrieveOne) | **GET** v1/accountnumberformats/{accountNumberFormatId} | Retrieve an Account number format |
| [**retrieveTemplate2**](AccountNumberFormatApi.md#retrieveTemplate2) | **GET** v1/accountnumberformats/template | Retrieve Account number format Template |
| [**update1**](AccountNumberFormatApi.md#update1) | **PUT** v1/accountnumberformats/{accountNumberFormatId} | Update an Account number format |



Create an Account number format

Note: You may associate a single Account number format for a given account type Mandatory Fields for Account number formats accountType

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountNumberFormatApi::class.java)
val postAccountNumberFormatsRequest : PostAccountNumberFormatsRequest =  // PostAccountNumberFormatsRequest | 

launch(Dispatchers.IO) {
    val result : PostAccountNumberFormatsResponse = webService.create(postAccountNumberFormatsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postAccountNumberFormatsRequest** | [**PostAccountNumberFormatsRequest**](PostAccountNumberFormatsRequest.md)|  | [optional] |

### Return type

[**PostAccountNumberFormatsResponse**](PostAccountNumberFormatsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete an Account number format

Note: Account numbers created while this format was active would remain unchanged.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountNumberFormatApi::class.java)
val accountNumberFormatId : kotlin.Long = 789 // kotlin.Long | accountNumberFormatId

launch(Dispatchers.IO) {
    val result : DeleteAccountNumberFormatsResponse = webService.delete(accountNumberFormatId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountNumberFormatId** | **kotlin.Long**| accountNumberFormatId | |

### Return type

[**DeleteAccountNumberFormatsResponse**](DeleteAccountNumberFormatsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Account number formats

Example Requests:  accountnumberformats   accountnumberformats?fields&#x3D;accountType,prefixType

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountNumberFormatApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetAccountNumberFormatsIdResponse> = webService.retrieveAll3()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetAccountNumberFormatsIdResponse&gt;**](GetAccountNumberFormatsIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve an Account number format

Example Requests:  accountnumberformats/1   accountnumberformats/1?template&#x3D;true   accountnumberformats/1?fields&#x3D;accountType,prefixType

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountNumberFormatApi::class.java)
val accountNumberFormatId : kotlin.Long = 789 // kotlin.Long | accountNumberFormatId

launch(Dispatchers.IO) {
    val result : GetAccountNumberFormatsIdResponse = webService.retrieveOne(accountNumberFormatId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **accountNumberFormatId** | **kotlin.Long**| accountNumberFormatId | |

### Return type

[**GetAccountNumberFormatsIdResponse**](GetAccountNumberFormatsIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Account number format Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request:  accountnumberformats/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountNumberFormatApi::class.java)

launch(Dispatchers.IO) {
    val result : GetAccountNumberFormatsResponseTemplate = webService.retrieveTemplate2()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAccountNumberFormatsResponseTemplate**](GetAccountNumberFormatsResponseTemplate.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update an Account number format

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(AccountNumberFormatApi::class.java)
val accountNumberFormatId : kotlin.Long = 789 // kotlin.Long | accountNumberFormatId
val putAccountNumberFormatsRequest : PutAccountNumberFormatsRequest =  // PutAccountNumberFormatsRequest | 

launch(Dispatchers.IO) {
    val result : PutAccountNumberFormatsResponse = webService.update1(accountNumberFormatId, putAccountNumberFormatsRequest)
}
```

### Parameters
| **accountNumberFormatId** | **kotlin.Long**| accountNumberFormatId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putAccountNumberFormatsRequest** | [**PutAccountNumberFormatsRequest**](PutAccountNumberFormatsRequest.md)|  | |

### Return type

[**PutAccountNumberFormatsResponse**](PutAccountNumberFormatsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

