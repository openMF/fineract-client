# CashierJournalsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJournalData**](CashierJournalsApi.md#getJournalData) | **GET** cashiersjournal | 


<a name="getJournalData"></a>
# **getJournalData**
> String getJournalData(officeId, tellerId, cashierId, dateRange)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CashierJournalsApi;


CashierJournalsApi apiInstance = new CashierJournalsApi();
Long officeId = 789L; // Long | 
Long tellerId = 789L; // Long | 
Long cashierId = 789L; // Long | 
String dateRange = "dateRange_example"; // String | 
try {
    String result = apiInstance.getJournalData(officeId, tellerId, cashierId, dateRange);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CashierJournalsApi#getJournalData");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **officeId** | **Long**|  | [optional]
 **tellerId** | **Long**|  | [optional]
 **cashierId** | **Long**|  | [optional]
 **dateRange** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

