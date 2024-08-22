// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Profile of load based Autoscale.
 */
@Fluent
public final class LoadBasedConfig implements JsonSerializable<LoadBasedConfig> {
    /*
     * User needs to set the minimum number of nodes for load based scaling, the load based scaling will use this to
     * scale up and scale down between minimum and maximum number of nodes.
     */
    private int minNodes;

    /*
     * User needs to set the maximum number of nodes for load based scaling, the load based scaling will use this to
     * scale up and scale down between minimum and maximum number of nodes.
     */
    private int maxNodes;

    /*
     * User can specify the poll interval, this is the time period (in seconds) after which scaling metrics are polled
     * for triggering a scaling operation.
     */
    private Integer pollInterval;

    /*
     * This is a cool down period, this is a time period in seconds, which determines the amount of time that must
     * elapse between a scaling activity started by a rule and the start of the next scaling activity, regardless of the
     * rule that triggers it. The default value is 300 seconds.
     */
    private Integer cooldownPeriod;

    /*
     * The scaling rules.
     */
    private List<ScalingRule> scalingRules;

    /**
     * Creates an instance of LoadBasedConfig class.
     */
    public LoadBasedConfig() {
    }

    /**
     * Get the minNodes property: User needs to set the minimum number of nodes for load based scaling, the load based
     * scaling will use this to scale up and scale down between minimum and maximum number of nodes.
     * 
     * @return the minNodes value.
     */
    public int minNodes() {
        return this.minNodes;
    }

    /**
     * Set the minNodes property: User needs to set the minimum number of nodes for load based scaling, the load based
     * scaling will use this to scale up and scale down between minimum and maximum number of nodes.
     * 
     * @param minNodes the minNodes value to set.
     * @return the LoadBasedConfig object itself.
     */
    public LoadBasedConfig withMinNodes(int minNodes) {
        this.minNodes = minNodes;
        return this;
    }

    /**
     * Get the maxNodes property: User needs to set the maximum number of nodes for load based scaling, the load based
     * scaling will use this to scale up and scale down between minimum and maximum number of nodes.
     * 
     * @return the maxNodes value.
     */
    public int maxNodes() {
        return this.maxNodes;
    }

    /**
     * Set the maxNodes property: User needs to set the maximum number of nodes for load based scaling, the load based
     * scaling will use this to scale up and scale down between minimum and maximum number of nodes.
     * 
     * @param maxNodes the maxNodes value to set.
     * @return the LoadBasedConfig object itself.
     */
    public LoadBasedConfig withMaxNodes(int maxNodes) {
        this.maxNodes = maxNodes;
        return this;
    }

    /**
     * Get the pollInterval property: User can specify the poll interval, this is the time period (in seconds) after
     * which scaling metrics are polled for triggering a scaling operation.
     * 
     * @return the pollInterval value.
     */
    public Integer pollInterval() {
        return this.pollInterval;
    }

    /**
     * Set the pollInterval property: User can specify the poll interval, this is the time period (in seconds) after
     * which scaling metrics are polled for triggering a scaling operation.
     * 
     * @param pollInterval the pollInterval value to set.
     * @return the LoadBasedConfig object itself.
     */
    public LoadBasedConfig withPollInterval(Integer pollInterval) {
        this.pollInterval = pollInterval;
        return this;
    }

    /**
     * Get the cooldownPeriod property: This is a cool down period, this is a time period in seconds, which determines
     * the amount of time that must elapse between a scaling activity started by a rule and the start of the next
     * scaling activity, regardless of the rule that triggers it. The default value is 300 seconds.
     * 
     * @return the cooldownPeriod value.
     */
    public Integer cooldownPeriod() {
        return this.cooldownPeriod;
    }

    /**
     * Set the cooldownPeriod property: This is a cool down period, this is a time period in seconds, which determines
     * the amount of time that must elapse between a scaling activity started by a rule and the start of the next
     * scaling activity, regardless of the rule that triggers it. The default value is 300 seconds.
     * 
     * @param cooldownPeriod the cooldownPeriod value to set.
     * @return the LoadBasedConfig object itself.
     */
    public LoadBasedConfig withCooldownPeriod(Integer cooldownPeriod) {
        this.cooldownPeriod = cooldownPeriod;
        return this;
    }

    /**
     * Get the scalingRules property: The scaling rules.
     * 
     * @return the scalingRules value.
     */
    public List<ScalingRule> scalingRules() {
        return this.scalingRules;
    }

    /**
     * Set the scalingRules property: The scaling rules.
     * 
     * @param scalingRules the scalingRules value to set.
     * @return the LoadBasedConfig object itself.
     */
    public LoadBasedConfig withScalingRules(List<ScalingRule> scalingRules) {
        this.scalingRules = scalingRules;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (scalingRules() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property scalingRules in model LoadBasedConfig"));
        } else {
            scalingRules().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(LoadBasedConfig.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("minNodes", this.minNodes);
        jsonWriter.writeIntField("maxNodes", this.maxNodes);
        jsonWriter.writeArrayField("scalingRules", this.scalingRules, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeNumberField("pollInterval", this.pollInterval);
        jsonWriter.writeNumberField("cooldownPeriod", this.cooldownPeriod);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LoadBasedConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of LoadBasedConfig if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the LoadBasedConfig.
     */
    public static LoadBasedConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            LoadBasedConfig deserializedLoadBasedConfig = new LoadBasedConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("minNodes".equals(fieldName)) {
                    deserializedLoadBasedConfig.minNodes = reader.getInt();
                } else if ("maxNodes".equals(fieldName)) {
                    deserializedLoadBasedConfig.maxNodes = reader.getInt();
                } else if ("scalingRules".equals(fieldName)) {
                    List<ScalingRule> scalingRules = reader.readArray(reader1 -> ScalingRule.fromJson(reader1));
                    deserializedLoadBasedConfig.scalingRules = scalingRules;
                } else if ("pollInterval".equals(fieldName)) {
                    deserializedLoadBasedConfig.pollInterval = reader.getNullable(JsonReader::getInt);
                } else if ("cooldownPeriod".equals(fieldName)) {
                    deserializedLoadBasedConfig.cooldownPeriod = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedLoadBasedConfig;
        });
    }
}
