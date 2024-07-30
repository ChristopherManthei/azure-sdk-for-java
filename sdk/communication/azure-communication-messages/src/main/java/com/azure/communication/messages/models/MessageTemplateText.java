// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.communication.messages.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * The message template's text value information.
 */
@Immutable
public final class MessageTemplateText extends MessageTemplateValue {

    /*
     * The type discriminator describing a template parameter type.
     */
    @Generated
    private MessageTemplateValueKind kind = MessageTemplateValueKind.TEXT;

    /*
     * The text value.
     */
    @Generated
    private final String text;

    /**
     * Creates an instance of MessageTemplateText class.
     *
     * @param refValue the refValue value to set.
     * @param text the text value to set.
     */
    @Generated
    public MessageTemplateText(String refValue, String text) {
        super(refValue);
        this.text = text;
    }

    /**
     * Get the kind property: The type discriminator describing a template parameter type.
     *
     * @return the kind value.
     */
    @Generated
    @Override
    public MessageTemplateValueKind getKind() {
        return this.kind;
    }

    /**
     * Get the text property: The text value.
     *
     * @return the text value.
     */
    @Generated
    public String getText() {
        return this.text;
    }

    /**
     * {@inheritDoc}
     */
    @Generated
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", getRefValue());
        jsonWriter.writeStringField("text", this.text);
        jsonWriter.writeStringField("kind", this.kind == null ? null : this.kind.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MessageTemplateText from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of MessageTemplateText if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the MessageTemplateText.
     */
    @Generated
    public static MessageTemplateText fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            String refValue = null;
            String text = null;
            MessageTemplateValueKind kind = MessageTemplateValueKind.TEXT;
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("name".equals(fieldName)) {
                    refValue = reader.getString();
                } else if ("text".equals(fieldName)) {
                    text = reader.getString();
                } else if ("kind".equals(fieldName)) {
                    kind = MessageTemplateValueKind.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }
            MessageTemplateText deserializedMessageTemplateText = new MessageTemplateText(refValue, text);
            deserializedMessageTemplateText.kind = kind;
            return deserializedMessageTemplateText;
        });
    }
}
