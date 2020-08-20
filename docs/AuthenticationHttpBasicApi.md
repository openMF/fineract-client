# AuthenticationHttpBasicApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authenticate**](AuthenticationHttpBasicApi.md#authenticate) | **POST** authentication | Verify authentication


<a name="authenticate"></a>
# **authenticate**
> PostAuthenticationResponse authenticate(username, password)

Verify authentication

Authenticates the credentials provided and returns the set roles and permissions allowed.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.AuthenticationHttpBasicApi;


AuthenticationHttpBasicApi apiInstance = new AuthenticationHttpBasicApi();
String username = "username_example"; // String | username
String password = "password_example"; // String | password
try {
    PostAuthenticationResponse result = apiInstance.authenticate(username, password);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationHttpBasicApi#authenticate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| username | [optional]
 **password** | **String**| password | [optional]

### Return type

[**PostAuthenticationResponse**](PostAuthenticationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

