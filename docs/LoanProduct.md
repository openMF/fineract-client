

# LoanProduct

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**shortName** | **String** |  |  [optional]
**rates** | [**List&lt;Rate&gt;**](Rate.md) |  |  [optional]
**loanProductRelatedDetail** | [**LoanProductRelatedDetail**](LoanProductRelatedDetail.md) |  |  [optional]
**includeInBorrowerCycle** | **Boolean** |  |  [optional]
**startDate** | [**Date**](Date.md) |  |  [optional]
**closeDate** | [**Date**](Date.md) |  |  [optional]
**externalId** | **String** |  |  [optional]
**minimumDaysBetweenDisbursalAndFirstRepayment** | **Integer** |  |  [optional]
**productInterestRecalculationDetails** | [**LoanProductInterestRecalculationDetails**](LoanProductInterestRecalculationDetails.md) |  |  [optional]
**loanProductGuaranteeDetails** | [**LoanProductGuaranteeDetails**](LoanProductGuaranteeDetails.md) |  |  [optional]
**principalThresholdForLastInstallment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**installmentAmountInMultiplesOf** | **Integer** |  |  [optional]
**floatingRates** | [**LoanProductFloatingRates**](LoanProductFloatingRates.md) |  |  [optional]
**syncExpectedWithDisbursementDate** | **Boolean** |  |  [optional]
**currency** | [**MonetaryCurrency**](MonetaryCurrency.md) |  |  [optional]
**holdGuaranteeFundsEnabled** | **Boolean** |  |  [optional]
**equalAmortization** | **Boolean** |  |  [optional]
**arrearsBasedOnOriginalSchedule** | **Boolean** |  |  [optional]
**accountingDisabled** | **Boolean** |  |  [optional]
**principalAmount** | [**Money**](Money.md) |  |  [optional]
**minPrincipalAmount** | [**Money**](Money.md) |  |  [optional]
**maxPrincipalAmount** | [**Money**](Money.md) |  |  [optional]
**loanProductConfigurableAttributes** | [**LoanProductConfigurableAttributes**](LoanProductConfigurableAttributes.md) |  |  [optional]
**linkedToFloatingInterestRate** | **Boolean** |  |  [optional]
**repaymentStrategy** | [**LoanTransactionProcessingStrategy**](LoanTransactionProcessingStrategy.md) |  |  [optional]
**loanProductCharges** | [**List&lt;Charge&gt;**](Charge.md) |  |  [optional]
**cashBasedAccountingEnabled** | **Boolean** |  |  [optional]
**accrualBasedAccountingEnabled** | **Boolean** |  |  [optional]
**numberOfRepayments** | **Integer** |  |  [optional]
**nominalInterestRatePerPeriod** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**interestPeriodFrequencyType** | [**InterestPeriodFrequencyTypeEnum**](#InterestPeriodFrequencyTypeEnum) |  |  [optional]
**minNumberOfRepayments** | **Integer** |  |  [optional]
**maxNumberOfRepayments** | **Integer** |  |  [optional]
**accountingType** | **Integer** |  |  [optional]
**interestRecalculationEnabled** | **Boolean** |  |  [optional]
**multiDisburseLoan** | **Boolean** |  |  [optional]
**upfrontAccrualAccountingEnabled** | **Boolean** |  |  [optional]
**periodicAccrualAccountingEnabled** | **Boolean** |  |  [optional]
**minNominalInterestRatePerPeriod** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**maxNominalInterestRatePerPeriod** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**_new** | **Boolean** |  |  [optional]



## Enum: InterestPeriodFrequencyTypeEnum

Name | Value
---- | -----
DAYS | &quot;DAYS&quot;
WEEKS | &quot;WEEKS&quot;
MONTHS | &quot;MONTHS&quot;
YEARS | &quot;YEARS&quot;
WHOLE_TERM | &quot;WHOLE_TERM&quot;
INVALID | &quot;INVALID&quot;



