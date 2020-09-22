# AdhocQueryApiApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAdHocQuery**](AdhocQueryApiApi.md#createAdHocQuery) | **POST** adhocquery | 
[**deleteAdHocQuery**](AdhocQueryApiApi.md#deleteAdHocQuery) | **DELETE** adhocquery/{adHocId} | 
[**retrieveAdHocQuery**](AdhocQueryApiApi.md#retrieveAdHocQuery) | **GET** adhocquery/{adHocId} | 
[**retrieveAll**](AdhocQueryApiApi.md#retrieveAll) | **GET** adhocquery | 
[**template**](AdhocQueryApiApi.md#template) | **GET** adhocquery/template | 
[**update**](AdhocQueryApiApi.md#update) | **PUT** adhocquery/{adHocId} | 


<a name="createAdHocQuery"></a>
# **createAdHocQuery**
> String createAdHocQuery(body)



### Example
```java

AdhocQueryApiApi apiService = defaultClient.createService(AdhocQueryApiApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.createAdHocQuery(body);
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

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAdHocQuery"></a>
# **deleteAdHocQuery**
> String deleteAdHocQuery(adHocId)



### Example
```java

AdhocQueryApiApi apiService = defaultClient.createService(AdhocQueryApiApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.deleteAdHocQuery(adHocId);
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

 **adHocId** | **Long**| adHocId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAdHocQuery"></a>
# **retrieveAdHocQuery**
> String retrieveAdHocQuery(adHocId)



### Example
```java

AdhocQueryApiApi apiService = defaultClient.createService(AdhocQueryApiApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveAdHocQuery(adHocId);
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

 **adHocId** | **Long**| adHocId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> String retrieveAll()



### Example
```java

AdhocQueryApiApi apiService = defaultClient.createService(AdhocQueryApiApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveAll();
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
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> String template()



### Example
```java

AdhocQueryApiApi apiService = defaultClient.createService(AdhocQueryApiApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.template();
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
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> String update(adHocId, body)



### Example
```java

AdhocQueryApiApi apiService = defaultClient.createService(AdhocQueryApiApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.update(adHocId, body);
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

 **adHocId** | **Long**| adHocId |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

