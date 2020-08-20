# StandingInstructionsHistoryApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAll**](StandingInstructionsHistoryApi.md#retrieveAll) | **GET** standinginstructionrunhistory | Standing Instructions Logged History


<a name="retrieveAll"></a>
# **retrieveAll**
> GetStandingInstructionRunHistoryResponse retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType, locale, dateFormat, fromDate, toDate)

Standing Instructions Logged History

The list capability of history can support pagination and sorting   Example Requests :  standinginstructionrunhistory  standinginstructionrunhistory?orderBy&#x3D;name&amp;sortOrder&#x3D;DESC  standinginstructionrunhistory?offset&#x3D;10&amp;limit&#x3D;50

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.StandingInstructionsHistoryApi;


StandingInstructionsHistoryApi apiInstance = new StandingInstructionsHistoryApi();
String sqlSearch = "sqlSearch_example"; // String | sqlSearch
String externalId = "externalId_example"; // String | externalId
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
Integer transferType = 56; // Integer | transferType
String clientName = "clientName_example"; // String | clientName
Long clientId = 789L; // Long | clientId
Long fromAccountId = 789L; // Long | fromAccountId
Integer fromAccountType = 56; // Integer | fromAccountType
String locale = "locale_example"; // String | locale
String dateFormat = "dateFormat_example"; // String | dateFormat
String fromDate = "fromDate_example"; // String | fromDate
String toDate = "toDate_example"; // String | toDate
try {
    GetStandingInstructionRunHistoryResponse result = apiInstance.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType, locale, dateFormat, fromDate, toDate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandingInstructionsHistoryApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sqlSearch** | **String**| sqlSearch | [optional]
 **externalId** | **String**| externalId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]
 **transferType** | **Integer**| transferType | [optional]
 **clientName** | **String**| clientName | [optional]
 **clientId** | **Long**| clientId | [optional]
 **fromAccountId** | **Long**| fromAccountId | [optional]
 **fromAccountType** | **Integer**| fromAccountType | [optional]
 **locale** | **String**| locale | [optional]
 **dateFormat** | **String**| dateFormat | [optional]
 **fromDate** | **String**| fromDate | [optional]
 **toDate** | **String**| toDate | [optional]

### Return type

[**GetStandingInstructionRunHistoryResponse**](GetStandingInstructionRunHistoryResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

