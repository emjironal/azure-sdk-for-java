/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.redis.v2017_10_01.implementation;

import com.microsoft.azure.management.redis.v2017_10_01.NotificationListResponse;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.redis.v2017_10_01.UpgradeNotification;

class NotificationListResponseImpl extends WrapperImpl<NotificationListResponseInner> implements NotificationListResponse {
    private final RedisManager manager;
    NotificationListResponseImpl(NotificationListResponseInner inner, RedisManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public RedisManager manager() {
        return this.manager;
    }

    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<UpgradeNotification> value() {
        return this.inner().value();
    }

}
