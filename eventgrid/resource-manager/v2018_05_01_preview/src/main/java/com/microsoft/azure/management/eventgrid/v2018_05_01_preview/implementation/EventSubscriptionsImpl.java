/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * jkl
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.EventSubscriptions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.Page;
import rx.Completable;
import java.util.List;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.EventSubscription;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.EventSubscriptionFullUrl;
import com.microsoft.azure.arm.utils.PagedListConverter;

class EventSubscriptionsImpl extends WrapperImpl<EventSubscriptionsInner> implements EventSubscriptions {
    private PagedListConverter<EventSubscriptionInner, EventSubscription> converter;
    private final EventGridManager manager;

    EventSubscriptionsImpl(EventGridManager manager) {
        super(manager.inner().eventSubscriptions());
        this.manager = manager;
        this.converter = new PagedListConverter<EventSubscriptionInner, EventSubscription>() {
            @Override
            public Observable<EventSubscription> typeConvertAsync(EventSubscriptionInner inner) {
                return Observable.just((EventSubscription) wrapModel(inner));
            }
        };
    }

    public EventGridManager manager() {
        return this.manager;
    }

    @Override
    public EventSubscriptionImpl define(String name) {
        return wrapModel(name);
    }

    private EventSubscriptionImpl wrapModel(EventSubscriptionInner inner) {
        return  new EventSubscriptionImpl(inner, manager());
    }

    private EventSubscriptionImpl wrapModel(String name) {
        return new EventSubscriptionImpl(name, this.manager());
    }

    @Override
    public Observable<EventSubscription> getAsync(String scope, String eventSubscriptionName) {
        EventSubscriptionsInner client = this.inner();
        return client.getAsync(scope, eventSubscriptionName)
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Completable deleteAsync(String scope, String eventSubscriptionName) {
        EventSubscriptionsInner client = this.inner();
        return client.deleteAsync(scope, eventSubscriptionName).toCompletable();
    }

    @Override
    public Observable<EventSubscriptionFullUrl> getFullUrlAsync(String scope, String eventSubscriptionName) {
        EventSubscriptionsInner client = this.inner();
        return client.getFullUrlAsync(scope, eventSubscriptionName)
        .map(new Func1<EventSubscriptionFullUrlInner, EventSubscriptionFullUrl>() {
            @Override
            public EventSubscriptionFullUrl call(EventSubscriptionFullUrlInner inner) {
                return new EventSubscriptionFullUrlImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listGlobalBySubscriptionForTopicTypeAsync(String topicTypeName) {
        EventSubscriptionsInner client = this.inner();
        return client.listGlobalBySubscriptionForTopicTypeAsync(topicTypeName)
        .flatMap(new Func1<List<EventSubscriptionInner>, Observable<EventSubscriptionInner>>() {
            @Override
            public Observable<EventSubscriptionInner> call(List<EventSubscriptionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listGlobalByResourceGroupForTopicTypeAsync(String resourceGroupName, String topicTypeName) {
        EventSubscriptionsInner client = this.inner();
        return client.listGlobalByResourceGroupForTopicTypeAsync(resourceGroupName, topicTypeName)
        .flatMap(new Func1<List<EventSubscriptionInner>, Observable<EventSubscriptionInner>>() {
            @Override
            public Observable<EventSubscriptionInner> call(List<EventSubscriptionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listRegionalBySubscriptionAsync(String location) {
        EventSubscriptionsInner client = this.inner();
        return client.listRegionalBySubscriptionAsync(location)
        .flatMap(new Func1<List<EventSubscriptionInner>, Observable<EventSubscriptionInner>>() {
            @Override
            public Observable<EventSubscriptionInner> call(List<EventSubscriptionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listRegionalByResourceGroupAsync(String resourceGroupName, String location) {
        EventSubscriptionsInner client = this.inner();
        return client.listRegionalByResourceGroupAsync(resourceGroupName, location)
        .flatMap(new Func1<List<EventSubscriptionInner>, Observable<EventSubscriptionInner>>() {
            @Override
            public Observable<EventSubscriptionInner> call(List<EventSubscriptionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listRegionalBySubscriptionForTopicTypeAsync(String location, String topicTypeName) {
        EventSubscriptionsInner client = this.inner();
        return client.listRegionalBySubscriptionForTopicTypeAsync(location, topicTypeName)
        .flatMap(new Func1<List<EventSubscriptionInner>, Observable<EventSubscriptionInner>>() {
            @Override
            public Observable<EventSubscriptionInner> call(List<EventSubscriptionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listRegionalByResourceGroupForTopicTypeAsync(String resourceGroupName, String location, String topicTypeName) {
        EventSubscriptionsInner client = this.inner();
        return client.listRegionalByResourceGroupForTopicTypeAsync(resourceGroupName, location, topicTypeName)
        .flatMap(new Func1<List<EventSubscriptionInner>, Observable<EventSubscriptionInner>>() {
            @Override
            public Observable<EventSubscriptionInner> call(List<EventSubscriptionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<EventSubscription> listByResourceAsync(String resourceGroupName, String providerNamespace, String resourceTypeName, String resourceName) {
        EventSubscriptionsInner client = this.inner();
        return client.listByResourceAsync(resourceGroupName, providerNamespace, resourceTypeName, resourceName)
        .flatMap(new Func1<List<EventSubscriptionInner>, Observable<EventSubscriptionInner>>() {
            @Override
            public Observable<EventSubscriptionInner> call(List<EventSubscriptionInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return new EventSubscriptionImpl(inner, manager());
            }
        });
    }

    @Override
    public PagedList<EventSubscription> list() {
        EventSubscriptionsInner client = this.inner();
        return converter.convert(client.list());
    }

    @Override
    public Observable<EventSubscription> listAsync() {
        EventSubscriptionsInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<Page<EventSubscriptionInner>, Observable<EventSubscriptionInner>>() {
            @Override
            public Observable<EventSubscriptionInner> call(Page<EventSubscriptionInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<EventSubscription> listByResourceGroup(String resourceGroupName) {
        EventSubscriptionsInner client = this.inner();
        return converter.convert(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<EventSubscription> listByResourceGroupAsync(String resourceGroupName) {
        EventSubscriptionsInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMap(new Func1<Page<EventSubscriptionInner>, Observable<EventSubscriptionInner>>() {
            @Override
            public Observable<EventSubscriptionInner> call(Page<EventSubscriptionInner> innerPage) {
                return Observable.from(innerPage.items());
            }
        })
        .map(new Func1<EventSubscriptionInner, EventSubscription>() {
            @Override
            public EventSubscription call(EventSubscriptionInner inner) {
                return wrapModel(inner);
            }
        });
    }

    protected Observable<EventSubscriptionInner> getInnerAsync(String resourceGroupName, String name) {
        EventSubscriptionsInner client = this.inner();
        return null; // NOP Retrive by RG not supported
    }

}
