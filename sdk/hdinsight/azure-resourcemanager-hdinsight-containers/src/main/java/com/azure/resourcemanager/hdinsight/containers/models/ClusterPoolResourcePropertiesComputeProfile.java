// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * CLuster pool compute profile.
 */
@Fluent
public final class ClusterPoolResourcePropertiesComputeProfile extends ClusterPoolComputeProfile {
    /*
     * The number of virtual machines.
     */
    private Integer count;

    /**
     * Creates an instance of ClusterPoolResourcePropertiesComputeProfile class.
     */
    public ClusterPoolResourcePropertiesComputeProfile() {
    }

    /**
     * Get the count property: The number of virtual machines.
     * 
     * @return the count value.
     */
    @Override
    public Integer count() {
        return this.count;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterPoolResourcePropertiesComputeProfile withVmSize(String vmSize) {
        super.withVmSize(vmSize);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterPoolResourcePropertiesComputeProfile withAvailabilityZones(List<String> availabilityZones) {
        super.withAvailabilityZones(availabilityZones);
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
        jsonWriter.writeStringField("vmSize", vmSize());
        jsonWriter.writeArrayField("availabilityZones", availabilityZones(),
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPoolResourcePropertiesComputeProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPoolResourcePropertiesComputeProfile if the JsonReader was pointing to an instance
     * of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterPoolResourcePropertiesComputeProfile.
     */
    public static ClusterPoolResourcePropertiesComputeProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPoolResourcePropertiesComputeProfile deserializedClusterPoolResourcePropertiesComputeProfile
                = new ClusterPoolResourcePropertiesComputeProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("vmSize".equals(fieldName)) {
                    deserializedClusterPoolResourcePropertiesComputeProfile.withVmSize(reader.getString());
                } else if ("count".equals(fieldName)) {
                    deserializedClusterPoolResourcePropertiesComputeProfile.count
                        = reader.getNullable(JsonReader::getInt);
                } else if ("availabilityZones".equals(fieldName)) {
                    List<String> availabilityZones = reader.readArray(reader1 -> reader1.getString());
                    deserializedClusterPoolResourcePropertiesComputeProfile.withAvailabilityZones(availabilityZones);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPoolResourcePropertiesComputeProfile;
        });
    }
}
