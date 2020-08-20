# SelfUserDetailsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAuthenticatedUserData**](SelfUserDetailsApi.md#fetchAuthenticatedUserData) | **GET** self/userdetails | Fetch authenticated user details


<a name="fetchAuthenticatedUserData"></a>
# **fetchAuthenticatedUserData**
> GetSelfUserDetailsResponse fetchAuthenticatedUserData(accessToken)

Fetch authenticated user details

Checks the Authentication and returns the set roles and permissions allowed  For more info visit this link - https://demo.openmf.org/api-docs/apiLive.htm#selfoauth

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfUserDetailsApi;


SelfUserDetailsApi apiInstance = new SelfUserDetailsApi();
String accessToken = "accessToken_example"; // String | äccess_token
try {
    GetSelfUserDetailsResponse result = apiInstance.fetchAuthenticatedUserData(accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfUserDetailsApi#fetchAuthenticatedUserData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| äccess_token | [optional]

### Return type

[**GetSelfUserDetailsResponse**](GetSelfUserDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

