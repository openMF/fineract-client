# FixedDepositProductApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](FixedDepositProductApi.md#create) | **POST** fixeddepositproducts | Create a Fixed Deposit Product
[**delete**](FixedDepositProductApi.md#delete) | **DELETE** fixeddepositproducts/{productId} | Delete a Fixed Deposit Product
[**retrieveAll**](FixedDepositProductApi.md#retrieveAll) | **GET** fixeddepositproducts | List Fixed Deposit Products
[**retrieveOne**](FixedDepositProductApi.md#retrieveOne) | **GET** fixeddepositproducts/{productId} | Retrieve a Fixed Deposit Product
[**retrieveTemplate**](FixedDepositProductApi.md#retrieveTemplate) | **GET** fixeddepositproducts/template | 
[**update**](FixedDepositProductApi.md#update) | **PUT** fixeddepositproducts/{productId} | Update a Fixed Deposit Product


<a name="create"></a>
# **create**
> PostFixedDepositProductsResponse create(body)

Create a Fixed Deposit Product

Creates a Fixed Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, accountingRule  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, , withHoldTax, taxGroupId   Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositProductApi;


FixedDepositProductApi apiInstance = new FixedDepositProductApi();
PostFixedDepositProductsRequest body = new PostFixedDepositProductsRequest(); // PostFixedDepositProductsRequest | body
try {
    PostFixedDepositProductsResponse result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositProductApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostFixedDepositProductsRequest**](PostFixedDepositProductsRequest.md)| body |

### Return type

[**PostFixedDepositProductsResponse**](PostFixedDepositProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteFixedDepositProductsProductIdResponse delete(productId)

Delete a Fixed Deposit Product

Deletes a Fixed Deposit Product

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositProductApi;


FixedDepositProductApi apiInstance = new FixedDepositProductApi();
Long productId = 789L; // Long | productId
try {
    DeleteFixedDepositProductsProductIdResponse result = apiInstance.delete(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositProductApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**DeleteFixedDepositProductsProductIdResponse**](DeleteFixedDepositProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetFixedDepositProductsResponse&gt; retrieveAll()

List Fixed Deposit Products

Lists Fixed Deposit Products  Example Requests:  fixeddepositproducts   fixeddepositproducts?fields&#x3D;name

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositProductApi;


FixedDepositProductApi apiInstance = new FixedDepositProductApi();
try {
    List<GetFixedDepositProductsResponse> result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositProductApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetFixedDepositProductsResponse&gt;**](GetFixedDepositProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetFixedDepositProductsProductIdResponse retrieveOne(productId)

Retrieve a Fixed Deposit Product

Retrieves a Fixed Deposit Product  Example Requests:  fixeddepositproducts/1   fixeddepositproducts/1?template&#x3D;true   fixeddepositproducts/1?fields&#x3D;name,description

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositProductApi;


FixedDepositProductApi apiInstance = new FixedDepositProductApi();
Long productId = 789L; // Long | productId
try {
    GetFixedDepositProductsProductIdResponse result = apiInstance.retrieveOne(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositProductApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**GetFixedDepositProductsProductIdResponse**](GetFixedDepositProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> String retrieveTemplate()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositProductApi;


FixedDepositProductApi apiInstance = new FixedDepositProductApi();
try {
    String result = apiInstance.retrieveTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositProductApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutFixedDepositProductsProductIdResponse update(productId, body)

Update a Fixed Deposit Product

Updates a Fixed Deposit Product

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FixedDepositProductApi;


FixedDepositProductApi apiInstance = new FixedDepositProductApi();
Long productId = 789L; // Long | productId
PutFixedDepositProductsProductIdRequest body = new PutFixedDepositProductsProductIdRequest(); // PutFixedDepositProductsProductIdRequest | body
try {
    PutFixedDepositProductsProductIdResponse result = apiInstance.update(productId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FixedDepositProductApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |
 **body** | [**PutFixedDepositProductsProductIdRequest**](PutFixedDepositProductsProductIdRequest.md)| body |

### Return type

[**PutFixedDepositProductsProductIdResponse**](PutFixedDepositProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

