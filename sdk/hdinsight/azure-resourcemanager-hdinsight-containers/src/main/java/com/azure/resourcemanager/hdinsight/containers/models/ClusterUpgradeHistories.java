// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;

/**
 * Resource collection API of ClusterUpgradeHistories.
 */
public interface ClusterUpgradeHistories {
    /**
     * Returns a list of upgrade history.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a list of cluster upgrade history as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ClusterUpgradeHistory> list(String resourceGroupName, String clusterPoolName, String clusterName);

    /**
     * Returns a list of upgrade history.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return represents a list of cluster upgrade history as paginated response with {@link PagedIterable}.
     */
    PagedIterable<ClusterUpgradeHistory> list(String resourceGroupName, String clusterPoolName, String clusterName,
        Context context);
}
