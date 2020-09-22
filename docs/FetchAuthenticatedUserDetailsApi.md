# FetchAuthenticatedUserDetailsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

FetchAuthenticatedUserDetailsApi apiService = defaultClient.createService(FetchAuthenticatedUserDetailsApi.class);

// Initialize these parameters earlier.
Call<GetUserDetailsResponse> call = apiService.fetchAuthenticatedUserData(accessToken);
call.enqueue(new Callback<GetUserDetailsResponse>() {
    @Override
    public void onResponse(Call<GetUserDetailsResponse> call, Response<GetUserDetailsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetUserDetailsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accessToken** | **String**| access_token | [optional]

### Return type

[**GetUserDetailsResponse**](GetUserDetailsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

