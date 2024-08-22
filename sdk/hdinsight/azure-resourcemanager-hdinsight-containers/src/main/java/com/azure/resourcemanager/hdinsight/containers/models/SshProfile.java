// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Ssh profile for the cluster.
 */
@Fluent
public final class SshProfile implements JsonSerializable<SshProfile> {
    /*
     * Number of ssh pods per cluster.
     */
    private int count;

    /*
     * Prefix of the pod names. Pod number will be appended to the prefix. The ingress URLs for the pods will be
     * available at <clusterFqdn>/<sshBasePath>/<prefix>-<number>
     */
    private String podPrefix;

    /*
     * The virtual machine SKU.
     */
    private String vmSize;

    /**
     * Creates an instance of SshProfile class.
     */
    public SshProfile() {
    }

    /**
     * Get the count property: Number of ssh pods per cluster.
     * 
     * @return the count value.
     */
    public int count() {
        return this.count;
    }

    /**
     * Set the count property: Number of ssh pods per cluster.
     * 
     * @param count the count value to set.
     * @return the SshProfile object itself.
     */
    public SshProfile withCount(int count) {
        this.count = count;
        return this;
    }

    /**
     * Get the podPrefix property: Prefix of the pod names. Pod number will be appended to the prefix. The ingress URLs
     * for the pods will be available at &lt;clusterFqdn&gt;/&lt;sshBasePath&gt;/&lt;prefix&gt;-&lt;number&gt;.
     * 
     * @return the podPrefix value.
     */
    public String podPrefix() {
        return this.podPrefix;
    }

    /**
     * Get the vmSize property: The virtual machine SKU.
     * 
     * @return the vmSize value.
     */
    public String vmSize() {
        return this.vmSize;
    }

    /**
     * Set the vmSize property: The virtual machine SKU.
     * 
     * @param vmSize the vmSize value to set.
     * @return the SshProfile object itself.
     */
    public SshProfile withVmSize(String vmSize) {
        this.vmSize = vmSize;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeIntField("count", this.count);
        jsonWriter.writeStringField("vmSize", this.vmSize);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SshProfile from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SshProfile if the JsonReader was pointing to an instance of it, or null if it was pointing
     * to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SshProfile.
     */
    public static SshProfile fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SshProfile deserializedSshProfile = new SshProfile();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("count".equals(fieldName)) {
                    deserializedSshProfile.count = reader.getInt();
                } else if ("podPrefix".equals(fieldName)) {
                    deserializedSshProfile.podPrefix = reader.getString();
                } else if ("vmSize".equals(fieldName)) {
                    deserializedSshProfile.vmSize = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSshProfile;
        });
    }
}
