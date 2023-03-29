// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response of get metrics status Operation. */
@Fluent
public final class MetricsStatusResponseInner {
    /*
     * Azure resource IDs
     */
    @JsonProperty(value = "azureResourceIds")
    private List<String> azureResourceIds;

    /** Creates an instance of MetricsStatusResponseInner class. */
    public MetricsStatusResponseInner() {
    }

    /**
     * Get the azureResourceIds property: Azure resource IDs.
     *
     * @return the azureResourceIds value.
     */
    public List<String> azureResourceIds() {
        return this.azureResourceIds;
    }

    /**
     * Set the azureResourceIds property: Azure resource IDs.
     *
     * @param azureResourceIds the azureResourceIds value to set.
     * @return the MetricsStatusResponseInner object itself.
     */
    public MetricsStatusResponseInner withAzureResourceIds(List<String> azureResourceIds) {
        this.azureResourceIds = azureResourceIds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
