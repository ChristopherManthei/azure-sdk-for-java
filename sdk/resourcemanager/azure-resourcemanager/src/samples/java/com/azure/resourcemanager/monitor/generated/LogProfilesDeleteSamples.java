// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.monitor.generated;

/**
 * Samples for LogProfiles Delete.
 */
public final class LogProfilesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/monitor/resource-manager/Microsoft.Insights/stable/2016-03-01/examples/deleteLogProfile.json
     */
    /**
     * Sample code: Delete log profile.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deleteLogProfile(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.diagnosticSettings()
            .manager()
            .serviceClient()
            .getLogProfiles()
            .deleteWithResponse("Rac46PostSwapRG", com.azure.core.util.Context.NONE);
    }
}
