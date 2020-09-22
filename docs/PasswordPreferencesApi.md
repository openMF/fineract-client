# PasswordPreferencesApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieve**](PasswordPreferencesApi.md#retrieve) | **GET** passwordpreferences | 
[**template**](PasswordPreferencesApi.md#template) | **GET** passwordpreferences/template | List Application Password validation policies
[**update**](PasswordPreferencesApi.md#update) | **PUT** passwordpreferences | Update password preferences


<a name="retrieve"></a>
# **retrieve**
> GetPasswordPreferencesTemplateResponse retrieve()



### Example
```java

PasswordPreferencesApi apiService = defaultClient.createService(PasswordPreferencesApi.class);

// Initialize these parameters earlier.
Call<GetPasswordPreferencesTemplateResponse> call = apiService.retrieve();
call.enqueue(new Callback<GetPasswordPreferencesTemplateResponse>() {
    @Override
    public void onResponse(Call<GetPasswordPreferencesTemplateResponse> call, Response<GetPasswordPreferencesTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetPasswordPreferencesTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetPasswordPreferencesTemplateResponse**](GetPasswordPreferencesTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> List&lt;GetPasswordPreferencesTemplateResponse&gt; template()

List Application Password validation policies

ARGUMENTS Example Requests:  passwordpreferences

### Example
```java

PasswordPreferencesApi apiService = defaultClient.createService(PasswordPreferencesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetPasswordPreferencesTemplateResponse&gt;> call = apiService.template();
call.enqueue(new Callback<List&lt;GetPasswordPreferencesTemplateResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetPasswordPreferencesTemplateResponse&gt;> call, Response<List&lt;GetPasswordPreferencesTemplateResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetPasswordPreferencesTemplateResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetPasswordPreferencesTemplateResponse&gt;**](GetPasswordPreferencesTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> update(body)

Update password preferences



### Example
```java

PasswordPreferencesApi apiService = defaultClient.createService(PasswordPreferencesApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.update(body);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PutPasswordPreferencesTemplateRequest**](PutPasswordPreferencesTemplateRequest.md)| body |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

