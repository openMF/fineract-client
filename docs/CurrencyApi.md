# CurrencyApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveCurrencies**](CurrencyApi.md#retrieveCurrencies) | **GET** currencies | Retrieve Currency Configuration
[**updateCurrencies**](CurrencyApi.md#updateCurrencies) | **PUT** currencies | Update Currency Configuration


<a name="retrieveCurrencies"></a>
# **retrieveCurrencies**
> GetCurrenciesResponse retrieveCurrencies()

Retrieve Currency Configuration

Returns the list of currencies permitted for use AND the list of currencies not selected (but available for selection).  Example Requests:  currencies   currencies?fields&#x3D;selectedCurrencyOptions

### Example
```java

CurrencyApi apiService = defaultClient.createService(CurrencyApi.class);

// Initialize these parameters earlier.
Call<GetCurrenciesResponse> call = apiService.retrieveCurrencies();
call.enqueue(new Callback<GetCurrenciesResponse>() {
    @Override
    public void onResponse(Call<GetCurrenciesResponse> call, Response<GetCurrenciesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetCurrenciesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetCurrenciesResponse**](GetCurrenciesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCurrencies"></a>
# **updateCurrencies**
> PutCurrenciesResponse updateCurrencies(body)

Update Currency Configuration

Updates the list of currencies permitted for use.

### Example
```java

CurrencyApi apiService = defaultClient.createService(CurrencyApi.class);

// Initialize these parameters earlier.
Call<PutCurrenciesResponse> call = apiService.updateCurrencies(body);
call.enqueue(new Callback<PutCurrenciesResponse>() {
    @Override
    public void onResponse(Call<PutCurrenciesResponse> call, Response<PutCurrenciesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutCurrenciesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PutCurrenciesRequest**](PutCurrenciesRequest.md)| body |

### Return type

[**PutCurrenciesResponse**](PutCurrenciesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

