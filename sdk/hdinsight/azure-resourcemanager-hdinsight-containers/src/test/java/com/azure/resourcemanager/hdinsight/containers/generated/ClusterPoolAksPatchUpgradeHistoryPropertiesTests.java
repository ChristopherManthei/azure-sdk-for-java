// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolAksPatchUpgradeHistoryProperties;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolUpgradeHistoryUpgradeResultType;
import org.junit.jupiter.api.Assertions;

public final class ClusterPoolAksPatchUpgradeHistoryPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPoolAksPatchUpgradeHistoryProperties model = BinaryData.fromString(
            "{\"upgradeType\":\"AKSPatchUpgrade\",\"upgradeClusterPool\":true,\"upgradeAllClusterNodes\":true,\"originalVersion\":\"xvd\",\"newVersion\":\"fwafqrouda\",\"utcTime\":\"pavehhr\",\"upgradeResult\":\"Succeed\"}")
            .toObject(ClusterPoolAksPatchUpgradeHistoryProperties.class);
        Assertions.assertEquals("pavehhr", model.utcTime());
        Assertions.assertEquals(ClusterPoolUpgradeHistoryUpgradeResultType.SUCCEED, model.upgradeResult());
        Assertions.assertEquals(true, model.upgradeClusterPool());
        Assertions.assertEquals(true, model.upgradeAllClusterNodes());
        Assertions.assertEquals("xvd", model.originalVersion());
        Assertions.assertEquals("fwafqrouda", model.newVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPoolAksPatchUpgradeHistoryProperties model
            = new ClusterPoolAksPatchUpgradeHistoryProperties().withUtcTime("pavehhr")
                .withUpgradeResult(ClusterPoolUpgradeHistoryUpgradeResultType.SUCCEED)
                .withUpgradeClusterPool(true)
                .withUpgradeAllClusterNodes(true)
                .withOriginalVersion("xvd")
                .withNewVersion("fwafqrouda");
        model = BinaryData.fromObject(model).toObject(ClusterPoolAksPatchUpgradeHistoryProperties.class);
        Assertions.assertEquals("pavehhr", model.utcTime());
        Assertions.assertEquals(ClusterPoolUpgradeHistoryUpgradeResultType.SUCCEED, model.upgradeResult());
        Assertions.assertEquals(true, model.upgradeClusterPool());
        Assertions.assertEquals(true, model.upgradeAllClusterNodes());
        Assertions.assertEquals("xvd", model.originalVersion());
        Assertions.assertEquals("fwafqrouda", model.newVersion());
    }
}
