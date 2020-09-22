# PovertyLineApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAll**](PovertyLineApi.md#retrieveAll) | **GET** povertyLine/{ppiName} | 
[**retrieveAll_0**](PovertyLineApi.md#retrieveAll_0) | **GET** povertyLine/{ppiName}/{likelihoodId} | 


<a name="retrieveAll"></a>
# **retrieveAll**
> String retrieveAll(ppiName)



### Example
```java

PovertyLineApi apiService = defaultClient.createService(PovertyLineApi.class);

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

<a name="retrieveAll_0"></a>
# **retrieveAll_0**
> String retrieveAll_0(ppiName, likelihoodId)



### Example
```java

PovertyLineApi apiService = defaultClient.createService(PovertyLineApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveAll_0(ppiName, likelihoodId);
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
 **likelihoodId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

