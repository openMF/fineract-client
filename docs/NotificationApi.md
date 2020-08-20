# NotificationApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllNotifications**](NotificationApi.md#getAllNotifications) | **GET** notifications | 
[**update**](NotificationApi.md#update) | **PUT** notifications | 


<a name="getAllNotifications"></a>
# **getAllNotifications**
> String getAllNotifications(orderBy, limit, offset, sortOrder, isRead)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
String orderBy = "orderBy_example"; // String | 
Integer limit = 56; // Integer | 
Integer offset = 56; // Integer | 
String sortOrder = "sortOrder_example"; // String | 
Boolean isRead = true; // Boolean | 
try {
    String result = apiInstance.getAllNotifications(orderBy, limit, offset, sortOrder, isRead);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#getAllNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderBy** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **offset** | **Integer**|  | [optional]
 **sortOrder** | **String**|  | [optional]
 **isRead** | **Boolean**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> update()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.NotificationApi;


NotificationApi apiInstance = new NotificationApi();
try {
    apiInstance.update();
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationApi#update");
    e.printStackTrace();
}
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

