// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.fluent.models.AzureMonitorResponseInner;
import com.azure.resourcemanager.hdinsight.models.AzureMonitorSelectedConfigurations;
import com.azure.resourcemanager.hdinsight.models.AzureMonitorTableConfiguration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureMonitorResponseInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMonitorResponseInner model = BinaryData.fromString(
            "{\"clusterMonitoringEnabled\":false,\"workspaceId\":\"dtlwwrlkd\",\"selectedConfigurations\":{\"configurationVersion\":\"cvokotllxdyhg\",\"globalConfigurations\":{\"hadoocrk\":\"cogjltdtbn\",\"amqgxqquezikyw\":\"cikhnv\"},\"tableList\":[{\"name\":\"allatmelwuipic\"},{\"name\":\"zkzivgvvcnay\"}]}}")
            .toObject(AzureMonitorResponseInner.class);
        Assertions.assertEquals(false, model.clusterMonitoringEnabled());
        Assertions.assertEquals("dtlwwrlkd", model.workspaceId());
        Assertions.assertEquals("cvokotllxdyhg", model.selectedConfigurations().configurationVersion());
        Assertions.assertEquals("cogjltdtbn", model.selectedConfigurations().globalConfigurations().get("hadoocrk"));
        Assertions.assertEquals("allatmelwuipic", model.selectedConfigurations().tableList().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMonitorResponseInner model = new AzureMonitorResponseInner().withClusterMonitoringEnabled(false)
            .withWorkspaceId("dtlwwrlkd")
            .withSelectedConfigurations(
                new AzureMonitorSelectedConfigurations().withConfigurationVersion("cvokotllxdyhg")
                    .withGlobalConfigurations(mapOf("hadoocrk", "cogjltdtbn", "amqgxqquezikyw", "cikhnv"))
                    .withTableList(Arrays.asList(new AzureMonitorTableConfiguration().withName("allatmelwuipic"),
                        new AzureMonitorTableConfiguration().withName("zkzivgvvcnay"))));
        model = BinaryData.fromObject(model).toObject(AzureMonitorResponseInner.class);
        Assertions.assertEquals(false, model.clusterMonitoringEnabled());
        Assertions.assertEquals("dtlwwrlkd", model.workspaceId());
        Assertions.assertEquals("cvokotllxdyhg", model.selectedConfigurations().configurationVersion());
        Assertions.assertEquals("cogjltdtbn", model.selectedConfigurations().globalConfigurations().get("hadoocrk"));
        Assertions.assertEquals("allatmelwuipic", model.selectedConfigurations().tableList().get(0).name());
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
