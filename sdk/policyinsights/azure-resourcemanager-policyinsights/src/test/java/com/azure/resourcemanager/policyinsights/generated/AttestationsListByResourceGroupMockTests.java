// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.models.Attestation;
import com.azure.resourcemanager.policyinsights.models.ComplianceState;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AttestationsListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"policyAssignmentId\":\"lvawuwzdufypivls\",\"policyDefinitionReferenceId\":\"jpmcub\",\"complianceState\":\"Unknown\",\"expiresOn\":\"2021-07-29T14:39:53Z\",\"owner\":\"xkubvphavpmhbrbq\",\"comments\":\"govpbbtte\",\"evidence\":[],\"provisioningState\":\"nssqyzqed\",\"lastComplianceStateChangeAt\":\"2021-10-13T23:43:06Z\",\"assessmentDate\":\"2021-01-29T08:56:47Z\"},\"id\":\"iqmrjgeihfqlggw\",\"name\":\"iwzcxmjpbyeph\",\"type\":\"gt\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        PolicyInsightsManager manager =
            PolicyInsightsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Attestation> response =
            manager.attestations().listByResourceGroup("hoi", 1606932305, "wgniipr", Context.NONE);

        Assertions.assertEquals("lvawuwzdufypivls", response.iterator().next().policyAssignmentId());
        Assertions.assertEquals("jpmcub", response.iterator().next().policyDefinitionReferenceId());
        Assertions.assertEquals(ComplianceState.UNKNOWN, response.iterator().next().complianceState());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-29T14:39:53Z"), response.iterator().next().expiresOn());
        Assertions.assertEquals("xkubvphavpmhbrbq", response.iterator().next().owner());
        Assertions.assertEquals("govpbbtte", response.iterator().next().comments());
        Assertions
            .assertEquals(OffsetDateTime.parse("2021-01-29T08:56:47Z"), response.iterator().next().assessmentDate());
    }
}
