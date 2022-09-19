// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The authentication type to use. */
public final class ServiceNowAuthenticationType extends ExpandableStringEnum<ServiceNowAuthenticationType> {
    /** Static value Basic for ServiceNowAuthenticationType. */
    public static final ServiceNowAuthenticationType BASIC = fromString("Basic");

    /** Static value OAuth2 for ServiceNowAuthenticationType. */
    public static final ServiceNowAuthenticationType OAUTH2 = fromString("OAuth2");

    /**
     * Creates or finds a ServiceNowAuthenticationType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ServiceNowAuthenticationType.
     */
    @JsonCreator
    public static ServiceNowAuthenticationType fromString(String name) {
        return fromString(name, ServiceNowAuthenticationType.class);
    }

    /**
     * Gets known ServiceNowAuthenticationType values.
     *
     * @return known ServiceNowAuthenticationType values.
     */
    public static Collection<ServiceNowAuthenticationType> values() {
        return values(ServiceNowAuthenticationType.class);
    }
}
