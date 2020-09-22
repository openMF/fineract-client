# SurveyApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDatatableEntry**](SurveyApi.md#createDatatableEntry) | **POST** survey/{surveyName}/{apptableId} | Create an entry in the survey table
[**deleteDatatableEntries**](SurveyApi.md#deleteDatatableEntries) | **DELETE** survey/{surveyName}/{clientId}/{fulfilledId} | 
[**getClientSurveyOverview**](SurveyApi.md#getClientSurveyOverview) | **GET** survey/{surveyName}/{clientId} | 
[**getSurveyEntry**](SurveyApi.md#getSurveyEntry) | **GET** survey/{surveyName}/{clientId}/{entryId} | 
[**register**](SurveyApi.md#register) | **PUT** survey/register/{surveyName}/{apptable} | 
[**retrieveSurvey**](SurveyApi.md#retrieveSurvey) | **GET** survey/{surveyName} | Retrieve survey
[**retrieveSurveys**](SurveyApi.md#retrieveSurveys) | **GET** survey | Retrieve surveys


<a name="createDatatableEntry"></a>
# **createDatatableEntry**
> PostSurveySurveyNameApptableIdResponse createDatatableEntry(surveyName, apptableId, body2, body)

Create an entry in the survey table

Insert and entry in a survey table (full fill the survey).  Refer Link for sample Body:  [ https://demo.openmf.org/api-docs/apiLive.htm#survey_create ] 

### Example
```java

SurveyApi apiService = defaultClient.createService(SurveyApi.class);

// Initialize these parameters earlier.
Call<PostSurveySurveyNameApptableIdResponse> call = apiService.createDatatableEntry(surveyName, apptableId, body2, body);
call.enqueue(new Callback<PostSurveySurveyNameApptableIdResponse>() {
    @Override
    public void onResponse(Call<PostSurveySurveyNameApptableIdResponse> call, Response<PostSurveySurveyNameApptableIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostSurveySurveyNameApptableIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **surveyName** | **String**| surveyName |
 **apptableId** | **Long**| apptableId |
 **body2** | [**PostSurveySurveyNameApptableIdRequest**](PostSurveySurveyNameApptableIdRequest.md)| body |
 **body** | **String**|  | [optional]

### Return type

[**PostSurveySurveyNameApptableIdResponse**](PostSurveySurveyNameApptableIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteDatatableEntries"></a>
# **deleteDatatableEntries**
> String deleteDatatableEntries(surveyName, clientId, fulfilledId)



### Example
```java

SurveyApi apiService = defaultClient.createService(SurveyApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.deleteDatatableEntries(surveyName, clientId, fulfilledId);
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

 **surveyName** | **String**|  |
 **clientId** | **Long**|  |
 **fulfilledId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClientSurveyOverview"></a>
# **getClientSurveyOverview**
> String getClientSurveyOverview(surveyName, clientId)



### Example
```java

SurveyApi apiService = defaultClient.createService(SurveyApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getClientSurveyOverview(surveyName, clientId);
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

 **surveyName** | **String**|  |
 **clientId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSurveyEntry"></a>
# **getSurveyEntry**
> String getSurveyEntry(surveyName, clientId, entryId)



### Example
```java

SurveyApi apiService = defaultClient.createService(SurveyApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getSurveyEntry(surveyName, clientId, entryId);
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

 **surveyName** | **String**|  |
 **clientId** | **Long**|  |
 **entryId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="register"></a>
# **register**
> String register(surveyName, apptable, body)



### Example
```java

SurveyApi apiService = defaultClient.createService(SurveyApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.register(surveyName, apptable, body);
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

 **surveyName** | **String**|  |
 **apptable** | **String**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveSurvey"></a>
# **retrieveSurvey**
> GetSurveyResponse retrieveSurvey(surveyName)

Retrieve survey

Lists a registered survey table details and the Apache Fineract Core application table they are registered to.

### Example
```java

SurveyApi apiService = defaultClient.createService(SurveyApi.class);

// Initialize these parameters earlier.
Call<GetSurveyResponse> call = apiService.retrieveSurvey(surveyName);
call.enqueue(new Callback<GetSurveyResponse>() {
    @Override
    public void onResponse(Call<GetSurveyResponse> call, Response<GetSurveyResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSurveyResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **surveyName** | **String**| surveyName |

### Return type

[**GetSurveyResponse**](GetSurveyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveSurveys"></a>
# **retrieveSurveys**
> List&lt;GetSurveyResponse&gt; retrieveSurveys()

Retrieve surveys

Retrieve surveys. This allows to retrieve the list of survey tables registered .

### Example
```java

SurveyApi apiService = defaultClient.createService(SurveyApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetSurveyResponse&gt;> call = apiService.retrieveSurveys();
call.enqueue(new Callback<List&lt;GetSurveyResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetSurveyResponse&gt;> call, Response<List&lt;GetSurveyResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetSurveyResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetSurveyResponse&gt;**](GetSurveyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

