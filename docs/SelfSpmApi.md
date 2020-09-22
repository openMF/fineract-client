# SelfSpmApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**fetchAllSurveys**](SelfSpmApi.md#fetchAllSurveys) | **GET** self/surveys | 


<a name="fetchAllSurveys"></a>
# **fetchAllSurveys**
> List&lt;SurveyData&gt; fetchAllSurveys()



### Example
```java

SelfSpmApi apiService = defaultClient.createService(SelfSpmApi.class);

// Initialize these parameters earlier.
Call<List&lt;SurveyData&gt;> call = apiService.fetchAllSurveys();
call.enqueue(new Callback<List&lt;SurveyData&gt;>() {
    @Override
    public void onResponse(Call<List&lt;SurveyData&gt;> call, Response<List&lt;SurveyData&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;SurveyData&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

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

