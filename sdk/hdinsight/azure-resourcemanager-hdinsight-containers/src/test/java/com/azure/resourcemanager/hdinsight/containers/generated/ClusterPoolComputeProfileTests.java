// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPoolComputeProfile;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClusterPoolComputeProfileTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterPoolComputeProfile model = BinaryData.fromString(
            "{\"vmSize\":\"ooginuvamih\",\"count\":774982264,\"availabilityZones\":[\"rxzxtheo\",\"usivye\",\"cciqihnhungbwjz\"]}")
            .toObject(ClusterPoolComputeProfile.class);
        Assertions.assertEquals("ooginuvamih", model.vmSize());
        Assertions.assertEquals("rxzxtheo", model.availabilityZones().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterPoolComputeProfile model = new ClusterPoolComputeProfile().withVmSize("ooginuvamih")
            .withAvailabilityZones(Arrays.asList("rxzxtheo", "usivye", "cciqihnhungbwjz"));
        model = BinaryData.fromObject(model).toObject(ClusterPoolComputeProfile.class);
        Assertions.assertEquals("ooginuvamih", model.vmSize());
        Assertions.assertEquals("rxzxtheo", model.availabilityZones().get(0));
    }
}
