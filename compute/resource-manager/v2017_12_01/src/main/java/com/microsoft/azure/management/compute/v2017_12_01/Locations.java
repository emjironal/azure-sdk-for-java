/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import com.microsoft.azure.management.compute.v2017_12_01.implementation.VirtualMachineExtensionImagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Locations.
 */
public interface Locations extends HasInner<VirtualMachineExtensionImagesInner> {

    /**
     * @return Entry point to manage Location Publisher.
     */
    LocationPublishers publishers();
}
