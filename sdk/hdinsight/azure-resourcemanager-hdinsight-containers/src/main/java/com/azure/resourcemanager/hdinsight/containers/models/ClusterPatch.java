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
import java.util.Map;

/**
 * The patch for a cluster.
 */
@Fluent
public final class ClusterPatch implements JsonSerializable<ClusterPatch> {
    /*
     * Define cluster patch specific properties.
     */
    private ClusterPatchProperties properties;

    /*
     * Resource tags.
     */
    private Map<String, String> tags;

    /**
     * Creates an instance of ClusterPatch class.
     */
    public ClusterPatch() {
    }

    /**
     * Get the properties property: Define cluster patch specific properties.
     * 
     * @return the properties value.
     */
    public ClusterPatchProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Define cluster patch specific properties.
     * 
     * @param properties the properties value to set.
     * @return the ClusterPatch object itself.
     */
    public ClusterPatch withProperties(ClusterPatchProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Resource tags.
     * 
     * @param tags the tags value to set.
     * @return the ClusterPatch object itself.
     */
    public ClusterPatch withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPatch from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPatch if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterPatch.
     */
    public static ClusterPatch fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPatch deserializedClusterPatch = new ClusterPatch();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedClusterPatch.properties = ClusterPatchProperties.fromJson(reader);
                } else if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedClusterPatch.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPatch;
        });
    }
}
