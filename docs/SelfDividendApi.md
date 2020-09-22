# SelfDividendApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDividendDetail**](SelfDividendApi.md#createDividendDetail) | **POST** shareproduct/{productId}/dividend | 
[**deleteDividendDetail**](SelfDividendApi.md#deleteDividendDetail) | **DELETE** shareproduct/{productId}/dividend/{dividendId} | 
[**retrieveAll**](SelfDividendApi.md#retrieveAll) | **GET** shareproduct/{productId}/dividend | 
[**retrieveDividendDetails**](SelfDividendApi.md#retrieveDividendDetails) | **GET** shareproduct/{productId}/dividend/{dividendId} | 
[**updateDividendDetail**](SelfDividendApi.md#updateDividendDetail) | **PUT** shareproduct/{productId}/dividend/{dividendId} | 


<a name="createDividendDetail"></a>
# **createDividendDetail**
> String createDividendDetail(productId, body)



### Example
```java

SelfDividendApi apiService = defaultClient.createService(SelfDividendApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.createDividendDetail(productId, body);
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

 **productId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDividendDetail"></a>
# **deleteDividendDetail**
> String deleteDividendDetail(productId, dividendId)



### Example
```java

SelfDividendApi apiService = defaultClient.createService(SelfDividendApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.deleteDividendDetail(productId, dividendId);
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

 **productId** | **Long**|  |
 **dividendId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> String retrieveAll(productId, offset, limit, orderBy, sortOrder, status)



### Example
```java

SelfDividendApi apiService = defaultClient.createService(SelfDividendApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveAll(productId, offset, limit, orderBy, sortOrder, status);
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

 **productId** | **Long**|  |
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **sortOrder** | **String**|  | [optional]
 **status** | **Integer**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveDividendDetails"></a>
# **retrieveDividendDetails**
> String retrieveDividendDetails(dividendId, offset, limit, orderBy, sortOrder, accountNo)



### Example
```java

SelfDividendApi apiService = defaultClient.createService(SelfDividendApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveDividendDetails(dividendId, offset, limit, orderBy, sortOrder, accountNo);
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

 **dividendId** | **Long**|  |
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **orderBy** | **String**|  | [optional]
 **sortOrder** | **String**|  | [optional]
 **accountNo** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDividendDetail"></a>
# **updateDividendDetail**
> String updateDividendDetail(productId, dividendId, command, body)



### Example
```java

SelfDividendApi apiService = defaultClient.createService(SelfDividendApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.updateDividendDetail(productId, dividendId, command, body);
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

 **productId** | **Long**|  |
 **dividendId** | **Long**|  |
 **command** | **String**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

