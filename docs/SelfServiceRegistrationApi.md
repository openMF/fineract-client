# SelfServiceRegistrationApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSelfServiceRegistrationRequest**](SelfServiceRegistrationApi.md#createSelfServiceRegistrationRequest) | **POST** self/registration | 
[**createSelfServiceUser**](SelfServiceRegistrationApi.md#createSelfServiceUser) | **POST** self/registration/user | 


<a name="createSelfServiceRegistrationRequest"></a>
# **createSelfServiceRegistrationRequest**
> String createSelfServiceRegistrationRequest(body)



### Example
```java

SelfServiceRegistrationApi apiService = defaultClient.createService(SelfServiceRegistrationApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.createSelfServiceRegistrationRequest(body);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="createSelfServiceUser"></a>
# **createSelfServiceUser**
> String createSelfServiceUser(body)



### Example
```java

SelfServiceRegistrationApi apiService = defaultClient.createService(SelfServiceRegistrationApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.createSelfServiceUser(body);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

