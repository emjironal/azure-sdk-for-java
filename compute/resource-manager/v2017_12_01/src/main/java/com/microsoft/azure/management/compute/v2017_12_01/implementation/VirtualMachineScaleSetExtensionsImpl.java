/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineScaleSetExtensions;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineScaleSetExtension;

class VirtualMachineScaleSetExtensionsImpl extends WrapperImpl<VirtualMachineScaleSetExtensionsInner> implements VirtualMachineScaleSetExtensions {
    private final ComputeManager manager;

    VirtualMachineScaleSetExtensionsImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineScaleSetExtensions());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public VirtualMachineScaleSetExtensionImpl define(String name) {
        return new VirtualMachineScaleSetExtensionImpl(name, this.manager());
    }

    private VirtualMachineScaleSetExtensionImpl wrapModel(VirtualMachineScaleSetExtensionInner inner) {
        return  new VirtualMachineScaleSetExtensionImpl(inner, manager());
    }

    private Observable<Page<VirtualMachineScaleSetExtensionInner>> listByVirtualMachineScaleSetNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        VirtualMachineScaleSetExtensionsInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<VirtualMachineScaleSetExtensionInner>, Observable<Page<VirtualMachineScaleSetExtensionInner>>>() {
            @Override
            public Observable<Page<VirtualMachineScaleSetExtensionInner>> call(Page<VirtualMachineScaleSetExtensionInner> page) {
                return Observable.just(page).concatWith(listByVirtualMachineScaleSetNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<VirtualMachineScaleSetExtension> listByVirtualMachineScaleSetAsync(final String resourceGroupName, final String vmScaleSetName) {
        VirtualMachineScaleSetExtensionsInner client = this.inner();
        return client.listAsync(resourceGroupName, vmScaleSetName)
        .flatMap(new Func1<Page<VirtualMachineScaleSetExtensionInner>, Observable<Page<VirtualMachineScaleSetExtensionInner>>>() {
            @Override
            public Observable<Page<VirtualMachineScaleSetExtensionInner>> call(Page<VirtualMachineScaleSetExtensionInner> page) {
                return listByVirtualMachineScaleSetNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<VirtualMachineScaleSetExtensionInner>, Iterable<VirtualMachineScaleSetExtensionInner>>() {
            @Override
            public Iterable<VirtualMachineScaleSetExtensionInner> call(Page<VirtualMachineScaleSetExtensionInner> page) {
                return page.items();
            }
       })
        .map(new Func1<VirtualMachineScaleSetExtensionInner, VirtualMachineScaleSetExtension>() {
            @Override
            public VirtualMachineScaleSetExtension call(VirtualMachineScaleSetExtensionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<VirtualMachineScaleSetExtension> getByVirtualMachineScaleSetAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        VirtualMachineScaleSetExtensionsInner client = this.inner();
        return client.getAsync(resourceGroupName, vmScaleSetName, vmssExtensionName)
        .map(new Func1<VirtualMachineScaleSetExtensionInner, VirtualMachineScaleSetExtension>() {
            @Override
            public VirtualMachineScaleSetExtension call(VirtualMachineScaleSetExtensionInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteByVirtualMachineScaleSetAsync(String resourceGroupName, String vmScaleSetName, String vmssExtensionName) {
        VirtualMachineScaleSetExtensionsInner client = this.inner();
        return client.deleteAsync(resourceGroupName, vmScaleSetName, vmssExtensionName).toCompletable();
    }

}
