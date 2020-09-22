# TellerCashManagementApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**allocateCashToCashier**](TellerCashManagementApi.md#allocateCashToCashier) | **POST** tellers/{tellerId}/cashiers/{cashierId}/allocate | Allocate Cash To Cashier
[**createCashier**](TellerCashManagementApi.md#createCashier) | **POST** tellers/{tellerId}/cashiers | Create Cashiers
[**createTeller**](TellerCashManagementApi.md#createTeller) | **POST** tellers | Create teller
[**deleteCashier**](TellerCashManagementApi.md#deleteCashier) | **DELETE** tellers/{tellerId}/cashiers/{cashierId} | Delete Cashier
[**deleteTeller**](TellerCashManagementApi.md#deleteTeller) | **DELETE** tellers/{tellerId} | 
[**findCashierData**](TellerCashManagementApi.md#findCashierData) | **GET** tellers/{tellerId}/cashiers/{cashierId} | Retrieve a cashier
[**findTeller**](TellerCashManagementApi.md#findTeller) | **GET** tellers/{tellerId} | Retrieve tellers
[**findTransactionData**](TellerCashManagementApi.md#findTransactionData) | **GET** tellers/{tellerId}/transactions/{transactionId} | 
[**getCashierData**](TellerCashManagementApi.md#getCashierData) | **GET** tellers/{tellerId}/cashiers | List Cashiers
[**getCashierTemplate**](TellerCashManagementApi.md#getCashierTemplate) | **GET** tellers/{tellerId}/cashiers/template | Find Cashiers
[**getCashierTxnTemplate**](TellerCashManagementApi.md#getCashierTxnTemplate) | **GET** tellers/{tellerId}/cashiers/{cashierId}/transactions/template | Retrieve Cashier Transaction Template
[**getJournalData**](TellerCashManagementApi.md#getJournalData) | **GET** tellers/{tellerId}/journals | 
[**getTellerData**](TellerCashManagementApi.md#getTellerData) | **GET** tellers | List all tellers
[**getTransactionData**](TellerCashManagementApi.md#getTransactionData) | **GET** tellers/{tellerId}/transactions | 
[**getTransactionsForCashier**](TellerCashManagementApi.md#getTransactionsForCashier) | **GET** tellers/{tellerId}/cashiers/{cashierId}/transactions | Retrieve Cashier Transaction
[**getTransactionsWtihSummaryForCashier**](TellerCashManagementApi.md#getTransactionsWtihSummaryForCashier) | **GET** tellers/{tellerId}/cashiers/{cashierId}/summaryandtransactions | Transactions Wtih Summary For Cashier
[**settleCashFromCashier**](TellerCashManagementApi.md#settleCashFromCashier) | **POST** tellers/{tellerId}/cashiers/{cashierId}/settle | Settle Cash From Cashier
[**updateCashier**](TellerCashManagementApi.md#updateCashier) | **PUT** tellers/{tellerId}/cashiers/{cashierId} | Update Cashier
[**updateTeller**](TellerCashManagementApi.md#updateTeller) | **PUT** tellers/{tellerId} | Update teller


<a name="allocateCashToCashier"></a>
# **allocateCashToCashier**
> PostTellersTellerIdCashiersCashierIdAllocateResponse allocateCashToCashier(tellerId, cashierId, body)

Allocate Cash To Cashier

Mandatory Fields:  Date, Amount, Currency, Notes/Comments

### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<PostTellersTellerIdCashiersCashierIdAllocateResponse> call = apiService.allocateCashToCashier(tellerId, cashierId, body);
call.enqueue(new Callback<PostTellersTellerIdCashiersCashierIdAllocateResponse>() {
    @Override
    public void onResponse(Call<PostTellersTellerIdCashiersCashierIdAllocateResponse> call, Response<PostTellersTellerIdCashiersCashierIdAllocateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostTellersTellerIdCashiersCashierIdAllocateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **body** | [**PostTellersTellerIdCashiersCashierIdAllocateRequest**](PostTellersTellerIdCashiersCashierIdAllocateRequest.md)| body |

### Return type

[**PostTellersTellerIdCashiersCashierIdAllocateResponse**](PostTellersTellerIdCashiersCashierIdAllocateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="createCashier"></a>
# **createCashier**
> PostTellersTellerIdCashiersResponse createCashier(tellerId, body)

Create Cashiers

Mandatory Fields:  Cashier/staff, Fromm Date, To Date, Full Day or From time and To time    Optional Fields:  Description/Notes

### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<PostTellersTellerIdCashiersResponse> call = apiService.createCashier(tellerId, body);
call.enqueue(new Callback<PostTellersTellerIdCashiersResponse>() {
    @Override
    public void onResponse(Call<PostTellersTellerIdCashiersResponse> call, Response<PostTellersTellerIdCashiersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostTellersTellerIdCashiersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |
 **body** | [**PostTellersTellerIdCashiersRequest**](PostTellersTellerIdCashiersRequest.md)| body |

### Return type

[**PostTellersTellerIdCashiersResponse**](PostTellersTellerIdCashiersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createTeller"></a>
# **createTeller**
> PostTellersResponse createTeller(body)

Create teller

Mandatory Fields Teller name, OfficeId, Description, Start Date, Status Optional Fields End Date

### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<PostTellersResponse> call = apiService.createTeller(body);
call.enqueue(new Callback<PostTellersResponse>() {
    @Override
    public void onResponse(Call<PostTellersResponse> call, Response<PostTellersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostTellersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostTellersRequest**](PostTellersRequest.md)| body |

### Return type

[**PostTellersResponse**](PostTellersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCashier"></a>
# **deleteCashier**
> DeleteTellersTellerIdCashiersCashierIdResponse deleteCashier(tellerId, cashierId)

Delete Cashier



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<DeleteTellersTellerIdCashiersCashierIdResponse> call = apiService.deleteCashier(tellerId, cashierId);
call.enqueue(new Callback<DeleteTellersTellerIdCashiersCashierIdResponse>() {
    @Override
    public void onResponse(Call<DeleteTellersTellerIdCashiersCashierIdResponse> call, Response<DeleteTellersTellerIdCashiersCashierIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteTellersTellerIdCashiersCashierIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |

### Return type

[**DeleteTellersTellerIdCashiersCashierIdResponse**](DeleteTellersTellerIdCashiersCashierIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="deleteTeller"></a>
# **deleteTeller**
> String deleteTeller(tellerId)



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.deleteTeller(tellerId);
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

 **tellerId** | **Long**| tellerId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="findCashierData"></a>
# **findCashierData**
> GetTellersTellerIdCashiersCashierIdResponse findCashierData(tellerId, cashierId)

Retrieve a cashier



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<GetTellersTellerIdCashiersCashierIdResponse> call = apiService.findCashierData(tellerId, cashierId);
call.enqueue(new Callback<GetTellersTellerIdCashiersCashierIdResponse>() {
    @Override
    public void onResponse(Call<GetTellersTellerIdCashiersCashierIdResponse> call, Response<GetTellersTellerIdCashiersCashierIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetTellersTellerIdCashiersCashierIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |

### Return type

[**GetTellersTellerIdCashiersCashierIdResponse**](GetTellersTellerIdCashiersCashierIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="findTeller"></a>
# **findTeller**
> GetTellersResponse findTeller(tellerId)

Retrieve tellers



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<GetTellersResponse> call = apiService.findTeller(tellerId);
call.enqueue(new Callback<GetTellersResponse>() {
    @Override
    public void onResponse(Call<GetTellersResponse> call, Response<GetTellersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetTellersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |

### Return type

[**GetTellersResponse**](GetTellersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="findTransactionData"></a>
# **findTransactionData**
> String findTransactionData(tellerId, transactionId)



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.findTransactionData(tellerId, transactionId);
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

 **tellerId** | **Long**| tellerId |
 **transactionId** | **Long**| transactionId |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getCashierData"></a>
# **getCashierData**
> GetTellersTellerIdCashiersResponse getCashierData(tellerId, fromdate, todate)

List Cashiers



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<GetTellersTellerIdCashiersResponse> call = apiService.getCashierData(tellerId, fromdate, todate);
call.enqueue(new Callback<GetTellersTellerIdCashiersResponse>() {
    @Override
    public void onResponse(Call<GetTellersTellerIdCashiersResponse> call, Response<GetTellersTellerIdCashiersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetTellersTellerIdCashiersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |
 **fromdate** | **String**| fromdate | [optional]
 **todate** | **String**| todate | [optional]

### Return type

[**GetTellersTellerIdCashiersResponse**](GetTellersTellerIdCashiersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getCashierTemplate"></a>
# **getCashierTemplate**
> GetTellersTellerIdCashiersTemplateResponse getCashierTemplate(tellerId)

Find Cashiers



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<GetTellersTellerIdCashiersTemplateResponse> call = apiService.getCashierTemplate(tellerId);
call.enqueue(new Callback<GetTellersTellerIdCashiersTemplateResponse>() {
    @Override
    public void onResponse(Call<GetTellersTellerIdCashiersTemplateResponse> call, Response<GetTellersTellerIdCashiersTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetTellersTellerIdCashiersTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |

### Return type

[**GetTellersTellerIdCashiersTemplateResponse**](GetTellersTellerIdCashiersTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getCashierTxnTemplate"></a>
# **getCashierTxnTemplate**
> GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse getCashierTxnTemplate(tellerId, cashierId)

Retrieve Cashier Transaction Template



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse> call = apiService.getCashierTxnTemplate(tellerId, cashierId);
call.enqueue(new Callback<GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse>() {
    @Override
    public void onResponse(Call<GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse> call, Response<GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |

### Return type

[**GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse**](GetTellersTellerIdCashiersCashiersIdTransactionsTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getJournalData"></a>
# **getJournalData**
> String getJournalData(tellerId, cashierId, dateRange)



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getJournalData(tellerId, cashierId, dateRange);
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

 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId | [optional]
 **dateRange** | **String**| dateRange | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getTellerData"></a>
# **getTellerData**
> List&lt;GetTellersResponse&gt; getTellerData(officeId)

List all tellers

Retrieves list tellers

### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetTellersResponse&gt;> call = apiService.getTellerData(officeId);
call.enqueue(new Callback<List&lt;GetTellersResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetTellersResponse&gt;> call, Response<List&lt;GetTellersResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetTellersResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **officeId** | **Long**| officeId | [optional]

### Return type

[**List&lt;GetTellersResponse&gt;**](GetTellersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getTransactionData"></a>
# **getTransactionData**
> String getTransactionData(tellerId, dateRange)



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<String> call = apiService.getTransactionData(tellerId, dateRange);
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

 **tellerId** | **Long**| tellerId |
 **dateRange** | **String**| dateRange | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="getTransactionsForCashier"></a>
# **getTransactionsForCashier**
> List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt; getTransactionsForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder)

Retrieve Cashier Transaction



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt;> call = apiService.getTransactionsForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt;> call, Response<List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **currencyCode** | **String**| currencyCode | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**List&lt;GetTellersTellerIdCashiersCashiersIdTransactionsResponse&gt;**](GetTellersTellerIdCashiersCashiersIdTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransactionsWtihSummaryForCashier"></a>
# **getTransactionsWtihSummaryForCashier**
> GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse getTransactionsWtihSummaryForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder)

Transactions Wtih Summary For Cashier



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse> call = apiService.getTransactionsWtihSummaryForCashier(tellerId, cashierId, currencyCode, offset, limit, orderBy, sortOrder);
call.enqueue(new Callback<GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse>() {
    @Override
    public void onResponse(Call<GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse> call, Response<GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **currencyCode** | **String**| currencyCode | [optional]
 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]
 **orderBy** | **String**| orderBy | [optional]
 **sortOrder** | **String**| sortOrder | [optional]

### Return type

[**GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse**](GetTellersTellerIdCashiersCashiersIdSummaryAndTransactionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="settleCashFromCashier"></a>
# **settleCashFromCashier**
> PostTellersTellerIdCashiersCashierIdSettleResponse settleCashFromCashier(tellerId, cashierId, body)

Settle Cash From Cashier

Mandatory Fields Date, Amount, Currency, Notes/Comments

### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<PostTellersTellerIdCashiersCashierIdSettleResponse> call = apiService.settleCashFromCashier(tellerId, cashierId, body);
call.enqueue(new Callback<PostTellersTellerIdCashiersCashierIdSettleResponse>() {
    @Override
    public void onResponse(Call<PostTellersTellerIdCashiersCashierIdSettleResponse> call, Response<PostTellersTellerIdCashiersCashierIdSettleResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostTellersTellerIdCashiersCashierIdSettleResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **body** | [**PostTellersTellerIdCashiersCashierIdSettleRequest**](PostTellersTellerIdCashiersCashierIdSettleRequest.md)| body |

### Return type

[**PostTellersTellerIdCashiersCashierIdSettleResponse**](PostTellersTellerIdCashiersCashierIdSettleResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: text/htmlapplication/json, 
 - **Accept**: application/json

<a name="updateCashier"></a>
# **updateCashier**
> PutTellersTellerIdCashiersCashierIdResponse updateCashier(tellerId, cashierId, body)

Update Cashier



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<PutTellersTellerIdCashiersCashierIdResponse> call = apiService.updateCashier(tellerId, cashierId, body);
call.enqueue(new Callback<PutTellersTellerIdCashiersCashierIdResponse>() {
    @Override
    public void onResponse(Call<PutTellersTellerIdCashiersCashierIdResponse> call, Response<PutTellersTellerIdCashiersCashierIdResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutTellersTellerIdCashiersCashierIdResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |
 **cashierId** | **Long**| cashierId |
 **body** | [**PutTellersTellerIdCashiersCashierIdRequest**](PutTellersTellerIdCashiersCashierIdRequest.md)| body |

### Return type

[**PutTellersTellerIdCashiersCashierIdResponse**](PutTellersTellerIdCashiersCashierIdResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTeller"></a>
# **updateTeller**
> PutTellersResponse updateTeller(tellerId, body)

Update teller



### Example
```java

TellerCashManagementApi apiService = defaultClient.createService(TellerCashManagementApi.class);

// Initialize these parameters earlier.
Call<PutTellersResponse> call = apiService.updateTeller(tellerId, body);
call.enqueue(new Callback<PutTellersResponse>() {
    @Override
    public void onResponse(Call<PutTellersResponse> call, Response<PutTellersResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutTellersResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **tellerId** | **Long**| tellerId |
 **body** | [**PutTellersRequest**](PutTellersRequest.md)| body |

### Return type

[**PutTellersResponse**](PutTellersResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

