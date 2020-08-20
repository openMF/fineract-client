# SelfShareAccountsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccount**](SelfShareAccountsApi.md#createAccount) | **POST** self/shareaccounts | Submit new share application
[**retrieveShareAccount**](SelfShareAccountsApi.md#retrieveShareAccount) | **GET** self/shareaccounts/{accountId} | 
[**template**](SelfShareAccountsApi.md#template) | **GET** self/shareaccounts/template | Retrieve Share Account Template


<a name="createAccount"></a>
# **createAccount**
> List&lt;PostNewShareApplicationResponse&gt; createAccount(body)

Submit new share application

Mandatory fields:  clientId, productId, submittedDate, savingsAccountId, requestedShares, applicationDate   Optional Fields  accountNo, externalId   Inherited from Product (if not provided)  minimumActivePeriod, minimumActivePeriodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType.

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfShareAccountsApi;


SelfShareAccountsApi apiInstance = new SelfShareAccountsApi();
String body = "body_example"; // String | 
try {
    List<PostNewShareApplicationResponse> result = apiInstance.createAccount(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfShareAccountsApi#createAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  | [optional]

### Return type

[**List&lt;PostNewShareApplicationResponse&gt;**](PostNewShareApplicationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveShareAccount"></a>
# **retrieveShareAccount**
> String retrieveShareAccount(accountId)



### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfShareAccountsApi;


SelfShareAccountsApi apiInstance = new SelfShareAccountsApi();
Long accountId = 789L; // Long | 
try {
    String result = apiInstance.retrieveShareAccount(accountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfShareAccountsApi#retrieveShareAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> List&lt;GetShareAccountsClientIdProductIdResponse&gt; template(clientId, productId)

Retrieve Share Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of: Field Defaults  Allowed Value Lists   Arguments  clientId:Integer mandatory productId:Integer optionalIf entered, productId, productName and selectedProduct fields are returned. Example Requests:  self/shareaccounts/template?clientId&#x3D;14  self/shareaccounts/template?clientId&#x3D;14&amp;productId&#x3D;3 

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.SelfShareAccountsApi;


SelfShareAccountsApi apiInstance = new SelfShareAccountsApi();
Long clientId = 789L; // Long | clientId
Long productId = 789L; // Long | productId
try {
    List<GetShareAccountsClientIdProductIdResponse> result = apiInstance.template(clientId, productId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SelfShareAccountsApi#template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **Long**| clientId | [optional]
 **productId** | **Long**| productId | [optional]

### Return type

[**List&lt;GetShareAccountsClientIdProductIdResponse&gt;**](GetShareAccountsClientIdProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

