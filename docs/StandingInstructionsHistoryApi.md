# StandingInstructionsHistoryApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

StandingInstructionsHistoryApi apiService = defaultClient.createService(StandingInstructionsHistoryApi.class);

// Initialize these parameters earlier.
Call<GetStandingInstructionRunHistoryResponse> call = apiService.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType, locale, dateFormat, fromDate, toDate);
call.enqueue(new Callback<GetStandingInstructionRunHistoryResponse>() {
    @Override
    public void onResponse(Call<GetStandingInstructionRunHistoryResponse> call, Response<GetStandingInstructionRunHistoryResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetStandingInstructionRunHistoryResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

