
# InteropTransactionRequestResponseData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**officeId** | **Long** |  |  [optional]
**groupId** | **Long** |  |  [optional]
**clientId** | **Long** |  |  [optional]
**loanId** | **Long** |  |  [optional]
**savingsId** | **Long** |  |  [optional]
**subResourceId** | **Long** |  |  [optional]
**transactionId** | **String** |  |  [optional]
**changes** | **Map&lt;String, Object&gt;** |  |  [optional]
**productId** | **Long** |  |  [optional]
**rollbackTransaction** | **Boolean** |  |  [optional]
**transactionCode** | **String** |  | 
**state** | [**StateEnum**](#StateEnum) |  | 
**expiration** | **String** |  |  [optional]
**extensionList** | [**List&lt;ExtensionData&gt;**](ExtensionData.md) |  |  [optional]
**requestCode** | **String** |  | 


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACCEPTED | &quot;ACCEPTED&quot;
REJECTED | &quot;REJECTED&quot;



