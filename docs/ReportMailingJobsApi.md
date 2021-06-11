# ReportMailingJobsApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReportMailingJob**](ReportMailingJobsApi.md#createReportMailingJob) | **POST** reportmailingjobs | Create a Report Mailing Job
[**deleteReportMailingJob**](ReportMailingJobsApi.md#deleteReportMailingJob) | **DELETE** reportmailingjobs/{entityId} | Delete a Report Mailing Job
[**retrieveAllReportMailingJobs**](ReportMailingJobsApi.md#retrieveAllReportMailingJobs) | **GET** reportmailingjobs | List Report Mailing Jobs
[**retrieveReportMailingJob**](ReportMailingJobsApi.md#retrieveReportMailingJob) | **GET** reportmailingjobs/{entityId} | Retrieve a Report Mailing Job
[**retrieveReportMailingJobTemplate**](ReportMailingJobsApi.md#retrieveReportMailingJobTemplate) | **GET** reportmailingjobs/template | Retrieve Report Mailing Job Details Template
[**updateReportMailingJob**](ReportMailingJobsApi.md#updateReportMailingJob) | **PUT** reportmailingjobs/{entityId} | Update a Report Mailing Job 



## createReportMailingJob

> PostReportMailingJobsResponse createReportMailingJob(postReportMailingJobsRequest)

Create a Report Mailing Job

Mandatory Fields: name, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, emailAttachmentFileFormatId, recurrence, isActive  Optional Fields: description, stretchyReportParamMap

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ReportMailingJobsApi;

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

        ReportMailingJobsApi apiInstance = new ReportMailingJobsApi(defaultClient);
        PostReportMailingJobsRequest postReportMailingJobsRequest = new PostReportMailingJobsRequest(); // PostReportMailingJobsRequest | 
        try {
            PostReportMailingJobsResponse result = apiInstance.createReportMailingJob(postReportMailingJobsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportMailingJobsApi#createReportMailingJob");
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
 **postReportMailingJobsRequest** | [**PostReportMailingJobsRequest**](PostReportMailingJobsRequest.md)|  |

### Return type

[**PostReportMailingJobsResponse**](PostReportMailingJobsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteReportMailingJob

> DeleteReportMailingJobsResponse deleteReportMailingJob(entityId, body)

Delete a Report Mailing Job

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ReportMailingJobsApi;

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

        ReportMailingJobsApi apiInstance = new ReportMailingJobsApi(defaultClient);
        Long entityId = 56L; // Long | entityId
        Object body = null; // Object | 
        try {
            DeleteReportMailingJobsResponse result = apiInstance.deleteReportMailingJob(entityId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportMailingJobsApi#deleteReportMailingJob");
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
 **entityId** | **Long**| entityId |
 **body** | **Object**|  |

### Return type

[**DeleteReportMailingJobsResponse**](DeleteReportMailingJobsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllReportMailingJobs

> List&lt;GetReportMailingJobsResponse&gt; retrieveAllReportMailingJobs(offset, limit, orderBy, sortOrder)

List Report Mailing Jobs

Example Requests:  reportmailingjobs

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ReportMailingJobsApi;

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

        ReportMailingJobsApi apiInstance = new ReportMailingJobsApi(defaultClient);
        Integer offset = 56; // Integer | offset
        Integer limit = 56; // Integer | limit
        String orderBy = "orderBy_example"; // String | orderBy
        String sortOrder = "sortOrder_example"; // String | sortOrder
        try {
            List<GetReportMailingJobsResponse> result = apiInstance.retrieveAllReportMailingJobs(offset, limit, orderBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportMailingJobsApi#retrieveAllReportMailingJobs");
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
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**List&lt;GetReportMailingJobsResponse&gt;**](GetReportMailingJobsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveReportMailingJob

> GetReportMailingJobsResponse retrieveReportMailingJob(entityId)

Retrieve a Report Mailing Job

Example Requests:  reportmailingjobs/1   reportmailingjobs/1?template&#x3D;true

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ReportMailingJobsApi;

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

        ReportMailingJobsApi apiInstance = new ReportMailingJobsApi(defaultClient);
        Long entityId = 56L; // Long | entityId
        try {
            GetReportMailingJobsResponse result = apiInstance.retrieveReportMailingJob(entityId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportMailingJobsApi#retrieveReportMailingJob");
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
 **entityId** | **Long**| entityId |

### Return type

[**GetReportMailingJobsResponse**](GetReportMailingJobsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveReportMailingJobTemplate

> GetReportMailingJobsTemplate retrieveReportMailingJobTemplate()

Retrieve Report Mailing Job Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for report mailing job applications. The template data returned consists of any or all of:  Field Defaults Allowed description Lists Example Request:  reportmailingjobs/template

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ReportMailingJobsApi;

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

        ReportMailingJobsApi apiInstance = new ReportMailingJobsApi(defaultClient);
        try {
            GetReportMailingJobsTemplate result = apiInstance.retrieveReportMailingJobTemplate();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportMailingJobsApi#retrieveReportMailingJobTemplate");
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

[**GetReportMailingJobsTemplate**](GetReportMailingJobsTemplate.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateReportMailingJob

> PutReportMailingJobsResponse updateReportMailingJob(entityId, putReportMailingJobsRequest)

Update a Report Mailing Job 

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.ReportMailingJobsApi;

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

        ReportMailingJobsApi apiInstance = new ReportMailingJobsApi(defaultClient);
        Long entityId = 56L; // Long | entityId
        PutReportMailingJobsRequest putReportMailingJobsRequest = new PutReportMailingJobsRequest(); // PutReportMailingJobsRequest | 
        try {
            PutReportMailingJobsResponse result = apiInstance.updateReportMailingJob(entityId, putReportMailingJobsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportMailingJobsApi#updateReportMailingJob");
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
 **entityId** | **Long**| entityId |
 **putReportMailingJobsRequest** | [**PutReportMailingJobsRequest**](PutReportMailingJobsRequest.md)|  |

### Return type

[**PutReportMailingJobsResponse**](PutReportMailingJobsResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

