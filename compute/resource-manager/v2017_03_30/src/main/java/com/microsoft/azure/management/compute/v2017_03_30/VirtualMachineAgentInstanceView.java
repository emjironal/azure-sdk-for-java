/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The instance view of the VM Agent running on the virtual machine.
 */
public class VirtualMachineAgentInstanceView {
    /**
     * The VM Agent full version.
     */
    @JsonProperty(value = "vmAgentVersion")
    private String vmAgentVersion;

    /**
     * The virtual machine extension handler instance view.
     */
    @JsonProperty(value = "extensionHandlers")
    private List<VirtualMachineExtensionHandlerInstanceView> extensionHandlers;

    /**
     * The resource status information.
     */
    @JsonProperty(value = "statuses")
    private List<InstanceViewStatus> statuses;

    /**
     * Get the vmAgentVersion value.
     *
     * @return the vmAgentVersion value
     */
    public String vmAgentVersion() {
        return this.vmAgentVersion;
    }

    /**
     * Set the vmAgentVersion value.
     *
     * @param vmAgentVersion the vmAgentVersion value to set
     * @return the VirtualMachineAgentInstanceView object itself.
     */
    public VirtualMachineAgentInstanceView withVmAgentVersion(String vmAgentVersion) {
        this.vmAgentVersion = vmAgentVersion;
        return this;
    }

    /**
     * Get the extensionHandlers value.
     *
     * @return the extensionHandlers value
     */
    public List<VirtualMachineExtensionHandlerInstanceView> extensionHandlers() {
        return this.extensionHandlers;
    }

    /**
     * Set the extensionHandlers value.
     *
     * @param extensionHandlers the extensionHandlers value to set
     * @return the VirtualMachineAgentInstanceView object itself.
     */
    public VirtualMachineAgentInstanceView withExtensionHandlers(List<VirtualMachineExtensionHandlerInstanceView> extensionHandlers) {
        this.extensionHandlers = extensionHandlers;
        return this;
    }

    /**
     * Get the statuses value.
     *
     * @return the statuses value
     */
    public List<InstanceViewStatus> statuses() {
        return this.statuses;
    }

    /**
     * Set the statuses value.
     *
     * @param statuses the statuses value to set
     * @return the VirtualMachineAgentInstanceView object itself.
     */
    public VirtualMachineAgentInstanceView withStatuses(List<InstanceViewStatus> statuses) {
        this.statuses = statuses;
        return this;
    }

}
