// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.DataVersionBase;
import com.azure.resourcemanager.machinelearning.models.ListViewType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RegistryDataVersionsListMockTests {
    @Test
    public void testList() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"dataType\":\"DataVersionBaseProperties\",\"dataUri\":\"czzunfnbphceeiv\",\"isArchived\":true,\"isAnonymous\":true,\"description\":\"pghcnuqhqpvt\",\"tags\":{\"ga\":\"fscl\",\"zjuzvw\":\"ygntbfytnhdnihu\"},\"properties\":{\"biwny\":\"dto\",\"objzr\":\"zdpxctsucrxdte\",\"ltyl\":\"wtidcnzalgmpupj\",\"p\":\"uudvbgvzlzjsb\"}},\"id\":\"tzaziydpoknseaim\",\"name\":\"dqraokdarluobbva\",\"type\":\"qwzknyujxy\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MachineLearningManager manager = MachineLearningManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<DataVersionBase> response = manager.registryDataVersions()
            .list("fzhzzcarciuo", "yipdthjfvnh", "sgnspu", "felfchnuf", 336300860, "jgbfbba", "h", ListViewType.ALL,
                com.azure.core.util.Context.NONE);

        Assertions.assertEquals("pghcnuqhqpvt", response.iterator().next().properties().description());
        Assertions.assertEquals("fscl", response.iterator().next().properties().tags().get("ga"));
        Assertions.assertEquals("dto", response.iterator().next().properties().properties().get("biwny"));
        Assertions.assertEquals(true, response.iterator().next().properties().isArchived());
        Assertions.assertEquals(true, response.iterator().next().properties().isAnonymous());
        Assertions.assertEquals("czzunfnbphceeiv", response.iterator().next().properties().dataUri());
    }
}
