# CashierJournalsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getJournalData**](CashierJournalsApi.md#getJournalData) | **GET** cashiersjournal | 


<a name="getJournalData"></a>
# **getJournalData**
> String getJournalData(officeId, tellerId, cashierId, dateRange)



### Example
```java

CashierJournalsApi apiService = defaultClient.createService(CashierJournalsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getJournalData(officeId, tellerId, cashierId, dateRange);
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
 **cashierId** | **Long**|  | [optional]
 **dateRange** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

