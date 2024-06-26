// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.selfhelp.SelfHelpManager;
import com.azure.resourcemanager.selfhelp.models.DiscoveryNlpRequest;
import com.azure.resourcemanager.selfhelp.models.DiscoveryNlpResponse;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class DiscoverySolutionNlpSubscriptionScopesPostWithResponseMockTests {
    @Test
    public void testPostWithResponse() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"problemTitle\":\"ivsiy\",\"problemDescription\":\"kdncj\",\"serviceId\":\"onbzoggculapzwy\",\"problemClassificationId\":\"gogtqxepnylbf\",\"solutions\":[{},{},{}],\"relatedServices\":[{}]},\"id\":\"tlvofq\",\"name\":\"hvfcibyfmow\",\"type\":\"xrkjpvdw\"},{\"properties\":{\"problemTitle\":\"wiivwzjbhyzsx\",\"problemDescription\":\"kambtrnegvmnvuqe\",\"serviceId\":\"lds\",\"problemClassificationId\":\"stjbkkdmfl\",\"solutions\":[{},{},{}],\"relatedServices\":[{},{},{},{}]},\"id\":\"lx\",\"name\":\"ril\",\"type\":\"zapeewchpx\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SelfHelpManager manager = SelfHelpManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        DiscoveryNlpResponse response = manager.discoverySolutionNlpSubscriptionScopes()
            .postWithResponse(new DiscoveryNlpRequest().withIssueSummary("ddrihpf")
                .withResourceId("qcaaewdaomdjvl")
                .withServiceId("x")
                .withAdditionalContext("zb"), com.azure.core.util.Context.NONE)
            .getValue();

        Assertions.assertEquals("ivsiy", response.value().get(0).problemTitle());
        Assertions.assertEquals("kdncj", response.value().get(0).problemDescription());
        Assertions.assertEquals("onbzoggculapzwy", response.value().get(0).serviceId());
        Assertions.assertEquals("gogtqxepnylbf", response.value().get(0).problemClassificationId());
    }
}
