# ProvisioningCriteriaApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createProvisioningCriteria**](ProvisioningCriteriaApi.md#createProvisioningCriteria) | **POST** v1/provisioningcriteria | Create a new Provisioning Criteria |
| [**deleteProvisioningCriteria**](ProvisioningCriteriaApi.md#deleteProvisioningCriteria) | **DELETE** v1/provisioningcriteria/{criteriaId} | Deletes Provisioning Criteria |
| [**retrieveAllProvisioningCriterias**](ProvisioningCriteriaApi.md#retrieveAllProvisioningCriterias) | **GET** v1/provisioningcriteria | Retrieves all created Provisioning Criterias |
| [**retrieveProvisioningCriteria**](ProvisioningCriteriaApi.md#retrieveProvisioningCriteria) | **GET** v1/provisioningcriteria/{criteriaId} | Retrieves a Provisioning Criteria |
| [**retrieveTemplate3**](ProvisioningCriteriaApi.md#retrieveTemplate3) | **GET** v1/provisioningcriteria/template |  |
| [**updateProvisioningCriteria**](ProvisioningCriteriaApi.md#updateProvisioningCriteria) | **PUT** v1/provisioningcriteria/{criteriaId} | Updates a new Provisioning Criteria |



Create a new Provisioning Criteria

Creates a new Provisioning Criteria  Mandatory Fields:  criteriaName provisioningcriteria  Optional Fields:  loanProducts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProvisioningCriteriaApi::class.java)
val postProvisioningCriteriaRequest : PostProvisioningCriteriaRequest =  // PostProvisioningCriteriaRequest | 

launch(Dispatchers.IO) {
    val result : PostProvisioningCriteriaResponse = webService.createProvisioningCriteria(postProvisioningCriteriaRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postProvisioningCriteriaRequest** | [**PostProvisioningCriteriaRequest**](PostProvisioningCriteriaRequest.md)|  | |

### Return type

[**PostProvisioningCriteriaResponse**](PostProvisioningCriteriaResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Deletes Provisioning Criteria

Deletes Provisioning Criteria

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProvisioningCriteriaApi::class.java)
val criteriaId : kotlin.Long = 789 // kotlin.Long | criteriaId

launch(Dispatchers.IO) {
    val result : DeleteProvisioningCriteriaResponse = webService.deleteProvisioningCriteria(criteriaId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **criteriaId** | **kotlin.Long**| criteriaId | |

### Return type

[**DeleteProvisioningCriteriaResponse**](DeleteProvisioningCriteriaResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieves all created Provisioning Criterias

Retrieves all created Provisioning Criterias

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProvisioningCriteriaApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetProvisioningCriteriaResponse> = webService.retrieveAllProvisioningCriterias()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.collections.List&lt;GetProvisioningCriteriaResponse&gt;**](GetProvisioningCriteriaResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieves a Provisioning Criteria

Retrieves a Provisioning Criteria

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProvisioningCriteriaApi::class.java)
val criteriaId : kotlin.Long = 789 // kotlin.Long | criteriaId

launch(Dispatchers.IO) {
    val result : GetProvisioningCriteriaCriteriaIdResponse = webService.retrieveProvisioningCriteria(criteriaId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **criteriaId** | **kotlin.Long**| criteriaId | |

### Return type

[**GetProvisioningCriteriaCriteriaIdResponse**](GetProvisioningCriteriaCriteriaIdResponse.md)

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
val webService = apiClient.createWebservice(ProvisioningCriteriaApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveTemplate3()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Updates a new Provisioning Criteria

Updates a new Provisioning Criteria  Optional Fields criteriaName, loanProducts, provisioningcriteria

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProvisioningCriteriaApi::class.java)
val criteriaId : kotlin.Long = 789 // kotlin.Long | criteriaId
val putProvisioningCriteriaRequest : PutProvisioningCriteriaRequest =  // PutProvisioningCriteriaRequest | 

launch(Dispatchers.IO) {
    val result : PutProvisioningCriteriaResponse = webService.updateProvisioningCriteria(criteriaId, putProvisioningCriteriaRequest)
}
```

### Parameters
| **criteriaId** | **kotlin.Long**| criteriaId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putProvisioningCriteriaRequest** | [**PutProvisioningCriteriaRequest**](PutProvisioningCriteriaRequest.md)|  | |

### Return type

[**PutProvisioningCriteriaResponse**](PutProvisioningCriteriaResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

