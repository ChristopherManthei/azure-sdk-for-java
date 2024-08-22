// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterAksPatchUpgradeHistoryProperties;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterUpgradeHistoryUpgradeResultType;
import org.junit.jupiter.api.Assertions;

public final class ClusterAksPatchUpgradeHistoryPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterAksPatchUpgradeHistoryProperties model = BinaryData.fromString(
            "{\"upgradeType\":\"AKSPatchUpgrade\",\"originalVersion\":\"wnpjhlfzswpchwa\",\"newVersion\":\"bousn\",\"utcTime\":\"epgfew\",\"upgradeResult\":\"Succeed\"}")
            .toObject(ClusterAksPatchUpgradeHistoryProperties.class);
        Assertions.assertEquals("epgfew", model.utcTime());
        Assertions.assertEquals(ClusterUpgradeHistoryUpgradeResultType.SUCCEED, model.upgradeResult());
        Assertions.assertEquals("wnpjhlfzswpchwa", model.originalVersion());
        Assertions.assertEquals("bousn", model.newVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterAksPatchUpgradeHistoryProperties model
            = new ClusterAksPatchUpgradeHistoryProperties().withUtcTime("epgfew")
                .withUpgradeResult(ClusterUpgradeHistoryUpgradeResultType.SUCCEED)
                .withOriginalVersion("wnpjhlfzswpchwa")
                .withNewVersion("bousn");
        model = BinaryData.fromObject(model).toObject(ClusterAksPatchUpgradeHistoryProperties.class);
        Assertions.assertEquals("epgfew", model.utcTime());
        Assertions.assertEquals(ClusterUpgradeHistoryUpgradeResultType.SUCCEED, model.upgradeResult());
        Assertions.assertEquals("wnpjhlfzswpchwa", model.originalVersion());
        Assertions.assertEquals("bousn", model.newVersion());
    }
}
