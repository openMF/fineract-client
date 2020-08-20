# RecurringDepositProductApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](RecurringDepositProductApi.md#create) | **POST** recurringdepositproducts | Create a Recurring Deposit Product
[**delete**](RecurringDepositProductApi.md#delete) | **DELETE** recurringdepositproducts/{productId} | Delete a Recurring Deposit Product
[**retrieveAll**](RecurringDepositProductApi.md#retrieveAll) | **GET** recurringdepositproducts | List Recuring Deposit Products
[**retrieveOne**](RecurringDepositProductApi.md#retrieveOne) | **GET** recurringdepositproducts/{productId} | Retrieve a Recurring Deposit Product
[**retrieveTemplate**](RecurringDepositProductApi.md#retrieveTemplate) | **GET** recurringdepositproducts/template | 
[**update**](RecurringDepositProductApi.md#update) | **PUT** recurringdepositproducts/{productId} | Update a Recurring Deposit Product


<a name="create"></a>
# **create**
> PostRecurringDepositProductsResponse create(body)

Create a Recurring Deposit Product

Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RecurringDepositProductApi;


RecurringDepositProductApi apiInstance = new RecurringDepositProductApi();
PostRecurringDepositProductsRequest body = new PostRecurringDepositProductsRequest(); // PostRecurringDepositProductsRequest | body
try {
    PostRecurringDepositProductsResponse result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringDepositProductApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostRecurringDepositProductsRequest**](PostRecurringDepositProductsRequest.md)| body |

### Return type

[**PostRecurringDepositProductsResponse**](PostRecurringDepositProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteRecurringDepositProductsProductIdResponse delete(productId)

Delete a Recurring Deposit Product

Deletes a Recurring Deposit Product

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RecurringDepositProductApi;


RecurringDepositProductApi apiInstance = new RecurringDepositProductApi();
Long productId = 789L; // Long | productId
try {
    DeleteRecurringDepositProductsProductIdResponse result = apiInstance.delete(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringDepositProductApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**DeleteRecurringDepositProductsProductIdResponse**](DeleteRecurringDepositProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetRecurringDepositProductsResponse&gt; retrieveAll()

List Recuring Deposit Products

Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RecurringDepositProductApi;


RecurringDepositProductApi apiInstance = new RecurringDepositProductApi();
try {
    List<GetRecurringDepositProductsResponse> result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringDepositProductApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetRecurringDepositProductsResponse&gt;**](GetRecurringDepositProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetRecurringDepositProductsProductIdResponse retrieveOne(productId)

Retrieve a Recurring Deposit Product

Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RecurringDepositProductApi;


RecurringDepositProductApi apiInstance = new RecurringDepositProductApi();
Long productId = 789L; // Long | productId
try {
    GetRecurringDepositProductsProductIdResponse result = apiInstance.retrieveOne(productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringDepositProductApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**GetRecurringDepositProductsProductIdResponse**](GetRecurringDepositProductsProductIdResponse.md)

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
//import org.mifos.fineract.services.RecurringDepositProductApi;


RecurringDepositProductApi apiInstance = new RecurringDepositProductApi();
try {
    String result = apiInstance.retrieveTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringDepositProductApi#retrieveTemplate");
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
> PutRecurringDepositProductsResponse update(productId, body)

Update a Recurring Deposit Product

Updates a Recurring Deposit Product

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.RecurringDepositProductApi;


RecurringDepositProductApi apiInstance = new RecurringDepositProductApi();
Long productId = 789L; // Long | productId
PutRecurringDepositProductsRequest body = new PutRecurringDepositProductsRequest(); // PutRecurringDepositProductsRequest | body
try {
    PutRecurringDepositProductsResponse result = apiInstance.update(productId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RecurringDepositProductApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |
 **body** | [**PutRecurringDepositProductsRequest**](PutRecurringDepositProductsRequest.md)| body |

### Return type

[**PutRecurringDepositProductsResponse**](PutRecurringDepositProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

