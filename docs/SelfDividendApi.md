# SelfDividendApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDividendDetail**](SelfDividendApi.md#createDividendDetail) | **POST** shareproduct/{productId}/dividend | 
[**deleteDividendDetail**](SelfDividendApi.md#deleteDividendDetail) | **DELETE** shareproduct/{productId}/dividend/{dividendId} | 
[**retrieveAll**](SelfDividendApi.md#retrieveAll) | **GET** shareproduct/{productId}/dividend | 
[**retrieveDividendDetails**](SelfDividendApi.md#retrieveDividendDetails) | **GET** shareproduct/{productId}/dividend/{dividendId} | 
[**updateDividendDetail**](SelfDividendApi.md#updateDividendDetail) | **PUT** shareproduct/{productId}/dividend/{dividendId} | 


<a name="createDividendDetail"></a>
# **createDividendDetail**
> String createDividendDetail(productId, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfDividendApi;


SelfDividendApi apiInstance = new SelfDividendApi();
Long productId = 789L; // Long | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.createDividendDetail(productId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfDividendApi#createDividendDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDividendDetail"></a>
# **deleteDividendDetail**
> String deleteDividendDetail(productId, dividendId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfDividendApi;


SelfDividendApi apiInstance = new SelfDividendApi();
Long productId = 789L; // Long | 
Long dividendId = 789L; // Long | 
try {
    String result = apiInstance.deleteDividendDetail(productId, dividendId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfDividendApi#deleteDividendDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**|  |
 **dividendId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> String retrieveAll(productId, offset, limit, orderBy, sortOrder, status)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfDividendApi;


SelfDividendApi apiInstance = new SelfDividendApi();
Long productId = 789L; // Long | 
Integer offset = 56; // Integer | 
Integer limit = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String sortOrder = "sortOrder_example"; // String | 
Integer status = 56; // Integer | 
try {
    String result = apiInstance.retrieveAll(productId, offset, limit, orderBy, sortOrder, status);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfDividendApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**|  |
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **sortOrder** | **String**|  | [optional]
 **status** | **Integer**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveDividendDetails"></a>
# **retrieveDividendDetails**
> String retrieveDividendDetails(dividendId, offset, limit, orderBy, sortOrder, accountNo)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfDividendApi;


SelfDividendApi apiInstance = new SelfDividendApi();
Long dividendId = 789L; // Long | 
Integer offset = 56; // Integer | 
Integer limit = 56; // Integer | 
String orderBy = "orderBy_example"; // String | 
String sortOrder = "sortOrder_example"; // String | 
String accountNo = "accountNo_example"; // String | 
try {
    String result = apiInstance.retrieveDividendDetails(dividendId, offset, limit, orderBy, sortOrder, accountNo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfDividendApi#retrieveDividendDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dividendId** | **Long**|  |
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **sortOrder** | **String**|  | [optional]
 **accountNo** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDividendDetail"></a>
# **updateDividendDetail**
> String updateDividendDetail(productId, dividendId, command, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfDividendApi;


SelfDividendApi apiInstance = new SelfDividendApi();
Long productId = 789L; // Long | 
Long dividendId = 789L; // Long | 
String command = "command_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.updateDividendDetail(productId, dividendId, command, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfDividendApi#updateDividendDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **productId** | **Long**|  |
 **dividendId** | **Long**|  |
 **command** | **String**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

