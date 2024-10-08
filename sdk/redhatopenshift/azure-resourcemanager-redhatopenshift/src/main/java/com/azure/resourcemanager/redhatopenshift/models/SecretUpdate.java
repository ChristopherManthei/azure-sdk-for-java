// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redhatopenshift.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.redhatopenshift.fluent.models.SecretProperties;
import java.io.IOException;

/**
 * Secret represents a secret.
 */
@Fluent
public final class SecretUpdate implements JsonSerializable<SecretUpdate> {
    /*
     * The Secret Properties
     */
    private SecretProperties innerProperties;

    /*
     * The system meta data relating to this resource.
     */
    private SystemData systemData;

    /**
     * Creates an instance of SecretUpdate class.
     */
    public SecretUpdate() {
    }

    /**
     * Get the innerProperties property: The Secret Properties.
     * 
     * @return the innerProperties value.
     */
    private SecretProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: The system meta data relating to this resource.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the secretResources property: The Secrets Resources.
     * 
     * @return the secretResources value.
     */
    public String secretResources() {
        return this.innerProperties() == null ? null : this.innerProperties().secretResources();
    }

    /**
     * Set the secretResources property: The Secrets Resources.
     * 
     * @param secretResources the secretResources value to set.
     * @return the SecretUpdate object itself.
     */
    public SecretUpdate withSecretResources(String secretResources) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SecretProperties();
        }
        this.innerProperties().withSecretResources(secretResources);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SecretUpdate from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SecretUpdate if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the SecretUpdate.
     */
    public static SecretUpdate fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SecretUpdate deserializedSecretUpdate = new SecretUpdate();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedSecretUpdate.innerProperties = SecretProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedSecretUpdate.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSecretUpdate;
        });
    }
}
