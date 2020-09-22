# CreditBureauConfigurationApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrganisationCreditBureau**](CreditBureauConfigurationApi.md#addOrganisationCreditBureau) | **POST** CreditBureauConfiguration/organisationCreditBureau/{organisationCreditBureauId} | 
[**createCreditBureauLoanProductMapping**](CreditBureauConfigurationApi.md#createCreditBureauLoanProductMapping) | **POST** CreditBureauConfiguration/mappings/{CreditBureauId} | 
[**fetchLoanProducts**](CreditBureauConfigurationApi.md#fetchLoanProducts) | **GET** CreditBureauConfiguration/loanProduct | 
[**getConfiguration**](CreditBureauConfigurationApi.md#getConfiguration) | **GET** CreditBureauConfiguration/config/{organisationCreditBureauId} | 
[**getCreditBureau**](CreditBureauConfigurationApi.md#getCreditBureau) | **GET** CreditBureauConfiguration | 
[**getCreditBureauLoanProductMapping**](CreditBureauConfigurationApi.md#getCreditBureauLoanProductMapping) | **GET** CreditBureauConfiguration/mappings | 
[**getOrganisationCreditBureau**](CreditBureauConfigurationApi.md#getOrganisationCreditBureau) | **GET** CreditBureauConfiguration/organisationCreditBureau | 
[**updateCreditBureau**](CreditBureauConfigurationApi.md#updateCreditBureau) | **PUT** CreditBureauConfiguration/organisationCreditBureau | 
[**updateCreditBureauLoanProductMapping**](CreditBureauConfigurationApi.md#updateCreditBureauLoanProductMapping) | **PUT** CreditBureauConfiguration/mappings | 


<a name="addOrganisationCreditBureau"></a>
# **addOrganisationCreditBureau**
> String addOrganisationCreditBureau(organisationCreditBureauId, body)



### Example
```java

CreditBureauConfigurationApi apiService = defaultClient.createService(CreditBureauConfigurationApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.addOrganisationCreditBureau(organisationCreditBureauId, body);
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

 **organisationCreditBureauId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCreditBureauLoanProductMapping"></a>
# **createCreditBureauLoanProductMapping**
> String createCreditBureauLoanProductMapping(creditBureauId, body)



### Example
```java

CreditBureauConfigurationApi apiService = defaultClient.createService(CreditBureauConfigurationApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.createCreditBureauLoanProductMapping(creditBureauId, body);
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

 **creditBureauId** | **Long**|  |
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="fetchLoanProducts"></a>
# **fetchLoanProducts**
> String fetchLoanProducts()



### Example
```java

CreditBureauConfigurationApi apiService = defaultClient.createService(CreditBureauConfigurationApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.fetchLoanProducts();
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

<a name="getConfiguration"></a>
# **getConfiguration**
> String getConfiguration(organisationCreditBureauId)



### Example
```java

CreditBureauConfigurationApi apiService = defaultClient.createService(CreditBureauConfigurationApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getConfiguration(organisationCreditBureauId);
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

 **organisationCreditBureauId** | **Long**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCreditBureau"></a>
# **getCreditBureau**
> String getCreditBureau()



### Example
```java

CreditBureauConfigurationApi apiService = defaultClient.createService(CreditBureauConfigurationApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getCreditBureau();
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

<a name="getCreditBureauLoanProductMapping"></a>
# **getCreditBureauLoanProductMapping**
> String getCreditBureauLoanProductMapping()



### Example
```java

CreditBureauConfigurationApi apiService = defaultClient.createService(CreditBureauConfigurationApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getCreditBureauLoanProductMapping();
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

<a name="getOrganisationCreditBureau"></a>
# **getOrganisationCreditBureau**
> String getOrganisationCreditBureau()



### Example
```java

CreditBureauConfigurationApi apiService = defaultClient.createService(CreditBureauConfigurationApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getOrganisationCreditBureau();
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

<a name="updateCreditBureau"></a>
# **updateCreditBureau**
> String updateCreditBureau(body)



### Example
```java

CreditBureauConfigurationApi apiService = defaultClient.createService(CreditBureauConfigurationApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.updateCreditBureau(body);
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

<a name="updateCreditBureauLoanProductMapping"></a>
# **updateCreditBureauLoanProductMapping**
> String updateCreditBureauLoanProductMapping(body)



### Example
```java

CreditBureauConfigurationApi apiService = defaultClient.createService(CreditBureauConfigurationApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.updateCreditBureauLoanProductMapping(body);
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

