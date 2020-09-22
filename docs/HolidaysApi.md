# HolidaysApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewHoliday**](HolidaysApi.md#createNewHoliday) | **POST** holidays | Create a Holiday
[**delete**](HolidaysApi.md#delete) | **DELETE** holidays/{holidayId} | Delete a Holiday
[**handleCommands**](HolidaysApi.md#handleCommands) | **POST** holidays/{holidayId} | Activate a Holiday
[**retrieveAllHolidays**](HolidaysApi.md#retrieveAllHolidays) | **GET** holidays | List Holidays
[**retrieveOne**](HolidaysApi.md#retrieveOne) | **GET** holidays/{holidayId} | Retrieve a Holiday
[**retrieveRepaymentScheduleUpdationTyeOptions**](HolidaysApi.md#retrieveRepaymentScheduleUpdationTyeOptions) | **GET** holidays/template | 
[**update**](HolidaysApi.md#update) | **PUT** holidays/{holidayId} | Update a Holiday


<a name="createNewHoliday"></a>
# **createNewHoliday**
> PostHolidaysResponse createNewHoliday(body)

Create a Holiday

Mandatory Fields: name, description, fromDate, toDate, repaymentsRescheduledTo, offices

### Example
```java

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<PostHolidaysResponse> call = apiService.createNewHoliday(body);
call.enqueue(new Callback<PostHolidaysResponse>() {
    @Override
    public void onResponse(Call<PostHolidaysResponse> call, Response<PostHolidaysResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostHolidaysResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostHolidaysRequest**](PostHolidaysRequest.md)| body |

### Return type

[**PostHolidaysResponse**](PostHolidaysResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteHolidaysHolidayIdResponse delete(holidayId)

Delete a Holiday

This API allows to delete a holiday. This is a soft delete the deleted holiday status is marked as deleted.

### Example
```java

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<DeleteHolidaysHolidayIdResponse> call = apiService.delete(holidayId);
call.enqueue(new Callback<DeleteHolidaysHolidayIdResponse>() {
    @Override
    public void onResponse(Call<DeleteHolidaysHolidayIdResponse> call, Response<DeleteHolidaysHolidayIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteHolidaysHolidayIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **holidayId** | **Long**| holidayId |

### Return type

[**DeleteHolidaysHolidayIdResponse**](DeleteHolidaysHolidayIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="handleCommands"></a>
# **handleCommands**
> PostHolidaysHolidayIdResponse handleCommands(holidayId, body, command)

Activate a Holiday

Always Holidays are created in pending state. This API allows to activate a holiday.  Only the active holidays are considered for rescheduling the loan repayment.

### Example
```java

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<PostHolidaysHolidayIdResponse> call = apiService.handleCommands(holidayId, body, command);
call.enqueue(new Callback<PostHolidaysHolidayIdResponse>() {
    @Override
    public void onResponse(Call<PostHolidaysHolidayIdResponse> call, Response<PostHolidaysHolidayIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostHolidaysHolidayIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **holidayId** | **Long**| holidayId |
 **body** | [**PostHolidaysHolidayIdRequest**](PostHolidaysHolidayIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostHolidaysHolidayIdResponse**](PostHolidaysHolidayIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllHolidays"></a>
# **retrieveAllHolidays**
> List&lt;GetHolidaysResponse&gt; retrieveAllHolidays(officeId, fromDate, toDate, locale, dateFormat)

List Holidays

Example Requests:  holidays?officeId&#x3D;1

### Example
```java

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetHolidaysResponse&gt;> call = apiService.retrieveAllHolidays(officeId, fromDate, toDate, locale, dateFormat);
call.enqueue(new Callback<List&lt;GetHolidaysResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetHolidaysResponse&gt;> call, Response<List&lt;GetHolidaysResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetHolidaysResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **officeId** | **Long**| officeId | [optional]
 **fromDate** | **String**| fromDate | [optional]
 **toDate** | **String**| toDate | [optional]
 **locale** | **String**| locale | [optional]
 **dateFormat** | **String**| dateFormat | [optional]

### Return type

[**List&lt;GetHolidaysResponse&gt;**](GetHolidaysResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetHolidaysResponse retrieveOne(holidayId)

Retrieve a Holiday

Example Requests:  holidays/1

### Example
```java

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<GetHolidaysResponse> call = apiService.retrieveOne(holidayId);
call.enqueue(new Callback<GetHolidaysResponse>() {
    @Override
    public void onResponse(Call<GetHolidaysResponse> call, Response<GetHolidaysResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetHolidaysResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **holidayId** | **Long**| holidayId |

### Return type

[**GetHolidaysResponse**](GetHolidaysResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveRepaymentScheduleUpdationTyeOptions"></a>
# **retrieveRepaymentScheduleUpdationTyeOptions**
> String retrieveRepaymentScheduleUpdationTyeOptions()



### Example
```java

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveRepaymentScheduleUpdationTyeOptions();
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutHolidaysHolidayIdResponse update(holidayId, body)

Update a Holiday

If a holiday is in pending state (created and not activated) then all fields are allowed to modify. Once holidays become active only name and descriptions are allowed to modify.

### Example
```java

HolidaysApi apiService = defaultClient.createService(HolidaysApi.class);

// Initialize these parameters earlier.
Call<PutHolidaysHolidayIdResponse> call = apiService.update(holidayId, body);
call.enqueue(new Callback<PutHolidaysHolidayIdResponse>() {
    @Override
    public void onResponse(Call<PutHolidaysHolidayIdResponse> call, Response<PutHolidaysHolidayIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutHolidaysHolidayIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **holidayId** | **Long**| holidayId |
 **body** | [**PutHolidaysHolidayIdRequest**](PutHolidaysHolidayIdRequest.md)| body |

### Return type

[**PutHolidaysHolidayIdResponse**](PutHolidaysHolidayIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

