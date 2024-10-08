// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * How the data that is collected should be combined over time.
 */
@Fluent
public final class ManagementEventAggregationCondition
    implements JsonSerializable<ManagementEventAggregationCondition> {
    /*
     * the condition operator.
     */
    private ConditionOperator operator;

    /*
     * The threshold value that activates the alert.
     */
    private Double threshold;

    /*
     * the period of time (in ISO 8601 duration format) that is used to monitor alert activity based on the threshold.
     * If specified then it must be between 5 minutes and 1 day.
     */
    private Duration windowSize;

    /**
     * Creates an instance of ManagementEventAggregationCondition class.
     */
    public ManagementEventAggregationCondition() {
    }

    /**
     * Get the operator property: the condition operator.
     * 
     * @return the operator value.
     */
    public ConditionOperator operator() {
        return this.operator;
    }

    /**
     * Set the operator property: the condition operator.
     * 
     * @param operator the operator value to set.
     * @return the ManagementEventAggregationCondition object itself.
     */
    public ManagementEventAggregationCondition withOperator(ConditionOperator operator) {
        this.operator = operator;
        return this;
    }

    /**
     * Get the threshold property: The threshold value that activates the alert.
     * 
     * @return the threshold value.
     */
    public Double threshold() {
        return this.threshold;
    }

    /**
     * Set the threshold property: The threshold value that activates the alert.
     * 
     * @param threshold the threshold value to set.
     * @return the ManagementEventAggregationCondition object itself.
     */
    public ManagementEventAggregationCondition withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * Get the windowSize property: the period of time (in ISO 8601 duration format) that is used to monitor alert
     * activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     * @return the windowSize value.
     */
    public Duration windowSize() {
        return this.windowSize;
    }

    /**
     * Set the windowSize property: the period of time (in ISO 8601 duration format) that is used to monitor alert
     * activity based on the threshold. If specified then it must be between 5 minutes and 1 day.
     * 
     * @param windowSize the windowSize value to set.
     * @return the ManagementEventAggregationCondition object itself.
     */
    public ManagementEventAggregationCondition withWindowSize(Duration windowSize) {
        this.windowSize = windowSize;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("operator", this.operator == null ? null : this.operator.toString());
        jsonWriter.writeNumberField("threshold", this.threshold);
        jsonWriter.writeStringField("windowSize", CoreUtils.durationToStringWithDays(this.windowSize));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ManagementEventAggregationCondition from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ManagementEventAggregationCondition if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ManagementEventAggregationCondition.
     */
    public static ManagementEventAggregationCondition fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ManagementEventAggregationCondition deserializedManagementEventAggregationCondition
                = new ManagementEventAggregationCondition();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("operator".equals(fieldName)) {
                    deserializedManagementEventAggregationCondition.operator
                        = ConditionOperator.fromString(reader.getString());
                } else if ("threshold".equals(fieldName)) {
                    deserializedManagementEventAggregationCondition.threshold
                        = reader.getNullable(JsonReader::getDouble);
                } else if ("windowSize".equals(fieldName)) {
                    deserializedManagementEventAggregationCondition.windowSize
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedManagementEventAggregationCondition;
        });
    }
}
