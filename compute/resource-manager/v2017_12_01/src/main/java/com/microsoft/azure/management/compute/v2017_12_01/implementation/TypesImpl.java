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
import com.microsoft.azure.management.compute.v2017_12_01.Types;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_12_01.VirtualMachineExtensionImage;
import com.microsoft.azure.management.compute.v2017_12_01.TypeArtifacttypePublisherLocationVersions;

class TypesImpl extends WrapperImpl<VirtualMachineExtensionImagesInner> implements Types {
    private final ComputeManager manager;

    TypesImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineExtensionImages());
        this.manager = manager;
    }

    @Override
    public TypeArtifacttypePublisherLocationVersions versions() {
        TypeArtifacttypePublisherLocationVersions accessor = this.manager().typeArtifacttypePublisherLocationVersions();
        return accessor;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public Observable<VirtualMachineExtensionImage> listTypesAsync(String location, String publisherName) {
        VirtualMachineExtensionImagesInner client = this.inner();
        return client.listTypesAsync(location, publisherName)
        .flatMap(new Func1<List<VirtualMachineExtensionImageInner>, Observable<VirtualMachineExtensionImageInner>>() {
            @Override
            public Observable<VirtualMachineExtensionImageInner> call(List<VirtualMachineExtensionImageInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VirtualMachineExtensionImageInner, VirtualMachineExtensionImage>() {
            @Override
            public VirtualMachineExtensionImage call(VirtualMachineExtensionImageInner inner) {
                return new VirtualMachineExtensionImageImpl(inner, manager());
            }
        });
    }

}
