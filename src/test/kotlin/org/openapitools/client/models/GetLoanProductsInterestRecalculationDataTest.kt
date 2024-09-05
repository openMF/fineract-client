/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import org.openapitools.client.models.GetLoanProductsInterestRecalculationData
import org.openapitools.client.models.GetLoanProductsInterestRecalculationCompoundingFrequencyType
import org.openapitools.client.models.GetLoanProductsInterestRecalculationCompoundingType
import org.openapitools.client.models.GetLoanProductsPreClosureInterestCalculationStrategy
import org.openapitools.client.models.GetLoanProductsRescheduleStrategyType

class GetLoanProductsInterestRecalculationDataTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of GetLoanProductsInterestRecalculationData
        //val modelInstance = GetLoanProductsInterestRecalculationData()

        // to test the property `id`
        should("test id") {
            // uncomment below to test the property
            //modelInstance.id shouldBe ("TODO")
        }

        // to test the property `interestRecalculationCompoundingFrequencyType`
        should("test interestRecalculationCompoundingFrequencyType") {
            // uncomment below to test the property
            //modelInstance.interestRecalculationCompoundingFrequencyType shouldBe ("TODO")
        }

        // to test the property `interestRecalculationCompoundingType`
        should("test interestRecalculationCompoundingType") {
            // uncomment below to test the property
            //modelInstance.interestRecalculationCompoundingType shouldBe ("TODO")
        }

        // to test the property `isArrearsBasedOnOriginalSchedule`
        should("test isArrearsBasedOnOriginalSchedule") {
            // uncomment below to test the property
            //modelInstance.isArrearsBasedOnOriginalSchedule shouldBe ("TODO")
        }

        // to test the property `preClosureInterestCalculationStrategy`
        should("test preClosureInterestCalculationStrategy") {
            // uncomment below to test the property
            //modelInstance.preClosureInterestCalculationStrategy shouldBe ("TODO")
        }

        // to test the property `productId`
        should("test productId") {
            // uncomment below to test the property
            //modelInstance.productId shouldBe ("TODO")
        }

        // to test the property `recalculationCompoundingFrequencyInterval`
        should("test recalculationCompoundingFrequencyInterval") {
            // uncomment below to test the property
            //modelInstance.recalculationCompoundingFrequencyInterval shouldBe ("TODO")
        }

        // to test the property `recalculationCompoundingFrequencyOnDayType`
        should("test recalculationCompoundingFrequencyOnDayType") {
            // uncomment below to test the property
            //modelInstance.recalculationCompoundingFrequencyOnDayType shouldBe ("TODO")
        }

        // to test the property `recalculationRestFrequencyInterval`
        should("test recalculationRestFrequencyInterval") {
            // uncomment below to test the property
            //modelInstance.recalculationRestFrequencyInterval shouldBe ("TODO")
        }

        // to test the property `recalculationRestFrequencyType`
        should("test recalculationRestFrequencyType") {
            // uncomment below to test the property
            //modelInstance.recalculationRestFrequencyType shouldBe ("TODO")
        }

        // to test the property `rescheduleStrategyType`
        should("test rescheduleStrategyType") {
            // uncomment below to test the property
            //modelInstance.rescheduleStrategyType shouldBe ("TODO")
        }

    }
}
