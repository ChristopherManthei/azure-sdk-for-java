// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Cluster pool log analytics profile to enable OMS agent for AKS cluster.
 */
@Fluent
public final class ClusterPoolResourcePropertiesLogAnalyticsProfile extends ClusterPoolLogAnalyticsProfile {
    /**
     * Creates an instance of ClusterPoolResourcePropertiesLogAnalyticsProfile class.
     */
    public ClusterPoolResourcePropertiesLogAnalyticsProfile() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterPoolResourcePropertiesLogAnalyticsProfile withEnabled(boolean enabled) {
        super.withEnabled(enabled);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterPoolResourcePropertiesLogAnalyticsProfile withWorkspaceId(String workspaceId) {
        super.withWorkspaceId(workspaceId);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeBooleanField("enabled", enabled());
        jsonWriter.writeStringField("workspaceId", workspaceId());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPoolResourcePropertiesLogAnalyticsProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPoolResourcePropertiesLogAnalyticsProfile if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterPoolResourcePropertiesLogAnalyticsProfile.
     */
    public static ClusterPoolResourcePropertiesLogAnalyticsProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPoolResourcePropertiesLogAnalyticsProfile deserializedClusterPoolResourcePropertiesLogAnalyticsProfile
                = new ClusterPoolResourcePropertiesLogAnalyticsProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("enabled".equals(fieldName)) {
                    deserializedClusterPoolResourcePropertiesLogAnalyticsProfile.withEnabled(reader.getBoolean());
                } else if ("workspaceId".equals(fieldName)) {
                    deserializedClusterPoolResourcePropertiesLogAnalyticsProfile.withWorkspaceId(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPoolResourcePropertiesLogAnalyticsProfile;
        });
    }
}
