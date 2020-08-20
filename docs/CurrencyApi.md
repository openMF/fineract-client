# CurrencyApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CurrencyApi;


CurrencyApi apiInstance = new CurrencyApi();
try {
    GetCurrenciesResponse result = apiInstance.retrieveCurrencies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyApi#retrieveCurrencies");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CurrencyApi;


CurrencyApi apiInstance = new CurrencyApi();
PutCurrenciesRequest body = new PutCurrenciesRequest(); // PutCurrenciesRequest | body
try {
    PutCurrenciesResponse result = apiInstance.updateCurrencies(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CurrencyApi#updateCurrencies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutCurrenciesRequest**](PutCurrenciesRequest.md)| body |

### Return type

[**PutCurrenciesResponse**](PutCurrenciesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

