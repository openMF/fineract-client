# LoanChargesApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLoanCharge**](LoanChargesApi.md#deleteLoanCharge) | **DELETE** loans/{loanId}/charges/{chargeId} | Delete a Loan Charge
[**executeLoanCharge**](LoanChargesApi.md#executeLoanCharge) | **POST** loans/{loanId}/charges | Create a Loan Charge
[**executeLoanCharge1**](LoanChargesApi.md#executeLoanCharge1) | **POST** loans/{loanId}/charges/{chargeId} | Pay Loan Charge
[**retrieveAllLoanCharges**](LoanChargesApi.md#retrieveAllLoanCharges) | **GET** loans/{loanId}/charges | List Loan Charges
[**retrieveLoanCharge**](LoanChargesApi.md#retrieveLoanCharge) | **GET** loans/{loanId}/charges/{chargeId} | Retrieve a Loan Charge
[**retrieveTemplate8**](LoanChargesApi.md#retrieveTemplate8) | **GET** loans/{loanId}/charges/template | Retrieve Loan Charges Template
[**updateLoanCharge**](LoanChargesApi.md#updateLoanCharge) | **PUT** loans/{loanId}/charges/{chargeId} | Update a Loan Charge



## deleteLoanCharge

> DeleteLoansLoanIdChargesChargeIdResponse deleteLoanCharge(loanId, chargeId)

Delete a Loan Charge

Note: Currently, A Loan Charge may only be removed from Loans that are not yet approved.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanChargesApi;

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

        LoanChargesApi apiInstance = new LoanChargesApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Long chargeId = 56L; // Long | chargeId
        try {
            DeleteLoansLoanIdChargesChargeIdResponse result = apiInstance.deleteLoanCharge(loanId, chargeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanChargesApi#deleteLoanCharge");
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
 **loanId** | **Long**| loanId |
 **chargeId** | **Long**| chargeId |

### Return type

[**DeleteLoansLoanIdChargesChargeIdResponse**](DeleteLoansLoanIdChargesChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## executeLoanCharge

> PostLoansLoanIdChargesResponse executeLoanCharge(loanId, postLoansLoanIdChargesRequest, command)

Create a Loan Charge

It Creates a Loan Charge

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanChargesApi;

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

        LoanChargesApi apiInstance = new LoanChargesApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        PostLoansLoanIdChargesRequest postLoansLoanIdChargesRequest = new PostLoansLoanIdChargesRequest(); // PostLoansLoanIdChargesRequest | 
        String command = "command_example"; // String | command
        try {
            PostLoansLoanIdChargesResponse result = apiInstance.executeLoanCharge(loanId, postLoansLoanIdChargesRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanChargesApi#executeLoanCharge");
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
 **loanId** | **Long**| loanId |
 **postLoansLoanIdChargesRequest** | [**PostLoansLoanIdChargesRequest**](PostLoansLoanIdChargesRequest.md)|  |
 **command** | **String**| command | [optional]

### Return type

[**PostLoansLoanIdChargesResponse**](PostLoansLoanIdChargesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## executeLoanCharge1

> PostLoansLoanIdChargesChargeIdResponse executeLoanCharge1(loanId, chargeId, postLoansLoanIdChargesChargeIdRequest, command)

Pay Loan Charge

Loan Charge will be paid if the loan is linked with a savings account

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanChargesApi;

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

        LoanChargesApi apiInstance = new LoanChargesApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Long chargeId = 56L; // Long | chargeId
        PostLoansLoanIdChargesChargeIdRequest postLoansLoanIdChargesChargeIdRequest = new PostLoansLoanIdChargesChargeIdRequest(); // PostLoansLoanIdChargesChargeIdRequest | 
        String command = "command_example"; // String | command
        try {
            PostLoansLoanIdChargesChargeIdResponse result = apiInstance.executeLoanCharge1(loanId, chargeId, postLoansLoanIdChargesChargeIdRequest, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanChargesApi#executeLoanCharge1");
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
 **loanId** | **Long**| loanId |
 **chargeId** | **Long**| chargeId |
 **postLoansLoanIdChargesChargeIdRequest** | [**PostLoansLoanIdChargesChargeIdRequest**](PostLoansLoanIdChargesChargeIdRequest.md)|  |
 **command** | **String**| command | [optional]

### Return type

[**PostLoansLoanIdChargesChargeIdResponse**](PostLoansLoanIdChargesChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllLoanCharges

> List&lt;GetLoansLoanIdChargesChargeIdResponse&gt; retrieveAllLoanCharges(loanId)

List Loan Charges

It lists all the Loan Charges specific to a Loan   Example Requests:  loans/1/charges   loans/1/charges?fields&#x3D;name,amountOrPercentage

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanChargesApi;

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

        LoanChargesApi apiInstance = new LoanChargesApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        try {
            List<GetLoansLoanIdChargesChargeIdResponse> result = apiInstance.retrieveAllLoanCharges(loanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanChargesApi#retrieveAllLoanCharges");
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
 **loanId** | **Long**| loanId |

### Return type

[**List&lt;GetLoansLoanIdChargesChargeIdResponse&gt;**](GetLoansLoanIdChargesChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveLoanCharge

> GetLoansLoanIdChargesChargeIdResponse retrieveLoanCharge(loanId, chargeId)

Retrieve a Loan Charge

Retrieves Loan Charge according to the Loan ID and Charge IDExample Requests:  /loans/1/charges/1   /loans/1/charges/1?fields&#x3D;name,amountOrPercentage

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanChargesApi;

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

        LoanChargesApi apiInstance = new LoanChargesApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Long chargeId = 56L; // Long | chargeId
        try {
            GetLoansLoanIdChargesChargeIdResponse result = apiInstance.retrieveLoanCharge(loanId, chargeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanChargesApi#retrieveLoanCharge");
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
 **loanId** | **Long**| loanId |
 **chargeId** | **Long**| chargeId |

### Return type

[**GetLoansLoanIdChargesChargeIdResponse**](GetLoansLoanIdChargesChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate8

> GetLoansLoanIdChargesTemplateResponse retrieveTemplate8(loanId)

Retrieve Loan Charges Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  loans/1/charges/template  

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanChargesApi;

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

        LoanChargesApi apiInstance = new LoanChargesApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        try {
            GetLoansLoanIdChargesTemplateResponse result = apiInstance.retrieveTemplate8(loanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanChargesApi#retrieveTemplate8");
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
 **loanId** | **Long**| loanId |

### Return type

[**GetLoansLoanIdChargesTemplateResponse**](GetLoansLoanIdChargesTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateLoanCharge

> PutLoansLoanIdChargesChargeIdResponse updateLoanCharge(loanId, chargeId, putLoansLoanIdChargesChargeIdRequest)

Update a Loan Charge

Currently Loan Charges may be updated only if the Loan is not yet approved

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanChargesApi;

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

        LoanChargesApi apiInstance = new LoanChargesApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Long chargeId = 56L; // Long | chargeId
        PutLoansLoanIdChargesChargeIdRequest putLoansLoanIdChargesChargeIdRequest = new PutLoansLoanIdChargesChargeIdRequest(); // PutLoansLoanIdChargesChargeIdRequest | 
        try {
            PutLoansLoanIdChargesChargeIdResponse result = apiInstance.updateLoanCharge(loanId, chargeId, putLoansLoanIdChargesChargeIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanChargesApi#updateLoanCharge");
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
 **loanId** | **Long**| loanId |
 **chargeId** | **Long**| chargeId |
 **putLoansLoanIdChargesChargeIdRequest** | [**PutLoansLoanIdChargesChargeIdRequest**](PutLoansLoanIdChargesChargeIdRequest.md)|  |

### Return type

[**PutLoansLoanIdChargesChargeIdResponse**](PutLoansLoanIdChargesChargeIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

