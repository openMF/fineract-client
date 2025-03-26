
# InteropTransferResponseData

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **state** | [**inline**](#State) |  |  |
| **transactionCode** | **kotlin.String** |  |  |
| **transferCode** | **kotlin.String** |  |  |
| **changes** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **clientId** | **kotlin.Long** |  |  [optional] |
| **commandId** | **kotlin.Long** |  |  [optional] |
| **completedTimestamp** | **kotlin.String** |  |  [optional] |
| **creditBureauReportData** | [**kotlin.collections.Map&lt;kotlin.String, kotlin.Any&gt;**](kotlin.Any.md) |  |  [optional] |
| **expiration** | **kotlin.String** |  |  [optional] |
| **extensionList** | [**kotlin.collections.List&lt;ExtensionData&gt;**](ExtensionData.md) |  |  [optional] |
| **glimId** | **kotlin.Long** |  |  [optional] |
| **groupId** | **kotlin.Long** |  |  [optional] |
| **gsimId** | **kotlin.Long** |  |  [optional] |
| **loanId** | **kotlin.Long** |  |  [optional] |
| **officeId** | **kotlin.Long** |  |  [optional] |
| **productId** | **kotlin.Long** |  |  [optional] |
| **resourceExternalId** | [**ExternalId**](ExternalId.md) |  |  [optional] |
| **resourceId** | **kotlin.Long** |  |  [optional] |
| **resourceIdentifier** | **kotlin.String** |  |  [optional] |
| **rollbackTransaction** | **kotlin.Boolean** |  |  [optional] |
| **savingsId** | **kotlin.Long** |  |  [optional] |
| **subResourceExternalId** | [**ExternalId**](ExternalId.md) |  |  [optional] |
| **subResourceId** | **kotlin.Long** |  |  [optional] |
| **transactionId** | **kotlin.String** |  |  [optional] |


<a id="State"></a>
## Enum: state
| Name | Value |
| ---- | ----- |
| state | ACCEPTED, REJECTED |



