# ReportsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createReport**](ReportsApi.md#createReport) | **POST** reports | Create a Report
[**deleteReport**](ReportsApi.md#deleteReport) | **DELETE** reports/{id} | Delete a Report
[**retrieveOfficeTemplate**](ReportsApi.md#retrieveOfficeTemplate) | **GET** reports/template | Retrieve Report Template
[**retrieveReport**](ReportsApi.md#retrieveReport) | **GET** reports/{id} | Retrieve a Report 
[**retrieveReportList**](ReportsApi.md#retrieveReportList) | **GET** reports | List Reports
[**updateReport**](ReportsApi.md#updateReport) | **PUT** reports/{id} | Update a Report


<a name="createReport"></a>
# **createReport**
> PostReportsResponse createReport(body)

Create a Report



### Example
```java

ReportsApi apiService = defaultClient.createService(ReportsApi.class);

// Initialize these parameters earlier.
Call<PostReportsResponse> call = apiService.createReport(body);
call.enqueue(new Callback<PostReportsResponse>() {
    @Override
    public void onResponse(Call<PostReportsResponse> call, Response<PostReportsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostReportsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostRepostRequest**](PostRepostRequest.md)| body |

### Return type

[**PostReportsResponse**](PostReportsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReport"></a>
# **deleteReport**
> DeleteReportsResponse deleteReport(id)

Delete a Report

Only non-core reports can be deleted.

### Example
```java

ReportsApi apiService = defaultClient.createService(ReportsApi.class);

// Initialize these parameters earlier.
Call<DeleteReportsResponse> call = apiService.deleteReport(id);
call.enqueue(new Callback<DeleteReportsResponse>() {
    @Override
    public void onResponse(Call<DeleteReportsResponse> call, Response<DeleteReportsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteReportsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **id** | **Long**| id |

### Return type

[**DeleteReportsResponse**](DeleteReportsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOfficeTemplate"></a>
# **retrieveOfficeTemplate**
> GetReportsTemplateResponse retrieveOfficeTemplate()

Retrieve Report Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Request :   reports/template

### Example
```java

ReportsApi apiService = defaultClient.createService(ReportsApi.class);

// Initialize these parameters earlier.
Call<GetReportsTemplateResponse> call = apiService.retrieveOfficeTemplate();
call.enqueue(new Callback<GetReportsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetReportsTemplateResponse> call, Response<GetReportsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetReportsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetReportsTemplateResponse**](GetReportsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveReport"></a>
# **retrieveReport**
> GetReportsResponse retrieveReport(id)

Retrieve a Report 

Example Requests:  reports/1   reports/1?template&#x3D;true

### Example
```java

ReportsApi apiService = defaultClient.createService(ReportsApi.class);

// Initialize these parameters earlier.
Call<GetReportsResponse> call = apiService.retrieveReport(id);
call.enqueue(new Callback<GetReportsResponse>() {
    @Override
    public void onResponse(Call<GetReportsResponse> call, Response<GetReportsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetReportsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **id** | **Long**| id |

### Return type

[**GetReportsResponse**](GetReportsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveReportList"></a>
# **retrieveReportList**
> retrieveReportList()

List Reports

Lists all reports and their parameters.  Example Request:  reports

### Example
```java

ReportsApi apiService = defaultClient.createService(ReportsApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.retrieveReportList();
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
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReport"></a>
# **updateReport**
> PutReportResponse updateReport(id, body)

Update a Report

Only the useReport value can be updated for core reports.

### Example
```java

ReportsApi apiService = defaultClient.createService(ReportsApi.class);

// Initialize these parameters earlier.
Call<PutReportResponse> call = apiService.updateReport(id, body);
call.enqueue(new Callback<PutReportResponse>() {
    @Override
    public void onResponse(Call<PutReportResponse> call, Response<PutReportResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutReportResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **id** | **Long**| id |
 **body** | [**PutReportRequest**](PutReportRequest.md)| body |

### Return type

[**PutReportResponse**](PutReportResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

