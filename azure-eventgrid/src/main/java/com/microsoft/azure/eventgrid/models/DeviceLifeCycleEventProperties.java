/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.eventgrid.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Schema of the Data property of an EventGridEvent for a device life cycle
 * event (DeviceCreated, DeviceDeleted).
 */
public class DeviceLifeCycleEventProperties {
    /**
     * The unique identifier of the device. This case-sensitive string can be
     * up to 128 characters long, and supports ASCII 7-bit alphanumeric
     * characters plus the following special characters: - : . + % _ # * ? ! (
     * ) , = @ ; $ '.
     */
    @JsonProperty(value = "deviceId")
    private String deviceId;

    /**
     * Name of the IoT Hub where the device was created or deleted.
     */
    @JsonProperty(value = "hubName")
    private String hubName;

    /**
     * The event type specified for this operation by the IoT Hub.
     */
    @JsonProperty(value = "opType")
    private String opType;

    /**
     * The ISO8601 timestamp of the operation.
     */
    @JsonProperty(value = "operationTimestamp")
    private String operationTimestamp;

    /**
     * Information about the device twin, which is the cloud represenation of
     * application device metadata.
     */
    @JsonProperty(value = "twin")
    private DeviceTwinInfo twin;

    /**
     * Get the deviceId value.
     *
     * @return the deviceId value
     */
    public String deviceId() {
        return this.deviceId;
    }

    /**
     * Set the deviceId value.
     *
     * @param deviceId the deviceId value to set
     * @return the DeviceLifeCycleEventProperties object itself.
     */
    public DeviceLifeCycleEventProperties withDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    /**
     * Get the hubName value.
     *
     * @return the hubName value
     */
    public String hubName() {
        return this.hubName;
    }

    /**
     * Set the hubName value.
     *
     * @param hubName the hubName value to set
     * @return the DeviceLifeCycleEventProperties object itself.
     */
    public DeviceLifeCycleEventProperties withHubName(String hubName) {
        this.hubName = hubName;
        return this;
    }

    /**
     * Get the opType value.
     *
     * @return the opType value
     */
    public String opType() {
        return this.opType;
    }

    /**
     * Set the opType value.
     *
     * @param opType the opType value to set
     * @return the DeviceLifeCycleEventProperties object itself.
     */
    public DeviceLifeCycleEventProperties withOpType(String opType) {
        this.opType = opType;
        return this;
    }

    /**
     * Get the operationTimestamp value.
     *
     * @return the operationTimestamp value
     */
    public String operationTimestamp() {
        return this.operationTimestamp;
    }

    /**
     * Set the operationTimestamp value.
     *
     * @param operationTimestamp the operationTimestamp value to set
     * @return the DeviceLifeCycleEventProperties object itself.
     */
    public DeviceLifeCycleEventProperties withOperationTimestamp(String operationTimestamp) {
        this.operationTimestamp = operationTimestamp;
        return this;
    }

    /**
     * Get the twin value.
     *
     * @return the twin value
     */
    public DeviceTwinInfo twin() {
        return this.twin;
    }

    /**
     * Set the twin value.
     *
     * @param twin the twin value to set
     * @return the DeviceLifeCycleEventProperties object itself.
     */
    public DeviceLifeCycleEventProperties withTwin(DeviceTwinInfo twin) {
        this.twin = twin;
        return this;
    }

}