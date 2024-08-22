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
import java.util.List;

/**
 * Kafka bootstrap server and broker related connectivity endpoints.
 */
@Fluent
public final class KafkaConnectivityEndpoints implements JsonSerializable<KafkaConnectivityEndpoints> {
    /*
     * bootstrap server connectivity endpoint.
     */
    private String bootstrapServerEndpoint;

    /*
     * Kafka broker endpoint list.
     */
    private List<String> brokerEndpoints;

    /**
     * Creates an instance of KafkaConnectivityEndpoints class.
     */
    public KafkaConnectivityEndpoints() {
    }

    /**
     * Get the bootstrapServerEndpoint property: bootstrap server connectivity endpoint.
     * 
     * @return the bootstrapServerEndpoint value.
     */
    public String bootstrapServerEndpoint() {
        return this.bootstrapServerEndpoint;
    }

    /**
     * Set the bootstrapServerEndpoint property: bootstrap server connectivity endpoint.
     * 
     * @param bootstrapServerEndpoint the bootstrapServerEndpoint value to set.
     * @return the KafkaConnectivityEndpoints object itself.
     */
    public KafkaConnectivityEndpoints withBootstrapServerEndpoint(String bootstrapServerEndpoint) {
        this.bootstrapServerEndpoint = bootstrapServerEndpoint;
        return this;
    }

    /**
     * Get the brokerEndpoints property: Kafka broker endpoint list.
     * 
     * @return the brokerEndpoints value.
     */
    public List<String> brokerEndpoints() {
        return this.brokerEndpoints;
    }

    /**
     * Set the brokerEndpoints property: Kafka broker endpoint list.
     * 
     * @param brokerEndpoints the brokerEndpoints value to set.
     * @return the KafkaConnectivityEndpoints object itself.
     */
    public KafkaConnectivityEndpoints withBrokerEndpoints(List<String> brokerEndpoints) {
        this.brokerEndpoints = brokerEndpoints;
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
        jsonWriter.writeStringField("bootstrapServerEndpoint", this.bootstrapServerEndpoint);
        jsonWriter.writeArrayField("brokerEndpoints", this.brokerEndpoints,
            (writer, element) -> writer.writeString(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of KafkaConnectivityEndpoints from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of KafkaConnectivityEndpoints if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the KafkaConnectivityEndpoints.
     */
    public static KafkaConnectivityEndpoints fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            KafkaConnectivityEndpoints deserializedKafkaConnectivityEndpoints = new KafkaConnectivityEndpoints();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("bootstrapServerEndpoint".equals(fieldName)) {
                    deserializedKafkaConnectivityEndpoints.bootstrapServerEndpoint = reader.getString();
                } else if ("brokerEndpoints".equals(fieldName)) {
                    List<String> brokerEndpoints = reader.readArray(reader1 -> reader1.getString());
                    deserializedKafkaConnectivityEndpoints.brokerEndpoints = brokerEndpoints;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedKafkaConnectivityEndpoints;
        });
    }
}
