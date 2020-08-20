# FetchAuthenticatedUserDetailsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAuthenticatedUserData**](FetchAuthenticatedUserDetailsApi.md#fetchAuthenticatedUserData) | **GET** userdetails | Fetch authenticated user details 


<a name="fetchAuthenticatedUserData"></a>
# **fetchAuthenticatedUserData**
> GetUserDetailsResponse fetchAuthenticatedUserData(accessToken)

Fetch authenticated user details 

checks the Authentication and returns the set roles and permissions allowed.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.FetchAuthenticatedUserDetailsApi;


FetchAuthenticatedUserDetailsApi apiInstance = new FetchAuthenticatedUserDetailsApi();
String accessToken = "accessToken_example"; // String | access_token
try {
    GetUserDetailsResponse result = apiInstance.fetchAuthenticatedUserData(accessToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FetchAuthenticatedUserDetailsApi#fetchAuthenticatedUserData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| access_token | [optional]

### Return type

[**GetUserDetailsResponse**](GetUserDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

