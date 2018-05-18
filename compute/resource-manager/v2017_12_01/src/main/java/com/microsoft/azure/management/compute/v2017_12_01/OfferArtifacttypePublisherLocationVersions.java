/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import rx.Observable;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.VirtualMachineImagesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing OfferArtifacttypePublisherLocationVersions.
 */
public interface OfferArtifacttypePublisherLocationVersions extends HasInner<VirtualMachineImagesInner> {

    /**
     * Gets a list of all virtual machine image versions for the specified location, publisher, offer, and SKU.
     *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineImage> listBySkusAsync(String location, String publisherName, String offer, String skus);

    /**
     * Gets a virtual machine image.
    *
     * @param location The name of a supported Azure region.
     * @param publisherName A valid image publisher.
     * @param offer A valid image publisher offer.
     * @param skus A valid image SKU.
     * @param version A valid image SKU version.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineImage> getBySkusAsync(String location, String publisherName, String offer, String skus, String version);
}
