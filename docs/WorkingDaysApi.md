# WorkingDaysApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAll**](WorkingDaysApi.md#retrieveAll) | **GET** workingdays | List Working days
[**template**](WorkingDaysApi.md#template) | **GET** workingdays/template | Working Days Template
[**update**](WorkingDaysApi.md#update) | **PUT** workingdays | Update a Working Day


<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetWorkingDaysResponse&gt; retrieveAll()

List Working days

Example Requests:  workingdays

### Example
```java

WorkingDaysApi apiService = defaultClient.createService(WorkingDaysApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetWorkingDaysResponse&gt;> call = apiService.retrieveAll();
call.enqueue(new Callback<List&lt;GetWorkingDaysResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetWorkingDaysResponse&gt;> call, Response<List&lt;GetWorkingDaysResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetWorkingDaysResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetWorkingDaysResponse&gt;**](GetWorkingDaysResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetWorkingDaysTemplateResponse template()

Working Days Template

This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template

### Example
```java

WorkingDaysApi apiService = defaultClient.createService(WorkingDaysApi.class);

// Initialize these parameters earlier.
Call<GetWorkingDaysTemplateResponse> call = apiService.template();
call.enqueue(new Callback<GetWorkingDaysTemplateResponse>() {
    @Override
    public void onResponse(Call<GetWorkingDaysTemplateResponse> call, Response<GetWorkingDaysTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetWorkingDaysTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetWorkingDaysTemplateResponse**](GetWorkingDaysTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutWorkingDaysResponse update(body)

Update a Working Day

Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale

### Example
```java

WorkingDaysApi apiService = defaultClient.createService(WorkingDaysApi.class);

// Initialize these parameters earlier.
Call<PutWorkingDaysResponse> call = apiService.update(body);
call.enqueue(new Callback<PutWorkingDaysResponse>() {
    @Override
    public void onResponse(Call<PutWorkingDaysResponse> call, Response<PutWorkingDaysResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutWorkingDaysResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PutWorkingDaysRequest**](PutWorkingDaysRequest.md)| body |

### Return type

[**PutWorkingDaysResponse**](PutWorkingDaysResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

