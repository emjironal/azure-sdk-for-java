/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.batchai.v2018_05_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.batchai.v2018_05_01.Clusters;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.batchai.v2018_05_01.RemoteLoginInformation;
import com.microsoft.azure.management.batchai.v2018_05_01.Cluster;

class ClustersImpl extends WrapperImpl<ClustersInner> implements Clusters {
    private final BatchAIManager manager;

    ClustersImpl(BatchAIManager manager) {
        super(manager.inner().clusters());
        this.manager = manager;
    }

    public BatchAIManager manager() {
        return this.manager;
    }

    @Override
    public ClusterImpl define(String name) {
        return wrapModel(name);
    }

    private ClusterImpl wrapModel(ClusterInner inner) {
        return  new ClusterImpl(inner, manager());
    }

    private ClusterImpl wrapModel(String name) {
        return new ClusterImpl(name, this.manager());
    }

    private Observable<Page<RemoteLoginInformationInner>> listRemoteLoginInformationNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        ClustersInner client = this.inner();
        return client.listRemoteLoginInformationNextAsync(nextLink)
        .flatMap(new Func1<Page<RemoteLoginInformationInner>, Observable<Page<RemoteLoginInformationInner>>>() {
            @Override
            public Observable<Page<RemoteLoginInformationInner>> call(Page<RemoteLoginInformationInner> page) {
                return Observable.just(page).concatWith(listRemoteLoginInformationNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<RemoteLoginInformation> listRemoteLoginInformationAsync(final String resourceGroupName, final String workspaceName, final String clusterName) {
        ClustersInner client = this.inner();
        return client.listRemoteLoginInformationAsync(resourceGroupName, workspaceName, clusterName)
        .flatMap(new Func1<Page<RemoteLoginInformationInner>, Observable<Page<RemoteLoginInformationInner>>>() {
            @Override
            public Observable<Page<RemoteLoginInformationInner>> call(Page<RemoteLoginInformationInner> page) {
                return listRemoteLoginInformationNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<RemoteLoginInformationInner>, Iterable<RemoteLoginInformationInner>>() {
            @Override
            public Iterable<RemoteLoginInformationInner> call(Page<RemoteLoginInformationInner> page) {
                return page.items();
            }
       })
        .map(new Func1<RemoteLoginInformationInner, RemoteLoginInformation>() {
            @Override
            public RemoteLoginInformation call(RemoteLoginInformationInner inner) {
                return new RemoteLoginInformationImpl(inner, manager());
            }
       });
    }

    private Observable<Page<ClusterInner>> listNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        ClustersInner client = this.inner();
        return client.listNextAsync(nextLink)
        .flatMap(new Func1<Page<ClusterInner>, Observable<Page<ClusterInner>>>() {
            @Override
            public Observable<Page<ClusterInner>> call(Page<ClusterInner> page) {
                return Observable.just(page).concatWith(listNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<Cluster> listAsync() {
        ClustersInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<ClusterInner>, Observable<Page<ClusterInner>>>() {
            @Override
            public Observable<Page<ClusterInner>> call(Page<ClusterInner> page) {
                return listNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<ClusterInner>, Iterable<ClusterInner>>() {
            @Override
            public Iterable<ClusterInner> call(Page<ClusterInner> page) {
                return page.items();
            }
       })
        .map(new Func1<ClusterInner, Cluster>() {
            @Override
            public Cluster call(ClusterInner inner) {
                return new ClusterImpl(inner, manager());
            }
       });
    }

    private Observable<Page<ClusterInner>> listByResourceGroupNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        ClustersInner client = this.inner();
        return client.listByResourceGroupNextAsync(nextLink)
        .flatMap(new Func1<Page<ClusterInner>, Observable<Page<ClusterInner>>>() {
            @Override
            public Observable<Page<ClusterInner>> call(Page<ClusterInner> page) {
                return Observable.just(page).concatWith(listByResourceGroupNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<Cluster> listByResourceGroupAsync(final String resourceGroupName) {
        ClustersInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<ClusterInner>, Observable<Page<ClusterInner>>>() {
            @Override
            public Observable<Page<ClusterInner>> call(Page<ClusterInner> page) {
                return listByResourceGroupNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<ClusterInner>, Iterable<ClusterInner>>() {
            @Override
            public Iterable<ClusterInner> call(Page<ClusterInner> page) {
                return page.items();
            }
       })
        .map(new Func1<ClusterInner, Cluster>() {
            @Override
            public Cluster call(ClusterInner inner) {
                return new ClusterImpl(inner, manager());
            }
       });
    }

    private Observable<Page<ClusterInner>> listByWorkspaceNextInnerPageAsync(String nextLink) {
        if (nextLink == null) {
            Observable.empty();
        }
        ClustersInner client = this.inner();
        return client.listByWorkspaceNextAsync(nextLink)
        .flatMap(new Func1<Page<ClusterInner>, Observable<Page<ClusterInner>>>() {
            @Override
            public Observable<Page<ClusterInner>> call(Page<ClusterInner> page) {
                return Observable.just(page).concatWith(listByWorkspaceNextInnerPageAsync(page.nextPageLink()));
            }
        });
    }
    @Override
    public Observable<Cluster> listByWorkspaceAsync(final String resourceGroupName, final String workspaceName) {
        ClustersInner client = this.inner();
        return client.listByWorkspaceAsync(resourceGroupName, workspaceName)
        .flatMap(new Func1<Page<ClusterInner>, Observable<Page<ClusterInner>>>() {
            @Override
            public Observable<Page<ClusterInner>> call(Page<ClusterInner> page) {
                return listByWorkspaceNextInnerPageAsync(page.nextPageLink());
            }
        })
        .flatMapIterable(new Func1<Page<ClusterInner>, Iterable<ClusterInner>>() {
            @Override
            public Iterable<ClusterInner> call(Page<ClusterInner> page) {
                return page.items();
            }
       })
        .map(new Func1<ClusterInner, Cluster>() {
            @Override
            public Cluster call(ClusterInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Observable<Cluster> getByWorkspaceAsync(String resourceGroupName, String workspaceName, String clusterName) {
        ClustersInner client = this.inner();
        return client.getAsync(resourceGroupName, workspaceName, clusterName)
        .map(new Func1<ClusterInner, Cluster>() {
            @Override
            public Cluster call(ClusterInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteByWorkspaceAsync(String resourceGroupName, String workspaceName, String clusterName) {
        ClustersInner client = this.inner();
        return client.deleteAsync(resourceGroupName, workspaceName, clusterName).toCompletable();
    }

}
