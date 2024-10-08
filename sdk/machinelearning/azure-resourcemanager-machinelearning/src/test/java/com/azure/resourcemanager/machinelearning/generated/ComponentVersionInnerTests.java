// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.ComponentVersionInner;
import com.azure.resourcemanager.machinelearning.models.ComponentVersionProperties;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ComponentVersionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComponentVersionInner model = BinaryData.fromString(
            "{\"properties\":{\"componentSpec\":\"datauaibrebqaaysj\",\"provisioningState\":\"Canceled\",\"isArchived\":true,\"isAnonymous\":true,\"description\":\"tezlwff\",\"tags\":{\"qqmtedltmmji\":\"kpj\",\"upkvipmdsc\":\"yeozphvwauyqncy\",\"totxhojujb\":\"xqupevzhf\",\"n\":\"pelmcuvhixbjxyf\"},\"properties\":{\"ujrywvtyl\":\"coolsttpkiwkkb\"}},\"id\":\"pncur\",\"name\":\"oiwiithtywub\",\"type\":\"cbihwqk\"}")
            .toObject(ComponentVersionInner.class);
        Assertions.assertEquals("tezlwff", model.properties().description());
        Assertions.assertEquals("kpj", model.properties().tags().get("qqmtedltmmji"));
        Assertions.assertEquals("coolsttpkiwkkb", model.properties().properties().get("ujrywvtyl"));
        Assertions.assertEquals(true, model.properties().isArchived());
        Assertions.assertEquals(true, model.properties().isAnonymous());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComponentVersionInner model
            = new ComponentVersionInner().withProperties(new ComponentVersionProperties().withDescription("tezlwff")
                .withTags(mapOf("qqmtedltmmji", "kpj", "upkvipmdsc", "yeozphvwauyqncy", "totxhojujb", "xqupevzhf", "n",
                    "pelmcuvhixbjxyf"))
                .withProperties(mapOf("ujrywvtyl", "coolsttpkiwkkb"))
                .withIsArchived(true)
                .withIsAnonymous(true)
                .withComponentSpec("datauaibrebqaaysj"));
        model = BinaryData.fromObject(model).toObject(ComponentVersionInner.class);
        Assertions.assertEquals("tezlwff", model.properties().description());
        Assertions.assertEquals("kpj", model.properties().tags().get("qqmtedltmmji"));
        Assertions.assertEquals("coolsttpkiwkkb", model.properties().properties().get("ujrywvtyl"));
        Assertions.assertEquals(true, model.properties().isArchived());
        Assertions.assertEquals(true, model.properties().isAnonymous());
    }

    // Use "Map.of" if available
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
