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

/**
 * Web connectivity endpoint details.
 */
@Fluent
public class WebConnectivityEndpoint implements JsonSerializable<WebConnectivityEndpoint> {
    /*
     * Web connectivity endpoint.
     */
    private String fqdn;

    /*
     * Private web connectivity endpoint. This property will only be returned when enableInternalIngress is true.
     */
    private String privateFqdn;

    /**
     * Creates an instance of WebConnectivityEndpoint class.
     */
    public WebConnectivityEndpoint() {
    }

    /**
     * Get the fqdn property: Web connectivity endpoint.
     * 
     * @return the fqdn value.
     */
    public String fqdn() {
        return this.fqdn;
    }

    /**
     * Set the fqdn property: Web connectivity endpoint.
     * 
     * @param fqdn the fqdn value to set.
     * @return the WebConnectivityEndpoint object itself.
     */
    public WebConnectivityEndpoint withFqdn(String fqdn) {
        this.fqdn = fqdn;
        return this;
    }

    /**
     * Get the privateFqdn property: Private web connectivity endpoint. This property will only be returned when
     * enableInternalIngress is true.
     * 
     * @return the privateFqdn value.
     */
    public String privateFqdn() {
        return this.privateFqdn;
    }

    /**
     * Set the privateFqdn property: Private web connectivity endpoint. This property will only be returned when
     * enableInternalIngress is true.
     * 
     * @param privateFqdn the privateFqdn value to set.
     * @return the WebConnectivityEndpoint object itself.
     */
    public WebConnectivityEndpoint withPrivateFqdn(String privateFqdn) {
        this.privateFqdn = privateFqdn;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (fqdn() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property fqdn in model WebConnectivityEndpoint"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(WebConnectivityEndpoint.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("fqdn", this.fqdn);
        jsonWriter.writeStringField("privateFqdn", this.privateFqdn);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WebConnectivityEndpoint from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of WebConnectivityEndpoint if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WebConnectivityEndpoint.
     */
    public static WebConnectivityEndpoint fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            WebConnectivityEndpoint deserializedWebConnectivityEndpoint = new WebConnectivityEndpoint();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("fqdn".equals(fieldName)) {
                    deserializedWebConnectivityEndpoint.fqdn = reader.getString();
                } else if ("privateFqdn".equals(fieldName)) {
                    deserializedWebConnectivityEndpoint.privateFqdn = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedWebConnectivityEndpoint;
        });
    }
}
