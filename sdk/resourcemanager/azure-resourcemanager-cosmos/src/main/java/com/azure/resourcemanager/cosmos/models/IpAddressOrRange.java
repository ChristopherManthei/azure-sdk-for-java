// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * IpAddressOrRange object.
 */
@Fluent
public final class IpAddressOrRange {
    /*
     * A single IPv4 address or a single IPv4 address range in CIDR format. Provided IPs must be well-formatted and
     * cannot be contained in one of the following ranges: 10.0.0.0/8, 100.64.0.0/10, 172.16.0.0/12, 192.168.0.0/16,
     * since these are not enforceable by the IP address filter. Example of valid inputs: “23.40.210.245” or
     * “23.40.210.0/8”.
     */
    @JsonProperty(value = "ipAddressOrRange")
    private String ipAddressOrRange;

    /**
     * Creates an instance of IpAddressOrRange class.
     */
    public IpAddressOrRange() {
    }

    /**
     * Get the ipAddressOrRange property: A single IPv4 address or a single IPv4 address range in CIDR format. Provided
     * IPs must be well-formatted and cannot be contained in one of the following ranges: 10.0.0.0/8, 100.64.0.0/10,
     * 172.16.0.0/12, 192.168.0.0/16, since these are not enforceable by the IP address filter. Example of valid
     * inputs: “23.40.210.245” or “23.40.210.0/8”.
     * 
     * @return the ipAddressOrRange value.
     */
    public String ipAddressOrRange() {
        return this.ipAddressOrRange;
    }

    /**
     * Set the ipAddressOrRange property: A single IPv4 address or a single IPv4 address range in CIDR format. Provided
     * IPs must be well-formatted and cannot be contained in one of the following ranges: 10.0.0.0/8, 100.64.0.0/10,
     * 172.16.0.0/12, 192.168.0.0/16, since these are not enforceable by the IP address filter. Example of valid
     * inputs: “23.40.210.245” or “23.40.210.0/8”.
     * 
     * @param ipAddressOrRange the ipAddressOrRange value to set.
     * @return the IpAddressOrRange object itself.
     */
    public IpAddressOrRange withIpAddressOrRange(String ipAddressOrRange) {
        this.ipAddressOrRange = ipAddressOrRange;
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
