
# LoanProductInterestRecalculationDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**interestRecalculationCompoundingMethod** | **Integer** |  |  [optional]
**rescheduleStrategyMethod** | **Integer** |  |  [optional]
**restFrequencyType** | [**RestFrequencyTypeEnum**](#RestFrequencyTypeEnum) |  |  [optional]
**restInterval** | **Integer** |  |  [optional]
**restFrequencyNthDay** | **Integer** |  |  [optional]
**restFrequencyWeekday** | **Integer** |  |  [optional]
**restFrequencyOnDay** | **Integer** |  |  [optional]
**compoundingFrequencyType** | [**CompoundingFrequencyTypeEnum**](#CompoundingFrequencyTypeEnum) |  |  [optional]
**compoundingInterval** | **Integer** |  |  [optional]
**compoundingFrequencyNthDay** | **Integer** |  |  [optional]
**compoundingFrequencyWeekday** | **Integer** |  |  [optional]
**compoundingFrequencyOnDay** | **Integer** |  |  [optional]
**isCompoundingToBePostedAsTransaction** | **Boolean** |  |  [optional]
**arrearsBasedOnOriginalSchedule** | **Boolean** |  |  [optional]
**_new** | **Boolean** |  |  [optional]


<a name="RestFrequencyTypeEnum"></a>
## Enum: RestFrequencyTypeEnum
Name | Value
---- | -----
INVALID | &quot;INVALID&quot;
SAME_AS_REPAYMENT_PERIOD | &quot;SAME_AS_REPAYMENT_PERIOD&quot;
DAILY | &quot;DAILY&quot;
WEEKLY | &quot;WEEKLY&quot;
MONTHLY | &quot;MONTHLY&quot;


<a name="CompoundingFrequencyTypeEnum"></a>
## Enum: CompoundingFrequencyTypeEnum
Name | Value
---- | -----
INVALID | &quot;INVALID&quot;
SAME_AS_REPAYMENT_PERIOD | &quot;SAME_AS_REPAYMENT_PERIOD&quot;
DAILY | &quot;DAILY&quot;
WEEKLY | &quot;WEEKLY&quot;
MONTHLY | &quot;MONTHLY&quot;



