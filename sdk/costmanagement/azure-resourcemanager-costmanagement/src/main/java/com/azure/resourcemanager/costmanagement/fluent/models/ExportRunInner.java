// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.costmanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.costmanagement.models.CostManagementProxyResource;
import com.azure.resourcemanager.costmanagement.models.ExecutionStatus;
import com.azure.resourcemanager.costmanagement.models.ExecutionType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** An export run. */
@Fluent
public final class ExportRunInner extends CostManagementProxyResource {
    /*
     * The properties of the export run.
     */
    @JsonProperty(value = "properties")
    private ExportRunPropertiesInner innerProperties;

    /** Creates an instance of ExportRunInner class. */
    public ExportRunInner() {
    }

    /**
     * Get the innerProperties property: The properties of the export run.
     *
     * @return the innerProperties value.
     */
    private ExportRunPropertiesInner innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public ExportRunInner withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Get the executionType property: The type of the export run.
     *
     * @return the executionType value.
     */
    public ExecutionType executionType() {
        return this.innerProperties() == null ? null : this.innerProperties().executionType();
    }

    /**
     * Set the executionType property: The type of the export run.
     *
     * @param executionType the executionType value to set.
     * @return the ExportRunInner object itself.
     */
    public ExportRunInner withExecutionType(ExecutionType executionType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportRunPropertiesInner();
        }
        this.innerProperties().withExecutionType(executionType);
        return this;
    }

    /**
     * Get the status property: The last known status of the export run.
     *
     * @return the status value.
     */
    public ExecutionStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Set the status property: The last known status of the export run.
     *
     * @param status the status value to set.
     * @return the ExportRunInner object itself.
     */
    public ExportRunInner withStatus(ExecutionStatus status) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportRunPropertiesInner();
        }
        this.innerProperties().withStatus(status);
        return this;
    }

    /**
     * Get the submittedBy property: The identifier for the entity that triggered the export. For on-demand runs it is
     * the user email. For scheduled runs it is 'System'.
     *
     * @return the submittedBy value.
     */
    public String submittedBy() {
        return this.innerProperties() == null ? null : this.innerProperties().submittedBy();
    }

    /**
     * Set the submittedBy property: The identifier for the entity that triggered the export. For on-demand runs it is
     * the user email. For scheduled runs it is 'System'.
     *
     * @param submittedBy the submittedBy value to set.
     * @return the ExportRunInner object itself.
     */
    public ExportRunInner withSubmittedBy(String submittedBy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportRunPropertiesInner();
        }
        this.innerProperties().withSubmittedBy(submittedBy);
        return this;
    }

    /**
     * Get the submittedTime property: The time when export was queued to be run.
     *
     * @return the submittedTime value.
     */
    public OffsetDateTime submittedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().submittedTime();
    }

    /**
     * Set the submittedTime property: The time when export was queued to be run.
     *
     * @param submittedTime the submittedTime value to set.
     * @return the ExportRunInner object itself.
     */
    public ExportRunInner withSubmittedTime(OffsetDateTime submittedTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportRunPropertiesInner();
        }
        this.innerProperties().withSubmittedTime(submittedTime);
        return this;
    }

    /**
     * Get the processingStartTime property: The time when export was picked up to be run.
     *
     * @return the processingStartTime value.
     */
    public OffsetDateTime processingStartTime() {
        return this.innerProperties() == null ? null : this.innerProperties().processingStartTime();
    }

    /**
     * Set the processingStartTime property: The time when export was picked up to be run.
     *
     * @param processingStartTime the processingStartTime value to set.
     * @return the ExportRunInner object itself.
     */
    public ExportRunInner withProcessingStartTime(OffsetDateTime processingStartTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportRunPropertiesInner();
        }
        this.innerProperties().withProcessingStartTime(processingStartTime);
        return this;
    }

    /**
     * Get the processingEndTime property: The time when the export run finished.
     *
     * @return the processingEndTime value.
     */
    public OffsetDateTime processingEndTime() {
        return this.innerProperties() == null ? null : this.innerProperties().processingEndTime();
    }

    /**
     * Set the processingEndTime property: The time when the export run finished.
     *
     * @param processingEndTime the processingEndTime value to set.
     * @return the ExportRunInner object itself.
     */
    public ExportRunInner withProcessingEndTime(OffsetDateTime processingEndTime) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportRunPropertiesInner();
        }
        this.innerProperties().withProcessingEndTime(processingEndTime);
        return this;
    }

    /**
     * Get the fileName property: The name of the exported file.
     *
     * @return the fileName value.
     */
    public String fileName() {
        return this.innerProperties() == null ? null : this.innerProperties().fileName();
    }

    /**
     * Set the fileName property: The name of the exported file.
     *
     * @param fileName the fileName value to set.
     * @return the ExportRunInner object itself.
     */
    public ExportRunInner withFileName(String fileName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportRunPropertiesInner();
        }
        this.innerProperties().withFileName(fileName);
        return this;
    }

    /**
     * Get the runSettings property: The export settings that were in effect for this run.
     *
     * @return the runSettings value.
     */
    public CommonExportPropertiesInner runSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().runSettings();
    }

    /**
     * Set the runSettings property: The export settings that were in effect for this run.
     *
     * @param runSettings the runSettings value to set.
     * @return the ExportRunInner object itself.
     */
    public ExportRunInner withRunSettings(CommonExportPropertiesInner runSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportRunPropertiesInner();
        }
        this.innerProperties().withRunSettings(runSettings);
        return this;
    }

    /**
     * Get the error property: The details of any error.
     *
     * @return the error value.
     */
    public ManagementError error() {
        return this.innerProperties() == null ? null : this.innerProperties().error();
    }

    /**
     * Set the error property: The details of any error.
     *
     * @param error the error value to set.
     * @return the ExportRunInner object itself.
     */
    public ExportRunInner withError(ManagementError error) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExportRunPropertiesInner();
        }
        this.innerProperties().withError(error);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}