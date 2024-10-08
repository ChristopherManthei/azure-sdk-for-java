// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.SparkJobScalaEntry;
import org.junit.jupiter.api.Assertions;

public final class SparkJobScalaEntryTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SparkJobScalaEntry model
            = BinaryData.fromString("{\"sparkJobEntryType\":\"SparkJobScalaEntry\",\"className\":\"fkvuozb\"}")
                .toObject(SparkJobScalaEntry.class);
        Assertions.assertEquals("fkvuozb", model.className());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SparkJobScalaEntry model = new SparkJobScalaEntry().withClassName("fkvuozb");
        model = BinaryData.fromObject(model).toObject(SparkJobScalaEntry.class);
        Assertions.assertEquals("fkvuozb", model.className());
    }
}
