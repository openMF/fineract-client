
# GetLoansLoanIdResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accountNo** | **kotlin.String** |  |  [optional] |
| **amortizationType** | [**GetLoansLoanIdAmortizationType**](GetLoansLoanIdAmortizationType.md) |  |  [optional] |
| **annualInterestRate** | **kotlin.Int** |  |  [optional] |
| **approvedPrincipal** | **kotlin.Double** |  |  [optional] |
| **chargedOff** | **kotlin.Boolean** |  |  [optional] |
| **charges** | [**kotlin.collections.List&lt;GetLoansLoanIdLoanChargeData&gt;**](GetLoansLoanIdLoanChargeData.md) | Set of charges |  [optional] |
| **clientExternalId** | **kotlin.String** |  |  [optional] |
| **clientId** | **kotlin.Long** |  |  [optional] |
| **clientName** | **kotlin.String** |  |  [optional] |
| **clientOfficeId** | **kotlin.Long** |  |  [optional] |
| **currency** | [**GetLoansLoanIdCurrency**](GetLoansLoanIdCurrency.md) |  |  [optional] |
| **delinquencyRange** | [**GetDelinquencyRangesResponse**](GetDelinquencyRangesResponse.md) |  |  [optional] |
| **delinquent** | [**GetLoansLoanIdDelinquencySummary**](GetLoansLoanIdDelinquencySummary.md) |  |  [optional] |
| **disableScheduleExtensionForDownPayment** | **kotlin.Boolean** |  |  [optional] |
| **disallowExpectedDisbursements** | **kotlin.Boolean** |  |  [optional] |
| **disbursedAmountPercentageForDownPayment** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **disbursementDetails** | [**kotlin.collections.Set&lt;GetLoansLoanIdDisbursementDetails&gt;**](GetLoansLoanIdDisbursementDetails.md) | Set of GetLoansLoanIdDisbursementDetails |  [optional] |
| **enableAutoRepaymentForDownPayment** | **kotlin.Boolean** |  |  [optional] |
| **enableDownPayment** | **kotlin.Boolean** |  |  [optional] |
| **enableInstallmentLevelDelinquency** | **kotlin.Boolean** |  |  [optional] |
| **externalId** | **kotlin.String** |  |  [optional] |
| **fixedPrincipalPercentagePerInstallment** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **fraud** | **kotlin.Boolean** |  |  [optional] |
| **id** | **kotlin.Long** |  |  [optional] |
| **inArrearsTolerance** | **kotlin.Int** |  |  [optional] |
| **interestCalculationPeriodType** | [**GetLoansLoanIdInterestCalculationPeriodType**](GetLoansLoanIdInterestCalculationPeriodType.md) |  |  [optional] |
| **interestRateFrequencyType** | [**GetLoansLoanIdInterestRateFrequencyType**](GetLoansLoanIdInterestRateFrequencyType.md) |  |  [optional] |
| **interestRatePerPeriod** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **interestType** | [**GetLoansLoanIdInterestType**](GetLoansLoanIdInterestType.md) |  |  [optional] |
| **isFloatingInterestRate** | **kotlin.Boolean** |  |  [optional] |
| **lastClosedBusinessDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **loanOfficerId** | **kotlin.Long** |  |  [optional] |
| **loanOfficerName** | **kotlin.String** |  |  [optional] |
| **loanProductDescription** | **kotlin.String** |  |  [optional] |
| **loanProductId** | **kotlin.Long** |  |  [optional] |
| **loanProductName** | **kotlin.String** |  |  [optional] |
| **loanPurposeId** | **kotlin.Long** |  |  [optional] |
| **loanPurposeName** | **kotlin.String** |  |  [optional] |
| **loanScheduleProcessingType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **loanScheduleType** | [**EnumOptionData**](EnumOptionData.md) |  |  [optional] |
| **loanType** | [**GetLoansLoanIdLoanType**](GetLoansLoanIdLoanType.md) |  |  [optional] |
| **netDisbursalAmount** | **kotlin.Double** |  |  [optional] |
| **numberOfRepayments** | **kotlin.Int** |  |  [optional] |
| **overpaidOnDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **principal** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **proposedPrincipal** | **kotlin.Double** |  |  [optional] |
| **repaymentEvery** | **kotlin.Int** |  |  [optional] |
| **repaymentFrequencyType** | [**GetLoansLoanIdRepaymentFrequencyType**](GetLoansLoanIdRepaymentFrequencyType.md) |  |  [optional] |
| **repaymentSchedule** | [**GetLoansLoanIdRepaymentSchedule**](GetLoansLoanIdRepaymentSchedule.md) |  |  [optional] |
| **status** | [**GetLoansLoanIdStatus**](GetLoansLoanIdStatus.md) |  |  [optional] |
| **summary** | [**GetLoansLoanIdSummary**](GetLoansLoanIdSummary.md) |  |  [optional] |
| **termFrequency** | **kotlin.Int** |  |  [optional] |
| **termPeriodFrequencyType** | [**GetLoansLoanIdTermPeriodFrequencyType**](GetLoansLoanIdTermPeriodFrequencyType.md) |  |  [optional] |
| **timeline** | [**GetLoansLoanIdTimeline**](GetLoansLoanIdTimeline.md) |  |  [optional] |
| **totalOverpaid** | **kotlin.Double** |  |  [optional] |
| **transactionProcessingStrategyCode** | **kotlin.String** |  |  [optional] |
| **transactions** | [**kotlin.collections.List&lt;GetLoansLoanIdTransactions&gt;**](GetLoansLoanIdTransactions.md) | Set of GetLoansLoanIdTransactions |  [optional] |



