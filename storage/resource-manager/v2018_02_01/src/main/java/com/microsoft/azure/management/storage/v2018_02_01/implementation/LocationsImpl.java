/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.storage.v2018_02_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2018_02_01.Locations;
import com.microsoft.azure.management.storage.v2018_02_01.Usages;

class LocationsImpl extends WrapperImpl<UsagesInner> implements Locations {
    private final StorageManager manager;

    LocationsImpl(StorageManager manager) {
        super(manager.inner().usages());
        this.manager = manager;
    }

    @Override
    public Usages usages() {
        Usages accessor = this.manager().usages();
        return accessor;
    }

    public StorageManager manager() {
        return this.manager;
    }

}
