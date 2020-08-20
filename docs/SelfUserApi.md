# SelfUserApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**update**](SelfUserApi.md#update) | **PUT** self/user | Update User


<a name="update"></a>
# **update**
> PutSelfUserResponse update(body)

Update User

This API can be used by Self Service user to update their own user information. Currently, \&quot;password\&quot; and \&quot;repeatPassword\&quot; are the only parameters accepted.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfUserApi;


SelfUserApi apiInstance = new SelfUserApi();
PutSelfUserRequest body = new PutSelfUserRequest(); // PutSelfUserRequest | body
try {
    PutSelfUserResponse result = apiInstance.update(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfUserApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutSelfUserRequest**](PutSelfUserRequest.md)| body |

### Return type

[**PutSelfUserResponse**](PutSelfUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

