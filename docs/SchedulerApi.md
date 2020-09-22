# SchedulerApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeSchedulerStatus**](SchedulerApi.md#changeSchedulerStatus) | **POST** scheduler | Activate Scheduler Jobs | Suspend Scheduler Jobs
[**retrieveStatus**](SchedulerApi.md#retrieveStatus) | **GET** scheduler | Retrieve Scheduler Status


<a name="changeSchedulerStatus"></a>
# **changeSchedulerStatus**
> changeSchedulerStatus(command)

Activate Scheduler Jobs | Suspend Scheduler Jobs

Activates the scheduler job service. | Suspends the scheduler job service.

### Example
```java

SchedulerApi apiService = defaultClient.createService(SchedulerApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.changeSchedulerStatus(command);
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

 **command** | **String**| command | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveStatus"></a>
# **retrieveStatus**
> GetSchedulerResponse retrieveStatus()

Retrieve Scheduler Status

Returns the scheduler status.  Example Requests:  scheduler

### Example
```java

SchedulerApi apiService = defaultClient.createService(SchedulerApi.class);

// Initialize these parameters earlier.
Call<GetSchedulerResponse> call = apiService.retrieveStatus();
call.enqueue(new Callback<GetSchedulerResponse>() {
    @Override
    public void onResponse(Call<GetSchedulerResponse> call, Response<GetSchedulerResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSchedulerResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSchedulerResponse**](GetSchedulerResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

