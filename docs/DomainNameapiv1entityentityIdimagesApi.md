# DomainNameapiv1entityentityIdimagesApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNewClientImage**](DomainNameapiv1entityentityIdimagesApi.md#addNewClientImage) | **POST** {entity}/{entityId}/images | 
[**deleteClientImage**](DomainNameapiv1entityentityIdimagesApi.md#deleteClientImage) | **DELETE** {entity}/{entityId}/images | 
[**retrieveImage**](DomainNameapiv1entityentityIdimagesApi.md#retrieveImage) | **GET** {entity}/{entityId}/images | 
[**updateClientImage**](DomainNameapiv1entityentityIdimagesApi.md#updateClientImage) | **PUT** {entity}/{entityId}/images | 


<a name="addNewClientImage"></a>
# **addNewClientImage**
> String addNewClientImage(entity, entityId, contentLength, file)



### Example
```java

DomainNameapiv1entityentityIdimagesApi apiService = defaultClient.createService(DomainNameapiv1entityentityIdimagesApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.addNewClientImage(entity, entityId, contentLength, file);
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

 **entity** | **String**|  |
 **entityId** | **Long**|  |
 **contentLength** | **Long**|  | [optional]
 **file** | **File**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="deleteClientImage"></a>
# **deleteClientImage**
> String deleteClientImage(entity, entityId)



### Example
```java

DomainNameapiv1entityentityIdimagesApi apiService = defaultClient.createService(DomainNameapiv1entityentityIdimagesApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.deleteClientImage(entity, entityId);
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

 **entity** | **String**|  |
 **entityId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveImage"></a>
# **retrieveImage**
> retrieveImage(entity, entityId, maxWidth, maxHeight, output)



### Example
```java

DomainNameapiv1entityentityIdimagesApi apiService = defaultClient.createService(DomainNameapiv1entityentityIdimagesApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.retrieveImage(entity, entityId, maxWidth, maxHeight, output);
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

 **entity** | **String**|  |
 **entityId** | **Long**|  |
 **maxWidth** | **Integer**|  | [optional]
 **maxHeight** | **Integer**|  | [optional]
 **output** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/plain, text/htmlapplication/json, 
 - **Accept**: text/plain

<a name="updateClientImage"></a>
# **updateClientImage**
> String updateClientImage(entity, entityId, contentLength, file)



### Example
```java

DomainNameapiv1entityentityIdimagesApi apiService = defaultClient.createService(DomainNameapiv1entityentityIdimagesApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.updateClientImage(entity, entityId, contentLength, file);
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

 **entity** | **String**|  |
 **entityId** | **Long**|  |
 **contentLength** | **Long**|  | [optional]
 **file** | **File**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

