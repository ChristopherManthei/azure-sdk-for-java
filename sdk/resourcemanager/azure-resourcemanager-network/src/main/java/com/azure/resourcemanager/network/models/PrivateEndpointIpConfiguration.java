// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.network.fluent.models.PrivateEndpointIpConfigurationProperties;
import java.io.IOException;

/**
 * An IP Configuration of the private endpoint.
 */
@Fluent
public final class PrivateEndpointIpConfiguration implements JsonSerializable<PrivateEndpointIpConfiguration> {
    /*
     * Properties of private endpoint IP configurations.
     */
    private PrivateEndpointIpConfigurationProperties innerProperties;

    /*
     * The name of the resource that is unique within a resource group.
     */
    private String name;

    /*
     * The resource type.
     */
    private String type;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    private String etag;

    /**
     * Creates an instance of PrivateEndpointIpConfiguration class.
     */
    public PrivateEndpointIpConfiguration() {
    }

    /**
     * Get the innerProperties property: Properties of private endpoint IP configurations.
     * 
     * @return the innerProperties value.
     */
    private PrivateEndpointIpConfigurationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group.
     * 
     * @param name the name value to set.
     * @return the PrivateEndpointIpConfiguration object itself.
     */
    public PrivateEndpointIpConfiguration withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the type property: The resource type.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the groupId property: The ID of a group obtained from the remote resource that this private endpoint should
     * connect to.
     * 
     * @return the groupId value.
     */
    public String groupId() {
        return this.innerProperties() == null ? null : this.innerProperties().groupId();
    }

    /**
     * Set the groupId property: The ID of a group obtained from the remote resource that this private endpoint should
     * connect to.
     * 
     * @param groupId the groupId value to set.
     * @return the PrivateEndpointIpConfiguration object itself.
     */
    public PrivateEndpointIpConfiguration withGroupId(String groupId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointIpConfigurationProperties();
        }
        this.innerProperties().withGroupId(groupId);
        return this;
    }

    /**
     * Get the memberName property: The member name of a group obtained from the remote resource that this private
     * endpoint should connect to.
     * 
     * @return the memberName value.
     */
    public String memberName() {
        return this.innerProperties() == null ? null : this.innerProperties().memberName();
    }

    /**
     * Set the memberName property: The member name of a group obtained from the remote resource that this private
     * endpoint should connect to.
     * 
     * @param memberName the memberName value to set.
     * @return the PrivateEndpointIpConfiguration object itself.
     */
    public PrivateEndpointIpConfiguration withMemberName(String memberName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointIpConfigurationProperties();
        }
        this.innerProperties().withMemberName(memberName);
        return this;
    }

    /**
     * Get the privateIpAddress property: A private ip address obtained from the private endpoint's subnet.
     * 
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddress();
    }

    /**
     * Set the privateIpAddress property: A private ip address obtained from the private endpoint's subnet.
     * 
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the PrivateEndpointIpConfiguration object itself.
     */
    public PrivateEndpointIpConfiguration withPrivateIpAddress(String privateIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PrivateEndpointIpConfigurationProperties();
        }
        this.innerProperties().withPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("properties", this.innerProperties);
        jsonWriter.writeStringField("name", this.name);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of PrivateEndpointIpConfiguration from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of PrivateEndpointIpConfiguration if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the PrivateEndpointIpConfiguration.
     */
    public static PrivateEndpointIpConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            PrivateEndpointIpConfiguration deserializedPrivateEndpointIpConfiguration
                = new PrivateEndpointIpConfiguration();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("properties".equals(fieldName)) {
                    deserializedPrivateEndpointIpConfiguration.innerProperties
                        = PrivateEndpointIpConfigurationProperties.fromJson(reader);
                } else if ("name".equals(fieldName)) {
                    deserializedPrivateEndpointIpConfiguration.name = reader.getString();
                } else if ("type".equals(fieldName)) {
                    deserializedPrivateEndpointIpConfiguration.type = reader.getString();
                } else if ("etag".equals(fieldName)) {
                    deserializedPrivateEndpointIpConfiguration.etag = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedPrivateEndpointIpConfiguration;
        });
    }
}
