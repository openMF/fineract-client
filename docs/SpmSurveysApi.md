# SpmSurveysApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateOrDeactivateSurvey**](SpmSurveysApi.md#activateOrDeactivateSurvey) | **POST** surveys/{id} | Deactivate Survey
[**createSurvey**](SpmSurveysApi.md#createSurvey) | **POST** surveys | Create a Survey
[**editSurvey**](SpmSurveysApi.md#editSurvey) | **PUT** surveys/{id} | 
[**fetchAllSurveys**](SpmSurveysApi.md#fetchAllSurveys) | **GET** surveys | List all Surveys
[**findSurvey**](SpmSurveysApi.md#findSurvey) | **GET** surveys/{id} | Retrieve a Survey


<a name="activateOrDeactivateSurvey"></a>
# **activateOrDeactivateSurvey**
> activateOrDeactivateSurvey(id, command)

Deactivate Survey



### Example
```java

SpmSurveysApi apiService = defaultClient.createService(SpmSurveysApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.activateOrDeactivateSurvey(id, command);
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

 **id** | **Long**|  |
 **command** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSurvey"></a>
# **createSurvey**
> createSurvey(body)

Create a Survey

Adds a new survey to collect client related data.  Mandatory Fields  countryCode, key, name, questions, responses, sequenceNo, text, value

### Example
```java

SpmSurveysApi apiService = defaultClient.createService(SpmSurveysApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.createSurvey(body);
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

 **body** | [**SurveyData**](SurveyData.md)| Create survey | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editSurvey"></a>
# **editSurvey**
> String editSurvey(id, body)



### Example
```java

SpmSurveysApi apiService = defaultClient.createService(SpmSurveysApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.editSurvey(id, body);
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

 **id** | **Long**|  |
 **body** | [**SurveyData**](SurveyData.md)|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchAllSurveys"></a>
# **fetchAllSurveys**
> List&lt;SurveyData&gt; fetchAllSurveys(isActive)

List all Surveys



### Example
```java

SpmSurveysApi apiService = defaultClient.createService(SpmSurveysApi.class);

// Initialize these parameters earlier.
Call<List&lt;SurveyData&gt;> call = apiService.fetchAllSurveys(isActive);
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

 **isActive** | **Boolean**|  | [optional]

### Return type

[**List&lt;SurveyData&gt;**](SurveyData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findSurvey"></a>
# **findSurvey**
> SurveyData findSurvey(id)

Retrieve a Survey



### Example
```java

SpmSurveysApi apiService = defaultClient.createService(SpmSurveysApi.class);

// Initialize these parameters earlier.
Call<SurveyData> call = apiService.findSurvey(id);
call.enqueue(new Callback<SurveyData>() {
    @Override
    public void onResponse(Call<SurveyData> call, Response<SurveyData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<SurveyData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **id** | **Long**| Enter id |

### Return type

[**SurveyData**](SurveyData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

