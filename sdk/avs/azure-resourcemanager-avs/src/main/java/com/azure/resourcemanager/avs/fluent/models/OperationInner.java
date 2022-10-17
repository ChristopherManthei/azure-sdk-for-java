// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.avs.models.OperationDisplay;
import com.azure.resourcemanager.avs.models.OperationProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A REST API operation. */
@Fluent
public final class OperationInner {
    /*
     * Name of the operation being performed on this object
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Contains the localized display information for this operation
     */
    @JsonProperty(value = "display", access = JsonProperty.Access.WRITE_ONLY)
    private OperationDisplay display;

    /*
     * Gets or sets a value indicating whether the operation is a data action or not
     */
    @JsonProperty(value = "isDataAction")
    private Boolean isDataAction;

    /*
     * Origin of the operation
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Properties of the operation
     */
    @JsonProperty(value = "properties")
    private OperationProperties properties;

    /** Creates an instance of OperationInner class. */
    public OperationInner() {
    }

    /**
     * Get the name property: Name of the operation being performed on this object.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the display property: Contains the localized display information for this operation.
     *
     * @return the display value.
     */
    public OperationDisplay display() {
        return this.display;
    }

    /**
     * Get the isDataAction property: Gets or sets a value indicating whether the operation is a data action or not.
     *
     * @return the isDataAction value.
     */
    public Boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Gets or sets a value indicating whether the operation is a data action or not.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withIsDataAction(Boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the origin property: Origin of the operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: Origin of the operation.
     *
     * @param origin the origin value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the properties property: Properties of the operation.
     *
     * @return the properties value.
     */
    public OperationProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the operation.
     *
     * @param properties the properties value to set.
     * @return the OperationInner object itself.
     */
    public OperationInner withProperties(OperationProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
