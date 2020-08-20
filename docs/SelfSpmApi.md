# SelfSpmApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAllSurveys**](SelfSpmApi.md#fetchAllSurveys) | **GET** self/surveys | 


<a name="fetchAllSurveys"></a>
# **fetchAllSurveys**
> List&lt;SurveyData&gt; fetchAllSurveys()



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfSpmApi;


SelfSpmApi apiInstance = new SelfSpmApi();
try {
    List<SurveyData> result = apiInstance.fetchAllSurveys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfSpmApi#fetchAllSurveys");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;SurveyData&gt;**](SurveyData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

