# LikelihoodApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieve**](LikelihoodApi.md#retrieve) | **GET** likelihood/{ppiName}/{likelihoodId} | 
[**retrieveAll**](LikelihoodApi.md#retrieveAll) | **GET** likelihood/{ppiName} | 
[**update**](LikelihoodApi.md#update) | **PUT** likelihood/{ppiName}/{likelihoodId} | 


<a name="retrieve"></a>
# **retrieve**
> String retrieve(likelihoodId)



### Example
```java

LikelihoodApi apiService = defaultClient.createService(LikelihoodApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieve(likelihoodId);
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

 **likelihoodId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> String retrieveAll(ppiName)



### Example
```java

LikelihoodApi apiService = defaultClient.createService(LikelihoodApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveAll(ppiName);
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

 **ppiName** | **String**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> String update(likelihoodId, body)



### Example
```java

LikelihoodApi apiService = defaultClient.createService(LikelihoodApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.update(likelihoodId, body);
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

 **likelihoodId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

