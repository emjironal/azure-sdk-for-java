/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_03_30;

import rx.Observable;
import com.microsoft.azure.management.compute.v2017_03_30.implementation.VirtualMachineImagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing LocationSkus.
 */
public interface LocationSkus extends HasInner<VirtualMachineImagesInner> {

    /**
     * @return Entry point to manage Skus Version.
     */
    OfferArtifacttypePublisherLocationVersions versions();

    /**
     * Gets a list of virtual machine image SKUs for the specified location, publisher, and offer.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineImageResource> listByOfferAsync(String location, String publisherName, String offer);
}
