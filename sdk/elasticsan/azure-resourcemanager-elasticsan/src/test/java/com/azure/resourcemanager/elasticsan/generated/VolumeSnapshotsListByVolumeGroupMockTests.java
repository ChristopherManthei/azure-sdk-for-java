// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.elasticsan.ElasticSanManager;
import com.azure.resourcemanager.elasticsan.models.Snapshot;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class VolumeSnapshotsListByVolumeGroupMockTests {
    @Test
    public void testListByVolumeGroup() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"creationData\":{\"sourceId\":\"pna\"},\"provisioningState\":\"Deleting\",\"sourceVolumeSizeGiB\":6631545016985545724,\"volumeName\":\"dreaxh\"},\"id\":\"xdrrvqahqkghtp\",\"name\":\"ijnhyjsvfycxzbf\",\"type\":\"oowvrv\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        ElasticSanManager manager = ElasticSanManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Snapshot> response = manager.volumeSnapshots()
            .listByVolumeGroup("lmctlpd", "gitvg", "mhrixkwmyijejve", "rh", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("pna", response.iterator().next().creationData().sourceId());
    }
}
