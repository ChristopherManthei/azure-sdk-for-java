// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterUpgradeHistoryInner;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterUpgradeHistoryProperties;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterUpgradeHistoryUpgradeResultType;
import org.junit.jupiter.api.Assertions;

public final class ClusterUpgradeHistoryInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterUpgradeHistoryInner model = BinaryData.fromString(
            "{\"properties\":{\"upgradeType\":\"ClusterUpgradeHistoryProperties\",\"utcTime\":\"tllxdyhgsyocogj\",\"upgradeResult\":\"Failed\"},\"id\":\"tbnnha\",\"name\":\"oocrkvcikhnv\",\"type\":\"amqgxqquezikyw\"}")
            .toObject(ClusterUpgradeHistoryInner.class);
        Assertions.assertEquals("tllxdyhgsyocogj", model.properties().utcTime());
        Assertions.assertEquals(ClusterUpgradeHistoryUpgradeResultType.FAILED, model.properties().upgradeResult());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterUpgradeHistoryInner model = new ClusterUpgradeHistoryInner()
            .withProperties(new ClusterUpgradeHistoryProperties().withUtcTime("tllxdyhgsyocogj")
                .withUpgradeResult(ClusterUpgradeHistoryUpgradeResultType.FAILED));
        model = BinaryData.fromObject(model).toObject(ClusterUpgradeHistoryInner.class);
        Assertions.assertEquals("tllxdyhgsyocogj", model.properties().utcTime());
        Assertions.assertEquals(ClusterUpgradeHistoryUpgradeResultType.FAILED, model.properties().upgradeResult());
    }
}
