// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Cosmos DB client encryption policy.
 */
@Fluent
public final class ClientEncryptionPolicy {
    /*
     * Paths of the item that need encryption along with path-specific settings.
     */
    @JsonProperty(value = "includedPaths", required = true)
    private List<ClientEncryptionIncludedPath> includedPaths;

    /*
     * Version of the client encryption policy definition. Supported versions are 1 and 2. Version 2 supports id and
     * partition key path encryption.
     */
    @JsonProperty(value = "policyFormatVersion", required = true)
    private int policyFormatVersion;

    /**
     * Creates an instance of ClientEncryptionPolicy class.
     */
    public ClientEncryptionPolicy() {
    }

    /**
     * Get the includedPaths property: Paths of the item that need encryption along with path-specific settings.
     * 
     * @return the includedPaths value.
     */
    public List<ClientEncryptionIncludedPath> includedPaths() {
        return this.includedPaths;
    }

    /**
     * Set the includedPaths property: Paths of the item that need encryption along with path-specific settings.
     * 
     * @param includedPaths the includedPaths value to set.
     * @return the ClientEncryptionPolicy object itself.
     */
    public ClientEncryptionPolicy withIncludedPaths(List<ClientEncryptionIncludedPath> includedPaths) {
        this.includedPaths = includedPaths;
        return this;
    }

    /**
     * Get the policyFormatVersion property: Version of the client encryption policy definition. Supported versions are
     * 1 and 2. Version 2 supports id and partition key path encryption.
     * 
     * @return the policyFormatVersion value.
     */
    public int policyFormatVersion() {
        return this.policyFormatVersion;
    }

    /**
     * Set the policyFormatVersion property: Version of the client encryption policy definition. Supported versions are
     * 1 and 2. Version 2 supports id and partition key path encryption.
     * 
     * @param policyFormatVersion the policyFormatVersion value to set.
     * @return the ClientEncryptionPolicy object itself.
     */
    public ClientEncryptionPolicy withPolicyFormatVersion(int policyFormatVersion) {
        this.policyFormatVersion = policyFormatVersion;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (includedPaths() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property includedPaths in model ClientEncryptionPolicy"));
        } else {
            includedPaths().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClientEncryptionPolicy.class);
}
