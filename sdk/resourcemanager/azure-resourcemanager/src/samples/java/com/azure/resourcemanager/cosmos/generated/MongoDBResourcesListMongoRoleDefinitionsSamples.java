// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.generated;

/**
 * Samples for MongoDBResources ListMongoRoleDefinitions.
 */
public final class MongoDBResourcesListMongoRoleDefinitionsSamples {
    /*
     * x-ms-original-file: specification/cosmos-db/resource-manager/Microsoft.DocumentDB/stable/2023-11-15/examples/
     * CosmosDBMongoDBRoleDefinitionList.json
     */
    /**
     * Sample code: CosmosDBMongoDBRoleDefinitionList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void cosmosDBMongoDBRoleDefinitionList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.cosmosDBAccounts().manager().serviceClient().getMongoDBResources()
            .listMongoRoleDefinitions("myResourceGroupName", "myAccountName", com.azure.core.util.Context.NONE);
    }
}
