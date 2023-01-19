// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Immutability state. */
public final class ImmutabilityState extends ExpandableStringEnum<ImmutabilityState> {
    /** Static value Disabled for ImmutabilityState. */
    public static final ImmutabilityState DISABLED = fromString("Disabled");

    /** Static value Unlocked for ImmutabilityState. */
    public static final ImmutabilityState UNLOCKED = fromString("Unlocked");

    /** Static value Locked for ImmutabilityState. */
    public static final ImmutabilityState LOCKED = fromString("Locked");

    /**
     * Creates a new instance of ImmutabilityState value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ImmutabilityState() {
    }

    /**
     * Creates or finds a ImmutabilityState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ImmutabilityState.
     */
    @JsonCreator
    public static ImmutabilityState fromString(String name) {
        return fromString(name, ImmutabilityState.class);
    }

    /**
     * Gets known ImmutabilityState values.
     *
     * @return known ImmutabilityState values.
     */
    public static Collection<ImmutabilityState> values() {
        return values(ImmutabilityState.class);
    }
}