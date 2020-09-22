# SavingsProductApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](SavingsProductApi.md#create) | **POST** savingsproducts | Create a Savings Product
[**delete**](SavingsProductApi.md#delete) | **DELETE** savingsproducts/{productId} | Delete a Savings Product
[**retrieveAll**](SavingsProductApi.md#retrieveAll) | **GET** savingsproducts | List Savings Products
[**retrieveOne**](SavingsProductApi.md#retrieveOne) | **GET** savingsproducts/{productId} | Retrieve a Savings Product
[**retrieveTemplate**](SavingsProductApi.md#retrieveTemplate) | **GET** savingsproducts/template | Retrieve Savings Product Template
[**update**](SavingsProductApi.md#update) | **PUT** savingsproducts/{productId} | Update a Savings Product


<a name="create"></a>
# **create**
> PostSavingsProductsResponse create(body)

Create a Savings Product

Creates a Savings Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, nominalAnnualInterestRate, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId  Optional Fields: minRequiredOpeningBalance, lockinPeriodFrequency, lockinPeriodFrequencyType, withdrawalFeeForTransfers, paymentChannelToFundSourceMappings, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, allowOverdraft, overdraftLimit, minBalanceForInterestCalculation,withHoldTax,taxGroupId

### Example
```java

SavingsProductApi apiService = defaultClient.createService(SavingsProductApi.class);

// Initialize these parameters earlier.
Call<PostSavingsProductsResponse> call = apiService.create(body);
call.enqueue(new Callback<PostSavingsProductsResponse>() {
    @Override
    public void onResponse(Call<PostSavingsProductsResponse> call, Response<PostSavingsProductsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostSavingsProductsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostSavingsProductsRequest**](PostSavingsProductsRequest.md)| body |

### Return type

[**PostSavingsProductsResponse**](PostSavingsProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteSavingsProductsProductIdResponse delete(productId)

Delete a Savings Product

Deletes a Savings Product

### Example
```java

SavingsProductApi apiService = defaultClient.createService(SavingsProductApi.class);

// Initialize these parameters earlier.
Call<DeleteSavingsProductsProductIdResponse> call = apiService.delete(productId);
call.enqueue(new Callback<DeleteSavingsProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<DeleteSavingsProductsProductIdResponse> call, Response<DeleteSavingsProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteSavingsProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **productId** | **Long**| productId |

### Return type

[**DeleteSavingsProductsProductIdResponse**](DeleteSavingsProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetSavingsProductsResponse&gt; retrieveAll()

List Savings Products

Lists Savings Products  Example Requests:  savingsproducts  savingsproducts?fields&#x3D;name

### Example
```java

SavingsProductApi apiService = defaultClient.createService(SavingsProductApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetSavingsProductsResponse&gt;> call = apiService.retrieveAll();
call.enqueue(new Callback<List&lt;GetSavingsProductsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetSavingsProductsResponse&gt;> call, Response<List&lt;GetSavingsProductsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetSavingsProductsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetSavingsProductsResponse&gt;**](GetSavingsProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetSavingsProductsProductIdResponse retrieveOne(productId)

Retrieve a Savings Product

Retrieves a Savings Product  Example Requests:  savingsproducts/1  savingsproducts/1?template&#x3D;true  savingsproducts/1?fields&#x3D;name,description

### Example
```java

SavingsProductApi apiService = defaultClient.createService(SavingsProductApi.class);

// Initialize these parameters earlier.
Call<GetSavingsProductsProductIdResponse> call = apiService.retrieveOne(productId);
call.enqueue(new Callback<GetSavingsProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<GetSavingsProductsProductIdResponse> call, Response<GetSavingsProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSavingsProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **productId** | **Long**| productId |

### Return type

[**GetSavingsProductsProductIdResponse**](GetSavingsProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> GetSavingsProductsTemplateResponse retrieveTemplate()

Retrieve Savings Product Template

This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Request:  savingsproducts/template

### Example
```java

SavingsProductApi apiService = defaultClient.createService(SavingsProductApi.class);

// Initialize these parameters earlier.
Call<GetSavingsProductsTemplateResponse> call = apiService.retrieveTemplate();
call.enqueue(new Callback<GetSavingsProductsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetSavingsProductsTemplateResponse> call, Response<GetSavingsProductsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetSavingsProductsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetSavingsProductsTemplateResponse**](GetSavingsProductsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutSavingsProductsProductIdResponse update(productId, body)

Update a Savings Product

Updates a Savings Product

### Example
```java

SavingsProductApi apiService = defaultClient.createService(SavingsProductApi.class);

// Initialize these parameters earlier.
Call<PutSavingsProductsProductIdResponse> call = apiService.update(productId, body);
call.enqueue(new Callback<PutSavingsProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<PutSavingsProductsProductIdResponse> call, Response<PutSavingsProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutSavingsProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **productId** | **Long**| productId |
 **body** | [**PutSavingsProductsProductIdRequest**](PutSavingsProductsProductIdRequest.md)| body |

### Return type

[**PutSavingsProductsProductIdResponse**](PutSavingsProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

