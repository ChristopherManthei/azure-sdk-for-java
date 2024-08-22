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
 * Tags object for patch operations.
 */
@Fluent
public final class TagsObject implements JsonSerializable<TagsObject> {
    /*
     * Resource tags.
     */
    private Map<String, String> tags;

    /**
     * Creates an instance of TagsObject class.
     */
    public TagsObject() {
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
     * @return the TagsObject object itself.
     */
    public TagsObject withTags(Map<String, String> tags) {
        this.tags = tags;
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
        jsonWriter.writeMapField("tags", this.tags, (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TagsObject from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TagsObject if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IOException If an error occurs while reading the TagsObject.
     */
    public static TagsObject fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TagsObject deserializedTagsObject = new TagsObject();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tags".equals(fieldName)) {
                    Map<String, String> tags = reader.readMap(reader1 -> reader1.getString());
                    deserializedTagsObject.tags = tags;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTagsObject;
        });
    }
}
