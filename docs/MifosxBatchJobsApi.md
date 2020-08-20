# MifosxBatchJobsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executeJob**](MifosxBatchJobsApi.md#executeJob) | **POST** jobs/{jobId} | Run a Job
[**retrieveAll**](MifosxBatchJobsApi.md#retrieveAll) | **GET** jobs | Retrieve Scheduler Jobs
[**retrieveHistory**](MifosxBatchJobsApi.md#retrieveHistory) | **GET** jobs/{jobId}/runhistory | Retrieve Job Run History
[**retrieveOne**](MifosxBatchJobsApi.md#retrieveOne) | **GET** jobs/{jobId} | Retrieve a Job
[**updateJobDetail**](MifosxBatchJobsApi.md#updateJobDetail) | **PUT** jobs/{jobId} | Update a Job


<a name="executeJob"></a>
# **executeJob**
> executeJob(jobId, command)

Run a Job

Manually Execute Specific Job.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MifosxBatchJobsApi;


MifosxBatchJobsApi apiInstance = new MifosxBatchJobsApi();
Long jobId = 789L; // Long | jobId
String command = "command_example"; // String | command
try {
    apiInstance.executeJob(jobId, command);
} catch (ApiException e) {
    System.err.println("Exception when calling MifosxBatchJobsApi#executeJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Long**| jobId |
 **command** | **String**| command | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetJobsResponse&gt; retrieveAll()

Retrieve Scheduler Jobs

Returns the list of jobs.  Example Requests:  jobs

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MifosxBatchJobsApi;


MifosxBatchJobsApi apiInstance = new MifosxBatchJobsApi();
try {
    List<GetJobsResponse> result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MifosxBatchJobsApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetJobsResponse&gt;**](GetJobsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveHistory"></a>
# **retrieveHistory**
> GetJobsJobIDJobRunHistoryResponse retrieveHistory(jobId, offset, limit, orderBy, sortOrder)

Retrieve Job Run History

Example Requests:  jobs/5/runhistory?offset&#x3D;0&amp;limit&#x3D;200

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MifosxBatchJobsApi;


MifosxBatchJobsApi apiInstance = new MifosxBatchJobsApi();
Long jobId = 789L; // Long | jobId
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
try {
    GetJobsJobIDJobRunHistoryResponse result = apiInstance.retrieveHistory(jobId, offset, limit, orderBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MifosxBatchJobsApi#retrieveHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Long**| jobId |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**GetJobsJobIDJobRunHistoryResponse**](GetJobsJobIDJobRunHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetJobsResponse retrieveOne(jobId)

Retrieve a Job

Returns the details of a Job.  Example Requests:  jobs/5

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MifosxBatchJobsApi;


MifosxBatchJobsApi apiInstance = new MifosxBatchJobsApi();
Long jobId = 789L; // Long | jobId
try {
    GetJobsResponse result = apiInstance.retrieveOne(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MifosxBatchJobsApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Long**| jobId |

### Return type

[**GetJobsResponse**](GetJobsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateJobDetail"></a>
# **updateJobDetail**
> updateJobDetail(jobId, body)

Update a Job

Updates the details of a job.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MifosxBatchJobsApi;


MifosxBatchJobsApi apiInstance = new MifosxBatchJobsApi();
Long jobId = 789L; // Long | jobId
PutJobsJobsIDRequest body = new PutJobsJobsIDRequest(); // PutJobsJobsIDRequest | body
try {
    apiInstance.updateJobDetail(jobId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling MifosxBatchJobsApi#updateJobDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Long**| jobId |
 **body** | [**PutJobsJobsIDRequest**](PutJobsJobsIDRequest.md)| body |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

