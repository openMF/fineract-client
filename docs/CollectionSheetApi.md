# CollectionSheetApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateCollectionSheet**](CollectionSheetApi.md#generateCollectionSheet) | **POST** collectionsheet | Generate Individual Collection Sheet | Save Collection Sheet


<a name="generateCollectionSheet"></a>
# **generateCollectionSheet**
> PostCollectionSheetResponse generateCollectionSheet(body, command)

Generate Individual Collection Sheet | Save Collection Sheet

Generate Individual Collection Sheet:  This Api retrieves repayment details of all individual loans under a office as on a specified meeting date.  Save Collection Sheet:  This Api allows the loan officer to perform bulk repayments of individual loans and deposit of mandatory savings on a given meeting date.

### Example
```java

CollectionSheetApi apiService = defaultClient.createService(CollectionSheetApi.class);

// Initialize these parameters earlier.
Call<PostCollectionSheetResponse> call = apiService.generateCollectionSheet(body, command);
call.enqueue(new Callback<PostCollectionSheetResponse>() {
    @Override
    public void onResponse(Call<PostCollectionSheetResponse> call, Response<PostCollectionSheetResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostCollectionSheetResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostCollectionSheetRequest**](PostCollectionSheetRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostCollectionSheetResponse**](PostCollectionSheetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

