# SelfScoreCardApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScorecard**](SelfScoreCardApi.md#createScorecard) | **POST** self/surveys/scorecards/{surveyId} | 
[**findByClient**](SelfScoreCardApi.md#findByClient) | **GET** self/surveys/scorecards/clients/{clientId} | 



## createScorecard

> createScorecard(surveyId, scorecardData)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfScoreCardApi;

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

        SelfScoreCardApi apiInstance = new SelfScoreCardApi(defaultClient);
        Long surveyId = 56L; // Long | 
        ScorecardData scorecardData = new ScorecardData(); // ScorecardData | 
        try {
            apiInstance.createScorecard(surveyId, scorecardData);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfScoreCardApi#createScorecard");
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
 **surveyId** | **Long**|  |
 **scorecardData** | [**ScorecardData**](ScorecardData.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## findByClient

> List&lt;ScorecardData&gt; findByClient(clientId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SelfScoreCardApi;

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

        SelfScoreCardApi apiInstance = new SelfScoreCardApi(defaultClient);
        Long clientId = 56L; // Long | 
        try {
            List<ScorecardData> result = apiInstance.findByClient(clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelfScoreCardApi#findByClient");
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
 **clientId** | **Long**|  |

### Return type

[**List&lt;ScorecardData&gt;**](ScorecardData.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |

