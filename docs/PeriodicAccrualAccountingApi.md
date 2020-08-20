# PeriodicAccrualAccountingApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PeriodicAccrualAccountingApi;


PeriodicAccrualAccountingApi apiInstance = new PeriodicAccrualAccountingApi();
RunaccrualsRequest body = new RunaccrualsRequest(); // RunaccrualsRequest | Request Body  Field Descriptions:  tillDate:  which specifies periodic accruals should happen till the given Date
try {
    apiInstance.executePeriodicAccrualAccounting(body);
} catch (ApiException e) {
    System.err.println("Exception when calling PeriodicAccrualAccountingApi#executePeriodicAccrualAccounting");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RunaccrualsRequest**](RunaccrualsRequest.md)| Request Body  Field Descriptions:  tillDate:  which specifies periodic accruals should happen till the given Date |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

