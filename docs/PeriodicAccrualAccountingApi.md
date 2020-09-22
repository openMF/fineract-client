# PeriodicAccrualAccountingApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**executePeriodicAccrualAccounting**](PeriodicAccrualAccountingApi.md#executePeriodicAccrualAccounting) | **POST** runaccruals | Executes Periodic Accrual Accounting


<a name="executePeriodicAccrualAccounting"></a>
# **executePeriodicAccrualAccounting**
> executePeriodicAccrualAccounting(body)

Executes Periodic Accrual Accounting

Mandatory Fields  tillDate 

### Example
```java

PeriodicAccrualAccountingApi apiService = defaultClient.createService(PeriodicAccrualAccountingApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.executePeriodicAccrualAccounting(body);
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

 **body** | [**RunaccrualsRequest**](RunaccrualsRequest.md)| Request Body  Field Descriptions:  tillDate:  which specifies periodic accruals should happen till the given Date |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

