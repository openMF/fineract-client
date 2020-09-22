# OfficetransactionsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**delete**](OfficetransactionsApi.md#delete) | **DELETE** officetransactions/{transactionId} | 
[**newOfficeTransactionDetails**](OfficetransactionsApi.md#newOfficeTransactionDetails) | **GET** officetransactions/template | 
[**retrieveOfficeTransactions**](OfficetransactionsApi.md#retrieveOfficeTransactions) | **GET** officetransactions | 
[**transferMoneyFrom**](OfficetransactionsApi.md#transferMoneyFrom) | **POST** officetransactions | 


<a name="delete"></a>
# **delete**
> String delete(transactionId)



### Example
```java

OfficetransactionsApi apiService = defaultClient.createService(OfficetransactionsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.delete(transactionId);
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

 **transactionId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="newOfficeTransactionDetails"></a>
# **newOfficeTransactionDetails**
> String newOfficeTransactionDetails()



### Example
```java

OfficetransactionsApi apiService = defaultClient.createService(OfficetransactionsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.newOfficeTransactionDetails();
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
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOfficeTransactions"></a>
# **retrieveOfficeTransactions**
> String retrieveOfficeTransactions()



### Example
```java

OfficetransactionsApi apiService = defaultClient.createService(OfficetransactionsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveOfficeTransactions();
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
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="transferMoneyFrom"></a>
# **transferMoneyFrom**
> String transferMoneyFrom(body)



### Example
```java

OfficetransactionsApi apiService = defaultClient.createService(OfficetransactionsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.transferMoneyFrom(body);
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

 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

