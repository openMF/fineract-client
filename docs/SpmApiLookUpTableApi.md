# SpmApiLookUpTableApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

SpmApiLookUpTableApi apiService = defaultClient.createService(SpmApiLookUpTableApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.createLookupTable(surveyId, body);
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

SpmApiLookUpTableApi apiService = defaultClient.createService(SpmApiLookUpTableApi.class);

// Initialize these parameters earlier.
Call<List&lt;LookupTableData&gt;> call = apiService.fetchLookupTables(surveyId);
call.enqueue(new Callback<List&lt;LookupTableData&gt;>() {
    @Override
    public void onResponse(Call<List&lt;LookupTableData&gt;> call, Response<List&lt;LookupTableData&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;LookupTableData&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

SpmApiLookUpTableApi apiService = defaultClient.createService(SpmApiLookUpTableApi.class);

// Initialize these parameters earlier.
Call<LookupTableData> call = apiService.findLookupTable(surveyId, key);
call.enqueue(new Callback<LookupTableData>() {
    @Override
    public void onResponse(Call<LookupTableData> call, Response<LookupTableData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<LookupTableData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **surveyId** | **Long**| Enter surveyId |
 **key** | **String**| Enter key |

### Return type

[**LookupTableData**](LookupTableData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

