# CashiersApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCashierData**](CashiersApi.md#getCashierData) | **GET** cashiers | 


<a name="getCashierData"></a>
# **getCashierData**
> String getCashierData(officeId, tellerId, staffId, date)



### Example
```java

CashiersApi apiService = defaultClient.createService(CashiersApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getCashierData(officeId, tellerId, staffId, date);
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

 **officeId** | **Long**|  | [optional]
 **tellerId** | **Long**|  | [optional]
 **staffId** | **Long**|  | [optional]
 **date** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

