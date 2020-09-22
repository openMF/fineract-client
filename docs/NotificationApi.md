# NotificationApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllNotifications**](NotificationApi.md#getAllNotifications) | **GET** notifications | 
[**update**](NotificationApi.md#update) | **PUT** notifications | 


<a name="getAllNotifications"></a>
# **getAllNotifications**
> String getAllNotifications(orderBy, limit, offset, sortOrder, isRead)



### Example
```java

NotificationApi apiService = defaultClient.createService(NotificationApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getAllNotifications(orderBy, limit, offset, sortOrder, isRead);
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

 **orderBy** | **String**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **offset** | **Integer**|  | [optional]
 **sortOrder** | **String**|  | [optional]
 **isRead** | **Boolean**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> update()



### Example
```java

NotificationApi apiService = defaultClient.createService(NotificationApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.update();
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
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

