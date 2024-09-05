# RepaymentWithPostDatedChecksApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deletePostDatedCheck**](RepaymentWithPostDatedChecksApi.md#deletePostDatedCheck) | **DELETE** v1/loans/{loanId}/postdatedchecks/{postDatedCheckId} | Delete Post Dated Check |
| [**getPostDatedCheck**](RepaymentWithPostDatedChecksApi.md#getPostDatedCheck) | **GET** v1/loans/{loanId}/postdatedchecks/{installmentId} | Get Post Dated Check |
| [**getPostDatedChecks**](RepaymentWithPostDatedChecksApi.md#getPostDatedChecks) | **GET** v1/loans/{loanId}/postdatedchecks | Get All Post Dated Checks |
| [**updatePostDatedChecks**](RepaymentWithPostDatedChecksApi.md#updatePostDatedChecks) | **PUT** v1/loans/{loanId}/postdatedchecks/{postDatedCheckId} | Update Post Dated Check, Bounced Check |



Delete Post Dated Check

Delete Post Dated Check

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RepaymentWithPostDatedChecksApi::class.java)
val postDatedCheckId : kotlin.Long = 789 // kotlin.Long | postDatedCheckId
val loanId : kotlin.Long = 789 // kotlin.Long | loanId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<DeletePostDatedCheck> = webService.deletePostDatedCheck(postDatedCheckId, loanId)
}
```

### Parameters
| **postDatedCheckId** | **kotlin.Long**| postDatedCheckId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**| loanId | |

### Return type

[**kotlin.collections.List&lt;DeletePostDatedCheck&gt;**](DeletePostDatedCheck.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get Post Dated Check

Get Post Dated Check

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RepaymentWithPostDatedChecksApi::class.java)
val installmentId : kotlin.Int = 56 // kotlin.Int | installmentId
val loanId : kotlin.Long = 789 // kotlin.Long | loanId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetPostDatedChecks> = webService.getPostDatedCheck(installmentId, loanId)
}
```

### Parameters
| **installmentId** | **kotlin.Int**| installmentId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**| loanId | |

### Return type

[**kotlin.collections.List&lt;GetPostDatedChecks&gt;**](GetPostDatedChecks.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get All Post Dated Checks

Get All Post dated Checks

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RepaymentWithPostDatedChecksApi::class.java)
val loanId : kotlin.Long = 789 // kotlin.Long | loanId

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetPostDatedChecks> = webService.getPostDatedChecks(loanId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanId** | **kotlin.Long**| loanId | |

### Return type

[**kotlin.collections.List&lt;GetPostDatedChecks&gt;**](GetPostDatedChecks.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update Post Dated Check, Bounced Check

Update Post Dated Check, Bounced Check

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(RepaymentWithPostDatedChecksApi::class.java)
val postDatedCheckId : kotlin.Long = 789 // kotlin.Long | postDatedCheckId
val loanId : kotlin.Long = 789 // kotlin.Long | loanId
val updatePostDatedCheckRequest : UpdatePostDatedCheckRequest =  // UpdatePostDatedCheckRequest | 
val editType : kotlin.String = editType_example // kotlin.String | editType

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<UpdatePostDatedCheckResponse> = webService.updatePostDatedChecks(postDatedCheckId, loanId, updatePostDatedCheckRequest, editType)
}
```

### Parameters
| **postDatedCheckId** | **kotlin.Long**| postDatedCheckId | |
| **loanId** | **kotlin.Long**| loanId | |
| **updatePostDatedCheckRequest** | [**UpdatePostDatedCheckRequest**](UpdatePostDatedCheckRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **editType** | **kotlin.String**| editType | [optional] |

### Return type

[**kotlin.collections.List&lt;UpdatePostDatedCheckResponse&gt;**](UpdatePostDatedCheckResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

