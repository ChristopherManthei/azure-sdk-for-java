// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.machinelearning.fluent.models.WorkspaceConnectionPropertiesV2BasicResourceInner;
import com.azure.resourcemanager.machinelearning.models.WorkspaceConnectionPropertiesV2;
import com.azure.resourcemanager.machinelearning.models.WorkspaceConnectionPropertiesV2BasicResource;

public final class WorkspaceConnectionPropertiesV2BasicResourceImpl
    implements WorkspaceConnectionPropertiesV2BasicResource, WorkspaceConnectionPropertiesV2BasicResource.Definition {
    private WorkspaceConnectionPropertiesV2BasicResourceInner innerObject;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    WorkspaceConnectionPropertiesV2BasicResourceImpl(WorkspaceConnectionPropertiesV2BasicResourceInner innerObject,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public WorkspaceConnectionPropertiesV2 properties() {
        return this.innerModel().properties();
    }

    public SystemData systemData() {
        return this.innerModel().systemData();
    }

    public WorkspaceConnectionPropertiesV2BasicResourceInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String workspaceName;

    private String connectionName;

    public WorkspaceConnectionPropertiesV2BasicResourceImpl withExistingWorkspace(String resourceGroupName,
        String workspaceName) {
        this.resourceGroupName = resourceGroupName;
        this.workspaceName = workspaceName;
        return this;
    }

    public WorkspaceConnectionPropertiesV2BasicResource create() {
        this.innerObject = serviceManager.serviceClient()
            .getWorkspaceConnections()
            .createWithResponse(resourceGroupName, workspaceName, connectionName, this.innerModel(), Context.NONE)
            .getValue();
        return this;
    }

    public WorkspaceConnectionPropertiesV2BasicResource create(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWorkspaceConnections()
            .createWithResponse(resourceGroupName, workspaceName, connectionName, this.innerModel(), context)
            .getValue();
        return this;
    }

    WorkspaceConnectionPropertiesV2BasicResourceImpl(String name,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerObject = new WorkspaceConnectionPropertiesV2BasicResourceInner();
        this.serviceManager = serviceManager;
        this.connectionName = name;
    }

    public WorkspaceConnectionPropertiesV2BasicResource refresh() {
        this.innerObject = serviceManager.serviceClient()
            .getWorkspaceConnections()
            .getWithResponse(resourceGroupName, workspaceName, connectionName, Context.NONE)
            .getValue();
        return this;
    }

    public WorkspaceConnectionPropertiesV2BasicResource refresh(Context context) {
        this.innerObject = serviceManager.serviceClient()
            .getWorkspaceConnections()
            .getWithResponse(resourceGroupName, workspaceName, connectionName, context)
            .getValue();
        return this;
    }

    public Response<WorkspaceConnectionPropertiesV2BasicResource> listSecretsWithResponse(Context context) {
        return serviceManager.workspaceConnections()
            .listSecretsWithResponse(resourceGroupName, workspaceName, connectionName, context);
    }

    public WorkspaceConnectionPropertiesV2BasicResource listSecrets() {
        return serviceManager.workspaceConnections().listSecrets(resourceGroupName, workspaceName, connectionName);
    }

    public WorkspaceConnectionPropertiesV2BasicResourceImpl withProperties(WorkspaceConnectionPropertiesV2 properties) {
        this.innerModel().withProperties(properties);
        return this;
    }
}
