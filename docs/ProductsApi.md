# ProductsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProduct**](ProductsApi.md#createProduct) | **POST** products/{type} | Create a Share Product
[**handleCommands**](ProductsApi.md#handleCommands) | **POST** products/{type}/{productId} | 
[**retrieveAllProducts**](ProductsApi.md#retrieveAllProducts) | **GET** products/{type} | List Share Products
[**retrieveProduct**](ProductsApi.md#retrieveProduct) | **GET** products/{type}/{productId} | Retrieve a Share Product
[**retrieveTemplate**](ProductsApi.md#retrieveTemplate) | **GET** products/{type}/template | 
[**updateProduct**](ProductsApi.md#updateProduct) | **PUT** products/{type}/{productId} | Update a Share Product


<a name="createProduct"></a>
# **createProduct**
> PostProductsTypeResponse createProduct(type, body)

Create a Share Product

Creates a Share Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, locale, totalShares, unitPrice, nominalShares,allowDividendCalculationForInactiveClients,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): shareReferenceId, shareSuspenseId, shareEquityId, incomeFromFeeAccountId  Optional Fields: sharesIssued, minimumShares, maximumShares, minimumActivePeriodForDividends, minimumactiveperiodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType, marketPricePeriods, chargesSelected

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String type = "type_example"; // String | type
PostProductsTypeRequest body = new PostProductsTypeRequest(); // PostProductsTypeRequest | body
try {
    PostProductsTypeResponse result = apiInstance.createProduct(type, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#createProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |
 **body** | [**PostProductsTypeRequest**](PostProductsTypeRequest.md)| body |

### Return type

[**PostProductsTypeResponse**](PostProductsTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="handleCommands"></a>
# **handleCommands**
> String handleCommands(type, productId, command)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String type = "type_example"; // String | type
Long productId = 789L; // Long | productId
String command = "command_example"; // String | command
try {
    String result = apiInstance.handleCommands(type, productId, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#handleCommands");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |
 **productId** | **Long**| productId |
 **command** | **String**| command | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllProducts"></a>
# **retrieveAllProducts**
> GetProductsTypeResponse retrieveAllProducts(type, offset, limit)

List Share Products

Lists Share Products  Mandatory Fields: limit, offset  Example Requests:  shareproducts

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String type = "type_example"; // String | type
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
try {
    GetProductsTypeResponse result = apiInstance.retrieveAllProducts(type, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#retrieveAllProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**GetProductsTypeResponse**](GetProductsTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveProduct"></a>
# **retrieveProduct**
> GetProductsTypeProductIdResponse retrieveProduct(productId, type)

Retrieve a Share Product

Retrieves a Share Product  Example Requests:  products/share/1   products/share/1?template&#x3D;true

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
Long productId = 789L; // Long | productId
String type = "type_example"; // String | type
try {
    GetProductsTypeProductIdResponse result = apiInstance.retrieveProduct(productId, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#retrieveProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |
 **type** | **String**| type |

### Return type

[**GetProductsTypeProductIdResponse**](GetProductsTypeProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> String retrieveTemplate(type)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String type = "type_example"; // String | type
try {
    String result = apiInstance.retrieveTemplate(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProduct"></a>
# **updateProduct**
> PutProductsTypeProductIdResponse updateProduct(type, productId, body)

Update a Share Product

Updates a Share Product

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProductsApi;


ProductsApi apiInstance = new ProductsApi();
String type = "type_example"; // String | type
Long productId = 789L; // Long | productId
PutProductsTypeProductIdRequest body = new PutProductsTypeProductIdRequest(); // PutProductsTypeProductIdRequest | body
try {
    PutProductsTypeProductIdResponse result = apiInstance.updateProduct(type, productId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProductsApi#updateProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| type |
 **productId** | **Long**| productId |
 **body** | [**PutProductsTypeProductIdRequest**](PutProductsTypeProductIdRequest.md)| body |

### Return type

[**PutProductsTypeProductIdResponse**](PutProductsTypeProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

