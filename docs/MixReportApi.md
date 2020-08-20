# MixReportApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveXBRLReport**](MixReportApi.md#retrieveXBRLReport) | **GET** mixreport | 


<a name="retrieveXBRLReport"></a>
# **retrieveXBRLReport**
> String retrieveXBRLReport(startDate, endDate, currency)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.MixReportApi;


MixReportApi apiInstance = new MixReportApi();
DateTime startDate = new DateTime(); // DateTime | 
DateTime endDate = new DateTime(); // DateTime | 
String currency = "currency_example"; // String | 
try {
    String result = apiInstance.retrieveXBRLReport(startDate, endDate, currency);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MixReportApi#retrieveXBRLReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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

