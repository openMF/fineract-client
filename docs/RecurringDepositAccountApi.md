# RecurringDepositAccountApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**accountClosureTemplate**](RecurringDepositAccountApi.md#accountClosureTemplate) | **GET** recurringdepositaccounts/{accountId}/template | 
[**delete**](RecurringDepositAccountApi.md#delete) | **DELETE** recurringdepositaccounts/{accountId} | Delete a recurring deposit application
[**getRecurringDepositTemplate**](RecurringDepositAccountApi.md#getRecurringDepositTemplate) | **GET** recurringdepositaccounts/downloadtemplate | 
[**getRecurringDepositTransactionTemplate**](RecurringDepositAccountApi.md#getRecurringDepositTransactionTemplate) | **GET** recurringdepositaccounts/transactions/downloadtemplate | 
[**handleCommands**](RecurringDepositAccountApi.md#handleCommands) | **POST** recurringdepositaccounts/{accountId} | Approve recurring deposit application | Undo approval recurring deposit application | Reject recurring deposit application | Withdraw recurring deposit application | Activate a recurring deposit account | Update the recommended deposit amount for a recurring deposit account | Close a recurring deposit account | Premature Close a recurring deposit account | Calculate Premature amount on Recurring deposit account | Calculate Interest on recurring Deposit Account | Post Interest on recurring Deposit Account
[**postRecurringDepositTemplate**](RecurringDepositAccountApi.md#postRecurringDepositTemplate) | **POST** recurringdepositaccounts/uploadtemplate | 
[**postRecurringDepositTransactionsTemplate**](RecurringDepositAccountApi.md#postRecurringDepositTransactionsTemplate) | **POST** recurringdepositaccounts/transactions/uploadtemplate | 
[**retrieveAll**](RecurringDepositAccountApi.md#retrieveAll) | **GET** recurringdepositaccounts | List Recurring deposit applications/accounts
[**retrieveOne**](RecurringDepositAccountApi.md#retrieveOne) | **GET** recurringdepositaccounts/{accountId} | Retrieve a recurring deposit application/account
[**submitApplication**](RecurringDepositAccountApi.md#submitApplication) | **POST** recurringdepositaccounts | Submit new recurring deposit application
[**template**](RecurringDepositAccountApi.md#template) | **GET** recurringdepositaccounts/template | Retrieve recurring Deposit Account Template
[**update**](RecurringDepositAccountApi.md#update) | **PUT** recurringdepositaccounts/{accountId} | Modify a recurring deposit application


<a name="accountClosureTemplate"></a>
# **accountClosureTemplate**
> String accountClosureTemplate(accountId, command)



### Example
```java

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.accountClosureTemplate(accountId, command);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountId** | **Long**| accountId |
 **command** | **String**| command | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteRecurringDepositAccountsResponse delete(accountId)

Delete a recurring deposit application

At present we support hard delete of recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state. One the application is moves past this state, it is not possible to do a &#39;hard&#39; delete of the application or the account. An API endpoint will be added to close/de-activate the recurring deposit account.

### Example
```java

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<DeleteRecurringDepositAccountsResponse> call = apiService.delete(accountId);
call.enqueue(new Callback<DeleteRecurringDepositAccountsResponse>() {
    @Override
    public void onResponse(Call<DeleteRecurringDepositAccountsResponse> call, Response<DeleteRecurringDepositAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteRecurringDepositAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountId** | **Long**| accountId |

### Return type

[**DeleteRecurringDepositAccountsResponse**](DeleteRecurringDepositAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getRecurringDepositTemplate"></a>
# **getRecurringDepositTemplate**
> getRecurringDepositTemplate(officeId, staffId, dateFormat)



### Example
```java

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.getRecurringDepositTemplate(officeId, staffId, dateFormat);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **officeId** | **Long**|  | [optional]
 **staffId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="getRecurringDepositTransactionTemplate"></a>
# **getRecurringDepositTransactionTemplate**
> getRecurringDepositTransactionTemplate(officeId, dateFormat)



### Example
```java

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<> call = apiService.getRecurringDepositTransactionTemplate(officeId, dateFormat);
call.enqueue(new Callback<>() {
    @Override
    public void onResponse(Call<> call, Response<> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **officeId** | **Long**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel

<a name="handleCommands"></a>
# **handleCommands**
> PostRecurringDepositAccountsAccountIdResponse handleCommands(accountId, body, command)

Approve recurring deposit application | Undo approval recurring deposit application | Reject recurring deposit application | Withdraw recurring deposit application | Activate a recurring deposit account | Update the recommended deposit amount for a recurring deposit account | Close a recurring deposit account | Premature Close a recurring deposit account | Calculate Premature amount on Recurring deposit account | Calculate Interest on recurring Deposit Account | Post Interest on recurring Deposit Account

Approve recurring deposit application:  Approves recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Undo approval recurring deposit application:  Will move &#39;approved&#39; recurring deposit application back to &#39;Submitted and pending approval&#39; state.  Reject recurring deposit application  Rejects recurring deposit application so long as its in &#39;Submitted and pending approval&#39; state.  Withdraw recurring deposit application:  Used when an applicant withdraws from the recurring deposit application. It must be in &#39;Submitted and pending approval&#39; state.  Activate a recurring deposit account:  Results in an approved recurring deposit application being converted into an &#39;active&#39; recurring deposit account.  Update the recommended deposit amount for a recurring deposit account:  Updates the recommended deposit amount for a RD account as on the effective date.  Close a recurring deposit account  Results in a Matured recurring deposit account being converted into a &#39;closed&#39; recurring deposit account.  On account close allowed actions are.Premature Close a recurring deposit account:  Results in an Active recurring deposit account being converted into a &#39;Premature Closed&#39; recurring deposit account with options to withdraw prematured amount. (premature amount is calculated using interest rate chart applicable along with penal interest if any.)  On account premature closure allowed actions are.  Calculate Premature amount on Recurring deposit account:  Calculate premature amount on recurring deposit till premature close date. Premature amount is calculated based on interest chart and penal interest applicable if any.  Calculate Interest on recurring Deposit Account:  Calculates interest earned on a recurring deposit account based on todays date. It does not attempt to post or credit the interest on the account. That is responsibility of the Post Interest API that will likely be called by overnight process.  Post Interest on recurring Deposit Account:  Calculates and Posts interest earned on a recurring deposit account based on todays date and whether an interest posting or crediting event is due.  Showing request/response for &#39;Post Interest on recurring Deposit Account&#39;

### Example
```java

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<PostRecurringDepositAccountsAccountIdResponse> call = apiService.handleCommands(accountId, body, command);
call.enqueue(new Callback<PostRecurringDepositAccountsAccountIdResponse>() {
    @Override
    public void onResponse(Call<PostRecurringDepositAccountsAccountIdResponse> call, Response<PostRecurringDepositAccountsAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRecurringDepositAccountsAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountId** | **Long**| accountId |
 **body** | [**PostRecurringDepositAccountsAccountIdRequest**](PostRecurringDepositAccountsAccountIdRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostRecurringDepositAccountsAccountIdResponse**](PostRecurringDepositAccountsAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postRecurringDepositTemplate"></a>
# **postRecurringDepositTemplate**
> String postRecurringDepositTemplate(file, locale, dateFormat)



### Example
```java

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postRecurringDepositTemplate(file, locale, dateFormat);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **file** | **File**|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="postRecurringDepositTransactionsTemplate"></a>
# **postRecurringDepositTransactionsTemplate**
> String postRecurringDepositTransactionsTemplate(file, locale, dateFormat)



### Example
```java

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.postRecurringDepositTransactionsTemplate(file, locale, dateFormat);
call.enqueue(new Callback<String>() {
    @Override
    public void onResponse(Call<String> call, Response<String> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<String> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **file** | **File**|  | [optional]
 **locale** | **String**|  | [optional]
 **dateFormat** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetRecurringDepositAccountsResponse&gt; retrieveAll(paged, offset, limit, orderBy, sortOrder)

List Recurring deposit applications/accounts

Lists Recurring deposit applications/accounts  Example Requests:  recurringdepositaccounts   recurringdepositaccounts?fields&#x3D;name

### Example
```java

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetRecurringDepositAccountsResponse&gt;> call = apiService.retrieveAll(paged, offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<List&lt;GetRecurringDepositAccountsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetRecurringDepositAccountsResponse&gt;> call, Response<List&lt;GetRecurringDepositAccountsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetRecurringDepositAccountsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **paged** | **Boolean**| paged | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**List&lt;GetRecurringDepositAccountsResponse&gt;**](GetRecurringDepositAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetRecurringDepositAccountsAccountIdResponse retrieveOne(accountId, staffInSelectedOfficeOnly, chargeStatus)

Retrieve a recurring deposit application/account

Retrieves a recurring deposit application/account  Example Requests :  recurringdepositaccounts/1   recurringdepositaccounts/1?associations&#x3D;all

### Example
```java

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<GetRecurringDepositAccountsAccountIdResponse> call = apiService.retrieveOne(accountId, staffInSelectedOfficeOnly, chargeStatus);
call.enqueue(new Callback<GetRecurringDepositAccountsAccountIdResponse>() {
    @Override
    public void onResponse(Call<GetRecurringDepositAccountsAccountIdResponse> call, Response<GetRecurringDepositAccountsAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRecurringDepositAccountsAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountId** | **Long**| accountId |
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]

### Return type

[**GetRecurringDepositAccountsAccountIdResponse**](GetRecurringDepositAccountsAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitApplication"></a>
# **submitApplication**
> PostRecurringDepositAccountsResponse submitApplication(body)

Submit new recurring deposit application

Submits new recurring deposit application  Mandatory Fields: clientId or groupId, productId, submittedOnDate, depositAmount, depositPeriod, depositPeriodFrequencyId  Optional Fields: accountNo, externalId, fieldOfficerId,linkAccountId(if provided initial deposit amount will be collected from this account),transferInterestToSavings(By enabling this flag all interest postings will be transferred to linked saving account )  Inherited from Product (if not provided): interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, lockinPeriodFrequency, lockinPeriodFrequencyType, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, charts, withHoldTax

### Example
```java

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<PostRecurringDepositAccountsResponse> call = apiService.submitApplication(body);
call.enqueue(new Callback<PostRecurringDepositAccountsResponse>() {
    @Override
    public void onResponse(Call<PostRecurringDepositAccountsResponse> call, Response<PostRecurringDepositAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRecurringDepositAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostRecurringDepositAccountsRequest**](PostRecurringDepositAccountsRequest.md)| body |

### Return type

[**PostRecurringDepositAccountsResponse**](PostRecurringDepositAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetRecurringDepositAccountsTemplateResponse template(clientId, groupId, productId, staffInSelectedOfficeOnly)

Retrieve recurring Deposit Account Template

This is a convenience resource. It can be useful when building maintenance user interface screens for recurring deposit applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists  Example Requests:  recurringdepositaccounts/template?clientId&#x3D;1   recurringdepositaccounts/template?clientId&#x3D;1&amp;productId&#x3D;1

### Example
```java

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<GetRecurringDepositAccountsTemplateResponse> call = apiService.template(clientId, groupId, productId, staffInSelectedOfficeOnly);
call.enqueue(new Callback<GetRecurringDepositAccountsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetRecurringDepositAccountsTemplateResponse> call, Response<GetRecurringDepositAccountsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRecurringDepositAccountsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **clientId** | **Long**| clientId | [optional]
 **groupId** | **Long**| groupId | [optional]
 **productId** | **Long**| productId | [optional]
 **staffInSelectedOfficeOnly** | **Boolean**| staffInSelectedOfficeOnly | [optional] [default to false]

### Return type

[**GetRecurringDepositAccountsTemplateResponse**](GetRecurringDepositAccountsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutRecurringDepositAccountsAccountIdResponse update(accountId, body)

Modify a recurring deposit application

Recurring deposit application can only be modified when in &#39;Submitted and pending approval&#39; state. Once the application is approved, the details cannot be changed using this method. Specific api endpoints will be created to allow change of interest detail such as rate, compounding period, posting period etc

### Example
```java

RecurringDepositAccountApi apiService = defaultClient.createService(RecurringDepositAccountApi.class);

// Initialize these parameters earlier.
Call<PutRecurringDepositAccountsAccountIdResponse> call = apiService.update(accountId, body);
call.enqueue(new Callback<PutRecurringDepositAccountsAccountIdResponse>() {
    @Override
    public void onResponse(Call<PutRecurringDepositAccountsAccountIdResponse> call, Response<PutRecurringDepositAccountsAccountIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutRecurringDepositAccountsAccountIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountId** | **Long**| accountId |
 **body** | [**PutRecurringDepositAccountsAccountIdRequest**](PutRecurringDepositAccountsAccountIdRequest.md)| body |

### Return type

[**PutRecurringDepositAccountsAccountIdResponse**](PutRecurringDepositAccountsAccountIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

