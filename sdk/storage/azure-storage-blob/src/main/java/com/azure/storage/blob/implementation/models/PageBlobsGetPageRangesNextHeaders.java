// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.DateTimeRfc1123;
import java.time.OffsetDateTime;

/** The PageBlobsGetPageRangesNextHeaders model. */
@Fluent
public final class PageBlobsGetPageRangesNextHeaders {
    /*
     * The x-ms-version property.
     */
    private String xMsVersion;

    /*
     * The x-ms-blob-content-length property.
     */
    private Long xMsBlobContentLength;

    /*
     * The ETag property.
     */
    private String eTag;

    /*
     * The Last-Modified property.
     */
    private DateTimeRfc1123 lastModified;

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
    private DateTimeRfc1123 dateProperty;

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
     * @return the PageBlobsGetPageRangesNextHeaders object itself.
     */
    public PageBlobsGetPageRangesNextHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the xMsBlobContentLength property: The x-ms-blob-content-length property.
     *
     * @return the xMsBlobContentLength value.
     */
    public Long getXMsBlobContentLength() {
        return this.xMsBlobContentLength;
    }

    /**
     * Set the xMsBlobContentLength property: The x-ms-blob-content-length property.
     *
     * @param xMsBlobContentLength the xMsBlobContentLength value to set.
     * @return the PageBlobsGetPageRangesNextHeaders object itself.
     */
    public PageBlobsGetPageRangesNextHeaders setXMsBlobContentLength(Long xMsBlobContentLength) {
        this.xMsBlobContentLength = xMsBlobContentLength;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the PageBlobsGetPageRangesNextHeaders object itself.
     */
    public PageBlobsGetPageRangesNextHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the PageBlobsGetPageRangesNextHeaders object itself.
     */
    public PageBlobsGetPageRangesNextHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
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
     * @return the PageBlobsGetPageRangesNextHeaders object itself.
     */
    public PageBlobsGetPageRangesNextHeaders setXMsRequestId(String xMsRequestId) {
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
     * @return the PageBlobsGetPageRangesNextHeaders object itself.
     */
    public PageBlobsGetPageRangesNextHeaders setXMsClientRequestId(String xMsClientRequestId) {
        this.xMsClientRequestId = xMsClientRequestId;
        return this;
    }

    /**
     * Get the dateProperty property: The Date property.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: The Date property.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the PageBlobsGetPageRangesNextHeaders object itself.
     */
    public PageBlobsGetPageRangesNextHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }
}
