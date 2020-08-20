# WorkingDaysApi

All URIs are relative to *https://https://demo.openmf.org/fineract-provider/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**retrieveAll**](WorkingDaysApi.md#retrieveAll) | **GET** workingdays | List Working days
[**template**](WorkingDaysApi.md#template) | **GET** workingdays/template | Working Days Template
[**update**](WorkingDaysApi.md#update) | **PUT** workingdays | Update a Working Day


<a name="retrieveAll"></a>
# **retrieveAll**
> List&lt;GetWorkingDaysResponse&gt; retrieveAll()

List Working days

Example Requests:  workingdays

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.WorkingDaysApi;


WorkingDaysApi apiInstance = new WorkingDaysApi();
try {
    List<GetWorkingDaysResponse> result = apiInstance.retrieveAll();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkingDaysApi#retrieveAll");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;GetWorkingDaysResponse&gt;**](GetWorkingDaysResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="template"></a>
# **template**
> GetWorkingDaysTemplateResponse template()

Working Days Template

This is a convenience resource. It can be useful when building maintenance user interface screens for working days.  Example Request:  workingdays/template

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.WorkingDaysApi;


WorkingDaysApi apiInstance = new WorkingDaysApi();
try {
    GetWorkingDaysTemplateResponse result = apiInstance.template();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkingDaysApi#template");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetWorkingDaysTemplateResponse**](GetWorkingDaysTemplateResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="update"></a>
# **update**
> PutWorkingDaysResponse update(body)

Update a Working Day

Mandatory Fields recurrence,repaymentRescheduleType,extendTermForDailyRepayments,locale

### Example
```java
// Import classes:
//import org.mifos.fineract.ApiException;
//import org.mifos.fineract.services.WorkingDaysApi;


WorkingDaysApi apiInstance = new WorkingDaysApi();
PutWorkingDaysRequest body = new PutWorkingDaysRequest(); // PutWorkingDaysRequest | body
try {
    PutWorkingDaysResponse result = apiInstance.update(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WorkingDaysApi#update");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PutWorkingDaysRequest**](PutWorkingDaysRequest.md)| body |

### Return type

[**PutWorkingDaysResponse**](PutWorkingDaysResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

