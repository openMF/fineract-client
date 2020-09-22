# ProvisioningCategoryApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProvisioningCategory**](ProvisioningCategoryApi.md#createProvisioningCategory) | **POST** provisioningcategory | 
[**deleteProvisioningCategory**](ProvisioningCategoryApi.md#deleteProvisioningCategory) | **DELETE** provisioningcategory/{categoryId} | 
[**retrieveAll**](ProvisioningCategoryApi.md#retrieveAll) | **GET** provisioningcategory | 
[**updateProvisioningCategory**](ProvisioningCategoryApi.md#updateProvisioningCategory) | **PUT** provisioningcategory/{categoryId} | 


<a name="createProvisioningCategory"></a>
# **createProvisioningCategory**
> String createProvisioningCategory(body)



### Example
```java

ProvisioningCategoryApi apiService = defaultClient.createService(ProvisioningCategoryApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.createProvisioningCategory(body);
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

<a name="deleteProvisioningCategory"></a>
# **deleteProvisioningCategory**
> String deleteProvisioningCategory(categoryId)



### Example
```java

ProvisioningCategoryApi apiService = defaultClient.createService(ProvisioningCategoryApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.deleteProvisioningCategory(categoryId);
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

 **categoryId** | **Long**|  |

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

ProvisioningCategoryApi apiService = defaultClient.createService(ProvisioningCategoryApi.class);

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

<a name="updateProvisioningCategory"></a>
# **updateProvisioningCategory**
> String updateProvisioningCategory(categoryId, body)



### Example
```java

ProvisioningCategoryApi apiService = defaultClient.createService(ProvisioningCategoryApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.updateProvisioningCategory(categoryId, body);
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

 **categoryId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

