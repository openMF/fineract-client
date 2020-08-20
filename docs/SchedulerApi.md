# SchedulerApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SchedulerApi;


SchedulerApi apiInstance = new SchedulerApi();
String command = "command_example"; // String | command
try {
    apiInstance.changeSchedulerStatus(command);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulerApi#changeSchedulerStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SchedulerApi;


SchedulerApi apiInstance = new SchedulerApi();
try {
    GetSchedulerResponse result = apiInstance.retrieveStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SchedulerApi#retrieveStatus");
    e.printStackTrace();
}
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

