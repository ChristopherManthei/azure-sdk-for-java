// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

/**
 * Samples for ClusterUpgradeHistories List.
 */
public final class ClusterUpgradeHistoriesListSamples {
    /*
     * x-ms-original-file:
     * specification/hdinsight/resource-manager/Microsoft.HDInsight/HDInsightOnAks/preview/2024-05-01-preview/examples/
     * ListClusterUpgradeHistory.json
     */
    /**
     * Sample code: ClusterUpgradeHistoriesListResult.
     * 
     * @param manager Entry point to HDInsightContainersManager.
     */
    public static void clusterUpgradeHistoriesListResult(
        com.azure.resourcemanager.hdinsight.containers.HDInsightContainersManager manager) {
        manager.clusterUpgradeHistories()
            .list("hiloResourcegroup", "clusterpool1", "cluster1", com.azure.core.util.Context.NONE);
    }
}
