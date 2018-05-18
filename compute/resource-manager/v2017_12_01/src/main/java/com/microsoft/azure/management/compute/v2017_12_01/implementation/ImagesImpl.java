/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * def
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.arm.resources.collection.implementation.GroupableResourcesCoreImpl;
import com.microsoft.azure.management.compute.v2017_12_01.Images;
import com.microsoft.azure.management.compute.v2017_12_01.Image;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import com.microsoft.azure.arm.resources.ResourceUtilsCore;
import com.microsoft.azure.arm.utils.RXMapper;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;

class ImagesImpl extends GroupableResourcesCoreImpl<Image, ImageImpl, ImageInner, ImagesInner, ComputeManager>  implements Images {
    protected ImagesImpl(ComputeManager manager) {
        super(manager.inner().images(), manager);
    }

    @Override
    protected Observable<ImageInner> getInnerAsync(String resourceGroupName, String name) {
        ImagesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        ImagesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtilsCore.groupFromResourceId(id);
            final String name = ResourceUtilsCore.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<Image> listByResourceGroup(String resourceGroupName) {
        ImagesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    private Observable<Page<ImageInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        ImagesInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<ImageInner>, Observable<Page<ImageInner>>>() {
            @Override
            public Observable<Page<ImageInner>> call(Page<ImageInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<Image> listByResourceGroupAsync(String resourceGroupName) {
        ImagesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<ImageInner>, Observable<Page<ImageInner>>>() {
            @Override
            public Observable<Page<ImageInner>> call(Page<ImageInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<ImageInner>, Iterable<ImageInner>>() {
            @Override
            public Iterable<ImageInner> call(Page<ImageInner> page) {
                return page.items();
            }
       })
        .map(new Func1<ImageInner, Image>() {
            @Override
            public Image call(ImageInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public PagedList<Image> list() {
        ImagesInner client = this.inner();
        return this.wrapList(client.list());
    }

    private Observable<Page<ImageInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        ImagesInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<ImageInner>, Observable<Page<ImageInner>>>() {
            @Override
            public Observable<Page<ImageInner>> call(Page<ImageInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<Image> listAsync() {
        ImagesInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<ImageInner>, Observable<Page<ImageInner>>>() {
            @Override
            public Observable<Page<ImageInner>> call(Page<ImageInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<ImageInner>, Iterable<ImageInner>>() {
            @Override
            public Iterable<ImageInner> call(Page<ImageInner> page) {
                return page.items();
            }
       })
        .map(new Func1<ImageInner, Image>() {
            @Override
            public Image call(ImageInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public ImageImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ImageImpl wrapModel(ImageInner inner) {
        return  new ImageImpl(inner.name(), inner, manager());
    }

    @Override
    protected ImageImpl wrapModel(String name) {
        return new ImageImpl(name, new ImageInner(), this.manager());
    }

}
