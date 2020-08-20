# SpmApiLookUpTableApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLookupTable**](SpmApiLookUpTableApi.md#createLookupTable) | **POST** surveys/{surveyId}/lookuptables | Create a Lookup Table entry
[**fetchLookupTables**](SpmApiLookUpTableApi.md#fetchLookupTables) | **GET** surveys/{surveyId}/lookuptables | List all Lookup Table entries
[**findLookupTable**](SpmApiLookUpTableApi.md#findLookupTable) | **GET** surveys/{surveyId}/lookuptables/{key} | Retrieve a Lookup Table entry


<a name="createLookupTable"></a>
# **createLookupTable**
> createLookupTable(surveyId, body)

Create a Lookup Table entry

Add a new entry to a survey.  Mandatory Fields key, score, validFrom, validTo

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SpmApiLookUpTableApi;


SpmApiLookUpTableApi apiInstance = new SpmApiLookUpTableApi();
Long surveyId = 789L; // Long | Enter surveyId
LookupTableData body = new LookupTableData(); // LookupTableData | 
try {
    apiInstance.createLookupTable(surveyId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmApiLookUpTableApi#createLookupTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **surveyId** | **Long**| Enter surveyId |
 **body** | [**LookupTableData**](LookupTableData.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchLookupTables"></a>
# **fetchLookupTables**
> List&lt;LookupTableData&gt; fetchLookupTables(surveyId)

List all Lookup Table entries

List all Lookup Table entries for a survey.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SpmApiLookUpTableApi;


SpmApiLookUpTableApi apiInstance = new SpmApiLookUpTableApi();
Long surveyId = 789L; // Long | Enter surveyId
try {
    List<LookupTableData> result = apiInstance.fetchLookupTables(surveyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmApiLookUpTableApi#fetchLookupTables");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **surveyId** | **Long**| Enter surveyId |

### Return type

[**List&lt;LookupTableData&gt;**](LookupTableData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="findLookupTable"></a>
# **findLookupTable**
> LookupTableData findLookupTable(surveyId, key)

Retrieve a Lookup Table entry

Retrieve a Lookup Table entry for a survey.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SpmApiLookUpTableApi;


SpmApiLookUpTableApi apiInstance = new SpmApiLookUpTableApi();
Long surveyId = 789L; // Long | Enter surveyId
String key = "key_example"; // String | Enter key
try {
    LookupTableData result = apiInstance.findLookupTable(surveyId, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpmApiLookUpTableApi#findLookupTable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **surveyId** | **Long**| Enter surveyId |
 **key** | **String**| Enter key |

### Return type

[**LookupTableData**](LookupTableData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

