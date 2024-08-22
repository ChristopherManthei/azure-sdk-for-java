// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterInstanceViewPropertiesStatus;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterInstanceViewResultProperties;
import com.azure.resourcemanager.hdinsight.containers.models.ServiceStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClusterInstanceViewResultPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterInstanceViewResultProperties model = BinaryData.fromString(
            "{\"status\":{\"ready\":\"hfstotxhojujbyp\",\"reason\":\"mc\",\"message\":\"hixbjxyfwnyl\"},\"serviceStatuses\":[{\"kind\":\"ool\",\"ready\":\"ttpkiwkkbnujrywv\",\"message\":\"lbfpncurd\"},{\"kind\":\"iwii\",\"ready\":\"htywubxcbihwq\",\"message\":\"fdntwjchrdgoih\"},{\"kind\":\"umwctondz\",\"ready\":\"luudfdlwggytsb\",\"message\":\"ovvtgseinqfiu\"},{\"kind\":\"x\",\"ready\":\"knpirgnepttwq\",\"message\":\"niffcdmqnroj\"}]}")
            .toObject(ClusterInstanceViewResultProperties.class);
        Assertions.assertEquals("hfstotxhojujbyp", model.status().ready());
        Assertions.assertEquals("mc", model.status().reason());
        Assertions.assertEquals("hixbjxyfwnyl", model.status().message());
        Assertions.assertEquals("ool", model.serviceStatuses().get(0).kind());
        Assertions.assertEquals("ttpkiwkkbnujrywv", model.serviceStatuses().get(0).ready());
        Assertions.assertEquals("lbfpncurd", model.serviceStatuses().get(0).message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterInstanceViewResultProperties model = new ClusterInstanceViewResultProperties()
            .withStatus(new ClusterInstanceViewPropertiesStatus().withReady("hfstotxhojujbyp")
                .withReason("mc")
                .withMessage("hixbjxyfwnyl"))
            .withServiceStatuses(Arrays.asList(
                new ServiceStatus().withKind("ool").withReady("ttpkiwkkbnujrywv").withMessage("lbfpncurd"),
                new ServiceStatus().withKind("iwii").withReady("htywubxcbihwq").withMessage("fdntwjchrdgoih"),
                new ServiceStatus().withKind("umwctondz").withReady("luudfdlwggytsb").withMessage("ovvtgseinqfiu"),
                new ServiceStatus().withKind("x").withReady("knpirgnepttwq").withMessage("niffcdmqnroj")));
        model = BinaryData.fromObject(model).toObject(ClusterInstanceViewResultProperties.class);
        Assertions.assertEquals("hfstotxhojujbyp", model.status().ready());
        Assertions.assertEquals("mc", model.status().reason());
        Assertions.assertEquals("hixbjxyfwnyl", model.status().message());
        Assertions.assertEquals("ool", model.serviceStatuses().get(0).kind());
        Assertions.assertEquals("ttpkiwkkbnujrywv", model.serviceStatuses().get(0).ready());
        Assertions.assertEquals("lbfpncurd", model.serviceStatuses().get(0).message());
    }
}
