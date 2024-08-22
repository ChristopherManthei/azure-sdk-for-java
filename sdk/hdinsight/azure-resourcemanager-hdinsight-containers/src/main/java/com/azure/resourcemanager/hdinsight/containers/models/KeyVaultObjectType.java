// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Type of key vault object: secret, key or certificate.
 */
public final class KeyVaultObjectType extends ExpandableStringEnum<KeyVaultObjectType> {
    /**
     * Static value Key for KeyVaultObjectType.
     */
    public static final KeyVaultObjectType KEY = fromString("Key");

    /**
     * Static value Secret for KeyVaultObjectType.
     */
    public static final KeyVaultObjectType SECRET = fromString("Secret");

    /**
     * Static value Certificate for KeyVaultObjectType.
     */
    public static final KeyVaultObjectType CERTIFICATE = fromString("Certificate");

    /**
     * Creates a new instance of KeyVaultObjectType value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public KeyVaultObjectType() {
    }

    /**
     * Creates or finds a KeyVaultObjectType from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding KeyVaultObjectType.
     */
    public static KeyVaultObjectType fromString(String name) {
        return fromString(name, KeyVaultObjectType.class);
    }

    /**
     * Gets known KeyVaultObjectType values.
     * 
     * @return known KeyVaultObjectType values.
     */
    public static Collection<KeyVaultObjectType> values() {
        return values(KeyVaultObjectType.class);
    }
}
