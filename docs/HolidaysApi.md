# HolidaysApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HolidaysApi;


HolidaysApi apiInstance = new HolidaysApi();
PostHolidaysRequest body = new PostHolidaysRequest(); // PostHolidaysRequest | body
try {
    PostHolidaysResponse result = apiInstance.createNewHoliday(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HolidaysApi#createNewHoliday");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HolidaysApi;


HolidaysApi apiInstance = new HolidaysApi();
Long holidayId = 789L; // Long | holidayId
try {
    DeleteHolidaysHolidayIdResponse result = apiInstance.delete(holidayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HolidaysApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HolidaysApi;


HolidaysApi apiInstance = new HolidaysApi();
Long holidayId = 789L; // Long | holidayId
PostHolidaysHolidayIdRequest body = new PostHolidaysHolidayIdRequest(); // PostHolidaysHolidayIdRequest | body
String command = "command_example"; // String | command
try {
    PostHolidaysHolidayIdResponse result = apiInstance.handleCommands(holidayId, body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HolidaysApi#handleCommands");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HolidaysApi;


HolidaysApi apiInstance = new HolidaysApi();
Long officeId = 789L; // Long | officeId
String fromDate = "fromDate_example"; // String | fromDate
String toDate = "toDate_example"; // String | toDate
String locale = "locale_example"; // String | locale
String dateFormat = "dateFormat_example"; // String | dateFormat
try {
    List<GetHolidaysResponse> result = apiInstance.retrieveAllHolidays(officeId, fromDate, toDate, locale, dateFormat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HolidaysApi#retrieveAllHolidays");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HolidaysApi;


HolidaysApi apiInstance = new HolidaysApi();
Long holidayId = 789L; // Long | holidayId
try {
    GetHolidaysResponse result = apiInstance.retrieveOne(holidayId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HolidaysApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HolidaysApi;


HolidaysApi apiInstance = new HolidaysApi();
try {
    String result = apiInstance.retrieveRepaymentScheduleUpdationTyeOptions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HolidaysApi#retrieveRepaymentScheduleUpdationTyeOptions");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.HolidaysApi;


HolidaysApi apiInstance = new HolidaysApi();
Long holidayId = 789L; // Long | holidayId
PutHolidaysHolidayIdRequest body = new PutHolidaysHolidayIdRequest(); // PutHolidaysHolidayIdRequest | body
try {
    PutHolidaysHolidayIdResponse result = apiInstance.update(holidayId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HolidaysApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **holidayId** | **Long**| holidayId |
 **body** | [**PutHolidaysHolidayIdRequest**](PutHolidaysHolidayIdRequest.md)| body |

### Return type

[**PutHolidaysHolidayIdResponse**](PutHolidaysHolidayIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

