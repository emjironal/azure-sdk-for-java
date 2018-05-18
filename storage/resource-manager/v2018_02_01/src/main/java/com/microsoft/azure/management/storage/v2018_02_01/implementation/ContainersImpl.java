/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.storage.v2018_02_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.v2018_02_01.Containers;
import rx.Completable;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.management.storage.v2018_02_01.ListContainerItems;
import com.microsoft.azure.management.storage.v2018_02_01.BlobContainer;
import com.microsoft.azure.management.storage.v2018_02_01.LegalHold;
import java.util.List;
import com.microsoft.azure.management.storage.v2018_02_01.ImmutabilityPolicies;

class ContainersImpl extends WrapperImpl<BlobContainersInner> implements Containers {
    private final StorageManager manager;

    ContainersImpl(StorageManager manager) {
        super(manager.inner().blobContainers());
        this.manager = manager;
    }

    @Override
    public ImmutabilityPolicies immutabilityPolicies() {
        ImmutabilityPolicies accessor = this.manager().immutabilityPolicies();
        return accessor;
    }

    public StorageManager manager() {
        return this.manager;
    }

    @Override
    public BlobContainerImpl define(String name) {
        return new BlobContainerImpl(name, this.manager());
    }

    private BlobContainerImpl wrapModel(BlobContainerInner inner) {
        return  new BlobContainerImpl(inner, manager());
    }

    @Override
    public Observable<ListContainerItems> listAsync(String resourceGroupName, String accountName) {
        BlobContainersInner client = this.inner();
        return client.listAsync(resourceGroupName, accountName)
        .map(new Func1<ListContainerItemsInner, ListContainerItems>() {
            @Override
            public ListContainerItems call(ListContainerItemsInner inner) {
                return new ListContainerItemsImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<BlobContainer> getAsync(String resourceGroupName, String accountName, String containerName) {
        BlobContainersInner client = this.inner();
        return client.getAsync(resourceGroupName, accountName, containerName)
        .map(new Func1<BlobContainerInner, BlobContainer>() {
            @Override
            public BlobContainer call(BlobContainerInner inner) {
                return new BlobContainerImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String accountName, String containerName) {
        BlobContainersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, accountName, containerName).toCompletable();
    }

    @Override
    public Observable<LegalHold> setLegalHoldAsync(String resourceGroupName, String accountName, String containerName, List<String> tags) {
        BlobContainersInner client = this.inner();
        return client.setLegalHoldAsync(resourceGroupName, accountName, containerName, tags)
        .map(new Func1<LegalHoldInner, LegalHold>() {
            @Override
            public LegalHold call(LegalHoldInner inner) {
                return new LegalHoldImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<LegalHold> clearLegalHoldAsync(String resourceGroupName, String accountName, String containerName, List<String> tags) {
        BlobContainersInner client = this.inner();
        return client.clearLegalHoldAsync(resourceGroupName, accountName, containerName, tags)
        .map(new Func1<LegalHoldInner, LegalHold>() {
            @Override
            public LegalHold call(LegalHoldInner inner) {
                return new LegalHoldImpl(inner, manager());
            }
        });
    }

}
