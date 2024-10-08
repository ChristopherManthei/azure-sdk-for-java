// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ServiceManagedResourcesSettings model.
 */
@Fluent
public final class ServiceManagedResourcesSettings implements JsonSerializable<ServiceManagedResourcesSettings> {
    /*
     * The settings for the service managed cosmosdb account.
     */
    private CosmosDbSettings cosmosDb;

    /**
     * Creates an instance of ServiceManagedResourcesSettings class.
     */
    public ServiceManagedResourcesSettings() {
    }

    /**
     * Get the cosmosDb property: The settings for the service managed cosmosdb account.
     * 
     * @return the cosmosDb value.
     */
    public CosmosDbSettings cosmosDb() {
        return this.cosmosDb;
    }

    /**
     * Set the cosmosDb property: The settings for the service managed cosmosdb account.
     * 
     * @param cosmosDb the cosmosDb value to set.
     * @return the ServiceManagedResourcesSettings object itself.
     */
    public ServiceManagedResourcesSettings withCosmosDb(CosmosDbSettings cosmosDb) {
        this.cosmosDb = cosmosDb;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (cosmosDb() != null) {
            cosmosDb().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("cosmosDb", this.cosmosDb);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ServiceManagedResourcesSettings from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ServiceManagedResourcesSettings if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ServiceManagedResourcesSettings.
     */
    public static ServiceManagedResourcesSettings fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ServiceManagedResourcesSettings deserializedServiceManagedResourcesSettings
                = new ServiceManagedResourcesSettings();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("cosmosDb".equals(fieldName)) {
                    deserializedServiceManagedResourcesSettings.cosmosDb = CosmosDbSettings.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedServiceManagedResourcesSettings;
        });
    }
}
