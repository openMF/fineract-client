# PocketApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PocketApi;


PocketApi apiInstance = new PocketApi();
String command = "command_example"; // String | command
String body = "body_example"; // String | 
try {
    PostLinkDelinkAccountsToFromPocketResponse result = apiInstance.handleCommands(command, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PocketApi#handleCommands");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.PocketApi;


PocketApi apiInstance = new PocketApi();
try {
    GetAccountsLinkedToPocketResponse result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PocketApi#retrieveAll");
    e.printStackTrace();
}
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

