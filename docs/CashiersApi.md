# CashiersApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCashierData**](CashiersApi.md#getCashierData) | **GET** cashiers | 


<a name="getCashierData"></a>
# **getCashierData**
> String getCashierData(officeId, tellerId, staffId, date)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CashiersApi;


CashiersApi apiInstance = new CashiersApi();
Long officeId = 789L; // Long | 
Long tellerId = 789L; // Long | 
Long staffId = 789L; // Long | 
String date = "date_example"; // String | 
try {
    String result = apiInstance.getCashierData(officeId, tellerId, staffId, date);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashiersApi#getCashierData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

