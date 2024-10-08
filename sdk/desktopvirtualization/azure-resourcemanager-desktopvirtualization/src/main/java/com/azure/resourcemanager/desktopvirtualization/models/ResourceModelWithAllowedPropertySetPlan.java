// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The ResourceModelWithAllowedPropertySetPlan model.
 */
@Fluent
public final class ResourceModelWithAllowedPropertySetPlan extends Plan {
    /**
     * Creates an instance of ResourceModelWithAllowedPropertySetPlan class.
     */
    public ResourceModelWithAllowedPropertySetPlan() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceModelWithAllowedPropertySetPlan withName(String name) {
        super.withName(name);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceModelWithAllowedPropertySetPlan withPublisher(String publisher) {
        super.withPublisher(publisher);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceModelWithAllowedPropertySetPlan withProduct(String product) {
        super.withProduct(product);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceModelWithAllowedPropertySetPlan withPromotionCode(String promotionCode) {
        super.withPromotionCode(promotionCode);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ResourceModelWithAllowedPropertySetPlan withVersion(String version) {
        super.withVersion(version);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        if (name() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property name in model ResourceModelWithAllowedPropertySetPlan"));
        }
        if (publisher() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property publisher in model ResourceModelWithAllowedPropertySetPlan"));
        }
        if (product() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property product in model ResourceModelWithAllowedPropertySetPlan"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceModelWithAllowedPropertySetPlan.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", name());
        jsonWriter.writeStringField("publisher", publisher());
        jsonWriter.writeStringField("product", product());
        jsonWriter.writeStringField("promotionCode", promotionCode());
        jsonWriter.writeStringField("version", version());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceModelWithAllowedPropertySetPlan from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceModelWithAllowedPropertySetPlan if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ResourceModelWithAllowedPropertySetPlan.
     */
    public static ResourceModelWithAllowedPropertySetPlan fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceModelWithAllowedPropertySetPlan deserializedResourceModelWithAllowedPropertySetPlan
                = new ResourceModelWithAllowedPropertySetPlan();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedResourceModelWithAllowedPropertySetPlan.withName(reader.getString());
                } else if ("publisher".equals(fieldName)) {
                    deserializedResourceModelWithAllowedPropertySetPlan.withPublisher(reader.getString());
                } else if ("product".equals(fieldName)) {
                    deserializedResourceModelWithAllowedPropertySetPlan.withProduct(reader.getString());
                } else if ("promotionCode".equals(fieldName)) {
                    deserializedResourceModelWithAllowedPropertySetPlan.withPromotionCode(reader.getString());
                } else if ("version".equals(fieldName)) {
                    deserializedResourceModelWithAllowedPropertySetPlan.withVersion(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedResourceModelWithAllowedPropertySetPlan;
        });
    }
}
