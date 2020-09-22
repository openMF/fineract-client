# SelfAuthenticationApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

SelfAuthenticationApi apiService = defaultClient.createService(SelfAuthenticationApi.class);

// Initialize these parameters earlier.
Call<PostSelfAuthenticationResponse> call = apiService.authenticate(username, password);
call.enqueue(new Callback<PostSelfAuthenticationResponse>() {
    @Override
    public void onResponse(Call<PostSelfAuthenticationResponse> call, Response<PostSelfAuthenticationResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostSelfAuthenticationResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **username** | **String**| username | [optional]
 **password** | **String**| password | [optional]

### Return type

[**PostSelfAuthenticationResponse**](PostSelfAuthenticationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

