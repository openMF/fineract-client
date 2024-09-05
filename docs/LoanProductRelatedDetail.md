
# LoanProductRelatedDetail

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **allowPartialPeriodInterestCalcualtion** | **kotlin.Boolean** |  |  [optional] |
| **amortizationMethod** | [**inline**](#AmortizationMethod) |  |  [optional] |
| **annualNominalInterestRate** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **arrearsTolerance** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **currency** | [**MonetaryCurrency**](MonetaryCurrency.md) |  |  [optional] |
| **disableScheduleExtensionForDownPayment** | **kotlin.Boolean** |  |  [optional] |
| **disbursedAmountPercentageForDownPayment** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **enableAutoRepaymentForDownPayment** | **kotlin.Boolean** |  |  [optional] |
| **enableDownPayment** | **kotlin.Boolean** |  |  [optional] |
| **equalAmortization** | **kotlin.Boolean** |  |  [optional] |
| **graceOnArrearsAgeing** | **kotlin.Int** |  |  [optional] |
| **graceOnDueDate** | **kotlin.Int** |  |  [optional] |
| **graceOnInterestPayment** | **kotlin.Int** |  |  [optional] |
| **graceOnPrincipalPayment** | **kotlin.Int** |  |  [optional] |
| **inArrearsTolerance** | [**Money**](Money.md) |  |  [optional] |
| **interestCalculationPeriodMethod** | [**inline**](#InterestCalculationPeriodMethod) |  |  [optional] |
| **interestMethod** | [**inline**](#InterestMethod) |  |  [optional] |
| **interestPeriodFrequencyType** | [**inline**](#InterestPeriodFrequencyType) |  |  [optional] |
| **interestRecalculationEnabled** | **kotlin.Boolean** |  |  [optional] |
| **loanScheduleProcessingType** | [**inline**](#LoanScheduleProcessingType) |  |  [optional] |
| **loanScheduleType** | [**inline**](#LoanScheduleType) |  |  [optional] |
| **nominalInterestRatePerPeriod** | [**java.math.BigDecimal**](java.math.BigDecimal.md) |  |  [optional] |
| **numberOfRepayments** | **kotlin.Int** |  |  [optional] |
| **principal** | [**Money**](Money.md) |  |  [optional] |
| **repayEvery** | **kotlin.Int** |  |  [optional] |
| **repaymentPeriodFrequencyType** | [**inline**](#RepaymentPeriodFrequencyType) |  |  [optional] |


<a id="AmortizationMethod"></a>
## Enum: amortizationMethod
| Name | Value |
| ---- | ----- |
| amortizationMethod | EQUAL_PRINCIPAL, EQUAL_INSTALLMENTS, INVALID |


<a id="InterestCalculationPeriodMethod"></a>
## Enum: interestCalculationPeriodMethod
| Name | Value |
| ---- | ----- |
| interestCalculationPeriodMethod | DAILY, SAME_AS_REPAYMENT_PERIOD, INVALID |


<a id="InterestMethod"></a>
## Enum: interestMethod
| Name | Value |
| ---- | ----- |
| interestMethod | DECLINING_BALANCE, FLAT, INVALID |


<a id="InterestPeriodFrequencyType"></a>
## Enum: interestPeriodFrequencyType
| Name | Value |
| ---- | ----- |
| interestPeriodFrequencyType | DAYS, WEEKS, MONTHS, YEARS, WHOLE_TERM, INVALID |


<a id="LoanScheduleProcessingType"></a>
## Enum: loanScheduleProcessingType
| Name | Value |
| ---- | ----- |
| loanScheduleProcessingType | HORIZONTAL, VERTICAL |


<a id="LoanScheduleType"></a>
## Enum: loanScheduleType
| Name | Value |
| ---- | ----- |
| loanScheduleType | CUMULATIVE, PROGRESSIVE |


<a id="RepaymentPeriodFrequencyType"></a>
## Enum: repaymentPeriodFrequencyType
| Name | Value |
| ---- | ----- |
| repaymentPeriodFrequencyType | DAYS, WEEKS, MONTHS, YEARS, WHOLE_TERM, INVALID |



