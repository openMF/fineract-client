# FloatingRatesApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFloatingRate**](FloatingRatesApi.md#createFloatingRate) | **POST** floatingrates | Create a new Floating Rate
[**retrieveAll22**](FloatingRatesApi.md#retrieveAll22) | **GET** floatingrates | List Floating Rates
[**retrieveOne12**](FloatingRatesApi.md#retrieveOne12) | **GET** floatingrates/{floatingRateId} | Retrieve Floating Rate
[**updateFloatingRate**](FloatingRatesApi.md#updateFloatingRate) | **PUT** floatingrates/{floatingRateId} | Update Floating Rate



## createFloatingRate

> PostFloatingRatesResponse createFloatingRate(postFloatingRatesRequest)

Create a new Floating Rate

Creates a new Floating Rate Mandatory Fields: name Optional Fields: isBaseLendingRate, isActive, ratePeriods

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.FloatingRatesApi;

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

        FloatingRatesApi apiInstance = new FloatingRatesApi(defaultClient);
        PostFloatingRatesRequest postFloatingRatesRequest = new PostFloatingRatesRequest(); // PostFloatingRatesRequest | 
        try {
            PostFloatingRatesResponse result = apiInstance.createFloatingRate(postFloatingRatesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FloatingRatesApi#createFloatingRate");
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
 **postFloatingRatesRequest** | [**PostFloatingRatesRequest**](PostFloatingRatesRequest.md)|  |

### Return type

[**PostFloatingRatesResponse**](PostFloatingRatesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAll22

> List&lt;GetFloatingRatesResponse&gt; retrieveAll22()

List Floating Rates

Lists Floating Rates

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.FloatingRatesApi;

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

        FloatingRatesApi apiInstance = new FloatingRatesApi(defaultClient);
        try {
            List<GetFloatingRatesResponse> result = apiInstance.retrieveAll22();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FloatingRatesApi#retrieveAll22");
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

[**List&lt;GetFloatingRatesResponse&gt;**](GetFloatingRatesResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne12

> GetFloatingRatesFloatingRateIdResponse retrieveOne12(floatingRateId)

Retrieve Floating Rate

Retrieves Floating Rate

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.FloatingRatesApi;

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

        FloatingRatesApi apiInstance = new FloatingRatesApi(defaultClient);
        Long floatingRateId = 56L; // Long | floatingRateId
        try {
            GetFloatingRatesFloatingRateIdResponse result = apiInstance.retrieveOne12(floatingRateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FloatingRatesApi#retrieveOne12");
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
 **floatingRateId** | **Long**| floatingRateId |

### Return type

[**GetFloatingRatesFloatingRateIdResponse**](GetFloatingRatesFloatingRateIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateFloatingRate

> PutFloatingRatesFloatingRateIdResponse updateFloatingRate(floatingRateId, putFloatingRatesFloatingRateIdRequest)

Update Floating Rate

Updates new Floating Rate. Rate Periods in the past cannot be modified. All the future rateperiods would be replaced with the new ratePeriods data sent.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.FloatingRatesApi;

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

        FloatingRatesApi apiInstance = new FloatingRatesApi(defaultClient);
        Long floatingRateId = 56L; // Long | floatingRateId
        PutFloatingRatesFloatingRateIdRequest putFloatingRatesFloatingRateIdRequest = new PutFloatingRatesFloatingRateIdRequest(); // PutFloatingRatesFloatingRateIdRequest | 
        try {
            PutFloatingRatesFloatingRateIdResponse result = apiInstance.updateFloatingRate(floatingRateId, putFloatingRatesFloatingRateIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FloatingRatesApi#updateFloatingRate");
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
 **floatingRateId** | **Long**| floatingRateId |
 **putFloatingRatesFloatingRateIdRequest** | [**PutFloatingRatesFloatingRateIdRequest**](PutFloatingRatesFloatingRateIdRequest.md)|  |

### Return type

[**PutFloatingRatesFloatingRateIdResponse**](PutFloatingRatesFloatingRateIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

