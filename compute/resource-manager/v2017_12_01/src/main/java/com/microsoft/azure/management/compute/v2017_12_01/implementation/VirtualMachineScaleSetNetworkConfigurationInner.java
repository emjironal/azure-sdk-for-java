/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.SubResource;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineScaleSetNetworkConfigurationDnsSettings;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Describes a virtual machine scale set network profile's network
 * configurations.
 */
@JsonFlatten
public class VirtualMachineScaleSetNetworkConfigurationInner extends SubResource {
    /**
     * The network configuration name.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Specifies the primary network interface in case the virtual machine has
     * more than 1 network interface.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /**
     * Specifies whether the network interface is accelerated
     * networking-enabled.
     */
    @JsonProperty(value = "properties.enableAcceleratedNetworking")
    private Boolean enableAcceleratedNetworking;

    /**
     * The network security group.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private SubResource networkSecurityGroup;

    /**
     * The dns settings to be applied on the network interfaces.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings;

    /**
     * Specifies the IP configurations of the network interface.
     */
    @JsonProperty(value = "properties.ipConfigurations", required = true)
    private List<VirtualMachineScaleSetIPConfigurationInner> ipConfigurations;

    /**
     * Whether IP forwarding enabled on this NIC.
     */
    @JsonProperty(value = "properties.enableIPForwarding")
    private Boolean enableIPForwarding;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the VirtualMachineScaleSetNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetNetworkConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the primary value.
     *
     * @return the primary value
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary value.
     *
     * @param primary the primary value to set
     * @return the VirtualMachineScaleSetNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetNetworkConfigurationInner withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking value.
     *
     * @return the enableAcceleratedNetworking value
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set the enableAcceleratedNetworking value.
     *
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value to set
     * @return the VirtualMachineScaleSetNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetNetworkConfigurationInner withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /**
     * Get the networkSecurityGroup value.
     *
     * @return the networkSecurityGroup value
     */
    public SubResource networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup value.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set
     * @return the VirtualMachineScaleSetNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetNetworkConfigurationInner withNetworkSecurityGroup(SubResource networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the dnsSettings value.
     *
     * @return the dnsSettings value
     */
    public VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings value.
     *
     * @param dnsSettings the dnsSettings value to set
     * @return the VirtualMachineScaleSetNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetNetworkConfigurationInner withDnsSettings(VirtualMachineScaleSetNetworkConfigurationDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the ipConfigurations value.
     *
     * @return the ipConfigurations value
     */
    public List<VirtualMachineScaleSetIPConfigurationInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations value.
     *
     * @param ipConfigurations the ipConfigurations value to set
     * @return the VirtualMachineScaleSetNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetNetworkConfigurationInner withIpConfigurations(List<VirtualMachineScaleSetIPConfigurationInner> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the enableIPForwarding value.
     *
     * @return the enableIPForwarding value
     */
    public Boolean enableIPForwarding() {
        return this.enableIPForwarding;
    }

    /**
     * Set the enableIPForwarding value.
     *
     * @param enableIPForwarding the enableIPForwarding value to set
     * @return the VirtualMachineScaleSetNetworkConfigurationInner object itself.
     */
    public VirtualMachineScaleSetNetworkConfigurationInner withEnableIPForwarding(Boolean enableIPForwarding) {
        this.enableIPForwarding = enableIPForwarding;
        return this;
    }

}
