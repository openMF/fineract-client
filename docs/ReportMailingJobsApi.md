# ReportMailingJobsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

ReportMailingJobsApi apiService = defaultClient.createService(ReportMailingJobsApi.class);

// Initialize these parameters earlier.
Call<PostReportMailingJobsResponse> call = apiService.createReportMailingJob(body);
call.enqueue(new Callback<PostReportMailingJobsResponse>() {
    @Override
    public void onResponse(Call<PostReportMailingJobsResponse> call, Response<PostReportMailingJobsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostReportMailingJobsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

ReportMailingJobsApi apiService = defaultClient.createService(ReportMailingJobsApi.class);

// Initialize these parameters earlier.
Call<DeleteReportMailingJobsResponse> call = apiService.deleteReportMailingJob(entityId, body);
call.enqueue(new Callback<DeleteReportMailingJobsResponse>() {
    @Override
    public void onResponse(Call<DeleteReportMailingJobsResponse> call, Response<DeleteReportMailingJobsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteReportMailingJobsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

ReportMailingJobsApi apiService = defaultClient.createService(ReportMailingJobsApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetReportMailingJobsResponse&gt;> call = apiService.retrieveAllReportMailingJobs(offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<List&lt;GetReportMailingJobsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetReportMailingJobsResponse&gt;> call, Response<List&lt;GetReportMailingJobsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetReportMailingJobsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

ReportMailingJobsApi apiService = defaultClient.createService(ReportMailingJobsApi.class);

// Initialize these parameters earlier.
Call<GetReportMailingJobsResponse> call = apiService.retrieveReportMailingJob(entityId);
call.enqueue(new Callback<GetReportMailingJobsResponse>() {
    @Override
    public void onResponse(Call<GetReportMailingJobsResponse> call, Response<GetReportMailingJobsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetReportMailingJobsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

ReportMailingJobsApi apiService = defaultClient.createService(ReportMailingJobsApi.class);

// Initialize these parameters earlier.
Call<GetReportMailingJobsTemplate> call = apiService.retrieveReportMailingJobTemplate();
call.enqueue(new Callback<GetReportMailingJobsTemplate>() {
    @Override
    public void onResponse(Call<GetReportMailingJobsTemplate> call, Response<GetReportMailingJobsTemplate> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetReportMailingJobsTemplate> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

ReportMailingJobsApi apiService = defaultClient.createService(ReportMailingJobsApi.class);

// Initialize these parameters earlier.
Call<PutReportMailingJobsResponse> call = apiService.updateReportMailingJob(entityId, body);
call.enqueue(new Callback<PutReportMailingJobsResponse>() {
    @Override
    public void onResponse(Call<PutReportMailingJobsResponse> call, Response<PutReportMailingJobsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutReportMailingJobsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **entityId** | **Long**| entityId |
 **body** | [**PutReportMailingJobsRequest**](PutReportMailingJobsRequest.md)| body |

### Return type

[**PutReportMailingJobsResponse**](PutReportMailingJobsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

