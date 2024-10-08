// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The UploadCertificateRequest model.
 */
@Fluent
public final class UploadCertificateRequest implements JsonSerializable<UploadCertificateRequest> {
    /*
     * The properties property.
     */
    private RawCertificateData properties;

    /**
     * Creates an instance of UploadCertificateRequest class.
     */
    public UploadCertificateRequest() {
    }

    /**
     * Get the properties property: The properties property.
     * 
     * @return the properties value.
     */
    public RawCertificateData properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     * 
     * @param properties the properties value to set.
     * @return the UploadCertificateRequest object itself.
     */
    public UploadCertificateRequest withProperties(RawCertificateData properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.properties);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of UploadCertificateRequest from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of UploadCertificateRequest if the JsonReader was pointing to an instance of it, or null if
     * it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the UploadCertificateRequest.
     */
    public static UploadCertificateRequest fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            UploadCertificateRequest deserializedUploadCertificateRequest = new UploadCertificateRequest();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedUploadCertificateRequest.properties = RawCertificateData.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedUploadCertificateRequest;
        });
    }
}
