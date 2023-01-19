// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.peering.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.peering.fluent.models.PeeringServiceInner;
import com.azure.resourcemanager.peering.models.PeeringServiceSku;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PeeringServiceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PeeringServiceInner model =
            BinaryData
                .fromString(
                    "{\"sku\":{\"name\":\"fbkrvrnsvs\"},\"properties\":{\"peeringServiceLocation\":\"ohxcrsbfova\",\"peeringServiceProvider\":\"ruvw\",\"provisioningState\":\"Failed\",\"providerPrimaryPeeringLocation\":\"fsubcgjbirxbpy\",\"providerBackupPeeringLocation\":\"rfbjf\"},\"location\":\"twss\",\"tags\":{\"vwpm\":\"tpvjzbexilzznfqq\",\"wqytjrybnwjewgdr\":\"taruoujmkcj\",\"doy\":\"ervnaenqpehi\"},\"id\":\"mifthnzdnd\",\"name\":\"l\",\"type\":\"nayqi\"}")
                .toObject(PeeringServiceInner.class);
        Assertions.assertEquals("fbkrvrnsvs", model.sku().name());
        Assertions.assertEquals("twss", model.location());
        Assertions.assertEquals("tpvjzbexilzznfqq", model.tags().get("vwpm"));
        Assertions.assertEquals("ohxcrsbfova", model.peeringServiceLocation());
        Assertions.assertEquals("ruvw", model.peeringServiceProvider());
        Assertions.assertEquals("fsubcgjbirxbpy", model.providerPrimaryPeeringLocation());
        Assertions.assertEquals("rfbjf", model.providerBackupPeeringLocation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PeeringServiceInner model =
            new PeeringServiceInner()
                .withSku(new PeeringServiceSku().withName("fbkrvrnsvs"))
                .withLocation("twss")
                .withTags(mapOf("vwpm", "tpvjzbexilzznfqq", "wqytjrybnwjewgdr", "taruoujmkcj", "doy", "ervnaenqpehi"))
                .withPeeringServiceLocation("ohxcrsbfova")
                .withPeeringServiceProvider("ruvw")
                .withProviderPrimaryPeeringLocation("fsubcgjbirxbpy")
                .withProviderBackupPeeringLocation("rfbjf");
        model = BinaryData.fromObject(model).toObject(PeeringServiceInner.class);
        Assertions.assertEquals("fbkrvrnsvs", model.sku().name());
        Assertions.assertEquals("twss", model.location());
        Assertions.assertEquals("tpvjzbexilzznfqq", model.tags().get("vwpm"));
        Assertions.assertEquals("ohxcrsbfova", model.peeringServiceLocation());
        Assertions.assertEquals("ruvw", model.peeringServiceProvider());
        Assertions.assertEquals("fsubcgjbirxbpy", model.providerPrimaryPeeringLocation());
        Assertions.assertEquals("rfbjf", model.providerBackupPeeringLocation());
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