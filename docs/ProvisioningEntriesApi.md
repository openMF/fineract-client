# ProvisioningEntriesApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProvisioningEntries**](ProvisioningEntriesApi.md#createProvisioningEntries) | **POST** provisioningentries | Create new Provisioning Entries
[**modifyProvisioningEntry**](ProvisioningEntriesApi.md#modifyProvisioningEntry) | **POST** provisioningentries/{entryId} | Recreates Provisioning Entry
[**retrieveAllProvisioningEntries**](ProvisioningEntriesApi.md#retrieveAllProvisioningEntries) | **GET** provisioningentries | List all Provisioning Entries
[**retrieveProviioningEntries**](ProvisioningEntriesApi.md#retrieveProviioningEntries) | **GET** provisioningentries/entries | 
[**retrieveProvisioningEntry**](ProvisioningEntriesApi.md#retrieveProvisioningEntry) | **GET** provisioningentries/{entryId} | Retrieves a Provisioning Entry


<a name="createProvisioningEntries"></a>
# **createProvisioningEntries**
> PostProvisioningEntriesResponse createProvisioningEntries(body)

Create new Provisioning Entries

Creates a new Provisioning Entries  Mandatory Fields date dateFormat locale Optional Fields createjournalentries

### Example
```java

ProvisioningEntriesApi apiService = defaultClient.createService(ProvisioningEntriesApi.class);

// Initialize these parameters earlier.
Call<PostProvisioningEntriesResponse> call = apiService.createProvisioningEntries(body);
call.enqueue(new Callback<PostProvisioningEntriesResponse>() {
    @Override
    public void onResponse(Call<PostProvisioningEntriesResponse> call, Response<PostProvisioningEntriesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostProvisioningEntriesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **body** | [**PostProvisioningEntriesRequest**](PostProvisioningEntriesRequest.md)| body | [optional]

### Return type

[**PostProvisioningEntriesResponse**](PostProvisioningEntriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modifyProvisioningEntry"></a>
# **modifyProvisioningEntry**
> PutProvisioningEntriesResponse modifyProvisioningEntry(entryId, command, body)

Recreates Provisioning Entry

Recreates Provisioning Entry | createjournalentry.

### Example
```java

ProvisioningEntriesApi apiService = defaultClient.createService(ProvisioningEntriesApi.class);

// Initialize these parameters earlier.
Call<PutProvisioningEntriesResponse> call = apiService.modifyProvisioningEntry(entryId, command, body);
call.enqueue(new Callback<PutProvisioningEntriesResponse>() {
    @Override
    public void onResponse(Call<PutProvisioningEntriesResponse> call, Response<PutProvisioningEntriesResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutProvisioningEntriesResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **entryId** | **Long**| entryId |
 **command** | **String**| command&#x3D;createjournalentry command&#x3D;recreateprovisioningentry | [optional]
 **body** | [**PutProvisioningEntriesRequest**](PutProvisioningEntriesRequest.md)| body | [optional]

### Return type

[**PutProvisioningEntriesResponse**](PutProvisioningEntriesResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllProvisioningEntries"></a>
# **retrieveAllProvisioningEntries**
> List&lt;ProvisioningEntryData&gt; retrieveAllProvisioningEntries(offset, limit)

List all Provisioning Entries



### Example
```java

ProvisioningEntriesApi apiService = defaultClient.createService(ProvisioningEntriesApi.class);

// Initialize these parameters earlier.
Call<List&lt;ProvisioningEntryData&gt;> call = apiService.retrieveAllProvisioningEntries(offset, limit);
call.enqueue(new Callback<List&lt;ProvisioningEntryData&gt;>() {
    @Override
    public void onResponse(Call<List&lt;ProvisioningEntryData&gt;> call, Response<List&lt;ProvisioningEntryData&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;ProvisioningEntryData&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **offset** | **Integer**| offset | [optional]
 **limit** | **Integer**| limit | [optional]

### Return type

[**List&lt;ProvisioningEntryData&gt;**](ProvisioningEntryData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveProviioningEntries"></a>
# **retrieveProviioningEntries**
> LoanProductProvisioningEntryData retrieveProviioningEntries(entryId, offset, limit, officeId, productId, categoryId)



### Example
```java

ProvisioningEntriesApi apiService = defaultClient.createService(ProvisioningEntriesApi.class);

// Initialize these parameters earlier.
Call<LoanProductProvisioningEntryData> call = apiService.retrieveProviioningEntries(entryId, offset, limit, officeId, productId, categoryId);
call.enqueue(new Callback<LoanProductProvisioningEntryData>() {
    @Override
    public void onResponse(Call<LoanProductProvisioningEntryData> call, Response<LoanProductProvisioningEntryData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<LoanProductProvisioningEntryData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **entryId** | **Long**|  | [optional]
 **offset** | **Integer**|  | [optional]
 **limit** | **Integer**|  | [optional]
 **officeId** | **Long**|  | [optional]
 **productId** | **Long**|  | [optional]
 **categoryId** | **Long**|  | [optional]

### Return type

[**LoanProductProvisioningEntryData**](LoanProductProvisioningEntryData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveProvisioningEntry"></a>
# **retrieveProvisioningEntry**
> ProvisioningEntryData retrieveProvisioningEntry(entryId)

Retrieves a Provisioning Entry

Returns the details of a generated Provisioning Entry.

### Example
```java

ProvisioningEntriesApi apiService = defaultClient.createService(ProvisioningEntriesApi.class);

// Initialize these parameters earlier.
Call<ProvisioningEntryData> call = apiService.retrieveProvisioningEntry(entryId);
call.enqueue(new Callback<ProvisioningEntryData>() {
    @Override
    public void onResponse(Call<ProvisioningEntryData> call, Response<ProvisioningEntryData> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<ProvisioningEntryData> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **entryId** | **Long**| entryId |

### Return type

[**ProvisioningEntryData**](ProvisioningEntryData.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

