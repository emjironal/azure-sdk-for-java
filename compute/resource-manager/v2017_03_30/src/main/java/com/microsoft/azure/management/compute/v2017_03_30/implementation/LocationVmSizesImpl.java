/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2017_03_30.LocationVmSizes;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_03_30.LocationVirtualMachineSize;

class LocationVmSizesImpl extends WrapperImpl<VirtualMachineSizesInner> implements LocationVmSizes {
    private final ComputeManager manager;

    LocationVmSizesImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineSizes());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    private LocationVirtualMachineSizeImpl wrapModel(VirtualMachineSizeInner inner) {
        return  new LocationVirtualMachineSizeImpl(inner, manager());
    }

    @Override
    public Observable<LocationVirtualMachineSize> listByLocationAsync(String location) {
        VirtualMachineSizesInner client = this.inner();
        return client.listAsync(location)
        .flatMap(new Func1<List<VirtualMachineSizeInner>, Observable<VirtualMachineSizeInner>>() {
            @Override
            public Observable<VirtualMachineSizeInner> call(List<VirtualMachineSizeInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VirtualMachineSizeInner, LocationVirtualMachineSize>() {
            @Override
            public LocationVirtualMachineSize call(VirtualMachineSizeInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
