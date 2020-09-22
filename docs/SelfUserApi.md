# SelfUserApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

SelfUserApi apiService = defaultClient.createService(SelfUserApi.class);

// Initialize these parameters earlier.
Call<PutSelfUserResponse> call = apiService.update(body);
call.enqueue(new Callback<PutSelfUserResponse>() {
    @Override
    public void onResponse(Call<PutSelfUserResponse> call, Response<PutSelfUserResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutSelfUserResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PutSelfUserRequest**](PutSelfUserRequest.md)| body |

### Return type

[**PutSelfUserResponse**](PutSelfUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

