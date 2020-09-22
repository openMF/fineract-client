# AuthenticationHttpBasicApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

AuthenticationHttpBasicApi apiService = defaultClient.createService(AuthenticationHttpBasicApi.class);

// Initialize these parameters earlier.
Call<PostAuthenticationResponse> call = apiService.authenticate(username, password);
call.enqueue(new Callback<PostAuthenticationResponse>() {
    @Override
    public void onResponse(Call<PostAuthenticationResponse> call, Response<PostAuthenticationResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostAuthenticationResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **username** | **String**| username | [optional]
 **password** | **String**| password | [optional]

### Return type

[**PostAuthenticationResponse**](PostAuthenticationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

