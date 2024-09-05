
# LoanProductPaymentAllocationRule

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **createdBy** | **kotlin.Long** |  |  |
| **createdDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **createdDateTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **lastModifiedBy** | **kotlin.Long** |  |  |
| **lastModifiedDate** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **lastModifiedDateTime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  |
| **allocationTypes** | [**inline**](#kotlin.collections.List&lt;AllocationTypes&gt;) |  |  [optional] |
| **futureInstallmentAllocationRule** | [**inline**](#FutureInstallmentAllocationRule) |  |  [optional] |
| **id** | **kotlin.Long** |  |  [optional] |
| **loanProduct** | [**LoanProduct**](LoanProduct.md) |  |  [optional] |
| **new** | **kotlin.Boolean** |  |  [optional] |
| **transactionType** | [**inline**](#TransactionType) |  |  [optional] |


<a id="kotlin.collections.List<AllocationTypes>"></a>
## Enum: allocationTypes
| Name | Value |
| ---- | ----- |
| allocationTypes | PAST_DUE_PENALTY, PAST_DUE_FEE, PAST_DUE_PRINCIPAL, PAST_DUE_INTEREST, DUE_PENALTY, DUE_FEE, DUE_PRINCIPAL, DUE_INTEREST, IN_ADVANCE_PENALTY, IN_ADVANCE_FEE, IN_ADVANCE_PRINCIPAL, IN_ADVANCE_INTEREST |


<a id="FutureInstallmentAllocationRule"></a>
## Enum: futureInstallmentAllocationRule
| Name | Value |
| ---- | ----- |
| futureInstallmentAllocationRule | NEXT_INSTALLMENT, LAST_INSTALLMENT, REAMORTIZATION |


<a id="TransactionType"></a>
## Enum: transactionType
| Name | Value |
| ---- | ----- |
| transactionType | DEFAULT, REPAYMENT, DOWN_PAYMENT, MERCHANT_ISSUED_REFUND, PAYOUT_REFUND, GOODWILL_CREDIT, CHARGE_REFUND, CHARGE_ADJUSTMENT, WAIVE_INTEREST, CHARGE_PAYMENT, REFUND_FOR_ACTIVE_LOAN |



