// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterLibraryInner;
import com.azure.resourcemanager.hdinsight.containers.models.Category;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterLibraryManagementOperation;

/**
 * An instance of this class provides access to all the operations defined in ClusterLibrariesClient.
 */
public interface ClusterLibrariesClient {
    /**
     * Get all libraries of HDInsight on AKS cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param category The system query option to filter libraries returned in the response. Allowed value is 'custom'
     * or 'predefined'.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all libraries of HDInsight on AKS cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterLibraryInner> list(String resourceGroupName, String clusterPoolName, String clusterName,
        Category category);

    /**
     * Get all libraries of HDInsight on AKS cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param category The system query option to filter libraries returned in the response. Allowed value is 'custom'
     * or 'predefined'.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all libraries of HDInsight on AKS cluster as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClusterLibraryInner> list(String resourceGroupName, String clusterPoolName, String clusterName,
        Category category, Context context);

    /**
     * Library management operations on HDInsight on AKS cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param operation The library management operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginManageLibraries(String resourceGroupName, String clusterPoolName,
        String clusterName, ClusterLibraryManagementOperation operation);

    /**
     * Library management operations on HDInsight on AKS cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param operation The library management operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginManageLibraries(String resourceGroupName, String clusterPoolName,
        String clusterName, ClusterLibraryManagementOperation operation, Context context);

    /**
     * Library management operations on HDInsight on AKS cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param operation The library management operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void manageLibraries(String resourceGroupName, String clusterPoolName, String clusterName,
        ClusterLibraryManagementOperation operation);

    /**
     * Library management operations on HDInsight on AKS cluster.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param clusterPoolName The name of the cluster pool.
     * @param clusterName The name of the HDInsight cluster.
     * @param operation The library management operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void manageLibraries(String resourceGroupName, String clusterPoolName, String clusterName,
        ClusterLibraryManagementOperation operation, Context context);
}
