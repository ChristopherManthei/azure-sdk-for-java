// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.deviceupdate.models.PrivateEndpoint;
import com.azure.resourcemanager.deviceupdate.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.deviceupdate.models.PrivateLinkServiceConnectionState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionInnerTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"privateEndpoint\":{\"id\":\"nyejhkryhtnap\"},\"privateLinkServiceConnectionState\":{\"status\":\"Approved\",\"description\":\"okjye\",\"actionsRequired\":\"kvnipjoxz\"},\"groupIds\":[\"hgejspodma\",\"lzydehojwyahux\",\"npmqnjaqwixjspro\"],\"provisioningState\":\"Failed\"},\"id\":\"utegjvwmfdats\",\"name\":\"mdvpjhulsu\",\"type\":\"vmkjozkrwfndiodj\"}")
                .toObject(PrivateEndpointConnectionInner.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("okjye", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("kvnipjoxz", model.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("hgejspodma", model.groupIds().get(0));
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionInner model =
            new PrivateEndpointConnectionInner()
                .withPrivateEndpoint(new PrivateEndpoint())
                .withPrivateLinkServiceConnectionState(
                    new PrivateLinkServiceConnectionState()
                        .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                        .withDescription("okjye")
                        .withActionsRequired("kvnipjoxz"))
                .withGroupIds(Arrays.asList("hgejspodma", "lzydehojwyahux", "npmqnjaqwixjspro"));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionInner.class);
        Assertions
            .assertEquals(
                PrivateEndpointServiceConnectionStatus.APPROVED, model.privateLinkServiceConnectionState().status());
        Assertions.assertEquals("okjye", model.privateLinkServiceConnectionState().description());
        Assertions.assertEquals("kvnipjoxz", model.privateLinkServiceConnectionState().actionsRequired());
        Assertions.assertEquals("hgejspodma", model.groupIds().get(0));
    }
}
