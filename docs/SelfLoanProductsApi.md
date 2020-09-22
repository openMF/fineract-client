# SelfLoanProductsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAllLoanProducts**](SelfLoanProductsApi.md#retrieveAllLoanProducts) | **GET** self/loanproducts | 
[**retrieveLoanProductDetails**](SelfLoanProductsApi.md#retrieveLoanProductDetails) | **GET** self/loanproducts/{productId} | 


<a name="retrieveAllLoanProducts"></a>
# **retrieveAllLoanProducts**
> String retrieveAllLoanProducts(clientId)



### Example
```java

SelfLoanProductsApi apiService = defaultClient.createService(SelfLoanProductsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveAllLoanProducts(clientId);
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

 **clientId** | **Long**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveLoanProductDetails"></a>
# **retrieveLoanProductDetails**
> String retrieveLoanProductDetails(productId, clientId)



### Example
```java

SelfLoanProductsApi apiService = defaultClient.createService(SelfLoanProductsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveLoanProductDetails(productId, clientId);
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
 **clientId** | **Long**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

