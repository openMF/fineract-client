# RecurringDepositAccountTransactionsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**handleTransactionCommands**](RecurringDepositAccountTransactionsApi.md#handleTransactionCommands) | **POST** recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId} | Adjust Transaction | Undo transaction
[**retrieveOne**](RecurringDepositAccountTransactionsApi.md#retrieveOne) | **GET** recurringdepositaccounts/{recurringDepositAccountId}/transactions/{transactionId} | Retrieve Recurring Deposit Account Transaction
[**retrieveTemplate**](RecurringDepositAccountTransactionsApi.md#retrieveTemplate) | **GET** recurringdepositaccounts/{recurringDepositAccountId}/transactions/template | Retrieve Recurring Deposit Account Transaction Template
[**transaction**](RecurringDepositAccountTransactionsApi.md#transaction) | **POST** recurringdepositaccounts/{recurringDepositAccountId}/transactions | Deposit Transaction | Withdrawal Transaction


<a name="handleTransactionCommands"></a>
# **handleTransactionCommands**
> PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse handleTransactionCommands(recurringDepositAccountId, transactionId, body, command)

Adjust Transaction | Undo transaction

Adjust Transaction:  This command modifies the given transaction.  Undo transaction:  This command reverses the given transaction.  Showing request/response for &#39;Adjust Transaction&#39;

### Example
```java

RecurringDepositAccountTransactionsApi apiService = defaultClient.createService(RecurringDepositAccountTransactionsApi.class);

// Initialize these parameters earlier.
Call<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> call = apiService.handleTransactionCommands(recurringDepositAccountId, transactionId, body, command);
call.enqueue(new Callback<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> call, Response<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **transactionId** | **Long**| transactionId |
 **body** | [**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse retrieveOne(recurringDepositAccountId, transactionId)

Retrieve Recurring Deposit Account Transaction

Retrieves Recurring Deposit Account Transaction  Example Requests:  recurringdepositaccounts/1/transactions/1

### Example
```java

RecurringDepositAccountTransactionsApi apiService = defaultClient.createService(RecurringDepositAccountTransactionsApi.class);

// Initialize these parameters earlier.
Call<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> call = apiService.retrieveOne(recurringDepositAccountId, transactionId);
call.enqueue(new Callback<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> call, Response<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse**](GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTransactionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse retrieveTemplate(recurringDepositAccountId, command)

Retrieve Recurring Deposit Account Transaction Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  recurringdepositaccounts/1/transactions/template?command&#x3D;deposit  recurringdepositaccounts/1/transactions/template?command&#x3D;withdrawal

### Example
```java

RecurringDepositAccountTransactionsApi apiService = defaultClient.createService(RecurringDepositAccountTransactionsApi.class);

// Initialize these parameters earlier.
Call<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse> call = apiService.retrieveTemplate(recurringDepositAccountId, command);
call.enqueue(new Callback<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse> call, Response<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **command** | **String**| command | [optional]

### Return type

[**GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse**](GetRecurringDepositAccountsRecurringDepositAccountIdTransactionsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transaction"></a>
# **transaction**
> PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse transaction(recurringDepositAccountId, body, command)

Deposit Transaction | Withdrawal Transaction

Deposit Transaction:  Used for a deposit transaction  Withdrawal Transaction:  Used for a Withdrawal Transaction  Showing request/response for Deposit Transaction

### Example
```java

RecurringDepositAccountTransactionsApi apiService = defaultClient.createService(RecurringDepositAccountTransactionsApi.class);

// Initialize these parameters earlier.
Call<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse> call = apiService.transaction(recurringDepositAccountId, body, command);
call.enqueue(new Callback<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse>() {
    @Override
    public void onResponse(Call<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse> call, Response<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **recurringDepositAccountId** | **Long**| recurringDepositAccountId |
 **body** | [**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsRequest.md)| body |
 **command** | **String**| command | [optional]

### Return type

[**PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse**](PostRecurringDepositAccountsRecurringDepositAccountIdTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

