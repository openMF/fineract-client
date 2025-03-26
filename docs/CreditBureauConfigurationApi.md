# CreditBureauConfigurationApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**addOrganisationCreditBureau**](CreditBureauConfigurationApi.md#addOrganisationCreditBureau) | **POST** v1/CreditBureauConfiguration/organisationCreditBureau/{organisationCreditBureauId} |  |
| [**createCreditBureauConfiguration**](CreditBureauConfigurationApi.md#createCreditBureauConfiguration) | **POST** v1/CreditBureauConfiguration/configuration/{creditBureauId} |  |
| [**createCreditBureauLoanProductMapping**](CreditBureauConfigurationApi.md#createCreditBureauLoanProductMapping) | **POST** v1/CreditBureauConfiguration/mappings/{organisationCreditBureauId} |  |
| [**fetchLoanProducts**](CreditBureauConfigurationApi.md#fetchLoanProducts) | **GET** v1/CreditBureauConfiguration/loanProduct |  |
| [**fetchMappingByLoanProductId**](CreditBureauConfigurationApi.md#fetchMappingByLoanProductId) | **GET** v1/CreditBureauConfiguration/loanProduct/{loanProductId} |  |
| [**getConfiguration**](CreditBureauConfigurationApi.md#getConfiguration) | **GET** v1/CreditBureauConfiguration/config/{organisationCreditBureauId} |  |
| [**getCreditBureau**](CreditBureauConfigurationApi.md#getCreditBureau) | **GET** v1/CreditBureauConfiguration |  |
| [**getCreditBureauLoanProductMapping**](CreditBureauConfigurationApi.md#getCreditBureauLoanProductMapping) | **GET** v1/CreditBureauConfiguration/mappings |  |
| [**getOrganisationCreditBureau**](CreditBureauConfigurationApi.md#getOrganisationCreditBureau) | **GET** v1/CreditBureauConfiguration/organisationCreditBureau |  |
| [**updateCreditBureau**](CreditBureauConfigurationApi.md#updateCreditBureau) | **PUT** v1/CreditBureauConfiguration/organisationCreditBureau |  |
| [**updateCreditBureauConfiguration**](CreditBureauConfigurationApi.md#updateCreditBureauConfiguration) | **PUT** v1/CreditBureauConfiguration/configuration/{configurationId} |  |
| [**updateCreditBureauLoanProductMapping**](CreditBureauConfigurationApi.md#updateCreditBureauLoanProductMapping) | **PUT** v1/CreditBureauConfiguration/mappings |  |





### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CreditBureauConfigurationApi::class.java)
val organisationCreditBureauId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.addOrganisationCreditBureau(organisationCreditBureauId, body)
}
```

### Parameters
| **organisationCreditBureauId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

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
val webService = apiClient.createWebservice(CreditBureauConfigurationApi::class.java)
val creditBureauId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.createCreditBureauConfiguration(creditBureauId, body)
}
```

### Parameters
| **creditBureauId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

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
val webService = apiClient.createWebservice(CreditBureauConfigurationApi::class.java)
val organisationCreditBureauId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.createCreditBureauLoanProductMapping(organisationCreditBureauId, body)
}
```

### Parameters
| **organisationCreditBureauId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

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
val webService = apiClient.createWebservice(CreditBureauConfigurationApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.fetchLoanProducts()
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




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CreditBureauConfigurationApi::class.java)
val loanProductId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.fetchMappingByLoanProductId(loanProductId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **loanProductId** | **kotlin.Long**|  | |

### Return type

**kotlin.String**

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
val webService = apiClient.createWebservice(CreditBureauConfigurationApi::class.java)
val organisationCreditBureauId : kotlin.Long = 789 // kotlin.Long | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getConfiguration(organisationCreditBureauId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **organisationCreditBureauId** | **kotlin.Long**|  | |

### Return type

**kotlin.String**

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
val webService = apiClient.createWebservice(CreditBureauConfigurationApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getCreditBureau()
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




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CreditBureauConfigurationApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getCreditBureauLoanProductMapping()
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




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CreditBureauConfigurationApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.getOrganisationCreditBureau()
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




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(CreditBureauConfigurationApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.updateCreditBureau(body)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

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
val webService = apiClient.createWebservice(CreditBureauConfigurationApi::class.java)
val configurationId : kotlin.Long = 789 // kotlin.Long | 
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.updateCreditBureauConfiguration(configurationId, body)
}
```

### Parameters
| **configurationId** | **kotlin.Long**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

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
val webService = apiClient.createWebservice(CreditBureauConfigurationApi::class.java)
val body : kotlin.String = body_example // kotlin.String | 

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.updateCreditBureauLoanProductMapping(body)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **body** | **kotlin.String**|  | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

