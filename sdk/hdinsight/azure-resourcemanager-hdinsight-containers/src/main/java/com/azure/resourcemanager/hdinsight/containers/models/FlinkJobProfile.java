// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Job specifications for flink clusters in application deployment mode. The specification is immutable even if job
 * properties are changed by calling the RunJob API, please use the ListJob API to get the latest job information.
 */
@Fluent
public final class FlinkJobProfile implements JsonSerializable<FlinkJobProfile> {
    /*
     * A string property that specifies the directory where the job JAR is located.
     */
    private String jobJarDirectory;

    /*
     * A string property that represents the name of the job JAR.
     */
    private String jarName;

    /*
     * A string property that specifies the entry class for the Flink job. If not specified, the entry point is
     * auto-detected from the flink job jar package.
     */
    private String entryClass;

    /*
     * A string property representing additional JVM arguments for the Flink job. It should be space separated value.
     */
    private String args;

    /*
     * A string property that represents the name of the savepoint for the Flink job
     */
    private String savePointName;

    /*
     * A string property that indicates the upgrade mode to be performed on the Flink job. It can have one of the
     * following enum values => STATELESS_UPDATE, UPDATE, LAST_STATE_UPDATE.
     */
    private UpgradeMode upgradeMode;

    /**
     * Creates an instance of FlinkJobProfile class.
     */
    public FlinkJobProfile() {
    }

    /**
     * Get the jobJarDirectory property: A string property that specifies the directory where the job JAR is located.
     * 
     * @return the jobJarDirectory value.
     */
    public String jobJarDirectory() {
        return this.jobJarDirectory;
    }

    /**
     * Set the jobJarDirectory property: A string property that specifies the directory where the job JAR is located.
     * 
     * @param jobJarDirectory the jobJarDirectory value to set.
     * @return the FlinkJobProfile object itself.
     */
    public FlinkJobProfile withJobJarDirectory(String jobJarDirectory) {
        this.jobJarDirectory = jobJarDirectory;
        return this;
    }

    /**
     * Get the jarName property: A string property that represents the name of the job JAR.
     * 
     * @return the jarName value.
     */
    public String jarName() {
        return this.jarName;
    }

    /**
     * Set the jarName property: A string property that represents the name of the job JAR.
     * 
     * @param jarName the jarName value to set.
     * @return the FlinkJobProfile object itself.
     */
    public FlinkJobProfile withJarName(String jarName) {
        this.jarName = jarName;
        return this;
    }

    /**
     * Get the entryClass property: A string property that specifies the entry class for the Flink job. If not
     * specified, the entry point is auto-detected from the flink job jar package.
     * 
     * @return the entryClass value.
     */
    public String entryClass() {
        return this.entryClass;
    }

    /**
     * Set the entryClass property: A string property that specifies the entry class for the Flink job. If not
     * specified, the entry point is auto-detected from the flink job jar package.
     * 
     * @param entryClass the entryClass value to set.
     * @return the FlinkJobProfile object itself.
     */
    public FlinkJobProfile withEntryClass(String entryClass) {
        this.entryClass = entryClass;
        return this;
    }

    /**
     * Get the args property: A string property representing additional JVM arguments for the Flink job. It should be
     * space separated value.
     * 
     * @return the args value.
     */
    public String args() {
        return this.args;
    }

    /**
     * Set the args property: A string property representing additional JVM arguments for the Flink job. It should be
     * space separated value.
     * 
     * @param args the args value to set.
     * @return the FlinkJobProfile object itself.
     */
    public FlinkJobProfile withArgs(String args) {
        this.args = args;
        return this;
    }

    /**
     * Get the savePointName property: A string property that represents the name of the savepoint for the Flink job.
     * 
     * @return the savePointName value.
     */
    public String savePointName() {
        return this.savePointName;
    }

    /**
     * Set the savePointName property: A string property that represents the name of the savepoint for the Flink job.
     * 
     * @param savePointName the savePointName value to set.
     * @return the FlinkJobProfile object itself.
     */
    public FlinkJobProfile withSavePointName(String savePointName) {
        this.savePointName = savePointName;
        return this;
    }

    /**
     * Get the upgradeMode property: A string property that indicates the upgrade mode to be performed on the Flink job.
     * It can have one of the following enum values =&gt; STATELESS_UPDATE, UPDATE, LAST_STATE_UPDATE.
     * 
     * @return the upgradeMode value.
     */
    public UpgradeMode upgradeMode() {
        return this.upgradeMode;
    }

    /**
     * Set the upgradeMode property: A string property that indicates the upgrade mode to be performed on the Flink job.
     * It can have one of the following enum values =&gt; STATELESS_UPDATE, UPDATE, LAST_STATE_UPDATE.
     * 
     * @param upgradeMode the upgradeMode value to set.
     * @return the FlinkJobProfile object itself.
     */
    public FlinkJobProfile withUpgradeMode(UpgradeMode upgradeMode) {
        this.upgradeMode = upgradeMode;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (jobJarDirectory() == null) {
            throw LOGGER.atError()
                .log(
                    new IllegalArgumentException("Missing required property jobJarDirectory in model FlinkJobProfile"));
        }
        if (jarName() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property jarName in model FlinkJobProfile"));
        }
        if (upgradeMode() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property upgradeMode in model FlinkJobProfile"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FlinkJobProfile.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("jobJarDirectory", this.jobJarDirectory);
        jsonWriter.writeStringField("jarName", this.jarName);
        jsonWriter.writeStringField("upgradeMode", this.upgradeMode == null ? null : this.upgradeMode.toString());
        jsonWriter.writeStringField("entryClass", this.entryClass);
        jsonWriter.writeStringField("args", this.args);
        jsonWriter.writeStringField("savePointName", this.savePointName);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of FlinkJobProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of FlinkJobProfile if the JsonReader was pointing to an instance of it, or null if it was
     * pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the FlinkJobProfile.
     */
    public static FlinkJobProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            FlinkJobProfile deserializedFlinkJobProfile = new FlinkJobProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jobJarDirectory".equals(fieldName)) {
                    deserializedFlinkJobProfile.jobJarDirectory = reader.getString();
                } else if ("jarName".equals(fieldName)) {
                    deserializedFlinkJobProfile.jarName = reader.getString();
                } else if ("upgradeMode".equals(fieldName)) {
                    deserializedFlinkJobProfile.upgradeMode = UpgradeMode.fromString(reader.getString());
                } else if ("entryClass".equals(fieldName)) {
                    deserializedFlinkJobProfile.entryClass = reader.getString();
                } else if ("args".equals(fieldName)) {
                    deserializedFlinkJobProfile.args = reader.getString();
                } else if ("savePointName".equals(fieldName)) {
                    deserializedFlinkJobProfile.savePointName = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedFlinkJobProfile;
        });
    }
}
