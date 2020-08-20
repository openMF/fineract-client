# ReportMailingJobsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReportMailingJob**](ReportMailingJobsApi.md#createReportMailingJob) | **POST** reportmailingjobs | Create a Report Mailing Job
[**deleteReportMailingJob**](ReportMailingJobsApi.md#deleteReportMailingJob) | **DELETE** reportmailingjobs/{entityId} | Delete a Report Mailing Job
[**retrieveAllReportMailingJobs**](ReportMailingJobsApi.md#retrieveAllReportMailingJobs) | **GET** reportmailingjobs | List Report Mailing Jobs
[**retrieveReportMailingJob**](ReportMailingJobsApi.md#retrieveReportMailingJob) | **GET** reportmailingjobs/{entityId} | Retrieve a Report Mailing Job
[**retrieveReportMailingJobTemplate**](ReportMailingJobsApi.md#retrieveReportMailingJobTemplate) | **GET** reportmailingjobs/template | Retrieve Report Mailing Job Details Template
[**updateReportMailingJob**](ReportMailingJobsApi.md#updateReportMailingJob) | **PUT** reportmailingjobs/{entityId} | Update a Report Mailing Job 


<a name="createReportMailingJob"></a>
# **createReportMailingJob**
> PostReportMailingJobsResponse createReportMailingJob(body)

Create a Report Mailing Job

Mandatory Fields: name, startDateTime, stretchyReportId, emailRecipients, emailSubject, emailMessage, emailAttachmentFileFormatId, recurrence, isActive  Optional Fields: description, stretchyReportParamMap

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ReportMailingJobsApi;


ReportMailingJobsApi apiInstance = new ReportMailingJobsApi();
PostReportMailingJobsRequest body = new PostReportMailingJobsRequest(); // PostReportMailingJobsRequest | body
try {
    PostReportMailingJobsResponse result = apiInstance.createReportMailingJob(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportMailingJobsApi#createReportMailingJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostReportMailingJobsRequest**](PostReportMailingJobsRequest.md)| body |

### Return type

[**PostReportMailingJobsResponse**](PostReportMailingJobsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReportMailingJob"></a>
# **deleteReportMailingJob**
> DeleteReportMailingJobsResponse deleteReportMailingJob(entityId, body)

Delete a Report Mailing Job



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ReportMailingJobsApi;


ReportMailingJobsApi apiInstance = new ReportMailingJobsApi();
Long entityId = 789L; // Long | entityId
DeleteReportMailingJobsRequest body = new DeleteReportMailingJobsRequest(); // DeleteReportMailingJobsRequest | body
try {
    DeleteReportMailingJobsResponse result = apiInstance.deleteReportMailingJob(entityId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportMailingJobsApi#deleteReportMailingJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **Long**| entityId |
 **body** | [**DeleteReportMailingJobsRequest**](DeleteReportMailingJobsRequest.md)| body |

### Return type

[**DeleteReportMailingJobsResponse**](DeleteReportMailingJobsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllReportMailingJobs"></a>
# **retrieveAllReportMailingJobs**
> List&lt;GetReportMailingJobsResponse&gt; retrieveAllReportMailingJobs(offset, limit, orderBy, sortOrder)

List Report Mailing Jobs

Example Requests:  reportmailingjobs

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ReportMailingJobsApi;


ReportMailingJobsApi apiInstance = new ReportMailingJobsApi();
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
try {
    List<GetReportMailingJobsResponse> result = apiInstance.retrieveAllReportMailingJobs(offset, limit, orderBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportMailingJobsApi#retrieveAllReportMailingJobs");
    e.printStackTrace();
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

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveReportMailingJob"></a>
# **retrieveReportMailingJob**
> GetReportMailingJobsResponse retrieveReportMailingJob(entityId)

Retrieve a Report Mailing Job

Example Requests:  reportmailingjobs/1   reportmailingjobs/1?template&#x3D;true

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ReportMailingJobsApi;


ReportMailingJobsApi apiInstance = new ReportMailingJobsApi();
Long entityId = 789L; // Long | entityId
try {
    GetReportMailingJobsResponse result = apiInstance.retrieveReportMailingJob(entityId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportMailingJobsApi#retrieveReportMailingJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **Long**| entityId |

### Return type

[**GetReportMailingJobsResponse**](GetReportMailingJobsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveReportMailingJobTemplate"></a>
# **retrieveReportMailingJobTemplate**
> GetReportMailingJobsTemplate retrieveReportMailingJobTemplate()

Retrieve Report Mailing Job Details Template

This is a convenience resource. It can be useful when building maintenance user interface screens for report mailing job applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  reportmailingjobs/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ReportMailingJobsApi;


ReportMailingJobsApi apiInstance = new ReportMailingJobsApi();
try {
    GetReportMailingJobsTemplate result = apiInstance.retrieveReportMailingJobTemplate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportMailingJobsApi#retrieveReportMailingJobTemplate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetReportMailingJobsTemplate**](GetReportMailingJobsTemplate.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReportMailingJob"></a>
# **updateReportMailingJob**
> PutReportMailingJobsResponse updateReportMailingJob(entityId, body)

Update a Report Mailing Job 



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ReportMailingJobsApi;


ReportMailingJobsApi apiInstance = new ReportMailingJobsApi();
Long entityId = 789L; // Long | entityId
PutReportMailingJobsRequest body = new PutReportMailingJobsRequest(); // PutReportMailingJobsRequest | body
try {
    PutReportMailingJobsResponse result = apiInstance.updateReportMailingJob(entityId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportMailingJobsApi#updateReportMailingJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entityId** | **Long**| entityId |
 **body** | [**PutReportMailingJobsRequest**](PutReportMailingJobsRequest.md)| body |

### Return type

[**PutReportMailingJobsResponse**](PutReportMailingJobsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

