# SmsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SmsApi.md#create) | **POST** sms | 
[**delete**](SmsApi.md#delete) | **DELETE** sms/{resourceId} | 
[**retrieveAll**](SmsApi.md#retrieveAll) | **GET** sms | 
[**retrieveAllSmsByStatus**](SmsApi.md#retrieveAllSmsByStatus) | **GET** sms/{campaignId}/messageByStatus | 
[**retrieveOne**](SmsApi.md#retrieveOne) | **GET** sms/{resourceId} | 
[**update**](SmsApi.md#update) | **PUT** sms/{resourceId} | 


<a name="create"></a>
# **create**
> String create(body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsApi;


SmsApi apiInstance = new SmsApi();
String body = "body_example"; // String | 
try {
    String result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> String delete(resourceId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsApi;


SmsApi apiInstance = new SmsApi();
Long resourceId = 789L; // Long | 
try {
    String result = apiInstance.delete(resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> String retrieveAll()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsApi;


SmsApi apiInstance = new SmsApi();
try {
    String result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#retrieveAll");
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

<a name="retrieveAllSmsByStatus"></a>
# **retrieveAllSmsByStatus**
> String retrieveAllSmsByStatus(campaignId, status, fromDate, toDate, locale, dateFormat, sqlSearch, offset, limit, orderBy, sortOrder)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsApi;


SmsApi apiInstance = new SmsApi();
Long campaignId = 789L; // Long | 
Long status = 789L; // Long | 
String fromDate = "fromDate_example"; // String | 
String toDate = "toDate_example"; // String | 
String locale = "locale_example"; // String | 
String dateFormat = "dateFormat_example"; // String | 
String sqlSearch = "sqlSearch_example"; // String | 
Integer offset = 56; // Integer | 
Integer limit = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String sortOrder = "sortOrder_example"; // String | 
try {
    String result = apiInstance.retrieveAllSmsByStatus(campaignId, status, fromDate, toDate, locale, dateFormat, sqlSearch, offset, limit, orderBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#retrieveAllSmsByStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**|  |
 **status** | **Long**|  | [optional]
 **fromDate** | **String**|  | [optional]
 **toDate** | **String**|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]
 **sqlSearch** | **String**|  | [optional]
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **sortOrder** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> String retrieveOne(resourceId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsApi;


SmsApi apiInstance = new SmsApi();
Long resourceId = 789L; // Long | 
try {
    String result = apiInstance.retrieveOne(resourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> String update(resourceId, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SmsApi;


SmsApi apiInstance = new SmsApi();
Long resourceId = 789L; // Long | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.update(resourceId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SmsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resourceId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

