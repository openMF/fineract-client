

# InteropQuoteResponseData

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
**gsimId** | **Long** |  |  [optional]
**glimId** | **Long** |  |  [optional]
**rollbackTransaction** | **Boolean** |  |  [optional]
**transactionCode** | **String** |  | 
**state** | [**StateEnum**](#StateEnum) |  | 
**expiration** | **String** |  |  [optional]
**extensionList** | [**List&lt;ExtensionData&gt;**](ExtensionData.md) |  |  [optional]
**quoteCode** | **String** |  | 
**fspFee** | [**MoneyData**](MoneyData.md) |  |  [optional]
**fspCommission** | [**MoneyData**](MoneyData.md) |  |  [optional]
**creditReport** | [**Object**](.md) |  |  [optional]



## Enum: StateEnum

Name | Value
---- | -----
ACCEPTED | &quot;ACCEPTED&quot;
REJECTED | &quot;REJECTED&quot;



