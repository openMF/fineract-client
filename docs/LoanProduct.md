
# LoanProduct

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **accountingDisabled** | **kotlin.Boolean** |  |  [optional] |
| **accountingType** | **kotlin.Int** |  |  [optional] |
| **accrualBasedAccountingEnabled** | **kotlin.Boolean** |  |  [optional] |
| **allowApprovedDisbursedAmountsOverApplied** | **kotlin.Boolean** |  |  [optional] |
| **arrearsBasedOnOriginalSchedule** | **kotlin.Boolean** |  |  [optional] |
| **cashBasedAccountingEnabled** | **kotlin.Boolean** |  |  [optional] |
| **closeDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **currency** | [**MonetaryCurrency**](MonetaryCurrency.md) |  |  [optional] |
| **delinquencyBucket** | [**DelinquencyBucket**](DelinquencyBucket.md) |  |  [optional] |
| **disallowExpectedDisbursements** | **kotlin.Boolean** |  |  [optional] |
| **dueDaysForRepaymentEvent** | **kotlin.Int** |  |  [optional] |
| **enableInstallmentLevelDelinquency** | **kotlin.Boolean** |  |  [optional] |
| **equalAmortization** | **kotlin.Boolean** |  |  [optional] |
| **externalId** | [**ExternalId**](ExternalId.md) |  |  [optional] |
| **fixedPrincipalPercentagePerInstallment** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **floatingRates** | [**LoanProductFloatingRates**](LoanProductFloatingRates.md) |  |  [optional] |
| **holdGuaranteeFundsEnabled** | **kotlin.Boolean** |  |  [optional] |
| **id** | **kotlin.Long** |  |  [optional] |
| **includeInBorrowerCycle** | **kotlin.Boolean** |  |  [optional] |
| **installmentAmountInMultiplesOf** | **kotlin.Int** |  |  [optional] |
| **interestPeriodFrequencyType** | [**inline**](#InterestPeriodFrequencyType) |  |  [optional] |
| **interestRecalculationEnabled** | **kotlin.Boolean** |  |  [optional] |
| **linkedToFloatingInterestRate** | **kotlin.Boolean** |  |  [optional] |
| **loanProductCharges** | [**kotlin.collections.List&lt;Charge&gt;**](Charge.md) |  |  [optional] |
| **loanProductConfigurableAttributes** | [**LoanProductConfigurableAttributes**](LoanProductConfigurableAttributes.md) |  |  [optional] |
| **loanProductGuaranteeDetails** | [**LoanProductGuaranteeDetails**](LoanProductGuaranteeDetails.md) |  |  [optional] |
| **loanProductRelatedDetail** | [**LoanProductRelatedDetail**](LoanProductRelatedDetail.md) |  |  [optional] |
| **loanProductTrancheDetails** | [**LoanProductTrancheDetails**](LoanProductTrancheDetails.md) |  |  [optional] |
| **maxNominalInterestRatePerPeriod** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **maxNumberOfRepayments** | **kotlin.Int** |  |  [optional] |
| **maxPrincipalAmount** | [**Money**](Money.md) |  |  [optional] |
| **minNominalInterestRatePerPeriod** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **minNumberOfRepayments** | **kotlin.Int** |  |  [optional] |
| **minPrincipalAmount** | [**Money**](Money.md) |  |  [optional] |
| **minimumDaysBetweenDisbursalAndFirstRepayment** | **kotlin.Int** |  |  [optional] |
| **multiDisburseLoan** | **kotlin.Boolean** |  |  [optional] |
| **new** | **kotlin.Boolean** |  |  [optional] |
| **nominalInterestRatePerPeriod** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **numberOfRepayments** | **kotlin.Int** |  |  [optional] |
| **overAppliedCalculationType** | **kotlin.String** |  |  [optional] |
| **overAppliedNumber** | **kotlin.Int** |  |  [optional] |
| **overDueDaysForRepaymentEvent** | **kotlin.Int** |  |  [optional] |
| **paymentAllocationRules** | [**kotlin.collections.List&lt;LoanProductPaymentAllocationRule&gt;**](LoanProductPaymentAllocationRule.md) |  |  [optional] |
| **periodicAccrualAccountingEnabled** | **kotlin.Boolean** |  |  [optional] |
| **principalAmount** | [**Money**](Money.md) |  |  [optional] |
| **principalThresholdForLastInstallment** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **productInterestRecalculationDetails** | [**LoanProductInterestRecalculationDetails**](LoanProductInterestRecalculationDetails.md) |  |  [optional] |
| **rates** | [**kotlin.collections.List&lt;Rate&gt;**](Rate.md) |  |  [optional] |
| **repaymentStartDateType** | [**inline**](#RepaymentStartDateType) |  |  [optional] |
| **repaymentStrategy** | **kotlin.String** |  |  [optional] |
| **shortName** | **kotlin.String** |  |  [optional] |
| **startDate** | [**java.time.LocalDate**](java.time.LocalDate.md) |  |  [optional] |
| **syncExpectedWithDisbursementDate** | **kotlin.Boolean** |  |  [optional] |
| **transactionProcessingStrategyCode** | **kotlin.String** |  |  [optional] |
| **transactionProcessingStrategyName** | **kotlin.String** |  |  [optional] |
| **upfrontAccrualAccountingEnabled** | **kotlin.Boolean** |  |  [optional] |


<a id="InterestPeriodFrequencyType"></a>
## Enum: interestPeriodFrequencyType
| Name | Value |
| ---- | ----- |
| interestPeriodFrequencyType | DAYS, WEEKS, MONTHS, YEARS, WHOLE_TERM, INVALID |


<a id="RepaymentStartDateType"></a>
## Enum: repaymentStartDateType
| Name | Value |
| ---- | ----- |
| repaymentStartDateType | INVALID, DISBURSEMENT_DATE, SUBMITTED_ON_DATE |



