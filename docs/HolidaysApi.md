# HolidaysApi

All URIs are relative to *http://localhost/fineract-provider/api/v1*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createNewHoliday**](HolidaysApi.md#createNewHoliday) | **POST** v1/holidays | Create a Holiday |
| [**delete7**](HolidaysApi.md#delete7) | **DELETE** v1/holidays/{holidayId} | Delete a Holiday |
| [**handleCommands1**](HolidaysApi.md#handleCommands1) | **POST** v1/holidays/{holidayId} | Activate a Holiday |
| [**retrieveAllHolidays**](HolidaysApi.md#retrieveAllHolidays) | **GET** v1/holidays | List Holidays |
| [**retrieveOne7**](HolidaysApi.md#retrieveOne7) | **GET** v1/holidays/{holidayId} | Retrieve a Holiday |
| [**retrieveRepaymentScheduleUpdationTyeOptions**](HolidaysApi.md#retrieveRepaymentScheduleUpdationTyeOptions) | **GET** v1/holidays/template |  |
| [**update6**](HolidaysApi.md#update6) | **PUT** v1/holidays/{holidayId} | Update a Holiday |



Create a Holiday

Mandatory Fields: name, description, fromDate, toDate, repaymentsRescheduledTo, offices

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HolidaysApi::class.java)
val postHolidaysRequest : PostHolidaysRequest =  // PostHolidaysRequest | 

launch(Dispatchers.IO) {
    val result : PostHolidaysResponse = webService.createNewHoliday(postHolidaysRequest)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **postHolidaysRequest** | [**PostHolidaysRequest**](PostHolidaysRequest.md)|  | |

### Return type

[**PostHolidaysResponse**](PostHolidaysResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


Delete a Holiday

This API allows to delete a holiday. This is a soft delete the deleted holiday status is marked as deleted.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HolidaysApi::class.java)
val holidayId : kotlin.Long = 789 // kotlin.Long | holidayId

launch(Dispatchers.IO) {
    val result : DeleteHolidaysHolidayIdResponse = webService.delete7(holidayId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **holidayId** | **kotlin.Long**| holidayId | |

### Return type

[**DeleteHolidaysHolidayIdResponse**](DeleteHolidaysHolidayIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Activate a Holiday

Always Holidays are created in pending state. This API allows to activate a holiday.  Only the active holidays are considered for rescheduling the loan repayment.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HolidaysApi::class.java)
val holidayId : kotlin.Long = 789 // kotlin.Long | holidayId
val body : kotlin.Any = Object // kotlin.Any | 
val command : kotlin.String = command_example // kotlin.String | command

launch(Dispatchers.IO) {
    val result : PostHolidaysHolidayIdResponse = webService.handleCommands1(holidayId, body, command)
}
```

### Parameters
| **holidayId** | **kotlin.Long**| holidayId | |
| **body** | **kotlin.Any**|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **command** | **kotlin.String**| command | [optional] |

### Return type

[**PostHolidaysHolidayIdResponse**](PostHolidaysHolidayIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


List Holidays

Example Requests:  holidays?officeId&#x3D;1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HolidaysApi::class.java)
val officeId : kotlin.Long = 789 // kotlin.Long | officeId
val fromDate : kotlin.Any = Object // kotlin.Any | fromDate
val toDate : kotlin.Any = Object // kotlin.Any | toDate
val locale : kotlin.String = locale_example // kotlin.String | locale
val dateFormat : kotlin.String = dateFormat_example // kotlin.String | dateFormat

launch(Dispatchers.IO) {
    val result : kotlin.collections.List<GetHolidaysResponse> = webService.retrieveAllHolidays(officeId, fromDate, toDate, locale, dateFormat)
}
```

### Parameters
| **officeId** | **kotlin.Long**| officeId | [optional] |
| **fromDate** | [**kotlin.Any**](.md)| fromDate | [optional] |
| **toDate** | [**kotlin.Any**](.md)| toDate | [optional] |
| **locale** | **kotlin.String**| locale | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **dateFormat** | **kotlin.String**| dateFormat | [optional] |

### Return type

[**kotlin.collections.List&lt;GetHolidaysResponse&gt;**](GetHolidaysResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Retrieve a Holiday

Example Requests:  holidays/1

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HolidaysApi::class.java)
val holidayId : kotlin.Long = 789 // kotlin.Long | holidayId

launch(Dispatchers.IO) {
    val result : GetHolidaysResponse = webService.retrieveOne7(holidayId)
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **holidayId** | **kotlin.Long**| holidayId | |

### Return type

[**GetHolidaysResponse**](GetHolidaysResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json




### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HolidaysApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.String = webService.retrieveRepaymentScheduleUpdationTyeOptions()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.String**

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


Update a Holiday

If a holiday is in pending state (created and not activated) then all fields are allowed to modify. Once holidays become active only name and descriptions are allowed to modify.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiClient = ApiClient()
apiClient.setCredentials("USERNAME", "PASSWORD")
val webService = apiClient.createWebservice(HolidaysApi::class.java)
val holidayId : kotlin.Long = 789 // kotlin.Long | holidayId
val putHolidaysHolidayIdRequest : PutHolidaysHolidayIdRequest =  // PutHolidaysHolidayIdRequest | 

launch(Dispatchers.IO) {
    val result : PutHolidaysHolidayIdResponse = webService.update6(holidayId, putHolidaysHolidayIdRequest)
}
```

### Parameters
| **holidayId** | **kotlin.Long**| holidayId | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **putHolidaysHolidayIdRequest** | [**PutHolidaysHolidayIdRequest**](PutHolidaysHolidayIdRequest.md)|  | |

### Return type

[**PutHolidaysHolidayIdResponse**](PutHolidaysHolidayIdResponse.md)

### Authorization


Configure basicAuth:
    ApiClient().setCredentials("USERNAME", "PASSWORD")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

