/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2017_08_31;

import rx.Observable;
import com.microsoft.azure.management.containerservice.v2017_08_31.implementation.ManagedClustersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing UpgradeProfiles.
 */
public interface UpgradeProfiles extends HasInner<ManagedClustersInner> {
    /**
     * Gets upgrade profile for a managed cluster.
     * Gets the details of the upgrade profile for a managed cluster with a specified resource group and name.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagedClusterUpgradeProfile> getUpgradeProfileAsync(String resourceGroupName, String resourceName);

}
