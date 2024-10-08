// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.desktopvirtualization.DesktopVirtualizationManager;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointConnectionWithSystemData;
import com.azure.resourcemanager.desktopvirtualization.models.PrivateEndpointServiceConnectionStatus;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class PrivateEndpointConnectionsListByHostPoolMockTests {
    @Test
    public void testListByHostPool() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"groupIds\":[\"fifhxwrsnew\",\"ozqvbubqmam\"],\"privateEndpoint\":{\"id\":\"cx\"},\"privateLinkServiceConnectionState\":{\"status\":\"Pending\",\"description\":\"azttaboidvmfq\",\"actionsRequired\":\"pubowsepdfg\"},\"provisioningState\":\"Failed\"},\"id\":\"herngb\",\"name\":\"c\",\"type\":\"uahokq\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        DesktopVirtualizationManager manager = DesktopVirtualizationManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PrivateEndpointConnectionWithSystemData> response = manager.privateEndpointConnections()
            .listByHostPool("yefchnm", "ahmnxhkxjqirw", 1600818034, true, 1057526816, com.azure.core.util.Context.NONE);

        Assertions.assertEquals(PrivateEndpointServiceConnectionStatus.PENDING,
            response.iterator().next().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("azttaboidvmfq",
            response.iterator().next().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("pubowsepdfg",
            response.iterator().next().privateLinkServiceConnectionState().actionsRequired());
    }
}
