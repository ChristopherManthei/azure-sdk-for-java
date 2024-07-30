// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages.models.channels;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The template bindings component for WhatsApp.
 */
@Immutable
public final class WhatsAppMessageTemplateBindingsComponent
    implements JsonSerializable<WhatsAppMessageTemplateBindingsComponent> {

    /*
     * The name of the referenced item in the template values.
     */
    @Generated
    private final String refValue;

    /**
     * Creates an instance of WhatsAppMessageTemplateBindingsComponent class.
     *
     * @param refValue the refValue value to set.
     */
    @Generated
    public WhatsAppMessageTemplateBindingsComponent(String refValue) {
        this.refValue = refValue;
    }

    /**
     * Get the refValue property: The name of the referenced item in the template values.
     *
     * @return the refValue value.
     */
    @Generated
    public String getRefValue() {
        return this.refValue;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("refValue", this.refValue);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of WhatsAppMessageTemplateBindingsComponent from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of WhatsAppMessageTemplateBindingsComponent if the JsonReader was pointing to an instance of
     * it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the WhatsAppMessageTemplateBindingsComponent.
     */
    @Generated
    public static WhatsAppMessageTemplateBindingsComponent fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String refValue = null;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("refValue".equals(fieldName)) {
                    refValue = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }
            return new WhatsAppMessageTemplateBindingsComponent(refValue);
        });
    }
}
