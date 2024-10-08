// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cdn.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import com.azure.resourcemanager.cdn.models.AfdProvisioningState;
import com.azure.resourcemanager.cdn.models.AfdStateProperties;
import com.azure.resourcemanager.cdn.models.DeploymentStatus;
import java.io.IOException;

/**
 * The JSON object that contains the properties of the Rule Set to create.
 */
@Immutable
public final class RuleSetProperties extends AfdStateProperties {
    /*
     * The name of the profile which holds the rule set.
     */
    private String profileName;

    /*
     * The deploymentStatus property.
     */
    private DeploymentStatus deploymentStatus;

    /*
     * Provisioning status
     */
    private AfdProvisioningState provisioningState;

    /**
     * Creates an instance of RuleSetProperties class.
     */
    public RuleSetProperties() {
    }

    /**
     * Get the profileName property: The name of the profile which holds the rule set.
     * 
     * @return the profileName value.
     */
    public String profileName() {
        return this.profileName;
    }

    /**
     * Get the deploymentStatus property: The deploymentStatus property.
     * 
     * @return the deploymentStatus value.
     */
    @Override
    public DeploymentStatus deploymentStatus() {
        return this.deploymentStatus;
    }

    /**
     * Get the provisioningState property: Provisioning status.
     * 
     * @return the provisioningState value.
     */
    @Override
    public AfdProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of RuleSetProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of RuleSetProperties if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IOException If an error occurs while reading the RuleSetProperties.
     */
    public static RuleSetProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            RuleSetProperties deserializedRuleSetProperties = new RuleSetProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("provisioningState".equals(fieldName)) {
                    deserializedRuleSetProperties.provisioningState
                        = AfdProvisioningState.fromString(reader.getString());
                } else if ("deploymentStatus".equals(fieldName)) {
                    deserializedRuleSetProperties.deploymentStatus = DeploymentStatus.fromString(reader.getString());
                } else if ("profileName".equals(fieldName)) {
                    deserializedRuleSetProperties.profileName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedRuleSetProperties;
        });
    }
}
