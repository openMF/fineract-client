# InterestRateChartApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create10**](InterestRateChartApi.md#create10) | **POST** interestratecharts | Create a Chart
[**delete13**](InterestRateChartApi.md#delete13) | **DELETE** interestratecharts/{chartId} | Delete a Chart
[**retrieveAll26**](InterestRateChartApi.md#retrieveAll26) | **GET** interestratecharts | Retrieve all Charts
[**retrieveOne16**](InterestRateChartApi.md#retrieveOne16) | **GET** interestratecharts/{chartId} | Retrieve a Chart
[**template9**](InterestRateChartApi.md#template9) | **GET** interestratecharts/template | Retrieve Chart Details Template
[**update14**](InterestRateChartApi.md#update14) | **PUT** interestratecharts/{chartId} | Update a Chart



## create10

> PostInterestRateChartsResponse create10(postInterestRateChartsRequest)

Create a Chart

Creates a new chart which can be attached to a term deposit products (FD or RD).

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterestRateChartApi;

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

        InterestRateChartApi apiInstance = new InterestRateChartApi(defaultClient);
        PostInterestRateChartsRequest postInterestRateChartsRequest = new PostInterestRateChartsRequest(); // PostInterestRateChartsRequest | 
        try {
            PostInterestRateChartsResponse result = apiInstance.create10(postInterestRateChartsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterestRateChartApi#create10");
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
 **postInterestRateChartsRequest** | [**PostInterestRateChartsRequest**](PostInterestRateChartsRequest.md)|  |

### Return type

[**PostInterestRateChartsResponse**](PostInterestRateChartsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete13

> DeleteInterestRateChartsChartIdResponse delete13(chartId)

Delete a Chart

It deletes the chart

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterestRateChartApi;

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

        InterestRateChartApi apiInstance = new InterestRateChartApi(defaultClient);
        Long chartId = 56L; // Long | chartId
        try {
            DeleteInterestRateChartsChartIdResponse result = apiInstance.delete13(chartId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterestRateChartApi#delete13");
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
 **chartId** | **Long**| chartId |

### Return type

[**DeleteInterestRateChartsChartIdResponse**](DeleteInterestRateChartsChartIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAll26

> List&lt;GetInterestRateChartsResponse&gt; retrieveAll26(productId)

Retrieve all Charts

Retrieve list of charts associated with a term deposit product(FD or RD). Example Requests:  interestratecharts?productId&#x3D;1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterestRateChartApi;

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

        InterestRateChartApi apiInstance = new InterestRateChartApi(defaultClient);
        Long productId = 56L; // Long | productId
        try {
            List<GetInterestRateChartsResponse> result = apiInstance.retrieveAll26(productId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterestRateChartApi#retrieveAll26");
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
 **productId** | **Long**| productId | [optional]

### Return type

[**List&lt;GetInterestRateChartsResponse&gt;**](GetInterestRateChartsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne16

> GetInterestRateChartsResponse retrieveOne16(chartId)

Retrieve a Chart

It retrieves the Interest Rate Chart Example Requests:  interestratecharts/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterestRateChartApi;

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

        InterestRateChartApi apiInstance = new InterestRateChartApi(defaultClient);
        Long chartId = 56L; // Long | chartId
        try {
            GetInterestRateChartsResponse result = apiInstance.retrieveOne16(chartId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterestRateChartApi#retrieveOne16");
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
 **chartId** | **Long**| chartId |

### Return type

[**GetInterestRateChartsResponse**](GetInterestRateChartsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## template9

> GetInterestRateChartsTemplateResponse template9()

Retrieve Chart Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for creating a chart. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  interestratecharts/template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterestRateChartApi;

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

        InterestRateChartApi apiInstance = new InterestRateChartApi(defaultClient);
        try {
            GetInterestRateChartsTemplateResponse result = apiInstance.template9();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterestRateChartApi#template9");
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

[**GetInterestRateChartsTemplateResponse**](GetInterestRateChartsTemplateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## update14

> PutInterestRateChartsChartIdResponse update14(chartId, putInterestRateChartsChartIdRequest)

Update a Chart

It updates the chart

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterestRateChartApi;

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

        InterestRateChartApi apiInstance = new InterestRateChartApi(defaultClient);
        Long chartId = 56L; // Long | chartId
        PutInterestRateChartsChartIdRequest putInterestRateChartsChartIdRequest = new PutInterestRateChartsChartIdRequest(); // PutInterestRateChartsChartIdRequest | 
        try {
            PutInterestRateChartsChartIdResponse result = apiInstance.update14(chartId, putInterestRateChartsChartIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterestRateChartApi#update14");
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
 **chartId** | **Long**| chartId |
 **putInterestRateChartsChartIdRequest** | [**PutInterestRateChartsChartIdRequest**](PutInterestRateChartsChartIdRequest.md)|  |

### Return type

[**PutInterestRateChartsChartIdResponse**](PutInterestRateChartsChartIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

