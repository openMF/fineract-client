# ProvisioningCategoryApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProvisioningCategory**](ProvisioningCategoryApi.md#createProvisioningCategory) | **POST** provisioningcategory | 
[**deleteProvisioningCategory**](ProvisioningCategoryApi.md#deleteProvisioningCategory) | **DELETE** provisioningcategory/{categoryId} | 
[**retrieveAll**](ProvisioningCategoryApi.md#retrieveAll) | **GET** provisioningcategory | 
[**updateProvisioningCategory**](ProvisioningCategoryApi.md#updateProvisioningCategory) | **PUT** provisioningcategory/{categoryId} | 


<a name="createProvisioningCategory"></a>
# **createProvisioningCategory**
> String createProvisioningCategory(body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningCategoryApi;


ProvisioningCategoryApi apiInstance = new ProvisioningCategoryApi();
String body = "body_example"; // String | 
try {
    String result = apiInstance.createProvisioningCategory(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningCategoryApi#createProvisioningCategory");
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

<a name="deleteProvisioningCategory"></a>
# **deleteProvisioningCategory**
> String deleteProvisioningCategory(categoryId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningCategoryApi;


ProvisioningCategoryApi apiInstance = new ProvisioningCategoryApi();
Long categoryId = 789L; // Long | 
try {
    String result = apiInstance.deleteProvisioningCategory(categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningCategoryApi#deleteProvisioningCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Long**|  |

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
//import org.mifos.fineract.services.ProvisioningCategoryApi;


ProvisioningCategoryApi apiInstance = new ProvisioningCategoryApi();
try {
    String result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningCategoryApi#retrieveAll");
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

<a name="updateProvisioningCategory"></a>
# **updateProvisioningCategory**
> String updateProvisioningCategory(categoryId, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningCategoryApi;


ProvisioningCategoryApi apiInstance = new ProvisioningCategoryApi();
Long categoryId = 789L; // Long | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.updateProvisioningCategory(categoryId, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningCategoryApi#updateProvisioningCategory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

