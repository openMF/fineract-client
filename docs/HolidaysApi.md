# HolidaysApi

All URIs are relative to *https://localhost:8443/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNewHoliday**](HolidaysApi.md#createNewHoliday) | **POST** holidays | Create a Holiday
[**delete7**](HolidaysApi.md#delete7) | **DELETE** holidays/{holidayId} | Delete a Holiday
[**handleCommands1**](HolidaysApi.md#handleCommands1) | **POST** holidays/{holidayId} | Activate a Holiday
[**retrieveAllHolidays**](HolidaysApi.md#retrieveAllHolidays) | **GET** holidays | List Holidays
[**retrieveOne7**](HolidaysApi.md#retrieveOne7) | **GET** holidays/{holidayId} | Retrieve a Holiday
[**retrieveRepaymentScheduleUpdationTyeOptions**](HolidaysApi.md#retrieveRepaymentScheduleUpdationTyeOptions) | **GET** holidays/template | 
[**update6**](HolidaysApi.md#update6) | **PUT** holidays/{holidayId} | Update a Holiday



## createNewHoliday

> PostHolidaysResponse createNewHoliday(postHolidaysRequest)

Create a Holiday

Mandatory Fields: name, description, fromDate, toDate, repaymentsRescheduledTo, offices

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.HolidaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        HolidaysApi apiInstance = new HolidaysApi(defaultClient);
        PostHolidaysRequest postHolidaysRequest = new PostHolidaysRequest(); // PostHolidaysRequest | 
        try {
            PostHolidaysResponse result = apiInstance.createNewHoliday(postHolidaysRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HolidaysApi#createNewHoliday");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postHolidaysRequest** | [**PostHolidaysRequest**](PostHolidaysRequest.md)|  |

### Return type

[**PostHolidaysResponse**](PostHolidaysResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## delete7

> DeleteHolidaysHolidayIdResponse delete7(holidayId)

Delete a Holiday

This API allows to delete a holiday. This is a soft delete the deleted holiday status is marked as deleted.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.HolidaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        HolidaysApi apiInstance = new HolidaysApi(defaultClient);
        Long holidayId = 56L; // Long | holidayId
        try {
            DeleteHolidaysHolidayIdResponse result = apiInstance.delete7(holidayId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HolidaysApi#delete7");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **holidayId** | **Long**| holidayId |

### Return type

[**DeleteHolidaysHolidayIdResponse**](DeleteHolidaysHolidayIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## handleCommands1

> PostHolidaysHolidayIdResponse handleCommands1(holidayId, body, command)

Activate a Holiday

Always Holidays are created in pending state. This API allows to activate a holiday.  Only the active holidays are considered for rescheduling the loan repayment.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.HolidaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        HolidaysApi apiInstance = new HolidaysApi(defaultClient);
        Long holidayId = 56L; // Long | holidayId
        Object body = null; // Object | 
        String command = "command_example"; // String | command
        try {
            PostHolidaysHolidayIdResponse result = apiInstance.handleCommands1(holidayId, body, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HolidaysApi#handleCommands1");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **holidayId** | **Long**| holidayId |
 **body** | **Object**|  |
 **command** | **String**| command | [optional]

### Return type

[**PostHolidaysHolidayIdResponse**](PostHolidaysHolidayIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveAllHolidays

> List&lt;GetHolidaysResponse&gt; retrieveAllHolidays(officeId, fromDate, toDate, locale, dateFormat)

List Holidays

Example Requests:  holidays?officeId&#x3D;1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.HolidaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        HolidaysApi apiInstance = new HolidaysApi(defaultClient);
        Long officeId = 56L; // Long | officeId
        Object fromDate = null; // Object | fromDate
        Object toDate = null; // Object | toDate
        String locale = "locale_example"; // String | locale
        String dateFormat = "dateFormat_example"; // String | dateFormat
        try {
            List<GetHolidaysResponse> result = apiInstance.retrieveAllHolidays(officeId, fromDate, toDate, locale, dateFormat);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HolidaysApi#retrieveAllHolidays");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**| officeId | [optional]
 **fromDate** | [**Object**](.md)| fromDate | [optional]
 **toDate** | [**Object**](.md)| toDate | [optional]
 **locale** | **String**| locale | [optional]
 **dateFormat** | **String**| dateFormat | [optional]

### Return type

[**List&lt;GetHolidaysResponse&gt;**](GetHolidaysResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveOne7

> GetHolidaysResponse retrieveOne7(holidayId)

Retrieve a Holiday

Example Requests:  holidays/1

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.HolidaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        HolidaysApi apiInstance = new HolidaysApi(defaultClient);
        Long holidayId = 56L; // Long | holidayId
        try {
            GetHolidaysResponse result = apiInstance.retrieveOne7(holidayId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HolidaysApi#retrieveOne7");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **holidayId** | **Long**| holidayId |

### Return type

[**GetHolidaysResponse**](GetHolidaysResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## retrieveRepaymentScheduleUpdationTyeOptions

> String retrieveRepaymentScheduleUpdationTyeOptions()



### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.HolidaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        HolidaysApi apiInstance = new HolidaysApi(defaultClient);
        try {
            String result = apiInstance.retrieveRepaymentScheduleUpdationTyeOptions();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HolidaysApi#retrieveRepaymentScheduleUpdationTyeOptions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**String**

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | default response |  -  |


## update6

> PutHolidaysHolidayIdResponse update6(holidayId, putHolidaysHolidayIdRequest)

Update a Holiday

If a holiday is in pending state (created and not activated) then all fields are allowed to modify. Once holidays become active only name and descriptions are allowed to modify.

### Example

```java
// Import classes:
import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.ApiException;
import org.apache.fineract.client.Configuration;
import org.apache.fineract.client.auth.*;
import org.apache.fineract.client.models.*;
import org.apache.fineract.client.services.HolidaysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:8443/fineract-provider/api/v1");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        // Configure API key authorization: tenantid
        ApiKeyAuth tenantid = (ApiKeyAuth) defaultClient.getAuthentication("tenantid");
        tenantid.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //tenantid.setApiKeyPrefix("Token");

        HolidaysApi apiInstance = new HolidaysApi(defaultClient);
        Long holidayId = 56L; // Long | holidayId
        PutHolidaysHolidayIdRequest putHolidaysHolidayIdRequest = new PutHolidaysHolidayIdRequest(); // PutHolidaysHolidayIdRequest | 
        try {
            PutHolidaysHolidayIdResponse result = apiInstance.update6(holidayId, putHolidaysHolidayIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HolidaysApi#update6");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **holidayId** | **Long**| holidayId |
 **putHolidaysHolidayIdRequest** | [**PutHolidaysHolidayIdRequest**](PutHolidaysHolidayIdRequest.md)|  |

### Return type

[**PutHolidaysHolidayIdResponse**](PutHolidaysHolidayIdResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tenantid](../README.md#tenantid)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

