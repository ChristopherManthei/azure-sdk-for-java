// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterPoolInner;
import java.io.IOException;
import java.util.List;

/**
 * The list cluster pools operation response.
 */
@Fluent
public final class ClusterPoolListResult implements JsonSerializable<ClusterPoolListResult> {
    /*
     * The list of cluster pools.
     */
    private List<ClusterPoolInner> value;

    /*
     * The link (url) to the next page of results.
     */
    private String nextLink;

    /**
     * Creates an instance of ClusterPoolListResult class.
     */
    public ClusterPoolListResult() {
    }

    /**
     * Get the value property: The list of cluster pools.
     * 
     * @return the value value.
     */
    public List<ClusterPoolInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of cluster pools.
     * 
     * @param value the value value to set.
     * @return the ClusterPoolListResult object itself.
     */
    public ClusterPoolListResult withValue(List<ClusterPoolInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link (url) to the next page of results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPoolListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPoolListResult if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterPoolListResult.
     */
    public static ClusterPoolListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPoolListResult deserializedClusterPoolListResult = new ClusterPoolListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ClusterPoolInner> value = reader.readArray(reader1 -> ClusterPoolInner.fromJson(reader1));
                    deserializedClusterPoolListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedClusterPoolListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPoolListResult;
        });
    }
}
