/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.TopicTypes;
import rx.functions.Func1;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.TopicTypeInfo;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.TopicTypeEventTypes;

class TopicTypesImpl extends WrapperImpl<TopicTypesInner> implements TopicTypes {
    private final EventGridManager manager;

    TopicTypesImpl(EventGridManager manager) {
        super(manager.inner().topicTypes());
        this.manager = manager;
    }

    @Override
    public TopicTypeEventTypes eventTypes() {
        TopicTypeEventTypes accessor = this.manager().topicTypeEventTypes();
        return accessor;
    }

    public EventGridManager manager() {
        return this.manager;
    }

    @Override
    public Observable<TopicTypeInfo> getAsync(String topicTypeName) {
        TopicTypesInner client = this.inner();
        return client.getAsync(topicTypeName)
        .map(new Func1<TopicTypeInfoInner, TopicTypeInfo>() {
            @Override
            public TopicTypeInfo call(TopicTypeInfoInner inner) {
                return new TopicTypeInfoImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<TopicTypeInfo> listAsync() {
        TopicTypesInner client = this.inner();
        return client.listAsync()
        .flatMap(new Func1<List<TopicTypeInfoInner>, Observable<TopicTypeInfoInner>>() {
            @Override
            public Observable<TopicTypeInfoInner> call(List<TopicTypeInfoInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<TopicTypeInfoInner, TopicTypeInfo>() {
            @Override
            public TopicTypeInfo call(TopicTypeInfoInner inner) {
                return new TopicTypeInfoImpl(inner, manager());
            }
        });
    }

}
