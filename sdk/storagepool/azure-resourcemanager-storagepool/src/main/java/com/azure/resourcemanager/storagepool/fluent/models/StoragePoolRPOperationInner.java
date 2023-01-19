// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.storagepool.models.StoragePoolOperationDisplay;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Description of a StoragePool RP Operation. */
@Fluent
public final class StoragePoolRPOperationInner {
    /*
     * The name of the operation being performed on this particular object
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Indicates whether the operation applies to data-plane.
     */
    @JsonProperty(value = "isDataAction", required = true)
    private boolean isDataAction;

    /*
     * Indicates the action type.
     */
    @JsonProperty(value = "actionType")
    private String actionType;

    /*
     * Additional metadata about RP operation.
     */
    @JsonProperty(value = "display", required = true)
    private StoragePoolOperationDisplay display;

    /*
     * The intended executor of the operation; governs the display of the operation in the RBAC UX and the audit logs
     * UX.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /** Creates an instance of StoragePoolRPOperationInner class. */
    public StoragePoolRPOperationInner() {
    }

    /**
     * Get the name property: The name of the operation being performed on this particular object.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the operation being performed on this particular object.
     *
     * @param name the name value to set.
     * @return the StoragePoolRPOperationInner object itself.
     */
    public StoragePoolRPOperationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @return the isDataAction value.
     */
    public boolean isDataAction() {
        return this.isDataAction;
    }

    /**
     * Set the isDataAction property: Indicates whether the operation applies to data-plane.
     *
     * @param isDataAction the isDataAction value to set.
     * @return the StoragePoolRPOperationInner object itself.
     */
    public StoragePoolRPOperationInner withIsDataAction(boolean isDataAction) {
        this.isDataAction = isDataAction;
        return this;
    }

    /**
     * Get the actionType property: Indicates the action type.
     *
     * @return the actionType value.
     */
    public String actionType() {
        return this.actionType;
    }

    /**
     * Set the actionType property: Indicates the action type.
     *
     * @param actionType the actionType value to set.
     * @return the StoragePoolRPOperationInner object itself.
     */
    public StoragePoolRPOperationInner withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Get the display property: Additional metadata about RP operation.
     *
     * @return the display value.
     */
    public StoragePoolOperationDisplay display() {
        return this.display;
    }

    /**
     * Set the display property: Additional metadata about RP operation.
     *
     * @param display the display value to set.
     * @return the StoragePoolRPOperationInner object itself.
     */
    public StoragePoolRPOperationInner withDisplay(StoragePoolOperationDisplay display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: The intended executor of the operation; governs the display of the operation in the RBAC
     * UX and the audit logs UX.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The intended executor of the operation; governs the display of the operation in the RBAC
     * UX and the audit logs UX.
     *
     * @param origin the origin value to set.
     * @return the StoragePoolRPOperationInner object itself.
     */
    public StoragePoolRPOperationInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property name in model StoragePoolRPOperationInner"));
        }
        if (display() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property display in model StoragePoolRPOperationInner"));
        } else {
            display().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StoragePoolRPOperationInner.class);
}
