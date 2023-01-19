// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.servicefabric.models.AzureActiveDirectory;
import org.junit.jupiter.api.Assertions;

public final class AzureActiveDirectoryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureActiveDirectory model =
            BinaryData
                .fromString(
                    "{\"tenantId\":\"cmsxaobhdxbm\",\"clusterApplication\":\"ioq\",\"clientApplication\":\"ehtbm\"}")
                .toObject(AzureActiveDirectory.class);
        Assertions.assertEquals("cmsxaobhdxbm", model.tenantId());
        Assertions.assertEquals("ioq", model.clusterApplication());
        Assertions.assertEquals("ehtbm", model.clientApplication());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureActiveDirectory model =
            new AzureActiveDirectory()
                .withTenantId("cmsxaobhdxbm")
                .withClusterApplication("ioq")
                .withClientApplication("ehtbm");
        model = BinaryData.fromObject(model).toObject(AzureActiveDirectory.class);
        Assertions.assertEquals("cmsxaobhdxbm", model.tenantId());
        Assertions.assertEquals("ioq", model.clusterApplication());
        Assertions.assertEquals("ehtbm", model.clientApplication());
    }
}