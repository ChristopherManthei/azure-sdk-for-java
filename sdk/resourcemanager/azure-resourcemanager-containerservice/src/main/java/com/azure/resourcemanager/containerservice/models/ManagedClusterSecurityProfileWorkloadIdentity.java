// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Workload identity settings for the security profile.
 */
@Fluent
public final class ManagedClusterSecurityProfileWorkloadIdentity {
    /*
     * Whether to enable workload identity.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /**
     * Creates an instance of ManagedClusterSecurityProfileWorkloadIdentity class.
     */
    public ManagedClusterSecurityProfileWorkloadIdentity() {
    }

    /**
     * Get the enabled property: Whether to enable workload identity.
     * 
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Whether to enable workload identity.
     * 
     * @param enabled the enabled value to set.
     * @return the ManagedClusterSecurityProfileWorkloadIdentity object itself.
     */
    public ManagedClusterSecurityProfileWorkloadIdentity withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
