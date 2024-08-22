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
 * Cluster hotfix upgrade rollback history properties.
 */
@Fluent
public final class ClusterHotfixUpgradeRollbackHistoryProperties extends ClusterInPlaceUpgradeHistoryProperties {
    /*
     * Type of upgrade.
     */
    private ClusterUpgradeHistoryType upgradeType = ClusterUpgradeHistoryType.HOTFIX_UPGRADE_ROLLBACK;

    /**
     * Creates an instance of ClusterHotfixUpgradeRollbackHistoryProperties class.
     */
    public ClusterHotfixUpgradeRollbackHistoryProperties() {
    }

    /**
     * Get the upgradeType property: Type of upgrade.
     * 
     * @return the upgradeType value.
     */
    @Override
    public ClusterUpgradeHistoryType upgradeType() {
        return this.upgradeType;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeRollbackHistoryProperties withSourceClusterVersion(String sourceClusterVersion) {
        super.withSourceClusterVersion(sourceClusterVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeRollbackHistoryProperties withSourceOssVersion(String sourceOssVersion) {
        super.withSourceOssVersion(sourceOssVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeRollbackHistoryProperties withSourceBuildNumber(String sourceBuildNumber) {
        super.withSourceBuildNumber(sourceBuildNumber);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeRollbackHistoryProperties withTargetClusterVersion(String targetClusterVersion) {
        super.withTargetClusterVersion(targetClusterVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeRollbackHistoryProperties withTargetOssVersion(String targetOssVersion) {
        super.withTargetOssVersion(targetOssVersion);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeRollbackHistoryProperties withTargetBuildNumber(String targetBuildNumber) {
        super.withTargetBuildNumber(targetBuildNumber);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeRollbackHistoryProperties withComponentName(String componentName) {
        super.withComponentName(componentName);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeRollbackHistoryProperties withSeverity(ClusterUpgradeHistorySeverityType severity) {
        super.withSeverity(severity);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeRollbackHistoryProperties withUtcTime(String utcTime) {
        super.withUtcTime(utcTime);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ClusterHotfixUpgradeRollbackHistoryProperties
        withUpgradeResult(ClusterUpgradeHistoryUpgradeResultType upgradeResult) {
        super.withUpgradeResult(upgradeResult);
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
        jsonWriter.writeStringField("utcTime", utcTime());
        jsonWriter.writeStringField("upgradeResult", upgradeResult() == null ? null : upgradeResult().toString());
        jsonWriter.writeStringField("sourceClusterVersion", sourceClusterVersion());
        jsonWriter.writeStringField("sourceOssVersion", sourceOssVersion());
        jsonWriter.writeStringField("sourceBuildNumber", sourceBuildNumber());
        jsonWriter.writeStringField("targetClusterVersion", targetClusterVersion());
        jsonWriter.writeStringField("targetOssVersion", targetOssVersion());
        jsonWriter.writeStringField("targetBuildNumber", targetBuildNumber());
        jsonWriter.writeStringField("componentName", componentName());
        jsonWriter.writeStringField("severity", severity() == null ? null : severity().toString());
        jsonWriter.writeStringField("upgradeType", this.upgradeType == null ? null : this.upgradeType.toString());
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ClusterHotfixUpgradeRollbackHistoryProperties from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of ClusterHotfixUpgradeRollbackHistoryProperties if the JsonReader was pointing to an
     * instance of it, or null if it was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the ClusterHotfixUpgradeRollbackHistoryProperties.
     */
    public static ClusterHotfixUpgradeRollbackHistoryProperties fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ClusterHotfixUpgradeRollbackHistoryProperties deserializedClusterHotfixUpgradeRollbackHistoryProperties
                = new ClusterHotfixUpgradeRollbackHistoryProperties();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("utcTime".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeRollbackHistoryProperties.withUtcTime(reader.getString());
                } else if ("upgradeResult".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeRollbackHistoryProperties
                        .withUpgradeResult(ClusterUpgradeHistoryUpgradeResultType.fromString(reader.getString()));
                } else if ("sourceClusterVersion".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeRollbackHistoryProperties
                        .withSourceClusterVersion(reader.getString());
                } else if ("sourceOssVersion".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeRollbackHistoryProperties.withSourceOssVersion(reader.getString());
                } else if ("sourceBuildNumber".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeRollbackHistoryProperties.withSourceBuildNumber(reader.getString());
                } else if ("targetClusterVersion".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeRollbackHistoryProperties
                        .withTargetClusterVersion(reader.getString());
                } else if ("targetOssVersion".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeRollbackHistoryProperties.withTargetOssVersion(reader.getString());
                } else if ("targetBuildNumber".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeRollbackHistoryProperties.withTargetBuildNumber(reader.getString());
                } else if ("componentName".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeRollbackHistoryProperties.withComponentName(reader.getString());
                } else if ("severity".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeRollbackHistoryProperties
                        .withSeverity(ClusterUpgradeHistorySeverityType.fromString(reader.getString()));
                } else if ("upgradeType".equals(fieldName)) {
                    deserializedClusterHotfixUpgradeRollbackHistoryProperties.upgradeType
                        = ClusterUpgradeHistoryType.fromString(reader.getString());
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedClusterHotfixUpgradeRollbackHistoryProperties;
        });
    }
}
