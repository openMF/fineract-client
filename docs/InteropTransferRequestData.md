
# InteropTransferRequestData

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.String** |  |  |
| **amount** | [**MoneyData**](MoneyData.md) |  |  |
| **transactionCode** | **kotlin.String** |  |  |
| **transactionRole** | [**inline**](#TransactionRole) |  |  |
| **transferCode** | **kotlin.String** |  |  |
| **expiration** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **expirationLocalDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **extensionList** | [**kotlin.collections.List&lt;ExtensionData&gt;**](ExtensionData.md) |  |  [optional] |
| **fspCommission** | [**MoneyData**](MoneyData.md) |  |  [optional] |
| **fspFee** | [**MoneyData**](MoneyData.md) |  |  [optional] |
| **geoCode** | [**GeoCodeData**](GeoCodeData.md) |  |  [optional] |
| **note** | **kotlin.String** |  |  [optional] |
| **requestCode** | **kotlin.String** |  |  [optional] |
| **transactionType** | [**InteropTransactionTypeData**](InteropTransactionTypeData.md) |  |  [optional] |


<a id="TransactionRole"></a>
## Enum: transactionRole
| Name | Value |
| ---- | ----- |
| transactionRole | PAYER, PAYEE |



