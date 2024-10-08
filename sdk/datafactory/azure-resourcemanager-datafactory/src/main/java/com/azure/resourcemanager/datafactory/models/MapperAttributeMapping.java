// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.List;

/**
 * Source and target column mapping details.
 */
@Fluent
public final class MapperAttributeMapping implements JsonSerializable<MapperAttributeMapping> {
    /*
     * Name of the target column.
     */
    private String name;

    /*
     * Type of the CDC attribute mapping. Note: 'Advanced' mapping type is also saved as 'Derived'.
     */
    private MappingType type;

    /*
     * Name of the function used for 'Aggregate' and 'Derived' (except 'Advanced') type mapping.
     */
    private String functionName;

    /*
     * Expression used for 'Aggregate' and 'Derived' type mapping.
     */
    private String expression;

    /*
     * Reference of the source column used in the mapping. It is used for 'Direct' mapping type only.
     */
    private MapperAttributeReference attributeReference;

    /*
     * List of references for source columns. It is used for 'Derived' and 'Aggregate' type mappings only.
     */
    private List<MapperAttributeReference> attributeReferences;

    /**
     * Creates an instance of MapperAttributeMapping class.
     */
    public MapperAttributeMapping() {
    }

    /**
     * Get the name property: Name of the target column.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the target column.
     * 
     * @param name the name value to set.
     * @return the MapperAttributeMapping object itself.
     */
    public MapperAttributeMapping withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: Type of the CDC attribute mapping. Note: 'Advanced' mapping type is also saved as
     * 'Derived'.
     * 
     * @return the type value.
     */
    public MappingType type() {
        return this.type;
    }

    /**
     * Set the type property: Type of the CDC attribute mapping. Note: 'Advanced' mapping type is also saved as
     * 'Derived'.
     * 
     * @param type the type value to set.
     * @return the MapperAttributeMapping object itself.
     */
    public MapperAttributeMapping withType(MappingType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the functionName property: Name of the function used for 'Aggregate' and 'Derived' (except 'Advanced') type
     * mapping.
     * 
     * @return the functionName value.
     */
    public String functionName() {
        return this.functionName;
    }

    /**
     * Set the functionName property: Name of the function used for 'Aggregate' and 'Derived' (except 'Advanced') type
     * mapping.
     * 
     * @param functionName the functionName value to set.
     * @return the MapperAttributeMapping object itself.
     */
    public MapperAttributeMapping withFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * Get the expression property: Expression used for 'Aggregate' and 'Derived' type mapping.
     * 
     * @return the expression value.
     */
    public String expression() {
        return this.expression;
    }

    /**
     * Set the expression property: Expression used for 'Aggregate' and 'Derived' type mapping.
     * 
     * @param expression the expression value to set.
     * @return the MapperAttributeMapping object itself.
     */
    public MapperAttributeMapping withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * Get the attributeReference property: Reference of the source column used in the mapping. It is used for 'Direct'
     * mapping type only.
     * 
     * @return the attributeReference value.
     */
    public MapperAttributeReference attributeReference() {
        return this.attributeReference;
    }

    /**
     * Set the attributeReference property: Reference of the source column used in the mapping. It is used for 'Direct'
     * mapping type only.
     * 
     * @param attributeReference the attributeReference value to set.
     * @return the MapperAttributeMapping object itself.
     */
    public MapperAttributeMapping withAttributeReference(MapperAttributeReference attributeReference) {
        this.attributeReference = attributeReference;
        return this;
    }

    /**
     * Get the attributeReferences property: List of references for source columns. It is used for 'Derived' and
     * 'Aggregate' type mappings only.
     * 
     * @return the attributeReferences value.
     */
    public List<MapperAttributeReference> attributeReferences() {
        return this.attributeReferences;
    }

    /**
     * Set the attributeReferences property: List of references for source columns. It is used for 'Derived' and
     * 'Aggregate' type mappings only.
     * 
     * @param attributeReferences the attributeReferences value to set.
     * @return the MapperAttributeMapping object itself.
     */
    public MapperAttributeMapping withAttributeReferences(List<MapperAttributeReference> attributeReferences) {
        this.attributeReferences = attributeReferences;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (attributeReference() != null) {
            attributeReference().validate();
        }
        if (attributeReferences() != null) {
            attributeReferences().forEach(e -> e.validate());
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("name", this.name);
        jsonWriter.writeStringField("type", this.type == null ? null : this.type.toString());
        jsonWriter.writeStringField("functionName", this.functionName);
        jsonWriter.writeStringField("expression", this.expression);
        jsonWriter.writeJsonField("attributeReference", this.attributeReference);
        jsonWriter.writeArrayField("attributeReferences", this.attributeReferences,
            (writer, element) -> writer.writeJson(element));
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of MapperAttributeMapping from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of MapperAttributeMapping if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IOException If an error occurs while reading the MapperAttributeMapping.
     */
    public static MapperAttributeMapping fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            MapperAttributeMapping deserializedMapperAttributeMapping = new MapperAttributeMapping();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("name".equals(fieldName)) {
                    deserializedMapperAttributeMapping.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedMapperAttributeMapping.type = MappingType.fromString(reader.getString());
                } else if ("functionName".equals(fieldName)) {
                    deserializedMapperAttributeMapping.functionName = reader.getString();
                } else if ("expression".equals(fieldName)) {
                    deserializedMapperAttributeMapping.expression = reader.getString();
                } else if ("attributeReference".equals(fieldName)) {
                    deserializedMapperAttributeMapping.attributeReference = MapperAttributeReference.fromJson(reader);
                } else if ("attributeReferences".equals(fieldName)) {
                    List<MapperAttributeReference> attributeReferences
                        = reader.readArray(reader1 -> MapperAttributeReference.fromJson(reader1));
                    deserializedMapperAttributeMapping.attributeReferences = attributeReferences;
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedMapperAttributeMapping;
        });
    }
}
