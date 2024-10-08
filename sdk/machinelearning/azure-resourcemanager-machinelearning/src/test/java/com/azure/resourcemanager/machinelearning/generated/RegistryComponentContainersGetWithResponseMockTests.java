// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.machinelearning.MachineLearningManager;
import com.azure.resourcemanager.machinelearning.models.ComponentContainer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class RegistryComponentContainersGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        String responseStr
            = "{\"properties\":{\"provisioningState\":\"Canceled\",\"isArchived\":false,\"latestVersion\":\"kgbtqq\",\"nextVersion\":\"bsynne\",\"description\":\"onjqhdheosx\",\"tags\":{\"tcwgpdbbgla\":\"udmpfhwypphtjt\",\"ds\":\"cctokfspvj\",\"ftyptwjwiyyeo\":\"kvrmp\"},\"properties\":{\"fzzi\":\"cmdjmvphwfnugsl\"}},\"id\":\"bgomvue\",\"name\":\"r\",\"type\":\"m\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        MachineLearningManager manager = MachineLearningManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        ComponentContainer response = manager.registryComponentContainers()
            .getWithResponse("twk", "jdpayx", "pqiwuzr", com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("onjqhdheosx", response.properties().description());
        Assertions.assertEquals("udmpfhwypphtjt", response.properties().tags().get("tcwgpdbbgla"));
        Assertions.assertEquals("cmdjmvphwfnugsl", response.properties().properties().get("fzzi"));
        Assertions.assertEquals(false, response.properties().isArchived());
    }
}
