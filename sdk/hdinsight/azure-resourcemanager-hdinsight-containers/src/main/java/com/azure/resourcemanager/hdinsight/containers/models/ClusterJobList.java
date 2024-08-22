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
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterJobInner;
import java.io.IOException;
import java.util.List;

/**
 * Collection of cluster job.
 */
@Fluent
public final class ClusterJobList implements JsonSerializable<ClusterJobList> {
    /*
     * Collection of cluster job.
     */
    private List<ClusterJobInner> value;

    /*
     * The Url of next result page.
     */
    private String nextLink;

    /**
     * Creates an instance of ClusterJobList class.
     */
    public ClusterJobList() {
    }

    /**
     * Get the value property: Collection of cluster job.
     * 
     * @return the value value.
     */
    public List<ClusterJobInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Collection of cluster job.
     * 
     * @param value the value value to set.
     * @return the ClusterJobList object itself.
     */
    public ClusterJobList withValue(List<ClusterJobInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The Url of next result page.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The Url of next result page.
     * 
     * @param nextLink the nextLink value to set.
     * @return the ClusterJobList object itself.
     */
    public ClusterJobList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property value in model ClusterJobList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ClusterJobList.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("value", this.value, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeStringField("nextLink", this.nextLink);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterJobList from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterJobList if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterJobList.
     */
    public static ClusterJobList fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterJobList deserializedClusterJobList = new ClusterJobList();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<ClusterJobInner> value = reader.readArray(reader1 -> ClusterJobInner.fromJson(reader1));
                    deserializedClusterJobList.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedClusterJobList.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterJobList;
        });
    }
}
