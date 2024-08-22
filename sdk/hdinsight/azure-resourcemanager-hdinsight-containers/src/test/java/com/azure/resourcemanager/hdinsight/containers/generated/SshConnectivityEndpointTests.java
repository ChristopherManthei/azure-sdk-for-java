// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.SshConnectivityEndpoint;
import org.junit.jupiter.api.Assertions;

public final class SshConnectivityEndpointTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SshConnectivityEndpoint model
            = BinaryData.fromString("{\"endpoint\":\"ppcqeqxolz\",\"privateSshEndpoint\":\"hzxct\"}")
                .toObject(SshConnectivityEndpoint.class);
        Assertions.assertEquals("ppcqeqxolz", model.endpoint());
        Assertions.assertEquals("hzxct", model.privateSshEndpoint());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SshConnectivityEndpoint model
            = new SshConnectivityEndpoint().withEndpoint("ppcqeqxolz").withPrivateSshEndpoint("hzxct");
        model = BinaryData.fromObject(model).toObject(SshConnectivityEndpoint.class);
        Assertions.assertEquals("ppcqeqxolz", model.endpoint());
        Assertions.assertEquals("hzxct", model.privateSshEndpoint());
    }
}
