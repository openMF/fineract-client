# SelfScoreCardApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScorecard**](SelfScoreCardApi.md#createScorecard) | **POST** self/surveys/scorecards/{surveyId} | 
[**findByClient**](SelfScoreCardApi.md#findByClient) | **GET** self/surveys/scorecards/clients/{clientId} | 


<a name="createScorecard"></a>
# **createScorecard**
> createScorecard(surveyId, body)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfScoreCardApi;


SelfScoreCardApi apiInstance = new SelfScoreCardApi();
Long surveyId = 789L; // Long | 
ScorecardData body = new ScorecardData(); // ScorecardData | 
try {
    apiInstance.createScorecard(surveyId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfScoreCardApi#createScorecard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfScoreCardApi;


SelfScoreCardApi apiInstance = new SelfScoreCardApi();
Long clientId = 789L; // Long | 
try {
    List<ScorecardData> result = apiInstance.findByClient(clientId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfScoreCardApi#findByClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**|  |

### Return type

[**List&lt;ScorecardData&gt;**](ScorecardData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

