// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.logic.fluent.models.ApiOperationInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list of managed API operations. */
@Fluent
public final class ApiOperationListResult {
    /*
     * The api operation definitions for an API.
     */
    @JsonProperty(value = "value")
    private List<ApiOperationInner> value;

    /*
     * The URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /** Creates an instance of ApiOperationListResult class. */
    public ApiOperationListResult() {
    }

    /**
     * Get the value property: The api operation definitions for an API.
     *
     * @return the value value.
     */
    public List<ApiOperationInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The api operation definitions for an API.
     *
     * @param value the value value to set.
     * @return the ApiOperationListResult object itself.
     */
    public ApiOperationListResult withValue(List<ApiOperationInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the ApiOperationListResult object itself.
     */
    public ApiOperationListResult withNextLink(String nextLink) {
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
