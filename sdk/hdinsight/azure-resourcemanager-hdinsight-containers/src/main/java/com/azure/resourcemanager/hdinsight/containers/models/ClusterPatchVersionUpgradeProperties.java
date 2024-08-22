// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Properties of upgrading cluster's patch version.
 */
@Fluent
public final class ClusterPatchVersionUpgradeProperties extends ClusterInPlaceUpgradeProperties {
    /*
     * Type of upgrade.
     */
    private ClusterUpgradeType upgradeType = ClusterUpgradeType.PATCH_VERSION_UPGRADE;

    /**
     * Creates an instance of ClusterPatchVersionUpgradeProperties class.
     */
    public ClusterPatchVersionUpgradeProperties() {
    }

    /**
     * Get the upgradeType property: Type of upgrade.
     * 
     * @return the upgradeType value.
     */
    @Override
    public ClusterUpgradeType upgradeType() {
        return this.upgradeType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterPatchVersionUpgradeProperties withTargetOssVersion(String targetOssVersion) {
        super.withTargetOssVersion(targetOssVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterPatchVersionUpgradeProperties withTargetClusterVersion(String targetClusterVersion) {
        super.withTargetClusterVersion(targetClusterVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterPatchVersionUpgradeProperties withTargetBuildNumber(String targetBuildNumber) {
        super.withTargetBuildNumber(targetBuildNumber);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterPatchVersionUpgradeProperties withComponentName(String componentName) {
        super.withComponentName(componentName);
        return this;
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
        jsonWriter.writeStringField("targetOssVersion", targetOssVersion());
        jsonWriter.writeStringField("targetClusterVersion", targetClusterVersion());
        jsonWriter.writeStringField("targetBuildNumber", targetBuildNumber());
        jsonWriter.writeStringField("componentName", componentName());
        jsonWriter.writeStringField("upgradeType", this.upgradeType == null ? null : this.upgradeType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterPatchVersionUpgradeProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterPatchVersionUpgradeProperties if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ClusterPatchVersionUpgradeProperties.
     */
    public static ClusterPatchVersionUpgradeProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterPatchVersionUpgradeProperties deserializedClusterPatchVersionUpgradeProperties
                = new ClusterPatchVersionUpgradeProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("targetOssVersion".equals(fieldName)) {
                    deserializedClusterPatchVersionUpgradeProperties.withTargetOssVersion(reader.getString());
                } else if ("targetClusterVersion".equals(fieldName)) {
                    deserializedClusterPatchVersionUpgradeProperties.withTargetClusterVersion(reader.getString());
                } else if ("targetBuildNumber".equals(fieldName)) {
                    deserializedClusterPatchVersionUpgradeProperties.withTargetBuildNumber(reader.getString());
                } else if ("componentName".equals(fieldName)) {
                    deserializedClusterPatchVersionUpgradeProperties.withComponentName(reader.getString());
                } else if ("upgradeType".equals(fieldName)) {
                    deserializedClusterPatchVersionUpgradeProperties.upgradeType
                        = ClusterUpgradeType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterPatchVersionUpgradeProperties;
        });
    }
}
