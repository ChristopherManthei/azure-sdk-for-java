// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.netapp.models.VolumeBackups;
import org.junit.jupiter.api.Assertions;

public final class VolumeBackupsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeBackups model = BinaryData.fromString(
            "{\"volumeName\":\"bzkdvn\",\"volumeResourceId\":\"abudurgk\",\"backupsCount\":289225140,\"policyEnabled\":false}")
            .toObject(VolumeBackups.class);
        Assertions.assertEquals("bzkdvn", model.volumeName());
        Assertions.assertEquals("abudurgk", model.volumeResourceId());
        Assertions.assertEquals(289225140, model.backupsCount());
        Assertions.assertEquals(false, model.policyEnabled());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeBackups model = new VolumeBackups().withVolumeName("bzkdvn")
            .withVolumeResourceId("abudurgk")
            .withBackupsCount(289225140)
            .withPolicyEnabled(false);
        model = BinaryData.fromObject(model).toObject(VolumeBackups.class);
        Assertions.assertEquals("bzkdvn", model.volumeName());
        Assertions.assertEquals("abudurgk", model.volumeResourceId());
        Assertions.assertEquals(289225140, model.backupsCount());
        Assertions.assertEquals(false, model.policyEnabled());
    }
}
