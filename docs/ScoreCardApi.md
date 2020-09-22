# ScoreCardApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScorecard**](ScoreCardApi.md#createScorecard) | **POST** surveys/scorecards/{surveyId} | Create a Scorecard entry
[**findByClient**](ScoreCardApi.md#findByClient) | **GET** surveys/scorecards/clients/{clientId} | 
[**findBySurvey**](ScoreCardApi.md#findBySurvey) | **GET** surveys/scorecards/{surveyId} | List all Scorecard entries
[**findBySurveyAndClient**](ScoreCardApi.md#findBySurveyAndClient) | **GET** surveys/scorecards/{surveyId}/clients/{clientId} | 


<a name="createScorecard"></a>
# **createScorecard**
> createScorecard(surveyId, body)

Create a Scorecard entry

Add a new entry to a survey.  Mandatory Fields clientId, createdOn, questionId, responseId, staffId

### Example
```java

ScoreCardApi apiService = defaultClient.createService(ScoreCardApi.class);

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

 **surveyId** | **Long**| Enter surveyId |
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

ScoreCardApi apiService = defaultClient.createService(ScoreCardApi.class);

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

<a name="findBySurvey"></a>
# **findBySurvey**
> List&lt;Scorecard&gt; findBySurvey(surveyId)

List all Scorecard entries

List all Scorecard entries for a survey.

### Example
```java

ScoreCardApi apiService = defaultClient.createService(ScoreCardApi.class);

// Initialize these parameters earlier.
Call<List&lt;Scorecard&gt;> call = apiService.findBySurvey(surveyId);
call.enqueue(new Callback<List&lt;Scorecard&gt;>() {
    @Override
    public void onResponse(Call<List&lt;Scorecard&gt;> call, Response<List&lt;Scorecard&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;Scorecard&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **surveyId** | **Long**| Enter surveyId |

### Return type

[**List&lt;Scorecard&gt;**](Scorecard.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findBySurveyAndClient"></a>
# **findBySurveyAndClient**
> List&lt;ScorecardData&gt; findBySurveyAndClient(surveyId, clientId)



### Example
```java

ScoreCardApi apiService = defaultClient.createService(ScoreCardApi.class);

// Initialize these parameters earlier.
Call<List&lt;ScorecardData&gt;> call = apiService.findBySurveyAndClient(surveyId, clientId);
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

 **surveyId** | **Long**| Enter surveyId |
 **clientId** | **Long**| Enter clientId |

### Return type

[**List&lt;ScorecardData&gt;**](ScorecardData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

