# SurveyApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SurveyApi;


SurveyApi apiInstance = new SurveyApi();
String surveyName = "surveyName_example"; // String | surveyName
Long apptableId = 789L; // Long | apptableId
PostSurveySurveyNameApptableIdRequest body2 = new PostSurveySurveyNameApptableIdRequest(); // PostSurveySurveyNameApptableIdRequest | body
String body = "body_example"; // String | 
try {
    PostSurveySurveyNameApptableIdResponse result = apiInstance.createDatatableEntry(surveyName, apptableId, body2, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveyApi#createDatatableEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SurveyApi;


SurveyApi apiInstance = new SurveyApi();
String surveyName = "surveyName_example"; // String | 
Long clientId = 789L; // Long | 
Long fulfilledId = 789L; // Long | 
try {
    String result = apiInstance.deleteDatatableEntries(surveyName, clientId, fulfilledId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveyApi#deleteDatatableEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SurveyApi;


SurveyApi apiInstance = new SurveyApi();
String surveyName = "surveyName_example"; // String | 
Long clientId = 789L; // Long | 
try {
    String result = apiInstance.getClientSurveyOverview(surveyName, clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveyApi#getClientSurveyOverview");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SurveyApi;


SurveyApi apiInstance = new SurveyApi();
String surveyName = "surveyName_example"; // String | 
Long clientId = 789L; // Long | 
Long entryId = 789L; // Long | 
try {
    String result = apiInstance.getSurveyEntry(surveyName, clientId, entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveyApi#getSurveyEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SurveyApi;


SurveyApi apiInstance = new SurveyApi();
String surveyName = "surveyName_example"; // String | 
String apptable = "apptable_example"; // String | 
String body = "body_example"; // String | 
try {
    String result = apiInstance.register(surveyName, apptable, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveyApi#register");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SurveyApi;


SurveyApi apiInstance = new SurveyApi();
String surveyName = "surveyName_example"; // String | surveyName
try {
    GetSurveyResponse result = apiInstance.retrieveSurvey(surveyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveyApi#retrieveSurvey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SurveyApi;


SurveyApi apiInstance = new SurveyApi();
try {
    List<GetSurveyResponse> result = apiInstance.retrieveSurveys();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SurveyApi#retrieveSurveys");
    e.printStackTrace();
}
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

