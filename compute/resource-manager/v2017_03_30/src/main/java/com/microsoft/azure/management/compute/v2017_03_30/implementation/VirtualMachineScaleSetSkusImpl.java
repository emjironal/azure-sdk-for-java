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
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineScaleSetSkus;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineScaleSetSku;

class VirtualMachineScaleSetSkusImpl extends WrapperImpl<VirtualMachineScaleSetsInner> implements VirtualMachineScaleSetSkus {
    private final ComputeManager manager;

    VirtualMachineScaleSetSkusImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineScaleSets());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    private VirtualMachineScaleSetSkuImpl wrapModel(VirtualMachineScaleSetSkuInner inner) {
        return  new VirtualMachineScaleSetSkuImpl(inner, manager());
    }

    private Observable<Page<VirtualMachineScaleSetSkuInner>> listByVirtualMachineScaleSetNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        VirtualMachineScaleSetsInner client = this.inner();
        return client.listSkusNextAsync(nextLink)
        .flatMap(new Func1<Page<VirtualMachineScaleSetSkuInner>, Observable<Page<VirtualMachineScaleSetSkuInner>>>() {
            @Override
            public Observable<Page<VirtualMachineScaleSetSkuInner>> call(Page<VirtualMachineScaleSetSkuInner> page) {
                return Observable.just(page).concatWith(listByVirtualMachineScaleSetNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<VirtualMachineScaleSetSku> listByVirtualMachineScaleSetAsync(final String resourceGroupName, final String vmScaleSetName) {
        VirtualMachineScaleSetsInner client = this.inner();
        return client.listSkusAsync(resourceGroupName, vmScaleSetName)
        .flatMap(new Func1<Page<VirtualMachineScaleSetSkuInner>, Observable<Page<VirtualMachineScaleSetSkuInner>>>() {
            @Override
            public Observable<Page<VirtualMachineScaleSetSkuInner>> call(Page<VirtualMachineScaleSetSkuInner> page) {
                return listByVirtualMachineScaleSetNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<VirtualMachineScaleSetSkuInner>, Iterable<VirtualMachineScaleSetSkuInner>>() {
            @Override
            public Iterable<VirtualMachineScaleSetSkuInner> call(Page<VirtualMachineScaleSetSkuInner> page) {
                return page.items();
            }
       })
        .map(new Func1<VirtualMachineScaleSetSkuInner, VirtualMachineScaleSetSku>() {
            @Override
            public VirtualMachineScaleSetSku call(VirtualMachineScaleSetSkuInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
