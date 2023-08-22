// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dynatrace.models.SsoDetailsRequest;
import org.junit.jupiter.api.Assertions;

public final class SsoDetailsRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SsoDetailsRequest model =
            BinaryData.fromString("{\"userPrincipal\":\"azjpqyegualhbxxh\"}").toObject(SsoDetailsRequest.class);
        Assertions.assertEquals("azjpqyegualhbxxh", model.userPrincipal());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SsoDetailsRequest model = new SsoDetailsRequest().withUserPrincipal("azjpqyegualhbxxh");
        model = BinaryData.fromObject(model).toObject(SsoDetailsRequest.class);
        Assertions.assertEquals("azjpqyegualhbxxh", model.userPrincipal());
    }
}
