# SelfSavingsAccountApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**modifySavingsAccountApplication**](SelfSavingsAccountApi.md#modifySavingsAccountApplication) | **PUT** self/savingsaccounts/{accountId} | 
[**retrieveAllSavingsAccountCharges**](SelfSavingsAccountApi.md#retrieveAllSavingsAccountCharges) | **GET** self/savingsaccounts/{accountId}/charges | List Savings Charges
[**retrieveSavings**](SelfSavingsAccountApi.md#retrieveSavings) | **GET** self/savingsaccounts/{accountId} | Retrieve a savings account
[**retrieveSavingsAccountCharge**](SelfSavingsAccountApi.md#retrieveSavingsAccountCharge) | **GET** self/savingsaccounts/{accountId}/charges/{savingsAccountChargeId} | Retrieve a Savings account Charge
[**retrieveSavingsTransaction**](SelfSavingsAccountApi.md#retrieveSavingsTransaction) | **GET** self/savingsaccounts/{accountId}/transactions/{transactionId} | Retrieve Savings Account Transaction
[**submitSavingsAccountApplication**](SelfSavingsAccountApi.md#submitSavingsAccountApplication) | **POST** self/savingsaccounts | 
[**template**](SelfSavingsAccountApi.md#template) | **GET** self/savingsaccounts/template | 


<a name="modifySavingsAccountApplication"></a>
# **modifySavingsAccountApplication**
> String modifySavingsAccountApplication(accountId, command, body)



### Example
```java

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.modifySavingsAccountApplication(accountId, command, body);
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

 **accountId** | **Long**|  |
 **command** | **String**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllSavingsAccountCharges"></a>
# **retrieveAllSavingsAccountCharges**
> List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt; retrieveAllSavingsAccountCharges(accountId, chargeStatus)

List Savings Charges

Lists Savings Charges  Example Requests:  self/savingsaccounts/1/charges  self/savingsaccounts/1/charges?chargeStatus&#x3D;inactive  self/savingsaccounts/1/charges?fields&#x3D;name,amountOrPercentage

### Example
```java

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;> call = apiService.retrieveAllSavingsAccountCharges(accountId, chargeStatus);
call.enqueue(new Callback<List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;> call, Response<List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountId** | **Long**| accountId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]

### Return type

[**List&lt;GetSelfSavingsAccountsAccountIdChargesResponse&gt;**](GetSelfSavingsAccountsAccountIdChargesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveSavings"></a>
# **retrieveSavings**
> GetSelfSavingsAccountsResponse retrieveSavings(accountId, chargeStatus)

Retrieve a savings account

Retrieves a savings account  Example Requests :  self/savingsaccounts/1   self/savingsaccounts/1?associations&#x3D;transactions

### Example
```java

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<GetSelfSavingsAccountsResponse> call = apiService.retrieveSavings(accountId, chargeStatus);
call.enqueue(new Callback<GetSelfSavingsAccountsResponse>() {
    @Override
    public void onResponse(Call<GetSelfSavingsAccountsResponse> call, Response<GetSelfSavingsAccountsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfSavingsAccountsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountId** | **Long**| accountId |
 **chargeStatus** | **String**| chargeStatus | [optional] [default to all]

### Return type

[**GetSelfSavingsAccountsResponse**](GetSelfSavingsAccountsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveSavingsAccountCharge"></a>
# **retrieveSavingsAccountCharge**
> GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse retrieveSavingsAccountCharge(accountId, savingsAccountChargeId)

Retrieve a Savings account Charge

Retrieves a Savings account Charge  Example Requests:  self/savingsaccounts/1/charges/5   self/savingsaccounts/1/charges/5?fields&#x3D;name,amountOrPercentage

### Example
```java

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> call = apiService.retrieveSavingsAccountCharge(accountId, savingsAccountChargeId);
call.enqueue(new Callback<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse>() {
    @Override
    public void onResponse(Call<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> call, Response<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountId** | **Long**| accountId |
 **savingsAccountChargeId** | **Long**| savingsAccountChargeId |

### Return type

[**GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse**](GetSelfSavingsAccountsAccountIdChargesSavingsAccountChargeIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveSavingsTransaction"></a>
# **retrieveSavingsTransaction**
> GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse retrieveSavingsTransaction(accountId, transactionId)

Retrieve Savings Account Transaction

Retrieves Savings Account Transaction  Example Requests:  self/savingsaccounts/1/transactions/1

### Example
```java

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> call = apiService.retrieveSavingsTransaction(accountId, transactionId);
call.enqueue(new Callback<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse>() {
    @Override
    public void onResponse(Call<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> call, Response<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **accountId** | **Long**| accountId |
 **transactionId** | **Long**| transactionId |

### Return type

[**GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse**](GetSelfSavingsAccountsAccountIdTransactionsTransactionIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitSavingsAccountApplication"></a>
# **submitSavingsAccountApplication**
> String submitSavingsAccountApplication(command, body)



### Example
```java

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.submitSavingsAccountApplication(command, body);
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

 **command** | **String**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> String template(clientId, productId, body)



### Example
```java

SelfSavingsAccountApi apiService = defaultClient.createService(SelfSavingsAccountApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.template(clientId, productId, body);
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

 **clientId** | **Long**|  | [optional]
 **productId** | **Long**|  | [optional]
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

