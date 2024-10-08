// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.monitor.fluent.models.AzureMonitorPrivateLinkScopeInner;
import java.io.IOException;
import java.util.List;

/**
 * Describes the list of Azure Monitor PrivateLinkScope resources.
 */
@Fluent
public final class AzureMonitorPrivateLinkScopeListResult
    implements JsonSerializable<AzureMonitorPrivateLinkScopeListResult> {
    /*
     * List of Azure Monitor PrivateLinkScope definitions.
     */
    private List<AzureMonitorPrivateLinkScopeInner> value;

    /*
     * The URI to get the next set of Azure Monitor PrivateLinkScope definitions if too many PrivateLinkScopes where
     * returned in the result set.
     */
    private String nextLink;

    /**
     * Creates an instance of AzureMonitorPrivateLinkScopeListResult class.
     */
    public AzureMonitorPrivateLinkScopeListResult() {
    }

    /**
     * Get the value property: List of Azure Monitor PrivateLinkScope definitions.
     * 
     * @return the value value.
     */
    public List<AzureMonitorPrivateLinkScopeInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Azure Monitor PrivateLinkScope definitions.
     * 
     * @param value the value value to set.
     * @return the AzureMonitorPrivateLinkScopeListResult object itself.
     */
    public AzureMonitorPrivateLinkScopeListResult withValue(List<AzureMonitorPrivateLinkScopeInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to get the next set of Azure Monitor PrivateLinkScope definitions if too many
     * PrivateLinkScopes where returned in the result set.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to get the next set of Azure Monitor PrivateLinkScope definitions if too many
     * PrivateLinkScopes where returned in the result set.
     * 
     * @param nextLink the nextLink value to set.
     * @return the AzureMonitorPrivateLinkScopeListResult object itself.
     */
    public AzureMonitorPrivateLinkScopeListResult withNextLink(String nextLink) {
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
                .log(new IllegalArgumentException(
                    "Missing required property value in model AzureMonitorPrivateLinkScopeListResult"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(AzureMonitorPrivateLinkScopeListResult.class);

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
     * Reads an instance of AzureMonitorPrivateLinkScopeListResult from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AzureMonitorPrivateLinkScopeListResult if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the AzureMonitorPrivateLinkScopeListResult.
     */
    public static AzureMonitorPrivateLinkScopeListResult fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AzureMonitorPrivateLinkScopeListResult deserializedAzureMonitorPrivateLinkScopeListResult
                = new AzureMonitorPrivateLinkScopeListResult();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("value".equals(fieldName)) {
                    List<AzureMonitorPrivateLinkScopeInner> value
                        = reader.readArray(reader1 -> AzureMonitorPrivateLinkScopeInner.fromJson(reader1));
                    deserializedAzureMonitorPrivateLinkScopeListResult.value = value;
                } else if ("nextLink".equals(fieldName)) {
                    deserializedAzureMonitorPrivateLinkScopeListResult.nextLink = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAzureMonitorPrivateLinkScopeListResult;
        });
    }
}
