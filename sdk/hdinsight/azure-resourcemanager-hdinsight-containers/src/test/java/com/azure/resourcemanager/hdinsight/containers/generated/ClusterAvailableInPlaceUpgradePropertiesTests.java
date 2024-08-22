// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterAvailableInPlaceUpgradeProperties;
import com.azure.resourcemanager.hdinsight.containers.models.Severity;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ClusterAvailableInPlaceUpgradePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterAvailableInPlaceUpgradeProperties model = BinaryData.fromString(
            "{\"upgradeType\":\"ClusterAvailableInPlaceUpgradeProperties\",\"description\":\"z\",\"sourceOssVersion\":\"rjvpglydzgkrvqee\",\"sourceClusterVersion\":\"oepry\",\"sourceBuildNumber\":\"nwy\",\"targetOssVersion\":\"zdmovzv\",\"targetClusterVersion\":\"aawzqadfl\",\"targetBuildNumber\":\"ur\",\"componentName\":\"laecxndticok\",\"severity\":\"high\",\"extendedProperties\":\"lqtmldgxob\",\"createdTime\":\"2021-09-19T17:45:42Z\"}")
            .toObject(ClusterAvailableInPlaceUpgradeProperties.class);
        Assertions.assertEquals("z", model.description());
        Assertions.assertEquals("rjvpglydzgkrvqee", model.sourceOssVersion());
        Assertions.assertEquals("oepry", model.sourceClusterVersion());
        Assertions.assertEquals("nwy", model.sourceBuildNumber());
        Assertions.assertEquals("zdmovzv", model.targetOssVersion());
        Assertions.assertEquals("aawzqadfl", model.targetClusterVersion());
        Assertions.assertEquals("ur", model.targetBuildNumber());
        Assertions.assertEquals("laecxndticok", model.componentName());
        Assertions.assertEquals(Severity.HIGH, model.severity());
        Assertions.assertEquals("lqtmldgxob", model.extendedProperties());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-19T17:45:42Z"), model.createdTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterAvailableInPlaceUpgradeProperties model
            = new ClusterAvailableInPlaceUpgradeProperties().withDescription("z")
                .withSourceOssVersion("rjvpglydzgkrvqee")
                .withSourceClusterVersion("oepry")
                .withSourceBuildNumber("nwy")
                .withTargetOssVersion("zdmovzv")
                .withTargetClusterVersion("aawzqadfl")
                .withTargetBuildNumber("ur")
                .withComponentName("laecxndticok")
                .withSeverity(Severity.HIGH)
                .withExtendedProperties("lqtmldgxob")
                .withCreatedTime(OffsetDateTime.parse("2021-09-19T17:45:42Z"));
        model = BinaryData.fromObject(model).toObject(ClusterAvailableInPlaceUpgradeProperties.class);
        Assertions.assertEquals("z", model.description());
        Assertions.assertEquals("rjvpglydzgkrvqee", model.sourceOssVersion());
        Assertions.assertEquals("oepry", model.sourceClusterVersion());
        Assertions.assertEquals("nwy", model.sourceBuildNumber());
        Assertions.assertEquals("zdmovzv", model.targetOssVersion());
        Assertions.assertEquals("aawzqadfl", model.targetClusterVersion());
        Assertions.assertEquals("ur", model.targetBuildNumber());
        Assertions.assertEquals("laecxndticok", model.componentName());
        Assertions.assertEquals(Severity.HIGH, model.severity());
        Assertions.assertEquals("lqtmldgxob", model.extendedProperties());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-19T17:45:42Z"), model.createdTime());
    }
}
