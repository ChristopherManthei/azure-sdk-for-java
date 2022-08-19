// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.deviceupdate.models.ConnectionDetails;
import com.azure.resourcemanager.deviceupdate.models.PrivateEndpointConnectionProxyPropertiesAutoGenerated;
import com.azure.resourcemanager.deviceupdate.models.PrivateLinkServiceConnection;
import com.azure.resourcemanager.deviceupdate.models.PrivateLinkServiceProxy;
import com.azure.resourcemanager.deviceupdate.models.RemotePrivateEndpoint;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointConnectionProxyPropertiesAutoGeneratedTests {
    @Test
    public void testDeserialize() {
        PrivateEndpointConnectionProxyPropertiesAutoGenerated model =
            BinaryData
                .fromString(
                    "{\"eTag\":\"burvjxxjnspy\",\"remotePrivateEndpoint\":{\"id\":\"koen\",\"location\":\"uknvudwti\",\"immutableSubscriptionId\":\"bldngkpoc\",\"immutableResourceId\":\"azyxoegukg\",\"vnetTrafficTag\":\"piu\",\"manualPrivateLinkServiceConnections\":[{\"name\":\"evqzntypmrbp\",\"groupIds\":[],\"requestMessage\":\"drqjsdpy\"},{\"name\":\"fyhxde\",\"groupIds\":[],\"requestMessage\":\"zi\"},{\"name\":\"ifsjttgzfbishcb\",\"groupIds\":[],\"requestMessage\":\"jdeyeamdpha\"},{\"name\":\"lpbuxwgipwhonowk\",\"groupIds\":[],\"requestMessage\":\"wankixzbi\"}],\"privateLinkServiceConnections\":[{\"name\":\"uttmrywnuzoqft\",\"groupIds\":[],\"requestMessage\":\"zrnkcqvyxlwh\"},{\"name\":\"sicohoqqnwvlry\",\"groupIds\":[],\"requestMessage\":\"hheunmmqhgyx\"},{\"name\":\"onocukok\",\"groupIds\":[],\"requestMessage\":\"xuconu\"},{\"name\":\"zf\",\"groupIds\":[],\"requestMessage\":\"ypewrmjmwvvjekt\"}],\"privateLinkServiceProxies\":[{\"id\":\"nhwlrsffrzpwvl\",\"groupConnectivityInformation\":[]},{\"id\":\"iqylihkaetck\",\"groupConnectivityInformation\":[]}],\"connectionDetails\":[{\"id\":\"snkymuctq\",\"privateIpAddress\":\"fbebrjcxer\",\"linkIdentifier\":\"wutttxfvjrbi\",\"groupId\":\"hxepcyvahfnlj\",\"memberName\":\"qxj\"}]},\"status\":\"ujqgidok\"}")
                .toObject(PrivateEndpointConnectionProxyPropertiesAutoGenerated.class);
        Assertions.assertEquals("koen", model.remotePrivateEndpoint().id());
        Assertions.assertEquals("uknvudwti", model.remotePrivateEndpoint().location());
        Assertions.assertEquals("bldngkpoc", model.remotePrivateEndpoint().immutableSubscriptionId());
        Assertions.assertEquals("azyxoegukg", model.remotePrivateEndpoint().immutableResourceId());
        Assertions.assertEquals("piu", model.remotePrivateEndpoint().vnetTrafficTag());
        Assertions
            .assertEquals(
                "evqzntypmrbp", model.remotePrivateEndpoint().manualPrivateLinkServiceConnections().get(0).name());
        Assertions
            .assertEquals(
                "drqjsdpy",
                model.remotePrivateEndpoint().manualPrivateLinkServiceConnections().get(0).requestMessage());
        Assertions
            .assertEquals(
                "uttmrywnuzoqft", model.remotePrivateEndpoint().privateLinkServiceConnections().get(0).name());
        Assertions
            .assertEquals(
                "zrnkcqvyxlwh", model.remotePrivateEndpoint().privateLinkServiceConnections().get(0).requestMessage());
        Assertions
            .assertEquals("nhwlrsffrzpwvl", model.remotePrivateEndpoint().privateLinkServiceProxies().get(0).id());
        Assertions.assertEquals("ujqgidok", model.status());
    }

    @Test
    public void testSerialize() {
        PrivateEndpointConnectionProxyPropertiesAutoGenerated model =
            new PrivateEndpointConnectionProxyPropertiesAutoGenerated()
                .withRemotePrivateEndpoint(
                    new RemotePrivateEndpoint()
                        .withId("koen")
                        .withLocation("uknvudwti")
                        .withImmutableSubscriptionId("bldngkpoc")
                        .withImmutableResourceId("azyxoegukg")
                        .withVnetTrafficTag("piu")
                        .withManualPrivateLinkServiceConnections(
                            Arrays
                                .asList(
                                    new PrivateLinkServiceConnection()
                                        .withName("evqzntypmrbp")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("drqjsdpy"),
                                    new PrivateLinkServiceConnection()
                                        .withName("fyhxde")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("zi"),
                                    new PrivateLinkServiceConnection()
                                        .withName("ifsjttgzfbishcb")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("jdeyeamdpha"),
                                    new PrivateLinkServiceConnection()
                                        .withName("lpbuxwgipwhonowk")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("wankixzbi")))
                        .withPrivateLinkServiceConnections(
                            Arrays
                                .asList(
                                    new PrivateLinkServiceConnection()
                                        .withName("uttmrywnuzoqft")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("zrnkcqvyxlwh"),
                                    new PrivateLinkServiceConnection()
                                        .withName("sicohoqqnwvlry")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("hheunmmqhgyx"),
                                    new PrivateLinkServiceConnection()
                                        .withName("onocukok")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("xuconu"),
                                    new PrivateLinkServiceConnection()
                                        .withName("zf")
                                        .withGroupIds(Arrays.asList())
                                        .withRequestMessage("ypewrmjmwvvjekt")))
                        .withPrivateLinkServiceProxies(
                            Arrays
                                .asList(
                                    new PrivateLinkServiceProxy()
                                        .withId("nhwlrsffrzpwvl")
                                        .withGroupConnectivityInformation(Arrays.asList()),
                                    new PrivateLinkServiceProxy()
                                        .withId("iqylihkaetck")
                                        .withGroupConnectivityInformation(Arrays.asList())))
                        .withConnectionDetails(Arrays.asList(new ConnectionDetails())))
                .withStatus("ujqgidok");
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionProxyPropertiesAutoGenerated.class);
        Assertions.assertEquals("koen", model.remotePrivateEndpoint().id());
        Assertions.assertEquals("uknvudwti", model.remotePrivateEndpoint().location());
        Assertions.assertEquals("bldngkpoc", model.remotePrivateEndpoint().immutableSubscriptionId());
        Assertions.assertEquals("azyxoegukg", model.remotePrivateEndpoint().immutableResourceId());
        Assertions.assertEquals("piu", model.remotePrivateEndpoint().vnetTrafficTag());
        Assertions
            .assertEquals(
                "evqzntypmrbp", model.remotePrivateEndpoint().manualPrivateLinkServiceConnections().get(0).name());
        Assertions
            .assertEquals(
                "drqjsdpy",
                model.remotePrivateEndpoint().manualPrivateLinkServiceConnections().get(0).requestMessage());
        Assertions
            .assertEquals(
                "uttmrywnuzoqft", model.remotePrivateEndpoint().privateLinkServiceConnections().get(0).name());
        Assertions
            .assertEquals(
                "zrnkcqvyxlwh", model.remotePrivateEndpoint().privateLinkServiceConnections().get(0).requestMessage());
        Assertions
            .assertEquals("nhwlrsffrzpwvl", model.remotePrivateEndpoint().privateLinkServiceProxies().get(0).id());
        Assertions.assertEquals("ujqgidok", model.status());
    }
}
