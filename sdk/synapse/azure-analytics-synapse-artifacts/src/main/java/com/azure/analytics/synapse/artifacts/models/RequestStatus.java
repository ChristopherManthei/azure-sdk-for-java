// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Enumerates possible request statuses. */
public final class RequestStatus extends ExpandableStringEnum<RequestStatus> {
    /** Static value Running for RequestStatus. */
    public static final RequestStatus RUNNING = fromString("Running");

    /** Static value Completed for RequestStatus. */
    public static final RequestStatus COMPLETED = fromString("Completed");

    /** Static value Failed for RequestStatus. */
    public static final RequestStatus FAILED = fromString("Failed");

    /**
     * Creates or finds a RequestStatus from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RequestStatus.
     */
    @JsonCreator
    public static RequestStatus fromString(String name) {
        return fromString(name, RequestStatus.class);
    }

    /**
     * Gets known RequestStatus values.
     *
     * @return known RequestStatus values.
     */
    public static Collection<RequestStatus> values() {
        return values(RequestStatus.class);
    }
}
