# PocketApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleCommands**](PocketApi.md#handleCommands) | **POST** self/pockets | Link/delink accounts to/from pocket
[**retrieveAll**](PocketApi.md#retrieveAll) | **GET** self/pockets | Retrieve accounts linked to pocket


<a name="handleCommands"></a>
# **handleCommands**
> PostLinkDelinkAccountsToFromPocketResponse handleCommands(command, body)

Link/delink accounts to/from pocket

Pockets behave as favourites. An user can link his/her Loan, Savings and Share accounts to pocket for faster access. In a similar way linked accounts can be delinked from the pocket.  Example Requests:  self/pockets?command&#x3D;linkAccounts  self/pockets?command&#x3D;delinkAccounts

### Example
```java

PocketApi apiService = defaultClient.createService(PocketApi.class);

// Initialize these parameters earlier.
Call<PostLinkDelinkAccountsToFromPocketResponse> call = apiService.handleCommands(command, body);
call.enqueue(new Callback<PostLinkDelinkAccountsToFromPocketResponse>() {
    @Override
    public void onResponse(Call<PostLinkDelinkAccountsToFromPocketResponse> call, Response<PostLinkDelinkAccountsToFromPocketResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostLinkDelinkAccountsToFromPocketResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **command** | **String**| command | [optional]
 **body** | **String**|  | [optional]

### Return type

[**PostLinkDelinkAccountsToFromPocketResponse**](PostLinkDelinkAccountsToFromPocketResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> GetAccountsLinkedToPocketResponse retrieveAll()

Retrieve accounts linked to pocket

All linked loan  Example Requests:   self/pockets

### Example
```java

PocketApi apiService = defaultClient.createService(PocketApi.class);

// Initialize these parameters earlier.
Call<GetAccountsLinkedToPocketResponse> call = apiService.retrieveAll();
call.enqueue(new Callback<GetAccountsLinkedToPocketResponse>() {
    @Override
    public void onResponse(Call<GetAccountsLinkedToPocketResponse> call, Response<GetAccountsLinkedToPocketResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetAccountsLinkedToPocketResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetAccountsLinkedToPocketResponse**](GetAccountsLinkedToPocketResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

