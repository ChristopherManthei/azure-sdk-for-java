// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The state of the ExpressRoute Circuit Authorization provisioning. */
public final class GlobalReachConnectionProvisioningState
    extends ExpandableStringEnum<GlobalReachConnectionProvisioningState> {
    /** Static value Succeeded for GlobalReachConnectionProvisioningState. */
    public static final GlobalReachConnectionProvisioningState SUCCEEDED = fromString("Succeeded");

    /** Static value Failed for GlobalReachConnectionProvisioningState. */
    public static final GlobalReachConnectionProvisioningState FAILED = fromString("Failed");

    /** Static value Updating for GlobalReachConnectionProvisioningState. */
    public static final GlobalReachConnectionProvisioningState UPDATING = fromString("Updating");

    /** Static value Canceled for GlobalReachConnectionProvisioningState. */
    public static final GlobalReachConnectionProvisioningState CANCELED = fromString("Canceled");

    /**
     * Creates or finds a GlobalReachConnectionProvisioningState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GlobalReachConnectionProvisioningState.
     */
    @JsonCreator
    public static GlobalReachConnectionProvisioningState fromString(String name) {
        return fromString(name, GlobalReachConnectionProvisioningState.class);
    }

    /**
     * Gets known GlobalReachConnectionProvisioningState values.
     *
     * @return known GlobalReachConnectionProvisioningState values.
     */
    public static Collection<GlobalReachConnectionProvisioningState> values() {
        return values(GlobalReachConnectionProvisioningState.class);
    }
}
