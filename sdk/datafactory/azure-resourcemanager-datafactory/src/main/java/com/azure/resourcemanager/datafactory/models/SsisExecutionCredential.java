// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * SSIS package execution credential.
 */
@Fluent
public final class SsisExecutionCredential implements JsonSerializable<SsisExecutionCredential> {
    /*
     * Domain for windows authentication. Type: string (or Expression with resultType string).
     */
    private Object domain;

    /*
     * UseName for windows authentication. Type: string (or Expression with resultType string).
     */
    private Object username;

    /*
     * Password for windows authentication.
     */
    private SecureString password;

    /**
     * Creates an instance of SsisExecutionCredential class.
     */
    public SsisExecutionCredential() {
    }

    /**
     * Get the domain property: Domain for windows authentication. Type: string (or Expression with resultType string).
     * 
     * @return the domain value.
     */
    public Object domain() {
        return this.domain;
    }

    /**
     * Set the domain property: Domain for windows authentication. Type: string (or Expression with resultType string).
     * 
     * @param domain the domain value to set.
     * @return the SsisExecutionCredential object itself.
     */
    public SsisExecutionCredential withDomain(Object domain) {
        this.domain = domain;
        return this;
    }

    /**
     * Get the username property: UseName for windows authentication. Type: string (or Expression with resultType
     * string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.username;
    }

    /**
     * Set the username property: UseName for windows authentication. Type: string (or Expression with resultType
     * string).
     * 
     * @param username the username value to set.
     * @return the SsisExecutionCredential object itself.
     */
    public SsisExecutionCredential withUsername(Object username) {
        this.username = username;
        return this;
    }

    /**
     * Get the password property: Password for windows authentication.
     * 
     * @return the password value.
     */
    public SecureString password() {
        return this.password;
    }

    /**
     * Set the password property: Password for windows authentication.
     * 
     * @param password the password value to set.
     * @return the SsisExecutionCredential object itself.
     */
    public SsisExecutionCredential withPassword(SecureString password) {
        this.password = password;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (domain() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException("Missing required property domain in model SsisExecutionCredential"));
        }
        if (username() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property username in model SsisExecutionCredential"));
        }
        if (password() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property password in model SsisExecutionCredential"));
        } else {
            password().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SsisExecutionCredential.class);

    /**
     * {@inheritDoc}
     */
    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeUntypedField("domain", this.domain);
        jsonWriter.writeUntypedField("userName", this.username);
        jsonWriter.writeJsonField("password", this.password);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of SsisExecutionCredential from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of SsisExecutionCredential if the JsonReader was pointing to an instance of it, or null if it
     * was pointing to JSON null.
     * @throws IllegalStateException If the deserialized JSON object was missing any required properties.
     * @throws IOException If an error occurs while reading the SsisExecutionCredential.
     */
    public static SsisExecutionCredential fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            SsisExecutionCredential deserializedSsisExecutionCredential = new SsisExecutionCredential();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("domain".equals(fieldName)) {
                    deserializedSsisExecutionCredential.domain = reader.readUntyped();
                } else if ("userName".equals(fieldName)) {
                    deserializedSsisExecutionCredential.username = reader.readUntyped();
                } else if ("password".equals(fieldName)) {
                    deserializedSsisExecutionCredential.password = SecureString.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedSsisExecutionCredential;
        });
    }
}
