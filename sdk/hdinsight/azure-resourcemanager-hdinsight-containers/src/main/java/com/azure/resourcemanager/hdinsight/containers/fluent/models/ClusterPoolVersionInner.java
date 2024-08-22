// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolVersionProperties;
import java.io.IOException;

/**
 * Available cluster pool version.
 */
@Fluent
public final class ClusterPoolVersionInner extends ProxyResource {
    /*
     * Cluster pool version properties.
     */
    private ClusterPoolVersionProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    private SystemData systemData;

    /*
     * Fully qualified resource Id for the resource.
     */
    private String id;

    /*
     * The name of the resource.
     */
    private String name;

    /*
     * The type of the resource.
     */
    private String type;

    /**
     * Creates an instance of ClusterPoolVersionInner class.
     */
    public ClusterPoolVersionInner() {
    }

    /**
     * Get the properties property: Cluster pool version properties.
     * 
     * @return the properties value.
     */
    public ClusterPoolVersionProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Cluster pool version properties.
     * 
     * @param properties the properties value to set.
     * @return the ClusterPoolVersionInner object itself.
     */
    public ClusterPoolVersionInner withProperties(ClusterPoolVersionProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    @Override
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The name of the resource.
     * 
     * @return the name value.
     */
    @Override
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: The type of the resource.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
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
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPoolVersionInner from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPoolVersionInner if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterPoolVersionInner.
     */
    public static ClusterPoolVersionInner fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPoolVersionInner deserializedClusterPoolVersionInner = new ClusterPoolVersionInner();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("id".equals(fieldName)) {
                    deserializedClusterPoolVersionInner.id = reader.getString();
                } else if ("name".equals(fieldName)) {
                    deserializedClusterPoolVersionInner.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedClusterPoolVersionInner.type = reader.getString();
                } else if ("properties".equals(fieldName)) {
                    deserializedClusterPoolVersionInner.properties = ClusterPoolVersionProperties.fromJson(reader);
                } else if ("systemData".equals(fieldName)) {
                    deserializedClusterPoolVersionInner.systemData = SystemData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPoolVersionInner;
        });
    }
}
