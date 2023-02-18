// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

/** The properties of the benefit recommendations. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "scope",
    defaultImpl = BenefitRecommendationProperties.class)
@JsonTypeName("BenefitRecommendationProperties")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "Single", value = SingleScopeBenefitRecommendationProperties.class),
    @JsonSubTypes.Type(name = "Shared", value = SharedScopeBenefitRecommendationProperties.class)
})
@Fluent
public class BenefitRecommendationProperties {
    /*
     * The first usage date used for looking back for computing the recommendations.
     */
    @JsonProperty(value = "firstConsumptionDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime firstConsumptionDate;

    /*
     * The last usage date used for looking back for computing the recommendations.
     */
    @JsonProperty(value = "lastConsumptionDate", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastConsumptionDate;

    /*
     * The number of days of usage evaluated for computing the recommendations.
     */
    @JsonProperty(value = "lookBackPeriod")
    private LookBackPeriod lookBackPeriod;

    /*
     * The total hours for which the cost is covered. Its equal to number of records in a property
     * 'properties/usage/charges'.
     */
    @JsonProperty(value = "totalHours", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalHours;

    /*
     * On-demand charges between firstConsumptionDate and lastConsumptionDate that were used for computing benefit
     * recommendations.
     */
    @JsonProperty(value = "usage")
    private RecommendationUsageDetails usage;

    /*
     * ARM SKU name. 'Compute_Savings_Plan' for SavingsPlan.
     */
    @JsonProperty(value = "armSkuName", access = JsonProperty.Access.WRITE_ONLY)
    private String armSkuName;

    /*
     * Term period of the benefit. For example, P1Y or P3Y.
     */
    @JsonProperty(value = "term")
    private Term term;

    /*
     * Grain of the proposed commitment amount. Supported values: 'Hourly'
     */
    @JsonProperty(value = "commitmentGranularity")
    private Grain commitmentGranularity;

    /*
     * An ISO 4217 currency code identifier for the costs and savings amounts.
     */
    @JsonProperty(value = "currencyCode", access = JsonProperty.Access.WRITE_ONLY)
    private String currencyCode;

    /*
     * The current cost without benefit, corresponds to 'totalHours' in the look-back period.
     */
    @JsonProperty(value = "costWithoutBenefit", access = JsonProperty.Access.WRITE_ONLY)
    private BigDecimal costWithoutBenefit;

    /*
     * The details of the proposed recommendation.
     */
    @JsonProperty(value = "recommendationDetails")
    private AllSavingsBenefitDetails recommendationDetails;

    /*
     * The list of all benefit recommendations with the recommendation details.
     */
    @JsonProperty(value = "allRecommendationDetails", access = JsonProperty.Access.WRITE_ONLY)
    private AllSavingsList allRecommendationDetails;

    /** Creates an instance of BenefitRecommendationProperties class. */
    public BenefitRecommendationProperties() {
    }

    /**
     * Get the firstConsumptionDate property: The first usage date used for looking back for computing the
     * recommendations.
     *
     * @return the firstConsumptionDate value.
     */
    public OffsetDateTime firstConsumptionDate() {
        return this.firstConsumptionDate;
    }

    /**
     * Get the lastConsumptionDate property: The last usage date used for looking back for computing the
     * recommendations.
     *
     * @return the lastConsumptionDate value.
     */
    public OffsetDateTime lastConsumptionDate() {
        return this.lastConsumptionDate;
    }

    /**
     * Get the lookBackPeriod property: The number of days of usage evaluated for computing the recommendations.
     *
     * @return the lookBackPeriod value.
     */
    public LookBackPeriod lookBackPeriod() {
        return this.lookBackPeriod;
    }

    /**
     * Set the lookBackPeriod property: The number of days of usage evaluated for computing the recommendations.
     *
     * @param lookBackPeriod the lookBackPeriod value to set.
     * @return the BenefitRecommendationProperties object itself.
     */
    public BenefitRecommendationProperties withLookBackPeriod(LookBackPeriod lookBackPeriod) {
        this.lookBackPeriod = lookBackPeriod;
        return this;
    }

    /**
     * Get the totalHours property: The total hours for which the cost is covered. Its equal to number of records in a
     * property 'properties/usage/charges'.
     *
     * @return the totalHours value.
     */
    public Integer totalHours() {
        return this.totalHours;
    }

    /**
     * Get the usage property: On-demand charges between firstConsumptionDate and lastConsumptionDate that were used for
     * computing benefit recommendations.
     *
     * @return the usage value.
     */
    public RecommendationUsageDetails usage() {
        return this.usage;
    }

    /**
     * Set the usage property: On-demand charges between firstConsumptionDate and lastConsumptionDate that were used for
     * computing benefit recommendations.
     *
     * @param usage the usage value to set.
     * @return the BenefitRecommendationProperties object itself.
     */
    public BenefitRecommendationProperties withUsage(RecommendationUsageDetails usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Get the armSkuName property: ARM SKU name. 'Compute_Savings_Plan' for SavingsPlan.
     *
     * @return the armSkuName value.
     */
    public String armSkuName() {
        return this.armSkuName;
    }

    /**
     * Get the term property: Term period of the benefit. For example, P1Y or P3Y.
     *
     * @return the term value.
     */
    public Term term() {
        return this.term;
    }

    /**
     * Set the term property: Term period of the benefit. For example, P1Y or P3Y.
     *
     * @param term the term value to set.
     * @return the BenefitRecommendationProperties object itself.
     */
    public BenefitRecommendationProperties withTerm(Term term) {
        this.term = term;
        return this;
    }

    /**
     * Get the commitmentGranularity property: Grain of the proposed commitment amount. Supported values: 'Hourly'.
     *
     * @return the commitmentGranularity value.
     */
    public Grain commitmentGranularity() {
        return this.commitmentGranularity;
    }

    /**
     * Set the commitmentGranularity property: Grain of the proposed commitment amount. Supported values: 'Hourly'.
     *
     * @param commitmentGranularity the commitmentGranularity value to set.
     * @return the BenefitRecommendationProperties object itself.
     */
    public BenefitRecommendationProperties withCommitmentGranularity(Grain commitmentGranularity) {
        this.commitmentGranularity = commitmentGranularity;
        return this;
    }

    /**
     * Get the currencyCode property: An ISO 4217 currency code identifier for the costs and savings amounts.
     *
     * @return the currencyCode value.
     */
    public String currencyCode() {
        return this.currencyCode;
    }

    /**
     * Get the costWithoutBenefit property: The current cost without benefit, corresponds to 'totalHours' in the
     * look-back period.
     *
     * @return the costWithoutBenefit value.
     */
    public BigDecimal costWithoutBenefit() {
        return this.costWithoutBenefit;
    }

    /**
     * Get the recommendationDetails property: The details of the proposed recommendation.
     *
     * @return the recommendationDetails value.
     */
    public AllSavingsBenefitDetails recommendationDetails() {
        return this.recommendationDetails;
    }

    /**
     * Set the recommendationDetails property: The details of the proposed recommendation.
     *
     * @param recommendationDetails the recommendationDetails value to set.
     * @return the BenefitRecommendationProperties object itself.
     */
    public BenefitRecommendationProperties withRecommendationDetails(AllSavingsBenefitDetails recommendationDetails) {
        this.recommendationDetails = recommendationDetails;
        return this;
    }

    /**
     * Get the allRecommendationDetails property: The list of all benefit recommendations with the recommendation
     * details.
     *
     * @return the allRecommendationDetails value.
     */
    public AllSavingsList allRecommendationDetails() {
        return this.allRecommendationDetails;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (usage() != null) {
            usage().validate();
        }
        if (recommendationDetails() != null) {
            recommendationDetails().validate();
        }
        if (allRecommendationDetails() != null) {
            allRecommendationDetails().validate();
        }
    }
}