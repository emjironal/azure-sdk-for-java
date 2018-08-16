/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.servicefabric;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the health state chunk of a stateful service replica or a
 * stateless service instance.
 * The replica health state contains the replica ID and its aggregated health
 * state.
 */
public class ReplicaHealthStateChunk extends EntityHealthStateChunk {
    /**
     * Id of a stateful service replica or a stateless service instance. This
     * ID is used in the queries that apply to both stateful and stateless
     * services. It is used by Service Fabric to uniquely identify a replica of
     * a partition of a stateful service or an instance of a stateless service
     * partition. It is unique within a partition and does not change for the
     * lifetime of the replica or the instance. If a stateful replica gets
     * dropped and another replica gets created on the same node for the same
     * partition, it will get a different value for the ID. If a stateless
     * instance is failed over on the same or different node it will get a
     * different value for the ID.
     */
    @JsonProperty(value = "ReplicaOrInstanceId")
    private String replicaOrInstanceId;

    /**
     * Get id of a stateful service replica or a stateless service instance. This ID is used in the queries that apply to both stateful and stateless services. It is used by Service Fabric to uniquely identify a replica of a partition of a stateful service or an instance of a stateless service partition. It is unique within a partition and does not change for the lifetime of the replica or the instance. If a stateful replica gets dropped and another replica gets created on the same node for the same partition, it will get a different value for the ID. If a stateless instance is failed over on the same or different node it will get a different value for the ID.
     *
     * @return the replicaOrInstanceId value
     */
    public String replicaOrInstanceId() {
        return this.replicaOrInstanceId;
    }

    /**
     * Set id of a stateful service replica or a stateless service instance. This ID is used in the queries that apply to both stateful and stateless services. It is used by Service Fabric to uniquely identify a replica of a partition of a stateful service or an instance of a stateless service partition. It is unique within a partition and does not change for the lifetime of the replica or the instance. If a stateful replica gets dropped and another replica gets created on the same node for the same partition, it will get a different value for the ID. If a stateless instance is failed over on the same or different node it will get a different value for the ID.
     *
     * @param replicaOrInstanceId the replicaOrInstanceId value to set
     * @return the ReplicaHealthStateChunk object itself.
     */
    public ReplicaHealthStateChunk withReplicaOrInstanceId(String replicaOrInstanceId) {
        this.replicaOrInstanceId = replicaOrInstanceId;
        return this;
    }

}