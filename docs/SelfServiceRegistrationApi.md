# SelfServiceRegistrationApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSelfServiceRegistrationRequest**](SelfServiceRegistrationApi.md#createSelfServiceRegistrationRequest) | **POST** self/registration | 
[**createSelfServiceUser**](SelfServiceRegistrationApi.md#createSelfServiceUser) | **POST** self/registration/user | 


<a name="createSelfServiceRegistrationRequest"></a>
# **createSelfServiceRegistrationRequest**
> String createSelfServiceRegistrationRequest(body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfServiceRegistrationApi;


SelfServiceRegistrationApi apiInstance = new SelfServiceRegistrationApi();
String body = "body_example"; // String | 
try {
    String result = apiInstance.createSelfServiceRegistrationRequest(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfServiceRegistrationApi#createSelfServiceRegistrationRequest");
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSelfServiceUser"></a>
# **createSelfServiceUser**
> String createSelfServiceUser(body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfServiceRegistrationApi;


SelfServiceRegistrationApi apiInstance = new SelfServiceRegistrationApi();
String body = "body_example"; // String | 
try {
    String result = apiInstance.createSelfServiceUser(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfServiceRegistrationApi#createSelfServiceUser");
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

