// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.messaging.eventgrid.namespaces;

import com.azure.identity.DefaultAzureCredentialBuilder;
import com.azure.messaging.eventgrid.namespaces.models.AcknowledgeResult;
import com.azure.messaging.eventgrid.namespaces.models.ReceiveResult;
import com.azure.messaging.eventgrid.namespaces.models.RejectResult;
import com.azure.messaging.eventgrid.namespaces.models.ReleaseDelay;
import com.azure.messaging.eventgrid.namespaces.models.ReleaseResult;
import com.azure.messaging.eventgrid.namespaces.models.RenewLocksResult;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EventGridClientTests extends EventGridClientTestBase {

    @Override
    protected void beforeTest() {
        makeBuilders(true);
    }

    EventGridReceiverClient buildReceiverClient() {
        if (interceptorManager.isLiveMode()) {
            return receiverBuilder.credential(new DefaultAzureCredentialBuilder().build()).buildClient();
        }
        return receiverBuilder.credential(getKey(EVENTGRID_KEY)).buildClient();
    }

    EventGridSenderClient buildSenderClient() {
        if (interceptorManager.isLiveMode()) {
            return senderBuilder.credential(new DefaultAzureCredentialBuilder().build()).buildClient();
        }
        return senderBuilder.credential(getKey(EVENTGRID_KEY)).buildClient();
    }

    @Test
    void send() {
        EventGridSenderClient client = buildSenderClient();
        client.send(getCloudEvent());
    }

    @Test
    void sendBatch() {
        EventGridSenderClient client = buildSenderClient();
        client.send(Arrays.asList(getCloudEvent(), getCloudEvent()));
    }

    @Test
    void receiveBatch() {
        EventGridSenderClient senderClient = buildSenderClient();
        EventGridReceiverClient client = buildReceiverClient();
        senderClient.send(getCloudEvent());
        ReceiveResult result = client.receive(1, Duration.ofSeconds(10));
        assertNotNull(result);
        assertFalse(result.getDetails().isEmpty());
    }

    @Test
    void acknowledgeBatch() {
        EventGridSenderClient senderClient = buildSenderClient();
        EventGridReceiverClient client = buildReceiverClient();
        senderClient.send(getCloudEvent());
        ReceiveResult receiveResult = client.receive(1, Duration.ofSeconds(10));

        AcknowledgeResult acknowledgeResult = client.acknowledge(
            Collections.singletonList(receiveResult.getDetails().get(0).getBrokerProperties().getLockToken()));
        assertNotNull(acknowledgeResult);
        assertFalse(acknowledgeResult.getSucceededLockTokens().isEmpty());
    }

    @Test
    void releaseBatch() {
        EventGridSenderClient senderClient = buildSenderClient();
        EventGridReceiverClient client = buildReceiverClient();
        senderClient.send(getCloudEvent());
        ReceiveResult receiveResult = client.receive(1, Duration.ofSeconds(10));

        ReleaseResult releaseResult = client
            .release(Collections.singletonList(receiveResult.getDetails().get(0).getBrokerProperties().getLockToken()));
        assertNotNull(releaseResult);
        assertFalse(releaseResult.getSucceededLockTokens().isEmpty());
    }

    @Test
    void releaseBatchWithDelay() {
        EventGridSenderClient senderClient = buildSenderClient();
        EventGridReceiverClient client = buildReceiverClient();
        senderClient.send(getCloudEvent());
        ReceiveResult receiveResult = client.receive(1, Duration.ofSeconds(10));
        ReleaseResult releaseResult = client.release(
            Collections.singletonList(receiveResult.getDetails().get(0).getBrokerProperties().getLockToken()),
            ReleaseDelay.TEN_SECONDS);
        assertNotNull(releaseResult);
        assertFalse(releaseResult.getSucceededLockTokens().isEmpty());
    }

    @Test
    void rejectBatch() {
        EventGridSenderClient senderClient = buildSenderClient();
        EventGridReceiverClient client = buildReceiverClient();
        senderClient.send(getCloudEvent());
        ReceiveResult receiveResult = client.receive(1, Duration.ofSeconds(10));
        RejectResult rejectResult = client
            .reject(Collections.singletonList(receiveResult.getDetails().get(0).getBrokerProperties().getLockToken()));
        assertNotNull(rejectResult);
        assertFalse(rejectResult.getSucceededLockTokens().isEmpty());
    }

    @Test
    void renewBatchOfEvents() {
        EventGridSenderClient senderClient = buildSenderClient();
        EventGridReceiverClient client = buildReceiverClient();
        senderClient.send(getCloudEvent());
        ReceiveResult receiveResult = client.receive(1, Duration.ofSeconds(10));
        RenewLocksResult renewResult = client.renewLocks(
            Collections.singletonList(receiveResult.getDetails().get(0).getBrokerProperties().getLockToken()));
        assertNotNull(renewResult);
        assertFalse(renewResult.getSucceededLockTokens().isEmpty());
    }

}
