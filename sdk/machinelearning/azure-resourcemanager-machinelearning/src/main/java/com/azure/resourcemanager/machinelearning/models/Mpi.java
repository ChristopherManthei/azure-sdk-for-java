// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * MPI distribution configuration.
 */
@Fluent
public final class Mpi extends DistributionConfiguration {
    /*
     * [Required] Specifies the type of distribution framework.
     */
    private DistributionType distributionType = DistributionType.MPI;

    /*
     * Number of processes per MPI node.
     */
    private Integer processCountPerInstance;

    /**
     * Creates an instance of Mpi class.
     */
    public Mpi() {
    }

    /**
     * Get the distributionType property: [Required] Specifies the type of distribution framework.
     * 
     * @return the distributionType value.
     */
    @Override
    public DistributionType distributionType() {
        return this.distributionType;
    }

    /**
     * Get the processCountPerInstance property: Number of processes per MPI node.
     * 
     * @return the processCountPerInstance value.
     */
    public Integer processCountPerInstance() {
        return this.processCountPerInstance;
    }

    /**
     * Set the processCountPerInstance property: Number of processes per MPI node.
     * 
     * @param processCountPerInstance the processCountPerInstance value to set.
     * @return the Mpi object itself.
     */
    public Mpi withProcessCountPerInstance(Integer processCountPerInstance) {
        this.processCountPerInstance = processCountPerInstance;
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
        jsonWriter.writeStringField("distributionType",
            this.distributionType == null ? null : this.distributionType.toString());
        jsonWriter.writeNumberField("processCountPerInstance", this.processCountPerInstance);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of Mpi from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of Mpi if the JsonReader was pointing to an instance of it, or null if it was pointing to
     * JSON null.
     * @throws IOException If an error occurs while reading the Mpi.
     */
    public static Mpi fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            Mpi deserializedMpi = new Mpi();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("distributionType".equals(fieldName)) {
                    deserializedMpi.distributionType = DistributionType.fromString(reader.getString());
                } else if ("processCountPerInstance".equals(fieldName)) {
                    deserializedMpi.processCountPerInstance = reader.getNullable(JsonReader::getInt);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMpi;
        });
    }
}
