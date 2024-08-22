// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Provisioning state of the resource.
 */
public final class ProvisioningStatus extends ExpandableStringEnum<ProvisioningStatus> {
    /**
     * Static value Accepted for ProvisioningStatus.
     */
    public static final ProvisioningStatus ACCEPTED = fromString("Accepted");

    /**
     * Static value Succeeded for ProvisioningStatus.
     */
    public static final ProvisioningStatus SUCCEEDED = fromString("Succeeded");

    /**
     * Static value Canceled for ProvisioningStatus.
     */
    public static final ProvisioningStatus CANCELED = fromString("Canceled");

    /**
     * Static value Failed for ProvisioningStatus.
     */
    public static final ProvisioningStatus FAILED = fromString("Failed");

    /**
     * Creates a new instance of ProvisioningStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ProvisioningStatus() {
    }

    /**
     * Creates or finds a ProvisioningStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ProvisioningStatus.
     */
    public static ProvisioningStatus fromString(String name) {
        return fromString(name, ProvisioningStatus.class);
    }

    /**
     * Gets known ProvisioningStatus values.
     * 
     * @return known ProvisioningStatus values.
     */
    public static Collection<ProvisioningStatus> values() {
        return values(ProvisioningStatus.class);
    }
}
