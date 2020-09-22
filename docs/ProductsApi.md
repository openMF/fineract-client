# ProductsApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProduct**](ProductsApi.md#createProduct) | **POST** products/{type} | Create a Share Product
[**handleCommands**](ProductsApi.md#handleCommands) | **POST** products/{type}/{productId} | 
[**retrieveAllProducts**](ProductsApi.md#retrieveAllProducts) | **GET** products/{type} | List Share Products
[**retrieveProduct**](ProductsApi.md#retrieveProduct) | **GET** products/{type}/{productId} | Retrieve a Share Product
[**retrieveTemplate**](ProductsApi.md#retrieveTemplate) | **GET** products/{type}/template | 
[**updateProduct**](ProductsApi.md#updateProduct) | **PUT** products/{type}/{productId} | Update a Share Product


<a name="createProduct"></a>
# **createProduct**
> PostProductsTypeResponse createProduct(type, body)

Create a Share Product

Creates a Share Product  Mandatory Fields: name, shortName, description, currencyCode, digitsAfterDecimal,inMultiplesOf, locale, totalShares, unitPrice, nominalShares,allowDividendCalculationForInactiveClients,accountingRule  Mandatory Fields for Cash based accounting (accountingRule &#x3D; 2): shareReferenceId, shareSuspenseId, shareEquityId, incomeFromFeeAccountId  Optional Fields: sharesIssued, minimumShares, maximumShares, minimumActivePeriodForDividends, minimumactiveperiodFrequencyType, lockinPeriodFrequency, lockinPeriodFrequencyType, marketPricePeriods, chargesSelected

### Example
```java

ProductsApi apiService = defaultClient.createService(ProductsApi.class);

// Initialize these parameters earlier.
Call<PostProductsTypeResponse> call = apiService.createProduct(type, body);
call.enqueue(new Callback<PostProductsTypeResponse>() {
    @Override
    public void onResponse(Call<PostProductsTypeResponse> call, Response<PostProductsTypeResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostProductsTypeResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **type** | **String**| type |
 **body** | [**PostProductsTypeRequest**](PostProductsTypeRequest.md)| body |

### Return type

[**PostProductsTypeResponse**](PostProductsTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="handleCommands"></a>
# **handleCommands**
> String handleCommands(type, productId, command)



### Example
```java

ProductsApi apiService = defaultClient.createService(ProductsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.handleCommands(type, productId, command);
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

 **type** | **String**| type |
 **productId** | **Long**| productId |
 **command** | **String**| command | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllProducts"></a>
# **retrieveAllProducts**
> GetProductsTypeResponse retrieveAllProducts(type, offset, limit)

List Share Products

Lists Share Products  Mandatory Fields: limit, offset  Example Requests:  shareproducts

### Example
```java

ProductsApi apiService = defaultClient.createService(ProductsApi.class);

// Initialize these parameters earlier.
Call<GetProductsTypeResponse> call = apiService.retrieveAllProducts(type, offset, limit);
call.enqueue(new Callback<GetProductsTypeResponse>() {
    @Override
    public void onResponse(Call<GetProductsTypeResponse> call, Response<GetProductsTypeResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetProductsTypeResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **type** | **String**| type |
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**GetProductsTypeResponse**](GetProductsTypeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveProduct"></a>
# **retrieveProduct**
> GetProductsTypeProductIdResponse retrieveProduct(productId, type)

Retrieve a Share Product

Retrieves a Share Product  Example Requests:  products/share/1   products/share/1?template&#x3D;true

### Example
```java

ProductsApi apiService = defaultClient.createService(ProductsApi.class);

// Initialize these parameters earlier.
Call<GetProductsTypeProductIdResponse> call = apiService.retrieveProduct(productId, type);
call.enqueue(new Callback<GetProductsTypeProductIdResponse>() {
    @Override
    public void onResponse(Call<GetProductsTypeProductIdResponse> call, Response<GetProductsTypeProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetProductsTypeProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **productId** | **Long**| productId |
 **type** | **String**| type |

### Return type

[**GetProductsTypeProductIdResponse**](GetProductsTypeProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveTemplate"></a>
# **retrieveTemplate**
> String retrieveTemplate(type)



### Example
```java

ProductsApi apiService = defaultClient.createService(ProductsApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.retrieveTemplate(type);
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

 **type** | **String**| type |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProduct"></a>
# **updateProduct**
> PutProductsTypeProductIdResponse updateProduct(type, productId, body)

Update a Share Product

Updates a Share Product

### Example
```java

ProductsApi apiService = defaultClient.createService(ProductsApi.class);

// Initialize these parameters earlier.
Call<PutProductsTypeProductIdResponse> call = apiService.updateProduct(type, productId, body);
call.enqueue(new Callback<PutProductsTypeProductIdResponse>() {
    @Override
    public void onResponse(Call<PutProductsTypeProductIdResponse> call, Response<PutProductsTypeProductIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutProductsTypeProductIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **type** | **String**| type |
 **productId** | **Long**| productId |
 **body** | [**PutProductsTypeProductIdRequest**](PutProductsTypeProductIdRequest.md)| body |

### Return type

[**PutProductsTypeProductIdResponse**](PutProductsTypeProductIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

