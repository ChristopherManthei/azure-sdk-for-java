// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.PrivateEndpointConnectionResourceInner;
import com.azure.resourcemanager.datafactory.models.ArmIdWrapper;
import com.azure.resourcemanager.datafactory.models.PrivateLinkConnectionState;
import com.azure.resourcemanager.datafactory.models.RemotePrivateEndpointConnection;
import org.junit.jupiter.api.Assertions;

public final class PrivateEndpointConnectionResourceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionResourceInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"dqzrdzsyloll\",\"privateEndpoint\":{\"id\":\"czzydmxzjij\"},\"privateLinkServiceConnectionState\":{\"status\":\"aurkihcirlde\",\"description\":\"rdcoxnbkkj\",\"actionsRequired\":\"urnnqbnqbpiz\"}},\"name\":\"ltgrdogypxrxv\",\"type\":\"ihwuhvctafsrbxrb\",\"etag\":\"li\",\"id\":\"xihspnxwq\"}")
            .toObject(PrivateEndpointConnectionResourceInner.class);
        Assertions.assertEquals("xihspnxwq", model.id());
        Assertions.assertEquals("aurkihcirlde", model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("rdcoxnbkkj", model.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("urnnqbnqbpiz",
            model.properties().privateLinkServiceConnectionState().actionsRequired());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionResourceInner model = new PrivateEndpointConnectionResourceInner().withId("xihspnxwq")
            .withProperties(new RemotePrivateEndpointConnection().withPrivateEndpoint(new ArmIdWrapper())
                .withPrivateLinkServiceConnectionState(new PrivateLinkConnectionState().withStatus("aurkihcirlde")
                    .withDescription("rdcoxnbkkj")
                    .withActionsRequired("urnnqbnqbpiz")));
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionResourceInner.class);
        Assertions.assertEquals("xihspnxwq", model.id());
        Assertions.assertEquals("aurkihcirlde", model.properties().privateLinkServiceConnectionState().status());
        Assertions.assertEquals("rdcoxnbkkj", model.properties().privateLinkServiceConnectionState().description());
        Assertions.assertEquals("urnnqbnqbpiz",
            model.properties().privateLinkServiceConnectionState().actionsRequired());
    }
}
