# OfficetransactionsApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.OfficeTransactionsApi;


OfficetransactionsApi apiInstance = new OfficetransactionsApi();
Long transactionId = 789L; // Long | 
try {
    String result = apiInstance.delete(transactionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfficetransactionsApi#delete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.OfficeTransactionsApi;


OfficetransactionsApi apiInstance = new OfficetransactionsApi();
try {
    String result = apiInstance.newOfficeTransactionDetails();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfficetransactionsApi#newOfficeTransactionDetails");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.OfficeTransactionsApi;


OfficetransactionsApi apiInstance = new OfficetransactionsApi();
try {
    String result = apiInstance.retrieveOfficeTransactions();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfficetransactionsApi#retrieveOfficeTransactions");
    e.printStackTrace();
}
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
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.OfficeTransactionsApi;


OfficetransactionsApi apiInstance = new OfficetransactionsApi();
String body = "body_example"; // String | 
try {
    String result = apiInstance.transferMoneyFrom(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OfficetransactionsApi#transferMoneyFrom");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | **String**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

