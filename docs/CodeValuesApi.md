# CodeValuesApi

All URIs are relative to *https://demo.mifos.io/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCodeValue**](CodeValuesApi.md#createCodeValue) | **POST** codes/{codeId}/codevalues | Create a Code Value
[**deleteCodeValue**](CodeValuesApi.md#deleteCodeValue) | **DELETE** codes/{codeId}/codevalues/{codeValueId} | Delete a Code Value
[**retrieveAllCodeValues**](CodeValuesApi.md#retrieveAllCodeValues) | **GET** codes/{codeId}/codevalues | List Code Values
[**retrieveCodeValue**](CodeValuesApi.md#retrieveCodeValue) | **GET** codes/{codeId}/codevalues/{codeValueId} | Retrieve a Code Value
[**updateCodeValue**](CodeValuesApi.md#updateCodeValue) | **PUT** codes/{codeId}/codevalues/{codeValueId} | Update a Code Value


<a name="createCodeValue"></a>
# **createCodeValue**
> PostCodeValueDataResponse createCodeValue(codeId, body)

Create a Code Value



### Example
```java

CodeValuesApi apiService = defaultClient.createService(CodeValuesApi.class);

// Initialize these parameters earlier.
Call<PostCodeValueDataResponse> call = apiService.createCodeValue(codeId, body);
call.enqueue(new Callback<PostCodeValueDataResponse>() {
    @Override
    public void onResponse(Call<PostCodeValueDataResponse> call, Response<PostCodeValueDataResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PostCodeValueDataResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **codeId** | **Long**| codeId |
 **body** | [**PostCodeValuesDataRequest**](PostCodeValuesDataRequest.md)| body |

### Return type

[**PostCodeValueDataResponse**](PostCodeValueDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCodeValue"></a>
# **deleteCodeValue**
> DeleteCodeValueDataResponse deleteCodeValue(codeId, codeValueId)

Delete a Code Value

Deletes a code value

### Example
```java

CodeValuesApi apiService = defaultClient.createService(CodeValuesApi.class);

// Initialize these parameters earlier.
Call<DeleteCodeValueDataResponse> call = apiService.deleteCodeValue(codeId, codeValueId);
call.enqueue(new Callback<DeleteCodeValueDataResponse>() {
    @Override
    public void onResponse(Call<DeleteCodeValueDataResponse> call, Response<DeleteCodeValueDataResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<DeleteCodeValueDataResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **codeId** | **Long**| codeId |
 **codeValueId** | **Long**| codeValueId |

### Return type

[**DeleteCodeValueDataResponse**](DeleteCodeValueDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveAllCodeValues"></a>
# **retrieveAllCodeValues**
> List&lt;GetCodeValuesDataResponse&gt; retrieveAllCodeValues(codeId)

List Code Values

Returns the list of Code Values for a given Code  Example Requests:  codes/1/codevalues

### Example
```java

CodeValuesApi apiService = defaultClient.createService(CodeValuesApi.class);

// Initialize these parameters earlier.
Call<List&lt;GetCodeValuesDataResponse&gt;> call = apiService.retrieveAllCodeValues(codeId);
call.enqueue(new Callback<List&lt;GetCodeValuesDataResponse&gt;>() {
    @Override
    public void onResponse(Call<List&lt;GetCodeValuesDataResponse&gt;> call, Response<List&lt;GetCodeValuesDataResponse&gt;> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<List&lt;GetCodeValuesDataResponse&gt;> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **codeId** | **Long**| codeId |

### Return type

[**List&lt;GetCodeValuesDataResponse&gt;**](GetCodeValuesDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retrieveCodeValue"></a>
# **retrieveCodeValue**
> GetCodeValuesDataResponse retrieveCodeValue(codeValueId)

Retrieve a Code Value

Returns the details of a Code Value  Example Requests:  codes/1/codevalues/1

### Example
```java

CodeValuesApi apiService = defaultClient.createService(CodeValuesApi.class);

// Initialize these parameters earlier.
Call<GetCodeValuesDataResponse> call = apiService.retrieveCodeValue(codeValueId);
call.enqueue(new Callback<GetCodeValuesDataResponse>() {
    @Override
    public void onResponse(Call<GetCodeValuesDataResponse> call, Response<GetCodeValuesDataResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<GetCodeValuesDataResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **codeValueId** | **Long**| codeValueId |

### Return type

[**GetCodeValuesDataResponse**](GetCodeValuesDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCodeValue"></a>
# **updateCodeValue**
> PutCodeValueDataResponse updateCodeValue(codeId, codeValueId, body)

Update a Code Value

Updates the details of a code value.

### Example
```java

CodeValuesApi apiService = defaultClient.createService(CodeValuesApi.class);

// Initialize these parameters earlier.
Call<PutCodeValueDataResponse> call = apiService.updateCodeValue(codeId, codeValueId, body);
call.enqueue(new Callback<PutCodeValueDataResponse>() {
    @Override
    public void onResponse(Call<PutCodeValueDataResponse> call, Response<PutCodeValueDataResponse> response) {
        System.out.println(call.toString() + "\n" + response.toString());
    }

    @Override
    public void onFailure(Call<PutCodeValueDataResponse> call, Throwable t) {
        System.out.println(t.getMessage());
    }
});

```

### Parameters

 **codeId** | **Long**| codeId |
 **codeValueId** | **Long**| codeValueId |
 **body** | [**PutCodeValuesDataRequest**](PutCodeValuesDataRequest.md)| body |

### Return type

[**PutCodeValueDataResponse**](PutCodeValueDataResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

