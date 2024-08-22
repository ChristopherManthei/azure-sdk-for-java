// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.KafkaConnectivityEndpoints;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class KafkaConnectivityEndpointsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        KafkaConnectivityEndpoints model = BinaryData.fromString(
            "{\"bootstrapServerEndpoint\":\"wyhzdx\",\"brokerEndpoints\":[\"dbzm\",\"vdfznudaodvxzb\",\"cblylpstdbhhxsr\",\"dzu\"]}")
            .toObject(KafkaConnectivityEndpoints.class);
        Assertions.assertEquals("wyhzdx", model.bootstrapServerEndpoint());
        Assertions.assertEquals("dbzm", model.brokerEndpoints().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        KafkaConnectivityEndpoints model = new KafkaConnectivityEndpoints().withBootstrapServerEndpoint("wyhzdx")
            .withBrokerEndpoints(Arrays.asList("dbzm", "vdfznudaodvxzb", "cblylpstdbhhxsr", "dzu"));
        model = BinaryData.fromObject(model).toObject(KafkaConnectivityEndpoints.class);
        Assertions.assertEquals("wyhzdx", model.bootstrapServerEndpoint());
        Assertions.assertEquals("dbzm", model.brokerEndpoints().get(0));
    }
}
