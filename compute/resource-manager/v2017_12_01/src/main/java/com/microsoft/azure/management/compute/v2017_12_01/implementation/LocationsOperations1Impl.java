/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2017_12_01.LocationsOperations1;
import com.microsoft.azure.management.compute.v2017_12_01.Usages;

class LocationsOperations1Impl extends WrapperImpl<UsagesInner> implements LocationsOperations1 {
    private final ComputeManager manager;

    LocationsOperations1Impl(ComputeManager manager) {
        super(manager.inner().usages());
        this.manager = manager;
    }

    @Override
    public Usages usages() {
        Usages accessor = this.manager().usages();
        return accessor;
    }

    public ComputeManager manager() {
        return this.manager;
    }

}
