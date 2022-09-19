// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Azure Databricks Delta Lake export command settings. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureDatabricksDeltaLakeExportCommand")
@Fluent
public final class AzureDatabricksDeltaLakeExportCommand extends ExportSettings {
    /*
     * Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "dateFormat")
    private Object dateFormat;

    /*
     * Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "timestampFormat")
    private Object timestampFormat;

    /**
     * Get the dateFormat property: Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type:
     * string (or Expression with resultType string).
     *
     * @return the dateFormat value.
     */
    public Object getDateFormat() {
        return this.dateFormat;
    }

    /**
     * Set the dateFormat property: Specify the date format for the csv in Azure Databricks Delta Lake Copy. Type:
     * string (or Expression with resultType string).
     *
     * @param dateFormat the dateFormat value to set.
     * @return the AzureDatabricksDeltaLakeExportCommand object itself.
     */
    public AzureDatabricksDeltaLakeExportCommand setDateFormat(Object dateFormat) {
        this.dateFormat = dateFormat;
        return this;
    }

    /**
     * Get the timestampFormat property: Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy.
     * Type: string (or Expression with resultType string).
     *
     * @return the timestampFormat value.
     */
    public Object getTimestampFormat() {
        return this.timestampFormat;
    }

    /**
     * Set the timestampFormat property: Specify the timestamp format for the csv in Azure Databricks Delta Lake Copy.
     * Type: string (or Expression with resultType string).
     *
     * @param timestampFormat the timestampFormat value to set.
     * @return the AzureDatabricksDeltaLakeExportCommand object itself.
     */
    public AzureDatabricksDeltaLakeExportCommand setTimestampFormat(Object timestampFormat) {
        this.timestampFormat = timestampFormat;
        return this;
    }
}
