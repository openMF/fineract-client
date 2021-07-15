# AccountingClosureApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGLClosure**](AccountingClosureApi.md#createGLClosure) | **POST** glclosures | Create an Accounting Closure
[**deleteGLClosure**](AccountingClosureApi.md#deleteGLClosure) | **DELETE** glclosures/{glClosureId} | Delete an accounting closure
[**retreiveClosure**](AccountingClosureApi.md#retreiveClosure) | **GET** glclosures/{glClosureId} | Retrieve an Accounting Closure
[**retrieveAllClosures**](AccountingClosureApi.md#retrieveAllClosures) | **GET** glclosures | List Accounting closures
[**updateGLClosure**](AccountingClosureApi.md#updateGLClosure) | **PUT** glclosures/{glClosureId} | Update an Accounting closure



## createGLClosure

> PostGlClosuresResponse createGLClosure(postGlClosuresRequest)

Create an Accounting Closure

Mandatory Fields officeId,closingDate

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountingClosureApi;

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

        AccountingClosureApi apiInstance = new AccountingClosureApi(defaultClient);
        PostGlClosuresRequest postGlClosuresRequest = new PostGlClosuresRequest(); // PostGlClosuresRequest | 
        try {
            PostGlClosuresResponse result = apiInstance.createGLClosure(postGlClosuresRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountingClosureApi#createGLClosure");
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
 **postGlClosuresRequest** | [**PostGlClosuresRequest**](PostGlClosuresRequest.md)|  |

### Return type

[**PostGlClosuresResponse**](PostGlClosuresResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteGLClosure

> DeleteGlClosuresResponse deleteGLClosure(glClosureId)

Delete an accounting closure

Note: Only the latest accounting closure associated with a branch may be deleted.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountingClosureApi;

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

        AccountingClosureApi apiInstance = new AccountingClosureApi(defaultClient);
        Long glClosureId = 56L; // Long | glclosureId
        try {
            DeleteGlClosuresResponse result = apiInstance.deleteGLClosure(glClosureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountingClosureApi#deleteGLClosure");
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
 **glClosureId** | **Long**| glclosureId |

### Return type

[**DeleteGlClosuresResponse**](DeleteGlClosuresResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retreiveClosure

> GetGlClosureResponse retreiveClosure(glClosureId)

Retrieve an Accounting Closure

Example Requests:  glclosures/1   /glclosures/1?fields&#x3D;officeName,closingDate

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountingClosureApi;

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

        AccountingClosureApi apiInstance = new AccountingClosureApi(defaultClient);
        Long glClosureId = 56L; // Long | glClosureId
        try {
            GetGlClosureResponse result = apiInstance.retreiveClosure(glClosureId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountingClosureApi#retreiveClosure");
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
 **glClosureId** | **Long**| glClosureId |

### Return type

[**GetGlClosureResponse**](GetGlClosureResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllClosures

> List&lt;GetGlClosureResponse&gt; retrieveAllClosures(officeId)

List Accounting closures

Example Requests:  glclosures

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountingClosureApi;

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

        AccountingClosureApi apiInstance = new AccountingClosureApi(defaultClient);
        Long officeId = 56L; // Long | 
        try {
            List<GetGlClosureResponse> result = apiInstance.retrieveAllClosures(officeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountingClosureApi#retrieveAllClosures");
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
 **officeId** | **Long**|  | [optional]

### Return type

[**List&lt;GetGlClosureResponse&gt;**](GetGlClosureResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateGLClosure

> PutGlClosuresResponse updateGLClosure(glClosureId, putGlClosuresRequest)

Update an Accounting closure

Once an accounting closure is created, only the comments associated with it may be edited

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.AccountingClosureApi;

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

        AccountingClosureApi apiInstance = new AccountingClosureApi(defaultClient);
        Long glClosureId = 56L; // Long | glClosureId
        PutGlClosuresRequest putGlClosuresRequest = new PutGlClosuresRequest(); // PutGlClosuresRequest | 
        try {
            PutGlClosuresResponse result = apiInstance.updateGLClosure(glClosureId, putGlClosuresRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountingClosureApi#updateGLClosure");
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
 **glClosureId** | **Long**| glClosureId |
 **putGlClosuresRequest** | [**PutGlClosuresRequest**](PutGlClosuresRequest.md)|  | [optional]

### Return type

[**PutGlClosuresResponse**](PutGlClosuresResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

