/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid.v2018_05_01_preview;

import rx.Observable;
import com.microsoft.azure.management.eventgrid.v2018_05_01_preview.implementation.TopicTypesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing TopicTypeEventTypes.
 */
public interface TopicTypeEventTypes extends HasInner<TopicTypesInner> {

    /**
     * List event types.
     * List event types for a topic type.
     *
     * @param topicTypeName Name of the topic type
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<EventType> listByTopicTypeAsync(String topicTypeName);
}
