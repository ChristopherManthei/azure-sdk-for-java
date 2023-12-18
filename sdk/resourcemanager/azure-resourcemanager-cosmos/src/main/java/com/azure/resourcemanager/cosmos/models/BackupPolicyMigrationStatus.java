// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Describes the status of migration between backup policy types.
 */
public final class BackupPolicyMigrationStatus extends ExpandableStringEnum<BackupPolicyMigrationStatus> {
    /**
     * Static value Invalid for BackupPolicyMigrationStatus.
     */
    public static final BackupPolicyMigrationStatus INVALID = fromString("Invalid");

    /**
     * Static value InProgress for BackupPolicyMigrationStatus.
     */
    public static final BackupPolicyMigrationStatus IN_PROGRESS = fromString("InProgress");

    /**
     * Static value Completed for BackupPolicyMigrationStatus.
     */
    public static final BackupPolicyMigrationStatus COMPLETED = fromString("Completed");

    /**
     * Static value Failed for BackupPolicyMigrationStatus.
     */
    public static final BackupPolicyMigrationStatus FAILED = fromString("Failed");

    /**
     * Creates a new instance of BackupPolicyMigrationStatus value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BackupPolicyMigrationStatus() {
    }

    /**
     * Creates or finds a BackupPolicyMigrationStatus from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding BackupPolicyMigrationStatus.
     */
    @JsonCreator
    public static BackupPolicyMigrationStatus fromString(String name) {
        return fromString(name, BackupPolicyMigrationStatus.class);
    }

    /**
     * Gets known BackupPolicyMigrationStatus values.
     * 
     * @return known BackupPolicyMigrationStatus values.
     */
    public static Collection<BackupPolicyMigrationStatus> values() {
        return values(BackupPolicyMigrationStatus.class);
    }
}
