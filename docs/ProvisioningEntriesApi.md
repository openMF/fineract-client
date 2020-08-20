# ProvisioningEntriesApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProvisioningEntries**](ProvisioningEntriesApi.md#createProvisioningEntries) | **POST** provisioningentries | Create new Provisioning Entries
[**modifyProvisioningEntry**](ProvisioningEntriesApi.md#modifyProvisioningEntry) | **POST** provisioningentries/{entryId} | Recreates Provisioning Entry
[**retrieveAllProvisioningEntries**](ProvisioningEntriesApi.md#retrieveAllProvisioningEntries) | **GET** provisioningentries | List all Provisioning Entries
[**retrieveProviioningEntries**](ProvisioningEntriesApi.md#retrieveProviioningEntries) | **GET** provisioningentries/entries | 
[**retrieveProvisioningEntry**](ProvisioningEntriesApi.md#retrieveProvisioningEntry) | **GET** provisioningentries/{entryId} | Retrieves a Provisioning Entry


<a name="createProvisioningEntries"></a>
# **createProvisioningEntries**
> PostProvisioningEntriesResponse createProvisioningEntries(body)

Create new Provisioning Entries

Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningEntriesApi;


ProvisioningEntriesApi apiInstance = new ProvisioningEntriesApi();
PostProvisioningEntriesRequest body = new PostProvisioningEntriesRequest(); // PostProvisioningEntriesRequest | body
try {
    PostProvisioningEntriesResponse result = apiInstance.createProvisioningEntries(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningEntriesApi#createProvisioningEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostProvisioningEntriesRequest**](PostProvisioningEntriesRequest.md)| body | [optional]

### Return type

[**PostProvisioningEntriesResponse**](PostProvisioningEntriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyProvisioningEntry"></a>
# **modifyProvisioningEntry**
> PutProvisioningEntriesResponse modifyProvisioningEntry(entryId, command, body)

Recreates Provisioning Entry

Recreates Provisioning Entry | createjournalentry.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningEntriesApi;


ProvisioningEntriesApi apiInstance = new ProvisioningEntriesApi();
Long entryId = 789L; // Long | entryId
String command = "command_example"; // String | command=createjournalentry command=recreateprovisioningentry
PutProvisioningEntriesRequest body = new PutProvisioningEntriesRequest(); // PutProvisioningEntriesRequest | body
try {
    PutProvisioningEntriesResponse result = apiInstance.modifyProvisioningEntry(entryId, command, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningEntriesApi#modifyProvisioningEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **Long**| entryId |
 **command** | **String**| command&#x3D;createjournalentry command&#x3D;recreateprovisioningentry | [optional]
 **body** | [**PutProvisioningEntriesRequest**](PutProvisioningEntriesRequest.md)| body | [optional]

### Return type

[**PutProvisioningEntriesResponse**](PutProvisioningEntriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllProvisioningEntries"></a>
# **retrieveAllProvisioningEntries**
> List&lt;ProvisioningEntryData&gt; retrieveAllProvisioningEntries(offset, limit)

List all Provisioning Entries



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningEntriesApi;


ProvisioningEntriesApi apiInstance = new ProvisioningEntriesApi();
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
try {
    List<ProvisioningEntryData> result = apiInstance.retrieveAllProvisioningEntries(offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningEntriesApi#retrieveAllProvisioningEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**List&lt;ProvisioningEntryData&gt;**](ProvisioningEntryData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveProviioningEntries"></a>
# **retrieveProviioningEntries**
> LoanProductProvisioningEntryData retrieveProviioningEntries(entryId, offset, limit, officeId, productId, categoryId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningEntriesApi;


ProvisioningEntriesApi apiInstance = new ProvisioningEntriesApi();
Long entryId = 789L; // Long | 
Integer offset = 56; // Integer | 
Integer limit = 56; // Integer | 
Long officeId = 789L; // Long | 
Long productId = 789L; // Long | 
Long categoryId = 789L; // Long | 
try {
    LoanProductProvisioningEntryData result = apiInstance.retrieveProviioningEntries(entryId, offset, limit, officeId, productId, categoryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningEntriesApi#retrieveProviioningEntries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **Long**|  | [optional]
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **officeId** | **Long**|  | [optional]
 **productId** | **Long**|  | [optional]
 **categoryId** | **Long**|  | [optional]

### Return type

[**LoanProductProvisioningEntryData**](LoanProductProvisioningEntryData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveProvisioningEntry"></a>
# **retrieveProvisioningEntry**
> ProvisioningEntryData retrieveProvisioningEntry(entryId)

Retrieves a Provisioning Entry

Returns the details of a generated Provisioning Entry.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.ProvisioningEntriesApi;


ProvisioningEntriesApi apiInstance = new ProvisioningEntriesApi();
Long entryId = 789L; // Long | entryId
try {
    ProvisioningEntryData result = apiInstance.retrieveProvisioningEntry(entryId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvisioningEntriesApi#retrieveProvisioningEntry");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entryId** | **Long**| entryId |

### Return type

[**ProvisioningEntryData**](ProvisioningEntryData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

