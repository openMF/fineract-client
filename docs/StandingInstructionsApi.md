# StandingInstructionsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**create5**](StandingInstructionsApi.md#create5) | **POST** v1/standinginstructions | Create new Standing Instruction |
| [**retrieveAll19**](StandingInstructionsApi.md#retrieveAll19) | **GET** v1/standinginstructions | List Standing Instructions |
| [**retrieveOne10**](StandingInstructionsApi.md#retrieveOne10) | **GET** v1/standinginstructions/{standingInstructionId} | Retrieve Standing Instruction |
| [**template6**](StandingInstructionsApi.md#template6) | **GET** v1/standinginstructions/template | Retrieve Standing Instruction Template |
| [**update9**](StandingInstructionsApi.md#update9) | **PUT** v1/standinginstructions/{standingInstructionId} | Update Standing Instruction | Delete Standing Instruction |



Create new Standing Instruction

Ability to create new instruction for transfer of monetary funds from one account to another

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(StandingInstructionsApi::class.java)
val postStandingInstructionsRequest : PostStandingInstructionsRequest =  // PostStandingInstructionsRequest | 

launch(Dispatchers.IO) {
    val result : PostStandingInstructionsResponse = webService.create5(postStandingInstructionsRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postStandingInstructionsRequest** | [**PostStandingInstructionsRequest**](PostStandingInstructionsRequest.md)|  | |

### Return type

[**PostStandingInstructionsResponse**](PostStandingInstructionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List Standing Instructions

Example Requests:  standinginstructions

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(StandingInstructionsApi::class.java)
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder
val transferType : kotlin.Int = 56 // kotlin.Int | transferType
val clientName : kotlin.String = clientName_example // kotlin.String | clientName
val clientId : kotlin.Long = 789 // kotlin.Long | clientId
val fromAccountId : kotlin.Long = 789 // kotlin.Long | fromAccountId
val fromAccountType : kotlin.Int = 56 // kotlin.Int | fromAccountType

launch(Dispatchers.IO) {
    val result : GetStandingInstructionsResponse = webService.retrieveAll19(externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType)
}
```

### Parameters
| **externalId** | **kotlin.String**| externalId | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |
| **transferType** | **kotlin.Int**| transferType | [optional] |
| **clientName** | **kotlin.String**| clientName | [optional] |
| **clientId** | **kotlin.Long**| clientId | [optional] |
| **fromAccountId** | **kotlin.Long**| fromAccountId | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **fromAccountType** | **kotlin.Int**| fromAccountType | [optional] |

### Return type

[**GetStandingInstructionsResponse**](GetStandingInstructionsResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Standing Instruction

Example Requests :  standinginstructions/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(StandingInstructionsApi::class.java)
val standingInstructionId : kotlin.Long = 789 // kotlin.Long | standingInstructionId
val externalId : kotlin.String = externalId_example // kotlin.String | externalId
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit
val orderBy : kotlin.String = orderBy_example // kotlin.String | orderBy
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | sortOrder

launch(Dispatchers.IO) {
    val result : GetStandingInstructionsStandingInstructionIdResponse = webService.retrieveOne10(standingInstructionId, externalId, offset, limit, orderBy, sortOrder)
}
```

### Parameters
| **standingInstructionId** | **kotlin.Long**| standingInstructionId | |
| **externalId** | **kotlin.String**| externalId | [optional] |
| **offset** | **kotlin.Int**| offset | [optional] |
| **limit** | **kotlin.Int**| limit | [optional] |
| **orderBy** | **kotlin.String**| orderBy | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sortOrder** | **kotlin.String**| sortOrder | [optional] |

### Return type

[**GetStandingInstructionsStandingInstructionIdResponse**](GetStandingInstructionsStandingInstructionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve Standing Instruction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1&amp;transferType&#x3D;1  standinginstructions/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1&amp;transferType&#x3D;1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(StandingInstructionsApi::class.java)
val fromOfficeId : kotlin.Long = 789 // kotlin.Long | fromOfficeId
val fromClientId : kotlin.Long = 789 // kotlin.Long | fromClientId
val fromAccountId : kotlin.Long = 789 // kotlin.Long | fromAccountId
val fromAccountType : kotlin.Int = 56 // kotlin.Int | fromAccountType
val toOfficeId : kotlin.Long = 789 // kotlin.Long | toOfficeId
val toClientId : kotlin.Long = 789 // kotlin.Long | toClientId
val toAccountId : kotlin.Long = 789 // kotlin.Long | toAccountId
val toAccountType : kotlin.Int = 56 // kotlin.Int | toAccountType
val transferType : kotlin.Int = 56 // kotlin.Int | transferType

launch(Dispatchers.IO) {
    val result : GetStandingInstructionsTemplateResponse = webService.template6(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType, transferType)
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
| **toAccountType** | **kotlin.Int**| toAccountType | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **transferType** | **kotlin.Int**| transferType | [optional] |

### Return type

[**GetStandingInstructionsTemplateResponse**](GetStandingInstructionsTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update Standing Instruction | Delete Standing Instruction

Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;update   Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;delete

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(StandingInstructionsApi::class.java)
val standingInstructionId : kotlin.Long = 789 // kotlin.Long | standingInstructionId
val command : kotlin.String = command_example // kotlin.String | command
val putStandingInstructionsStandingInstructionIdRequest : PutStandingInstructionsStandingInstructionIdRequest =  // PutStandingInstructionsStandingInstructionIdRequest | 

launch(Dispatchers.IO) {
    val result : PutStandingInstructionsStandingInstructionIdResponse = webService.update9(standingInstructionId, command, putStandingInstructionsStandingInstructionIdRequest)
}
```

### Parameters
| **standingInstructionId** | **kotlin.Long**| standingInstructionId | |
| **command** | **kotlin.String**| command | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putStandingInstructionsStandingInstructionIdRequest** | [**PutStandingInstructionsStandingInstructionIdRequest**](PutStandingInstructionsStandingInstructionIdRequest.md)|  | [optional] |

### Return type

[**PutStandingInstructionsStandingInstructionIdResponse**](PutStandingInstructionsStandingInstructionIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

