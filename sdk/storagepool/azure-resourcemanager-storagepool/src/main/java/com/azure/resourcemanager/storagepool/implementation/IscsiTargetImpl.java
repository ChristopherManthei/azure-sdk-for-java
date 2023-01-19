// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagepool.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.storagepool.fluent.models.IscsiTargetInner;
import com.azure.resourcemanager.storagepool.models.Acl;
import com.azure.resourcemanager.storagepool.models.IscsiLun;
import com.azure.resourcemanager.storagepool.models.IscsiTarget;
import com.azure.resourcemanager.storagepool.models.IscsiTargetAclMode;
import com.azure.resourcemanager.storagepool.models.IscsiTargetCreate;
import com.azure.resourcemanager.storagepool.models.IscsiTargetUpdate;
import com.azure.resourcemanager.storagepool.models.OperationalStatus;
import com.azure.resourcemanager.storagepool.models.ProvisioningStates;
import com.azure.resourcemanager.storagepool.models.SystemMetadata;
import java.util.Collections;
import java.util.List;

public final class IscsiTargetImpl implements IscsiTarget, IscsiTarget.Definition, IscsiTarget.Update {
    private IscsiTargetInner innerObject;

    private final com.azure.resourcemanager.storagepool.StoragePoolManager serviceManager;

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public SystemMetadata systemData() {
        return this.innerModel().systemData();
    }

    public String managedBy() {
        return this.innerModel().managedBy();
    }

    public List<String> managedByExtended() {
        List<String> inner = this.innerModel().managedByExtended();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public IscsiTargetAclMode aclMode() {
        return this.innerModel().aclMode();
    }

    public List<Acl> staticAcls() {
        List<Acl> inner = this.innerModel().staticAcls();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public List<IscsiLun> luns() {
        List<IscsiLun> inner = this.innerModel().luns();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String targetIqn() {
        return this.innerModel().targetIqn();
    }

    public ProvisioningStates provisioningState() {
        return this.innerModel().provisioningState();
    }

    public OperationalStatus status() {
        return this.innerModel().status();
    }

    public List<String> endpoints() {
        List<String> inner = this.innerModel().endpoints();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public Integer port() {
        return this.innerModel().port();
    }

    public List<String> sessions() {
        List<String> inner = this.innerModel().sessions();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String resourceGroupName() {
        return resourceGroupName;
    }

    public IscsiTargetInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.storagepool.StoragePoolManager manager() {
        return this.serviceManager;
    }

    private String resourceGroupName;

    private String diskPoolName;

    private String iscsiTargetName;

    private IscsiTargetCreate createIscsiTargetCreatePayload;

    private IscsiTargetUpdate updateIscsiTargetUpdatePayload;

    public IscsiTargetImpl withExistingDiskPool(String resourceGroupName, String diskPoolName) {
        this.resourceGroupName = resourceGroupName;
        this.diskPoolName = diskPoolName;
        return this;
    }

    public IscsiTarget create() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIscsiTargets()
                .createOrUpdate(
                    resourceGroupName, diskPoolName, iscsiTargetName, createIscsiTargetCreatePayload, Context.NONE);
        return this;
    }

    public IscsiTarget create(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIscsiTargets()
                .createOrUpdate(
                    resourceGroupName, diskPoolName, iscsiTargetName, createIscsiTargetCreatePayload, context);
        return this;
    }

    IscsiTargetImpl(String name, com.azure.resourcemanager.storagepool.StoragePoolManager serviceManager) {
        this.innerObject = new IscsiTargetInner();
        this.serviceManager = serviceManager;
        this.iscsiTargetName = name;
        this.createIscsiTargetCreatePayload = new IscsiTargetCreate();
    }

    public IscsiTargetImpl update() {
        this.updateIscsiTargetUpdatePayload = new IscsiTargetUpdate();
        return this;
    }

    public IscsiTarget apply() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIscsiTargets()
                .update(resourceGroupName, diskPoolName, iscsiTargetName, updateIscsiTargetUpdatePayload, Context.NONE);
        return this;
    }

    public IscsiTarget apply(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIscsiTargets()
                .update(resourceGroupName, diskPoolName, iscsiTargetName, updateIscsiTargetUpdatePayload, context);
        return this;
    }

    IscsiTargetImpl(
        IscsiTargetInner innerObject, com.azure.resourcemanager.storagepool.StoragePoolManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
        this.resourceGroupName = Utils.getValueFromIdByName(innerObject.id(), "resourceGroups");
        this.diskPoolName = Utils.getValueFromIdByName(innerObject.id(), "diskPools");
        this.iscsiTargetName = Utils.getValueFromIdByName(innerObject.id(), "iscsiTargets");
    }

    public IscsiTarget refresh() {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIscsiTargets()
                .getWithResponse(resourceGroupName, diskPoolName, iscsiTargetName, Context.NONE)
                .getValue();
        return this;
    }

    public IscsiTarget refresh(Context context) {
        this.innerObject =
            serviceManager
                .serviceClient()
                .getIscsiTargets()
                .getWithResponse(resourceGroupName, diskPoolName, iscsiTargetName, context)
                .getValue();
        return this;
    }

    public IscsiTargetImpl withAclMode(IscsiTargetAclMode aclMode) {
        this.createIscsiTargetCreatePayload.withAclMode(aclMode);
        return this;
    }

    public IscsiTargetImpl withManagedBy(String managedBy) {
        if (isInCreateMode()) {
            this.createIscsiTargetCreatePayload.withManagedBy(managedBy);
            return this;
        } else {
            this.updateIscsiTargetUpdatePayload.withManagedBy(managedBy);
            return this;
        }
    }

    public IscsiTargetImpl withManagedByExtended(List<String> managedByExtended) {
        if (isInCreateMode()) {
            this.createIscsiTargetCreatePayload.withManagedByExtended(managedByExtended);
            return this;
        } else {
            this.updateIscsiTargetUpdatePayload.withManagedByExtended(managedByExtended);
            return this;
        }
    }

    public IscsiTargetImpl withTargetIqn(String targetIqn) {
        this.createIscsiTargetCreatePayload.withTargetIqn(targetIqn);
        return this;
    }

    public IscsiTargetImpl withStaticAcls(List<Acl> staticAcls) {
        if (isInCreateMode()) {
            this.createIscsiTargetCreatePayload.withStaticAcls(staticAcls);
            return this;
        } else {
            this.updateIscsiTargetUpdatePayload.withStaticAcls(staticAcls);
            return this;
        }
    }

    public IscsiTargetImpl withLuns(List<IscsiLun> luns) {
        if (isInCreateMode()) {
            this.createIscsiTargetCreatePayload.withLuns(luns);
            return this;
        } else {
            this.updateIscsiTargetUpdatePayload.withLuns(luns);
            return this;
        }
    }

    private boolean isInCreateMode() {
        return this.innerModel().id() == null;
    }
}
