// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterInstanceViewPropertiesStatus;
import org.junit.jupiter.api.Assertions;

public final class ClusterInstanceViewPropertiesStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterInstanceViewPropertiesStatus model
            = BinaryData.fromString("{\"ready\":\"thrrgh\",\"reason\":\"bdhqxvcxgf\",\"message\":\"dsofbshrns\"}")
                .toObject(ClusterInstanceViewPropertiesStatus.class);
        Assertions.assertEquals("thrrgh", model.ready());
        Assertions.assertEquals("bdhqxvcxgf", model.reason());
        Assertions.assertEquals("dsofbshrns", model.message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterInstanceViewPropertiesStatus model = new ClusterInstanceViewPropertiesStatus().withReady("thrrgh")
            .withReason("bdhqxvcxgf")
            .withMessage("dsofbshrns");
        model = BinaryData.fromObject(model).toObject(ClusterInstanceViewPropertiesStatus.class);
        Assertions.assertEquals("thrrgh", model.ready());
        Assertions.assertEquals("bdhqxvcxgf", model.reason());
        Assertions.assertEquals("dsofbshrns", model.message());
    }
}
