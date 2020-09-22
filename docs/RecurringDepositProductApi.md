# RecurringDepositProductApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](RecurringDepositProductApi.md#create) | **POST** recurringdepositproducts | Create a Recurring Deposit Product
[**delete**](RecurringDepositProductApi.md#delete) | **DELETE** recurringdepositproducts/{productId} | Delete a Recurring Deposit Product
[**retrieveAll**](RecurringDepositProductApi.md#retrieveAll) | **GET** recurringdepositproducts | List Recuring Deposit Products
[**retrieveOne**](RecurringDepositProductApi.md#retrieveOne) | **GET** recurringdepositproducts/{productId} | Retrieve a Recurring Deposit Product
[**retrieveTemplate**](RecurringDepositProductApi.md#retrieveTemplate) | **GET** recurringdepositproducts/template | 
[**update**](RecurringDepositProductApi.md#update) | **PUT** recurringdepositproducts/{productId} | Update a Recurring Deposit Product


<a name="create"></a>
# **create**
> PostRecurringDepositProductsResponse create(body)

Create a Recurring Deposit Product

Creates a Recurring Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, recurringDepositFrequency, recurringDepositFrequencyTypeId, accountingRule, depositAmount  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, minDepositAmount, maxDepositAmount, withHoldTax, taxGroupId

### Example
```java

RecurringDepositProductApi apiService = defaultClient.createService(RecurringDepositProductApi.class);

// Initialize these parameters earlier.
Call<PostRecurringDepositProductsResponse> call = apiService.create(body);
call.enqueue(new Callback<PostRecurringDepositProductsResponse>() {
    @Override
    public void onResponse(Call<PostRecurringDepositProductsResponse> call, Response<PostRecurringDepositProductsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostRecurringDepositProductsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostRecurringDepositProductsRequest**](PostRecurringDepositProductsRequest.md)| body |

### Return type

[**PostRecurringDepositProductsResponse**](PostRecurringDepositProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteRecurringDepositProductsProductIdResponse delete(productId)

Delete a Recurring Deposit Product

Deletes a Recurring Deposit Product

### Example
```java

RecurringDepositProductApi apiService = defaultClient.createService(RecurringDepositProductApi.class);

// Initialize these parameters earlier.
Call<DeleteRecurringDepositProductsProductIdResponse> call = apiService.delete(productId);
call.enqueue(new Callback<DeleteRecurringDepositProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<DeleteRecurringDepositProductsProductIdResponse> call, Response<DeleteRecurringDepositProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteRecurringDepositProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **productId** | **Long**| productId |

### Return type

[**DeleteRecurringDepositProductsProductIdResponse**](DeleteRecurringDepositProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetRecurringDepositProductsResponse&gt; retrieveAll()

List Recuring Deposit Products

Lists Recuring Deposit Products  Example Requests:  recurringdepositproducts   recurringdepositproducts?fields&#x3D;name

### Example
```java

RecurringDepositProductApi apiService = defaultClient.createService(RecurringDepositProductApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetRecurringDepositProductsResponse&gt;> call = apiService.retrieveAll();
call.enqueue(new Callback<List&lt;GetRecurringDepositProductsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetRecurringDepositProductsResponse&gt;> call, Response<List&lt;GetRecurringDepositProductsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetRecurringDepositProductsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetRecurringDepositProductsResponse&gt;**](GetRecurringDepositProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetRecurringDepositProductsProductIdResponse retrieveOne(productId)

Retrieve a Recurring Deposit Product

Retrieves a Recurring Deposit Product  Example Requests:  recurringdepositproducts/1   recurringdepositproducts/1?template&#x3D;true   recurringdepositproducts/1?fields&#x3D;name,description

### Example
```java

RecurringDepositProductApi apiService = defaultClient.createService(RecurringDepositProductApi.class);

// Initialize these parameters earlier.
Call<GetRecurringDepositProductsProductIdResponse> call = apiService.retrieveOne(productId);
call.enqueue(new Callback<GetRecurringDepositProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<GetRecurringDepositProductsProductIdResponse> call, Response<GetRecurringDepositProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetRecurringDepositProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **productId** | **Long**| productId |

### Return type

[**GetRecurringDepositProductsProductIdResponse**](GetRecurringDepositProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> String retrieveTemplate()



### Example
```java

RecurringDepositProductApi apiService = defaultClient.createService(RecurringDepositProductApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveTemplate();
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

<a name="update"></a>
# **update**
> PutRecurringDepositProductsResponse update(productId, body)

Update a Recurring Deposit Product

Updates a Recurring Deposit Product

### Example
```java

RecurringDepositProductApi apiService = defaultClient.createService(RecurringDepositProductApi.class);

// Initialize these parameters earlier.
Call<PutRecurringDepositProductsResponse> call = apiService.update(productId, body);
call.enqueue(new Callback<PutRecurringDepositProductsResponse>() {
    @Override
    public void onResponse(Call<PutRecurringDepositProductsResponse> call, Response<PutRecurringDepositProductsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutRecurringDepositProductsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **productId** | **Long**| productId |
 **body** | [**PutRecurringDepositProductsRequest**](PutRecurringDepositProductsRequest.md)| body |

### Return type

[**PutRecurringDepositProductsResponse**](PutRecurringDepositProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

