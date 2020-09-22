# SelfUserDetailsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

SelfUserDetailsApi apiService = defaultClient.createService(SelfUserDetailsApi.class);

// Initialize these parameters earlier.
Call<GetSelfUserDetailsResponse> call = apiService.fetchAuthenticatedUserData(accessToken);
call.enqueue(new Callback<GetSelfUserDetailsResponse>() {
    @Override
    public void onResponse(Call<GetSelfUserDetailsResponse> call, Response<GetSelfUserDetailsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfUserDetailsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accessToken** | **String**| äccess_token | [optional]

### Return type

[**GetSelfUserDetailsResponse**](GetSelfUserDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

