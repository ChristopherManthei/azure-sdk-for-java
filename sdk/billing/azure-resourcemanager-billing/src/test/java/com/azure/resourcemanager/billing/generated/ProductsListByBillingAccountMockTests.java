// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billing.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.billing.BillingManager;
import com.azure.resourcemanager.billing.models.AutoRenew;
import com.azure.resourcemanager.billing.models.Product;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class ProductsListByBillingAccountMockTests {
    @Test
    public void testListByBillingAccount() throws Exception {
        String responseStr
            = "{\"value\":[{\"properties\":{\"autoRenew\":\"Off\",\"availabilityId\":\"jjqztrpjmeip\",\"billingFrequency\":\"taaq\",\"billingProfileId\":\"k\",\"billingProfileDisplayName\":\"abco\",\"customerId\":\"aavjk\",\"customerDisplayName\":\"pqasv\",\"displayName\":\"sbvolivianklqclf\",\"endDate\":\"neouxpdnlbp\",\"invoiceSectionId\":\"ckohn\",\"invoiceSectionDisplayName\":\"aqzekggurwxf\",\"lastCharge\":{\"currency\":\"ghwfiy\",\"value\":33.978844},\"lastChargeDate\":\"grzfs\",\"productType\":\"lookwnz\",\"productTypeId\":\"jb\",\"skuId\":\"uidlodcqsylkk\",\"skuDescription\":\"m\",\"purchaseDate\":\"wel\",\"quantity\":9168248383339814161,\"status\":\"Expired\",\"tenantId\":\"mcmnsmn\",\"reseller\":{\"resellerId\":\"x\",\"description\":\"hlbibwodayi\"}},\"tags\":{\"byoxpvbv\":\"hkioec\",\"okzdshhhdixn\":\"chfuxuqpdde\",\"ywspajakjhv\":\"apzibmstvzzkzv\"},\"id\":\"tbnmhxtmzzpau\",\"name\":\"srvsbkn\",\"type\":\"ouytsajjgvu\"}]}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        BillingManager manager = BillingManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Product> response = manager.products()
            .listByBillingAccount("feugcwtsztxoswv", "rymqqfksqfcxdle", "hysdg", 7245214005145934559L,
                7922566269976853390L, true, "wvtkrqi", com.azure.core.util.Context.NONE);

        Assertions.assertEquals("hkioec", response.iterator().next().tags().get("byoxpvbv"));
        Assertions.assertEquals(AutoRenew.OFF, response.iterator().next().properties().autoRenew());
    }
}
