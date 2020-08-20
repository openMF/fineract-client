# SpmSurveysApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SpmSurveysApi;


SpmSurveysApi apiInstance = new SpmSurveysApi();
Long id = 789L; // Long | 
String command = "command_example"; // String | 
try {
    apiInstance.activateOrDeactivateSurvey(id, command);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmSurveysApi#activateOrDeactivateSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SpmSurveysApi;


SpmSurveysApi apiInstance = new SpmSurveysApi();
SurveyData body = new SurveyData(); // SurveyData | Create survey
try {
    apiInstance.createSurvey(body);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmSurveysApi#createSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SpmSurveysApi;


SpmSurveysApi apiInstance = new SpmSurveysApi();
Long id = 789L; // Long | 
SurveyData body = new SurveyData(); // SurveyData | 
try {
    String result = apiInstance.editSurvey(id, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmSurveysApi#editSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SpmSurveysApi;


SpmSurveysApi apiInstance = new SpmSurveysApi();
Boolean isActive = true; // Boolean | 
try {
    List<SurveyData> result = apiInstance.fetchAllSurveys(isActive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmSurveysApi#fetchAllSurveys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SpmSurveysApi;


SpmSurveysApi apiInstance = new SpmSurveysApi();
Long id = 789L; // Long | Enter id
try {
    SurveyData result = apiInstance.findSurvey(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmSurveysApi#findSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Long**| Enter id |

### Return type

[**SurveyData**](SurveyData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

