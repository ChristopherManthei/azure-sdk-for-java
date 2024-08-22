// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Result of this upgrade.
 */
public final class ClusterPoolUpgradeHistoryUpgradeResultType
    extends ExpandableStringEnum<ClusterPoolUpgradeHistoryUpgradeResultType> {
    /**
     * Static value Succeed for ClusterPoolUpgradeHistoryUpgradeResultType.
     */
    public static final ClusterPoolUpgradeHistoryUpgradeResultType SUCCEED = fromString("Succeed");

    /**
     * Static value Failed for ClusterPoolUpgradeHistoryUpgradeResultType.
     */
    public static final ClusterPoolUpgradeHistoryUpgradeResultType FAILED = fromString("Failed");

    /**
     * Creates a new instance of ClusterPoolUpgradeHistoryUpgradeResultType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ClusterPoolUpgradeHistoryUpgradeResultType() {
    }

    /**
     * Creates or finds a ClusterPoolUpgradeHistoryUpgradeResultType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ClusterPoolUpgradeHistoryUpgradeResultType.
     */
    public static ClusterPoolUpgradeHistoryUpgradeResultType fromString(String name) {
        return fromString(name, ClusterPoolUpgradeHistoryUpgradeResultType.class);
    }

    /**
     * Gets known ClusterPoolUpgradeHistoryUpgradeResultType values.
     * 
     * @return known ClusterPoolUpgradeHistoryUpgradeResultType values.
     */
    public static Collection<ClusterPoolUpgradeHistoryUpgradeResultType> values() {
        return values(ClusterPoolUpgradeHistoryUpgradeResultType.class);
    }
}
