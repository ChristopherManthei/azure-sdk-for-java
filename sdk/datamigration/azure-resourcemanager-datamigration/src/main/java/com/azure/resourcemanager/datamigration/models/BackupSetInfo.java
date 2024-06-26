// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Information of backup set. */
@Fluent
public final class BackupSetInfo {
    /*
     * Id for the set of backup files
     */
    @JsonProperty(value = "backupSetId")
    private String backupSetId;

    /*
     * First log sequence number of the backup file
     */
    @JsonProperty(value = "firstLsn")
    private String firstLsn;

    /*
     * Last log sequence number of the backup file
     */
    @JsonProperty(value = "lastLsn")
    private String lastLsn;

    /*
     * Last modified time of the backup file in share location
     */
    @JsonProperty(value = "lastModifiedTime")
    private OffsetDateTime lastModifiedTime;

    /*
     * Enum of the different backup types
     */
    @JsonProperty(value = "backupType")
    private BackupType backupType;

    /*
     * List of files in the backup set
     */
    @JsonProperty(value = "listOfBackupFiles")
    private List<BackupFileInfo> listOfBackupFiles;

    /*
     * Name of the database to which the backup set belongs
     */
    @JsonProperty(value = "databaseName")
    private String databaseName;

    /*
     * Date and time that the backup operation began
     */
    @JsonProperty(value = "backupStartDate")
    private OffsetDateTime backupStartDate;

    /*
     * Date and time that the backup operation finished
     */
    @JsonProperty(value = "backupFinishedDate")
    private OffsetDateTime backupFinishedDate;

    /*
     * Whether the backup set is restored or not
     */
    @JsonProperty(value = "isBackupRestored")
    private Boolean isBackupRestored;

    /** Creates an instance of BackupSetInfo class. */
    public BackupSetInfo() {
    }

    /**
     * Get the backupSetId property: Id for the set of backup files.
     *
     * @return the backupSetId value.
     */
    public String backupSetId() {
        return this.backupSetId;
    }

    /**
     * Set the backupSetId property: Id for the set of backup files.
     *
     * @param backupSetId the backupSetId value to set.
     * @return the BackupSetInfo object itself.
     */
    public BackupSetInfo withBackupSetId(String backupSetId) {
        this.backupSetId = backupSetId;
        return this;
    }

    /**
     * Get the firstLsn property: First log sequence number of the backup file.
     *
     * @return the firstLsn value.
     */
    public String firstLsn() {
        return this.firstLsn;
    }

    /**
     * Set the firstLsn property: First log sequence number of the backup file.
     *
     * @param firstLsn the firstLsn value to set.
     * @return the BackupSetInfo object itself.
     */
    public BackupSetInfo withFirstLsn(String firstLsn) {
        this.firstLsn = firstLsn;
        return this;
    }

    /**
     * Get the lastLsn property: Last log sequence number of the backup file.
     *
     * @return the lastLsn value.
     */
    public String lastLsn() {
        return this.lastLsn;
    }

    /**
     * Set the lastLsn property: Last log sequence number of the backup file.
     *
     * @param lastLsn the lastLsn value to set.
     * @return the BackupSetInfo object itself.
     */
    public BackupSetInfo withLastLsn(String lastLsn) {
        this.lastLsn = lastLsn;
        return this;
    }

    /**
     * Get the lastModifiedTime property: Last modified time of the backup file in share location.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set the lastModifiedTime property: Last modified time of the backup file in share location.
     *
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the BackupSetInfo object itself.
     */
    public BackupSetInfo withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get the backupType property: Enum of the different backup types.
     *
     * @return the backupType value.
     */
    public BackupType backupType() {
        return this.backupType;
    }

    /**
     * Set the backupType property: Enum of the different backup types.
     *
     * @param backupType the backupType value to set.
     * @return the BackupSetInfo object itself.
     */
    public BackupSetInfo withBackupType(BackupType backupType) {
        this.backupType = backupType;
        return this;
    }

    /**
     * Get the listOfBackupFiles property: List of files in the backup set.
     *
     * @return the listOfBackupFiles value.
     */
    public List<BackupFileInfo> listOfBackupFiles() {
        return this.listOfBackupFiles;
    }

    /**
     * Set the listOfBackupFiles property: List of files in the backup set.
     *
     * @param listOfBackupFiles the listOfBackupFiles value to set.
     * @return the BackupSetInfo object itself.
     */
    public BackupSetInfo withListOfBackupFiles(List<BackupFileInfo> listOfBackupFiles) {
        this.listOfBackupFiles = listOfBackupFiles;
        return this;
    }

    /**
     * Get the databaseName property: Name of the database to which the backup set belongs.
     *
     * @return the databaseName value.
     */
    public String databaseName() {
        return this.databaseName;
    }

    /**
     * Set the databaseName property: Name of the database to which the backup set belongs.
     *
     * @param databaseName the databaseName value to set.
     * @return the BackupSetInfo object itself.
     */
    public BackupSetInfo withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * Get the backupStartDate property: Date and time that the backup operation began.
     *
     * @return the backupStartDate value.
     */
    public OffsetDateTime backupStartDate() {
        return this.backupStartDate;
    }

    /**
     * Set the backupStartDate property: Date and time that the backup operation began.
     *
     * @param backupStartDate the backupStartDate value to set.
     * @return the BackupSetInfo object itself.
     */
    public BackupSetInfo withBackupStartDate(OffsetDateTime backupStartDate) {
        this.backupStartDate = backupStartDate;
        return this;
    }

    /**
     * Get the backupFinishedDate property: Date and time that the backup operation finished.
     *
     * @return the backupFinishedDate value.
     */
    public OffsetDateTime backupFinishedDate() {
        return this.backupFinishedDate;
    }

    /**
     * Set the backupFinishedDate property: Date and time that the backup operation finished.
     *
     * @param backupFinishedDate the backupFinishedDate value to set.
     * @return the BackupSetInfo object itself.
     */
    public BackupSetInfo withBackupFinishedDate(OffsetDateTime backupFinishedDate) {
        this.backupFinishedDate = backupFinishedDate;
        return this;
    }

    /**
     * Get the isBackupRestored property: Whether the backup set is restored or not.
     *
     * @return the isBackupRestored value.
     */
    public Boolean isBackupRestored() {
        return this.isBackupRestored;
    }

    /**
     * Set the isBackupRestored property: Whether the backup set is restored or not.
     *
     * @param isBackupRestored the isBackupRestored value to set.
     * @return the BackupSetInfo object itself.
     */
    public BackupSetInfo withIsBackupRestored(Boolean isBackupRestored) {
        this.isBackupRestored = isBackupRestored;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (listOfBackupFiles() != null) {
            listOfBackupFiles().forEach(e -> e.validate());
        }
    }
}
