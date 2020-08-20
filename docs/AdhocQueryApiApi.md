# AdhocQueryApiApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAdHocQuery**](AdhocQueryApiApi.md#createAdHocQuery) | **POST** adhocquery | 
[**deleteAdHocQuery**](AdhocQueryApiApi.md#deleteAdHocQuery) | **DELETE** adhocquery/{adHocId} | 
[**retrieveAdHocQuery**](AdhocQueryApiApi.md#retrieveAdHocQuery) | **GET** adhocquery/{adHocId} | 
[**retrieveAll**](AdhocQueryApiApi.md#retrieveAll) | **GET** adhocquery | 
[**template**](AdhocQueryApiApi.md#template) | **GET** adhocquery/template | 
[**update**](AdhocQueryApiApi.md#update) | **PUT** adhocquery/{adHocId} | 


<a name="createAdHocQuery"></a>
# **createAdHocQuery**
> String createAdHocQuery(body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AdhocQueryApiApi;


AdhocQueryApiApi apiInstance = new AdhocQueryApiApi();
String body = "body_example"; // String | 
try {
    String result = apiInstance.createAdHocQuery(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdhocQueryApiApi#createAdHocQuery");
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

<a name="deleteAdHocQuery"></a>
# **deleteAdHocQuery**
> String deleteAdHocQuery(adHocId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AdhocQueryApiApi;


AdhocQueryApiApi apiInstance = new AdhocQueryApiApi();
Long adHocId = 789L; // Long | adHocId
try {
    String result = apiInstance.deleteAdHocQuery(adHocId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdhocQueryApiApi#deleteAdHocQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adHocId** | **Long**| adHocId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAdHocQuery"></a>
# **retrieveAdHocQuery**
> String retrieveAdHocQuery(adHocId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AdhocQueryApiApi;


AdhocQueryApiApi apiInstance = new AdhocQueryApiApi();
Long adHocId = 789L; // Long | adHocId
try {
    String result = apiInstance.retrieveAdHocQuery(adHocId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdhocQueryApiApi#retrieveAdHocQuery");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adHocId** | **Long**| adHocId |

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
//import org.mifos.fineract.services.AdhocQueryApiApi;


AdhocQueryApiApi apiInstance = new AdhocQueryApiApi();
try {
    String result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdhocQueryApiApi#retrieveAll");
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

<a name="template"></a>
# **template**
> String template()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AdhocQueryApiApi;


AdhocQueryApiApi apiInstance = new AdhocQueryApiApi();
try {
    String result = apiInstance.template();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdhocQueryApiApi#template");
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
> String update(adHocId, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AdhocQueryApiApi;


AdhocQueryApiApi apiInstance = new AdhocQueryApiApi();
Long adHocId = 789L; // Long | adHocId
String body = "body_example"; // String | 
try {
    String result = apiInstance.update(adHocId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AdhocQueryApiApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adHocId** | **Long**| adHocId |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

