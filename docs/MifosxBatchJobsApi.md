# MifosxBatchJobsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

MifosxBatchJobsApi apiService = defaultClient.createService(MifosxBatchJobsApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.executeJob(jobId, command);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

MifosxBatchJobsApi apiService = defaultClient.createService(MifosxBatchJobsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetJobsResponse&gt;> call = apiService.retrieveAll();
call.enqueue(new Callback<List&lt;GetJobsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetJobsResponse&gt;> call, Response<List&lt;GetJobsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetJobsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

MifosxBatchJobsApi apiService = defaultClient.createService(MifosxBatchJobsApi.class);

// Initialize these parameters earlier.
Call<GetJobsJobIDJobRunHistoryResponse> call = apiService.retrieveHistory(jobId, offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<GetJobsJobIDJobRunHistoryResponse>() {
    @Override
    public void onResponse(Call<GetJobsJobIDJobRunHistoryResponse> call, Response<GetJobsJobIDJobRunHistoryResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetJobsJobIDJobRunHistoryResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

MifosxBatchJobsApi apiService = defaultClient.createService(MifosxBatchJobsApi.class);

// Initialize these parameters earlier.
Call<GetJobsResponse> call = apiService.retrieveOne(jobId);
call.enqueue(new Callback<GetJobsResponse>() {
    @Override
    public void onResponse(Call<GetJobsResponse> call, Response<GetJobsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetJobsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

MifosxBatchJobsApi apiService = defaultClient.createService(MifosxBatchJobsApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.updateJobDetail(jobId, body);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **jobId** | **Long**| jobId |
 **body** | [**PutJobsJobsIDRequest**](PutJobsJobsIDRequest.md)| body |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

