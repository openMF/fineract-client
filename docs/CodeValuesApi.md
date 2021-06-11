# CodeValuesApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCodeValue**](CodeValuesApi.md#createCodeValue) | **POST** codes/{codeId}/codevalues | Create a Code description
[**deleteCodeValue**](CodeValuesApi.md#deleteCodeValue) | **DELETE** codes/{codeId}/codevalues/{codeValueId} | Delete a Code description
[**retrieveAllCodeValues**](CodeValuesApi.md#retrieveAllCodeValues) | **GET** codes/{codeId}/codevalues | List Code Values
[**retrieveCodeValue**](CodeValuesApi.md#retrieveCodeValue) | **GET** codes/{codeId}/codevalues/{codeValueId} | Retrieve a Code description
[**updateCodeValue**](CodeValuesApi.md#updateCodeValue) | **PUT** codes/{codeId}/codevalues/{codeValueId} | Update a Code description



## createCodeValue

> PostCodeValueDataResponse createCodeValue(codeId, postCodeValuesDataRequest)

Create a Code description

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CodeValuesApi;

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

        CodeValuesApi apiInstance = new CodeValuesApi(defaultClient);
        Long codeId = 56L; // Long | codeId
        PostCodeValuesDataRequest postCodeValuesDataRequest = new PostCodeValuesDataRequest(); // PostCodeValuesDataRequest | 
        try {
            PostCodeValueDataResponse result = apiInstance.createCodeValue(codeId, postCodeValuesDataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CodeValuesApi#createCodeValue");
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
 **codeId** | **Long**| codeId |
 **postCodeValuesDataRequest** | [**PostCodeValuesDataRequest**](PostCodeValuesDataRequest.md)|  |

### Return type

[**PostCodeValueDataResponse**](PostCodeValueDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteCodeValue

> DeleteCodeValueDataResponse deleteCodeValue(codeId, codeValueId)

Delete a Code description

Deletes a code description

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CodeValuesApi;

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

        CodeValuesApi apiInstance = new CodeValuesApi(defaultClient);
        Long codeId = 56L; // Long | codeId
        Long codeValueId = 56L; // Long | codeValueId
        try {
            DeleteCodeValueDataResponse result = apiInstance.deleteCodeValue(codeId, codeValueId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CodeValuesApi#deleteCodeValue");
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
 **codeId** | **Long**| codeId |
 **codeValueId** | **Long**| codeValueId |

### Return type

[**DeleteCodeValueDataResponse**](DeleteCodeValueDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllCodeValues

> List&lt;GetCodeValuesDataResponse&gt; retrieveAllCodeValues(codeId)

List Code Values

Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CodeValuesApi;

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

        CodeValuesApi apiInstance = new CodeValuesApi(defaultClient);
        Long codeId = 56L; // Long | codeId
        try {
            List<GetCodeValuesDataResponse> result = apiInstance.retrieveAllCodeValues(codeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CodeValuesApi#retrieveAllCodeValues");
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
 **codeId** | **Long**| codeId |

### Return type

[**List&lt;GetCodeValuesDataResponse&gt;**](GetCodeValuesDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A List of code values for a given code |  -  |


## retrieveCodeValue

> GetCodeValuesDataResponse retrieveCodeValue(codeValueId, codeId)

Retrieve a Code description

Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CodeValuesApi;

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

        CodeValuesApi apiInstance = new CodeValuesApi(defaultClient);
        Long codeValueId = 56L; // Long | codeValueId
        Long codeId = 56L; // Long | codeId
        try {
            GetCodeValuesDataResponse result = apiInstance.retrieveCodeValue(codeValueId, codeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CodeValuesApi#retrieveCodeValue");
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
 **codeValueId** | **Long**| codeValueId |
 **codeId** | **Long**| codeId |

### Return type

[**GetCodeValuesDataResponse**](GetCodeValuesDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateCodeValue

> PutCodeValueDataResponse updateCodeValue(codeId, codeValueId, putCodeValuesDataRequest)

Update a Code description

Updates the details of a code description.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.CodeValuesApi;

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

        CodeValuesApi apiInstance = new CodeValuesApi(defaultClient);
        Long codeId = 56L; // Long | codeId
        Long codeValueId = 56L; // Long | codeValueId
        PutCodeValuesDataRequest putCodeValuesDataRequest = new PutCodeValuesDataRequest(); // PutCodeValuesDataRequest | 
        try {
            PutCodeValueDataResponse result = apiInstance.updateCodeValue(codeId, codeValueId, putCodeValuesDataRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CodeValuesApi#updateCodeValue");
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
 **codeId** | **Long**| codeId |
 **codeValueId** | **Long**| codeValueId |
 **putCodeValuesDataRequest** | [**PutCodeValuesDataRequest**](PutCodeValuesDataRequest.md)|  |

### Return type

[**PutCodeValueDataResponse**](PutCodeValueDataResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

