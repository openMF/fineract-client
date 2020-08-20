# SavingsProductApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SavingsProductApi.md#create) | **POST** savingsproducts | Create a Savings Product
[**delete**](SavingsProductApi.md#delete) | **DELETE** savingsproducts/{productId} | Delete a Savings Product
[**retrieveAll**](SavingsProductApi.md#retrieveAll) | **GET** savingsproducts | List Savings Products
[**retrieveOne**](SavingsProductApi.md#retrieveOne) | **GET** savingsproducts/{productId} | Retrieve a Savings Product
[**retrieveTemplate**](SavingsProductApi.md#retrieveTemplate) | **GET** savingsproducts/template | Retrieve Savings Product Template
[**update**](SavingsProductApi.md#update) | **PUT** savingsproducts/{productId} | Update a Savings Product


<a name="create"></a>
# **create**
> PostSavingsProductsResponse create(body)

Create a Savings Product

Creates a Savings Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, allowOverdraft, overdraftLimit, minBalanceForInterestCalculation,withHoldTax,taxGroupId

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsProductApi;


SavingsProductApi apiInstance = new SavingsProductApi();
PostSavingsProductsRequest body = new PostSavingsProductsRequest(); // PostSavingsProductsRequest | body
try {
    PostSavingsProductsResponse result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsProductApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostSavingsProductsRequest**](PostSavingsProductsRequest.md)| body |

### Return type

[**PostSavingsProductsResponse**](PostSavingsProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteSavingsProductsProductIdResponse delete(productId)

Delete a Savings Product

Deletes a Savings Product

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsProductApi;


SavingsProductApi apiInstance = new SavingsProductApi();
Long productId = 789L; // Long | productId
try {
    DeleteSavingsProductsProductIdResponse result = apiInstance.delete(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsProductApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**DeleteSavingsProductsProductIdResponse**](DeleteSavingsProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetSavingsProductsResponse&gt; retrieveAll()

List Savings Products

Lists Savings Products  Example Requests:  savingsproducts  savingsproducts?fields&#x3D;name

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsProductApi;


SavingsProductApi apiInstance = new SavingsProductApi();
try {
    List<GetSavingsProductsResponse> result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsProductApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetSavingsProductsResponse&gt;**](GetSavingsProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetSavingsProductsProductIdResponse retrieveOne(productId)

Retrieve a Savings Product

Retrieves a Savings Product  Example Requests:  savingsproducts/1  savingsproducts/1?template&#x3D;true  savingsproducts/1?fields&#x3D;name,description

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsProductApi;


SavingsProductApi apiInstance = new SavingsProductApi();
Long productId = 789L; // Long | productId
try {
    GetSavingsProductsProductIdResponse result = apiInstance.retrieveOne(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsProductApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**GetSavingsProductsProductIdResponse**](GetSavingsProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> GetSavingsProductsTemplateResponse retrieveTemplate()

Retrieve Savings Product Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  savingsproducts/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsProductApi;


SavingsProductApi apiInstance = new SavingsProductApi();
try {
    GetSavingsProductsTemplateResponse result = apiInstance.retrieveTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsProductApi#retrieveTemplate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSavingsProductsTemplateResponse**](GetSavingsProductsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutSavingsProductsProductIdResponse update(productId, body)

Update a Savings Product

Updates a Savings Product

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SavingsProductApi;


SavingsProductApi apiInstance = new SavingsProductApi();
Long productId = 789L; // Long | productId
PutSavingsProductsProductIdRequest body = new PutSavingsProductsProductIdRequest(); // PutSavingsProductsProductIdRequest | body
try {
    PutSavingsProductsProductIdResponse result = apiInstance.update(productId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SavingsProductApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |
 **body** | [**PutSavingsProductsProductIdRequest**](PutSavingsProductsProductIdRequest.md)| body |

### Return type

[**PutSavingsProductsProductIdResponse**](PutSavingsProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

