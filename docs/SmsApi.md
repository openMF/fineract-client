# SmsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SmsApi.md#create) | **POST** sms | 
[**delete**](SmsApi.md#delete) | **DELETE** sms/{resourceId} | 
[**retrieveAll**](SmsApi.md#retrieveAll) | **GET** sms | 
[**retrieveAllSmsByStatus**](SmsApi.md#retrieveAllSmsByStatus) | **GET** sms/{campaignId}/messageByStatus | 
[**retrieveOne**](SmsApi.md#retrieveOne) | **GET** sms/{resourceId} | 
[**update**](SmsApi.md#update) | **PUT** sms/{resourceId} | 


<a name="create"></a>
# **create**
> String create(body)



### Example
```java

SmsApi apiService = defaultClient.createService(SmsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.create(body);
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

<a name="delete"></a>
# **delete**
> String delete(resourceId)



### Example
```java

SmsApi apiService = defaultClient.createService(SmsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.delete(resourceId);
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

 **resourceId** | **Long**|  |

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

SmsApi apiService = defaultClient.createService(SmsApi.class);

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

<a name="retrieveAllSmsByStatus"></a>
# **retrieveAllSmsByStatus**
> String retrieveAllSmsByStatus(campaignId, status, fromDate, toDate, locale, dateFormat, sqlSearch, offset, limit, orderBy, sortOrder)



### Example
```java

SmsApi apiService = defaultClient.createService(SmsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveAllSmsByStatus(campaignId, status, fromDate, toDate, locale, dateFormat, sqlSearch, offset, limit, orderBy, sortOrder);
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

 **campaignId** | **Long**|  |
 **status** | **Long**|  | [optional]
 **fromDate** | **String**|  | [optional]
 **toDate** | **String**|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]
 **sqlSearch** | **String**|  | [optional]
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **sortOrder** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> String retrieveOne(resourceId)



### Example
```java

SmsApi apiService = defaultClient.createService(SmsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveOne(resourceId);
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

 **resourceId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> String update(resourceId, body)



### Example
```java

SmsApi apiService = defaultClient.createService(SmsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.update(resourceId, body);
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

 **resourceId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

