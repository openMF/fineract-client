# CollectionSheetApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.CollectionSheetApi;


CollectionSheetApi apiInstance = new CollectionSheetApi();
PostCollectionSheetRequest body = new PostCollectionSheetRequest(); // PostCollectionSheetRequest | body
String command = "command_example"; // String | command
try {
    PostCollectionSheetResponse result = apiInstance.generateCollectionSheet(body, command);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CollectionSheetApi#generateCollectionSheet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostCollectionSheetRequest**](PostCollectionSheetRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostCollectionSheetResponse**](PostCollectionSheetResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

