# RecurringDepositProductApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create12**](RecurringDepositProductApi.md#create12) | **POST** recurringdepositproducts | Create a Recurring Deposit Product
[**delete17**](RecurringDepositProductApi.md#delete17) | **DELETE** recurringdepositproducts/{productId} | Delete a Recurring Deposit Product
[**retrieveAll32**](RecurringDepositProductApi.md#retrieveAll32) | **GET** recurringdepositproducts | List Recuring Deposit Products
[**retrieveOne22**](RecurringDepositProductApi.md#retrieveOne22) | **GET** recurringdepositproducts/{productId} | Retrieve a Recurring Deposit Product
[**retrieveTemplate16**](RecurringDepositProductApi.md#retrieveTemplate16) | **GET** recurringdepositproducts/template | 
[**update18**](RecurringDepositProductApi.md#update18) | **PUT** recurringdepositproducts/{productId} | Update a Recurring Deposit Product



## create12

> PostRecurringDepositProductsResponse create12(postRecurringDepositProductsRequest)

Create a Recurring Deposit Product

Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RecurringDepositProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        RecurringDepositProductApi apiInstance = new RecurringDepositProductApi(defaultClient);
        PostRecurringDepositProductsRequest postRecurringDepositProductsRequest = new PostRecurringDepositProductsRequest(); // PostRecurringDepositProductsRequest | 
        try {
            PostRecurringDepositProductsResponse result = apiInstance.create12(postRecurringDepositProductsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringDepositProductApi#create12");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postRecurringDepositProductsRequest** | [**PostRecurringDepositProductsRequest**](PostRecurringDepositProductsRequest.md)|  |

### Return type

[**PostRecurringDepositProductsResponse**](PostRecurringDepositProductsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete17

> DeleteRecurringDepositProductsProductIdResponse delete17(productId)

Delete a Recurring Deposit Product

Deletes a Recurring Deposit Product

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RecurringDepositProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        RecurringDepositProductApi apiInstance = new RecurringDepositProductApi(defaultClient);
        Long productId = 56L; // Long | productId
        try {
            DeleteRecurringDepositProductsProductIdResponse result = apiInstance.delete17(productId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringDepositProductApi#delete17");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**DeleteRecurringDepositProductsProductIdResponse**](DeleteRecurringDepositProductsProductIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAll32

> List&lt;GetRecurringDepositProductsResponse&gt; retrieveAll32()

List Recuring Deposit Products

Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RecurringDepositProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        RecurringDepositProductApi apiInstance = new RecurringDepositProductApi(defaultClient);
        try {
            List<GetRecurringDepositProductsResponse> result = apiInstance.retrieveAll32();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringDepositProductApi#retrieveAll32");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;GetRecurringDepositProductsResponse&gt;**](GetRecurringDepositProductsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne22

> GetRecurringDepositProductsProductIdResponse retrieveOne22(productId)

Retrieve a Recurring Deposit Product

Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RecurringDepositProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        RecurringDepositProductApi apiInstance = new RecurringDepositProductApi(defaultClient);
        Long productId = 56L; // Long | productId
        try {
            GetRecurringDepositProductsProductIdResponse result = apiInstance.retrieveOne22(productId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringDepositProductApi#retrieveOne22");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |

### Return type

[**GetRecurringDepositProductsProductIdResponse**](GetRecurringDepositProductsProductIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate16

> String retrieveTemplate16()



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RecurringDepositProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        RecurringDepositProductApi apiInstance = new RecurringDepositProductApi(defaultClient);
        try {
            String result = apiInstance.retrieveTemplate16();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringDepositProductApi#retrieveTemplate16");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## update18

> PutRecurringDepositProductsResponse update18(productId, putRecurringDepositProductsRequest)

Update a Recurring Deposit Product

Updates a Recurring Deposit Product

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.RecurringDepositProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        RecurringDepositProductApi apiInstance = new RecurringDepositProductApi(defaultClient);
        Long productId = 56L; // Long | productId
        PutRecurringDepositProductsRequest putRecurringDepositProductsRequest = new PutRecurringDepositProductsRequest(); // PutRecurringDepositProductsRequest | 
        try {
            PutRecurringDepositProductsResponse result = apiInstance.update18(productId, putRecurringDepositProductsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RecurringDepositProductApi#update18");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**| productId |
 **putRecurringDepositProductsRequest** | [**PutRecurringDepositProductsRequest**](PutRecurringDepositProductsRequest.md)|  |

### Return type

[**PutRecurringDepositProductsResponse**](PutRecurringDepositProductsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

