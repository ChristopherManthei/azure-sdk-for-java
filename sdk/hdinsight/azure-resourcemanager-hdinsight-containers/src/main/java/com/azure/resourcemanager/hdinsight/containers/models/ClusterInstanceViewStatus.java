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

/**
 * Status of the instance view.
 */
@Fluent
public class ClusterInstanceViewStatus implements JsonSerializable<ClusterInstanceViewStatus> {
    /*
     * The cluster ready status
     */
    private String ready;

    /*
     * The status reason.
     */
    private String reason;

    /*
     * The additional message.
     */
    private String message;

    /**
     * Creates an instance of ClusterInstanceViewStatus class.
     */
    public ClusterInstanceViewStatus() {
    }

    /**
     * Get the ready property: The cluster ready status.
     * 
     * @return the ready value.
     */
    public String ready() {
        return this.ready;
    }

    /**
     * Set the ready property: The cluster ready status.
     * 
     * @param ready the ready value to set.
     * @return the ClusterInstanceViewStatus object itself.
     */
    public ClusterInstanceViewStatus withReady(String ready) {
        this.ready = ready;
        return this;
    }

    /**
     * Get the reason property: The status reason.
     * 
     * @return the reason value.
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason property: The status reason.
     * 
     * @param reason the reason value to set.
     * @return the ClusterInstanceViewStatus object itself.
     */
    public ClusterInstanceViewStatus withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message property: The additional message.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: The additional message.
     * 
     * @param message the message value to set.
     * @return the ClusterInstanceViewStatus object itself.
     */
    public ClusterInstanceViewStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ready() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property ready in model ClusterInstanceViewStatus"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterInstanceViewStatus.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("ready", this.ready);
        jsonWriter.writeStringField("reason", this.reason);
        jsonWriter.writeStringField("message", this.message);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterInstanceViewStatus from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterInstanceViewStatus if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterInstanceViewStatus.
     */
    public static ClusterInstanceViewStatus fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterInstanceViewStatus deserializedClusterInstanceViewStatus = new ClusterInstanceViewStatus();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("ready".equals(fieldName)) {
                    deserializedClusterInstanceViewStatus.ready = reader.getString();
                } else if ("reason".equals(fieldName)) {
                    deserializedClusterInstanceViewStatus.reason = reader.getString();
                } else if ("message".equals(fieldName)) {
                    deserializedClusterInstanceViewStatus.message = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterInstanceViewStatus;
        });
    }
}
