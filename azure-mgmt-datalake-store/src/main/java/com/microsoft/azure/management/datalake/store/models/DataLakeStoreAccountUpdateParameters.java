/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalake.store.models;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * Data Lake Store account information to update.
 */
@JsonFlatten
public class DataLakeStoreAccountUpdateParameters {
    /**
     * Resource tags.
     */
    private Map<String, String> tags;

    /**
     * The current state of the IP address firewall for this Data Lake store
     * account. Disabling the firewall does not remove existing rules, they
     * will just be ignored until the firewall is re-enabled. Possible values
     * include: 'Enabled', 'Disabled'.
     */
    @JsonProperty(value = "properties.firewallState")
    private FirewallState firewallState;

    /**
     * The current state of the trusted identity provider feature for this
     * Data Lake store account. Disabling trusted identity provider
     * functionality does not remove the providers, they will just be ignored
     * until this feature is re-enabled. Possible values include: 'Enabled',
     * 'Disabled'.
     */
    @JsonProperty(value = "properties.trustedIdProviderState")
    private TrustedIdProviderState trustedIdProviderState;

    /**
     * the default owner group for all new folders and files created in the
     * Data Lake Store account.
     */
    @JsonProperty(value = "properties.defaultGroup")
    private String defaultGroup;

    /**
     * Get the tags value.
     *
     * @return the tags value
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags value.
     *
     * @param tags the tags value to set
     * @return the DataLakeStoreAccountUpdateParameters object itself.
     */
    public DataLakeStoreAccountUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the firewallState value.
     *
     * @return the firewallState value
     */
    public FirewallState firewallState() {
        return this.firewallState;
    }

    /**
     * Set the firewallState value.
     *
     * @param firewallState the firewallState value to set
     * @return the DataLakeStoreAccountUpdateParameters object itself.
     */
    public DataLakeStoreAccountUpdateParameters withFirewallState(FirewallState firewallState) {
        this.firewallState = firewallState;
        return this;
    }

    /**
     * Get the trustedIdProviderState value.
     *
     * @return the trustedIdProviderState value
     */
    public TrustedIdProviderState trustedIdProviderState() {
        return this.trustedIdProviderState;
    }

    /**
     * Set the trustedIdProviderState value.
     *
     * @param trustedIdProviderState the trustedIdProviderState value to set
     * @return the DataLakeStoreAccountUpdateParameters object itself.
     */
    public DataLakeStoreAccountUpdateParameters withTrustedIdProviderState(TrustedIdProviderState trustedIdProviderState) {
        this.trustedIdProviderState = trustedIdProviderState;
        return this;
    }

    /**
     * Get the defaultGroup value.
     *
     * @return the defaultGroup value
     */
    public String defaultGroup() {
        return this.defaultGroup;
    }

    /**
     * Set the defaultGroup value.
     *
     * @param defaultGroup the defaultGroup value to set
     * @return the DataLakeStoreAccountUpdateParameters object itself.
     */
    public DataLakeStoreAccountUpdateParameters withDefaultGroup(String defaultGroup) {
        this.defaultGroup = defaultGroup;
        return this;
    }

}