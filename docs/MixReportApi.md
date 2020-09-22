# MixReportApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveXBRLReport**](MixReportApi.md#retrieveXBRLReport) | **GET** mixreport | 


<a name="retrieveXBRLReport"></a>
# **retrieveXBRLReport**
> String retrieveXBRLReport(startDate, endDate, currency)



### Example
```java

MixReportApi apiService = defaultClient.createService(MixReportApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveXBRLReport(startDate, endDate, currency);
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

 **startDate** | **DateTime**|  | [optional]
 **endDate** | **DateTime**|  | [optional]
 **currency** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/xml

