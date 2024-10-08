// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for ServerTrustGroupPropertiesTrustScopesItem.
 */
public final class ServerTrustGroupPropertiesTrustScopesItem
    extends ExpandableStringEnum<ServerTrustGroupPropertiesTrustScopesItem> {
    /**
     * Static value GlobalTransactions for ServerTrustGroupPropertiesTrustScopesItem.
     */
    public static final ServerTrustGroupPropertiesTrustScopesItem GLOBAL_TRANSACTIONS
        = fromString("GlobalTransactions");

    /**
     * Static value ServiceBroker for ServerTrustGroupPropertiesTrustScopesItem.
     */
    public static final ServerTrustGroupPropertiesTrustScopesItem SERVICE_BROKER = fromString("ServiceBroker");

    /**
     * Creates a new instance of ServerTrustGroupPropertiesTrustScopesItem value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ServerTrustGroupPropertiesTrustScopesItem() {
    }

    /**
     * Creates or finds a ServerTrustGroupPropertiesTrustScopesItem from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding ServerTrustGroupPropertiesTrustScopesItem.
     */
    public static ServerTrustGroupPropertiesTrustScopesItem fromString(String name) {
        return fromString(name, ServerTrustGroupPropertiesTrustScopesItem.class);
    }

    /**
     * Gets known ServerTrustGroupPropertiesTrustScopesItem values.
     * 
     * @return known ServerTrustGroupPropertiesTrustScopesItem values.
     */
    public static Collection<ServerTrustGroupPropertiesTrustScopesItem> values() {
        return values(ServerTrustGroupPropertiesTrustScopesItem.class);
    }
}
