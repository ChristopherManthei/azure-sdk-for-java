// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Update VM resource collection. */
@Fluent
public final class VMCollectionUpdate {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VMCollectionUpdate.class);

    /*
     * ARM id of the VM resource.
     */
    @JsonProperty(value = "vmResourceId")
    private String vmResourceId;

    /*
     * Operation to be performed for given VM.
     */
    @JsonProperty(value = "operationName")
    private OperationName operationName;

    /**
     * Get the vmResourceId property: ARM id of the VM resource.
     *
     * @return the vmResourceId value.
     */
    public String vmResourceId() {
        return this.vmResourceId;
    }

    /**
     * Set the vmResourceId property: ARM id of the VM resource.
     *
     * @param vmResourceId the vmResourceId value to set.
     * @return the VMCollectionUpdate object itself.
     */
    public VMCollectionUpdate withVmResourceId(String vmResourceId) {
        this.vmResourceId = vmResourceId;
        return this;
    }

    /**
     * Get the operationName property: Operation to be performed for given VM.
     *
     * @return the operationName value.
     */
    public OperationName operationName() {
        return this.operationName;
    }

    /**
     * Set the operationName property: Operation to be performed for given VM.
     *
     * @param operationName the operationName value to set.
     * @return the VMCollectionUpdate object itself.
     */
    public VMCollectionUpdate withOperationName(OperationName operationName) {
        this.operationName = operationName;
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
