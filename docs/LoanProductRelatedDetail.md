

# LoanProductRelatedDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | [**MonetaryCurrency**](MonetaryCurrency.md) |  |  [optional]
**principal** | [**Money**](Money.md) |  |  [optional]
**nominalInterestRatePerPeriod** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**interestPeriodFrequencyType** | [**InterestPeriodFrequencyTypeEnum**](#InterestPeriodFrequencyTypeEnum) |  |  [optional]
**annualNominalInterestRate** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**interestMethod** | [**InterestMethodEnum**](#InterestMethodEnum) |  |  [optional]
**interestCalculationPeriodMethod** | [**InterestCalculationPeriodMethodEnum**](#InterestCalculationPeriodMethodEnum) |  |  [optional]
**allowPartialPeriodInterestCalcualtion** | **Boolean** |  |  [optional]
**repayEvery** | **Integer** |  |  [optional]
**repaymentPeriodFrequencyType** | [**RepaymentPeriodFrequencyTypeEnum**](#RepaymentPeriodFrequencyTypeEnum) |  |  [optional]
**numberOfRepayments** | **Integer** |  |  [optional]
**graceOnPrincipalPayment** | **Integer** |  |  [optional]
**graceOnInterestPayment** | **Integer** |  |  [optional]
**amortizationMethod** | [**AmortizationMethodEnum**](#AmortizationMethodEnum) |  |  [optional]
**inArrearsTolerance** | [**Money**](Money.md) |  |  [optional]
**graceOnArrearsAgeing** | **Integer** |  |  [optional]
**equalAmortization** | **Boolean** |  |  [optional]
**graceOnDueDate** | **Integer** |  |  [optional]
**arrearsTolerance** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**interestRecalculationEnabled** | **Boolean** |  |  [optional]



## Enum: InterestPeriodFrequencyTypeEnum

Name | Value
---- | -----
DAYS | &quot;DAYS&quot;
WEEKS | &quot;WEEKS&quot;
MONTHS | &quot;MONTHS&quot;
YEARS | &quot;YEARS&quot;
WHOLE_TERM | &quot;WHOLE_TERM&quot;
INVALID | &quot;INVALID&quot;



## Enum: InterestMethodEnum

Name | Value
---- | -----
DECLINING_BALANCE | &quot;DECLINING_BALANCE&quot;
FLAT | &quot;FLAT&quot;
INVALID | &quot;INVALID&quot;



## Enum: InterestCalculationPeriodMethodEnum

Name | Value
---- | -----
DAILY | &quot;DAILY&quot;
SAME_AS_REPAYMENT_PERIOD | &quot;SAME_AS_REPAYMENT_PERIOD&quot;
INVALID | &quot;INVALID&quot;



## Enum: RepaymentPeriodFrequencyTypeEnum

Name | Value
---- | -----
DAYS | &quot;DAYS&quot;
WEEKS | &quot;WEEKS&quot;
MONTHS | &quot;MONTHS&quot;
YEARS | &quot;YEARS&quot;
WHOLE_TERM | &quot;WHOLE_TERM&quot;
INVALID | &quot;INVALID&quot;



## Enum: AmortizationMethodEnum

Name | Value
---- | -----
EQUAL_PRINCIPAL | &quot;EQUAL_PRINCIPAL&quot;
EQUAL_INSTALLMENTS | &quot;EQUAL_INSTALLMENTS&quot;
INVALID | &quot;INVALID&quot;



