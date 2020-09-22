# SelfScoreCardApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScorecard**](SelfScoreCardApi.md#createScorecard) | **POST** self/surveys/scorecards/{surveyId} | 
[**findByClient**](SelfScoreCardApi.md#findByClient) | **GET** self/surveys/scorecards/clients/{clientId} | 


<a name="createScorecard"></a>
# **createScorecard**
> createScorecard(surveyId, body)



### Example
```java

SelfScoreCardApi apiService = defaultClient.createService(SelfScoreCardApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.createScorecard(surveyId, body);
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

 **surveyId** | **Long**|  |
 **body** | [**ScorecardData**](ScorecardData.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findByClient"></a>
# **findByClient**
> List&lt;ScorecardData&gt; findByClient(clientId)



### Example
```java

SelfScoreCardApi apiService = defaultClient.createService(SelfScoreCardApi.class);

// Initialize these parameters earlier.
Call<List&lt;ScorecardData&gt;> call = apiService.findByClient(clientId);
call.enqueue(new Callback<List&lt;ScorecardData&gt;>() {
    @Override
    public void onResponse(Call<List&lt;ScorecardData&gt;> call, Response<List&lt;ScorecardData&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;ScorecardData&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**|  |

### Return type

[**List&lt;ScorecardData&gt;**](ScorecardData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

