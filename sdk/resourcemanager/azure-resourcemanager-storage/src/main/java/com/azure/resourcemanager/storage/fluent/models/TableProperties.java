// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.storage.models.TableSignedIdentifier;
import java.io.IOException;
import java.util.List;

/**
 * The TableProperties model.
 */
@Fluent
public final class TableProperties implements JsonSerializable<TableProperties> {
    /*
     * Table name under the specified account
     */
    private String tableName;

    /*
     * List of stored access policies specified on the table.
     */
    private List<TableSignedIdentifier> signedIdentifiers;

    /**
     * Creates an instance of TableProperties class.
     */
    public TableProperties() {
    }

    /**
     * Get the tableName property: Table name under the specified account.
     * 
     * @return the tableName value.
     */
    public String tableName() {
        return this.tableName;
    }

    /**
     * Get the signedIdentifiers property: List of stored access policies specified on the table.
     * 
     * @return the signedIdentifiers value.
     */
    public List<TableSignedIdentifier> signedIdentifiers() {
        return this.signedIdentifiers;
    }

    /**
     * Set the signedIdentifiers property: List of stored access policies specified on the table.
     * 
     * @param signedIdentifiers the signedIdentifiers value to set.
     * @return the TableProperties object itself.
     */
    public TableProperties withSignedIdentifiers(List<TableSignedIdentifier> signedIdentifiers) {
        this.signedIdentifiers = signedIdentifiers;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (signedIdentifiers() != null) {
            signedIdentifiers().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeArrayField("signedIdentifiers", this.signedIdentifiers,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of TableProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of TableProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the TableProperties.
     */
    public static TableProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            TableProperties deserializedTableProperties = new TableProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("tableName".equals(fieldName)) {
                    deserializedTableProperties.tableName = reader.getString();
                } else if ("signedIdentifiers".equals(fieldName)) {
                    List<TableSignedIdentifier> signedIdentifiers
                        = reader.readArray(reader1 -> TableSignedIdentifier.fromJson(reader1));
                    deserializedTableProperties.signedIdentifiers = signedIdentifiers;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedTableProperties;
        });
    }
}
