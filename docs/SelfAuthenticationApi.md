# SelfAuthenticationApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](SelfAuthenticationApi.md#authenticate) | **POST** self/authentication | Verify authentication


<a name="authenticate"></a>
# **authenticate**
> PostSelfAuthenticationResponse authenticate(username, password)

Verify authentication

Authenticates the credentials provided and returns the set roles and permissions allowed.  Please visit this link for more info - https://demo.openmf.org/api-docs/apiLive.htm#selfbasicauth

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfAuthenticationApi;


SelfAuthenticationApi apiInstance = new SelfAuthenticationApi();
String username = "username_example"; // String | username
String password = "password_example"; // String | password
try {
    PostSelfAuthenticationResponse result = apiInstance.authenticate(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfAuthenticationApi#authenticate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username | [optional]
 **password** | **String**| password | [optional]

### Return type

[**PostSelfAuthenticationResponse**](PostSelfAuthenticationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

