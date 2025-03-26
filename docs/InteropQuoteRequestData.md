
# InteropQuoteRequestData

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accountId** | **kotlin.String** |  |  |
| **amount** | [**MoneyData**](MoneyData.md) |  |  |
| **amountType** | [**inline**](#AmountType) |  |  |
| **quoteCode** | **kotlin.String** |  |  |
| **transactionCode** | **kotlin.String** |  |  |
| **transactionRole** | [**inline**](#TransactionRole) |  |  |
| **expiration** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional] |
| **expirationLocalDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **extensionList** | [**kotlin.collections.List&lt;ExtensionData&gt;**](ExtensionData.md) |  |  [optional] |
| **fees** | [**MoneyData**](MoneyData.md) |  |  [optional] |
| **geoCode** | [**GeoCodeData**](GeoCodeData.md) |  |  [optional] |
| **note** | **kotlin.String** |  |  [optional] |
| **requestCode** | **kotlin.String** |  |  [optional] |
| **transactionType** | [**InteropTransactionTypeData**](InteropTransactionTypeData.md) |  |  [optional] |


<a id="AmountType"></a>
## Enum: amountType
| Name | Value |
| ---- | ----- |
| amountType | SEND, RECEIVE |


<a id="TransactionRole"></a>
## Enum: transactionRole
| Name | Value |
| ---- | ----- |
| transactionRole | PAYER, PAYEE |



