# StandingInstructionsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](StandingInstructionsApi.md#create) | **POST** standinginstructions | Create new Standing Instruction
[**retrieveAll**](StandingInstructionsApi.md#retrieveAll) | **GET** standinginstructions | List Standing Instructions
[**retrieveOne**](StandingInstructionsApi.md#retrieveOne) | **GET** standinginstructions/{standingInstructionId} | Retrieve Standing Instruction
[**template**](StandingInstructionsApi.md#template) | **GET** standinginstructions/template | Retrieve Standing Instruction Template
[**update**](StandingInstructionsApi.md#update) | **PUT** standinginstructions/{standingInstructionId} | Update Standing Instruction | Delete Standing Instruction


<a name="create"></a>
# **create**
> PostStandingInstructionsResponse create(body)

Create new Standing Instruction

Ability to create new instruction for transfer of monetary funds from one account to another

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.StandingInstructionsApi;


StandingInstructionsApi apiInstance = new StandingInstructionsApi();
PostStandingInstructionsRequest body = new PostStandingInstructionsRequest(); // PostStandingInstructionsRequest | body
try {
    PostStandingInstructionsResponse result = apiInstance.create(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandingInstructionsApi#create");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostStandingInstructionsRequest**](PostStandingInstructionsRequest.md)| body |

### Return type

[**PostStandingInstructionsResponse**](PostStandingInstructionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> GetStandingInstructionsResponse retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType)

List Standing Instructions

Example Requests:  standinginstructions

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.StandingInstructionsApi;


StandingInstructionsApi apiInstance = new StandingInstructionsApi();
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
try {
    GetStandingInstructionsResponse result = apiInstance.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandingInstructionsApi#retrieveAll");
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

### Return type

[**GetStandingInstructionsResponse**](GetStandingInstructionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetStandingInstructionsStandingInstructionIdResponse retrieveOne(standingInstructionId, sqlSearch, externalId, offset, limit, orderBy, sortOrder)

Retrieve Standing Instruction

Example Requests :  standinginstructions/1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.StandingInstructionsApi;


StandingInstructionsApi apiInstance = new StandingInstructionsApi();
Long standingInstructionId = 789L; // Long | standingInstructionId
String sqlSearch = "sqlSearch_example"; // String | sqlSearch
String externalId = "externalId_example"; // String | externalId
Integer offset = 56; // Integer | offset
Integer limit = 56; // Integer | limit
String orderBy = "orderBy_example"; // String | orderBy
String sortOrder = "sortOrder_example"; // String | sortOrder
try {
    GetStandingInstructionsStandingInstructionIdResponse result = apiInstance.retrieveOne(standingInstructionId, sqlSearch, externalId, offset, limit, orderBy, sortOrder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandingInstructionsApi#retrieveOne");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standingInstructionId** | **Long**| standingInstructionId |
 **sqlSearch** | **String**| sqlSearch | [optional]
 **externalId** | **String**| externalId | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**GetStandingInstructionsStandingInstructionIdResponse**](GetStandingInstructionsStandingInstructionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetStandingInstructionsTemplateResponse template(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType, transferType)

Retrieve Standing Instruction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1&amp;transferType&#x3D;1  standinginstructions/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1&amp;transferType&#x3D;1

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.StandingInstructionsApi;


StandingInstructionsApi apiInstance = new StandingInstructionsApi();
Long fromOfficeId = 789L; // Long | fromOfficeId
Long fromClientId = 789L; // Long | fromClientId
Long fromAccountId = 789L; // Long | fromAccountId
Integer fromAccountType = 56; // Integer | fromAccountType
Long toOfficeId = 789L; // Long | toOfficeId
Long toClientId = 789L; // Long | toClientId
Long toAccountId = 789L; // Long | toAccountId
Integer toAccountType = 56; // Integer | toAccountType
Integer transferType = 56; // Integer | transferType
try {
    GetStandingInstructionsTemplateResponse result = apiInstance.template(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType, transferType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandingInstructionsApi#template");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fromOfficeId** | **Long**| fromOfficeId | [optional]
 **fromClientId** | **Long**| fromClientId | [optional]
 **fromAccountId** | **Long**| fromAccountId | [optional]
 **fromAccountType** | **Integer**| fromAccountType | [optional]
 **toOfficeId** | **Long**| toOfficeId | [optional]
 **toClientId** | **Long**| toClientId | [optional]
 **toAccountId** | **Long**| toAccountId | [optional]
 **toAccountType** | **Integer**| toAccountType | [optional]
 **transferType** | **Integer**| transferType | [optional]

### Return type

[**GetStandingInstructionsTemplateResponse**](GetStandingInstructionsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutStandingInstructionsStandingInstructionIdResponse update(standingInstructionId, command, body)

Update Standing Instruction | Delete Standing Instruction

Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;update   Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;delete

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.StandingInstructionsApi;


StandingInstructionsApi apiInstance = new StandingInstructionsApi();
Long standingInstructionId = 789L; // Long | standingInstructionId
String command = "command_example"; // String | command
PutStandingInstructionsStandingInstructionIdRequest body = new PutStandingInstructionsStandingInstructionIdRequest(); // PutStandingInstructionsStandingInstructionIdRequest | body
try {
    PutStandingInstructionsStandingInstructionIdResponse result = apiInstance.update(standingInstructionId, command, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StandingInstructionsApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **standingInstructionId** | **Long**| standingInstructionId |
 **command** | **String**| command | [optional]
 **body** | [**PutStandingInstructionsStandingInstructionIdRequest**](PutStandingInstructionsStandingInstructionIdRequest.md)| body | [optional]

### Return type

[**PutStandingInstructionsStandingInstructionIdResponse**](PutStandingInstructionsStandingInstructionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

