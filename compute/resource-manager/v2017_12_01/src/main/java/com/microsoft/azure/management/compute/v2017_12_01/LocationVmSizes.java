/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import rx.Observable;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.VirtualMachineSizesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LocationVmSizes.
 */
public interface LocationVmSizes extends HasInner<VirtualMachineSizesInner> {

    /**
     * Lists all available virtual machine sizes for a subscription in a location.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<LocationVirtualMachineSize> listByLocationAsync(String location);
}
