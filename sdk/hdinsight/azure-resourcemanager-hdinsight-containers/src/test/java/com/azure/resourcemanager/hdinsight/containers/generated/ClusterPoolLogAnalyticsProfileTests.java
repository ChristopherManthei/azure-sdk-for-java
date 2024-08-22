// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolLogAnalyticsProfile;
import org.junit.jupiter.api.Assertions;

public final class ClusterPoolLogAnalyticsProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPoolLogAnalyticsProfile model = BinaryData.fromString("{\"enabled\":true,\"workspaceId\":\"jkot\"}")
            .toObject(ClusterPoolLogAnalyticsProfile.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("jkot", model.workspaceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPoolLogAnalyticsProfile model
            = new ClusterPoolLogAnalyticsProfile().withEnabled(true).withWorkspaceId("jkot");
        model = BinaryData.fromObject(model).toObject(ClusterPoolLogAnalyticsProfile.class);
        Assertions.assertEquals(true, model.enabled());
        Assertions.assertEquals("jkot", model.workspaceId());
    }
}
