# SurveyApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDatatableEntry1**](SurveyApi.md#createDatatableEntry1) | **POST** survey/{surveyName}/{apptableId} | Create an entry in the survey table
[**deleteDatatableEntries2**](SurveyApi.md#deleteDatatableEntries2) | **DELETE** survey/{surveyName}/{clientId}/{fulfilledId} | 
[**getClientSurveyOverview**](SurveyApi.md#getClientSurveyOverview) | **GET** survey/{surveyName}/{clientId} | 
[**getSurveyEntry**](SurveyApi.md#getSurveyEntry) | **GET** survey/{surveyName}/{clientId}/{entryId} | 
[**register**](SurveyApi.md#register) | **PUT** survey/register/{surveyName}/{apptable} | 
[**retrieveSurvey**](SurveyApi.md#retrieveSurvey) | **GET** survey/{surveyName} | Retrieve survey
[**retrieveSurveys**](SurveyApi.md#retrieveSurveys) | **GET** survey | Retrieve surveys



## createDatatableEntry1

> PostSurveySurveyNameApptableIdResponse createDatatableEntry1(surveyName, apptableId, postSurveySurveyNameApptableIdRequest)

Create an entry in the survey table

Insert and entry in a survey table (full fill the survey).  Refer Link for sample Body:  [ https://demo.fineract.dev/fineract-provider/api-docs/apiLive.htm#survey_create ] 

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SurveyApi;

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

        SurveyApi apiInstance = new SurveyApi(defaultClient);
        String surveyName = "surveyName_example"; // String | surveyName
        Long apptableId = 56L; // Long | apptableId
        PostSurveySurveyNameApptableIdRequest postSurveySurveyNameApptableIdRequest = new PostSurveySurveyNameApptableIdRequest(); // PostSurveySurveyNameApptableIdRequest | 
        try {
            PostSurveySurveyNameApptableIdResponse result = apiInstance.createDatatableEntry1(surveyName, apptableId, postSurveySurveyNameApptableIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SurveyApi#createDatatableEntry1");
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
 **surveyName** | **String**| surveyName |
 **apptableId** | **Long**| apptableId |
 **postSurveySurveyNameApptableIdRequest** | [**PostSurveySurveyNameApptableIdRequest**](PostSurveySurveyNameApptableIdRequest.md)|  |

### Return type

[**PostSurveySurveyNameApptableIdResponse**](PostSurveySurveyNameApptableIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteDatatableEntries2

> String deleteDatatableEntries2(surveyName, clientId, fulfilledId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SurveyApi;

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

        SurveyApi apiInstance = new SurveyApi(defaultClient);
        String surveyName = "surveyName_example"; // String | 
        Long clientId = 56L; // Long | 
        Long fulfilledId = 56L; // Long | 
        try {
            String result = apiInstance.deleteDatatableEntries2(surveyName, clientId, fulfilledId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SurveyApi#deleteDatatableEntries2");
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
 **surveyName** | **String**|  |
 **clientId** | **Long**|  |
 **fulfilledId** | **Long**|  |

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


## getClientSurveyOverview

> String getClientSurveyOverview(surveyName, clientId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SurveyApi;

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

        SurveyApi apiInstance = new SurveyApi(defaultClient);
        String surveyName = "surveyName_example"; // String | 
        Long clientId = 56L; // Long | 
        try {
            String result = apiInstance.getClientSurveyOverview(surveyName, clientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SurveyApi#getClientSurveyOverview");
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
 **surveyName** | **String**|  |
 **clientId** | **Long**|  |

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


## getSurveyEntry

> String getSurveyEntry(surveyName, clientId, entryId)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SurveyApi;

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

        SurveyApi apiInstance = new SurveyApi(defaultClient);
        String surveyName = "surveyName_example"; // String | 
        Long clientId = 56L; // Long | 
        Long entryId = 56L; // Long | 
        try {
            String result = apiInstance.getSurveyEntry(surveyName, clientId, entryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SurveyApi#getSurveyEntry");
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
 **surveyName** | **String**|  |
 **clientId** | **Long**|  |
 **entryId** | **Long**|  |

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


## register

> String register(surveyName, apptable, body)



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SurveyApi;

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

        SurveyApi apiInstance = new SurveyApi(defaultClient);
        String surveyName = "surveyName_example"; // String | 
        String apptable = "apptable_example"; // String | 
        String body = "body_example"; // String | 
        try {
            String result = apiInstance.register(surveyName, apptable, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SurveyApi#register");
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
 **surveyName** | **String**|  |
 **apptable** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## retrieveSurvey

> GetSurveyResponse retrieveSurvey(surveyName)

Retrieve survey

Lists a registered survey table details and the Apache Fineract Core application table they are registered to.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SurveyApi;

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

        SurveyApi apiInstance = new SurveyApi(defaultClient);
        String surveyName = "surveyName_example"; // String | surveyName
        try {
            GetSurveyResponse result = apiInstance.retrieveSurvey(surveyName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SurveyApi#retrieveSurvey");
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
 **surveyName** | **String**| surveyName |

### Return type

[**GetSurveyResponse**](GetSurveyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveSurveys

> List&lt;GetSurveyResponse&gt; retrieveSurveys()

Retrieve surveys

Retrieve surveys. This allows to retrieve the list of survey tables registered .

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.SurveyApi;

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

        SurveyApi apiInstance = new SurveyApi(defaultClient);
        try {
            List<GetSurveyResponse> result = apiInstance.retrieveSurveys();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SurveyApi#retrieveSurveys");
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

[**List&lt;GetSurveyResponse&gt;**](GetSurveyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

