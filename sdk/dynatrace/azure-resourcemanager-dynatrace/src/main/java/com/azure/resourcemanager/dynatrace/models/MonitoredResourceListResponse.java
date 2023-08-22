// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dynatrace.fluent.models.MonitoredResourceInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of all the resources being monitored by Dynatrace monitor resource. */
@Fluent
public final class MonitoredResourceListResponse {
    /*
     * The items on this page
     */
    @JsonProperty(value = "value")
    private List<MonitoredResourceInner> value;

    /*
     * The link to the next page of items
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of MonitoredResourceListResponse class. */
    public MonitoredResourceListResponse() {
    }

    /**
     * Get the value property: The items on this page.
     *
     * @return the value value.
     */
    public List<MonitoredResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The items on this page.
     *
     * @param value the value value to set.
     * @return the MonitoredResourceListResponse object itself.
     */
    public MonitoredResourceListResponse withValue(List<MonitoredResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of items.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of items.
     *
     * @param nextLink the nextLink value to set.
     * @return the MonitoredResourceListResponse object itself.
     */
    public MonitoredResourceListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
