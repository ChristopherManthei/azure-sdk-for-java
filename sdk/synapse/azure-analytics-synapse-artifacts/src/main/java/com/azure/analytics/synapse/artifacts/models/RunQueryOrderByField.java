// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Parameter name to be used for order by. The allowed parameters to order by for pipeline runs are PipelineName,
 * RunStart, RunEnd and Status; for activity runs are ActivityName, ActivityRunStart, ActivityRunEnd and Status; for
 * trigger runs are TriggerName, TriggerRunTimestamp and Status.
 */
public final class RunQueryOrderByField extends ExpandableStringEnum<RunQueryOrderByField> {
    /** Static value RunStart for RunQueryOrderByField. */
    public static final RunQueryOrderByField RUN_START = fromString("RunStart");

    /** Static value RunEnd for RunQueryOrderByField. */
    public static final RunQueryOrderByField RUN_END = fromString("RunEnd");

    /** Static value PipelineName for RunQueryOrderByField. */
    public static final RunQueryOrderByField PIPELINE_NAME = fromString("PipelineName");

    /** Static value Status for RunQueryOrderByField. */
    public static final RunQueryOrderByField STATUS = fromString("Status");

    /** Static value ActivityName for RunQueryOrderByField. */
    public static final RunQueryOrderByField ACTIVITY_NAME = fromString("ActivityName");

    /** Static value ActivityRunStart for RunQueryOrderByField. */
    public static final RunQueryOrderByField ACTIVITY_RUN_START = fromString("ActivityRunStart");

    /** Static value ActivityRunEnd for RunQueryOrderByField. */
    public static final RunQueryOrderByField ACTIVITY_RUN_END = fromString("ActivityRunEnd");

    /** Static value TriggerName for RunQueryOrderByField. */
    public static final RunQueryOrderByField TRIGGER_NAME = fromString("TriggerName");

    /** Static value TriggerRunTimestamp for RunQueryOrderByField. */
    public static final RunQueryOrderByField TRIGGER_RUN_TIMESTAMP = fromString("TriggerRunTimestamp");

    /**
     * Creates or finds a RunQueryOrderByField from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding RunQueryOrderByField.
     */
    @JsonCreator
    public static RunQueryOrderByField fromString(String name) {
        return fromString(name, RunQueryOrderByField.class);
    }

    /**
     * Gets known RunQueryOrderByField values.
     *
     * @return known RunQueryOrderByField values.
     */
    public static Collection<RunQueryOrderByField> values() {
        return values(RunQueryOrderByField.class);
    }
}
