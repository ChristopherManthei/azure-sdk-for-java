// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.avs.fluent.models.ScriptPackageProperties;

public final class ScriptPackagePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptPackageProperties model =
            BinaryData
                .fromString(
                    "{\"description\":\"nuuzkopbm\",\"version\":\"rfdwoyu\",\"company\":\"ziuiefozbhdm\",\"uri\":\"l\"}")
                .toObject(ScriptPackageProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptPackageProperties model = new ScriptPackageProperties();
        model = BinaryData.fromObject(model).toObject(ScriptPackageProperties.class);
    }
}