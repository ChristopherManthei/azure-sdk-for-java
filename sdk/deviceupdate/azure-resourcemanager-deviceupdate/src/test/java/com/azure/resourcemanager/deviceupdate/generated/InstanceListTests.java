// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.fluent.models.InstanceInner;
import com.azure.resourcemanager.deviceupdate.models.InstanceList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class InstanceListTests {
    @Test
    public void testDeserialize() {
        InstanceList model =
            BinaryData
                .fromString(
                    "{\"nextLink\":\"qduujitcjczdz\",\"value\":[{\"properties\":{\"provisioningState\":\"Deleted\",\"accountName\":\"rwpdappdsbdkvwrw\",\"iotHubs\":[],\"enableDiagnostics\":false},\"location\":\"hutje\",\"tags\":{\"hugjzzdatqxhoc\":\"rl\",\"ozwyiftyhxhuro\":\"geablgphuticndvk\"},\"id\":\"ftyxolniw\",\"name\":\"wcukjfkgiawxk\",\"type\":\"ryplwckbasyypn\"},{\"properties\":{\"provisioningState\":\"Creating\",\"accountName\":\"gcbacphejkot\",\"iotHubs\":[],\"enableDiagnostics\":false},\"location\":\"l\",\"tags\":{\"adgakeqsrxybz\":\"likwyqkgfgib\",\"mnkzsmod\":\"qedqytbciqfoufl\",\"tmut\":\"glougpbk\",\"pwgcuertu\":\"uqktap\"},\"id\":\"kdosvqw\",\"name\":\"bmdg\",\"type\":\"bjf\"}]}")
                .toObject(InstanceList.class);
        Assertions.assertEquals("qduujitcjczdz", model.nextLink());
        Assertions.assertEquals("hutje", model.value().get(0).location());
        Assertions.assertEquals("rl", model.value().get(0).tags().get("hugjzzdatqxhoc"));
        Assertions.assertEquals(false, model.value().get(0).enableDiagnostics());
    }

    @Test
    public void testSerialize() {
        InstanceList model =
            new InstanceList()
                .withNextLink("qduujitcjczdz")
                .withValue(
                    Arrays
                        .asList(
                            new InstanceInner()
                                .withLocation("hutje")
                                .withTags(mapOf("hugjzzdatqxhoc", "rl", "ozwyiftyhxhuro", "geablgphuticndvk"))
                                .withIotHubs(Arrays.asList())
                                .withEnableDiagnostics(false),
                            new InstanceInner()
                                .withLocation("l")
                                .withTags(
                                    mapOf(
                                        "adgakeqsrxybz",
                                        "likwyqkgfgib",
                                        "mnkzsmod",
                                        "qedqytbciqfoufl",
                                        "tmut",
                                        "glougpbk",
                                        "pwgcuertu",
                                        "uqktap"))
                                .withIotHubs(Arrays.asList())
                                .withEnableDiagnostics(false)));
        model = BinaryData.fromObject(model).toObject(InstanceList.class);
        Assertions.assertEquals("qduujitcjczdz", model.nextLink());
        Assertions.assertEquals("hutje", model.value().get(0).location());
        Assertions.assertEquals("rl", model.value().get(0).tags().get("hugjzzdatqxhoc"));
        Assertions.assertEquals(false, model.value().get(0).enableDiagnostics());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
