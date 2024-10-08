// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.time.Duration;

/**
 * Deployment container liveness/readiness probe configuration.
 */
@Fluent
public final class ProbeSettings implements JsonSerializable<ProbeSettings> {
    /*
     * The number of failures to allow before returning an unhealthy status.
     */
    private Integer failureThreshold;

    /*
     * The number of successful probes before returning a healthy status.
     */
    private Integer successThreshold;

    /*
     * The probe timeout in ISO 8601 format.
     */
    private Duration timeout;

    /*
     * The length of time between probes in ISO 8601 format.
     */
    private Duration period;

    /*
     * The delay before the first probe in ISO 8601 format.
     */
    private Duration initialDelay;

    /**
     * Creates an instance of ProbeSettings class.
     */
    public ProbeSettings() {
    }

    /**
     * Get the failureThreshold property: The number of failures to allow before returning an unhealthy status.
     * 
     * @return the failureThreshold value.
     */
    public Integer failureThreshold() {
        return this.failureThreshold;
    }

    /**
     * Set the failureThreshold property: The number of failures to allow before returning an unhealthy status.
     * 
     * @param failureThreshold the failureThreshold value to set.
     * @return the ProbeSettings object itself.
     */
    public ProbeSettings withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * Get the successThreshold property: The number of successful probes before returning a healthy status.
     * 
     * @return the successThreshold value.
     */
    public Integer successThreshold() {
        return this.successThreshold;
    }

    /**
     * Set the successThreshold property: The number of successful probes before returning a healthy status.
     * 
     * @param successThreshold the successThreshold value to set.
     * @return the ProbeSettings object itself.
     */
    public ProbeSettings withSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    /**
     * Get the timeout property: The probe timeout in ISO 8601 format.
     * 
     * @return the timeout value.
     */
    public Duration timeout() {
        return this.timeout;
    }

    /**
     * Set the timeout property: The probe timeout in ISO 8601 format.
     * 
     * @param timeout the timeout value to set.
     * @return the ProbeSettings object itself.
     */
    public ProbeSettings withTimeout(Duration timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the period property: The length of time between probes in ISO 8601 format.
     * 
     * @return the period value.
     */
    public Duration period() {
        return this.period;
    }

    /**
     * Set the period property: The length of time between probes in ISO 8601 format.
     * 
     * @param period the period value to set.
     * @return the ProbeSettings object itself.
     */
    public ProbeSettings withPeriod(Duration period) {
        this.period = period;
        return this;
    }

    /**
     * Get the initialDelay property: The delay before the first probe in ISO 8601 format.
     * 
     * @return the initialDelay value.
     */
    public Duration initialDelay() {
        return this.initialDelay;
    }

    /**
     * Set the initialDelay property: The delay before the first probe in ISO 8601 format.
     * 
     * @param initialDelay the initialDelay value to set.
     * @return the ProbeSettings object itself.
     */
    public ProbeSettings withInitialDelay(Duration initialDelay) {
        this.initialDelay = initialDelay;
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
        jsonWriter.writeNumberField("failureThreshold", this.failureThreshold);
        jsonWriter.writeNumberField("successThreshold", this.successThreshold);
        jsonWriter.writeStringField("timeout", CoreUtils.durationToStringWithDays(this.timeout));
        jsonWriter.writeStringField("period", CoreUtils.durationToStringWithDays(this.period));
        jsonWriter.writeStringField("initialDelay", CoreUtils.durationToStringWithDays(this.initialDelay));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ProbeSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ProbeSettings if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ProbeSettings.
     */
    public static ProbeSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ProbeSettings deserializedProbeSettings = new ProbeSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("failureThreshold".equals(fieldName)) {
                    deserializedProbeSettings.failureThreshold = reader.getNullable(JsonReader::getInt);
                } else if ("successThreshold".equals(fieldName)) {
                    deserializedProbeSettings.successThreshold = reader.getNullable(JsonReader::getInt);
                } else if ("timeout".equals(fieldName)) {
                    deserializedProbeSettings.timeout
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("period".equals(fieldName)) {
                    deserializedProbeSettings.period
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else if ("initialDelay".equals(fieldName)) {
                    deserializedProbeSettings.initialDelay
                        = reader.getNullable(nonNullReader -> Duration.parse(nonNullReader.getString()));
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedProbeSettings;
        });
    }
}
