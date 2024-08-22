// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Details of check name availability request body.
 */
@Fluent
public final class NameAvailabilityParameters implements JsonSerializable<NameAvailabilityParameters> {
    /*
     * Name for checking availability.
     */
    private String name;

    /*
     * The resource type in Microsoft.HDInsight.
     */
    private String type;

    /**
     * Creates an instance of NameAvailabilityParameters class.
     */
    public NameAvailabilityParameters() {
    }

    /**
     * Get the name property: Name for checking availability.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name for checking availability.
     * 
     * @param name the name value to set.
     * @return the NameAvailabilityParameters object itself.
     */
    public NameAvailabilityParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type in Microsoft.HDInsight.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type property: The resource type in Microsoft.HDInsight.
     * 
     * @param type the type value to set.
     * @return the NameAvailabilityParameters object itself.
     */
    public NameAvailabilityParameters withType(String type) {
        this.type = type;
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
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of NameAvailabilityParameters from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of NameAvailabilityParameters if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the NameAvailabilityParameters.
     */
    public static NameAvailabilityParameters fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            NameAvailabilityParameters deserializedNameAvailabilityParameters = new NameAvailabilityParameters();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedNameAvailabilityParameters.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedNameAvailabilityParameters.type = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedNameAvailabilityParameters;
        });
    }
}
