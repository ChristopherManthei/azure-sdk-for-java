// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.dynatrace.models.AutoUpdateSetting;
import com.azure.resourcemanager.dynatrace.models.AvailabilityState;
import com.azure.resourcemanager.dynatrace.models.LogModule;
import com.azure.resourcemanager.dynatrace.models.MonitoringType;
import com.azure.resourcemanager.dynatrace.models.UpdateStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Details of App Services having Dynatrace OneAgent installed. */
@Fluent
public final class AppServiceInfoInner {
    /*
     * App service resource ID
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /*
     * Version of the Dynatrace agent installed on the App Service.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The monitoring mode of OneAgent
     */
    @JsonProperty(value = "monitoringType")
    private MonitoringType monitoringType;

    /*
     * Update settings of OneAgent.
     */
    @JsonProperty(value = "autoUpdateSetting")
    private AutoUpdateSetting autoUpdateSetting;

    /*
     * The current update status of OneAgent.
     */
    @JsonProperty(value = "updateStatus")
    private UpdateStatus updateStatus;

    /*
     * The availability state of OneAgent.
     */
    @JsonProperty(value = "availabilityState")
    private AvailabilityState availabilityState;

    /*
     * Tells whether log modules are enabled or not
     */
    @JsonProperty(value = "logModule")
    private LogModule logModule;

    /*
     * The name of the host group
     */
    @JsonProperty(value = "hostGroup")
    private String hostGroup;

    /*
     * The name of the host
     */
    @JsonProperty(value = "hostName")
    private String hostname;

    /** Creates an instance of AppServiceInfoInner class. */
    public AppServiceInfoInner() {
    }

    /**
     * Get the resourceId property: App service resource ID.
     *
     * @return the resourceId value.
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId property: App service resource ID.
     *
     * @param resourceId the resourceId value to set.
     * @return the AppServiceInfoInner object itself.
     */
    public AppServiceInfoInner withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the version property: Version of the Dynatrace agent installed on the App Service.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: Version of the Dynatrace agent installed on the App Service.
     *
     * @param version the version value to set.
     * @return the AppServiceInfoInner object itself.
     */
    public AppServiceInfoInner withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the monitoringType property: The monitoring mode of OneAgent.
     *
     * @return the monitoringType value.
     */
    public MonitoringType monitoringType() {
        return this.monitoringType;
    }

    /**
     * Set the monitoringType property: The monitoring mode of OneAgent.
     *
     * @param monitoringType the monitoringType value to set.
     * @return the AppServiceInfoInner object itself.
     */
    public AppServiceInfoInner withMonitoringType(MonitoringType monitoringType) {
        this.monitoringType = monitoringType;
        return this;
    }

    /**
     * Get the autoUpdateSetting property: Update settings of OneAgent.
     *
     * @return the autoUpdateSetting value.
     */
    public AutoUpdateSetting autoUpdateSetting() {
        return this.autoUpdateSetting;
    }

    /**
     * Set the autoUpdateSetting property: Update settings of OneAgent.
     *
     * @param autoUpdateSetting the autoUpdateSetting value to set.
     * @return the AppServiceInfoInner object itself.
     */
    public AppServiceInfoInner withAutoUpdateSetting(AutoUpdateSetting autoUpdateSetting) {
        this.autoUpdateSetting = autoUpdateSetting;
        return this;
    }

    /**
     * Get the updateStatus property: The current update status of OneAgent.
     *
     * @return the updateStatus value.
     */
    public UpdateStatus updateStatus() {
        return this.updateStatus;
    }

    /**
     * Set the updateStatus property: The current update status of OneAgent.
     *
     * @param updateStatus the updateStatus value to set.
     * @return the AppServiceInfoInner object itself.
     */
    public AppServiceInfoInner withUpdateStatus(UpdateStatus updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }

    /**
     * Get the availabilityState property: The availability state of OneAgent.
     *
     * @return the availabilityState value.
     */
    public AvailabilityState availabilityState() {
        return this.availabilityState;
    }

    /**
     * Set the availabilityState property: The availability state of OneAgent.
     *
     * @param availabilityState the availabilityState value to set.
     * @return the AppServiceInfoInner object itself.
     */
    public AppServiceInfoInner withAvailabilityState(AvailabilityState availabilityState) {
        this.availabilityState = availabilityState;
        return this;
    }

    /**
     * Get the logModule property: Tells whether log modules are enabled or not.
     *
     * @return the logModule value.
     */
    public LogModule logModule() {
        return this.logModule;
    }

    /**
     * Set the logModule property: Tells whether log modules are enabled or not.
     *
     * @param logModule the logModule value to set.
     * @return the AppServiceInfoInner object itself.
     */
    public AppServiceInfoInner withLogModule(LogModule logModule) {
        this.logModule = logModule;
        return this;
    }

    /**
     * Get the hostGroup property: The name of the host group.
     *
     * @return the hostGroup value.
     */
    public String hostGroup() {
        return this.hostGroup;
    }

    /**
     * Set the hostGroup property: The name of the host group.
     *
     * @param hostGroup the hostGroup value to set.
     * @return the AppServiceInfoInner object itself.
     */
    public AppServiceInfoInner withHostGroup(String hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }

    /**
     * Get the hostname property: The name of the host.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.hostname;
    }

    /**
     * Set the hostname property: The name of the host.
     *
     * @param hostname the hostname value to set.
     * @return the AppServiceInfoInner object itself.
     */
    public AppServiceInfoInner withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
