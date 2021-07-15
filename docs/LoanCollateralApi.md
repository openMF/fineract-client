# LoanCollateralApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCollateral**](LoanCollateralApi.md#createCollateral) | **POST** loans/{loanId}/collaterals | Create a Collateral
[**deleteCollateral**](LoanCollateralApi.md#deleteCollateral) | **DELETE** loans/{loanId}/collaterals/{collateralId} | Remove a Collateral
[**newCollateralTemplate**](LoanCollateralApi.md#newCollateralTemplate) | **GET** loans/{loanId}/collaterals/template | Retrieve Collateral Details Template
[**retrieveCollateralDetails**](LoanCollateralApi.md#retrieveCollateralDetails) | **GET** loans/{loanId}/collaterals | List Loan Collaterals
[**retrieveCollateralDetails1**](LoanCollateralApi.md#retrieveCollateralDetails1) | **GET** loans/{loanId}/collaterals/{collateralId} | Retrieve a Collateral
[**updateCollateral**](LoanCollateralApi.md#updateCollateral) | **PUT** loans/{loanId}/collaterals/{collateralId} | Update a Collateral



## createCollateral

> PostLoansLoanIdCollateralsResponse createCollateral(loanId, postLoansLoanIdCollateralsRequest)

Create a Collateral

Note: Currently, Collaterals may be added only before a Loan is approved

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanCollateralApi;

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

        LoanCollateralApi apiInstance = new LoanCollateralApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        PostLoansLoanIdCollateralsRequest postLoansLoanIdCollateralsRequest = new PostLoansLoanIdCollateralsRequest(); // PostLoansLoanIdCollateralsRequest | 
        try {
            PostLoansLoanIdCollateralsResponse result = apiInstance.createCollateral(loanId, postLoansLoanIdCollateralsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanCollateralApi#createCollateral");
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
 **postLoansLoanIdCollateralsRequest** | [**PostLoansLoanIdCollateralsRequest**](PostLoansLoanIdCollateralsRequest.md)|  |

### Return type

[**PostLoansLoanIdCollateralsResponse**](PostLoansLoanIdCollateralsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteCollateral

> DeleteLoansLoanIdCollateralsCollateralIdResponse deleteCollateral(loanId, collateralId)

Remove a Collateral

Note: A collateral can only be removed from Loans that are not yet approved.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanCollateralApi;

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

        LoanCollateralApi apiInstance = new LoanCollateralApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Long collateralId = 56L; // Long | collateralId
        try {
            DeleteLoansLoanIdCollateralsCollateralIdResponse result = apiInstance.deleteCollateral(loanId, collateralId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanCollateralApi#deleteCollateral");
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
 **collateralId** | **Long**| collateralId |

### Return type

[**DeleteLoansLoanIdCollateralsCollateralIdResponse**](DeleteLoansLoanIdCollateralsCollateralIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## newCollateralTemplate

> GetLoansLoanIdCollateralsTemplateResponse newCollateralTemplate(loanId)

Retrieve Collateral Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  loans/1/collaterals/template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanCollateralApi;

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

        LoanCollateralApi apiInstance = new LoanCollateralApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        try {
            GetLoansLoanIdCollateralsTemplateResponse result = apiInstance.newCollateralTemplate(loanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanCollateralApi#newCollateralTemplate");
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

[**GetLoansLoanIdCollateralsTemplateResponse**](GetLoansLoanIdCollateralsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveCollateralDetails

> List&lt;GetLoansLoanIdCollateralsResponse&gt; retrieveCollateralDetails(loanId)

List Loan Collaterals

Example Requests:  loans/1/collaterals   loans/1/collaterals?fields&#x3D;value,description

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanCollateralApi;

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

        LoanCollateralApi apiInstance = new LoanCollateralApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        try {
            List<GetLoansLoanIdCollateralsResponse> result = apiInstance.retrieveCollateralDetails(loanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanCollateralApi#retrieveCollateralDetails");
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

[**List&lt;GetLoansLoanIdCollateralsResponse&gt;**](GetLoansLoanIdCollateralsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveCollateralDetails1

> GetLoansLoanIdCollateralsResponse retrieveCollateralDetails1(loanId, collateralId)

Retrieve a Collateral

Example Requests:  /loans/1/collaterals/1   /loans/1/collaterals/1?fields&#x3D;description,description

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanCollateralApi;

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

        LoanCollateralApi apiInstance = new LoanCollateralApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Long collateralId = 56L; // Long | collateralId
        try {
            GetLoansLoanIdCollateralsResponse result = apiInstance.retrieveCollateralDetails1(loanId, collateralId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanCollateralApi#retrieveCollateralDetails1");
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
 **collateralId** | **Long**| collateralId |

### Return type

[**GetLoansLoanIdCollateralsResponse**](GetLoansLoanIdCollateralsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateCollateral

> PutLoansLoanIdCollateralsCollateralIdResponse updateCollateral(loanId, collateralId, putLoansLoandIdCollateralsCollateralIdRequest)

Update a Collateral

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.LoanCollateralApi;

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

        LoanCollateralApi apiInstance = new LoanCollateralApi(defaultClient);
        Long loanId = 56L; // Long | loanId
        Long collateralId = 56L; // Long | collateralId
        PutLoansLoandIdCollateralsCollateralIdRequest putLoansLoandIdCollateralsCollateralIdRequest = new PutLoansLoandIdCollateralsCollateralIdRequest(); // PutLoansLoandIdCollateralsCollateralIdRequest | 
        try {
            PutLoansLoanIdCollateralsCollateralIdResponse result = apiInstance.updateCollateral(loanId, collateralId, putLoansLoandIdCollateralsCollateralIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoanCollateralApi#updateCollateral");
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
 **collateralId** | **Long**| collateralId |
 **putLoansLoandIdCollateralsCollateralIdRequest** | [**PutLoansLoandIdCollateralsCollateralIdRequest**](PutLoansLoandIdCollateralsCollateralIdRequest.md)|  |

### Return type

[**PutLoansLoanIdCollateralsCollateralIdResponse**](PutLoansLoanIdCollateralsCollateralIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

