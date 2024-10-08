// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.resourcemanager.computeschedule.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * These describe errors that occur at the resource level.
 */
@Immutable
public final class ResourceOperationError implements JsonSerializable<ResourceOperationError> {
    /*
     * Code for the error eg 404, 500
     */
    private String errorCode;

    /*
     * Detailed message about the error
     */
    private String errorDetails;

    /**
     * Creates an instance of ResourceOperationError class.
     */
    private ResourceOperationError() {
    }

    /**
     * Get the errorCode property: Code for the error eg 404, 500.
     * 
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Get the errorDetails property: Detailed message about the error.
     * 
     * @return the errorDetails value.
     */
    public String errorDetails() {
        return this.errorDetails;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (errorCode() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property errorCode in model ResourceOperationError"));
        }
        if (errorDetails() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property errorDetails in model ResourceOperationError"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceOperationError.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("errorCode", this.errorCode);
        jsonWriter.writeStringField("errorDetails", this.errorDetails);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceOperationError from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceOperationError if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResourceOperationError.
     */
    public static ResourceOperationError fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceOperationError deserializedResourceOperationError = new ResourceOperationError();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("errorCode".equals(fieldName)) {
                    deserializedResourceOperationError.errorCode = reader.getString();
                } else if ("errorDetails".equals(fieldName)) {
                    deserializedResourceOperationError.errorDetails = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceOperationError;
        });
    }
}
