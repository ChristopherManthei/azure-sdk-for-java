// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaderName;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import java.time.OffsetDateTime;

/**
 * The ServicesGetStatisticsHeaders model.
 */
@Fluent
public final class ServicesGetStatisticsHeaders {
    /*
     * The x-ms-version property.
     */
    private String xMsVersion;

    /*
     * The x-ms-request-id property.
     */
    private String xMsRequestId;

    /*
     * The x-ms-client-request-id property.
     */
    private String xMsClientRequestId;

    /*
     * The Date property.
     */
    private DateTimeRfc1123 date;

    private static final HttpHeaderName X_MS_VERSION = HttpHeaderName.fromString("x-ms-version");

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of ServicesGetStatisticsHeaders class.
     * 
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public ServicesGetStatisticsHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue(X_MS_VERSION);
        this.xMsRequestId = rawHeaders.getValue(HttpHeaderName.X_MS_REQUEST_ID);
        this.xMsClientRequestId = rawHeaders.getValue(HttpHeaderName.X_MS_CLIENT_REQUEST_ID);
        String date = rawHeaders.getValue(HttpHeaderName.DATE);
        if (date != null) {
            this.date = new DateTimeRfc1123(date);
        }
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     * 
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     * 
     * @param xMsVersion the xMsVersion value to set.
     * @return the ServicesGetStatisticsHeaders object itself.
     */
    public ServicesGetStatisticsHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     * 
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     * 
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the ServicesGetStatisticsHeaders object itself.
     */
    public ServicesGetStatisticsHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the xMsClientRequestId property: The x-ms-client-request-id property.
     * 
     * @return the xMsClientRequestId value.
     */
    public String getXMsClientRequestId() {
        return this.xMsClientRequestId;
    }

    /**
     * Set the xMsClientRequestId property: The x-ms-client-request-id property.
     * 
     * @param xMsClientRequestId the xMsClientRequestId value to set.
     * @return the ServicesGetStatisticsHeaders object itself.
     */
    public ServicesGetStatisticsHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    /**
     * Get the date property: The Date property.
     * 
     * @return the date value.
     */
    public OffsetDateTime getDate() {
        if (this.date == null) {
            return null;
        }
        return this.date.getDateTime();
    }

    /**
     * Set the date property: The Date property.
     * 
     * @param date the date value to set.
     * @return the ServicesGetStatisticsHeaders object itself.
     */
    public ServicesGetStatisticsHeaders setDate(OffsetDateTime date) {
        if (date == null) {
            this.date = null;
        } else {
            this.date = new DateTimeRfc1123(date);
        }
        return this;
    }
}
