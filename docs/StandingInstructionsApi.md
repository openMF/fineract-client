# StandingInstructionsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

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

StandingInstructionsApi apiService = defaultClient.createService(StandingInstructionsApi.class);

// Initialize these parameters earlier.
Call<PostStandingInstructionsResponse> call = apiService.create(body);
call.enqueue(new Callback<PostStandingInstructionsResponse>() {
    @Override
    public void onResponse(Call<PostStandingInstructionsResponse> call, Response<PostStandingInstructionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostStandingInstructionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

StandingInstructionsApi apiService = defaultClient.createService(StandingInstructionsApi.class);

// Initialize these parameters earlier.
Call<GetStandingInstructionsResponse> call = apiService.retrieveAll(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType);
call.enqueue(new Callback<GetStandingInstructionsResponse>() {
    @Override
    public void onResponse(Call<GetStandingInstructionsResponse> call, Response<GetStandingInstructionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetStandingInstructionsResponse> call, Throwable t) {
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

StandingInstructionsApi apiService = defaultClient.createService(StandingInstructionsApi.class);

// Initialize these parameters earlier.
Call<GetStandingInstructionsStandingInstructionIdResponse> call = apiService.retrieveOne(standingInstructionId, sqlSearch, externalId, offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<GetStandingInstructionsStandingInstructionIdResponse>() {
    @Override
    public void onResponse(Call<GetStandingInstructionsStandingInstructionIdResponse> call, Response<GetStandingInstructionsStandingInstructionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetStandingInstructionsStandingInstructionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

StandingInstructionsApi apiService = defaultClient.createService(StandingInstructionsApi.class);

// Initialize these parameters earlier.
Call<GetStandingInstructionsTemplateResponse> call = apiService.template(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType, transferType);
call.enqueue(new Callback<GetStandingInstructionsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetStandingInstructionsTemplateResponse> call, Response<GetStandingInstructionsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetStandingInstructionsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

StandingInstructionsApi apiService = defaultClient.createService(StandingInstructionsApi.class);

// Initialize these parameters earlier.
Call<PutStandingInstructionsStandingInstructionIdResponse> call = apiService.update(standingInstructionId, command, body);
call.enqueue(new Callback<PutStandingInstructionsStandingInstructionIdResponse>() {
    @Override
    public void onResponse(Call<PutStandingInstructionsStandingInstructionIdResponse> call, Response<PutStandingInstructionsStandingInstructionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutStandingInstructionsStandingInstructionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

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

