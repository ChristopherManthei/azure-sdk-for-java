// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sqlvirtualmachine.generated;

import com.azure.core.util.Context;

/** Samples for SqlVirtualMachines Redeploy. */
public final class SqlVirtualMachinesRedeploySamples {
    /*
     * x-ms-original-file: specification/sqlvirtualmachine/resource-manager/Microsoft.SqlVirtualMachine/preview/2022-07-01-preview/examples/RedeploySqlVirtualMachine.json
     */
    /**
     * Sample code: Uninstalls and reinstalls the SQL Iaas Extension.
     *
     * @param manager Entry point to SqlVirtualMachineManager.
     */
    public static void uninstallsAndReinstallsTheSQLIaasExtension(
        com.azure.resourcemanager.sqlvirtualmachine.SqlVirtualMachineManager manager) {
        manager.sqlVirtualMachines().redeploy("testrg", "testvm", Context.NONE);
    }
}
