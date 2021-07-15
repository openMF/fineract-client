# InterestRateSlabAKAInterestBandsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create9**](InterestRateSlabAKAInterestBandsApi.md#create9) | **POST** interestratecharts/{chartId}/chartslabs | Create a Slab
[**delete12**](InterestRateSlabAKAInterestBandsApi.md#delete12) | **DELETE** interestratecharts/{chartId}/chartslabs/{chartSlabId} | Delete a Slab
[**retrieveAll25**](InterestRateSlabAKAInterestBandsApi.md#retrieveAll25) | **GET** interestratecharts/{chartId}/chartslabs | Retrieve all Slabs
[**retrieveOne15**](InterestRateSlabAKAInterestBandsApi.md#retrieveOne15) | **GET** interestratecharts/{chartId}/chartslabs/{chartSlabId} | Retrieve a Slab
[**template8**](InterestRateSlabAKAInterestBandsApi.md#template8) | **GET** interestratecharts/{chartId}/chartslabs/template | 
[**update13**](InterestRateSlabAKAInterestBandsApi.md#update13) | **PUT** interestratecharts/{chartId}/chartslabs/{chartSlabId} | Update a Slab



## create9

> PostInterestRateChartsChartIdChartSlabsResponse create9(chartId, postInterestRateChartsChartIdChartSlabsRequest)

Create a Slab

Creates a new interest rate slab for an interest rate chart. Mandatory Fields periodType, fromPeriod, annualInterestRate Optional Fields toPeriod and description Example Requests:  interestratecharts/1/chartslabs

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterestRateSlabAKAInterestBandsApi;

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

        InterestRateSlabAKAInterestBandsApi apiInstance = new InterestRateSlabAKAInterestBandsApi(defaultClient);
        Long chartId = 56L; // Long | chartId
        PostInterestRateChartsChartIdChartSlabsRequest postInterestRateChartsChartIdChartSlabsRequest = new PostInterestRateChartsChartIdChartSlabsRequest(); // PostInterestRateChartsChartIdChartSlabsRequest | 
        try {
            PostInterestRateChartsChartIdChartSlabsResponse result = apiInstance.create9(chartId, postInterestRateChartsChartIdChartSlabsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterestRateSlabAKAInterestBandsApi#create9");
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
 **postInterestRateChartsChartIdChartSlabsRequest** | [**PostInterestRateChartsChartIdChartSlabsRequest**](PostInterestRateChartsChartIdChartSlabsRequest.md)|  |

### Return type

[**PostInterestRateChartsChartIdChartSlabsResponse**](PostInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete12

> DeleteInterestRateChartsChartIdChartSlabsResponse delete12(chartId, chartSlabId)

Delete a Slab

Delete a Slab from a chart

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterestRateSlabAKAInterestBandsApi;

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

        InterestRateSlabAKAInterestBandsApi apiInstance = new InterestRateSlabAKAInterestBandsApi(defaultClient);
        Long chartId = 56L; // Long | chartId
        Long chartSlabId = 56L; // Long | chartSlabId
        try {
            DeleteInterestRateChartsChartIdChartSlabsResponse result = apiInstance.delete12(chartId, chartSlabId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterestRateSlabAKAInterestBandsApi#delete12");
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
 **chartSlabId** | **Long**| chartSlabId |

### Return type

[**DeleteInterestRateChartsChartIdChartSlabsResponse**](DeleteInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAll25

> List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt; retrieveAll25(chartId)

Retrieve all Slabs

Retrieve list of slabs associated with a chart  Example Requests:  interestratecharts/1/chartslabs

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterestRateSlabAKAInterestBandsApi;

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

        InterestRateSlabAKAInterestBandsApi apiInstance = new InterestRateSlabAKAInterestBandsApi(defaultClient);
        Long chartId = 56L; // Long | chartId
        try {
            List<GetInterestRateChartsChartIdChartSlabsResponse> result = apiInstance.retrieveAll25(chartId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterestRateSlabAKAInterestBandsApi#retrieveAll25");
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

[**List&lt;GetInterestRateChartsChartIdChartSlabsResponse&gt;**](GetInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne15

> GetInterestRateChartsChartIdChartSlabsResponse retrieveOne15(chartId, chartSlabId)

Retrieve a Slab

Retrieve a slab associated with an Interest rate chart  Example Requests:  interestratecharts/1/chartslabs/1 

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterestRateSlabAKAInterestBandsApi;

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

        InterestRateSlabAKAInterestBandsApi apiInstance = new InterestRateSlabAKAInterestBandsApi(defaultClient);
        Long chartId = 56L; // Long | chartId
        Long chartSlabId = 56L; // Long | chartSlabId
        try {
            GetInterestRateChartsChartIdChartSlabsResponse result = apiInstance.retrieveOne15(chartId, chartSlabId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterestRateSlabAKAInterestBandsApi#retrieveOne15");
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
 **chartSlabId** | **Long**| chartSlabId |

### Return type

[**GetInterestRateChartsChartIdChartSlabsResponse**](GetInterestRateChartsChartIdChartSlabsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## template8

> String template8(chartId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterestRateSlabAKAInterestBandsApi;

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

        InterestRateSlabAKAInterestBandsApi apiInstance = new InterestRateSlabAKAInterestBandsApi(defaultClient);
        Long chartId = 56L; // Long | chartId
        try {
            String result = apiInstance.template8(chartId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterestRateSlabAKAInterestBandsApi#template8");
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


## update13

> PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse update13(chartId, chartSlabId, putInterestRateChartsChartIdChartSlabsChartSlabIdRequest)

Update a Slab

It updates the Slab from chart

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.InterestRateSlabAKAInterestBandsApi;

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

        InterestRateSlabAKAInterestBandsApi apiInstance = new InterestRateSlabAKAInterestBandsApi(defaultClient);
        Long chartId = 56L; // Long | chartId
        Long chartSlabId = 56L; // Long | chartSlabId
        PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest putInterestRateChartsChartIdChartSlabsChartSlabIdRequest = new PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest(); // PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest | 
        try {
            PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse result = apiInstance.update13(chartId, chartSlabId, putInterestRateChartsChartIdChartSlabsChartSlabIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InterestRateSlabAKAInterestBandsApi#update13");
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
 **chartSlabId** | **Long**| chartSlabId |
 **putInterestRateChartsChartIdChartSlabsChartSlabIdRequest** | [**PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest**](PutInterestRateChartsChartIdChartSlabsChartSlabIdRequest.md)|  |

### Return type

[**PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse**](PutInterestRateChartsChartIdChartSlabsChartSlabIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

