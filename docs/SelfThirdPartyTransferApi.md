# SelfThirdPartyTransferApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**add**](SelfThirdPartyTransferApi.md#add) | **POST** v1/self/beneficiaries/tpt | Add TPT Beneficiary |
| [**delete22**](SelfThirdPartyTransferApi.md#delete22) | **DELETE** v1/self/beneficiaries/tpt/{beneficiaryId} | Delete TPT Beneficiary |
| [**retrieveAll35**](SelfThirdPartyTransferApi.md#retrieveAll35) | **GET** v1/self/beneficiaries/tpt | Get All TPT Beneficiary |
| [**template16**](SelfThirdPartyTransferApi.md#template16) | **GET** v1/self/beneficiaries/tpt/template | Beneficiary Third Party Transfer Template |
| [**update23**](SelfThirdPartyTransferApi.md#update23) | **PUT** v1/self/beneficiaries/tpt/{beneficiaryId} | Update TPT Beneficiary |



Add TPT Beneficiary

Api to add third party beneficiary linked to current user.  Parameter Definitions  name : Nick name for beneficiary, should be unique for an self service user  officeName : Office Name of beneficiary(not id)  accountNumber : Account Number of beneficiary(not id)  transferLimit : Each transfer initiated to this account will not exceed this amount  Example Requests:  /self/beneficiaries/tpt  Mandatory Fields: name, officeName, accountNumber, accountType  Optional Fields: transferLimit

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfThirdPartyTransferApi::class.java)
val postSelfBeneficiariesTPTRequest : PostSelfBeneficiariesTPTRequest =  // PostSelfBeneficiariesTPTRequest | 

launch(Dispatchers.IO) {
    val result : PostSelfBeneficiariesTPTResponse = webService.add(postSelfBeneficiariesTPTRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postSelfBeneficiariesTPTRequest** | [**PostSelfBeneficiariesTPTRequest**](PostSelfBeneficiariesTPTRequest.md)|  | |

### Return type

[**PostSelfBeneficiariesTPTResponse**](PostSelfBeneficiariesTPTResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete TPT Beneficiary

Api to delete third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfThirdPartyTransferApi::class.java)
val beneficiaryId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : DeleteSelfBeneficiariesTPTBeneficiaryIdResponse = webService.delete22(beneficiaryId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **beneficiaryId** | **kotlin.Long**|  | |

### Return type

[**DeleteSelfBeneficiariesTPTBeneficiaryIdResponse**](DeleteSelfBeneficiariesTPTBeneficiaryIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Get All TPT Beneficiary

Api to get all third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfThirdPartyTransferApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetSelfBeneficiariesTPTResponse> = webService.retrieveAll35()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetSelfBeneficiariesTPTResponse&gt;**](GetSelfBeneficiariesTPTResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Beneficiary Third Party Transfer Template

Returns Account Type enumerations. Self User is expected to know office name and account number to be able to add beneficiary.  Example Requests:  /self/beneficiaries/tpt/template

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfThirdPartyTransferApi::class.java)

launch(Dispatchers.IO) {
    val result : GetSelfBeneficiariesTPTTemplateResponse = webService.template16()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSelfBeneficiariesTPTTemplateResponse**](GetSelfBeneficiariesTPTTemplateResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update TPT Beneficiary

Api to update third party beneficiary linked to current user.  Example Requests:  /self/beneficiaries/tpt/{beneficiaryId}  Optional Fields: name, transferLimit

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(SelfThirdPartyTransferApi::class.java)
val beneficiaryId : kotlin.Long = 789 // kotlin.Long | beneficiaryId
val putSelfBeneficiariesTPTBeneficiaryIdRequest : PutSelfBeneficiariesTPTBeneficiaryIdRequest =  // PutSelfBeneficiariesTPTBeneficiaryIdRequest | 

launch(Dispatchers.IO) {
    val result : PutSelfBeneficiariesTPTBeneficiaryIdResponse = webService.update23(beneficiaryId, putSelfBeneficiariesTPTBeneficiaryIdRequest)
}
```

### Parameters
| **beneficiaryId** | **kotlin.Long**| beneficiaryId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putSelfBeneficiariesTPTBeneficiaryIdRequest** | [**PutSelfBeneficiariesTPTBeneficiaryIdRequest**](PutSelfBeneficiariesTPTBeneficiaryIdRequest.md)|  | |

### Return type

[**PutSelfBeneficiariesTPTBeneficiaryIdResponse**](PutSelfBeneficiariesTPTBeneficiaryIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

