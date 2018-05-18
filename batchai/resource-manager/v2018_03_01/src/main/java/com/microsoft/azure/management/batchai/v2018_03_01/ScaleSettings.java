/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.batchai.v2018_03_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * At least one of manual or autoScale settings must be specified. Only one of
 * manual or autoScale settings can be specified. If autoScale settings are
 * specified, the system automatically scales the cluster up and down (within
 * the supplied limits) based on the pending jobs on the cluster.
 */
public class ScaleSettings {
    /**
     * The scale for the cluster by manual settings.
     */
    @JsonProperty(value = "manual")
    private ManualScaleSettings manual;

    /**
     * The scale for the cluster by autoscale settings.
     */
    @JsonProperty(value = "autoScale")
    private AutoScaleSettings autoScale;

    /**
     * Get the manual value.
     *
     * @return the manual value
     */
    public ManualScaleSettings manual() {
        return this.manual;
    }

    /**
     * Set the manual value.
     *
     * @param manual the manual value to set
     * @return the ScaleSettings object itself.
     */
    public ScaleSettings withManual(ManualScaleSettings manual) {
        this.manual = manual;
        return this;
    }

    /**
     * Get the autoScale value.
     *
     * @return the autoScale value
     */
    public AutoScaleSettings autoScale() {
        return this.autoScale;
    }

    /**
     * Set the autoScale value.
     *
     * @param autoScale the autoScale value to set
     * @return the ScaleSettings object itself.
     */
    public ScaleSettings withAutoScale(AutoScaleSettings autoScale) {
        this.autoScale = autoScale;
        return this;
    }

}
