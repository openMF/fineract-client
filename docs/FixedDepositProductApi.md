# FixedDepositProductApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create**](FixedDepositProductApi.md#create) | **POST** fixeddepositproducts | Create a Fixed Deposit Product
[**delete**](FixedDepositProductApi.md#delete) | **DELETE** fixeddepositproducts/{productId} | Delete a Fixed Deposit Product
[**retrieveAll**](FixedDepositProductApi.md#retrieveAll) | **GET** fixeddepositproducts | List Fixed Deposit Products
[**retrieveOne**](FixedDepositProductApi.md#retrieveOne) | **GET** fixeddepositproducts/{productId} | Retrieve a Fixed Deposit Product
[**retrieveTemplate**](FixedDepositProductApi.md#retrieveTemplate) | **GET** fixeddepositproducts/template | 
[**update**](FixedDepositProductApi.md#update) | **PUT** fixeddepositproducts/{productId} | Update a Fixed Deposit Product


<a name="create"></a>
# **create**
> PostFixedDepositProductsResponse create(body)

Create a Fixed Deposit Product

Creates a Fixed Deposit Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, interestCompoundingPeriodType, interestCalculationType, interestCalculationDaysInYearType, minDepositTerm, minDepositTermTypeId, accountingRule  Optional Fields: lockinPeriodFrequency, lockinPeriodFrequencyType, maxDepositTerm, maxDepositTermTypeId, inMultiplesOfDepositTerm, inMultiplesOfDepositTermTypeId, preClosurePenalApplicable, preClosurePenalInterest, preClosurePenalInterestOnTypeId, feeToIncomeAccountMappings, penaltyToIncomeAccountMappings, charges, charts, , withHoldTax, taxGroupId   Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): savingsReferenceAccountId, savingsControlAccountId, interestOnSavingsAccountId, incomeFromFeeAccountId, transfersInSuspenseAccountId, incomeFromPenaltyAccountId

### Example
```java

FixedDepositProductApi apiService = defaultClient.createService(FixedDepositProductApi.class);

// Initialize these parameters earlier.
Call<PostFixedDepositProductsResponse> call = apiService.create(body);
call.enqueue(new Callback<PostFixedDepositProductsResponse>() {
    @Override
    public void onResponse(Call<PostFixedDepositProductsResponse> call, Response<PostFixedDepositProductsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostFixedDepositProductsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostFixedDepositProductsRequest**](PostFixedDepositProductsRequest.md)| body |

### Return type

[**PostFixedDepositProductsResponse**](PostFixedDepositProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="delete"></a>
# **delete**
> DeleteFixedDepositProductsProductIdResponse delete(productId)

Delete a Fixed Deposit Product

Deletes a Fixed Deposit Product

### Example
```java

FixedDepositProductApi apiService = defaultClient.createService(FixedDepositProductApi.class);

// Initialize these parameters earlier.
Call<DeleteFixedDepositProductsProductIdResponse> call = apiService.delete(productId);
call.enqueue(new Callback<DeleteFixedDepositProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<DeleteFixedDepositProductsProductIdResponse> call, Response<DeleteFixedDepositProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteFixedDepositProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **productId** | **Long**| productId |

### Return type

[**DeleteFixedDepositProductsProductIdResponse**](DeleteFixedDepositProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetFixedDepositProductsResponse&gt; retrieveAll()

List Fixed Deposit Products

Lists Fixed Deposit Products  Example Requests:  fixeddepositproducts   fixeddepositproducts?fields&#x3D;name

### Example
```java

FixedDepositProductApi apiService = defaultClient.createService(FixedDepositProductApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetFixedDepositProductsResponse&gt;> call = apiService.retrieveAll();
call.enqueue(new Callback<List&lt;GetFixedDepositProductsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetFixedDepositProductsResponse&gt;> call, Response<List&lt;GetFixedDepositProductsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetFixedDepositProductsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetFixedDepositProductsResponse&gt;**](GetFixedDepositProductsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveOne"></a>
# **retrieveOne**
> GetFixedDepositProductsProductIdResponse retrieveOne(productId)

Retrieve a Fixed Deposit Product

Retrieves a Fixed Deposit Product  Example Requests:  fixeddepositproducts/1   fixeddepositproducts/1?template&#x3D;true   fixeddepositproducts/1?fields&#x3D;name,description

### Example
```java

FixedDepositProductApi apiService = defaultClient.createService(FixedDepositProductApi.class);

// Initialize these parameters earlier.
Call<GetFixedDepositProductsProductIdResponse> call = apiService.retrieveOne(productId);
call.enqueue(new Callback<GetFixedDepositProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<GetFixedDepositProductsProductIdResponse> call, Response<GetFixedDepositProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetFixedDepositProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **productId** | **Long**| productId |

### Return type

[**GetFixedDepositProductsProductIdResponse**](GetFixedDepositProductsProductIdResponse.md)

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

FixedDepositProductApi apiService = defaultClient.createService(FixedDepositProductApi.class);

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
> PutFixedDepositProductsProductIdResponse update(productId, body)

Update a Fixed Deposit Product

Updates a Fixed Deposit Product

### Example
```java

FixedDepositProductApi apiService = defaultClient.createService(FixedDepositProductApi.class);

// Initialize these parameters earlier.
Call<PutFixedDepositProductsProductIdResponse> call = apiService.update(productId, body);
call.enqueue(new Callback<PutFixedDepositProductsProductIdResponse>() {
    @Override
    public void onResponse(Call<PutFixedDepositProductsProductIdResponse> call, Response<PutFixedDepositProductsProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutFixedDepositProductsProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **productId** | **Long**| productId |
 **body** | [**PutFixedDepositProductsProductIdRequest**](PutFixedDepositProductsProductIdRequest.md)| body |

### Return type

[**PutFixedDepositProductsProductIdResponse**](PutFixedDepositProductsProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

