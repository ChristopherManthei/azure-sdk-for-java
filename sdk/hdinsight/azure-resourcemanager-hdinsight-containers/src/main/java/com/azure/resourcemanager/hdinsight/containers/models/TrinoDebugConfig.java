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
 * Trino debug configuration.
 */
@Fluent
public final class TrinoDebugConfig implements JsonSerializable<TrinoDebugConfig> {
    /*
     * The flag that if enable debug or not.
     */
    private Boolean enable;

    /*
     * The debug port.
     */
    private Integer port;

    /*
     * The flag that if suspend debug or not.
     */
    private Boolean suspend;

    /**
     * Creates an instance of TrinoDebugConfig class.
     */
    public TrinoDebugConfig() {
    }

    /**
     * Get the enable property: The flag that if enable debug or not.
     * 
     * @return the enable value.
     */
    public Boolean enable() {
        return this.enable;
    }

    /**
     * Set the enable property: The flag that if enable debug or not.
     * 
     * @param enable the enable value to set.
     * @return the TrinoDebugConfig object itself.
     */
    public TrinoDebugConfig withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * Get the port property: The debug port.
     * 
     * @return the port value.
     */
    public Integer port() {
        return this.port;
    }

    /**
     * Set the port property: The debug port.
     * 
     * @param port the port value to set.
     * @return the TrinoDebugConfig object itself.
     */
    public TrinoDebugConfig withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * Get the suspend property: The flag that if suspend debug or not.
     * 
     * @return the suspend value.
     */
    public Boolean suspend() {
        return this.suspend;
    }

    /**
     * Set the suspend property: The flag that if suspend debug or not.
     * 
     * @param suspend the suspend value to set.
     * @return the TrinoDebugConfig object itself.
     */
    public TrinoDebugConfig withSuspend(Boolean suspend) {
        this.suspend = suspend;
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
        jsonWriter.writeBooleanField("enable", this.enable);
        jsonWriter.writeNumberField("port", this.port);
        jsonWriter.writeBooleanField("suspend", this.suspend);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TrinoDebugConfig from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TrinoDebugConfig if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TrinoDebugConfig.
     */
    public static TrinoDebugConfig fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TrinoDebugConfig deserializedTrinoDebugConfig = new TrinoDebugConfig();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enable".equals(fieldName)) {
                    deserializedTrinoDebugConfig.enable = reader.getNullable(JsonReader::getBoolean);
                } else if ("port".equals(fieldName)) {
                    deserializedTrinoDebugConfig.port = reader.getNullable(JsonReader::getInt);
                } else if ("suspend".equals(fieldName)) {
                    deserializedTrinoDebugConfig.suspend = reader.getNullable(JsonReader::getBoolean);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTrinoDebugConfig;
        });
    }
}
