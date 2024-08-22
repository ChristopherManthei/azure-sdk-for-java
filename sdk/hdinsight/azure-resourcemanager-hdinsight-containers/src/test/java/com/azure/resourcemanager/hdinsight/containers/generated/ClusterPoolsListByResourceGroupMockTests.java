// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterPool;
import com.azure.resourcemanager.hdinsight.containers.models.OutboundType;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ClusterPoolsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"deploymentId\":\"ytnrzvuljraae\",\"managedResourceGroupName\":\"nok\",\"aksManagedResourceGroupName\":\"ukkjqnvbroyla\",\"clusterPoolProfile\":{\"clusterPoolVersion\":\"ulcdisdosf\",\"publicIpTag\":{\"ipTagType\":\"jsvg\",\"tag\":\"rwhryvycytd\"}},\"computeProfile\":{\"vmSize\":\"lxgccknfnwmbtm\",\"count\":166285139,\"availabilityZones\":[\"dhttzaefedxihchr\",\"hk\",\"crjdqnsdfzpbgtg\",\"ylkdghrje\"]},\"aksClusterProfile\":{\"aksClusterResourceId\":\"lwxezwzhokvbwnh\",\"aksClusterAgentPoolIdentityProfile\":{\"msiResourceId\":\"qlgehg\",\"msiClientId\":\"pipifh\",\"msiObjectId\":\"f\"},\"aksVersion\":\"ajvgcxtxjcsheafi\"},\"networkProfile\":{\"subnetId\":\"tugsresmkssjh\",\"outboundType\":\"loadBalancer\",\"enablePrivateApiServer\":true,\"apiServerAuthorizedIpRanges\":[\"fwegprhptillu\",\"biqtgdq\",\"hm\",\"wsldrizetpwbr\"]},\"logAnalyticsProfile\":{\"enabled\":true,\"workspaceId\":\"ibph\"},\"status\":\"zmizakakan\"},\"location\":\"p\",\"tags\":{\"xprimrsop\":\"zhajoylhjlmuo\",\"stvasylwxdzaumw\":\"eecjmeis\"},\"id\":\"oohgu\",\"name\":\"fuzboyjathwtzolb\",\"type\":\"emwmdxmebwjs\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        HDInsightContainersManager manager = HDInsightContainersManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<ClusterPool> response
            = manager.clusterPools().listByResourceGroup("knh", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("p", response.iterator().next().location());
        Assertions.assertEquals("zhajoylhjlmuo", response.iterator().next().tags().get("xprimrsop"));
        Assertions.assertEquals("nok", response.iterator().next().properties().managedResourceGroupName());
        Assertions.assertEquals("ulcdisdosf",
            response.iterator().next().properties().clusterPoolProfile().clusterPoolVersion());
        Assertions.assertEquals("jsvg",
            response.iterator().next().properties().clusterPoolProfile().publicIpTag().ipTagType());
        Assertions.assertEquals("rwhryvycytd",
            response.iterator().next().properties().clusterPoolProfile().publicIpTag().tag());
        Assertions.assertEquals("lxgccknfnwmbtm", response.iterator().next().properties().computeProfile().vmSize());
        Assertions.assertEquals("dhttzaefedxihchr",
            response.iterator().next().properties().computeProfile().availabilityZones().get(0));
        Assertions.assertEquals("tugsresmkssjh", response.iterator().next().properties().networkProfile().subnetId());
        Assertions.assertEquals(OutboundType.LOAD_BALANCER,
            response.iterator().next().properties().networkProfile().outboundType());
        Assertions.assertEquals(true,
            response.iterator().next().properties().networkProfile().enablePrivateApiServer());
        Assertions.assertEquals("fwegprhptillu",
            response.iterator().next().properties().networkProfile().apiServerAuthorizedIpRanges().get(0));
        Assertions.assertEquals(true, response.iterator().next().properties().logAnalyticsProfile().enabled());
        Assertions.assertEquals("ibph", response.iterator().next().properties().logAnalyticsProfile().workspaceId());
    }
}
