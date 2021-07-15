# TaxComponentsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTaxCompoent**](TaxComponentsApi.md#createTaxCompoent) | **POST** taxes/component | Create a new Tax Component
[**retrieveAllTaxComponents**](TaxComponentsApi.md#retrieveAllTaxComponents) | **GET** taxes/component | List Tax Components
[**retrieveTaxComponent**](TaxComponentsApi.md#retrieveTaxComponent) | **GET** taxes/component/{taxComponentId} | Retrieve Tax Component
[**retrieveTemplate20**](TaxComponentsApi.md#retrieveTemplate20) | **GET** taxes/component/template | 
[**updateTaxCompoent**](TaxComponentsApi.md#updateTaxCompoent) | **PUT** taxes/component/{taxComponentId} | Update Tax Component



## createTaxCompoent

> PostTaxesComponentsResponse createTaxCompoent(postTaxesComponentsRequest)

Create a new Tax Component

Creates a new Tax Component  Mandatory Fields: name, percentage  Optional Fields: debitAccountType, debitAcountId, creditAccountType, creditAcountId, startDate

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TaxComponentsApi;

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

        TaxComponentsApi apiInstance = new TaxComponentsApi(defaultClient);
        PostTaxesComponentsRequest postTaxesComponentsRequest = new PostTaxesComponentsRequest(); // PostTaxesComponentsRequest | 
        try {
            PostTaxesComponentsResponse result = apiInstance.createTaxCompoent(postTaxesComponentsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxComponentsApi#createTaxCompoent");
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
 **postTaxesComponentsRequest** | [**PostTaxesComponentsRequest**](PostTaxesComponentsRequest.md)|  |

### Return type

[**PostTaxesComponentsResponse**](PostTaxesComponentsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllTaxComponents

> List&lt;GetTaxesComponentsResponse&gt; retrieveAllTaxComponents()

List Tax Components

List Tax Components

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TaxComponentsApi;

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

        TaxComponentsApi apiInstance = new TaxComponentsApi(defaultClient);
        try {
            List<GetTaxesComponentsResponse> result = apiInstance.retrieveAllTaxComponents();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxComponentsApi#retrieveAllTaxComponents");
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

[**List&lt;GetTaxesComponentsResponse&gt;**](GetTaxesComponentsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTaxComponent

> GetTaxesComponentsResponse retrieveTaxComponent(taxComponentId)

Retrieve Tax Component

Retrieve Tax Component

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TaxComponentsApi;

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

        TaxComponentsApi apiInstance = new TaxComponentsApi(defaultClient);
        Long taxComponentId = 56L; // Long | taxComponentId
        try {
            GetTaxesComponentsResponse result = apiInstance.retrieveTaxComponent(taxComponentId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxComponentsApi#retrieveTaxComponent");
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
 **taxComponentId** | **Long**| taxComponentId |

### Return type

[**GetTaxesComponentsResponse**](GetTaxesComponentsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveTemplate20

> String retrieveTemplate20()



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TaxComponentsApi;

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

        TaxComponentsApi apiInstance = new TaxComponentsApi(defaultClient);
        try {
            String result = apiInstance.retrieveTemplate20();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxComponentsApi#retrieveTemplate20");
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


## updateTaxCompoent

> PutTaxesComponentsTaxComponentIdResponse updateTaxCompoent(taxComponentId, putTaxesComponentsTaxComponentIdRequest)

Update Tax Component

Updates Tax component. Debit and credit account details cannot be modified. All the future tax components would be replaced with the new percentage.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.TaxComponentsApi;

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

        TaxComponentsApi apiInstance = new TaxComponentsApi(defaultClient);
        Long taxComponentId = 56L; // Long | taxComponentId
        PutTaxesComponentsTaxComponentIdRequest putTaxesComponentsTaxComponentIdRequest = new PutTaxesComponentsTaxComponentIdRequest(); // PutTaxesComponentsTaxComponentIdRequest | 
        try {
            PutTaxesComponentsTaxComponentIdResponse result = apiInstance.updateTaxCompoent(taxComponentId, putTaxesComponentsTaxComponentIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaxComponentsApi#updateTaxCompoent");
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
 **taxComponentId** | **Long**| taxComponentId |
 **putTaxesComponentsTaxComponentIdRequest** | [**PutTaxesComponentsTaxComponentIdRequest**](PutTaxesComponentsTaxComponentIdRequest.md)|  |

### Return type

[**PutTaxesComponentsTaxComponentIdResponse**](PutTaxesComponentsTaxComponentIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

