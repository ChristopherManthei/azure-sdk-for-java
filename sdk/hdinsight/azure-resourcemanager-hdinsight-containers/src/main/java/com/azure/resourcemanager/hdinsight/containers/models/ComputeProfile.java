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
import java.io.IOException;
import java.util.List;

/**
 * The compute profile.
 */
@Fluent
public final class ComputeProfile implements JsonSerializable<ComputeProfile> {
    /*
     * The nodes definitions.
     */
    private List<NodeProfile> nodes;

    /*
     * The list of Availability zones to use for AKS VMSS nodes.
     */
    private List<String> availabilityZones;

    /**
     * Creates an instance of ComputeProfile class.
     */
    public ComputeProfile() {
    }

    /**
     * Get the nodes property: The nodes definitions.
     * 
     * @return the nodes value.
     */
    public List<NodeProfile> nodes() {
        return this.nodes;
    }

    /**
     * Set the nodes property: The nodes definitions.
     * 
     * @param nodes the nodes value to set.
     * @return the ComputeProfile object itself.
     */
    public ComputeProfile withNodes(List<NodeProfile> nodes) {
        this.nodes = nodes;
        return this;
    }

    /**
     * Get the availabilityZones property: The list of Availability zones to use for AKS VMSS nodes.
     * 
     * @return the availabilityZones value.
     */
    public List<String> availabilityZones() {
        return this.availabilityZones;
    }

    /**
     * Set the availabilityZones property: The list of Availability zones to use for AKS VMSS nodes.
     * 
     * @param availabilityZones the availabilityZones value to set.
     * @return the ComputeProfile object itself.
     */
    public ComputeProfile withAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (nodes() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property nodes in model ComputeProfile"));
        } else {
            nodes().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ComputeProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("nodes", this.nodes, (writer, element) -> writer.writeJson(element));
        jsonWriter.writeArrayField("availabilityZones", this.availabilityZones,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ComputeProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ComputeProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ComputeProfile.
     */
    public static ComputeProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ComputeProfile deserializedComputeProfile = new ComputeProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("nodes".equals(fieldName)) {
                    List<NodeProfile> nodes = reader.readArray(reader1 -> NodeProfile.fromJson(reader1));
                    deserializedComputeProfile.nodes = nodes;
                } else if ("availabilityZones".equals(fieldName)) {
                    List<String> availabilityZones = reader.readArray(reader1 -> reader1.getString());
                    deserializedComputeProfile.availabilityZones = availabilityZones;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedComputeProfile;
        });
    }
}
