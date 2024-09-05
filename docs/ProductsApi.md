# ProductsApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createProduct**](ProductsApi.md#createProduct) | **POST** v1/products/{type} | Create a Share Product |
| [**handleCommands3**](ProductsApi.md#handleCommands3) | **POST** v1/products/{type}/{productId} |  |
| [**retrieveAllProducts**](ProductsApi.md#retrieveAllProducts) | **GET** v1/products/{type} | List Share Products |
| [**retrieveProduct**](ProductsApi.md#retrieveProduct) | **GET** v1/products/{type}/{productId} | Retrieve a Share Product |
| [**retrieveTemplate13**](ProductsApi.md#retrieveTemplate13) | **GET** v1/products/{type}/template |  |
| [**updateProduct**](ProductsApi.md#updateProduct) | **PUT** v1/products/{type}/{productId} | Update a Share Product |



Create a Share Product

Creates a Share Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, locale, totalShares, unitPrice, nominalShares,allowDividendCalculationForInactiveClients,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): shareReferenceId, shareSuspenseId, shareEquityId, incomeFromFeeAccountId  Optional Fields: sharesIssued, minimumShares, maximumShares, minimumActivePeriodForDividends, minimumactiveperiodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType, marketPricePeriods, chargesSelected

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProductsApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type
val postProductsTypeRequest : PostProductsTypeRequest =  // PostProductsTypeRequest | 

launch(Dispatchers.IO) {
    val result : PostProductsTypeResponse = webService.createProduct(type, postProductsTypeRequest)
}
```

### Parameters
| **type** | **kotlin.String**| type | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postProductsTypeRequest** | [**PostProductsTypeRequest**](PostProductsTypeRequest.md)|  | |

### Return type

[**PostProductsTypeResponse**](PostProductsTypeResponse.md)

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
val webService = apiClient.createWebservice(ProductsApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type
val productId : kotlin.Long = 789 // kotlin.Long | productId
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.handleCommands3(type, productId, command)
}
```

### Parameters
| **type** | **kotlin.String**| type | |
| **productId** | **kotlin.Long**| productId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


List Share Products

Lists Share Products  Mandatory Fields: limit, offset  Example Requests:  shareproducts

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProductsApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type
val offset : kotlin.Int = 56 // kotlin.Int | offset
val limit : kotlin.Int = 56 // kotlin.Int | limit

launch(Dispatchers.IO) {
    val result : GetProductsTypeResponse = webService.retrieveAllProducts(type, offset, limit)
}
```

### Parameters
| **type** | **kotlin.String**| type | |
| **offset** | **kotlin.Int**| offset | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| limit | [optional] |

### Return type

[**GetProductsTypeResponse**](GetProductsTypeResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Share Product

Retrieves a Share Product  Example Requests:  products/share/1   products/share/1?template&#x3D;true

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProductsApi::class.java)
val productId : kotlin.Long = 789 // kotlin.Long | productId
val type : kotlin.String = type_example // kotlin.String | type

launch(Dispatchers.IO) {
    val result : GetProductsTypeProductIdResponse = webService.retrieveProduct(productId, type)
}
```

### Parameters
| **productId** | **kotlin.Long**| productId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.String**| type | |

### Return type

[**GetProductsTypeProductIdResponse**](GetProductsTypeProductIdResponse.md)

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
val webService = apiClient.createWebservice(ProductsApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveTemplate13(type)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **type** | **kotlin.String**| type | |

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Share Product

Updates a Share Product

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(ProductsApi::class.java)
val type : kotlin.String = type_example // kotlin.String | type
val productId : kotlin.Long = 789 // kotlin.Long | productId
val putProductsTypeProductIdRequest : PutProductsTypeProductIdRequest =  // PutProductsTypeProductIdRequest | 

launch(Dispatchers.IO) {
    val result : PutProductsTypeProductIdResponse = webService.updateProduct(type, productId, putProductsTypeProductIdRequest)
}
```

### Parameters
| **type** | **kotlin.String**| type | |
| **productId** | **kotlin.Long**| productId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putProductsTypeProductIdRequest** | [**PutProductsTypeProductIdRequest**](PutProductsTypeProductIdRequest.md)|  | |

### Return type

[**PutProductsTypeProductIdResponse**](PutProductsTypeProductIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

